// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Time.proto

package org.robocup_logistics.llsf_msgs;

public final class TimeProtos {
  private TimeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TimeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 sec = 1;
    /**
     * <code>required int64 sec = 1;</code>
     *
     * <pre>
     * Time in seconds since the Unix epoch
     * in UTC or seconds part of duration
     * </pre>
     */
    boolean hasSec();
    /**
     * <code>required int64 sec = 1;</code>
     *
     * <pre>
     * Time in seconds since the Unix epoch
     * in UTC or seconds part of duration
     * </pre>
     */
    long getSec();

    // required int64 nsec = 2;
    /**
     * <code>required int64 nsec = 2;</code>
     *
     * <pre>
     * Nano seconds after seconds for a time
     * or nanoseconds part for duration
     * </pre>
     */
    boolean hasNsec();
    /**
     * <code>required int64 nsec = 2;</code>
     *
     * <pre>
     * Nano seconds after seconds for a time
     * or nanoseconds part for duration
     * </pre>
     */
    long getNsec();
  }
  /**
   * Protobuf type {@code llsf_msgs.Time}
   *
   * <pre>
   * Time stamp and duration structure.
   * Can be used for absolute times or
   * durations alike.
   * </pre>
   */
  public static final class Time extends
      com.google.protobuf.GeneratedMessage
      implements TimeOrBuilder {
    // Use Time.newBuilder() to construct.
    private Time(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Time(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Time defaultInstance;
    public static Time getDefaultInstance() {
      return defaultInstance;
    }

    public Time getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Time(
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
            case 8: {
              bitField0_ |= 0x00000001;
              sec_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              nsec_ = input.readInt64();
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
      return org.robocup_logistics.llsf_msgs.TimeProtos.internal_static_llsf_msgs_Time_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.TimeProtos.internal_static_llsf_msgs_Time_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.class, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder.class);
    }

    public static com.google.protobuf.Parser<Time> PARSER =
        new com.google.protobuf.AbstractParser<Time>() {
      public Time parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Time(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Time> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 sec = 1;
    public static final int SEC_FIELD_NUMBER = 1;
    private long sec_;
    /**
     * <code>required int64 sec = 1;</code>
     *
     * <pre>
     * Time in seconds since the Unix epoch
     * in UTC or seconds part of duration
     * </pre>
     */
    public boolean hasSec() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 sec = 1;</code>
     *
     * <pre>
     * Time in seconds since the Unix epoch
     * in UTC or seconds part of duration
     * </pre>
     */
    public long getSec() {
      return sec_;
    }

    // required int64 nsec = 2;
    public static final int NSEC_FIELD_NUMBER = 2;
    private long nsec_;
    /**
     * <code>required int64 nsec = 2;</code>
     *
     * <pre>
     * Nano seconds after seconds for a time
     * or nanoseconds part for duration
     * </pre>
     */
    public boolean hasNsec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 nsec = 2;</code>
     *
     * <pre>
     * Nano seconds after seconds for a time
     * or nanoseconds part for duration
     * </pre>
     */
    public long getNsec() {
      return nsec_;
    }

    private void initFields() {
      sec_ = 0L;
      nsec_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSec()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNsec()) {
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
        output.writeInt64(1, sec_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, nsec_);
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
          .computeInt64Size(1, sec_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, nsec_);
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

    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.TimeProtos.Time parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.TimeProtos.Time prototype) {
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
     * Protobuf type {@code llsf_msgs.Time}
     *
     * <pre>
     * Time stamp and duration structure.
     * Can be used for absolute times or
     * durations alike.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.TimeProtos.internal_static_llsf_msgs_Time_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.TimeProtos.internal_static_llsf_msgs_Time_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.TimeProtos.Time.class, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.TimeProtos.Time.newBuilder()
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
        sec_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        nsec_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.TimeProtos.internal_static_llsf_msgs_Time_descriptor;
      }

      public org.robocup_logistics.llsf_msgs.TimeProtos.Time getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance();
      }

      public org.robocup_logistics.llsf_msgs.TimeProtos.Time build() {
        org.robocup_logistics.llsf_msgs.TimeProtos.Time result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robocup_logistics.llsf_msgs.TimeProtos.Time buildPartial() {
        org.robocup_logistics.llsf_msgs.TimeProtos.Time result = new org.robocup_logistics.llsf_msgs.TimeProtos.Time(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sec_ = sec_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nsec_ = nsec_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.TimeProtos.Time) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.TimeProtos.Time)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.TimeProtos.Time other) {
        if (other == org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance()) return this;
        if (other.hasSec()) {
          setSec(other.getSec());
        }
        if (other.hasNsec()) {
          setNsec(other.getNsec());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSec()) {
          
          return false;
        }
        if (!hasNsec()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.TimeProtos.Time parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.TimeProtos.Time) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 sec = 1;
      private long sec_ ;
      /**
       * <code>required int64 sec = 1;</code>
       *
       * <pre>
       * Time in seconds since the Unix epoch
       * in UTC or seconds part of duration
       * </pre>
       */
      public boolean hasSec() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 sec = 1;</code>
       *
       * <pre>
       * Time in seconds since the Unix epoch
       * in UTC or seconds part of duration
       * </pre>
       */
      public long getSec() {
        return sec_;
      }
      /**
       * <code>required int64 sec = 1;</code>
       *
       * <pre>
       * Time in seconds since the Unix epoch
       * in UTC or seconds part of duration
       * </pre>
       */
      public Builder setSec(long value) {
        bitField0_ |= 0x00000001;
        sec_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 sec = 1;</code>
       *
       * <pre>
       * Time in seconds since the Unix epoch
       * in UTC or seconds part of duration
       * </pre>
       */
      public Builder clearSec() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sec_ = 0L;
        onChanged();
        return this;
      }

      // required int64 nsec = 2;
      private long nsec_ ;
      /**
       * <code>required int64 nsec = 2;</code>
       *
       * <pre>
       * Nano seconds after seconds for a time
       * or nanoseconds part for duration
       * </pre>
       */
      public boolean hasNsec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 nsec = 2;</code>
       *
       * <pre>
       * Nano seconds after seconds for a time
       * or nanoseconds part for duration
       * </pre>
       */
      public long getNsec() {
        return nsec_;
      }
      /**
       * <code>required int64 nsec = 2;</code>
       *
       * <pre>
       * Nano seconds after seconds for a time
       * or nanoseconds part for duration
       * </pre>
       */
      public Builder setNsec(long value) {
        bitField0_ |= 0x00000002;
        nsec_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 nsec = 2;</code>
       *
       * <pre>
       * Nano seconds after seconds for a time
       * or nanoseconds part for duration
       * </pre>
       */
      public Builder clearNsec() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nsec_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:llsf_msgs.Time)
    }

    static {
      defaultInstance = new Time(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.Time)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_Time_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_Time_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nTime.proto\022\tllsf_msgs\"!\n\004Time\022\013\n\003sec\030\001" +
      " \002(\003\022\014\n\004nsec\030\002 \002(\003B-\n\037org.robocup_logist" +
      "ics.llsf_msgsB\nTimeProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_llsf_msgs_Time_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_llsf_msgs_Time_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_llsf_msgs_Time_descriptor,
              new java.lang.String[] { "Sec", "Nsec", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
