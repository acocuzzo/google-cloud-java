// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * The returned list transfer run messages.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse}
 */
public final class ListTransferLogsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)
    ListTransferLogsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferLogsResponse.newBuilder() to construct.
  private ListTransferLogsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferLogsResponse() {
    transferMessages_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTransferLogsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferLogsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferLogsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.Builder.class);
  }

  public static final int TRANSFER_MESSAGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage> transferMessages_;
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage> getTransferMessagesList() {
    return transferMessages_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder> 
      getTransferMessagesOrBuilderList() {
    return transferMessages_;
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public int getTransferMessagesCount() {
    return transferMessages_.size();
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferMessage getTransferMessages(int index) {
    return transferMessages_.get(index);
  }
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder getTransferMessagesOrBuilder(
      int index) {
    return transferMessages_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `GetTransferRunLogRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `GetTransferRunLogRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
    for (int i = 0; i < transferMessages_.size(); i++) {
      output.writeMessage(1, transferMessages_.get(i));
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
    for (int i = 0; i < transferMessages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, transferMessages_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse other = (com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse) obj;

    if (!getTransferMessagesList()
        .equals(other.getTransferMessagesList())) return false;
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
    if (getTransferMessagesCount() > 0) {
      hash = (37 * hash) + TRANSFER_MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getTransferMessagesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse prototype) {
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
   * The returned list transfer run messages.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)
      com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferLogsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferLogsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (transferMessagesBuilder_ == null) {
        transferMessages_ = java.util.Collections.emptyList();
      } else {
        transferMessages_ = null;
        transferMessagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferLogsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse result = new com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse(this);
      int from_bitField0_ = bitField0_;
      if (transferMessagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          transferMessages_ = java.util.Collections.unmodifiableList(transferMessages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.transferMessages_ = transferMessages_;
      } else {
        result.transferMessages_ = transferMessagesBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.getDefaultInstance()) return this;
      if (transferMessagesBuilder_ == null) {
        if (!other.transferMessages_.isEmpty()) {
          if (transferMessages_.isEmpty()) {
            transferMessages_ = other.transferMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTransferMessagesIsMutable();
            transferMessages_.addAll(other.transferMessages_);
          }
          onChanged();
        }
      } else {
        if (!other.transferMessages_.isEmpty()) {
          if (transferMessagesBuilder_.isEmpty()) {
            transferMessagesBuilder_.dispose();
            transferMessagesBuilder_ = null;
            transferMessages_ = other.transferMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            transferMessagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTransferMessagesFieldBuilder() : null;
          } else {
            transferMessagesBuilder_.addAllMessages(other.transferMessages_);
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
              com.google.cloud.bigquery.datatransfer.v1.TransferMessage m =
                  input.readMessage(
                      com.google.cloud.bigquery.datatransfer.v1.TransferMessage.parser(),
                      extensionRegistry);
              if (transferMessagesBuilder_ == null) {
                ensureTransferMessagesIsMutable();
                transferMessages_.add(m);
              } else {
                transferMessagesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage> transferMessages_ =
      java.util.Collections.emptyList();
    private void ensureTransferMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transferMessages_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferMessage>(transferMessages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferMessage, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder> transferMessagesBuilder_;

    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage> getTransferMessagesList() {
      if (transferMessagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(transferMessages_);
      } else {
        return transferMessagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public int getTransferMessagesCount() {
      if (transferMessagesBuilder_ == null) {
        return transferMessages_.size();
      } else {
        return transferMessagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage getTransferMessages(int index) {
      if (transferMessagesBuilder_ == null) {
        return transferMessages_.get(index);
      } else {
        return transferMessagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setTransferMessages(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferMessage value) {
      if (transferMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferMessagesIsMutable();
        transferMessages_.set(index, value);
        onChanged();
      } else {
        transferMessagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setTransferMessages(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder builderForValue) {
      if (transferMessagesBuilder_ == null) {
        ensureTransferMessagesIsMutable();
        transferMessages_.set(index, builderForValue.build());
        onChanged();
      } else {
        transferMessagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTransferMessages(com.google.cloud.bigquery.datatransfer.v1.TransferMessage value) {
      if (transferMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferMessagesIsMutable();
        transferMessages_.add(value);
        onChanged();
      } else {
        transferMessagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTransferMessages(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferMessage value) {
      if (transferMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTransferMessagesIsMutable();
        transferMessages_.add(index, value);
        onChanged();
      } else {
        transferMessagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTransferMessages(
        com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder builderForValue) {
      if (transferMessagesBuilder_ == null) {
        ensureTransferMessagesIsMutable();
        transferMessages_.add(builderForValue.build());
        onChanged();
      } else {
        transferMessagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addTransferMessages(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder builderForValue) {
      if (transferMessagesBuilder_ == null) {
        ensureTransferMessagesIsMutable();
        transferMessages_.add(index, builderForValue.build());
        onChanged();
      } else {
        transferMessagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addAllTransferMessages(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.TransferMessage> values) {
      if (transferMessagesBuilder_ == null) {
        ensureTransferMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, transferMessages_);
        onChanged();
      } else {
        transferMessagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearTransferMessages() {
      if (transferMessagesBuilder_ == null) {
        transferMessages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        transferMessagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeTransferMessages(int index) {
      if (transferMessagesBuilder_ == null) {
        ensureTransferMessagesIsMutable();
        transferMessages_.remove(index);
        onChanged();
      } else {
        transferMessagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder getTransferMessagesBuilder(
        int index) {
      return getTransferMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder getTransferMessagesOrBuilder(
        int index) {
      if (transferMessagesBuilder_ == null) {
        return transferMessages_.get(index);  } else {
        return transferMessagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder> 
         getTransferMessagesOrBuilderList() {
      if (transferMessagesBuilder_ != null) {
        return transferMessagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(transferMessages_);
      }
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder addTransferMessagesBuilder() {
      return getTransferMessagesFieldBuilder().addBuilder(
          com.google.cloud.bigquery.datatransfer.v1.TransferMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder addTransferMessagesBuilder(
        int index) {
      return getTransferMessagesFieldBuilder().addBuilder(
          index, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. The stored pipeline transfer messages.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder> 
         getTransferMessagesBuilderList() {
      return getTransferMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.TransferMessage, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder> 
        getTransferMessagesFieldBuilder() {
      if (transferMessagesBuilder_ == null) {
        transferMessagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.TransferMessage, com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder>(
                transferMessages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        transferMessages_ = null;
      }
      return transferMessagesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `GetTransferRunLogRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `GetTransferRunLogRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `GetTransferRunLogRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `GetTransferRunLogRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The next-pagination token. For multiple-page list results,
     * this token can be used as the
     * `GetTransferRunLogRequest.page_token`
     * to request the next page of list results.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferLogsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferLogsResponse>() {
    @java.lang.Override
    public ListTransferLogsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTransferLogsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferLogsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

