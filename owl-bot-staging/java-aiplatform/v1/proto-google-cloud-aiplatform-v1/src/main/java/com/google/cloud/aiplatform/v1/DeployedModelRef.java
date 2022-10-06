// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/deployed_model_ref.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Points to a DeployedModel.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.DeployedModelRef}
 */
public final class DeployedModelRef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.DeployedModelRef)
    DeployedModelRefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeployedModelRef.newBuilder() to construct.
  private DeployedModelRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeployedModelRef() {
    endpoint_ = "";
    deployedModelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeployedModelRef();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.DeployedModelNameProto.internal_static_google_cloud_aiplatform_v1_DeployedModelRef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DeployedModelNameProto.internal_static_google_cloud_aiplatform_v1_DeployedModelRef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.DeployedModelRef.class, com.google.cloud.aiplatform.v1.DeployedModelRef.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;
  private volatile java.lang.Object endpoint_;
  /**
   * <pre>
   * Immutable. A resource name of an Endpoint.
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. A resource name of an Endpoint.
   * </pre>
   *
   * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYED_MODEL_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object deployedModelId_;
  /**
   * <pre>
   * Immutable. An ID of a DeployedModel in the above Endpoint.
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The deployedModelId.
   */
  @java.lang.Override
  public java.lang.String getDeployedModelId() {
    java.lang.Object ref = deployedModelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployedModelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. An ID of a DeployedModel in the above Endpoint.
   * </pre>
   *
   * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for deployedModelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeployedModelIdBytes() {
    java.lang.Object ref = deployedModelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployedModelId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedModelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployedModelId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedModelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployedModelId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.DeployedModelRef)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.DeployedModelRef other = (com.google.cloud.aiplatform.v1.DeployedModelRef) obj;

    if (!getEndpoint()
        .equals(other.getEndpoint())) return false;
    if (!getDeployedModelId()
        .equals(other.getDeployedModelId())) return false;
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
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    hash = (37 * hash) + DEPLOYED_MODEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeployedModelId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.DeployedModelRef parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.DeployedModelRef prototype) {
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
   * Points to a DeployedModel.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.DeployedModelRef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.DeployedModelRef)
      com.google.cloud.aiplatform.v1.DeployedModelRefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.DeployedModelNameProto.internal_static_google_cloud_aiplatform_v1_DeployedModelRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DeployedModelNameProto.internal_static_google_cloud_aiplatform_v1_DeployedModelRef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.DeployedModelRef.class, com.google.cloud.aiplatform.v1.DeployedModelRef.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.DeployedModelRef.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      endpoint_ = "";

      deployedModelId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DeployedModelNameProto.internal_static_google_cloud_aiplatform_v1_DeployedModelRef_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DeployedModelRef getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.DeployedModelRef.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DeployedModelRef build() {
      com.google.cloud.aiplatform.v1.DeployedModelRef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.DeployedModelRef buildPartial() {
      com.google.cloud.aiplatform.v1.DeployedModelRef result = new com.google.cloud.aiplatform.v1.DeployedModelRef(this);
      result.endpoint_ = endpoint_;
      result.deployedModelId_ = deployedModelId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.DeployedModelRef) {
        return mergeFrom((com.google.cloud.aiplatform.v1.DeployedModelRef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.DeployedModelRef other) {
      if (other == com.google.cloud.aiplatform.v1.DeployedModelRef.getDefaultInstance()) return this;
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        onChanged();
      }
      if (!other.getDeployedModelId().isEmpty()) {
        deployedModelId_ = other.deployedModelId_;
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
              endpoint_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              deployedModelId_ = input.readStringRequireUtf8();

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

    private java.lang.Object endpoint_ = "";
    /**
     * <pre>
     * Immutable. A resource name of an Endpoint.
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. A resource name of an Endpoint.
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString
        getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. A resource name of an Endpoint.
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endpoint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. A resource name of an Endpoint.
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      
      endpoint_ = getDefaultInstance().getEndpoint();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. A resource name of an Endpoint.
     * </pre>
     *
     * <code>string endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endpoint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deployedModelId_ = "";
    /**
     * <pre>
     * Immutable. An ID of a DeployedModel in the above Endpoint.
     * </pre>
     *
     * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The deployedModelId.
     */
    public java.lang.String getDeployedModelId() {
      java.lang.Object ref = deployedModelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployedModelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. An ID of a DeployedModel in the above Endpoint.
     * </pre>
     *
     * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The bytes for deployedModelId.
     */
    public com.google.protobuf.ByteString
        getDeployedModelIdBytes() {
      java.lang.Object ref = deployedModelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployedModelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. An ID of a DeployedModel in the above Endpoint.
     * </pre>
     *
     * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The deployedModelId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedModelId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deployedModelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. An ID of a DeployedModel in the above Endpoint.
     * </pre>
     *
     * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployedModelId() {
      
      deployedModelId_ = getDefaultInstance().getDeployedModelId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. An ID of a DeployedModel in the above Endpoint.
     * </pre>
     *
     * <code>string deployed_model_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for deployedModelId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedModelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deployedModelId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.DeployedModelRef)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.DeployedModelRef)
  private static final com.google.cloud.aiplatform.v1.DeployedModelRef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.DeployedModelRef();
  }

  public static com.google.cloud.aiplatform.v1.DeployedModelRef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployedModelRef>
      PARSER = new com.google.protobuf.AbstractParser<DeployedModelRef>() {
    @java.lang.Override
    public DeployedModelRef parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployedModelRef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployedModelRef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeployedModelRef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

