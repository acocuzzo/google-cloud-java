// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigateway/v1/apigateway.proto

package com.google.cloud.apigateway.v1;

/**
 * <pre>
 * Request message for ApiGatewayService.UpdateApiConfig
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigateway.v1.UpdateApiConfigRequest}
 */
public final class UpdateApiConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigateway.v1.UpdateApiConfigRequest)
    UpdateApiConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateApiConfigRequest.newBuilder() to construct.
  private UpdateApiConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateApiConfigRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateApiConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_UpdateApiConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_UpdateApiConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigateway.v1.UpdateApiConfigRequest.class, com.google.cloud.apigateway.v1.UpdateApiConfigRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * ApiConfig resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * ApiConfig resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * ApiConfig resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int API_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.apigateway.v1.ApiConfig apiConfig_;
  /**
   * <pre>
   * Required. API Config resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the apiConfig field is set.
   */
  @java.lang.Override
  public boolean hasApiConfig() {
    return apiConfig_ != null;
  }
  /**
   * <pre>
   * Required. API Config resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The apiConfig.
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.ApiConfig getApiConfig() {
    return apiConfig_ == null ? com.google.cloud.apigateway.v1.ApiConfig.getDefaultInstance() : apiConfig_;
  }
  /**
   * <pre>
   * Required. API Config resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.ApiConfigOrBuilder getApiConfigOrBuilder() {
    return getApiConfig();
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (apiConfig_ != null) {
      output.writeMessage(2, getApiConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (apiConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApiConfig());
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
    if (!(obj instanceof com.google.cloud.apigateway.v1.UpdateApiConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigateway.v1.UpdateApiConfigRequest other = (com.google.cloud.apigateway.v1.UpdateApiConfigRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasApiConfig() != other.hasApiConfig()) return false;
    if (hasApiConfig()) {
      if (!getApiConfig()
          .equals(other.getApiConfig())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasApiConfig()) {
      hash = (37 * hash) + API_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getApiConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigateway.v1.UpdateApiConfigRequest prototype) {
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
   * Request message for ApiGatewayService.UpdateApiConfig
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigateway.v1.UpdateApiConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigateway.v1.UpdateApiConfigRequest)
      com.google.cloud.apigateway.v1.UpdateApiConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_UpdateApiConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_UpdateApiConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigateway.v1.UpdateApiConfigRequest.class, com.google.cloud.apigateway.v1.UpdateApiConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigateway.v1.UpdateApiConfigRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      if (apiConfigBuilder_ == null) {
        apiConfig_ = null;
      } else {
        apiConfig_ = null;
        apiConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigateway.v1.Apigateway.internal_static_google_cloud_apigateway_v1_UpdateApiConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.apigateway.v1.UpdateApiConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiConfigRequest build() {
      com.google.cloud.apigateway.v1.UpdateApiConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiConfigRequest buildPartial() {
      com.google.cloud.apigateway.v1.UpdateApiConfigRequest result = new com.google.cloud.apigateway.v1.UpdateApiConfigRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (apiConfigBuilder_ == null) {
        result.apiConfig_ = apiConfig_;
      } else {
        result.apiConfig_ = apiConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.apigateway.v1.UpdateApiConfigRequest) {
        return mergeFrom((com.google.cloud.apigateway.v1.UpdateApiConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigateway.v1.UpdateApiConfigRequest other) {
      if (other == com.google.cloud.apigateway.v1.UpdateApiConfigRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasApiConfig()) {
        mergeApiConfig(other.getApiConfig());
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
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getApiConfigFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * ApiConfig resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.apigateway.v1.ApiConfig apiConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigateway.v1.ApiConfig, com.google.cloud.apigateway.v1.ApiConfig.Builder, com.google.cloud.apigateway.v1.ApiConfigOrBuilder> apiConfigBuilder_;
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the apiConfig field is set.
     */
    public boolean hasApiConfig() {
      return apiConfigBuilder_ != null || apiConfig_ != null;
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The apiConfig.
     */
    public com.google.cloud.apigateway.v1.ApiConfig getApiConfig() {
      if (apiConfigBuilder_ == null) {
        return apiConfig_ == null ? com.google.cloud.apigateway.v1.ApiConfig.getDefaultInstance() : apiConfig_;
      } else {
        return apiConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiConfig(com.google.cloud.apigateway.v1.ApiConfig value) {
      if (apiConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiConfig_ = value;
        onChanged();
      } else {
        apiConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiConfig(
        com.google.cloud.apigateway.v1.ApiConfig.Builder builderForValue) {
      if (apiConfigBuilder_ == null) {
        apiConfig_ = builderForValue.build();
        onChanged();
      } else {
        apiConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeApiConfig(com.google.cloud.apigateway.v1.ApiConfig value) {
      if (apiConfigBuilder_ == null) {
        if (apiConfig_ != null) {
          apiConfig_ =
            com.google.cloud.apigateway.v1.ApiConfig.newBuilder(apiConfig_).mergeFrom(value).buildPartial();
        } else {
          apiConfig_ = value;
        }
        onChanged();
      } else {
        apiConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearApiConfig() {
      if (apiConfigBuilder_ == null) {
        apiConfig_ = null;
        onChanged();
      } else {
        apiConfig_ = null;
        apiConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigateway.v1.ApiConfig.Builder getApiConfigBuilder() {
      
      onChanged();
      return getApiConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigateway.v1.ApiConfigOrBuilder getApiConfigOrBuilder() {
      if (apiConfigBuilder_ != null) {
        return apiConfigBuilder_.getMessageOrBuilder();
      } else {
        return apiConfig_ == null ?
            com.google.cloud.apigateway.v1.ApiConfig.getDefaultInstance() : apiConfig_;
      }
    }
    /**
     * <pre>
     * Required. API Config resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.ApiConfig api_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigateway.v1.ApiConfig, com.google.cloud.apigateway.v1.ApiConfig.Builder, com.google.cloud.apigateway.v1.ApiConfigOrBuilder> 
        getApiConfigFieldBuilder() {
      if (apiConfigBuilder_ == null) {
        apiConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigateway.v1.ApiConfig, com.google.cloud.apigateway.v1.ApiConfig.Builder, com.google.cloud.apigateway.v1.ApiConfigOrBuilder>(
                getApiConfig(),
                getParentForChildren(),
                isClean());
        apiConfig_ = null;
      }
      return apiConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigateway.v1.UpdateApiConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigateway.v1.UpdateApiConfigRequest)
  private static final com.google.cloud.apigateway.v1.UpdateApiConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigateway.v1.UpdateApiConfigRequest();
  }

  public static com.google.cloud.apigateway.v1.UpdateApiConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateApiConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateApiConfigRequest>() {
    @java.lang.Override
    public UpdateApiConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateApiConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateApiConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigateway.v1.UpdateApiConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

