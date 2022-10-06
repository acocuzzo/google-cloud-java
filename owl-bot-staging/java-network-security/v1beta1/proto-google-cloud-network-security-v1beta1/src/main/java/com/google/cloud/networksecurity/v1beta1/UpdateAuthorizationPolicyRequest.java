// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

package com.google.cloud.networksecurity.v1beta1;

/**
 * <pre>
 * Request used by the UpdateAuthorizationPolicy method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest}
 */
public final class UpdateAuthorizationPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)
    UpdateAuthorizationPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAuthorizationPolicyRequest.newBuilder() to construct.
  private UpdateAuthorizationPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAuthorizationPolicyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAuthorizationPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int AUTHORIZATION_POLICY_FIELD_NUMBER = 2;
  private com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorizationPolicy_;
  /**
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the authorizationPolicy field is set.
   */
  @java.lang.Override
  public boolean hasAuthorizationPolicy() {
    return authorizationPolicy_ != null;
  }
  /**
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The authorizationPolicy.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy getAuthorizationPolicy() {
    return authorizationPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
  }
  /**
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder getAuthorizationPolicyOrBuilder() {
    return getAuthorizationPolicy();
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
    if (authorizationPolicy_ != null) {
      output.writeMessage(2, getAuthorizationPolicy());
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
    if (authorizationPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthorizationPolicy());
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest other = (com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasAuthorizationPolicy() != other.hasAuthorizationPolicy()) return false;
    if (hasAuthorizationPolicy()) {
      if (!getAuthorizationPolicy()
          .equals(other.getAuthorizationPolicy())) return false;
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
    if (hasAuthorizationPolicy()) {
      hash = (37 * hash) + AUTHORIZATION_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorizationPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest prototype) {
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
   * Request used by the UpdateAuthorizationPolicy method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)
      com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.newBuilder()
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
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = null;
      } else {
        authorizationPolicy_ = null;
        authorizationPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest build() {
      com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest buildPartial() {
      com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest result = new com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (authorizationPolicyBuilder_ == null) {
        result.authorizationPolicy_ = authorizationPolicy_;
      } else {
        result.authorizationPolicy_ = authorizationPolicyBuilder_.build();
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
      if (other instanceof com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest) {
        return mergeFrom((com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest other) {
      if (other == com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasAuthorizationPolicy()) {
        mergeAuthorizationPolicy(other.getAuthorizationPolicy());
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
                  getAuthorizationPolicyFieldBuilder().getBuilder(),
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * AuthorizationPolicy resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
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

    private com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorizationPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder> authorizationPolicyBuilder_;
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the authorizationPolicy field is set.
     */
    public boolean hasAuthorizationPolicy() {
      return authorizationPolicyBuilder_ != null || authorizationPolicy_ != null;
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The authorizationPolicy.
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy getAuthorizationPolicy() {
      if (authorizationPolicyBuilder_ == null) {
        return authorizationPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
      } else {
        return authorizationPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAuthorizationPolicy(com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy value) {
      if (authorizationPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorizationPolicy_ = value;
        onChanged();
      } else {
        authorizationPolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAuthorizationPolicy(
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder builderForValue) {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = builderForValue.build();
        onChanged();
      } else {
        authorizationPolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAuthorizationPolicy(com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy value) {
      if (authorizationPolicyBuilder_ == null) {
        if (authorizationPolicy_ != null) {
          authorizationPolicy_ =
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.newBuilder(authorizationPolicy_).mergeFrom(value).buildPartial();
        } else {
          authorizationPolicy_ = value;
        }
        onChanged();
      } else {
        authorizationPolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAuthorizationPolicy() {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicy_ = null;
        onChanged();
      } else {
        authorizationPolicy_ = null;
        authorizationPolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder getAuthorizationPolicyBuilder() {
      
      onChanged();
      return getAuthorizationPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder getAuthorizationPolicyOrBuilder() {
      if (authorizationPolicyBuilder_ != null) {
        return authorizationPolicyBuilder_.getMessageOrBuilder();
      } else {
        return authorizationPolicy_ == null ?
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.getDefaultInstance() : authorizationPolicy_;
      }
    }
    /**
     * <pre>
     * Required. Updated AuthorizationPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder> 
        getAuthorizationPolicyFieldBuilder() {
      if (authorizationPolicyBuilder_ == null) {
        authorizationPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy.Builder, com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder>(
                getAuthorizationPolicy(),
                getParentForChildren(),
                isClean());
        authorizationPolicy_ = null;
      }
      return authorizationPolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)
  private static final com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest();
  }

  public static com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAuthorizationPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAuthorizationPolicyRequest>() {
    @java.lang.Override
    public UpdateAuthorizationPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAuthorizationPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAuthorizationPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

