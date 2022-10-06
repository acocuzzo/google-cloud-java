// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

/**
 * <pre>
 * The uncompressed threat entries in hash format.
 * Hashes can be anywhere from 4 to 32 bytes in size. A large majority are 4
 * bytes, but some hashes are lengthened if they collide with the hash of a
 * popular URI.
 * Used for sending ThreatEntryAdditons to clients that do not support
 * compression, or when sending non-4-byte hashes to clients that do support
 * compression.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1.RawHashes}
 */
public final class RawHashes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1.RawHashes)
    RawHashesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RawHashes.newBuilder() to construct.
  private RawHashes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RawHashes() {
    rawHashes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RawHashes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_RawHashes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_RawHashes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1.RawHashes.class, com.google.webrisk.v1.RawHashes.Builder.class);
  }

  public static final int PREFIX_SIZE_FIELD_NUMBER = 1;
  private int prefixSize_;
  /**
   * <pre>
   * The number of bytes for each prefix encoded below.  This field can be
   * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
   * In practice this is almost always 4, except in exceptional circumstances.
   * </pre>
   *
   * <code>int32 prefix_size = 1;</code>
   * @return The prefixSize.
   */
  @java.lang.Override
  public int getPrefixSize() {
    return prefixSize_;
  }

  public static final int RAW_HASHES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rawHashes_;
  /**
   * <pre>
   * The hashes, in binary format, concatenated into one long string. Hashes are
   * sorted in lexicographic order. For JSON API users, hashes are
   * base64-encoded.
   * </pre>
   *
   * <code>bytes raw_hashes = 2;</code>
   * @return The rawHashes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRawHashes() {
    return rawHashes_;
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
    if (prefixSize_ != 0) {
      output.writeInt32(1, prefixSize_);
    }
    if (!rawHashes_.isEmpty()) {
      output.writeBytes(2, rawHashes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prefixSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, prefixSize_);
    }
    if (!rawHashes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rawHashes_);
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
    if (!(obj instanceof com.google.webrisk.v1.RawHashes)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1.RawHashes other = (com.google.webrisk.v1.RawHashes) obj;

    if (getPrefixSize()
        != other.getPrefixSize()) return false;
    if (!getRawHashes()
        .equals(other.getRawHashes())) return false;
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
    hash = (37 * hash) + PREFIX_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPrefixSize();
    hash = (37 * hash) + RAW_HASHES_FIELD_NUMBER;
    hash = (53 * hash) + getRawHashes().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1.RawHashes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1.RawHashes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.RawHashes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.webrisk.v1.RawHashes parseFrom(
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
  public static Builder newBuilder(com.google.webrisk.v1.RawHashes prototype) {
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
   * The uncompressed threat entries in hash format.
   * Hashes can be anywhere from 4 to 32 bytes in size. A large majority are 4
   * bytes, but some hashes are lengthened if they collide with the hash of a
   * popular URI.
   * Used for sending ThreatEntryAdditons to clients that do not support
   * compression, or when sending non-4-byte hashes to clients that do support
   * compression.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1.RawHashes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1.RawHashes)
      com.google.webrisk.v1.RawHashesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_RawHashes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_RawHashes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1.RawHashes.class, com.google.webrisk.v1.RawHashes.Builder.class);
    }

    // Construct using com.google.webrisk.v1.RawHashes.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      prefixSize_ = 0;

      rawHashes_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.webrisk.v1.WebRiskProto.internal_static_google_cloud_webrisk_v1_RawHashes_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1.RawHashes getDefaultInstanceForType() {
      return com.google.webrisk.v1.RawHashes.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1.RawHashes build() {
      com.google.webrisk.v1.RawHashes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1.RawHashes buildPartial() {
      com.google.webrisk.v1.RawHashes result = new com.google.webrisk.v1.RawHashes(this);
      result.prefixSize_ = prefixSize_;
      result.rawHashes_ = rawHashes_;
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
      if (other instanceof com.google.webrisk.v1.RawHashes) {
        return mergeFrom((com.google.webrisk.v1.RawHashes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1.RawHashes other) {
      if (other == com.google.webrisk.v1.RawHashes.getDefaultInstance()) return this;
      if (other.getPrefixSize() != 0) {
        setPrefixSize(other.getPrefixSize());
      }
      if (other.getRawHashes() != com.google.protobuf.ByteString.EMPTY) {
        setRawHashes(other.getRawHashes());
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
            case 8: {
              prefixSize_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              rawHashes_ = input.readBytes();

              break;
            } // case 18
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

    private int prefixSize_ ;
    /**
     * <pre>
     * The number of bytes for each prefix encoded below.  This field can be
     * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
     * In practice this is almost always 4, except in exceptional circumstances.
     * </pre>
     *
     * <code>int32 prefix_size = 1;</code>
     * @return The prefixSize.
     */
    @java.lang.Override
    public int getPrefixSize() {
      return prefixSize_;
    }
    /**
     * <pre>
     * The number of bytes for each prefix encoded below.  This field can be
     * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
     * In practice this is almost always 4, except in exceptional circumstances.
     * </pre>
     *
     * <code>int32 prefix_size = 1;</code>
     * @param value The prefixSize to set.
     * @return This builder for chaining.
     */
    public Builder setPrefixSize(int value) {
      
      prefixSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of bytes for each prefix encoded below.  This field can be
     * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
     * In practice this is almost always 4, except in exceptional circumstances.
     * </pre>
     *
     * <code>int32 prefix_size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefixSize() {
      
      prefixSize_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rawHashes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The hashes, in binary format, concatenated into one long string. Hashes are
     * sorted in lexicographic order. For JSON API users, hashes are
     * base64-encoded.
     * </pre>
     *
     * <code>bytes raw_hashes = 2;</code>
     * @return The rawHashes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRawHashes() {
      return rawHashes_;
    }
    /**
     * <pre>
     * The hashes, in binary format, concatenated into one long string. Hashes are
     * sorted in lexicographic order. For JSON API users, hashes are
     * base64-encoded.
     * </pre>
     *
     * <code>bytes raw_hashes = 2;</code>
     * @param value The rawHashes to set.
     * @return This builder for chaining.
     */
    public Builder setRawHashes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawHashes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hashes, in binary format, concatenated into one long string. Hashes are
     * sorted in lexicographic order. For JSON API users, hashes are
     * base64-encoded.
     * </pre>
     *
     * <code>bytes raw_hashes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawHashes() {
      
      rawHashes_ = getDefaultInstance().getRawHashes();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1.RawHashes)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1.RawHashes)
  private static final com.google.webrisk.v1.RawHashes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1.RawHashes();
  }

  public static com.google.webrisk.v1.RawHashes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RawHashes>
      PARSER = new com.google.protobuf.AbstractParser<RawHashes>() {
    @java.lang.Override
    public RawHashes parsePartialFrom(
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

  public static com.google.protobuf.Parser<RawHashes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RawHashes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1.RawHashes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

