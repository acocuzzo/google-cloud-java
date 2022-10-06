// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

/**
 * <pre>
 * State for Hierarchy Controller
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1.HierarchyControllerState}
 */
public final class HierarchyControllerState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)
    HierarchyControllerStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HierarchyControllerState.newBuilder() to construct.
  private HierarchyControllerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HierarchyControllerState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HierarchyControllerState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.class, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version_;
  /**
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion getVersion() {
    return version_ == null ? com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * The version for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder getVersionOrBuilder() {
    return getVersion();
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state_;
  /**
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState getState() {
    return state_ == null ? com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.getDefaultInstance() : state_;
  }
  /**
   * <pre>
   * The deployment state for Hierarchy Controller
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder getStateOrBuilder() {
    return getState();
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
    if (version_ != null) {
      output.writeMessage(1, getVersion());
    }
    if (state_ != null) {
      output.writeMessage(2, getState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVersion());
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState other = (com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState) obj;

    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
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
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState prototype) {
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
   * State for Hierarchy Controller
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1.HierarchyControllerState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.class, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      if (stateBuilder_ == null) {
        state_ = null;
      } else {
        state_ = null;
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState build() {
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState result = new com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState(this);
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      if (stateBuilder_ == null) {
        result.state_ = state_;
      } else {
        result.state_ = stateBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState.getDefaultInstance()) return this;
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasState()) {
        mergeState(other.getState());
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
                  getVersionFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
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

    private com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public Builder setVersion(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public Builder mergeVersion(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.Builder getVersionBuilder() {
      
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * The version for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion version = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersion.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerVersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder> stateBuilder_;
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return stateBuilder_ != null || state_ != null;
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     * @return The state.
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public Builder setState(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
        onChanged();
      } else {
        stateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public Builder setState(
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
        onChanged();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public Builder mergeState(com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState value) {
      if (stateBuilder_ == null) {
        if (state_ != null) {
          state_ =
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.newBuilder(state_).mergeFrom(value).buildPartial();
        } else {
          state_ = value;
        }
        onChanged();
      } else {
        stateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public Builder clearState() {
      if (stateBuilder_ == null) {
        state_ = null;
        onChanged();
      } else {
        state_ = null;
        stateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder getStateBuilder() {
      
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.getDefaultInstance() : state_;
      }
    }
    /**
     * <pre>
     * The deployment state for Hierarchy Controller
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState state = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder, com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1.HierarchyControllerState)
  private static final com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HierarchyControllerState>
      PARSER = new com.google.protobuf.AbstractParser<HierarchyControllerState>() {
    @java.lang.Override
    public HierarchyControllerState parsePartialFrom(
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

  public static com.google.protobuf.Parser<HierarchyControllerState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HierarchyControllerState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

