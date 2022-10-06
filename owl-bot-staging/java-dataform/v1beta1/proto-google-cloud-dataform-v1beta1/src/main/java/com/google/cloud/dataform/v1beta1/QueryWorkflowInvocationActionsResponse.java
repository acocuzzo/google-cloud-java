// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

/**
 * <pre>
 * `QueryWorkflowInvocationActions` response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse}
 */
public final class QueryWorkflowInvocationActionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)
    QueryWorkflowInvocationActionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryWorkflowInvocationActionsResponse.newBuilder() to construct.
  private QueryWorkflowInvocationActionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryWorkflowInvocationActionsResponse() {
    workflowInvocationActions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryWorkflowInvocationActionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_QueryWorkflowInvocationActionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_QueryWorkflowInvocationActionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.class, com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.Builder.class);
  }

  public static final int WORKFLOW_INVOCATION_ACTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction> workflowInvocationActions_;
  /**
   * <pre>
   * List of workflow invocation actions.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction> getWorkflowInvocationActionsList() {
    return workflowInvocationActions_;
  }
  /**
   * <pre>
   * List of workflow invocation actions.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder> 
      getWorkflowInvocationActionsOrBuilderList() {
    return workflowInvocationActions_;
  }
  /**
   * <pre>
   * List of workflow invocation actions.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
   */
  @java.lang.Override
  public int getWorkflowInvocationActionsCount() {
    return workflowInvocationActions_.size();
  }
  /**
   * <pre>
   * List of workflow invocation actions.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.WorkflowInvocationAction getWorkflowInvocationActions(int index) {
    return workflowInvocationActions_.get(index);
  }
  /**
   * <pre>
   * List of workflow invocation actions.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder getWorkflowInvocationActionsOrBuilder(
      int index) {
    return workflowInvocationActions_.get(index);
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
    for (int i = 0; i < workflowInvocationActions_.size(); i++) {
      output.writeMessage(1, workflowInvocationActions_.get(i));
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
    for (int i = 0; i < workflowInvocationActions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, workflowInvocationActions_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse other = (com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse) obj;

    if (!getWorkflowInvocationActionsList()
        .equals(other.getWorkflowInvocationActionsList())) return false;
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
    if (getWorkflowInvocationActionsCount() > 0) {
      hash = (37 * hash) + WORKFLOW_INVOCATION_ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflowInvocationActionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse prototype) {
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
   * `QueryWorkflowInvocationActions` response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)
      com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_QueryWorkflowInvocationActionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_QueryWorkflowInvocationActionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.class, com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (workflowInvocationActionsBuilder_ == null) {
        workflowInvocationActions_ = java.util.Collections.emptyList();
      } else {
        workflowInvocationActions_ = null;
        workflowInvocationActionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_QueryWorkflowInvocationActionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse build() {
      com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse buildPartial() {
      com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse result = new com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (workflowInvocationActionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          workflowInvocationActions_ = java.util.Collections.unmodifiableList(workflowInvocationActions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.workflowInvocationActions_ = workflowInvocationActions_;
      } else {
        result.workflowInvocationActions_ = workflowInvocationActionsBuilder_.build();
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
      if (other instanceof com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse other) {
      if (other == com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse.getDefaultInstance()) return this;
      if (workflowInvocationActionsBuilder_ == null) {
        if (!other.workflowInvocationActions_.isEmpty()) {
          if (workflowInvocationActions_.isEmpty()) {
            workflowInvocationActions_ = other.workflowInvocationActions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorkflowInvocationActionsIsMutable();
            workflowInvocationActions_.addAll(other.workflowInvocationActions_);
          }
          onChanged();
        }
      } else {
        if (!other.workflowInvocationActions_.isEmpty()) {
          if (workflowInvocationActionsBuilder_.isEmpty()) {
            workflowInvocationActionsBuilder_.dispose();
            workflowInvocationActionsBuilder_ = null;
            workflowInvocationActions_ = other.workflowInvocationActions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            workflowInvocationActionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorkflowInvocationActionsFieldBuilder() : null;
          } else {
            workflowInvocationActionsBuilder_.addAllMessages(other.workflowInvocationActions_);
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
              com.google.cloud.dataform.v1beta1.WorkflowInvocationAction m =
                  input.readMessage(
                      com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.parser(),
                      extensionRegistry);
              if (workflowInvocationActionsBuilder_ == null) {
                ensureWorkflowInvocationActionsIsMutable();
                workflowInvocationActions_.add(m);
              } else {
                workflowInvocationActionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction> workflowInvocationActions_ =
      java.util.Collections.emptyList();
    private void ensureWorkflowInvocationActionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        workflowInvocationActions_ = new java.util.ArrayList<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction>(workflowInvocationActions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataform.v1beta1.WorkflowInvocationAction, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder, com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder> workflowInvocationActionsBuilder_;

    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public java.util.List<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction> getWorkflowInvocationActionsList() {
      if (workflowInvocationActionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(workflowInvocationActions_);
      } else {
        return workflowInvocationActionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public int getWorkflowInvocationActionsCount() {
      if (workflowInvocationActionsBuilder_ == null) {
        return workflowInvocationActions_.size();
      } else {
        return workflowInvocationActionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public com.google.cloud.dataform.v1beta1.WorkflowInvocationAction getWorkflowInvocationActions(int index) {
      if (workflowInvocationActionsBuilder_ == null) {
        return workflowInvocationActions_.get(index);
      } else {
        return workflowInvocationActionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder setWorkflowInvocationActions(
        int index, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction value) {
      if (workflowInvocationActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.set(index, value);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder setWorkflowInvocationActions(
        int index, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder builderForValue) {
      if (workflowInvocationActionsBuilder_ == null) {
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.set(index, builderForValue.build());
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder addWorkflowInvocationActions(com.google.cloud.dataform.v1beta1.WorkflowInvocationAction value) {
      if (workflowInvocationActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.add(value);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder addWorkflowInvocationActions(
        int index, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction value) {
      if (workflowInvocationActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.add(index, value);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder addWorkflowInvocationActions(
        com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder builderForValue) {
      if (workflowInvocationActionsBuilder_ == null) {
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.add(builderForValue.build());
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder addWorkflowInvocationActions(
        int index, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder builderForValue) {
      if (workflowInvocationActionsBuilder_ == null) {
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.add(index, builderForValue.build());
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder addAllWorkflowInvocationActions(
        java.lang.Iterable<? extends com.google.cloud.dataform.v1beta1.WorkflowInvocationAction> values) {
      if (workflowInvocationActionsBuilder_ == null) {
        ensureWorkflowInvocationActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, workflowInvocationActions_);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder clearWorkflowInvocationActions() {
      if (workflowInvocationActionsBuilder_ == null) {
        workflowInvocationActions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public Builder removeWorkflowInvocationActions(int index) {
      if (workflowInvocationActionsBuilder_ == null) {
        ensureWorkflowInvocationActionsIsMutable();
        workflowInvocationActions_.remove(index);
        onChanged();
      } else {
        workflowInvocationActionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder getWorkflowInvocationActionsBuilder(
        int index) {
      return getWorkflowInvocationActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder getWorkflowInvocationActionsOrBuilder(
        int index) {
      if (workflowInvocationActionsBuilder_ == null) {
        return workflowInvocationActions_.get(index);  } else {
        return workflowInvocationActionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder> 
         getWorkflowInvocationActionsOrBuilderList() {
      if (workflowInvocationActionsBuilder_ != null) {
        return workflowInvocationActionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(workflowInvocationActions_);
      }
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder addWorkflowInvocationActionsBuilder() {
      return getWorkflowInvocationActionsFieldBuilder().addBuilder(
          com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.getDefaultInstance());
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder addWorkflowInvocationActionsBuilder(
        int index) {
      return getWorkflowInvocationActionsFieldBuilder().addBuilder(
          index, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.getDefaultInstance());
    }
    /**
     * <pre>
     * List of workflow invocation actions.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1beta1.WorkflowInvocationAction workflow_invocation_actions = 1;</code>
     */
    public java.util.List<com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder> 
         getWorkflowInvocationActionsBuilderList() {
      return getWorkflowInvocationActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataform.v1beta1.WorkflowInvocationAction, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder, com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder> 
        getWorkflowInvocationActionsFieldBuilder() {
      if (workflowInvocationActionsBuilder_ == null) {
        workflowInvocationActionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.WorkflowInvocationAction, com.google.cloud.dataform.v1beta1.WorkflowInvocationAction.Builder, com.google.cloud.dataform.v1beta1.WorkflowInvocationActionOrBuilder>(
                workflowInvocationActions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        workflowInvocationActions_ = null;
      }
      return workflowInvocationActionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse)
  private static final com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse();
  }

  public static com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWorkflowInvocationActionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryWorkflowInvocationActionsResponse>() {
    @java.lang.Override
    public QueryWorkflowInvocationActionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryWorkflowInvocationActionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWorkflowInvocationActionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.QueryWorkflowInvocationActionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

