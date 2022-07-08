/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 *
 *
 * <pre>
 * Represents a user facing message for a particular data transfer run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.TransferMessage}
 */
public final class TransferMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.TransferMessage)
    TransferMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TransferMessage.newBuilder() to construct.
  private TransferMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TransferMessage() {
    severity_ = 0;
    messageText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TransferMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TransferMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (messageTime_ != null) {
                subBuilder = messageTime_.toBuilder();
              }
              messageTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(messageTime_);
                messageTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              severity_ = rawValue;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              messageText_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto
        .internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.TransferMessage.class,
            com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Represents data transfer user facing message severity.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity}
   */
  public enum MessageSeverity implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No severity specified.
     * </pre>
     *
     * <code>MESSAGE_SEVERITY_UNSPECIFIED = 0;</code>
     */
    MESSAGE_SEVERITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Informational message.
     * </pre>
     *
     * <code>INFO = 1;</code>
     */
    INFO(1),
    /**
     *
     *
     * <pre>
     * Warning message.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    WARNING(2),
    /**
     *
     *
     * <pre>
     * Error message.
     * </pre>
     *
     * <code>ERROR = 3;</code>
     */
    ERROR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No severity specified.
     * </pre>
     *
     * <code>MESSAGE_SEVERITY_UNSPECIFIED = 0;</code>
     */
    public static final int MESSAGE_SEVERITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Informational message.
     * </pre>
     *
     * <code>INFO = 1;</code>
     */
    public static final int INFO_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Warning message.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    public static final int WARNING_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Error message.
     * </pre>
     *
     * <code>ERROR = 3;</code>
     */
    public static final int ERROR_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageSeverity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MessageSeverity forNumber(int value) {
      switch (value) {
        case 0:
          return MESSAGE_SEVERITY_UNSPECIFIED;
        case 1:
          return INFO;
        case 2:
          return WARNING;
        case 3:
          return ERROR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageSeverity> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MessageSeverity>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MessageSeverity>() {
              public MessageSeverity findValueByNumber(int number) {
                return MessageSeverity.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferMessage.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final MessageSeverity[] VALUES = values();

    public static MessageSeverity valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MessageSeverity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity)
  }

  public static final int MESSAGE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp messageTime_;
  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   *
   * @return Whether the messageTime field is set.
   */
  @java.lang.Override
  public boolean hasMessageTime() {
    return messageTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   *
   * @return The messageTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMessageTime() {
    return messageTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : messageTime_;
  }
  /**
   *
   *
   * <pre>
   * Time when message was logged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp message_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMessageTimeOrBuilder() {
    return getMessageTime();
  }

  public static final int SEVERITY_FIELD_NUMBER = 2;
  private int severity_;
  /**
   *
   *
   * <pre>
   * Message severity.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  @java.lang.Override
  public int getSeverityValue() {
    return severity_;
  }
  /**
   *
   *
   * <pre>
   * Message severity.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
   * </code>
   *
   * @return The severity.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity getSeverity() {
    @SuppressWarnings("deprecation")
    com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity result =
        com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity.valueOf(
            severity_);
    return result == null
        ? com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity.UNRECOGNIZED
        : result;
  }

  public static final int MESSAGE_TEXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object messageText_;
  /**
   *
   *
   * <pre>
   * Message text.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   *
   * @return The messageText.
   */
  @java.lang.Override
  public java.lang.String getMessageText() {
    java.lang.Object ref = messageText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Message text.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   *
   * @return The bytes for messageText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageTextBytes() {
    java.lang.Object ref = messageText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      messageText_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (messageTime_ != null) {
      output.writeMessage(1, getMessageTime());
    }
    if (severity_
        != com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity
            .MESSAGE_SEVERITY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMessageTime());
    }
    if (severity_
        != com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity
            .MESSAGE_SEVERITY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageText_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.TransferMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.TransferMessage other =
        (com.google.cloud.bigquery.datatransfer.v1.TransferMessage) obj;

    if (hasMessageTime() != other.hasMessageTime()) return false;
    if (hasMessageTime()) {
      if (!getMessageTime().equals(other.getMessageTime())) return false;
    }
    if (severity_ != other.severity_) return false;
    if (!getMessageText().equals(other.getMessageText())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessageTime()) {
      hash = (37 * hash) + MESSAGE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMessageTime().hashCode();
    }
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + severity_;
    hash = (37 * hash) + MESSAGE_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getMessageText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.datatransfer.v1.TransferMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents a user facing message for a particular data transfer run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.TransferMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.TransferMessage)
      com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.TransferMessage.class,
              com.google.cloud.bigquery.datatransfer.v1.TransferMessage.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.TransferMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messageTimeBuilder_ == null) {
        messageTime_ = null;
      } else {
        messageTime_ = null;
        messageTimeBuilder_ = null;
      }
      severity_ = 0;

      messageText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto
          .internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage build() {
      com.google.cloud.bigquery.datatransfer.v1.TransferMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.TransferMessage result =
          new com.google.cloud.bigquery.datatransfer.v1.TransferMessage(this);
      if (messageTimeBuilder_ == null) {
        result.messageTime_ = messageTime_;
      } else {
        result.messageTime_ = messageTimeBuilder_.build();
      }
      result.severity_ = severity_;
      result.messageText_ = messageText_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.TransferMessage) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.TransferMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.TransferMessage other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.TransferMessage.getDefaultInstance())
        return this;
      if (other.hasMessageTime()) {
        mergeMessageTime(other.getMessageTime());
      }
      if (other.severity_ != 0) {
        setSeverityValue(other.getSeverityValue());
      }
      if (!other.getMessageText().isEmpty()) {
        messageText_ = other.messageText_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.bigquery.datatransfer.v1.TransferMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.datatransfer.v1.TransferMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp messageTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        messageTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     *
     * @return Whether the messageTime field is set.
     */
    public boolean hasMessageTime() {
      return messageTimeBuilder_ != null || messageTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     *
     * @return The messageTime.
     */
    public com.google.protobuf.Timestamp getMessageTime() {
      if (messageTimeBuilder_ == null) {
        return messageTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : messageTime_;
      } else {
        return messageTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public Builder setMessageTime(com.google.protobuf.Timestamp value) {
      if (messageTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messageTime_ = value;
        onChanged();
      } else {
        messageTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public Builder setMessageTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (messageTimeBuilder_ == null) {
        messageTime_ = builderForValue.build();
        onChanged();
      } else {
        messageTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public Builder mergeMessageTime(com.google.protobuf.Timestamp value) {
      if (messageTimeBuilder_ == null) {
        if (messageTime_ != null) {
          messageTime_ =
              com.google.protobuf.Timestamp.newBuilder(messageTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          messageTime_ = value;
        }
        onChanged();
      } else {
        messageTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public Builder clearMessageTime() {
      if (messageTimeBuilder_ == null) {
        messageTime_ = null;
        onChanged();
      } else {
        messageTime_ = null;
        messageTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMessageTimeBuilder() {

      onChanged();
      return getMessageTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMessageTimeOrBuilder() {
      if (messageTimeBuilder_ != null) {
        return messageTimeBuilder_.getMessageOrBuilder();
      } else {
        return messageTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : messageTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time when message was logged.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp message_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getMessageTimeFieldBuilder() {
      if (messageTimeBuilder_ == null) {
        messageTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getMessageTime(), getParentForChildren(), isClean());
        messageTime_ = null;
      }
      return messageTimeBuilder_;
    }

    private int severity_ = 0;
    /**
     *
     *
     * <pre>
     * Message severity.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override
    public int getSeverityValue() {
      return severity_;
    }
    /**
     *
     *
     * <pre>
     * Message severity.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityValue(int value) {

      severity_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Message severity.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
     * </code>
     *
     * @return The severity.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity getSeverity() {
      @SuppressWarnings("deprecation")
      com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity result =
          com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity.valueOf(
              severity_);
      return result == null
          ? com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Message severity.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
     * </code>
     *
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(
        com.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity value) {
      if (value == null) {
        throw new NullPointerException();
      }

      severity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Message severity.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity severity = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {

      severity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object messageText_ = "";
    /**
     *
     *
     * <pre>
     * Message text.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     *
     * @return The messageText.
     */
    public java.lang.String getMessageText() {
      java.lang.Object ref = messageText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Message text.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     *
     * @return The bytes for messageText.
     */
    public com.google.protobuf.ByteString getMessageTextBytes() {
      java.lang.Object ref = messageText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        messageText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Message text.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     *
     * @param value The messageText to set.
     * @return This builder for chaining.
     */
    public Builder setMessageText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      messageText_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Message text.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessageText() {

      messageText_ = getDefaultInstance().getMessageText();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Message text.
     * </pre>
     *
     * <code>string message_text = 3;</code>
     *
     * @param value The bytes for messageText to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      messageText_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.TransferMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.TransferMessage)
  private static final com.google.cloud.bigquery.datatransfer.v1.TransferMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.TransferMessage();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.TransferMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferMessage> PARSER =
      new com.google.protobuf.AbstractParser<TransferMessage>() {
        @java.lang.Override
        public TransferMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TransferMessage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TransferMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
