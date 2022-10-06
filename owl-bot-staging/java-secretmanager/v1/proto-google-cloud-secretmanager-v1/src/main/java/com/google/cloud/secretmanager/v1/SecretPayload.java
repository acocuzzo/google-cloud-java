// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

/**
 * <pre>
 * A secret payload resource in the Secret Manager API. This contains the
 * sensitive secret payload that is associated with a [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secretmanager.v1.SecretPayload}
 */
public final class SecretPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.secretmanager.v1.SecretPayload)
    SecretPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecretPayload.newBuilder() to construct.
  private SecretPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecretPayload() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecretPayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1.SecretPayload.class, com.google.cloud.secretmanager.v1.SecretPayload.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * The secret data. Must be no larger than 64KiB.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int DATA_CRC32C_FIELD_NUMBER = 2;
  private long dataCrc32C_;
  /**
   * <pre>
   * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
   * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
   * the crc32c checksum and store it to include in future
   * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
   * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
   * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
   * The CRC32C value is encoded as a Int64 for compatibility, and can be
   * safely downconverted to uint32 in languages that support this type.
   * https://cloud.google.com/apis/design/design_patterns#integer_types
   * </pre>
   *
   * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the dataCrc32c field is set.
   */
  @java.lang.Override
  public boolean hasDataCrc32C() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
   * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
   * the crc32c checksum and store it to include in future
   * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
   * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
   * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
   * The CRC32C value is encoded as a Int64 for compatibility, and can be
   * safely downconverted to uint32 in languages that support this type.
   * https://cloud.google.com/apis/design/design_patterns#integer_types
   * </pre>
   *
   * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The dataCrc32c.
   */
  @java.lang.Override
  public long getDataCrc32C() {
    return dataCrc32C_;
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
    if (!data_.isEmpty()) {
      output.writeBytes(1, data_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, dataCrc32C_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, data_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, dataCrc32C_);
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1.SecretPayload)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1.SecretPayload other = (com.google.cloud.secretmanager.v1.SecretPayload) obj;

    if (!getData()
        .equals(other.getData())) return false;
    if (hasDataCrc32C() != other.hasDataCrc32C()) return false;
    if (hasDataCrc32C()) {
      if (getDataCrc32C()
          != other.getDataCrc32C()) return false;
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
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (hasDataCrc32C()) {
      hash = (37 * hash) + DATA_CRC32C_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDataCrc32C());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.secretmanager.v1.SecretPayload parseFrom(
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
  public static Builder newBuilder(com.google.cloud.secretmanager.v1.SecretPayload prototype) {
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
   * A secret payload resource in the Secret Manager API. This contains the
   * sensitive secret payload that is associated with a [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secretmanager.v1.SecretPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secretmanager.v1.SecretPayload)
      com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1.SecretPayload.class, com.google.cloud.secretmanager.v1.SecretPayload.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1.SecretPayload.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      data_ = com.google.protobuf.ByteString.EMPTY;

      dataCrc32C_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.secretmanager.v1.ResourcesProto.internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.SecretPayload getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1.SecretPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.SecretPayload build() {
      com.google.cloud.secretmanager.v1.SecretPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.SecretPayload buildPartial() {
      com.google.cloud.secretmanager.v1.SecretPayload result = new com.google.cloud.secretmanager.v1.SecretPayload(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.data_ = data_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataCrc32C_ = dataCrc32C_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.cloud.secretmanager.v1.SecretPayload) {
        return mergeFrom((com.google.cloud.secretmanager.v1.SecretPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1.SecretPayload other) {
      if (other == com.google.cloud.secretmanager.v1.SecretPayload.getDefaultInstance()) return this;
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.hasDataCrc32C()) {
        setDataCrc32C(other.getDataCrc32C());
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
            case 10: {
              data_ = input.readBytes();

              break;
            } // case 10
            case 16: {
              dataCrc32C_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
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

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The secret data. Must be no larger than 64KiB.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * The secret data. Must be no larger than 64KiB.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secret data. Must be no larger than 64KiB.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private long dataCrc32C_ ;
    /**
     * <pre>
     * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
     * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
     * the crc32c checksum and store it to include in future
     * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
     * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
     * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
     * The CRC32C value is encoded as a Int64 for compatibility, and can be
     * safely downconverted to uint32 in languages that support this type.
     * https://cloud.google.com/apis/design/design_patterns#integer_types
     * </pre>
     *
     * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the dataCrc32c field is set.
     */
    @java.lang.Override
    public boolean hasDataCrc32C() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
     * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
     * the crc32c checksum and store it to include in future
     * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
     * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
     * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
     * The CRC32C value is encoded as a Int64 for compatibility, and can be
     * safely downconverted to uint32 in languages that support this type.
     * https://cloud.google.com/apis/design/design_patterns#integer_types
     * </pre>
     *
     * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The dataCrc32c.
     */
    @java.lang.Override
    public long getDataCrc32C() {
      return dataCrc32C_;
    }
    /**
     * <pre>
     * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
     * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
     * the crc32c checksum and store it to include in future
     * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
     * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
     * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
     * The CRC32C value is encoded as a Int64 for compatibility, and can be
     * safely downconverted to uint32 in languages that support this type.
     * https://cloud.google.com/apis/design/design_patterns#integer_types
     * </pre>
     *
     * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The dataCrc32c to set.
     * @return This builder for chaining.
     */
    public Builder setDataCrc32C(long value) {
      bitField0_ |= 0x00000001;
      dataCrc32C_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If specified, [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will verify the integrity of the
     * received [data][google.cloud.secretmanager.v1.SecretPayload.data] on [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] calls using
     * the crc32c checksum and store it to include in future
     * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion] responses. If a checksum is
     * not provided in the [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AddSecretVersion] request, the
     * [SecretManagerService][google.cloud.secretmanager.v1.SecretManagerService] will generate and store one for you.
     * The CRC32C value is encoded as a Int64 for compatibility, and can be
     * safely downconverted to uint32 in languages that support this type.
     * https://cloud.google.com/apis/design/design_patterns#integer_types
     * </pre>
     *
     * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataCrc32C() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataCrc32C_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.secretmanager.v1.SecretPayload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.SecretPayload)
  private static final com.google.cloud.secretmanager.v1.SecretPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1.SecretPayload();
  }

  public static com.google.cloud.secretmanager.v1.SecretPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecretPayload>
      PARSER = new com.google.protobuf.AbstractParser<SecretPayload>() {
    @java.lang.Override
    public SecretPayload parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecretPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecretPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1.SecretPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

