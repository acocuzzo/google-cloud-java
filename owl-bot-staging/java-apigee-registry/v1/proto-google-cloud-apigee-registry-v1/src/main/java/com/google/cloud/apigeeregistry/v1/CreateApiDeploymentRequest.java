// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 * <pre>
 * Request message for CreateApiDeployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest}
 */
public final class CreateApiDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)
    CreateApiDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateApiDeploymentRequest.newBuilder() to construct.
  private CreateApiDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateApiDeploymentRequest() {
    parent_ = "";
    apiDeploymentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateApiDeploymentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_CreateApiDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_CreateApiDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.class, com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent, which owns this collection of deployments.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent, which owns this collection of deployments.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_DEPLOYMENT_FIELD_NUMBER = 2;
  private com.google.cloud.apigeeregistry.v1.ApiDeployment apiDeployment_;
  /**
   * <pre>
   * Required. The deployment to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the apiDeployment field is set.
   */
  @java.lang.Override
  public boolean hasApiDeployment() {
    return apiDeployment_ != null;
  }
  /**
   * <pre>
   * Required. The deployment to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The apiDeployment.
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployment() {
    return apiDeployment_ == null ? com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
  }
  /**
   * <pre>
   * Required. The deployment to create.
   * </pre>
   *
   * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentOrBuilder() {
    return getApiDeployment();
  }

  public static final int API_DEPLOYMENT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object apiDeploymentId_;
  /**
   * <pre>
   * Required. The ID to use for the deployment, which will become the final component of
   * the deployment's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The apiDeploymentId.
   */
  @java.lang.Override
  public java.lang.String getApiDeploymentId() {
    java.lang.Object ref = apiDeploymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiDeploymentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID to use for the deployment, which will become the final component of
   * the deployment's resource name.
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for apiDeploymentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApiDeploymentIdBytes() {
    java.lang.Object ref = apiDeploymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiDeploymentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (apiDeployment_ != null) {
      output.writeMessage(2, getApiDeployment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiDeploymentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, apiDeploymentId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (apiDeployment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getApiDeployment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(apiDeploymentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, apiDeploymentId_);
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest other = (com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasApiDeployment() != other.hasApiDeployment()) return false;
    if (hasApiDeployment()) {
      if (!getApiDeployment()
          .equals(other.getApiDeployment())) return false;
    }
    if (!getApiDeploymentId()
        .equals(other.getApiDeploymentId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasApiDeployment()) {
      hash = (37 * hash) + API_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getApiDeployment().hashCode();
    }
    hash = (37 * hash) + API_DEPLOYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApiDeploymentId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest prototype) {
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
   * Request message for CreateApiDeployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)
      com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_CreateApiDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_CreateApiDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.class, com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = null;
      } else {
        apiDeployment_ = null;
        apiDeploymentBuilder_ = null;
      }
      apiDeploymentId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto.internal_static_google_cloud_apigeeregistry_v1_CreateApiDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest build() {
      com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest buildPartial() {
      com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest result = new com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest(this);
      result.parent_ = parent_;
      if (apiDeploymentBuilder_ == null) {
        result.apiDeployment_ = apiDeployment_;
      } else {
        result.apiDeployment_ = apiDeploymentBuilder_.build();
      }
      result.apiDeploymentId_ = apiDeploymentId_;
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest other) {
      if (other == com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasApiDeployment()) {
        mergeApiDeployment(other.getApiDeployment());
      }
      if (!other.getApiDeploymentId().isEmpty()) {
        apiDeploymentId_ = other.apiDeploymentId_;
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getApiDeploymentFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              apiDeploymentId_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent, which owns this collection of deployments.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent, which owns this collection of deployments.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent, which owns this collection of deployments.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent, which owns this collection of deployments.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent, which owns this collection of deployments.
     * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.apigeeregistry.v1.ApiDeployment apiDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder> apiDeploymentBuilder_;
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the apiDeployment field is set.
     */
    public boolean hasApiDeployment() {
      return apiDeploymentBuilder_ != null || apiDeployment_ != null;
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The apiDeployment.
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployment() {
      if (apiDeploymentBuilder_ == null) {
        return apiDeployment_ == null ? com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
      } else {
        return apiDeploymentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiDeployment(com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        apiDeployment_ = value;
        onChanged();
      } else {
        apiDeploymentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setApiDeployment(
        com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder builderForValue) {
      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = builderForValue.build();
        onChanged();
      } else {
        apiDeploymentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeApiDeployment(com.google.cloud.apigeeregistry.v1.ApiDeployment value) {
      if (apiDeploymentBuilder_ == null) {
        if (apiDeployment_ != null) {
          apiDeployment_ =
            com.google.cloud.apigeeregistry.v1.ApiDeployment.newBuilder(apiDeployment_).mergeFrom(value).buildPartial();
        } else {
          apiDeployment_ = value;
        }
        onChanged();
      } else {
        apiDeploymentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearApiDeployment() {
      if (apiDeploymentBuilder_ == null) {
        apiDeployment_ = null;
        onChanged();
      } else {
        apiDeployment_ = null;
        apiDeploymentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder getApiDeploymentBuilder() {
      
      onChanged();
      return getApiDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentOrBuilder() {
      if (apiDeploymentBuilder_ != null) {
        return apiDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return apiDeployment_ == null ?
            com.google.cloud.apigeeregistry.v1.ApiDeployment.getDefaultInstance() : apiDeployment_;
      }
    }
    /**
     * <pre>
     * Required. The deployment to create.
     * </pre>
     *
     * <code>.google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder> 
        getApiDeploymentFieldBuilder() {
      if (apiDeploymentBuilder_ == null) {
        apiDeploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiDeployment, com.google.cloud.apigeeregistry.v1.ApiDeployment.Builder, com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder>(
                getApiDeployment(),
                getParentForChildren(),
                isClean());
        apiDeployment_ = null;
      }
      return apiDeploymentBuilder_;
    }

    private java.lang.Object apiDeploymentId_ = "";
    /**
     * <pre>
     * Required. The ID to use for the deployment, which will become the final component of
     * the deployment's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The apiDeploymentId.
     */
    public java.lang.String getApiDeploymentId() {
      java.lang.Object ref = apiDeploymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiDeploymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the deployment, which will become the final component of
     * the deployment's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for apiDeploymentId.
     */
    public com.google.protobuf.ByteString
        getApiDeploymentIdBytes() {
      java.lang.Object ref = apiDeploymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiDeploymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID to use for the deployment, which will become the final component of
     * the deployment's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The apiDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setApiDeploymentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiDeploymentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the deployment, which will become the final component of
     * the deployment's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearApiDeploymentId() {
      
      apiDeploymentId_ = getDefaultInstance().getApiDeploymentId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID to use for the deployment, which will become the final component of
     * the deployment's resource name.
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * Following AIP-162, IDs must not have the form of a UUID.
     * </pre>
     *
     * <code>string api_deployment_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for apiDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setApiDeploymentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiDeploymentId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest)
  private static final com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest();
  }

  public static com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApiDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateApiDeploymentRequest>() {
    @java.lang.Override
    public CreateApiDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateApiDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApiDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.CreateApiDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

