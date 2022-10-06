// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * Response containing the objects for a stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.ListStreamObjectsResponse}
 */
public final class ListStreamObjectsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.ListStreamObjectsResponse)
    ListStreamObjectsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListStreamObjectsResponse.newBuilder() to construct.
  private ListStreamObjectsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListStreamObjectsResponse() {
    streamObjects_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListStreamObjectsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_ListStreamObjectsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_ListStreamObjectsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.ListStreamObjectsResponse.class, com.google.cloud.datastream.v1.ListStreamObjectsResponse.Builder.class);
  }

  public static final int STREAM_OBJECTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datastream.v1.StreamObject> streamObjects_;
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1.StreamObject> getStreamObjectsList() {
    return streamObjects_;
  }
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1.StreamObjectOrBuilder> 
      getStreamObjectsOrBuilderList() {
    return streamObjects_;
  }
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  @java.lang.Override
  public int getStreamObjectsCount() {
    return streamObjects_.size();
  }
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.StreamObject getStreamObjects(int index) {
    return streamObjects_.get(index);
  }
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.StreamObjectOrBuilder getStreamObjectsOrBuilder(
      int index) {
    return streamObjects_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
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
    for (int i = 0; i < streamObjects_.size(); i++) {
      output.writeMessage(1, streamObjects_.get(i));
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
    for (int i = 0; i < streamObjects_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, streamObjects_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1.ListStreamObjectsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.ListStreamObjectsResponse other = (com.google.cloud.datastream.v1.ListStreamObjectsResponse) obj;

    if (!getStreamObjectsList()
        .equals(other.getStreamObjectsList())) return false;
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
    if (getStreamObjectsCount() > 0) {
      hash = (37 * hash) + STREAM_OBJECTS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamObjectsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.ListStreamObjectsResponse prototype) {
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
   * Response containing the objects for a stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.ListStreamObjectsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.ListStreamObjectsResponse)
      com.google.cloud.datastream.v1.ListStreamObjectsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_ListStreamObjectsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_ListStreamObjectsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.ListStreamObjectsResponse.class, com.google.cloud.datastream.v1.ListStreamObjectsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.ListStreamObjectsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (streamObjectsBuilder_ == null) {
        streamObjects_ = java.util.Collections.emptyList();
      } else {
        streamObjects_ = null;
        streamObjectsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_ListStreamObjectsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ListStreamObjectsResponse getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.ListStreamObjectsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ListStreamObjectsResponse build() {
      com.google.cloud.datastream.v1.ListStreamObjectsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ListStreamObjectsResponse buildPartial() {
      com.google.cloud.datastream.v1.ListStreamObjectsResponse result = new com.google.cloud.datastream.v1.ListStreamObjectsResponse(this);
      int from_bitField0_ = bitField0_;
      if (streamObjectsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          streamObjects_ = java.util.Collections.unmodifiableList(streamObjects_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.streamObjects_ = streamObjects_;
      } else {
        result.streamObjects_ = streamObjectsBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1.ListStreamObjectsResponse) {
        return mergeFrom((com.google.cloud.datastream.v1.ListStreamObjectsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.ListStreamObjectsResponse other) {
      if (other == com.google.cloud.datastream.v1.ListStreamObjectsResponse.getDefaultInstance()) return this;
      if (streamObjectsBuilder_ == null) {
        if (!other.streamObjects_.isEmpty()) {
          if (streamObjects_.isEmpty()) {
            streamObjects_ = other.streamObjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStreamObjectsIsMutable();
            streamObjects_.addAll(other.streamObjects_);
          }
          onChanged();
        }
      } else {
        if (!other.streamObjects_.isEmpty()) {
          if (streamObjectsBuilder_.isEmpty()) {
            streamObjectsBuilder_.dispose();
            streamObjectsBuilder_ = null;
            streamObjects_ = other.streamObjects_;
            bitField0_ = (bitField0_ & ~0x00000001);
            streamObjectsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStreamObjectsFieldBuilder() : null;
          } else {
            streamObjectsBuilder_.addAllMessages(other.streamObjects_);
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
              com.google.cloud.datastream.v1.StreamObject m =
                  input.readMessage(
                      com.google.cloud.datastream.v1.StreamObject.parser(),
                      extensionRegistry);
              if (streamObjectsBuilder_ == null) {
                ensureStreamObjectsIsMutable();
                streamObjects_.add(m);
              } else {
                streamObjectsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datastream.v1.StreamObject> streamObjects_ =
      java.util.Collections.emptyList();
    private void ensureStreamObjectsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        streamObjects_ = new java.util.ArrayList<com.google.cloud.datastream.v1.StreamObject>(streamObjects_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.StreamObject, com.google.cloud.datastream.v1.StreamObject.Builder, com.google.cloud.datastream.v1.StreamObjectOrBuilder> streamObjectsBuilder_;

    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.StreamObject> getStreamObjectsList() {
      if (streamObjectsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(streamObjects_);
      } else {
        return streamObjectsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public int getStreamObjectsCount() {
      if (streamObjectsBuilder_ == null) {
        return streamObjects_.size();
      } else {
        return streamObjectsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObject getStreamObjects(int index) {
      if (streamObjectsBuilder_ == null) {
        return streamObjects_.get(index);
      } else {
        return streamObjectsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder setStreamObjects(
        int index, com.google.cloud.datastream.v1.StreamObject value) {
      if (streamObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamObjectsIsMutable();
        streamObjects_.set(index, value);
        onChanged();
      } else {
        streamObjectsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder setStreamObjects(
        int index, com.google.cloud.datastream.v1.StreamObject.Builder builderForValue) {
      if (streamObjectsBuilder_ == null) {
        ensureStreamObjectsIsMutable();
        streamObjects_.set(index, builderForValue.build());
        onChanged();
      } else {
        streamObjectsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder addStreamObjects(com.google.cloud.datastream.v1.StreamObject value) {
      if (streamObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamObjectsIsMutable();
        streamObjects_.add(value);
        onChanged();
      } else {
        streamObjectsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder addStreamObjects(
        int index, com.google.cloud.datastream.v1.StreamObject value) {
      if (streamObjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamObjectsIsMutable();
        streamObjects_.add(index, value);
        onChanged();
      } else {
        streamObjectsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder addStreamObjects(
        com.google.cloud.datastream.v1.StreamObject.Builder builderForValue) {
      if (streamObjectsBuilder_ == null) {
        ensureStreamObjectsIsMutable();
        streamObjects_.add(builderForValue.build());
        onChanged();
      } else {
        streamObjectsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder addStreamObjects(
        int index, com.google.cloud.datastream.v1.StreamObject.Builder builderForValue) {
      if (streamObjectsBuilder_ == null) {
        ensureStreamObjectsIsMutable();
        streamObjects_.add(index, builderForValue.build());
        onChanged();
      } else {
        streamObjectsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder addAllStreamObjects(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1.StreamObject> values) {
      if (streamObjectsBuilder_ == null) {
        ensureStreamObjectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, streamObjects_);
        onChanged();
      } else {
        streamObjectsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder clearStreamObjects() {
      if (streamObjectsBuilder_ == null) {
        streamObjects_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        streamObjectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public Builder removeStreamObjects(int index) {
      if (streamObjectsBuilder_ == null) {
        ensureStreamObjectsIsMutable();
        streamObjects_.remove(index);
        onChanged();
      } else {
        streamObjectsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObject.Builder getStreamObjectsBuilder(
        int index) {
      return getStreamObjectsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObjectOrBuilder getStreamObjectsOrBuilder(
        int index) {
      if (streamObjectsBuilder_ == null) {
        return streamObjects_.get(index);  } else {
        return streamObjectsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1.StreamObjectOrBuilder> 
         getStreamObjectsOrBuilderList() {
      if (streamObjectsBuilder_ != null) {
        return streamObjectsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(streamObjects_);
      }
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObject.Builder addStreamObjectsBuilder() {
      return getStreamObjectsFieldBuilder().addBuilder(
          com.google.cloud.datastream.v1.StreamObject.getDefaultInstance());
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public com.google.cloud.datastream.v1.StreamObject.Builder addStreamObjectsBuilder(
        int index) {
      return getStreamObjectsFieldBuilder().addBuilder(
          index, com.google.cloud.datastream.v1.StreamObject.getDefaultInstance());
    }
    /**
     * <pre>
     * List of stream objects.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.StreamObject.Builder> 
         getStreamObjectsBuilderList() {
      return getStreamObjectsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.StreamObject, com.google.cloud.datastream.v1.StreamObject.Builder, com.google.cloud.datastream.v1.StreamObjectOrBuilder> 
        getStreamObjectsFieldBuilder() {
      if (streamObjectsBuilder_ == null) {
        streamObjectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.StreamObject, com.google.cloud.datastream.v1.StreamObject.Builder, com.google.cloud.datastream.v1.StreamObjectOrBuilder>(
                streamObjects_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        streamObjects_ = null;
      }
      return streamObjectsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.ListStreamObjectsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.ListStreamObjectsResponse)
  private static final com.google.cloud.datastream.v1.ListStreamObjectsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.ListStreamObjectsResponse();
  }

  public static com.google.cloud.datastream.v1.ListStreamObjectsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListStreamObjectsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListStreamObjectsResponse>() {
    @java.lang.Override
    public ListStreamObjectsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListStreamObjectsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListStreamObjectsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.ListStreamObjectsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

