package org.robocup_logistics.llsf_encryption;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * The BufferDecryptor is responsible for decrypting incoming messages. At the moment
 * it is only capable of handling decryption with AES 128 CBC.
 */
public class BufferDecryptor {
	
	private final static String ALGORITHM = "AES/CBC/PKCS5Padding";
	private final static int KEY_SIZE_BITS = 128;
	
	private byte[][] keyAndIV;
	private SecretKeySpec keySpec;
	
	/**
	 * Instantiates a new BufferDecryptor with a cipher and the encryption key. The cipher must be
	 * one of the values defined in the refbox integration manual in section 2.2.1.
	 * 
	 * @param cipher The cipher as defined in the refbox integration manual in section 2.2.1
	 * @param key The encryption key as String
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 */
	public BufferDecryptor(int cipher, String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException {

		byte[] keyBytes = key.getBytes("UTF-8");
		
		Cipher c = Cipher.getInstance(ALGORITHM);
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		
		keyAndIV = KeyConverter.EVP_BytesToKey(KEY_SIZE_BITS / Byte.SIZE, c.getBlockSize(), sha, null, keyBytes, 8);
        keySpec = new SecretKeySpec(keyAndIV[0], "AES");
		
	}
	
	/**
	 * Decrypts an incoming message. This method is called by the {@link ProtobufBroadcastPeer}.
	 * 
	 * @param toDecrypt Encrypted data as byte array
	 * @param iv Initialization vector from the incoming message
	 * @return Decrypted data as byte array
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public byte[] decrypt(byte[] toDecrypt, byte[] iv) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv));
		byte[] decryptedData = cipher.doFinal(toDecrypt);
		
		return decryptedData;
	}
	
}
