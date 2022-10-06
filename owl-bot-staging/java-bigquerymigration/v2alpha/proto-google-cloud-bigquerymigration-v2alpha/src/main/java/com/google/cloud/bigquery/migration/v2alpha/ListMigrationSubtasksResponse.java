// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_service.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 * <pre>
 * Response object for a `ListMigrationSubtasks` call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse}
 */
public final class ListMigrationSubtasksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)
    ListMigrationSubtasksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMigrationSubtasksResponse.newBuilder() to construct.
  private ListMigrationSubtasksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMigrationSubtasksResponse() {
    migrationSubtasks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMigrationSubtasksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_ListMigrationSubtasksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_ListMigrationSubtasksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.class, com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.Builder.class);
  }

  public static final int MIGRATION_SUBTASKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> migrationSubtasks_;
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> getMigrationSubtasksList() {
    return migrationSubtasks_;
  }
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder> 
      getMigrationSubtasksOrBuilderList() {
    return migrationSubtasks_;
  }
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  @java.lang.Override
  public int getMigrationSubtasksCount() {
    return migrationSubtasks_.size();
  }
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask getMigrationSubtasks(int index) {
    return migrationSubtasks_.get(index);
  }
  /**
   * <pre>
   * The migration subtasks for the specified task.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder getMigrationSubtasksOrBuilder(
      int index) {
    return migrationSubtasks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < migrationSubtasks_.size(); i++) {
      output.writeMessage(1, migrationSubtasks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < migrationSubtasks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, migrationSubtasks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse other = (com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse) obj;

    if (!getMigrationSubtasksList()
        .equals(other.getMigrationSubtasksList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getMigrationSubtasksCount() > 0) {
      hash = (37 * hash) + MIGRATION_SUBTASKS_FIELD_NUMBER;
      hash = (53 * hash) + getMigrationSubtasksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse prototype) {
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
   * Response object for a `ListMigrationSubtasks` call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)
      com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_ListMigrationSubtasksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_ListMigrationSubtasksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.class, com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (migrationSubtasksBuilder_ == null) {
        migrationSubtasks_ = java.util.Collections.emptyList();
      } else {
        migrationSubtasks_ = null;
        migrationSubtasksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_ListMigrationSubtasksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse build() {
      com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse result = new com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse(this);
      int from_bitField0_ = bitField0_;
      if (migrationSubtasksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          migrationSubtasks_ = java.util.Collections.unmodifiableList(migrationSubtasks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.migrationSubtasks_ = migrationSubtasks_;
      } else {
        result.migrationSubtasks_ = migrationSubtasksBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse.getDefaultInstance()) return this;
      if (migrationSubtasksBuilder_ == null) {
        if (!other.migrationSubtasks_.isEmpty()) {
          if (migrationSubtasks_.isEmpty()) {
            migrationSubtasks_ = other.migrationSubtasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMigrationSubtasksIsMutable();
            migrationSubtasks_.addAll(other.migrationSubtasks_);
          }
          onChanged();
        }
      } else {
        if (!other.migrationSubtasks_.isEmpty()) {
          if (migrationSubtasksBuilder_.isEmpty()) {
            migrationSubtasksBuilder_.dispose();
            migrationSubtasksBuilder_ = null;
            migrationSubtasks_ = other.migrationSubtasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            migrationSubtasksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMigrationSubtasksFieldBuilder() : null;
          } else {
            migrationSubtasksBuilder_.addAllMessages(other.migrationSubtasks_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask m =
                  input.readMessage(
                      com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.parser(),
                      extensionRegistry);
              if (migrationSubtasksBuilder_ == null) {
                ensureMigrationSubtasksIsMutable();
                migrationSubtasks_.add(m);
              } else {
                migrationSubtasksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

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
    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> migrationSubtasks_ =
      java.util.Collections.emptyList();
    private void ensureMigrationSubtasksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        migrationSubtasks_ = new java.util.ArrayList<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask>(migrationSubtasks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder> migrationSubtasksBuilder_;

    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> getMigrationSubtasksList() {
      if (migrationSubtasksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(migrationSubtasks_);
      } else {
        return migrationSubtasksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public int getMigrationSubtasksCount() {
      if (migrationSubtasksBuilder_ == null) {
        return migrationSubtasks_.size();
      } else {
        return migrationSubtasksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask getMigrationSubtasks(int index) {
      if (migrationSubtasksBuilder_ == null) {
        return migrationSubtasks_.get(index);
      } else {
        return migrationSubtasksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder setMigrationSubtasks(
        int index, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask value) {
      if (migrationSubtasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.set(index, value);
        onChanged();
      } else {
        migrationSubtasksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder setMigrationSubtasks(
        int index, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder builderForValue) {
      if (migrationSubtasksBuilder_ == null) {
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.set(index, builderForValue.build());
        onChanged();
      } else {
        migrationSubtasksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder addMigrationSubtasks(com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask value) {
      if (migrationSubtasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.add(value);
        onChanged();
      } else {
        migrationSubtasksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder addMigrationSubtasks(
        int index, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask value) {
      if (migrationSubtasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.add(index, value);
        onChanged();
      } else {
        migrationSubtasksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder addMigrationSubtasks(
        com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder builderForValue) {
      if (migrationSubtasksBuilder_ == null) {
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.add(builderForValue.build());
        onChanged();
      } else {
        migrationSubtasksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder addMigrationSubtasks(
        int index, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder builderForValue) {
      if (migrationSubtasksBuilder_ == null) {
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.add(index, builderForValue.build());
        onChanged();
      } else {
        migrationSubtasksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder addAllMigrationSubtasks(
        java.lang.Iterable<? extends com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask> values) {
      if (migrationSubtasksBuilder_ == null) {
        ensureMigrationSubtasksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, migrationSubtasks_);
        onChanged();
      } else {
        migrationSubtasksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder clearMigrationSubtasks() {
      if (migrationSubtasksBuilder_ == null) {
        migrationSubtasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        migrationSubtasksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public Builder removeMigrationSubtasks(int index) {
      if (migrationSubtasksBuilder_ == null) {
        ensureMigrationSubtasksIsMutable();
        migrationSubtasks_.remove(index);
        onChanged();
      } else {
        migrationSubtasksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder getMigrationSubtasksBuilder(
        int index) {
      return getMigrationSubtasksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder getMigrationSubtasksOrBuilder(
        int index) {
      if (migrationSubtasksBuilder_ == null) {
        return migrationSubtasks_.get(index);  } else {
        return migrationSubtasksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder> 
         getMigrationSubtasksOrBuilderList() {
      if (migrationSubtasksBuilder_ != null) {
        return migrationSubtasksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(migrationSubtasks_);
      }
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder addMigrationSubtasksBuilder() {
      return getMigrationSubtasksFieldBuilder().addBuilder(
          com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.getDefaultInstance());
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder addMigrationSubtasksBuilder(
        int index) {
      return getMigrationSubtasksFieldBuilder().addBuilder(
          index, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.getDefaultInstance());
    }
    /**
     * <pre>
     * The migration subtasks for the specified task.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.migration.v2alpha.MigrationSubtask migration_subtasks = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder> 
         getMigrationSubtasksBuilderList() {
      return getMigrationSubtasksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder> 
        getMigrationSubtasksFieldBuilder() {
      if (migrationSubtasksBuilder_ == null) {
        migrationSubtasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtask.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationSubtaskOrBuilder>(
                migrationSubtasks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        migrationSubtasks_ = null;
      }
      return migrationSubtasksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse)
  private static final com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMigrationSubtasksResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMigrationSubtasksResponse>() {
    @java.lang.Override
    public ListMigrationSubtasksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMigrationSubtasksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMigrationSubtasksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.ListMigrationSubtasksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

