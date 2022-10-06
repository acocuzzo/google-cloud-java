// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/migration_service.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 * <pre>
 * Request to create a migration workflow resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest}
 */
public final class CreateMigrationWorkflowRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)
    CreateMigrationWorkflowRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMigrationWorkflowRequest.newBuilder() to construct.
  private CreateMigrationWorkflowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMigrationWorkflowRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMigrationWorkflowRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_CreateMigrationWorkflowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_CreateMigrationWorkflowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.class, com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the project to which this migration workflow belongs.
   * Example: `projects/foo/locations/bar`
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
   * Required. The name of the project to which this migration workflow belongs.
   * Example: `projects/foo/locations/bar`
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

  public static final int MIGRATION_WORKFLOW_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migrationWorkflow_;
  /**
   * <pre>
   * Required. The migration workflow to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the migrationWorkflow field is set.
   */
  @java.lang.Override
  public boolean hasMigrationWorkflow() {
    return migrationWorkflow_ != null;
  }
  /**
   * <pre>
   * Required. The migration workflow to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The migrationWorkflow.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow getMigrationWorkflow() {
    return migrationWorkflow_ == null ? com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.getDefaultInstance() : migrationWorkflow_;
  }
  /**
   * <pre>
   * Required. The migration workflow to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowOrBuilder getMigrationWorkflowOrBuilder() {
    return getMigrationWorkflow();
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
    if (migrationWorkflow_ != null) {
      output.writeMessage(2, getMigrationWorkflow());
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
    if (migrationWorkflow_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMigrationWorkflow());
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest other = (com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasMigrationWorkflow() != other.hasMigrationWorkflow()) return false;
    if (hasMigrationWorkflow()) {
      if (!getMigrationWorkflow()
          .equals(other.getMigrationWorkflow())) return false;
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
    if (hasMigrationWorkflow()) {
      hash = (37 * hash) + MIGRATION_WORKFLOW_FIELD_NUMBER;
      hash = (53 * hash) + getMigrationWorkflow().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest prototype) {
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
   * Request to create a migration workflow resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)
      com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_CreateMigrationWorkflowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_CreateMigrationWorkflowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.class, com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.newBuilder()
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

      if (migrationWorkflowBuilder_ == null) {
        migrationWorkflow_ = null;
      } else {
        migrationWorkflow_ = null;
        migrationWorkflowBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationServiceProto.internal_static_google_cloud_bigquery_migration_v2alpha_CreateMigrationWorkflowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest build() {
      com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest result = new com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest(this);
      result.parent_ = parent_;
      if (migrationWorkflowBuilder_ == null) {
        result.migrationWorkflow_ = migrationWorkflow_;
      } else {
        result.migrationWorkflow_ = migrationWorkflowBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest other) {
      if (other == com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasMigrationWorkflow()) {
        mergeMigrationWorkflow(other.getMigrationWorkflow());
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
                  getMigrationWorkflowFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the project to which this migration workflow belongs.
     * Example: `projects/foo/locations/bar`
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
     * Required. The name of the project to which this migration workflow belongs.
     * Example: `projects/foo/locations/bar`
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
     * Required. The name of the project to which this migration workflow belongs.
     * Example: `projects/foo/locations/bar`
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
     * Required. The name of the project to which this migration workflow belongs.
     * Example: `projects/foo/locations/bar`
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
     * Required. The name of the project to which this migration workflow belongs.
     * Example: `projects/foo/locations/bar`
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

    private com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migrationWorkflow_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowOrBuilder> migrationWorkflowBuilder_;
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the migrationWorkflow field is set.
     */
    public boolean hasMigrationWorkflow() {
      return migrationWorkflowBuilder_ != null || migrationWorkflow_ != null;
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The migrationWorkflow.
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow getMigrationWorkflow() {
      if (migrationWorkflowBuilder_ == null) {
        return migrationWorkflow_ == null ? com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.getDefaultInstance() : migrationWorkflow_;
      } else {
        return migrationWorkflowBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMigrationWorkflow(com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow value) {
      if (migrationWorkflowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        migrationWorkflow_ = value;
        onChanged();
      } else {
        migrationWorkflowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMigrationWorkflow(
        com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.Builder builderForValue) {
      if (migrationWorkflowBuilder_ == null) {
        migrationWorkflow_ = builderForValue.build();
        onChanged();
      } else {
        migrationWorkflowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMigrationWorkflow(com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow value) {
      if (migrationWorkflowBuilder_ == null) {
        if (migrationWorkflow_ != null) {
          migrationWorkflow_ =
            com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.newBuilder(migrationWorkflow_).mergeFrom(value).buildPartial();
        } else {
          migrationWorkflow_ = value;
        }
        onChanged();
      } else {
        migrationWorkflowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMigrationWorkflow() {
      if (migrationWorkflowBuilder_ == null) {
        migrationWorkflow_ = null;
        onChanged();
      } else {
        migrationWorkflow_ = null;
        migrationWorkflowBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.Builder getMigrationWorkflowBuilder() {
      
      onChanged();
      return getMigrationWorkflowFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowOrBuilder getMigrationWorkflowOrBuilder() {
      if (migrationWorkflowBuilder_ != null) {
        return migrationWorkflowBuilder_.getMessageOrBuilder();
      } else {
        return migrationWorkflow_ == null ?
            com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.getDefaultInstance() : migrationWorkflow_;
      }
    }
    /**
     * <pre>
     * Required. The migration workflow to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow migration_workflow = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowOrBuilder> 
        getMigrationWorkflowFieldBuilder() {
      if (migrationWorkflowBuilder_ == null) {
        migrationWorkflowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflow.Builder, com.google.cloud.bigquery.migration.v2alpha.MigrationWorkflowOrBuilder>(
                getMigrationWorkflow(),
                getParentForChildren(),
                isClean());
        migrationWorkflow_ = null;
      }
      return migrationWorkflowBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest)
  private static final com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMigrationWorkflowRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateMigrationWorkflowRequest>() {
    @java.lang.Override
    public CreateMigrationWorkflowRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMigrationWorkflowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMigrationWorkflowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.CreateMigrationWorkflowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

