// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/server_tls_policy.proto

package com.google.cloud.networksecurity.v1beta1;

/**
 * <pre>
 * Request used by UpdateServerTlsPolicy method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest}
 */
public final class UpdateServerTlsPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)
    UpdateServerTlsPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateServerTlsPolicyRequest.newBuilder() to construct.
  private UpdateServerTlsPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateServerTlsPolicyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateServerTlsPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
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
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
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
   * ServerTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int SERVER_TLS_POLICY_FIELD_NUMBER = 2;
  private com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy serverTlsPolicy_;
  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the serverTlsPolicy field is set.
   */
  @java.lang.Override
  public boolean hasServerTlsPolicy() {
    return serverTlsPolicy_ != null;
  }
  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serverTlsPolicy.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy getServerTlsPolicy() {
    return serverTlsPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.getDefaultInstance() : serverTlsPolicy_;
  }
  /**
   * <pre>
   * Required. Updated ServerTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder getServerTlsPolicyOrBuilder() {
    return getServerTlsPolicy();
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
    if (serverTlsPolicy_ != null) {
      output.writeMessage(2, getServerTlsPolicy());
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
    if (serverTlsPolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getServerTlsPolicy());
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest other = (com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasServerTlsPolicy() != other.hasServerTlsPolicy()) return false;
    if (hasServerTlsPolicy()) {
      if (!getServerTlsPolicy()
          .equals(other.getServerTlsPolicy())) return false;
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
    if (hasServerTlsPolicy()) {
      hash = (37 * hash) + SERVER_TLS_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getServerTlsPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest prototype) {
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
   * Request used by UpdateServerTlsPolicy method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)
      com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.class, com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.newBuilder()
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
      if (serverTlsPolicyBuilder_ == null) {
        serverTlsPolicy_ = null;
      } else {
        serverTlsPolicy_ = null;
        serverTlsPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest build() {
      com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest buildPartial() {
      com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest result = new com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (serverTlsPolicyBuilder_ == null) {
        result.serverTlsPolicy_ = serverTlsPolicy_;
      } else {
        result.serverTlsPolicy_ = serverTlsPolicyBuilder_.build();
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
      if (other instanceof com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest) {
        return mergeFrom((com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest other) {
      if (other == com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasServerTlsPolicy()) {
        mergeServerTlsPolicy(other.getServerTlsPolicy());
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
                  getServerTlsPolicyFieldBuilder().getBuilder(),
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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
     * ServerTlsPolicy resource by the update.  The fields
     * specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the
     * mask. If the user does not provide a mask then all fields will be
     * overwritten.
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

    private com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy serverTlsPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.Builder, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder> serverTlsPolicyBuilder_;
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the serverTlsPolicy field is set.
     */
    public boolean hasServerTlsPolicy() {
      return serverTlsPolicyBuilder_ != null || serverTlsPolicy_ != null;
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The serverTlsPolicy.
     */
    public com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy getServerTlsPolicy() {
      if (serverTlsPolicyBuilder_ == null) {
        return serverTlsPolicy_ == null ? com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.getDefaultInstance() : serverTlsPolicy_;
      } else {
        return serverTlsPolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServerTlsPolicy(com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy value) {
      if (serverTlsPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverTlsPolicy_ = value;
        onChanged();
      } else {
        serverTlsPolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setServerTlsPolicy(
        com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.Builder builderForValue) {
      if (serverTlsPolicyBuilder_ == null) {
        serverTlsPolicy_ = builderForValue.build();
        onChanged();
      } else {
        serverTlsPolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeServerTlsPolicy(com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy value) {
      if (serverTlsPolicyBuilder_ == null) {
        if (serverTlsPolicy_ != null) {
          serverTlsPolicy_ =
            com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.newBuilder(serverTlsPolicy_).mergeFrom(value).buildPartial();
        } else {
          serverTlsPolicy_ = value;
        }
        onChanged();
      } else {
        serverTlsPolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearServerTlsPolicy() {
      if (serverTlsPolicyBuilder_ == null) {
        serverTlsPolicy_ = null;
        onChanged();
      } else {
        serverTlsPolicy_ = null;
        serverTlsPolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.Builder getServerTlsPolicyBuilder() {
      
      onChanged();
      return getServerTlsPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder getServerTlsPolicyOrBuilder() {
      if (serverTlsPolicyBuilder_ != null) {
        return serverTlsPolicyBuilder_.getMessageOrBuilder();
      } else {
        return serverTlsPolicy_ == null ?
            com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.getDefaultInstance() : serverTlsPolicy_;
      }
    }
    /**
     * <pre>
     * Required. Updated ServerTlsPolicy resource.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.ServerTlsPolicy server_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.Builder, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder> 
        getServerTlsPolicyFieldBuilder() {
      if (serverTlsPolicyBuilder_ == null) {
        serverTlsPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy.Builder, com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyOrBuilder>(
                getServerTlsPolicy(),
                getParentForChildren(),
                isClean());
        serverTlsPolicy_ = null;
      }
      return serverTlsPolicyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest)
  private static final com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest();
  }

  public static com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateServerTlsPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateServerTlsPolicyRequest>() {
    @java.lang.Override
    public UpdateServerTlsPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateServerTlsPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateServerTlsPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.UpdateServerTlsPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

