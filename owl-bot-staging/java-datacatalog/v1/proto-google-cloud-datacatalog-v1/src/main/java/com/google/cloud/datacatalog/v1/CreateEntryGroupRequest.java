// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Request message for
 * [CreateEntryGroup][google.cloud.datacatalog.v1.DataCatalog.CreateEntryGroup].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryGroupRequest}
 */
public final class CreateEntryGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.CreateEntryGroupRequest)
    CreateEntryGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEntryGroupRequest.newBuilder() to construct.
  private CreateEntryGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEntryGroupRequest() {
    parent_ = "";
    entryGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEntryGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_CreateEntryGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_CreateEntryGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.class, com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The names of the project and location that the new entry group belongs to.
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
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
   * Required. The names of the project and location that the new entry group belongs to.
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
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

  public static final int ENTRY_GROUP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object entryGroupId_;
  /**
   * <pre>
   * Required. The ID of the entry group to create.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and must start with a letter or underscore.
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entryGroupId.
   */
  @java.lang.Override
  public java.lang.String getEntryGroupId() {
    java.lang.Object ref = entryGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entryGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the entry group to create.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and must start with a letter or underscore.
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entryGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntryGroupIdBytes() {
    java.lang.Object ref = entryGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entryGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTRY_GROUP_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.EntryGroup entryGroup_;
  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   * @return Whether the entryGroup field is set.
   */
  @java.lang.Override
  public boolean hasEntryGroup() {
    return entryGroup_ != null;
  }
  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   * @return The entryGroup.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup() {
    return entryGroup_ == null ? com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance() : entryGroup_;
  }
  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
    return getEntryGroup();
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
    if (entryGroup_ != null) {
      output.writeMessage(2, getEntryGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entryGroupId_);
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
    if (entryGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEntryGroup());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entryGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, entryGroupId_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.CreateEntryGroupRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.CreateEntryGroupRequest other = (com.google.cloud.datacatalog.v1.CreateEntryGroupRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getEntryGroupId()
        .equals(other.getEntryGroupId())) return false;
    if (hasEntryGroup() != other.hasEntryGroup()) return false;
    if (hasEntryGroup()) {
      if (!getEntryGroup()
          .equals(other.getEntryGroup())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + ENTRY_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntryGroupId().hashCode();
    if (hasEntryGroup()) {
      hash = (37 * hash) + ENTRY_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getEntryGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.CreateEntryGroupRequest prototype) {
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
   * [CreateEntryGroup][google.cloud.datacatalog.v1.DataCatalog.CreateEntryGroup].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.CreateEntryGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.CreateEntryGroupRequest)
      com.google.cloud.datacatalog.v1.CreateEntryGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_CreateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_CreateEntryGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.class, com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.newBuilder()
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

      entryGroupId_ = "";

      if (entryGroupBuilder_ == null) {
        entryGroup_ = null;
      } else {
        entryGroup_ = null;
        entryGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog.internal_static_google_cloud_datacatalog_v1_CreateEntryGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryGroupRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryGroupRequest build() {
      com.google.cloud.datacatalog.v1.CreateEntryGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.CreateEntryGroupRequest buildPartial() {
      com.google.cloud.datacatalog.v1.CreateEntryGroupRequest result = new com.google.cloud.datacatalog.v1.CreateEntryGroupRequest(this);
      result.parent_ = parent_;
      result.entryGroupId_ = entryGroupId_;
      if (entryGroupBuilder_ == null) {
        result.entryGroup_ = entryGroup_;
      } else {
        result.entryGroup_ = entryGroupBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.CreateEntryGroupRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.CreateEntryGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.CreateEntryGroupRequest other) {
      if (other == com.google.cloud.datacatalog.v1.CreateEntryGroupRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getEntryGroupId().isEmpty()) {
        entryGroupId_ = other.entryGroupId_;
        onChanged();
      }
      if (other.hasEntryGroup()) {
        mergeEntryGroup(other.getEntryGroup());
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
                  getEntryGroupFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              entryGroupId_ = input.readStringRequireUtf8();

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
     * Required. The names of the project and location that the new entry group belongs to.
     * Note: The entry group itself and its child resources might not be
     * stored in the location specified in its name.
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
     * Required. The names of the project and location that the new entry group belongs to.
     * Note: The entry group itself and its child resources might not be
     * stored in the location specified in its name.
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
     * Required. The names of the project and location that the new entry group belongs to.
     * Note: The entry group itself and its child resources might not be
     * stored in the location specified in its name.
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
     * Required. The names of the project and location that the new entry group belongs to.
     * Note: The entry group itself and its child resources might not be
     * stored in the location specified in its name.
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
     * Required. The names of the project and location that the new entry group belongs to.
     * Note: The entry group itself and its child resources might not be
     * stored in the location specified in its name.
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

    private java.lang.Object entryGroupId_ = "";
    /**
     * <pre>
     * Required. The ID of the entry group to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and must start with a letter or underscore.
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The entryGroupId.
     */
    public java.lang.String getEntryGroupId() {
      java.lang.Object ref = entryGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entryGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the entry group to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and must start with a letter or underscore.
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for entryGroupId.
     */
    public com.google.protobuf.ByteString
        getEntryGroupIdBytes() {
      java.lang.Object ref = entryGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entryGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the entry group to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and must start with a letter or underscore.
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The entryGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entryGroupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the entry group to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and must start with a letter or underscore.
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntryGroupId() {
      
      entryGroupId_ = getDefaultInstance().getEntryGroupId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the entry group to create.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and must start with a letter or underscore.
     * The maximum size is 64 bytes when encoded in UTF-8.
     * </pre>
     *
     * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for entryGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEntryGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entryGroupId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.datacatalog.v1.EntryGroup entryGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.EntryGroup, com.google.cloud.datacatalog.v1.EntryGroup.Builder, com.google.cloud.datacatalog.v1.EntryGroupOrBuilder> entryGroupBuilder_;
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     * @return Whether the entryGroup field is set.
     */
    public boolean hasEntryGroup() {
      return entryGroupBuilder_ != null || entryGroup_ != null;
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     * @return The entryGroup.
     */
    public com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup() {
      if (entryGroupBuilder_ == null) {
        return entryGroup_ == null ? com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance() : entryGroup_;
      } else {
        return entryGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public Builder setEntryGroup(com.google.cloud.datacatalog.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entryGroup_ = value;
        onChanged();
      } else {
        entryGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public Builder setEntryGroup(
        com.google.cloud.datacatalog.v1.EntryGroup.Builder builderForValue) {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = builderForValue.build();
        onChanged();
      } else {
        entryGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public Builder mergeEntryGroup(com.google.cloud.datacatalog.v1.EntryGroup value) {
      if (entryGroupBuilder_ == null) {
        if (entryGroup_ != null) {
          entryGroup_ =
            com.google.cloud.datacatalog.v1.EntryGroup.newBuilder(entryGroup_).mergeFrom(value).buildPartial();
        } else {
          entryGroup_ = value;
        }
        onChanged();
      } else {
        entryGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public Builder clearEntryGroup() {
      if (entryGroupBuilder_ == null) {
        entryGroup_ = null;
        onChanged();
      } else {
        entryGroup_ = null;
        entryGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.EntryGroup.Builder getEntryGroupBuilder() {
      
      onChanged();
      return getEntryGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    public com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder() {
      if (entryGroupBuilder_ != null) {
        return entryGroupBuilder_.getMessageOrBuilder();
      } else {
        return entryGroup_ == null ?
            com.google.cloud.datacatalog.v1.EntryGroup.getDefaultInstance() : entryGroup_;
      }
    }
    /**
     * <pre>
     * The entry group to create. Defaults to empty.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1.EntryGroup, com.google.cloud.datacatalog.v1.EntryGroup.Builder, com.google.cloud.datacatalog.v1.EntryGroupOrBuilder> 
        getEntryGroupFieldBuilder() {
      if (entryGroupBuilder_ == null) {
        entryGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.EntryGroup, com.google.cloud.datacatalog.v1.EntryGroup.Builder, com.google.cloud.datacatalog.v1.EntryGroupOrBuilder>(
                getEntryGroup(),
                getParentForChildren(),
                isClean());
        entryGroup_ = null;
      }
      return entryGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.CreateEntryGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.CreateEntryGroupRequest)
  private static final com.google.cloud.datacatalog.v1.CreateEntryGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.CreateEntryGroupRequest();
  }

  public static com.google.cloud.datacatalog.v1.CreateEntryGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntryGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEntryGroupRequest>() {
    @java.lang.Override
    public CreateEntryGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEntryGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntryGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.CreateEntryGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

