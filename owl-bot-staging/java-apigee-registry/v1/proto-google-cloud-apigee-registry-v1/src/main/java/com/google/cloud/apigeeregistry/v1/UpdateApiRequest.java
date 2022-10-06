// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 * <pre>
 * Request message for UpdateApi.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.UpdateApiRequest}
 */
public final class UpdateApiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.UpdateApiRequest)
    UpdateApiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateApiRequest.newBuilder() to construct.
  private UpdateApiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateApiRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateApiRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.UpdateApiRequest.class, com.google.cloud.apigeeregistry.v1.UpdateApiRequest.Builder.class);
  }

  public static final int API_FIELD_NUMBER = 1;
  private com.google.cloud.apigeeregistry.v1.Api api_;
  /**
   * <pre>
   * Required. The API to update.
   * The `name` field is used to identify the API to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the api field is set.
   */
  @java.lang.Override
  public boolean hasApi() {
    return api_ != null;
  }
  /**
   * <pre>
   * Required. The API to update.
   * The `name` field is used to identify the API to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The api.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.Api getApi() {
    return api_ == null ? com.google.cloud.apigeeregistry.v1.Api.getDefaultInstance() : api_;
  }
  /**
   * <pre>
   * Required. The API to update.
   * The `name` field is used to identify the API to update.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiOrBuilder getApiOrBuilder() {
    return getApi();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If an asterisk "*" is specified, all fields are updated, including fields
   * that are unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_;
  /**
   * <pre>
   * If set to true, and the API is not found, a new API will be created.
   * In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
    if (api_ != null) {
      output.writeMessage(1, getApi());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (api_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApi());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.UpdateApiRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.UpdateApiRequest other = (com.google.cloud.apigeeregistry.v1.UpdateApiRequest) obj;

    if (hasApi() != other.hasApi()) return false;
    if (hasApi()) {
      if (!getApi()
          .equals(other.getApi())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (getAllowMissing()
        != other.getAllowMissing()) return false;
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
    if (hasApi()) {
      hash = (37 * hash) + API_FIELD_NUMBER;
      hash = (53 * hash) + getApi().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMissing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigeeregistry.v1.UpdateApiRequest prototype) {
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
   * Request message for UpdateApi.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.UpdateApiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.UpdateApiRequest)
      com.google.cloud.apigeeregistry.v1.UpdateApiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.UpdateApiRequest.class, com.google.cloud.apigeeregistry.v1.UpdateApiRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.UpdateApiRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (apiBuilder_ == null) {
        api_ = null;
      } else {
        api_ = null;
        apiBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      allowMissing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_UpdateApiRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.UpdateApiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiRequest build() {
      com.google.cloud.apigeeregistry.v1.UpdateApiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.UpdateApiRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.UpdateApiRequest result = new com.google.cloud.apigeeregistry.v1.UpdateApiRequest(this);
      if (apiBuilder_ == null) {
        result.api_ = api_;
      } else {
        result.api_ = apiBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.allowMissing_ = allowMissing_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.UpdateApiRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.UpdateApiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.UpdateApiRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.UpdateApiRequest.getDefaultInstance()) return this;
      if (other.hasApi()) {
        mergeApi(other.getApi());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
                  getApiFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              allowMissing_ = input.readBool();

              break;
            } // case 24
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

    private com.google.cloud.apigeeregistry.v1.Api api_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.Api, com.google.cloud.apigeeregistry.v1.Api.Builder, com.google.cloud.apigeeregistry.v1.ApiOrBuilder> apiBuilder_;
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the api field is set.
     */
    public boolean hasApi() {
      return apiBuilder_ != null || api_ != null;
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The api.
     */
    public com.google.cloud.apigeeregistry.v1.Api getApi() {
      if (apiBuilder_ == null) {
        return api_ == null ? com.google.cloud.apigeeregistry.v1.Api.getDefaultInstance() : api_;
      } else {
        return apiBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApi(com.google.cloud.apigeeregistry.v1.Api value) {
      if (apiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        api_ = value;
        onChanged();
      } else {
        apiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApi(
        com.google.cloud.apigeeregistry.v1.Api.Builder builderForValue) {
      if (apiBuilder_ == null) {
        api_ = builderForValue.build();
        onChanged();
      } else {
        apiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeApi(com.google.cloud.apigeeregistry.v1.Api value) {
      if (apiBuilder_ == null) {
        if (api_ != null) {
          api_ =
            com.google.cloud.apigeeregistry.v1.Api.newBuilder(api_).mergeFrom(value).buildPartial();
        } else {
          api_ = value;
        }
        onChanged();
      } else {
        apiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearApi() {
      if (apiBuilder_ == null) {
        api_ = null;
        onChanged();
      } else {
        api_ = null;
        apiBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.Api.Builder getApiBuilder() {
      
      onChanged();
      return getApiFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiOrBuilder getApiOrBuilder() {
      if (apiBuilder_ != null) {
        return apiBuilder_.getMessageOrBuilder();
      } else {
        return api_ == null ?
            com.google.cloud.apigeeregistry.v1.Api.getDefaultInstance() : api_;
      }
    }
    /**
     * <pre>
     * Required. The API to update.
     * The `name` field is used to identify the API to update.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.Api api = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.Api, com.google.cloud.apigeeregistry.v1.Api.Builder, com.google.cloud.apigeeregistry.v1.ApiOrBuilder> 
        getApiFieldBuilder() {
      if (apiBuilder_ == null) {
        apiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.Api, com.google.cloud.apigeeregistry.v1.Api.Builder, com.google.cloud.apigeeregistry.v1.ApiOrBuilder>(
                getApi(),
                getParentForChildren(),
                isClean());
        api_ = null;
      }
      return apiBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. If omitted, all fields are updated that
     * are set in the request message (fields set to default values are ignored).
     * If an asterisk "*" is specified, all fields are updated, including fields
     * that are unspecified/default in the request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    private boolean allowMissing_ ;
    /**
     * <pre>
     * If set to true, and the API is not found, a new API will be created.
     * In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     * <pre>
     * If set to true, and the API is not found, a new API will be created.
     * In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {
      
      allowMissing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, and the API is not found, a new API will be created.
     * In this situation, `update_mask` is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      
      allowMissing_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.UpdateApiRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.UpdateApiRequest)
  private static final com.google.cloud.apigeeregistry.v1.UpdateApiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.UpdateApiRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.UpdateApiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateApiRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateApiRequest>() {
    @java.lang.Override
    public UpdateApiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateApiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateApiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.UpdateApiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

