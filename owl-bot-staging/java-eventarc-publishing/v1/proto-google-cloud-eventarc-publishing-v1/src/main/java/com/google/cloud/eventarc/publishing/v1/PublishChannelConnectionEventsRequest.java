// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/publishing/v1/publisher.proto

package com.google.cloud.eventarc.publishing.v1;

/**
 * <pre>
 * The request message for the PublishChannelConnectionEvents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest}
 */
public final class PublishChannelConnectionEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
    PublishChannelConnectionEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishChannelConnectionEventsRequest.newBuilder() to construct.
  private PublishChannelConnectionEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishChannelConnectionEventsRequest() {
    channelConnection_ = "";
    events_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublishChannelConnectionEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.eventarc.publishing.v1.PublisherProto.internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.publishing.v1.PublisherProto.internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.class, com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.Builder.class);
  }

  public static final int CHANNEL_CONNECTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object channelConnection_;
  /**
   * <pre>
   * The channel_connection that the events are published from. For example:
   * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
   * </pre>
   *
   * <code>string channel_connection = 1;</code>
   * @return The channelConnection.
   */
  @java.lang.Override
  public java.lang.String getChannelConnection() {
    java.lang.Object ref = channelConnection_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelConnection_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The channel_connection that the events are published from. For example:
   * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
   * </pre>
   *
   * <code>string channel_connection = 1;</code>
   * @return The bytes for channelConnection.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelConnectionBytes() {
    java.lang.Object ref = channelConnection_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelConnection_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.Any> events_;
  /**
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * The CloudEvents v1.0 events to publish. No other types are allowed.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelConnection_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, channelConnection_);
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(2, events_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelConnection_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, channelConnection_);
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, events_.get(i));
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
    if (!(obj instanceof com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest other = (com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest) obj;

    if (!getChannelConnection()
        .equals(other.getChannelConnection())) return false;
    if (!getEventsList()
        .equals(other.getEventsList())) return false;
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
    hash = (37 * hash) + CHANNEL_CONNECTION_FIELD_NUMBER;
    hash = (53 * hash) + getChannelConnection().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest prototype) {
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
   * The request message for the PublishChannelConnectionEvents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
      com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.eventarc.publishing.v1.PublisherProto.internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.publishing.v1.PublisherProto.internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.class, com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      channelConnection_ = "";

      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.eventarc.publishing.v1.PublisherProto.internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest getDefaultInstanceForType() {
      return com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest build() {
      com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest buildPartial() {
      com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest result = new com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest(this);
      int from_bitField0_ = bitField0_;
      result.channelConnection_ = channelConnection_;
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
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
      if (other instanceof com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest) {
        return mergeFrom((com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest other) {
      if (other == com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.getDefaultInstance()) return this;
      if (!other.getChannelConnection().isEmpty()) {
        channelConnection_ = other.channelConnection_;
        onChanged();
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
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
              channelConnection_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              com.google.protobuf.Any m =
                  input.readMessage(
                      com.google.protobuf.Any.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
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

    private java.lang.Object channelConnection_ = "";
    /**
     * <pre>
     * The channel_connection that the events are published from. For example:
     * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
     * </pre>
     *
     * <code>string channel_connection = 1;</code>
     * @return The channelConnection.
     */
    public java.lang.String getChannelConnection() {
      java.lang.Object ref = channelConnection_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelConnection_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The channel_connection that the events are published from. For example:
     * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
     * </pre>
     *
     * <code>string channel_connection = 1;</code>
     * @return The bytes for channelConnection.
     */
    public com.google.protobuf.ByteString
        getChannelConnectionBytes() {
      java.lang.Object ref = channelConnection_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelConnection_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The channel_connection that the events are published from. For example:
     * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
     * </pre>
     *
     * <code>string channel_connection = 1;</code>
     * @param value The channelConnection to set.
     * @return This builder for chaining.
     */
    public Builder setChannelConnection(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channelConnection_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel_connection that the events are published from. For example:
     * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
     * </pre>
     *
     * <code>string channel_connection = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelConnection() {
      
      channelConnection_ = getDefaultInstance().getChannelConnection();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel_connection that the events are published from. For example:
     * `projects/{partner_project_id}/locations/{location}/channelConnections/{channel_connection_id}`.
     * </pre>
     *
     * <code>string channel_connection = 1;</code>
     * @param value The bytes for channelConnection to set.
     * @return This builder for chaining.
     */
    public Builder setChannelConnectionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channelConnection_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.Any> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<com.google.protobuf.Any>(events_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public java.util.List<com.google.protobuf.Any> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public com.google.protobuf.Any getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder setEvents(
        int index, com.google.protobuf.Any value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder setEvents(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder addEvents(com.google.protobuf.Any value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder addEvents(
        int index, com.google.protobuf.Any value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder addEvents(
        com.google.protobuf.Any.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder addEvents(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public com.google.protobuf.Any.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public com.google.protobuf.Any.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public com.google.protobuf.Any.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * The CloudEvents v1.0 events to publish. No other types are allowed.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any events = 2;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                events_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
  private static final com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest();
  }

  public static com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishChannelConnectionEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishChannelConnectionEventsRequest>() {
    @java.lang.Override
    public PublishChannelConnectionEventsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublishChannelConnectionEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishChannelConnectionEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

