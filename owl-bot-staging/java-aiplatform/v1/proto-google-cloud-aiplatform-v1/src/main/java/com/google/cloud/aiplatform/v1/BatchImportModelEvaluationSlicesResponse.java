// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for [ModelService.BatchImportModelEvaluationSlices][google.cloud.aiplatform.v1.ModelService.BatchImportModelEvaluationSlices]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse}
 */
public final class BatchImportModelEvaluationSlicesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)
    BatchImportModelEvaluationSlicesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchImportModelEvaluationSlicesResponse.newBuilder() to construct.
  private BatchImportModelEvaluationSlicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchImportModelEvaluationSlicesResponse() {
    importedModelEvaluationSlices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchImportModelEvaluationSlicesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto.internal_static_google_cloud_aiplatform_v1_BatchImportModelEvaluationSlicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto.internal_static_google_cloud_aiplatform_v1_BatchImportModelEvaluationSlicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.class, com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.Builder.class);
  }

  public static final int IMPORTED_MODEL_EVALUATION_SLICES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList importedModelEvaluationSlices_;
  /**
   * <pre>
   * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the importedModelEvaluationSlices.
   */
  public com.google.protobuf.ProtocolStringList
      getImportedModelEvaluationSlicesList() {
    return importedModelEvaluationSlices_;
  }
  /**
   * <pre>
   * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of importedModelEvaluationSlices.
   */
  public int getImportedModelEvaluationSlicesCount() {
    return importedModelEvaluationSlices_.size();
  }
  /**
   * <pre>
   * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The importedModelEvaluationSlices at the given index.
   */
  public java.lang.String getImportedModelEvaluationSlices(int index) {
    return importedModelEvaluationSlices_.get(index);
  }
  /**
   * <pre>
   * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
   * </pre>
   *
   * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the importedModelEvaluationSlices at the given index.
   */
  public com.google.protobuf.ByteString
      getImportedModelEvaluationSlicesBytes(int index) {
    return importedModelEvaluationSlices_.getByteString(index);
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
    for (int i = 0; i < importedModelEvaluationSlices_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, importedModelEvaluationSlices_.getRaw(i));
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
      for (int i = 0; i < importedModelEvaluationSlices_.size(); i++) {
        dataSize += computeStringSizeNoTag(importedModelEvaluationSlices_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getImportedModelEvaluationSlicesList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse other = (com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse) obj;

    if (!getImportedModelEvaluationSlicesList()
        .equals(other.getImportedModelEvaluationSlicesList())) return false;
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
    if (getImportedModelEvaluationSlicesCount() > 0) {
      hash = (37 * hash) + IMPORTED_MODEL_EVALUATION_SLICES_FIELD_NUMBER;
      hash = (53 * hash) + getImportedModelEvaluationSlicesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse prototype) {
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
   * Response message for [ModelService.BatchImportModelEvaluationSlices][google.cloud.aiplatform.v1.ModelService.BatchImportModelEvaluationSlices]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)
      com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto.internal_static_google_cloud_aiplatform_v1_BatchImportModelEvaluationSlicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto.internal_static_google_cloud_aiplatform_v1_BatchImportModelEvaluationSlicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.class, com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      importedModelEvaluationSlices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto.internal_static_google_cloud_aiplatform_v1_BatchImportModelEvaluationSlicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse build() {
      com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse buildPartial() {
      com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse result = new com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        importedModelEvaluationSlices_ = importedModelEvaluationSlices_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.importedModelEvaluationSlices_ = importedModelEvaluationSlices_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse other) {
      if (other == com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse.getDefaultInstance()) return this;
      if (!other.importedModelEvaluationSlices_.isEmpty()) {
        if (importedModelEvaluationSlices_.isEmpty()) {
          importedModelEvaluationSlices_ = other.importedModelEvaluationSlices_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureImportedModelEvaluationSlicesIsMutable();
          importedModelEvaluationSlices_.addAll(other.importedModelEvaluationSlices_);
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
              ensureImportedModelEvaluationSlicesIsMutable();
              importedModelEvaluationSlices_.add(s);
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

    private com.google.protobuf.LazyStringList importedModelEvaluationSlices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureImportedModelEvaluationSlicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        importedModelEvaluationSlices_ = new com.google.protobuf.LazyStringArrayList(importedModelEvaluationSlices_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return A list containing the importedModelEvaluationSlices.
     */
    public com.google.protobuf.ProtocolStringList
        getImportedModelEvaluationSlicesList() {
      return importedModelEvaluationSlices_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The count of importedModelEvaluationSlices.
     */
    public int getImportedModelEvaluationSlicesCount() {
      return importedModelEvaluationSlices_.size();
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the element to return.
     * @return The importedModelEvaluationSlices at the given index.
     */
    public java.lang.String getImportedModelEvaluationSlices(int index) {
      return importedModelEvaluationSlices_.get(index);
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the value to return.
     * @return The bytes of the importedModelEvaluationSlices at the given index.
     */
    public com.google.protobuf.ByteString
        getImportedModelEvaluationSlicesBytes(int index) {
      return importedModelEvaluationSlices_.getByteString(index);
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index to set the value at.
     * @param value The importedModelEvaluationSlices to set.
     * @return This builder for chaining.
     */
    public Builder setImportedModelEvaluationSlices(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImportedModelEvaluationSlicesIsMutable();
      importedModelEvaluationSlices_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The importedModelEvaluationSlices to add.
     * @return This builder for chaining.
     */
    public Builder addImportedModelEvaluationSlices(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureImportedModelEvaluationSlicesIsMutable();
      importedModelEvaluationSlices_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param values The importedModelEvaluationSlices to add.
     * @return This builder for chaining.
     */
    public Builder addAllImportedModelEvaluationSlices(
        java.lang.Iterable<java.lang.String> values) {
      ensureImportedModelEvaluationSlicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, importedModelEvaluationSlices_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearImportedModelEvaluationSlices() {
      importedModelEvaluationSlices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. List of imported [ModelEvaluationSlice.name][google.cloud.aiplatform.v1.ModelEvaluationSlice.name].
     * </pre>
     *
     * <code>repeated string imported_model_evaluation_slices = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes of the importedModelEvaluationSlices to add.
     * @return This builder for chaining.
     */
    public Builder addImportedModelEvaluationSlicesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureImportedModelEvaluationSlicesIsMutable();
      importedModelEvaluationSlices_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse)
  private static final com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse();
  }

  public static com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchImportModelEvaluationSlicesResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchImportModelEvaluationSlicesResponse>() {
    @java.lang.Override
    public BatchImportModelEvaluationSlicesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchImportModelEvaluationSlicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchImportModelEvaluationSlicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.BatchImportModelEvaluationSlicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

