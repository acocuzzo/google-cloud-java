// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 * <pre>
 * The response to a `ListRelatedAccountGroups` call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse}
 */
public final class ListRelatedAccountGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
    ListRelatedAccountGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRelatedAccountGroupsResponse.newBuilder() to construct.
  private ListRelatedAccountGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRelatedAccountGroupsResponse() {
    relatedAccountGroups_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRelatedAccountGroupsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ListRelatedAccountGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ListRelatedAccountGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.class, com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.Builder.class);
  }

  public static final int RELATED_ACCOUNT_GROUPS_FIELD_NUMBER = 1;
  private java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup> relatedAccountGroups_;
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup> getRelatedAccountGroupsList() {
    return relatedAccountGroups_;
  }
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder> 
      getRelatedAccountGroupsOrBuilderList() {
    return relatedAccountGroups_;
  }
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  @java.lang.Override
  public int getRelatedAccountGroupsCount() {
    return relatedAccountGroups_.size();
  }
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RelatedAccountGroup getRelatedAccountGroups(int index) {
    return relatedAccountGroups_.get(index);
  }
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder getRelatedAccountGroupsOrBuilder(
      int index) {
    return relatedAccountGroups_.get(index);
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
    for (int i = 0; i < relatedAccountGroups_.size(); i++) {
      output.writeMessage(1, relatedAccountGroups_.get(i));
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
    for (int i = 0; i < relatedAccountGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, relatedAccountGroups_.get(i));
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse other = (com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse) obj;

    if (!getRelatedAccountGroupsList()
        .equals(other.getRelatedAccountGroupsList())) return false;
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
    if (getRelatedAccountGroupsCount() > 0) {
      hash = (37 * hash) + RELATED_ACCOUNT_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getRelatedAccountGroupsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse prototype) {
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
   * The response to a `ListRelatedAccountGroups` call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
      com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ListRelatedAccountGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ListRelatedAccountGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.class, com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (relatedAccountGroupsBuilder_ == null) {
        relatedAccountGroups_ = java.util.Collections.emptyList();
      } else {
        relatedAccountGroups_ = null;
        relatedAccountGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ListRelatedAccountGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse build() {
      com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse buildPartial() {
      com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse result = new com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse(this);
      int from_bitField0_ = bitField0_;
      if (relatedAccountGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          relatedAccountGroups_ = java.util.Collections.unmodifiableList(relatedAccountGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.relatedAccountGroups_ = relatedAccountGroups_;
      } else {
        result.relatedAccountGroups_ = relatedAccountGroupsBuilder_.build();
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
      if (other instanceof com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse) {
        return mergeFrom((com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse other) {
      if (other == com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse.getDefaultInstance()) return this;
      if (relatedAccountGroupsBuilder_ == null) {
        if (!other.relatedAccountGroups_.isEmpty()) {
          if (relatedAccountGroups_.isEmpty()) {
            relatedAccountGroups_ = other.relatedAccountGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRelatedAccountGroupsIsMutable();
            relatedAccountGroups_.addAll(other.relatedAccountGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.relatedAccountGroups_.isEmpty()) {
          if (relatedAccountGroupsBuilder_.isEmpty()) {
            relatedAccountGroupsBuilder_.dispose();
            relatedAccountGroupsBuilder_ = null;
            relatedAccountGroups_ = other.relatedAccountGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            relatedAccountGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRelatedAccountGroupsFieldBuilder() : null;
          } else {
            relatedAccountGroupsBuilder_.addAllMessages(other.relatedAccountGroups_);
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
              com.google.recaptchaenterprise.v1.RelatedAccountGroup m =
                  input.readMessage(
                      com.google.recaptchaenterprise.v1.RelatedAccountGroup.parser(),
                      extensionRegistry);
              if (relatedAccountGroupsBuilder_ == null) {
                ensureRelatedAccountGroupsIsMutable();
                relatedAccountGroups_.add(m);
              } else {
                relatedAccountGroupsBuilder_.addMessage(m);
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

    private java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup> relatedAccountGroups_ =
      java.util.Collections.emptyList();
    private void ensureRelatedAccountGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        relatedAccountGroups_ = new java.util.ArrayList<com.google.recaptchaenterprise.v1.RelatedAccountGroup>(relatedAccountGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.recaptchaenterprise.v1.RelatedAccountGroup, com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder, com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder> relatedAccountGroupsBuilder_;

    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup> getRelatedAccountGroupsList() {
      if (relatedAccountGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relatedAccountGroups_);
      } else {
        return relatedAccountGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public int getRelatedAccountGroupsCount() {
      if (relatedAccountGroupsBuilder_ == null) {
        return relatedAccountGroups_.size();
      } else {
        return relatedAccountGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.RelatedAccountGroup getRelatedAccountGroups(int index) {
      if (relatedAccountGroupsBuilder_ == null) {
        return relatedAccountGroups_.get(index);
      } else {
        return relatedAccountGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder setRelatedAccountGroups(
        int index, com.google.recaptchaenterprise.v1.RelatedAccountGroup value) {
      if (relatedAccountGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.set(index, value);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder setRelatedAccountGroups(
        int index, com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder builderForValue) {
      if (relatedAccountGroupsBuilder_ == null) {
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder addRelatedAccountGroups(com.google.recaptchaenterprise.v1.RelatedAccountGroup value) {
      if (relatedAccountGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.add(value);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder addRelatedAccountGroups(
        int index, com.google.recaptchaenterprise.v1.RelatedAccountGroup value) {
      if (relatedAccountGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.add(index, value);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder addRelatedAccountGroups(
        com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder builderForValue) {
      if (relatedAccountGroupsBuilder_ == null) {
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.add(builderForValue.build());
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder addRelatedAccountGroups(
        int index, com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder builderForValue) {
      if (relatedAccountGroupsBuilder_ == null) {
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder addAllRelatedAccountGroups(
        java.lang.Iterable<? extends com.google.recaptchaenterprise.v1.RelatedAccountGroup> values) {
      if (relatedAccountGroupsBuilder_ == null) {
        ensureRelatedAccountGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, relatedAccountGroups_);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder clearRelatedAccountGroups() {
      if (relatedAccountGroupsBuilder_ == null) {
        relatedAccountGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public Builder removeRelatedAccountGroups(int index) {
      if (relatedAccountGroupsBuilder_ == null) {
        ensureRelatedAccountGroupsIsMutable();
        relatedAccountGroups_.remove(index);
        onChanged();
      } else {
        relatedAccountGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder getRelatedAccountGroupsBuilder(
        int index) {
      return getRelatedAccountGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder getRelatedAccountGroupsOrBuilder(
        int index) {
      if (relatedAccountGroupsBuilder_ == null) {
        return relatedAccountGroups_.get(index);  } else {
        return relatedAccountGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public java.util.List<? extends com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder> 
         getRelatedAccountGroupsOrBuilderList() {
      if (relatedAccountGroupsBuilder_ != null) {
        return relatedAccountGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relatedAccountGroups_);
      }
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder addRelatedAccountGroupsBuilder() {
      return getRelatedAccountGroupsFieldBuilder().addBuilder(
          com.google.recaptchaenterprise.v1.RelatedAccountGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder addRelatedAccountGroupsBuilder(
        int index) {
      return getRelatedAccountGroupsFieldBuilder().addBuilder(
          index, com.google.recaptchaenterprise.v1.RelatedAccountGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * The groups of related accounts listed by the query.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
     */
    public java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder> 
         getRelatedAccountGroupsBuilderList() {
      return getRelatedAccountGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.recaptchaenterprise.v1.RelatedAccountGroup, com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder, com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder> 
        getRelatedAccountGroupsFieldBuilder() {
      if (relatedAccountGroupsBuilder_ == null) {
        relatedAccountGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.recaptchaenterprise.v1.RelatedAccountGroup, com.google.recaptchaenterprise.v1.RelatedAccountGroup.Builder, com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder>(
                relatedAccountGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        relatedAccountGroups_ = null;
      }
      return relatedAccountGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
  private static final com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse();
  }

  public static com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRelatedAccountGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRelatedAccountGroupsResponse>() {
    @java.lang.Override
    public ListRelatedAccountGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRelatedAccountGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRelatedAccountGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

