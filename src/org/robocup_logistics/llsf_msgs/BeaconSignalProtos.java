// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BeaconSignal.proto

package org.robocup_logistics.llsf_msgs;

public final class BeaconSignalProtos {
  private BeaconSignalProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BeaconSignalOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .llsf_msgs.Time time = 1;
    boolean hasTime();
    org.robocup_logistics.llsf_msgs.TimeProtos.Time getTime();
    org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder();
    
    // required uint64 seq = 2;
    boolean hasSeq();
    long getSeq();
    
    // required string team_name = 4;
    boolean hasTeamName();
    String getTeamName();
    
    // required string peer_name = 5;
    boolean hasPeerName();
    String getPeerName();
    
    // optional .llsf_msgs.Pose2D pose = 7;
    boolean hasPose();
    org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D getPose();
    org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder getPoseOrBuilder();
  }
  public static final class BeaconSignal extends
      com.google.protobuf.GeneratedMessage
      implements BeaconSignalOrBuilder {
    // Use BeaconSignal.newBuilder() to construct.
    private BeaconSignal(Builder builder) {
      super(builder);
    }
    private BeaconSignal(boolean noInit) {}
    
    private static final BeaconSignal defaultInstance;
    public static BeaconSignal getDefaultInstance() {
      return defaultInstance;
    }
    
    public BeaconSignal getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.internal_static_llsf_msgs_BeaconSignal_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.internal_static_llsf_msgs_BeaconSignal_fieldAccessorTable;
    }
    
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      COMP_ID(0, 2000),
      MSG_TYPE(1, 1),
      ;
      
      public static final int COMP_ID_VALUE = 2000;
      public static final int MSG_TYPE_VALUE = 1;
      
      
      public final int getNumber() { return value; }
      
      public static CompType valueOf(int value) {
        switch (value) {
          case 2000: return COMP_ID;
          case 1: return MSG_TYPE;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompType>() {
              public CompType findValueByNumber(int number) {
                return CompType.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final CompType[] VALUES = {
        COMP_ID, MSG_TYPE, 
      };
      
      public static CompType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private CompType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:llsf_msgs.BeaconSignal.CompType)
    }
    
    private int bitField0_;
    // required .llsf_msgs.Time time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private org.robocup_logistics.llsf_msgs.TimeProtos.Time time_;
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public org.robocup_logistics.llsf_msgs.TimeProtos.Time getTime() {
      return time_;
    }
    public org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }
    
    // required uint64 seq = 2;
    public static final int SEQ_FIELD_NUMBER = 2;
    private long seq_;
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getSeq() {
      return seq_;
    }
    
    // required string team_name = 4;
    public static final int TEAM_NAME_FIELD_NUMBER = 4;
    private java.lang.Object teamName_;
    public boolean hasTeamName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          teamName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string peer_name = 5;
    public static final int PEER_NAME_FIELD_NUMBER = 5;
    private java.lang.Object peerName_;
    public boolean hasPeerName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getPeerName() {
      java.lang.Object ref = peerName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          peerName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPeerNameBytes() {
      java.lang.Object ref = peerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        peerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .llsf_msgs.Pose2D pose = 7;
    public static final int POSE_FIELD_NUMBER = 7;
    private org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D pose_;
    public boolean hasPose() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D getPose() {
      return pose_;
    }
    public org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder getPoseOrBuilder() {
      return pose_;
    }
    
    private void initFields() {
      time_ = org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance();
      seq_ = 0L;
      teamName_ = "";
      peerName_ = "";
      pose_ = org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTeamName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasPose()) {
        if (!getPose().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, seq_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(5, getPeerNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(7, pose_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, seq_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getPeerNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, pose_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignalOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.internal_static_llsf_msgs_BeaconSignal_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.internal_static_llsf_msgs_BeaconSignal_fieldAccessorTable;
      }
      
      // Construct using org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTimeFieldBuilder();
          getPoseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        seq_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        teamName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        peerName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        if (poseBuilder_ == null) {
          pose_ = org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.getDefaultInstance();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDescriptor();
      }
      
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance();
      }
      
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal build() {
        org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal buildPartial() {
        org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal result = new org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seq_ = seq_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.teamName_ = teamName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.peerName_ = peerName_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (poseBuilder_ == null) {
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal other) {
        if (other == org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasSeq()) {
          setSeq(other.getSeq());
        }
        if (other.hasTeamName()) {
          setTeamName(other.getTeamName());
        }
        if (other.hasPeerName()) {
          setPeerName(other.getPeerName());
        }
        if (other.hasPose()) {
          mergePose(other.getPose());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasSeq()) {
          
          return false;
        }
        if (!hasTeamName()) {
          
          return false;
        }
        if (!hasPeerName()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (hasPose()) {
          if (!getPose().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder subBuilder = org.robocup_logistics.llsf_msgs.TimeProtos.Time.newBuilder();
              if (hasTime()) {
                subBuilder.mergeFrom(getTime());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTime(subBuilder.buildPartial());
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              seq_ = input.readUInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000004;
              teamName_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000008;
              peerName_ = input.readBytes();
              break;
            }
            case 58: {
              org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder subBuilder = org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.newBuilder();
              if (hasPose()) {
                subBuilder.mergeFrom(getPose());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setPose(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .llsf_msgs.Time time = 1;
      private org.robocup_logistics.llsf_msgs.TimeProtos.Time time_ = org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder> timeBuilder_;
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public org.robocup_logistics.llsf_msgs.TimeProtos.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      public Builder setTime(org.robocup_logistics.llsf_msgs.TimeProtos.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setTime(
          org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeTime(org.robocup_logistics.llsf_msgs.TimeProtos.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance()) {
            time_ =
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      public org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder>(
                  time_,
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }
      
      // required uint64 seq = 2;
      private long seq_ ;
      public boolean hasSeq() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getSeq() {
        return seq_;
      }
      public Builder setSeq(long value) {
        bitField0_ |= 0x00000002;
        seq_ = value;
        onChanged();
        return this;
      }
      public Builder clearSeq() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seq_ = 0L;
        onChanged();
        return this;
      }
      
      // required string team_name = 4;
      private java.lang.Object teamName_ = "";
      public boolean hasTeamName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          teamName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTeamName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        teamName_ = value;
        onChanged();
        return this;
      }
      public Builder clearTeamName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      void setTeamName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        teamName_ = value;
        onChanged();
      }
      
      // required string peer_name = 5;
      private java.lang.Object peerName_ = "";
      public boolean hasPeerName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getPeerName() {
        java.lang.Object ref = peerName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          peerName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPeerName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        peerName_ = value;
        onChanged();
        return this;
      }
      public Builder clearPeerName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        peerName_ = getDefaultInstance().getPeerName();
        onChanged();
        return this;
      }
      void setPeerName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        peerName_ = value;
        onChanged();
      }
      
      // optional .llsf_msgs.Pose2D pose = 7;
      private org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D pose_ = org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder> poseBuilder_;
      public boolean hasPose() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D getPose() {
        if (poseBuilder_ == null) {
          return pose_;
        } else {
          return poseBuilder_.getMessage();
        }
      }
      public Builder setPose(org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pose_ = value;
          onChanged();
        } else {
          poseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder setPose(
          org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder builderForValue) {
        if (poseBuilder_ == null) {
          pose_ = builderForValue.build();
          onChanged();
        } else {
          poseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder mergePose(org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D value) {
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              pose_ != org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.getDefaultInstance()) {
            pose_ =
              org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.newBuilder(pose_).mergeFrom(value).buildPartial();
          } else {
            pose_ = value;
          }
          onChanged();
        } else {
          poseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.getDefaultInstance();
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      public org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder getPoseBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getPoseFieldBuilder().getBuilder();
      }
      public org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder getPoseOrBuilder() {
        if (poseBuilder_ != null) {
          return poseBuilder_.getMessageOrBuilder();
        } else {
          return pose_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder> 
          getPoseFieldBuilder() {
        if (poseBuilder_ == null) {
          poseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2D.Builder, org.robocup_logistics.llsf_msgs.Pose2DProtos.Pose2DOrBuilder>(
                  pose_,
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:llsf_msgs.BeaconSignal)
    }
    
    static {
      defaultInstance = new BeaconSignal(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:llsf_msgs.BeaconSignal)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_BeaconSignal_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_BeaconSignal_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BeaconSignal.proto\022\tllsf_msgs\032\nTime.pr" +
      "oto\032\014Pose2D.proto\"\251\001\n\014BeaconSignal\022\035\n\004ti" +
      "me\030\001 \002(\0132\017.llsf_msgs.Time\022\013\n\003seq\030\002 \002(\004\022\021" +
      "\n\tteam_name\030\004 \002(\t\022\021\n\tpeer_name\030\005 \002(\t\022\037\n\004" +
      "pose\030\007 \001(\0132\021.llsf_msgs.Pose2D\"&\n\010CompTyp" +
      "e\022\014\n\007COMP_ID\020\320\017\022\014\n\010MSG_TYPE\020\001B5\n\037org.rob" +
      "ocup_logistics.llsf_msgsB\022BeaconSignalPr" +
      "otos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_llsf_msgs_BeaconSignal_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_llsf_msgs_BeaconSignal_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_llsf_msgs_BeaconSignal_descriptor,
              new java.lang.String[] { "Time", "Seq", "TeamName", "PeerName", "Pose", },
              org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.class,
              org.robocup_logistics.llsf_msgs.BeaconSignalProtos.BeaconSignal.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.robocup_logistics.llsf_msgs.TimeProtos.getDescriptor(),
          org.robocup_logistics.llsf_msgs.Pose2DProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
