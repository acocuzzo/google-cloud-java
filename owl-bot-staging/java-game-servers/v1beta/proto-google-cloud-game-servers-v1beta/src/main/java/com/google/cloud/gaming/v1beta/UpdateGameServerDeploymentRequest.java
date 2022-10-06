// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

/**
 * <pre>
 * Request message for GameServerDeploymentsService.UpdateGameServerDeployment.
 * Only allows updates for labels.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest}
 */
public final class UpdateGameServerDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)
    UpdateGameServerDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGameServerDeploymentRequest.newBuilder() to construct.
  private UpdateGameServerDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGameServerDeploymentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGameServerDeploymentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.class, com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.Builder.class);
  }

  public static final int GAME_SERVER_DEPLOYMENT_FIELD_NUMBER = 1;
  private com.google.cloud.gaming.v1beta.GameServerDeployment gameServerDeployment_;
  /**
   * <pre>
   * Required. The game server delpoyment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gameServerDeployment field is set.
   */
  @java.lang.Override
  public boolean hasGameServerDeployment() {
    return gameServerDeployment_ != null;
  }
  /**
   * <pre>
   * Required. The game server delpoyment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameServerDeployment.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerDeployment getGameServerDeployment() {
    return gameServerDeployment_ == null ? com.google.cloud.gaming.v1beta.GameServerDeployment.getDefaultInstance() : gameServerDeployment_;
  }
  /**
   * <pre>
   * Required. The game server delpoyment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder getGameServerDeploymentOrBuilder() {
    return getGameServerDeployment();
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
    if (gameServerDeployment_ != null) {
      output.writeMessage(1, getGameServerDeployment());
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
    if (gameServerDeployment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGameServerDeployment());
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
    if (!(obj instanceof com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest other = (com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest) obj;

    if (hasGameServerDeployment() != other.hasGameServerDeployment()) return false;
    if (hasGameServerDeployment()) {
      if (!getGameServerDeployment()
          .equals(other.getGameServerDeployment())) return false;
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
    if (hasGameServerDeployment()) {
      hash = (37 * hash) + GAME_SERVER_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getGameServerDeployment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest prototype) {
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
   * Request message for GameServerDeploymentsService.UpdateGameServerDeployment.
   * Only allows updates for labels.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.class, com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
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
      return com.google.cloud.gaming.v1beta.GameServerDeployments.internal_static_google_cloud_gaming_v1beta_UpdateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest build() {
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest buildPartial() {
      com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest result = new com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest(this);
      if (gameServerDeploymentBuilder_ == null) {
        result.gameServerDeployment_ = gameServerDeployment_;
      } else {
        result.gameServerDeployment_ = gameServerDeploymentBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest) {
        return mergeFrom((com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest other) {
      if (other == com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest.getDefaultInstance()) return this;
      if (other.hasGameServerDeployment()) {
        mergeGameServerDeployment(other.getGameServerDeployment());
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
                  getGameServerDeploymentFieldBuilder().getBuilder(),
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

    private com.google.cloud.gaming.v1beta.GameServerDeployment gameServerDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerDeployment, com.google.cloud.gaming.v1beta.GameServerDeployment.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder> gameServerDeploymentBuilder_;
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the gameServerDeployment field is set.
     */
    public boolean hasGameServerDeployment() {
      return gameServerDeploymentBuilder_ != null || gameServerDeployment_ != null;
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The gameServerDeployment.
     */
    public com.google.cloud.gaming.v1beta.GameServerDeployment getGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        return gameServerDeployment_ == null ? com.google.cloud.gaming.v1beta.GameServerDeployment.getDefaultInstance() : gameServerDeployment_;
      } else {
        return gameServerDeploymentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGameServerDeployment(com.google.cloud.gaming.v1beta.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameServerDeployment_ = value;
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGameServerDeployment(
        com.google.cloud.gaming.v1beta.GameServerDeployment.Builder builderForValue) {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = builderForValue.build();
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeGameServerDeployment(com.google.cloud.gaming.v1beta.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (gameServerDeployment_ != null) {
          gameServerDeployment_ =
            com.google.cloud.gaming.v1beta.GameServerDeployment.newBuilder(gameServerDeployment_).mergeFrom(value).buildPartial();
        } else {
          gameServerDeployment_ = value;
        }
        onChanged();
      } else {
        gameServerDeploymentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
        onChanged();
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerDeployment.Builder getGameServerDeploymentBuilder() {
      
      onChanged();
      return getGameServerDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder getGameServerDeploymentOrBuilder() {
      if (gameServerDeploymentBuilder_ != null) {
        return gameServerDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return gameServerDeployment_ == null ?
            com.google.cloud.gaming.v1beta.GameServerDeployment.getDefaultInstance() : gameServerDeployment_;
      }
    }
    /**
     * <pre>
     * Required. The game server delpoyment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerDeployment game_server_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerDeployment, com.google.cloud.gaming.v1beta.GameServerDeployment.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder> 
        getGameServerDeploymentFieldBuilder() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.GameServerDeployment, com.google.cloud.gaming.v1beta.GameServerDeployment.Builder, com.google.cloud.gaming.v1beta.GameServerDeploymentOrBuilder>(
                getGameServerDeployment(),
                getParentForChildren(),
                isClean());
        gameServerDeployment_ = null;
      }
      return gameServerDeploymentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest)
  private static final com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest();
  }

  public static com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGameServerDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGameServerDeploymentRequest>() {
    @java.lang.Override
    public UpdateGameServerDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGameServerDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGameServerDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

