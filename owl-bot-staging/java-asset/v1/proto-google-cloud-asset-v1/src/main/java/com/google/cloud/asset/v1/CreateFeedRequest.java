// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 * <pre>
 * Create asset feed request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.CreateFeedRequest}
 */
public final class CreateFeedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.CreateFeedRequest)
    CreateFeedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFeedRequest.newBuilder() to construct.
  private CreateFeedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFeedRequest() {
    parent_ = "";
    feedId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFeedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateFeedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateFeedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.CreateFeedRequest.class, com.google.cloud.asset.v1.CreateFeedRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the project/folder/organization where this feed
   * should be created in. It can only be an organization number (such as
   * "organizations/123"), a folder number (such as "folders/123"), a project ID
   * (such as "projects/my-project-id")", or a project number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The name of the project/folder/organization where this feed
   * should be created in. It can only be an organization number (such as
   * "organizations/123"), a folder number (such as "folders/123"), a project ID
   * (such as "projects/my-project-id")", or a project number (such as
   * "projects/12345").
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int FEED_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object feedId_;
  /**
   * <pre>
   * Required. This is the client-assigned asset feed identifier and it needs to
   * be unique under a specific parent project/folder/organization.
   * </pre>
   *
   * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The feedId.
   */
  @java.lang.Override
  public java.lang.String getFeedId() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      feedId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. This is the client-assigned asset feed identifier and it needs to
   * be unique under a specific parent project/folder/organization.
   * </pre>
   *
   * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for feedId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFeedIdBytes() {
    java.lang.Object ref = feedId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      feedId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEED_FIELD_NUMBER = 3;
  private com.google.cloud.asset.v1.Feed feed_;
  /**
   * <pre>
   * Required. The feed details. The field `name` must be empty and it will be generated
   * in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the feed field is set.
   */
  @java.lang.Override
  public boolean hasFeed() {
    return feed_ != null;
  }
  /**
   * <pre>
   * Required. The feed details. The field `name` must be empty and it will be generated
   * in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The feed.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.Feed getFeed() {
    return feed_ == null ? com.google.cloud.asset.v1.Feed.getDefaultInstance() : feed_;
  }
  /**
   * <pre>
   * Required. The feed details. The field `name` must be empty and it will be generated
   * in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.FeedOrBuilder getFeedOrBuilder() {
    return getFeed();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feedId_);
    }
    if (feed_ != null) {
      output.writeMessage(3, getFeed());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feedId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feedId_);
    }
    if (feed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFeed());
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
    if (!(obj instanceof com.google.cloud.asset.v1.CreateFeedRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.CreateFeedRequest other = (com.google.cloud.asset.v1.CreateFeedRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getFeedId()
        .equals(other.getFeedId())) return false;
    if (hasFeed() != other.hasFeed()) return false;
    if (hasFeed()) {
      if (!getFeed()
          .equals(other.getFeed())) return false;
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
    hash = (37 * hash) + FEED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFeedId().hashCode();
    if (hasFeed()) {
      hash = (37 * hash) + FEED_FIELD_NUMBER;
      hash = (53 * hash) + getFeed().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.asset.v1.CreateFeedRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.asset.v1.CreateFeedRequest prototype) {
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
   * Create asset feed request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.CreateFeedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.CreateFeedRequest)
      com.google.cloud.asset.v1.CreateFeedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateFeedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateFeedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.CreateFeedRequest.class, com.google.cloud.asset.v1.CreateFeedRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.CreateFeedRequest.newBuilder()
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

      feedId_ = "";

      if (feedBuilder_ == null) {
        feed_ = null;
      } else {
        feed_ = null;
        feedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto.internal_static_google_cloud_asset_v1_CreateFeedRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateFeedRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.CreateFeedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateFeedRequest build() {
      com.google.cloud.asset.v1.CreateFeedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.CreateFeedRequest buildPartial() {
      com.google.cloud.asset.v1.CreateFeedRequest result = new com.google.cloud.asset.v1.CreateFeedRequest(this);
      result.parent_ = parent_;
      result.feedId_ = feedId_;
      if (feedBuilder_ == null) {
        result.feed_ = feed_;
      } else {
        result.feed_ = feedBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1.CreateFeedRequest) {
        return mergeFrom((com.google.cloud.asset.v1.CreateFeedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.CreateFeedRequest other) {
      if (other == com.google.cloud.asset.v1.CreateFeedRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getFeedId().isEmpty()) {
        feedId_ = other.feedId_;
        onChanged();
      }
      if (other.hasFeed()) {
        mergeFeed(other.getFeed());
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
              feedId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFeedFieldBuilder().getBuilder(),
                  extensionRegistry);

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
     * Required. The name of the project/folder/organization where this feed
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project/folder/organization where this feed
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project/folder/organization where this feed
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The name of the project/folder/organization where this feed
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the project/folder/organization where this feed
     * should be created in. It can only be an organization number (such as
     * "organizations/123"), a folder number (such as "folders/123"), a project ID
     * (such as "projects/my-project-id")", or a project number (such as
     * "projects/12345").
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private java.lang.Object feedId_ = "";
    /**
     * <pre>
     * Required. This is the client-assigned asset feed identifier and it needs to
     * be unique under a specific parent project/folder/organization.
     * </pre>
     *
     * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The feedId.
     */
    public java.lang.String getFeedId() {
      java.lang.Object ref = feedId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feedId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. This is the client-assigned asset feed identifier and it needs to
     * be unique under a specific parent project/folder/organization.
     * </pre>
     *
     * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for feedId.
     */
    public com.google.protobuf.ByteString
        getFeedIdBytes() {
      java.lang.Object ref = feedId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feedId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. This is the client-assigned asset feed identifier and it needs to
     * be unique under a specific parent project/folder/organization.
     * </pre>
     *
     * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      feedId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is the client-assigned asset feed identifier and it needs to
     * be unique under a specific parent project/folder/organization.
     * </pre>
     *
     * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedId() {
      
      feedId_ = getDefaultInstance().getFeedId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. This is the client-assigned asset feed identifier and it needs to
     * be unique under a specific parent project/folder/organization.
     * </pre>
     *
     * <code>string feed_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for feedId to set.
     * @return This builder for chaining.
     */
    public Builder setFeedIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      feedId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.asset.v1.Feed feed_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder> feedBuilder_;
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the feed field is set.
     */
    public boolean hasFeed() {
      return feedBuilder_ != null || feed_ != null;
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The feed.
     */
    public com.google.cloud.asset.v1.Feed getFeed() {
      if (feedBuilder_ == null) {
        return feed_ == null ? com.google.cloud.asset.v1.Feed.getDefaultInstance() : feed_;
      } else {
        return feedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFeed(com.google.cloud.asset.v1.Feed value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feed_ = value;
        onChanged();
      } else {
        feedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFeed(
        com.google.cloud.asset.v1.Feed.Builder builderForValue) {
      if (feedBuilder_ == null) {
        feed_ = builderForValue.build();
        onChanged();
      } else {
        feedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFeed(com.google.cloud.asset.v1.Feed value) {
      if (feedBuilder_ == null) {
        if (feed_ != null) {
          feed_ =
            com.google.cloud.asset.v1.Feed.newBuilder(feed_).mergeFrom(value).buildPartial();
        } else {
          feed_ = value;
        }
        onChanged();
      } else {
        feedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFeed() {
      if (feedBuilder_ == null) {
        feed_ = null;
        onChanged();
      } else {
        feed_ = null;
        feedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1.Feed.Builder getFeedBuilder() {
      
      onChanged();
      return getFeedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.asset.v1.FeedOrBuilder getFeedOrBuilder() {
      if (feedBuilder_ != null) {
        return feedBuilder_.getMessageOrBuilder();
      } else {
        return feed_ == null ?
            com.google.cloud.asset.v1.Feed.getDefaultInstance() : feed_;
      }
    }
    /**
     * <pre>
     * Required. The feed details. The field `name` must be empty and it will be generated
     * in the format of:
     * projects/project_number/feeds/feed_id
     * folders/folder_number/feeds/feed_id
     * organizations/organization_number/feeds/feed_id
     * </pre>
     *
     * <code>.google.cloud.asset.v1.Feed feed = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder> 
        getFeedFieldBuilder() {
      if (feedBuilder_ == null) {
        feedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.Feed, com.google.cloud.asset.v1.Feed.Builder, com.google.cloud.asset.v1.FeedOrBuilder>(
                getFeed(),
                getParentForChildren(),
                isClean());
        feed_ = null;
      }
      return feedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.CreateFeedRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.CreateFeedRequest)
  private static final com.google.cloud.asset.v1.CreateFeedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.CreateFeedRequest();
  }

  public static com.google.cloud.asset.v1.CreateFeedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFeedRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFeedRequest>() {
    @java.lang.Override
    public CreateFeedRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFeedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFeedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.CreateFeedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

