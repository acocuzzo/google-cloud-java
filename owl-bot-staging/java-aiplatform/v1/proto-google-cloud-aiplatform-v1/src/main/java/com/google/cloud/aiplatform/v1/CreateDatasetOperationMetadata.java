// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Runtime operation information for [DatasetService.CreateDataset][google.cloud.aiplatform.v1.DatasetService.CreateDataset].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CreateDatasetOperationMetadata}
 */
public final class CreateDatasetOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)
    CreateDatasetOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDatasetOperationMetadata.newBuilder() to construct.
  private CreateDatasetOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDatasetOperationMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDatasetOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.class, com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.Builder.class);
  }

  public static final int GENERIC_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  @java.lang.Override
  public boolean hasGenericMetadata() {
    return genericMetadata_ != null;
  }
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
    return genericMetadata_ == null ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
  }
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
    return getGenericMetadata();
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
    if (genericMetadata_ != null) {
      output.writeMessage(1, getGenericMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genericMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGenericMetadata());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata other = (com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata) obj;

    if (hasGenericMetadata() != other.hasGenericMetadata()) return false;
    if (hasGenericMetadata()) {
      if (!getGenericMetadata()
          .equals(other.getGenericMetadata())) return false;
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
    if (hasGenericMetadata()) {
      hash = (37 * hash) + GENERIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getGenericMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata prototype) {
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
   * Runtime operation information for [DatasetService.CreateDataset][google.cloud.aiplatform.v1.DatasetService.CreateDataset].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CreateDatasetOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)
      com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.class, com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1_CreateDatasetOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata build() {
      com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata buildPartial() {
      com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata result = new com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata(this);
      if (genericMetadataBuilder_ == null) {
        result.genericMetadata_ = genericMetadata_;
      } else {
        result.genericMetadata_ = genericMetadataBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata other) {
      if (other == com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata.getDefaultInstance()) return this;
      if (other.hasGenericMetadata()) {
        mergeGenericMetadata(other.getGenericMetadata());
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
              input.readMessage(
                  getGenericMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder> genericMetadataBuilder_;
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return Whether the genericMetadata field is set.
     */
    public boolean hasGenericMetadata() {
      return genericMetadataBuilder_ != null || genericMetadata_ != null;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return The genericMetadata.
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        return genericMetadata_ == null ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      } else {
        return genericMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genericMetadata_ = value;
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder builderForValue) {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = builderForValue.build();
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder mergeGenericMetadata(com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (genericMetadata_ != null) {
          genericMetadata_ =
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.newBuilder(genericMetadata_).mergeFrom(value).buildPartial();
        } else {
          genericMetadata_ = value;
        }
        onChanged();
      } else {
        genericMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder clearGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
        onChanged();
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder getGenericMetadataBuilder() {
      
      onChanged();
      return getGenericMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
      if (genericMetadataBuilder_ != null) {
        return genericMetadataBuilder_.getMessageOrBuilder();
      } else {
        return genericMetadata_ == null ?
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      }
    }
    /**
     * <pre>
     * The operation generic information.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder> 
        getGenericMetadataFieldBuilder() {
      if (genericMetadataBuilder_ == null) {
        genericMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder>(
                getGenericMetadata(),
                getParentForChildren(),
                isClean());
        genericMetadata_ = null;
      }
      return genericMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CreateDatasetOperationMetadata)
  private static final com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata();
  }

  public static com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDatasetOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<CreateDatasetOperationMetadata>() {
    @java.lang.Override
    public CreateDatasetOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDatasetOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDatasetOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CreateDatasetOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

