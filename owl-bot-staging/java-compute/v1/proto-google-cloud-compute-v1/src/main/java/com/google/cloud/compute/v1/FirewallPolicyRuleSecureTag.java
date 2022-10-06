// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.FirewallPolicyRuleSecureTag}
 */
public final class FirewallPolicyRuleSecureTag extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.FirewallPolicyRuleSecureTag)
    FirewallPolicyRuleSecureTagOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FirewallPolicyRuleSecureTag.newBuilder() to construct.
  private FirewallPolicyRuleSecureTag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FirewallPolicyRuleSecureTag() {
    name_ = "";
    state_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FirewallPolicyRuleSecureTag();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleSecureTag_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleSecureTag_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.class, com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.Builder.class);
  }

  /**
   * <pre>
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.FirewallPolicyRuleSecureTag.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATE = 0;</code>
     */
    UNDEFINED_STATE(0),
    /**
     * <code>EFFECTIVE = 244201863;</code>
     */
    EFFECTIVE(244201863),
    /**
     * <code>INEFFECTIVE = 304458242;</code>
     */
    INEFFECTIVE(304458242),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_STATE = 0;</code>
     */
    public static final int UNDEFINED_STATE_VALUE = 0;
    /**
     * <code>EFFECTIVE = 244201863;</code>
     */
    public static final int EFFECTIVE_VALUE = 244201863;
    /**
     * <code>INEFFECTIVE = 304458242;</code>
     */
    public static final int INEFFECTIVE_VALUE = 304458242;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_STATE;
        case 244201863: return EFFECTIVE;
        case 304458242: return INEFFECTIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.FirewallPolicyRuleSecureTag.State)
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 3373707;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the secure tag, created with TagManager's TagValue API.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Name of the secure tag, created with TagManager's TagValue API.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the secure tag, created with TagManager's TagValue API.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 109757585;
  private volatile java.lang.Object state_;
  /**
   * <pre>
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return The state.
   */
  @java.lang.Override
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   * @return The bytes for state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3373707, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 109757585, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3373707, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(109757585, state_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag other = (com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.FirewallPolicyRuleSecureTag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.FirewallPolicyRuleSecureTag)
      com.google.cloud.compute.v1.FirewallPolicyRuleSecureTagOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleSecureTag_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleSecureTag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.class, com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_FirewallPolicyRuleSecureTag_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag build() {
      com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag buildPartial() {
      com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag result = new com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.state_ = state_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag) {
        return mergeFrom((com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag other) {
      if (other == com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasState()) {
        bitField0_ |= 0x00000002;
        state_ = other.state_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26989658: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26989658
            case 878060682: {
              state_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 878060682
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the secure tag, created with TagManager's TagValue API.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object state_ = "";
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * Check the State enum for the list of possible values.
     * </pre>
     *
     * <code>optional string state = 109757585;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      state_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.FirewallPolicyRuleSecureTag)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.FirewallPolicyRuleSecureTag)
  private static final com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag();
  }

  public static com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FirewallPolicyRuleSecureTag>
      PARSER = new com.google.protobuf.AbstractParser<FirewallPolicyRuleSecureTag>() {
    @java.lang.Override
    public FirewallPolicyRuleSecureTag parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FirewallPolicyRuleSecureTag> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FirewallPolicyRuleSecureTag> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.FirewallPolicyRuleSecureTag getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

