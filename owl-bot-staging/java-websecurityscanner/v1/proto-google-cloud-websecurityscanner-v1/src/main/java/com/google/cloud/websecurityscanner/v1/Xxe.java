// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

package com.google.cloud.websecurityscanner.v1;

/**
 * <pre>
 * Information reported for an XXE.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1.Xxe}
 */
public final class Xxe extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1.Xxe)
    XxeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Xxe.newBuilder() to construct.
  private Xxe(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Xxe() {
    payloadValue_ = "";
    payloadLocation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Xxe();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Xxe_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1.Xxe.class, com.google.cloud.websecurityscanner.v1.Xxe.Builder.class);
  }

  /**
   * <pre>
   * Locations within a request where XML was substituted.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.websecurityscanner.v1.Xxe.Location}
   */
  public enum Location
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unknown Location.
     * </pre>
     *
     * <code>LOCATION_UNSPECIFIED = 0;</code>
     */
    LOCATION_UNSPECIFIED(0),
    /**
     * <pre>
     * The XML payload replaced the complete request body.
     * </pre>
     *
     * <code>COMPLETE_REQUEST_BODY = 1;</code>
     */
    COMPLETE_REQUEST_BODY(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unknown Location.
     * </pre>
     *
     * <code>LOCATION_UNSPECIFIED = 0;</code>
     */
    public static final int LOCATION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The XML payload replaced the complete request body.
     * </pre>
     *
     * <code>COMPLETE_REQUEST_BODY = 1;</code>
     */
    public static final int COMPLETE_REQUEST_BODY_VALUE = 1;


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
    public static Location valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Location forNumber(int value) {
      switch (value) {
        case 0: return LOCATION_UNSPECIFIED;
        case 1: return COMPLETE_REQUEST_BODY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Location>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Location> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Location>() {
            public Location findValueByNumber(int number) {
              return Location.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.websecurityscanner.v1.Xxe.getDescriptor().getEnumTypes().get(0);
    }

    private static final Location[] VALUES = values();

    public static Location valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Location(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.websecurityscanner.v1.Xxe.Location)
  }

  public static final int PAYLOAD_VALUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object payloadValue_;
  /**
   * <pre>
   * The XML string that triggered the XXE vulnerability. Non-payload values
   * might be redacted.
   * </pre>
   *
   * <code>string payload_value = 1;</code>
   * @return The payloadValue.
   */
  @java.lang.Override
  public java.lang.String getPayloadValue() {
    java.lang.Object ref = payloadValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payloadValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The XML string that triggered the XXE vulnerability. Non-payload values
   * might be redacted.
   * </pre>
   *
   * <code>string payload_value = 1;</code>
   * @return The bytes for payloadValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayloadValueBytes() {
    java.lang.Object ref = payloadValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payloadValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_LOCATION_FIELD_NUMBER = 2;
  private int payloadLocation_;
  /**
   * <pre>
   * Location within the request where the payload was placed.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
   * @return The enum numeric value on the wire for payloadLocation.
   */
  @java.lang.Override public int getPayloadLocationValue() {
    return payloadLocation_;
  }
  /**
   * <pre>
   * Location within the request where the payload was placed.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
   * @return The payloadLocation.
   */
  @java.lang.Override public com.google.cloud.websecurityscanner.v1.Xxe.Location getPayloadLocation() {
    @SuppressWarnings("deprecation")
    com.google.cloud.websecurityscanner.v1.Xxe.Location result = com.google.cloud.websecurityscanner.v1.Xxe.Location.valueOf(payloadLocation_);
    return result == null ? com.google.cloud.websecurityscanner.v1.Xxe.Location.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payloadValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payloadValue_);
    }
    if (payloadLocation_ != com.google.cloud.websecurityscanner.v1.Xxe.Location.LOCATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, payloadLocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payloadValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payloadValue_);
    }
    if (payloadLocation_ != com.google.cloud.websecurityscanner.v1.Xxe.Location.LOCATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, payloadLocation_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1.Xxe)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1.Xxe other = (com.google.cloud.websecurityscanner.v1.Xxe) obj;

    if (!getPayloadValue()
        .equals(other.getPayloadValue())) return false;
    if (payloadLocation_ != other.payloadLocation_) return false;
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
    hash = (37 * hash) + PAYLOAD_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadValue().hashCode();
    hash = (37 * hash) + PAYLOAD_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + payloadLocation_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1.Xxe parseFrom(
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
  public static Builder newBuilder(com.google.cloud.websecurityscanner.v1.Xxe prototype) {
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
   * Information reported for an XXE.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1.Xxe}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1.Xxe)
      com.google.cloud.websecurityscanner.v1.XxeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Xxe_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1.Xxe.class, com.google.cloud.websecurityscanner.v1.Xxe.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1.Xxe.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      payloadValue_ = "";

      payloadLocation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto.internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Xxe getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1.Xxe.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Xxe build() {
      com.google.cloud.websecurityscanner.v1.Xxe result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Xxe buildPartial() {
      com.google.cloud.websecurityscanner.v1.Xxe result = new com.google.cloud.websecurityscanner.v1.Xxe(this);
      result.payloadValue_ = payloadValue_;
      result.payloadLocation_ = payloadLocation_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1.Xxe) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1.Xxe)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1.Xxe other) {
      if (other == com.google.cloud.websecurityscanner.v1.Xxe.getDefaultInstance()) return this;
      if (!other.getPayloadValue().isEmpty()) {
        payloadValue_ = other.payloadValue_;
        onChanged();
      }
      if (other.payloadLocation_ != 0) {
        setPayloadLocationValue(other.getPayloadLocationValue());
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
              payloadValue_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              payloadLocation_ = input.readEnum();

              break;
            } // case 16
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

    private java.lang.Object payloadValue_ = "";
    /**
     * <pre>
     * The XML string that triggered the XXE vulnerability. Non-payload values
     * might be redacted.
     * </pre>
     *
     * <code>string payload_value = 1;</code>
     * @return The payloadValue.
     */
    public java.lang.String getPayloadValue() {
      java.lang.Object ref = payloadValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payloadValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The XML string that triggered the XXE vulnerability. Non-payload values
     * might be redacted.
     * </pre>
     *
     * <code>string payload_value = 1;</code>
     * @return The bytes for payloadValue.
     */
    public com.google.protobuf.ByteString
        getPayloadValueBytes() {
      java.lang.Object ref = payloadValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payloadValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The XML string that triggered the XXE vulnerability. Non-payload values
     * might be redacted.
     * </pre>
     *
     * <code>string payload_value = 1;</code>
     * @param value The payloadValue to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payloadValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The XML string that triggered the XXE vulnerability. Non-payload values
     * might be redacted.
     * </pre>
     *
     * <code>string payload_value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadValue() {
      
      payloadValue_ = getDefaultInstance().getPayloadValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The XML string that triggered the XXE vulnerability. Non-payload values
     * might be redacted.
     * </pre>
     *
     * <code>string payload_value = 1;</code>
     * @param value The bytes for payloadValue to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      payloadValue_ = value;
      onChanged();
      return this;
    }

    private int payloadLocation_ = 0;
    /**
     * <pre>
     * Location within the request where the payload was placed.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
     * @return The enum numeric value on the wire for payloadLocation.
     */
    @java.lang.Override public int getPayloadLocationValue() {
      return payloadLocation_;
    }
    /**
     * <pre>
     * Location within the request where the payload was placed.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
     * @param value The enum numeric value on the wire for payloadLocation to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadLocationValue(int value) {
      
      payloadLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location within the request where the payload was placed.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
     * @return The payloadLocation.
     */
    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.Xxe.Location getPayloadLocation() {
      @SuppressWarnings("deprecation")
      com.google.cloud.websecurityscanner.v1.Xxe.Location result = com.google.cloud.websecurityscanner.v1.Xxe.Location.valueOf(payloadLocation_);
      return result == null ? com.google.cloud.websecurityscanner.v1.Xxe.Location.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Location within the request where the payload was placed.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
     * @param value The payloadLocation to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadLocation(com.google.cloud.websecurityscanner.v1.Xxe.Location value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      payloadLocation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location within the request where the payload was placed.
     * </pre>
     *
     * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadLocation() {
      
      payloadLocation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1.Xxe)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.Xxe)
  private static final com.google.cloud.websecurityscanner.v1.Xxe DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1.Xxe();
  }

  public static com.google.cloud.websecurityscanner.v1.Xxe getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Xxe>
      PARSER = new com.google.protobuf.AbstractParser<Xxe>() {
    @java.lang.Override
    public Xxe parsePartialFrom(
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

  public static com.google.protobuf.Parser<Xxe> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Xxe> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.Xxe getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

