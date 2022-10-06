// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * Request for looking up a specific stream object by its source object
 * identifier.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.LookupStreamObjectRequest}
 */
public final class LookupStreamObjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.LookupStreamObjectRequest)
    LookupStreamObjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LookupStreamObjectRequest.newBuilder() to construct.
  private LookupStreamObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LookupStreamObjectRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LookupStreamObjectRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_LookupStreamObjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_LookupStreamObjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.LookupStreamObjectRequest.class, com.google.cloud.datastream.v1.LookupStreamObjectRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent stream that owns the collection of objects.
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
   * Required. The parent stream that owns the collection of objects.
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

  public static final int SOURCE_OBJECT_IDENTIFIER_FIELD_NUMBER = 2;
  private com.google.cloud.datastream.v1.SourceObjectIdentifier sourceObjectIdentifier_;
  /**
   * <pre>
   * Required. The source object identifier which maps to the stream object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the sourceObjectIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasSourceObjectIdentifier() {
    return sourceObjectIdentifier_ != null;
  }
  /**
   * <pre>
   * Required. The source object identifier which maps to the stream object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sourceObjectIdentifier.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.SourceObjectIdentifier getSourceObjectIdentifier() {
    return sourceObjectIdentifier_ == null ? com.google.cloud.datastream.v1.SourceObjectIdentifier.getDefaultInstance() : sourceObjectIdentifier_;
  }
  /**
   * <pre>
   * Required. The source object identifier which maps to the stream object.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.SourceObjectIdentifierOrBuilder getSourceObjectIdentifierOrBuilder() {
    return getSourceObjectIdentifier();
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
    if (sourceObjectIdentifier_ != null) {
      output.writeMessage(2, getSourceObjectIdentifier());
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
    if (sourceObjectIdentifier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSourceObjectIdentifier());
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
    if (!(obj instanceof com.google.cloud.datastream.v1.LookupStreamObjectRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.LookupStreamObjectRequest other = (com.google.cloud.datastream.v1.LookupStreamObjectRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSourceObjectIdentifier() != other.hasSourceObjectIdentifier()) return false;
    if (hasSourceObjectIdentifier()) {
      if (!getSourceObjectIdentifier()
          .equals(other.getSourceObjectIdentifier())) return false;
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
    if (hasSourceObjectIdentifier()) {
      hash = (37 * hash) + SOURCE_OBJECT_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getSourceObjectIdentifier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.LookupStreamObjectRequest prototype) {
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
   * Request for looking up a specific stream object by its source object
   * identifier.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.LookupStreamObjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.LookupStreamObjectRequest)
      com.google.cloud.datastream.v1.LookupStreamObjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_LookupStreamObjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_LookupStreamObjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.LookupStreamObjectRequest.class, com.google.cloud.datastream.v1.LookupStreamObjectRequest.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.LookupStreamObjectRequest.newBuilder()
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

      if (sourceObjectIdentifierBuilder_ == null) {
        sourceObjectIdentifier_ = null;
      } else {
        sourceObjectIdentifier_ = null;
        sourceObjectIdentifierBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamProto.internal_static_google_cloud_datastream_v1_LookupStreamObjectRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.LookupStreamObjectRequest getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.LookupStreamObjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.LookupStreamObjectRequest build() {
      com.google.cloud.datastream.v1.LookupStreamObjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.LookupStreamObjectRequest buildPartial() {
      com.google.cloud.datastream.v1.LookupStreamObjectRequest result = new com.google.cloud.datastream.v1.LookupStreamObjectRequest(this);
      result.parent_ = parent_;
      if (sourceObjectIdentifierBuilder_ == null) {
        result.sourceObjectIdentifier_ = sourceObjectIdentifier_;
      } else {
        result.sourceObjectIdentifier_ = sourceObjectIdentifierBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1.LookupStreamObjectRequest) {
        return mergeFrom((com.google.cloud.datastream.v1.LookupStreamObjectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.LookupStreamObjectRequest other) {
      if (other == com.google.cloud.datastream.v1.LookupStreamObjectRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSourceObjectIdentifier()) {
        mergeSourceObjectIdentifier(other.getSourceObjectIdentifier());
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
              input.readMessage(
                  getSourceObjectIdentifierFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent stream that owns the collection of objects.
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
     * Required. The parent stream that owns the collection of objects.
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
     * Required. The parent stream that owns the collection of objects.
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
     * Required. The parent stream that owns the collection of objects.
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
     * Required. The parent stream that owns the collection of objects.
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

    private com.google.cloud.datastream.v1.SourceObjectIdentifier sourceObjectIdentifier_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.SourceObjectIdentifier, com.google.cloud.datastream.v1.SourceObjectIdentifier.Builder, com.google.cloud.datastream.v1.SourceObjectIdentifierOrBuilder> sourceObjectIdentifierBuilder_;
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the sourceObjectIdentifier field is set.
     */
    public boolean hasSourceObjectIdentifier() {
      return sourceObjectIdentifierBuilder_ != null || sourceObjectIdentifier_ != null;
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The sourceObjectIdentifier.
     */
    public com.google.cloud.datastream.v1.SourceObjectIdentifier getSourceObjectIdentifier() {
      if (sourceObjectIdentifierBuilder_ == null) {
        return sourceObjectIdentifier_ == null ? com.google.cloud.datastream.v1.SourceObjectIdentifier.getDefaultInstance() : sourceObjectIdentifier_;
      } else {
        return sourceObjectIdentifierBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSourceObjectIdentifier(com.google.cloud.datastream.v1.SourceObjectIdentifier value) {
      if (sourceObjectIdentifierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceObjectIdentifier_ = value;
        onChanged();
      } else {
        sourceObjectIdentifierBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSourceObjectIdentifier(
        com.google.cloud.datastream.v1.SourceObjectIdentifier.Builder builderForValue) {
      if (sourceObjectIdentifierBuilder_ == null) {
        sourceObjectIdentifier_ = builderForValue.build();
        onChanged();
      } else {
        sourceObjectIdentifierBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSourceObjectIdentifier(com.google.cloud.datastream.v1.SourceObjectIdentifier value) {
      if (sourceObjectIdentifierBuilder_ == null) {
        if (sourceObjectIdentifier_ != null) {
          sourceObjectIdentifier_ =
            com.google.cloud.datastream.v1.SourceObjectIdentifier.newBuilder(sourceObjectIdentifier_).mergeFrom(value).buildPartial();
        } else {
          sourceObjectIdentifier_ = value;
        }
        onChanged();
      } else {
        sourceObjectIdentifierBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSourceObjectIdentifier() {
      if (sourceObjectIdentifierBuilder_ == null) {
        sourceObjectIdentifier_ = null;
        onChanged();
      } else {
        sourceObjectIdentifier_ = null;
        sourceObjectIdentifierBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datastream.v1.SourceObjectIdentifier.Builder getSourceObjectIdentifierBuilder() {
      
      onChanged();
      return getSourceObjectIdentifierFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datastream.v1.SourceObjectIdentifierOrBuilder getSourceObjectIdentifierOrBuilder() {
      if (sourceObjectIdentifierBuilder_ != null) {
        return sourceObjectIdentifierBuilder_.getMessageOrBuilder();
      } else {
        return sourceObjectIdentifier_ == null ?
            com.google.cloud.datastream.v1.SourceObjectIdentifier.getDefaultInstance() : sourceObjectIdentifier_;
      }
    }
    /**
     * <pre>
     * Required. The source object identifier which maps to the stream object.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1.SourceObjectIdentifier source_object_identifier = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datastream.v1.SourceObjectIdentifier, com.google.cloud.datastream.v1.SourceObjectIdentifier.Builder, com.google.cloud.datastream.v1.SourceObjectIdentifierOrBuilder> 
        getSourceObjectIdentifierFieldBuilder() {
      if (sourceObjectIdentifierBuilder_ == null) {
        sourceObjectIdentifierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1.SourceObjectIdentifier, com.google.cloud.datastream.v1.SourceObjectIdentifier.Builder, com.google.cloud.datastream.v1.SourceObjectIdentifierOrBuilder>(
                getSourceObjectIdentifier(),
                getParentForChildren(),
                isClean());
        sourceObjectIdentifier_ = null;
      }
      return sourceObjectIdentifierBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.LookupStreamObjectRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.LookupStreamObjectRequest)
  private static final com.google.cloud.datastream.v1.LookupStreamObjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.LookupStreamObjectRequest();
  }

  public static com.google.cloud.datastream.v1.LookupStreamObjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupStreamObjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<LookupStreamObjectRequest>() {
    @java.lang.Override
    public LookupStreamObjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<LookupStreamObjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupStreamObjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.LookupStreamObjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

