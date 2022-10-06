// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Config for image bounding poly (and bounding box) human labeling task.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.BoundingPolyConfig}
 */
public final class BoundingPolyConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.BoundingPolyConfig)
    BoundingPolyConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoundingPolyConfig.newBuilder() to construct.
  private BoundingPolyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoundingPolyConfig() {
    annotationSpecSet_ = "";
    instructionMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoundingPolyConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.class, com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.Builder.class);
  }

  public static final int ANNOTATION_SPEC_SET_FIELD_NUMBER = 1;
  private volatile java.lang.Object annotationSpecSet_;
  /**
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The annotationSpecSet.
   */
  @java.lang.Override
  public java.lang.String getAnnotationSpecSet() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationSpecSet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for annotationSpecSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAnnotationSpecSetBytes() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      annotationSpecSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTRUCTION_MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object instructionMessage_;
  /**
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The instructionMessage.
   */
  @java.lang.Override
  public java.lang.String getInstructionMessage() {
    java.lang.Object ref = instructionMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instructionMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Instruction message showed on contributors UI.
   * </pre>
   *
   * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for instructionMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstructionMessageBytes() {
    java.lang.Object ref = instructionMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instructionMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, annotationSpecSet_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructionMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instructionMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, annotationSpecSet_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instructionMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instructionMessage_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig other = (com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig) obj;

    if (!getAnnotationSpecSet()
        .equals(other.getAnnotationSpecSet())) return false;
    if (!getInstructionMessage()
        .equals(other.getInstructionMessage())) return false;
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
    hash = (37 * hash) + ANNOTATION_SPEC_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecSet().hashCode();
    hash = (37 * hash) + INSTRUCTION_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getInstructionMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig prototype) {
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
   * Config for image bounding poly (and bounding box) human labeling task.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.BoundingPolyConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.BoundingPolyConfig)
      com.google.cloud.datalabeling.v1beta1.BoundingPolyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.class, com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      annotationSpecSet_ = "";

      instructionMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig build() {
      com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig result = new com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig(this);
      result.annotationSpecSet_ = annotationSpecSet_;
      result.instructionMessage_ = instructionMessage_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig other) {
      if (other == com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig.getDefaultInstance()) return this;
      if (!other.getAnnotationSpecSet().isEmpty()) {
        annotationSpecSet_ = other.annotationSpecSet_;
        onChanged();
      }
      if (!other.getInstructionMessage().isEmpty()) {
        instructionMessage_ = other.instructionMessage_;
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
              annotationSpecSet_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              instructionMessage_ = input.readStringRequireUtf8();

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

    private java.lang.Object annotationSpecSet_ = "";
    /**
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The annotationSpecSet.
     */
    public java.lang.String getAnnotationSpecSet() {
      java.lang.Object ref = annotationSpecSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationSpecSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for annotationSpecSet.
     */
    public com.google.protobuf.ByteString
        getAnnotationSpecSetBytes() {
      java.lang.Object ref = annotationSpecSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        annotationSpecSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      annotationSpecSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecSet() {
      
      annotationSpecSet_ = getDefaultInstance().getAnnotationSpecSet();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      annotationSpecSet_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instructionMessage_ = "";
    /**
     * <pre>
     * Optional. Instruction message showed on contributors UI.
     * </pre>
     *
     * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The instructionMessage.
     */
    public java.lang.String getInstructionMessage() {
      java.lang.Object ref = instructionMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instructionMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Instruction message showed on contributors UI.
     * </pre>
     *
     * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for instructionMessage.
     */
    public com.google.protobuf.ByteString
        getInstructionMessageBytes() {
      java.lang.Object ref = instructionMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instructionMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Instruction message showed on contributors UI.
     * </pre>
     *
     * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The instructionMessage to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instructionMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Instruction message showed on contributors UI.
     * </pre>
     *
     * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearInstructionMessage() {
      
      instructionMessage_ = getDefaultInstance().getInstructionMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Instruction message showed on contributors UI.
     * </pre>
     *
     * <code>string instruction_message = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for instructionMessage to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instructionMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.BoundingPolyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.BoundingPolyConfig)
  private static final com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoundingPolyConfig>
      PARSER = new com.google.protobuf.AbstractParser<BoundingPolyConfig>() {
    @java.lang.Override
    public BoundingPolyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<BoundingPolyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoundingPolyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

