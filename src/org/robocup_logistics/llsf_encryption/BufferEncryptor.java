package org.robocup_logistics.llsf_encryption;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * The BufferEncryptor is responsible for encrypting messages. At the moment
 * it is only capable of handling encryption with AES 128 CBC.
 */
public class BufferEncryptor {
	
	private int cipher;
	
	private final static String ALGORITHM = "AES/CBC/PKCS5Padding";
	
	private static int KEY_SIZE_BITS = 128;
	private static int IV_SIZE_BYTES;
	
	private byte[][] keyAndIV;
	
	private SecretKeySpec keySpec;
	private IvParameterSpec ivSpec;
	
	/**
	 * Instantiates a new BufferEncryptor with a cipher and the encryption key. The cipher must be
	 * one of the values defined in the refbox integration manual in section 2.2.1.
	 * 
	 * @param cipher The cipher as defined in the refbox integration manual in section 2.2.1
	 * @param key The encryption key as String
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 */
	public BufferEncryptor(int cipher, String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException {
		
		this.cipher = cipher;
		
		byte[] keyBytes = key.getBytes("UTF-8");
		
		Cipher c = Cipher.getInstance(ALGORITHM);
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		
		keyAndIV = KeyConverter.EVP_BytesToKey(KEY_SIZE_BITS / Byte.SIZE, c.getBlockSize(), sha, null, keyBytes, 8);
        keySpec = new SecretKeySpec(keyAndIV[0], "AES");
        ivSpec = new IvParameterSpec(keyAndIV[1]);
        
        IV_SIZE_BYTES = keyAndIV[1].length;
        
	}
	
	/**
	 * Encrypts the given message. This method is called by the {@link ProtobufMessage}.
	 * 
	 * @param toEncrypt Message to encrypt as ByteBuffer
	 * @return Encrypted data as byte array
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public byte[] encrypt(ByteBuffer toEncrypt) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
		byte[] encryptedData = cipher.doFinal(toEncrypt.array());
		
		return encryptedData;
	}
	
	/**
	 * Creates initialization vector for the next message.
	 */
	public void createNextIV() {
		new Random().nextBytes(keyAndIV[1]);
		ivSpec = new IvParameterSpec(keyAndIV[1]);
	}
	
	public int getIvSize() {
		return IV_SIZE_BYTES;
	}
	
	public byte[] getIv() {
		return keyAndIV[1];
	}
	
	public int getCipher() {
		return cipher;
	}
	
}
