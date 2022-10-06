// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

/**
 * <pre>
 * Request message for listing tasks using [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.ListTasksRequest}
 */
public final class ListTasksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.ListTasksRequest)
    ListTasksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTasksRequest.newBuilder() to construct.
  private ListTasksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTasksRequest() {
    parent_ = "";
    responseView_ = 0;
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTasksRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto.internal_static_google_cloud_tasks_v2beta2_ListTasksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto.internal_static_google_cloud_tasks_v2beta2_ListTasksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.ListTasksRequest.class, com.google.cloud.tasks.v2beta2.ListTasksRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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

  public static final int RESPONSE_VIEW_FIELD_NUMBER = 2;
  private int responseView_;
  /**
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   * @return The enum numeric value on the wire for responseView.
   */
  @java.lang.Override public int getResponseViewValue() {
    return responseView_;
  }
  /**
   * <pre>
   * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
   * returned.
   * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
   * information is retrieved by default because some data, such as
   * payloads, might be desirable to return only when needed because
   * of its large size or because of the sensitivity of data that it
   * contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
   * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
   * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   * @return The responseView.
   */
  @java.lang.Override public com.google.cloud.tasks.v2beta2.Task.View getResponseView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.tasks.v2beta2.Task.View result = com.google.cloud.tasks.v2beta2.Task.View.valueOf(responseView_);
    return result == null ? com.google.cloud.tasks.v2beta2.Task.View.UNRECOGNIZED : result;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private int pageSize_;
  /**
   * <pre>
   * Maximum page size.
   * Fewer tasks than requested might be returned, even if more tasks exist; use
   * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] in the response to
   * determine if more tasks exist.
   * The maximum page size is 1000. If unspecified, the page size will be the
   * maximum.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 5;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
   * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
   * method.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
   * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
   * method.
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (responseView_ != com.google.cloud.tasks.v2beta2.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, responseView_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, pageToken_);
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
    if (responseView_ != com.google.cloud.tasks.v2beta2.Task.View.VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, responseView_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, pageToken_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.ListTasksRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.ListTasksRequest other = (com.google.cloud.tasks.v2beta2.ListTasksRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (responseView_ != other.responseView_) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
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
    hash = (37 * hash) + RESPONSE_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + responseView_;
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta2.ListTasksRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.ListTasksRequest prototype) {
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
   * Request message for listing tasks using [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.ListTasksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.ListTasksRequest)
      com.google.cloud.tasks.v2beta2.ListTasksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto.internal_static_google_cloud_tasks_v2beta2_ListTasksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto.internal_static_google_cloud_tasks_v2beta2_ListTasksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.ListTasksRequest.class, com.google.cloud.tasks.v2beta2.ListTasksRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.ListTasksRequest.newBuilder()
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

      responseView_ = 0;

      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto.internal_static_google_cloud_tasks_v2beta2_ListTasksRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListTasksRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.ListTasksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListTasksRequest build() {
      com.google.cloud.tasks.v2beta2.ListTasksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListTasksRequest buildPartial() {
      com.google.cloud.tasks.v2beta2.ListTasksRequest result = new com.google.cloud.tasks.v2beta2.ListTasksRequest(this);
      result.parent_ = parent_;
      result.responseView_ = responseView_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
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
      if (other instanceof com.google.cloud.tasks.v2beta2.ListTasksRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.ListTasksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.ListTasksRequest other) {
      if (other == com.google.cloud.tasks.v2beta2.ListTasksRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.responseView_ != 0) {
        setResponseViewValue(other.getResponseViewValue());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              responseView_ = input.readEnum();

              break;
            } // case 16
            case 32: {
              pageSize_ = input.readInt32();

              break;
            } // case 32
            case 42: {
              pageToken_ = input.readStringRequireUtf8();

              break;
            } // case 42
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
     * Required. The queue name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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
     * Required. The queue name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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
     * Required. The queue name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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
     * Required. The queue name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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
     * Required. The queue name. For example:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
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

    private int responseView_ = 0;
    /**
     * <pre>
     * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
     * returned.
     * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
     * information is retrieved by default because some data, such as
     * payloads, might be desirable to return only when needed because
     * of its large size or because of the sensitivity of data that it
     * contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
     * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
     * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     * @return The enum numeric value on the wire for responseView.
     */
    @java.lang.Override public int getResponseViewValue() {
      return responseView_;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
     * returned.
     * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
     * information is retrieved by default because some data, such as
     * payloads, might be desirable to return only when needed because
     * of its large size or because of the sensitivity of data that it
     * contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
     * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
     * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     * @param value The enum numeric value on the wire for responseView to set.
     * @return This builder for chaining.
     */
    public Builder setResponseViewValue(int value) {
      
      responseView_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
     * returned.
     * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
     * information is retrieved by default because some data, such as
     * payloads, might be desirable to return only when needed because
     * of its large size or because of the sensitivity of data that it
     * contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
     * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
     * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     * @return The responseView.
     */
    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.Task.View getResponseView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.tasks.v2beta2.Task.View result = com.google.cloud.tasks.v2beta2.Task.View.valueOf(responseView_);
      return result == null ? com.google.cloud.tasks.v2beta2.Task.View.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
     * returned.
     * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
     * information is retrieved by default because some data, such as
     * payloads, might be desirable to return only when needed because
     * of its large size or because of the sensitivity of data that it
     * contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
     * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
     * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     * @param value The responseView to set.
     * @return This builder for chaining.
     */
    public Builder setResponseView(com.google.cloud.tasks.v2beta2.Task.View value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseView_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response_view specifies which subset of the [Task][google.cloud.tasks.v2beta2.Task] will be
     * returned.
     * By default response_view is [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all
     * information is retrieved by default because some data, such as
     * payloads, might be desirable to return only when needed because
     * of its large size or because of the sensitivity of data that it
     * contains.
     * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL] requires
     * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
     * permission on the [Task][google.cloud.tasks.v2beta2.Task] resource.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseView() {
      
      responseView_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * Maximum page size.
     * Fewer tasks than requested might be returned, even if more tasks exist; use
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] in the response to
     * determine if more tasks exist.
     * The maximum page size is 1000. If unspecified, the page size will be the
     * maximum.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Maximum page size.
     * Fewer tasks than requested might be returned, even if more tasks exist; use
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] in the response to
     * determine if more tasks exist.
     * The maximum page size is 1000. If unspecified, the page size will be the
     * maximum.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum page size.
     * Fewer tasks than requested might be returned, even if more tasks exist; use
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] in the response to
     * determine if more tasks exist.
     * The maximum page size is 1000. If unspecified, the page size will be the
     * maximum.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * A token identifying the page of results to return.
     * To request the first page results, page_token must be empty. To
     * request the next page of results, page_token must be the value of
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
     * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
     * method.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string page_token = 5;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token identifying the page of results to return.
     * To request the first page results, page_token must be empty. To
     * request the next page of results, page_token must be the value of
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
     * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
     * method.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string page_token = 5;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token identifying the page of results to return.
     * To request the first page results, page_token must be empty. To
     * request the next page of results, page_token must be the value of
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
     * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
     * method.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string page_token = 5;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token identifying the page of results to return.
     * To request the first page results, page_token must be empty. To
     * request the next page of results, page_token must be the value of
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
     * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
     * method.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string page_token = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token identifying the page of results to return.
     * To request the first page results, page_token must be empty. To
     * request the next page of results, page_token must be the value of
     * [next_page_token][google.cloud.tasks.v2beta2.ListTasksResponse.next_page_token] returned
     * from the previous call to [ListTasks][google.cloud.tasks.v2beta2.CloudTasks.ListTasks]
     * method.
     * The page token is valid for only 2 hours.
     * </pre>
     *
     * <code>string page_token = 5;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.ListTasksRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.ListTasksRequest)
  private static final com.google.cloud.tasks.v2beta2.ListTasksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.ListTasksRequest();
  }

  public static com.google.cloud.tasks.v2beta2.ListTasksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTasksRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListTasksRequest>() {
    @java.lang.Override
    public ListTasksRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTasksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTasksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.ListTasksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

