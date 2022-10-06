// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 * <pre>
 * The inline source for the input config for ImportUserEvents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.UserEventInlineSource}
 */
public final class UserEventInlineSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.UserEventInlineSource)
    UserEventInlineSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserEventInlineSource.newBuilder() to construct.
  private UserEventInlineSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserEventInlineSource() {
    userEvents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserEventInlineSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.class, com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.Builder.class);
  }

  public static final int USER_EVENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> userEvents_;
  /**
   * <pre>
   * Optional. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> getUserEventsList() {
    return userEvents_;
  }
  /**
   * <pre>
   * Optional. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder> 
      getUserEventsOrBuilderList() {
    return userEvents_;
  }
  /**
   * <pre>
   * Optional. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public int getUserEventsCount() {
    return userEvents_.size();
  }
  /**
   * <pre>
   * Optional. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvents(int index) {
    return userEvents_.get(index);
  }
  /**
   * <pre>
   * Optional. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventsOrBuilder(
      int index) {
    return userEvents_.get(index);
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
    for (int i = 0; i < userEvents_.size(); i++) {
      output.writeMessage(1, userEvents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userEvents_.get(i));
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource other = (com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource) obj;

    if (!getUserEventsList()
        .equals(other.getUserEventsList())) return false;
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
    if (getUserEventsCount() > 0) {
      hash = (37 * hash) + USER_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getUserEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource prototype) {
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
   * The inline source for the input config for ImportUserEvents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.UserEventInlineSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.UserEventInlineSource)
      com.google.cloud.recommendationengine.v1beta1.UserEventInlineSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.class, com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.Builder.class);
    }

    // Construct using com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
      } else {
        userEvents_ = null;
        userEventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.Import.internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource build() {
      com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource result = new com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource(this);
      int from_bitField0_ = bitField0_;
      if (userEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userEvents_ = java.util.Collections.unmodifiableList(userEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userEvents_ = userEvents_;
      } else {
        result.userEvents_ = userEventsBuilder_.build();
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource other) {
      if (other == com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource.getDefaultInstance()) return this;
      if (userEventsBuilder_ == null) {
        if (!other.userEvents_.isEmpty()) {
          if (userEvents_.isEmpty()) {
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserEventsIsMutable();
            userEvents_.addAll(other.userEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.userEvents_.isEmpty()) {
          if (userEventsBuilder_.isEmpty()) {
            userEventsBuilder_.dispose();
            userEventsBuilder_ = null;
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserEventsFieldBuilder() : null;
          } else {
            userEventsBuilder_.addAllMessages(other.userEvents_);
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
              com.google.cloud.recommendationengine.v1beta1.UserEvent m =
                  input.readMessage(
                      com.google.cloud.recommendationengine.v1beta1.UserEvent.parser(),
                      extensionRegistry);
              if (userEventsBuilder_ == null) {
                ensureUserEventsIsMutable();
                userEvents_.add(m);
              } else {
                userEventsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> userEvents_ =
      java.util.Collections.emptyList();
    private void ensureUserEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userEvents_ = new java.util.ArrayList<com.google.cloud.recommendationengine.v1beta1.UserEvent>(userEvents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.recommendationengine.v1beta1.UserEvent, com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder, com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder> userEventsBuilder_;

    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> getUserEventsList() {
      if (userEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userEvents_);
      } else {
        return userEventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public int getUserEventsCount() {
      if (userEventsBuilder_ == null) {
        return userEvents_.size();
      } else {
        return userEventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);
      } else {
        return userEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.set(index, value);
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder addUserEvents(com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder addUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(index, value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder addUserEvents(
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder addUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder addAllUserEvents(
        java.lang.Iterable<? extends com.google.cloud.recommendationengine.v1beta1.UserEvent> values) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userEvents_);
        onChanged();
      } else {
        userEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUserEvents() {
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder removeUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.remove(index);
        onChanged();
      } else {
        userEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder getUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventsOrBuilder(
        int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);  } else {
        return userEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder> 
         getUserEventsOrBuilderList() {
      if (userEventsBuilder_ != null) {
        return userEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userEvents_);
      }
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder addUserEventsBuilder() {
      return getUserEventsFieldBuilder().addBuilder(
          com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder addUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder().addBuilder(
          index, com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Optional. A list of user events to import. Recommended max of 10k items.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder> 
         getUserEventsBuilderList() {
      return getUserEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.recommendationengine.v1beta1.UserEvent, com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder, com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder> 
        getUserEventsFieldBuilder() {
      if (userEventsBuilder_ == null) {
        userEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.UserEvent, com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder, com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>(
                userEvents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userEvents_ = null;
      }
      return userEventsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.UserEventInlineSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.UserEventInlineSource)
  private static final com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource();
  }

  public static com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserEventInlineSource>
      PARSER = new com.google.protobuf.AbstractParser<UserEventInlineSource>() {
    @java.lang.Override
    public UserEventInlineSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserEventInlineSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserEventInlineSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEventInlineSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

