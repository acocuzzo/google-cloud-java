// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

/**
 * <pre>
 * `RemoveDirectory` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1alpha2.RemoveDirectoryRequest}
 */
public final class RemoveDirectoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)
    RemoveDirectoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveDirectoryRequest.newBuilder() to construct.
  private RemoveDirectoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveDirectoryRequest() {
    workspace_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveDirectoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_RemoveDirectoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_RemoveDirectoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.class, com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.Builder.class);
  }

  public static final int WORKSPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object workspace_;
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The workspace.
   */
  @java.lang.Override
  public java.lang.String getWorkspace() {
    java.lang.Object ref = workspace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workspace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for workspace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkspaceBytes() {
    java.lang.Object ref = workspace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workspace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * Required. The directory's full path including directory name, relative to the
   * workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The directory's full path including directory name, relative to the
   * workspace root.
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, workspace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workspace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, workspace_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest other = (com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest) obj;

    if (!getWorkspace()
        .equals(other.getWorkspace())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
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
    hash = (37 * hash) + WORKSPACE_FIELD_NUMBER;
    hash = (53 * hash) + getWorkspace().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest prototype) {
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
   * `RemoveDirectory` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1alpha2.RemoveDirectoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)
      com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_RemoveDirectoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_RemoveDirectoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.class, com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      workspace_ = "";

      path_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_RemoveDirectoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest build() {
      com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest buildPartial() {
      com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest result = new com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest(this);
      result.workspace_ = workspace_;
      result.path_ = path_;
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
      if (other instanceof com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest) {
        return mergeFrom((com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest other) {
      if (other == com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.getDefaultInstance()) return this;
      if (!other.getWorkspace().isEmpty()) {
        workspace_ = other.workspace_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
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
              workspace_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              path_ = input.readStringRequireUtf8();

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

    private java.lang.Object workspace_ = "";
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The workspace.
     */
    public java.lang.String getWorkspace() {
      java.lang.Object ref = workspace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workspace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for workspace.
     */
    public com.google.protobuf.ByteString
        getWorkspaceBytes() {
      java.lang.Object ref = workspace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workspace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The workspace to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workspace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkspace() {
      
      workspace_ = getDefaultInstance().getWorkspace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for workspace to set.
     * @return This builder for chaining.
     */
    public Builder setWorkspaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workspace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Required. The directory's full path including directory name, relative to the
     * workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The directory's full path including directory name, relative to the
     * workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The directory's full path including directory name, relative to the
     * workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The directory's full path including directory name, relative to the
     * workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The directory's full path including directory name, relative to the
     * workspace root.
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1alpha2.RemoveDirectoryRequest)
  private static final com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest();
  }

  public static com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveDirectoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveDirectoryRequest>() {
    @java.lang.Override
    public RemoveDirectoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveDirectoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveDirectoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

