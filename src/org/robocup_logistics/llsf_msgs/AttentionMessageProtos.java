// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttentionMessage.proto

package org.robocup_logistics.llsf_msgs;

public final class AttentionMessageProtos {
  private AttentionMessageProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AttentionMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.AttentionMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    boolean hasMessage();
    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    java.lang.String getMessage();
    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional float time_to_show = 2;</code>
     *
     * <pre>
     * Time (sec) the msg should be visible
     * </pre>
     */
    boolean hasTimeToShow();
    /**
     * <code>optional float time_to_show = 2;</code>
     *
     * <pre>
     * Time (sec) the msg should be visible
     * </pre>
     */
    float getTimeToShow();

    /**
     * <code>optional .llsf_msgs.Team team_color = 3;</code>
     *
     * <pre>
     * if the message only regards one team
     * </pre>
     */
    boolean hasTeamColor();
    /**
     * <code>optional .llsf_msgs.Team team_color = 3;</code>
     *
     * <pre>
     * if the message only regards one team
     * </pre>
     */
    org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor();
  }
  /**
   * Protobuf type {@code llsf_msgs.AttentionMessage}
   */
  public static final class AttentionMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.AttentionMessage)
      AttentionMessageOrBuilder {
    // Use AttentionMessage.newBuilder() to construct.
    private AttentionMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AttentionMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AttentionMessage defaultInstance;
    public static AttentionMessage getDefaultInstance() {
      return defaultInstance;
    }

    public AttentionMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AttentionMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              message_ = bs;
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              timeToShow_ = input.readFloat();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              org.robocup_logistics.llsf_msgs.TeamProtos.Team value = org.robocup_logistics.llsf_msgs.TeamProtos.Team.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                teamColor_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.internal_static_llsf_msgs_AttentionMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.internal_static_llsf_msgs_AttentionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.class, org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<AttentionMessage> PARSER =
        new com.google.protobuf.AbstractParser<AttentionMessage>() {
      public AttentionMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttentionMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AttentionMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code llsf_msgs.AttentionMessage.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 2000;</code>
       */
      COMP_ID(0, 2000),
      /**
       * <code>MSG_TYPE = 2;</code>
       */
      MSG_TYPE(1, 2),
      ;

      /**
       * <code>COMP_ID = 2000;</code>
       */
      public static final int COMP_ID_VALUE = 2000;
      /**
       * <code>MSG_TYPE = 2;</code>
       */
      public static final int MSG_TYPE_VALUE = 2;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 2000: return COMP_ID;
          case 2: return MSG_TYPE;
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
        return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final CompType[] VALUES = values();

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

      // @@protoc_insertion_point(enum_scope:llsf_msgs.AttentionMessage.CompType)
    }

    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string message = 1;</code>
     *
     * <pre>
     * The message to display, be brief!
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_TO_SHOW_FIELD_NUMBER = 2;
    private float timeToShow_;
    /**
     * <code>optional float time_to_show = 2;</code>
     *
     * <pre>
     * Time (sec) the msg should be visible
     * </pre>
     */
    public boolean hasTimeToShow() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional float time_to_show = 2;</code>
     *
     * <pre>
     * Time (sec) the msg should be visible
     * </pre>
     */
    public float getTimeToShow() {
      return timeToShow_;
    }

    public static final int TEAM_COLOR_FIELD_NUMBER = 3;
    private org.robocup_logistics.llsf_msgs.TeamProtos.Team teamColor_;
    /**
     * <code>optional .llsf_msgs.Team team_color = 3;</code>
     *
     * <pre>
     * if the message only regards one team
     * </pre>
     */
    public boolean hasTeamColor() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .llsf_msgs.Team team_color = 3;</code>
     *
     * <pre>
     * if the message only regards one team
     * </pre>
     */
    public org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor() {
      return teamColor_;
    }

    private void initFields() {
      message_ = "";
      timeToShow_ = 0F;
      teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, timeToShow_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, teamColor_.getNumber());
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
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, timeToShow_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, teamColor_.getNumber());
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

    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code llsf_msgs.AttentionMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.AttentionMessage)
        org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.internal_static_llsf_msgs_AttentionMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.internal_static_llsf_msgs_AttentionMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.class, org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        timeToShow_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.internal_static_llsf_msgs_AttentionMessage_descriptor;
      }

      public org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.getDefaultInstance();
      }

      public org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage build() {
        org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage buildPartial() {
        org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage result = new org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.timeToShow_ = timeToShow_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.teamColor_ = teamColor_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage other) {
        if (other == org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          bitField0_ |= 0x00000001;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasTimeToShow()) {
          setTimeToShow(other.getTimeToShow());
        }
        if (other.hasTeamColor()) {
          setTeamColor(other.getTeamColor());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.AttentionMessageProtos.AttentionMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object message_ = "";
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       *
       * <pre>
       * The message to display, be brief!
       * </pre>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }

      private float timeToShow_ ;
      /**
       * <code>optional float time_to_show = 2;</code>
       *
       * <pre>
       * Time (sec) the msg should be visible
       * </pre>
       */
      public boolean hasTimeToShow() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional float time_to_show = 2;</code>
       *
       * <pre>
       * Time (sec) the msg should be visible
       * </pre>
       */
      public float getTimeToShow() {
        return timeToShow_;
      }
      /**
       * <code>optional float time_to_show = 2;</code>
       *
       * <pre>
       * Time (sec) the msg should be visible
       * </pre>
       */
      public Builder setTimeToShow(float value) {
        bitField0_ |= 0x00000002;
        timeToShow_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float time_to_show = 2;</code>
       *
       * <pre>
       * Time (sec) the msg should be visible
       * </pre>
       */
      public Builder clearTimeToShow() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timeToShow_ = 0F;
        onChanged();
        return this;
      }

      private org.robocup_logistics.llsf_msgs.TeamProtos.Team teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
      /**
       * <code>optional .llsf_msgs.Team team_color = 3;</code>
       *
       * <pre>
       * if the message only regards one team
       * </pre>
       */
      public boolean hasTeamColor() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .llsf_msgs.Team team_color = 3;</code>
       *
       * <pre>
       * if the message only regards one team
       * </pre>
       */
      public org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor() {
        return teamColor_;
      }
      /**
       * <code>optional .llsf_msgs.Team team_color = 3;</code>
       *
       * <pre>
       * if the message only regards one team
       * </pre>
       */
      public Builder setTeamColor(org.robocup_logistics.llsf_msgs.TeamProtos.Team value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        teamColor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .llsf_msgs.Team team_color = 3;</code>
       *
       * <pre>
       * if the message only regards one team
       * </pre>
       */
      public Builder clearTeamColor() {
        bitField0_ = (bitField0_ & ~0x00000004);
        teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:llsf_msgs.AttentionMessage)
    }

    static {
      defaultInstance = new AttentionMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.AttentionMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_AttentionMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_AttentionMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AttentionMessage.proto\022\tllsf_msgs\032\nTea" +
      "m.proto\"\206\001\n\020AttentionMessage\022\017\n\007message\030" +
      "\001 \002(\t\022\024\n\014time_to_show\030\002 \001(\002\022#\n\nteam_colo" +
      "r\030\003 \001(\0162\017.llsf_msgs.Team\"&\n\010CompType\022\014\n\007" +
      "COMP_ID\020\320\017\022\014\n\010MSG_TYPE\020\002B9\n\037org.robocup_" +
      "logistics.llsf_msgsB\026AttentionMessagePro" +
      "tos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.robocup_logistics.llsf_msgs.TeamProtos.getDescriptor(),
        }, assigner);
    internal_static_llsf_msgs_AttentionMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_AttentionMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_llsf_msgs_AttentionMessage_descriptor,
        new java.lang.String[] { "Message", "TimeToShow", "TeamColor", });
    org.robocup_logistics.llsf_msgs.TeamProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
