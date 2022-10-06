// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RouterNatRuleAction}
 */
public final class RouterNatRuleAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RouterNatRuleAction)
    RouterNatRuleActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouterNatRuleAction.newBuilder() to construct.
  private RouterNatRuleAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouterNatRuleAction() {
    sourceNatActiveIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    sourceNatDrainIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouterNatRuleAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RouterNatRuleAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RouterNatRuleAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RouterNatRuleAction.class, com.google.cloud.compute.v1.RouterNatRuleAction.Builder.class);
  }

  public static final int SOURCE_NAT_ACTIVE_IPS_FIELD_NUMBER = 210378229;
  private com.google.protobuf.LazyStringList sourceNatActiveIps_;
  /**
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   * @return A list containing the sourceNatActiveIps.
   */
  public com.google.protobuf.ProtocolStringList
      getSourceNatActiveIpsList() {
    return sourceNatActiveIps_;
  }
  /**
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   * @return The count of sourceNatActiveIps.
   */
  public int getSourceNatActiveIpsCount() {
    return sourceNatActiveIps_.size();
  }
  /**
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   * @param index The index of the element to return.
   * @return The sourceNatActiveIps at the given index.
   */
  public java.lang.String getSourceNatActiveIps(int index) {
    return sourceNatActiveIps_.get(index);
  }
  /**
   * <pre>
   * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_active_ips = 210378229;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatActiveIps at the given index.
   */
  public com.google.protobuf.ByteString
      getSourceNatActiveIpsBytes(int index) {
    return sourceNatActiveIps_.getByteString(index);
  }

  public static final int SOURCE_NAT_DRAIN_IPS_FIELD_NUMBER = 340812451;
  private com.google.protobuf.LazyStringList sourceNatDrainIps_;
  /**
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   * @return A list containing the sourceNatDrainIps.
   */
  public com.google.protobuf.ProtocolStringList
      getSourceNatDrainIpsList() {
    return sourceNatDrainIps_;
  }
  /**
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   * @return The count of sourceNatDrainIps.
   */
  public int getSourceNatDrainIpsCount() {
    return sourceNatDrainIps_.size();
  }
  /**
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   * @param index The index of the element to return.
   * @return The sourceNatDrainIps at the given index.
   */
  public java.lang.String getSourceNatDrainIps(int index) {
    return sourceNatDrainIps_.get(index);
  }
  /**
   * <pre>
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
   * </pre>
   *
   * <code>repeated string source_nat_drain_ips = 340812451;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sourceNatDrainIps at the given index.
   */
  public com.google.protobuf.ByteString
      getSourceNatDrainIpsBytes(int index) {
    return sourceNatDrainIps_.getByteString(index);
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
    for (int i = 0; i < sourceNatActiveIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 210378229, sourceNatActiveIps_.getRaw(i));
    }
    for (int i = 0; i < sourceNatDrainIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 340812451, sourceNatDrainIps_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < sourceNatActiveIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(sourceNatActiveIps_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getSourceNatActiveIpsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sourceNatDrainIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(sourceNatDrainIps_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getSourceNatDrainIpsList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.RouterNatRuleAction)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RouterNatRuleAction other = (com.google.cloud.compute.v1.RouterNatRuleAction) obj;

    if (!getSourceNatActiveIpsList()
        .equals(other.getSourceNatActiveIpsList())) return false;
    if (!getSourceNatDrainIpsList()
        .equals(other.getSourceNatDrainIpsList())) return false;
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
    if (getSourceNatActiveIpsCount() > 0) {
      hash = (37 * hash) + SOURCE_NAT_ACTIVE_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getSourceNatActiveIpsList().hashCode();
    }
    if (getSourceNatDrainIpsCount() > 0) {
      hash = (37 * hash) + SOURCE_NAT_DRAIN_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getSourceNatDrainIpsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RouterNatRuleAction parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RouterNatRuleAction prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.RouterNatRuleAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RouterNatRuleAction)
      com.google.cloud.compute.v1.RouterNatRuleActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RouterNatRuleAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RouterNatRuleAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RouterNatRuleAction.class, com.google.cloud.compute.v1.RouterNatRuleAction.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RouterNatRuleAction.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sourceNatActiveIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceNatDrainIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RouterNatRuleAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatRuleAction getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RouterNatRuleAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatRuleAction build() {
      com.google.cloud.compute.v1.RouterNatRuleAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatRuleAction buildPartial() {
      com.google.cloud.compute.v1.RouterNatRuleAction result = new com.google.cloud.compute.v1.RouterNatRuleAction(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        sourceNatActiveIps_ = sourceNatActiveIps_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sourceNatActiveIps_ = sourceNatActiveIps_;
      if (((bitField0_ & 0x00000002) != 0)) {
        sourceNatDrainIps_ = sourceNatDrainIps_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.sourceNatDrainIps_ = sourceNatDrainIps_;
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
      if (other instanceof com.google.cloud.compute.v1.RouterNatRuleAction) {
        return mergeFrom((com.google.cloud.compute.v1.RouterNatRuleAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RouterNatRuleAction other) {
      if (other == com.google.cloud.compute.v1.RouterNatRuleAction.getDefaultInstance()) return this;
      if (!other.sourceNatActiveIps_.isEmpty()) {
        if (sourceNatActiveIps_.isEmpty()) {
          sourceNatActiveIps_ = other.sourceNatActiveIps_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSourceNatActiveIpsIsMutable();
          sourceNatActiveIps_.addAll(other.sourceNatActiveIps_);
        }
        onChanged();
      }
      if (!other.sourceNatDrainIps_.isEmpty()) {
        if (sourceNatDrainIps_.isEmpty()) {
          sourceNatDrainIps_ = other.sourceNatDrainIps_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureSourceNatDrainIpsIsMutable();
          sourceNatDrainIps_.addAll(other.sourceNatDrainIps_);
        }
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
            case 1683025834: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSourceNatActiveIpsIsMutable();
              sourceNatActiveIps_.add(s);
              break;
            } // case 1683025834
            case -1568467686: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSourceNatDrainIpsIsMutable();
              sourceNatDrainIps_.add(s);
              break;
            } // case -1568467686
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

    private com.google.protobuf.LazyStringList sourceNatActiveIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSourceNatActiveIpsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sourceNatActiveIps_ = new com.google.protobuf.LazyStringArrayList(sourceNatActiveIps_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @return A list containing the sourceNatActiveIps.
     */
    public com.google.protobuf.ProtocolStringList
        getSourceNatActiveIpsList() {
      return sourceNatActiveIps_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @return The count of sourceNatActiveIps.
     */
    public int getSourceNatActiveIpsCount() {
      return sourceNatActiveIps_.size();
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param index The index of the element to return.
     * @return The sourceNatActiveIps at the given index.
     */
    public java.lang.String getSourceNatActiveIps(int index) {
      return sourceNatActiveIps_.get(index);
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param index The index of the value to return.
     * @return The bytes of the sourceNatActiveIps at the given index.
     */
    public com.google.protobuf.ByteString
        getSourceNatActiveIpsBytes(int index) {
      return sourceNatActiveIps_.getByteString(index);
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param index The index to set the value at.
     * @param value The sourceNatActiveIps to set.
     * @return This builder for chaining.
     */
    public Builder setSourceNatActiveIps(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceNatActiveIpsIsMutable();
      sourceNatActiveIps_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param value The sourceNatActiveIps to add.
     * @return This builder for chaining.
     */
    public Builder addSourceNatActiveIps(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceNatActiveIpsIsMutable();
      sourceNatActiveIps_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param values The sourceNatActiveIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllSourceNatActiveIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureSourceNatActiveIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sourceNatActiveIps_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceNatActiveIps() {
      sourceNatActiveIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_active_ips = 210378229;</code>
     * @param value The bytes of the sourceNatActiveIps to add.
     * @return This builder for chaining.
     */
    public Builder addSourceNatActiveIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSourceNatActiveIpsIsMutable();
      sourceNatActiveIps_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList sourceNatDrainIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSourceNatDrainIpsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        sourceNatDrainIps_ = new com.google.protobuf.LazyStringArrayList(sourceNatDrainIps_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @return A list containing the sourceNatDrainIps.
     */
    public com.google.protobuf.ProtocolStringList
        getSourceNatDrainIpsList() {
      return sourceNatDrainIps_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @return The count of sourceNatDrainIps.
     */
    public int getSourceNatDrainIpsCount() {
      return sourceNatDrainIps_.size();
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param index The index of the element to return.
     * @return The sourceNatDrainIps at the given index.
     */
    public java.lang.String getSourceNatDrainIps(int index) {
      return sourceNatDrainIps_.get(index);
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param index The index of the value to return.
     * @return The bytes of the sourceNatDrainIps at the given index.
     */
    public com.google.protobuf.ByteString
        getSourceNatDrainIpsBytes(int index) {
      return sourceNatDrainIps_.getByteString(index);
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param index The index to set the value at.
     * @param value The sourceNatDrainIps to set.
     * @return This builder for chaining.
     */
    public Builder setSourceNatDrainIps(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceNatDrainIpsIsMutable();
      sourceNatDrainIps_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param value The sourceNatDrainIps to add.
     * @return This builder for chaining.
     */
    public Builder addSourceNatDrainIps(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSourceNatDrainIpsIsMutable();
      sourceNatDrainIps_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param values The sourceNatDrainIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllSourceNatDrainIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureSourceNatDrainIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sourceNatDrainIps_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceNatDrainIps() {
      sourceNatDrainIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * </pre>
     *
     * <code>repeated string source_nat_drain_ips = 340812451;</code>
     * @param value The bytes of the sourceNatDrainIps to add.
     * @return This builder for chaining.
     */
    public Builder addSourceNatDrainIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSourceNatDrainIpsIsMutable();
      sourceNatDrainIps_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RouterNatRuleAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RouterNatRuleAction)
  private static final com.google.cloud.compute.v1.RouterNatRuleAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RouterNatRuleAction();
  }

  public static com.google.cloud.compute.v1.RouterNatRuleAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouterNatRuleAction>
      PARSER = new com.google.protobuf.AbstractParser<RouterNatRuleAction>() {
    @java.lang.Override
    public RouterNatRuleAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouterNatRuleAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouterNatRuleAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RouterNatRuleAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

