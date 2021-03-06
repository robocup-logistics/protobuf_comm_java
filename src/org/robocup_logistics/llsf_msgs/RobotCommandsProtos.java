// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotCommands.proto

package org.robocup_logistics.llsf_msgs;

public final class RobotCommandsProtos {
  private RobotCommandsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SetRobotMaintenanceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.SetRobotMaintenance)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 robot_number = 1;</code>
     *
     * <pre>
     * Number of robot to set state
     * </pre>
     */
    boolean hasRobotNumber();
    /**
     * <code>required uint32 robot_number = 1;</code>
     *
     * <pre>
     * Number of robot to set state
     * </pre>
     */
    int getRobotNumber();

    /**
     * <code>required bool maintenance = 3;</code>
     *
     * <pre>
     * True to activate maintenance,
     * false to bring back robot
     * </pre>
     */
    boolean hasMaintenance();
    /**
     * <code>required bool maintenance = 3;</code>
     *
     * <pre>
     * True to activate maintenance,
     * false to bring back robot
     * </pre>
     */
    boolean getMaintenance();

    /**
     * <code>required .llsf_msgs.Team team_color = 4;</code>
     *
     * <pre>
     * Team the robot belongs to
     * </pre>
     */
    boolean hasTeamColor();
    /**
     * <code>required .llsf_msgs.Team team_color = 4;</code>
     *
     * <pre>
     * Team the robot belongs to
     * </pre>
     */
    org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor();
  }
  /**
   * Protobuf type {@code llsf_msgs.SetRobotMaintenance}
   *
   * <pre>
   * Set a robot's maintenance state
   * </pre>
   */
  public static final class SetRobotMaintenance extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.SetRobotMaintenance)
      SetRobotMaintenanceOrBuilder {
    // Use SetRobotMaintenance.newBuilder() to construct.
    private SetRobotMaintenance(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SetRobotMaintenance(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SetRobotMaintenance defaultInstance;
    public static SetRobotMaintenance getDefaultInstance() {
      return defaultInstance;
    }

    public SetRobotMaintenance getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SetRobotMaintenance(
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
              robotNumber_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              maintenance_ = input.readBool();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.robocup_logistics.llsf_msgs.TeamProtos.Team value = org.robocup_logistics.llsf_msgs.TeamProtos.Team.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
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
      return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.internal_static_llsf_msgs_SetRobotMaintenance_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.internal_static_llsf_msgs_SetRobotMaintenance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.class, org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.Builder.class);
    }

    public static com.google.protobuf.Parser<SetRobotMaintenance> PARSER =
        new com.google.protobuf.AbstractParser<SetRobotMaintenance>() {
      public SetRobotMaintenance parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetRobotMaintenance(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SetRobotMaintenance> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code llsf_msgs.SetRobotMaintenance.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 2000;</code>
       */
      COMP_ID(0, 2000),
      /**
       * <code>MSG_TYPE = 91;</code>
       */
      MSG_TYPE(1, 91),
      ;

      /**
       * <code>COMP_ID = 2000;</code>
       */
      public static final int COMP_ID_VALUE = 2000;
      /**
       * <code>MSG_TYPE = 91;</code>
       */
      public static final int MSG_TYPE_VALUE = 91;


      public final int getNumber() { return value; }

      public static CompType valueOf(int value) {
        switch (value) {
          case 2000: return COMP_ID;
          case 91: return MSG_TYPE;
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
        return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:llsf_msgs.SetRobotMaintenance.CompType)
    }

    private int bitField0_;
    public static final int ROBOT_NUMBER_FIELD_NUMBER = 1;
    private int robotNumber_;
    /**
     * <code>required uint32 robot_number = 1;</code>
     *
     * <pre>
     * Number of robot to set state
     * </pre>
     */
    public boolean hasRobotNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 robot_number = 1;</code>
     *
     * <pre>
     * Number of robot to set state
     * </pre>
     */
    public int getRobotNumber() {
      return robotNumber_;
    }

    public static final int MAINTENANCE_FIELD_NUMBER = 3;
    private boolean maintenance_;
    /**
     * <code>required bool maintenance = 3;</code>
     *
     * <pre>
     * True to activate maintenance,
     * false to bring back robot
     * </pre>
     */
    public boolean hasMaintenance() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool maintenance = 3;</code>
     *
     * <pre>
     * True to activate maintenance,
     * false to bring back robot
     * </pre>
     */
    public boolean getMaintenance() {
      return maintenance_;
    }

    public static final int TEAM_COLOR_FIELD_NUMBER = 4;
    private org.robocup_logistics.llsf_msgs.TeamProtos.Team teamColor_;
    /**
     * <code>required .llsf_msgs.Team team_color = 4;</code>
     *
     * <pre>
     * Team the robot belongs to
     * </pre>
     */
    public boolean hasTeamColor() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .llsf_msgs.Team team_color = 4;</code>
     *
     * <pre>
     * Team the robot belongs to
     * </pre>
     */
    public org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor() {
      return teamColor_;
    }

    private void initFields() {
      robotNumber_ = 0;
      maintenance_ = false;
      teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRobotNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMaintenance()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTeamColor()) {
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
        output.writeUInt32(1, robotNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(3, maintenance_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(4, teamColor_.getNumber());
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
          .computeUInt32Size(1, robotNumber_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, maintenance_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, teamColor_.getNumber());
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

    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance prototype) {
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
     * Protobuf type {@code llsf_msgs.SetRobotMaintenance}
     *
     * <pre>
     * Set a robot's maintenance state
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.SetRobotMaintenance)
        org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenanceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.internal_static_llsf_msgs_SetRobotMaintenance_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.internal_static_llsf_msgs_SetRobotMaintenance_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.class, org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.newBuilder()
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
        robotNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        maintenance_ = false;
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
        return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.internal_static_llsf_msgs_SetRobotMaintenance_descriptor;
      }

      public org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.getDefaultInstance();
      }

      public org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance build() {
        org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance buildPartial() {
        org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance result = new org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.robotNumber_ = robotNumber_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maintenance_ = maintenance_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.teamColor_ = teamColor_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance other) {
        if (other == org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance.getDefaultInstance()) return this;
        if (other.hasRobotNumber()) {
          setRobotNumber(other.getRobotNumber());
        }
        if (other.hasMaintenance()) {
          setMaintenance(other.getMaintenance());
        }
        if (other.hasTeamColor()) {
          setTeamColor(other.getTeamColor());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRobotNumber()) {
          
          return false;
        }
        if (!hasMaintenance()) {
          
          return false;
        }
        if (!hasTeamColor()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.RobotCommandsProtos.SetRobotMaintenance) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int robotNumber_ ;
      /**
       * <code>required uint32 robot_number = 1;</code>
       *
       * <pre>
       * Number of robot to set state
       * </pre>
       */
      public boolean hasRobotNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint32 robot_number = 1;</code>
       *
       * <pre>
       * Number of robot to set state
       * </pre>
       */
      public int getRobotNumber() {
        return robotNumber_;
      }
      /**
       * <code>required uint32 robot_number = 1;</code>
       *
       * <pre>
       * Number of robot to set state
       * </pre>
       */
      public Builder setRobotNumber(int value) {
        bitField0_ |= 0x00000001;
        robotNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 robot_number = 1;</code>
       *
       * <pre>
       * Number of robot to set state
       * </pre>
       */
      public Builder clearRobotNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        robotNumber_ = 0;
        onChanged();
        return this;
      }

      private boolean maintenance_ ;
      /**
       * <code>required bool maintenance = 3;</code>
       *
       * <pre>
       * True to activate maintenance,
       * false to bring back robot
       * </pre>
       */
      public boolean hasMaintenance() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool maintenance = 3;</code>
       *
       * <pre>
       * True to activate maintenance,
       * false to bring back robot
       * </pre>
       */
      public boolean getMaintenance() {
        return maintenance_;
      }
      /**
       * <code>required bool maintenance = 3;</code>
       *
       * <pre>
       * True to activate maintenance,
       * false to bring back robot
       * </pre>
       */
      public Builder setMaintenance(boolean value) {
        bitField0_ |= 0x00000002;
        maintenance_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool maintenance = 3;</code>
       *
       * <pre>
       * True to activate maintenance,
       * false to bring back robot
       * </pre>
       */
      public Builder clearMaintenance() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maintenance_ = false;
        onChanged();
        return this;
      }

      private org.robocup_logistics.llsf_msgs.TeamProtos.Team teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
      /**
       * <code>required .llsf_msgs.Team team_color = 4;</code>
       *
       * <pre>
       * Team the robot belongs to
       * </pre>
       */
      public boolean hasTeamColor() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .llsf_msgs.Team team_color = 4;</code>
       *
       * <pre>
       * Team the robot belongs to
       * </pre>
       */
      public org.robocup_logistics.llsf_msgs.TeamProtos.Team getTeamColor() {
        return teamColor_;
      }
      /**
       * <code>required .llsf_msgs.Team team_color = 4;</code>
       *
       * <pre>
       * Team the robot belongs to
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
       * <code>required .llsf_msgs.Team team_color = 4;</code>
       *
       * <pre>
       * Team the robot belongs to
       * </pre>
       */
      public Builder clearTeamColor() {
        bitField0_ = (bitField0_ & ~0x00000004);
        teamColor_ = org.robocup_logistics.llsf_msgs.TeamProtos.Team.CYAN;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:llsf_msgs.SetRobotMaintenance)
    }

    static {
      defaultInstance = new SetRobotMaintenance(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.SetRobotMaintenance)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_SetRobotMaintenance_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_llsf_msgs_SetRobotMaintenance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RobotCommands.proto\022\tllsf_msgs\032\nTeam.p" +
      "roto\"\215\001\n\023SetRobotMaintenance\022\024\n\014robot_nu" +
      "mber\030\001 \002(\r\022\023\n\013maintenance\030\003 \002(\010\022#\n\nteam_" +
      "color\030\004 \002(\0162\017.llsf_msgs.Team\"&\n\010CompType" +
      "\022\014\n\007COMP_ID\020\320\017\022\014\n\010MSG_TYPE\020[B6\n\037org.robo" +
      "cup_logistics.llsf_msgsB\023RobotCommandsPr" +
      "otos"
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
    internal_static_llsf_msgs_SetRobotMaintenance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_SetRobotMaintenance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_llsf_msgs_SetRobotMaintenance_descriptor,
        new java.lang.String[] { "RobotNumber", "Maintenance", "TeamColor", });
    org.robocup_logistics.llsf_msgs.TeamProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
