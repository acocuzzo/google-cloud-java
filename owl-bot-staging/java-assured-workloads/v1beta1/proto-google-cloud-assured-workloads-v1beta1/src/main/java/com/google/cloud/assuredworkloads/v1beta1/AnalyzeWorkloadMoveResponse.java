// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads.proto

package com.google.cloud.assuredworkloads.v1beta1;

/**
 * <pre>
 * A response that includes the analysis of the hypothetical resource move.
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse}
 */
public final class AnalyzeWorkloadMoveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)
    AnalyzeWorkloadMoveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalyzeWorkloadMoveResponse.newBuilder() to construct.
  private AnalyzeWorkloadMoveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalyzeWorkloadMoveResponse() {
    blockers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnalyzeWorkloadMoveResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1beta1_AnalyzeWorkloadMoveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1beta1_AnalyzeWorkloadMoveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.class, com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.Builder.class);
  }

  public static final int BLOCKERS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList blockers_;
  /**
   * <pre>
   * A list of blockers that should be addressed before moving the source
   * project or project-based workload to the destination folder-based workload.
   * </pre>
   *
   * <code>repeated string blockers = 1;</code>
   * @return A list containing the blockers.
   */
  public com.google.protobuf.ProtocolStringList
      getBlockersList() {
    return blockers_;
  }
  /**
   * <pre>
   * A list of blockers that should be addressed before moving the source
   * project or project-based workload to the destination folder-based workload.
   * </pre>
   *
   * <code>repeated string blockers = 1;</code>
   * @return The count of blockers.
   */
  public int getBlockersCount() {
    return blockers_.size();
  }
  /**
   * <pre>
   * A list of blockers that should be addressed before moving the source
   * project or project-based workload to the destination folder-based workload.
   * </pre>
   *
   * <code>repeated string blockers = 1;</code>
   * @param index The index of the element to return.
   * @return The blockers at the given index.
   */
  public java.lang.String getBlockers(int index) {
    return blockers_.get(index);
  }
  /**
   * <pre>
   * A list of blockers that should be addressed before moving the source
   * project or project-based workload to the destination folder-based workload.
   * </pre>
   *
   * <code>repeated string blockers = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blockers at the given index.
   */
  public com.google.protobuf.ByteString
      getBlockersBytes(int index) {
    return blockers_.getByteString(index);
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
    for (int i = 0; i < blockers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, blockers_.getRaw(i));
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
      for (int i = 0; i < blockers_.size(); i++) {
        dataSize += computeStringSizeNoTag(blockers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBlockersList().size();
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse other = (com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse) obj;

    if (!getBlockersList()
        .equals(other.getBlockersList())) return false;
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
    if (getBlockersCount() > 0) {
      hash = (37 * hash) + BLOCKERS_FIELD_NUMBER;
      hash = (53 * hash) + getBlockersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse prototype) {
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
   * A response that includes the analysis of the hypothetical resource move.
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)
      com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1beta1_AnalyzeWorkloadMoveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1beta1_AnalyzeWorkloadMoveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.class, com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.Builder.class);
    }

    // Construct using com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      blockers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto.internal_static_google_cloud_assuredworkloads_v1beta1_AnalyzeWorkloadMoveResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse build() {
      com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse buildPartial() {
      com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse result = new com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        blockers_ = blockers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.blockers_ = blockers_;
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
      if (other instanceof com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse) {
        return mergeFrom((com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse other) {
      if (other == com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse.getDefaultInstance()) return this;
      if (!other.blockers_.isEmpty()) {
        if (blockers_.isEmpty()) {
          blockers_ = other.blockers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBlockersIsMutable();
          blockers_.addAll(other.blockers_);
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureBlockersIsMutable();
              blockers_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringList blockers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBlockersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blockers_ = new com.google.protobuf.LazyStringArrayList(blockers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @return A list containing the blockers.
     */
    public com.google.protobuf.ProtocolStringList
        getBlockersList() {
      return blockers_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @return The count of blockers.
     */
    public int getBlockersCount() {
      return blockers_.size();
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param index The index of the element to return.
     * @return The blockers at the given index.
     */
    public java.lang.String getBlockers(int index) {
      return blockers_.get(index);
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the blockers at the given index.
     */
    public com.google.protobuf.ByteString
        getBlockersBytes(int index) {
      return blockers_.getByteString(index);
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param index The index to set the value at.
     * @param value The blockers to set.
     * @return This builder for chaining.
     */
    public Builder setBlockers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockersIsMutable();
      blockers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param value The blockers to add.
     * @return This builder for chaining.
     */
    public Builder addBlockers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockersIsMutable();
      blockers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param values The blockers to add.
     * @return This builder for chaining.
     */
    public Builder addAllBlockers(
        java.lang.Iterable<java.lang.String> values) {
      ensureBlockersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, blockers_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockers() {
      blockers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of blockers that should be addressed before moving the source
     * project or project-based workload to the destination folder-based workload.
     * </pre>
     *
     * <code>repeated string blockers = 1;</code>
     * @param value The bytes of the blockers to add.
     * @return This builder for chaining.
     */
    public Builder addBlockersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureBlockersIsMutable();
      blockers_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse)
  private static final com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse();
  }

  public static com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeWorkloadMoveResponse>
      PARSER = new com.google.protobuf.AbstractParser<AnalyzeWorkloadMoveResponse>() {
    @java.lang.Override
    public AnalyzeWorkloadMoveResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnalyzeWorkloadMoveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeWorkloadMoveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

