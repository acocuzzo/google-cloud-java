// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

/**
 * <pre>
 * Request message for
 * GameServerDeploymentsService.UpdateGameServerRolloutDeployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest}
 */
public final class UpdateGameServerDeploymentRolloutRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)
    UpdateGameServerDeploymentRolloutRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGameServerDeploymentRolloutRequest.newBuilder() to construct.
  private UpdateGameServerDeploymentRolloutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGameServerDeploymentRolloutRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGameServerDeploymentRolloutRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRolloutRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.class, com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.Builder.class);
  }

  public static final int ROLLOUT_FIELD_NUMBER = 1;
  private com.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout_;
  /**
   * <pre>
   * Required. The game server delpoyment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the rollout field is set.
   */
  @java.lang.Override
  public boolean hasRollout() {
    return rollout_ != null;
  }
  /**
   * <pre>
   * Required. The game server delpoyment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The rollout.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerDeploymentRollout getRollout() {
    return rollout_ == null ? com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.getDefaultInstance() : rollout_;
  }
  /**
   * <pre>
   * Required. The game server delpoyment rollout to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder getRolloutOrBuilder() {
    return getRollout();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (rollout_ != null) {
      output.writeMessage(1, getRollout());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rollout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRollout());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest other = (com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest) obj;

    if (hasRollout() != other.hasRollout()) return false;
    if (hasRollout()) {
      if (!getRollout()
          .equals(other.getRollout())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasRollout()) {
      hash = (37 * hash) + ROLLOUT_FIELD_NUMBER;
      hash = (53 * hash) + getRollout().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest prototype) {
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
   * Request message for
   * GameServerDeploymentsService.UpdateGameServerRolloutDeployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRolloutRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.class, com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rolloutBuilder_ == null) {
        rollout_ = null;
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRolloutRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest build() {
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest buildPartial() {
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest result = new com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest(this);
      if (rolloutBuilder_ == null) {
        result.rollout_ = rollout_;
      } else {
        result.rollout_ = rolloutBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest) {
        return mergeFrom((com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest other) {
      if (other == com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest.getDefaultInstance()) return this;
      if (other.hasRollout()) {
        mergeRollout(other.getRollout());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getRolloutFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerDeploymentRollout, com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder> rolloutBuilder_;
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the rollout field is set.
     */
    public boolean hasRollout() {
      return rolloutBuilder_ != null || rollout_ != null;
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The rollout.
     */
    public com.google.cloud.gaming.v1beta.GameServerDeploymentRollout getRollout() {
      if (rolloutBuilder_ == null) {
        return rollout_ == null ? com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.getDefaultInstance() : rollout_;
      } else {
        return rolloutBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRollout(com.google.cloud.gaming.v1beta.GameServerDeploymentRollout value) {
      if (rolloutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rollout_ = value;
        onChanged();
      } else {
        rolloutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRollout(
        com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.Builder builderForValue) {
      if (rolloutBuilder_ == null) {
        rollout_ = builderForValue.build();
        onChanged();
      } else {
        rolloutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRollout(com.google.cloud.gaming.v1beta.GameServerDeploymentRollout value) {
      if (rolloutBuilder_ == null) {
        if (rollout_ != null) {
          rollout_ =
            com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.newBuilder(rollout_).mergeFrom(value).buildPartial();
        } else {
          rollout_ = value;
        }
        onChanged();
      } else {
        rolloutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRollout() {
      if (rolloutBuilder_ == null) {
        rollout_ = null;
        onChanged();
      } else {
        rollout_ = null;
        rolloutBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.Builder getRolloutBuilder() {
      
      onChanged();
      return getRolloutFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder getRolloutOrBuilder() {
      if (rolloutBuilder_ != null) {
        return rolloutBuilder_.getMessageOrBuilder();
      } else {
        return rollout_ == null ?
            com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.getDefaultInstance() : rollout_;
      }
    }
    /**
     * <pre>
     * Required. The game server delpoyment rollout to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeploymentRollout rollout = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerDeploymentRollout, com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder> 
        getRolloutFieldBuilder() {
      if (rolloutBuilder_ == null) {
        rolloutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.GameServerDeploymentRollout, com.google.cloud.gaming.v1beta.GameServerDeploymentRollout.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentRolloutOrBuilder>(
                getRollout(),
                getParentForChildren(),
                isClean());
        rollout_ = null;
      }
      return rolloutBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest)
  private static final com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest();
  }

  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGameServerDeploymentRolloutRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGameServerDeploymentRolloutRequest>() {
    @java.lang.Override
    public UpdateGameServerDeploymentRolloutRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGameServerDeploymentRolloutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGameServerDeploymentRolloutRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

