// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/text_extraction.proto

package com.google.cloud.automl.v1;

/**
 * <pre>
 * Annotation for identifying spans of text.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.TextExtractionAnnotation}
 */
public final class TextExtractionAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.TextExtractionAnnotation)
    TextExtractionAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextExtractionAnnotation.newBuilder() to construct.
  private TextExtractionAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextExtractionAnnotation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextExtractionAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1.TextExtraction.internal_static_google_cloud_automl_v1_TextExtractionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.TextExtraction.internal_static_google_cloud_automl_v1_TextExtractionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.TextExtractionAnnotation.class, com.google.cloud.automl.v1.TextExtractionAnnotation.Builder.class);
  }

  private int annotationCase_ = 0;
  private java.lang.Object annotation_;
  public enum AnnotationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEXT_SEGMENT(3),
    ANNOTATION_NOT_SET(0);
    private final int value;
    private AnnotationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnnotationCase valueOf(int value) {
      return forNumber(value);
    }

    public static AnnotationCase forNumber(int value) {
      switch (value) {
        case 3: return TEXT_SEGMENT;
        case 0: return ANNOTATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AnnotationCase
  getAnnotationCase() {
    return AnnotationCase.forNumber(
        annotationCase_);
  }

  public static final int TEXT_SEGMENT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   * @return Whether the textSegment field is set.
   */
  @java.lang.Override
  public boolean hasTextSegment() {
    return annotationCase_ == 3;
  }
  /**
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   * @return The textSegment.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.TextSegment getTextSegment() {
    if (annotationCase_ == 3) {
       return (com.google.cloud.automl.v1.TextSegment) annotation_;
    }
    return com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
  }
  /**
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.TextSegmentOrBuilder getTextSegmentOrBuilder() {
    if (annotationCase_ == 3) {
       return (com.google.cloud.automl.v1.TextSegment) annotation_;
    }
    return com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private float score_;
  /**
   * <pre>
   * Output only. A confidence estimate between 0.0 and 1.0. A higher value
   * means greater confidence in correctness of the annotation.
   * </pre>
   *
   * <code>float score = 1;</code>
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
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
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      output.writeFloat(1, score_);
    }
    if (annotationCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.automl.v1.TextSegment) annotation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, score_);
    }
    if (annotationCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.cloud.automl.v1.TextSegment) annotation_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.TextExtractionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.TextExtractionAnnotation other = (com.google.cloud.automl.v1.TextExtractionAnnotation) obj;

    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(
            other.getScore())) return false;
    if (!getAnnotationCase().equals(other.getAnnotationCase())) return false;
    switch (annotationCase_) {
      case 3:
        if (!getTextSegment()
            .equals(other.getTextSegment())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    switch (annotationCase_) {
      case 3:
        hash = (37 * hash) + TEXT_SEGMENT_FIELD_NUMBER;
        hash = (53 * hash) + getTextSegment().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.TextExtractionAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.automl.v1.TextExtractionAnnotation prototype) {
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
   * Annotation for identifying spans of text.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.TextExtractionAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.TextExtractionAnnotation)
      com.google.cloud.automl.v1.TextExtractionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1.TextExtraction.internal_static_google_cloud_automl_v1_TextExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.TextExtraction.internal_static_google_cloud_automl_v1_TextExtractionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.TextExtractionAnnotation.class, com.google.cloud.automl.v1.TextExtractionAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.TextExtractionAnnotation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (textSegmentBuilder_ != null) {
        textSegmentBuilder_.clear();
      }
      score_ = 0F;

      annotationCase_ = 0;
      annotation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1.TextExtraction.internal_static_google_cloud_automl_v1_TextExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextExtractionAnnotation getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.TextExtractionAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextExtractionAnnotation build() {
      com.google.cloud.automl.v1.TextExtractionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.TextExtractionAnnotation buildPartial() {
      com.google.cloud.automl.v1.TextExtractionAnnotation result = new com.google.cloud.automl.v1.TextExtractionAnnotation(this);
      if (annotationCase_ == 3) {
        if (textSegmentBuilder_ == null) {
          result.annotation_ = annotation_;
        } else {
          result.annotation_ = textSegmentBuilder_.build();
        }
      }
      result.score_ = score_;
      result.annotationCase_ = annotationCase_;
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
      if (other instanceof com.google.cloud.automl.v1.TextExtractionAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1.TextExtractionAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.TextExtractionAnnotation other) {
      if (other == com.google.cloud.automl.v1.TextExtractionAnnotation.getDefaultInstance()) return this;
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      switch (other.getAnnotationCase()) {
        case TEXT_SEGMENT: {
          mergeTextSegment(other.getTextSegment());
          break;
        }
        case ANNOTATION_NOT_SET: {
          break;
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
            case 13: {
              score_ = input.readFloat();

              break;
            } // case 13
            case 26: {
              input.readMessage(
                  getTextSegmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              annotationCase_ = 3;
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
    private int annotationCase_ = 0;
    private java.lang.Object annotation_;
    public AnnotationCase
        getAnnotationCase() {
      return AnnotationCase.forNumber(
          annotationCase_);
    }

    public Builder clearAnnotation() {
      annotationCase_ = 0;
      annotation_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.automl.v1.TextSegment, com.google.cloud.automl.v1.TextSegment.Builder, com.google.cloud.automl.v1.TextSegmentOrBuilder> textSegmentBuilder_;
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     * @return Whether the textSegment field is set.
     */
    @java.lang.Override
    public boolean hasTextSegment() {
      return annotationCase_ == 3;
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     * @return The textSegment.
     */
    @java.lang.Override
    public com.google.cloud.automl.v1.TextSegment getTextSegment() {
      if (textSegmentBuilder_ == null) {
        if (annotationCase_ == 3) {
          return (com.google.cloud.automl.v1.TextSegment) annotation_;
        }
        return com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
      } else {
        if (annotationCase_ == 3) {
          return textSegmentBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    public Builder setTextSegment(com.google.cloud.automl.v1.TextSegment value) {
      if (textSegmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotation_ = value;
        onChanged();
      } else {
        textSegmentBuilder_.setMessage(value);
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    public Builder setTextSegment(
        com.google.cloud.automl.v1.TextSegment.Builder builderForValue) {
      if (textSegmentBuilder_ == null) {
        annotation_ = builderForValue.build();
        onChanged();
      } else {
        textSegmentBuilder_.setMessage(builderForValue.build());
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    public Builder mergeTextSegment(com.google.cloud.automl.v1.TextSegment value) {
      if (textSegmentBuilder_ == null) {
        if (annotationCase_ == 3 &&
            annotation_ != com.google.cloud.automl.v1.TextSegment.getDefaultInstance()) {
          annotation_ = com.google.cloud.automl.v1.TextSegment.newBuilder((com.google.cloud.automl.v1.TextSegment) annotation_)
              .mergeFrom(value).buildPartial();
        } else {
          annotation_ = value;
        }
        onChanged();
      } else {
        if (annotationCase_ == 3) {
          textSegmentBuilder_.mergeFrom(value);
        } else {
          textSegmentBuilder_.setMessage(value);
        }
      }
      annotationCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    public Builder clearTextSegment() {
      if (textSegmentBuilder_ == null) {
        if (annotationCase_ == 3) {
          annotationCase_ = 0;
          annotation_ = null;
          onChanged();
        }
      } else {
        if (annotationCase_ == 3) {
          annotationCase_ = 0;
          annotation_ = null;
        }
        textSegmentBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    public com.google.cloud.automl.v1.TextSegment.Builder getTextSegmentBuilder() {
      return getTextSegmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.automl.v1.TextSegmentOrBuilder getTextSegmentOrBuilder() {
      if ((annotationCase_ == 3) && (textSegmentBuilder_ != null)) {
        return textSegmentBuilder_.getMessageOrBuilder();
      } else {
        if (annotationCase_ == 3) {
          return (com.google.cloud.automl.v1.TextSegment) annotation_;
        }
        return com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * An entity annotation will set this, which is the part of the original
     * text to which the annotation pertains.
     * </pre>
     *
     * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.automl.v1.TextSegment, com.google.cloud.automl.v1.TextSegment.Builder, com.google.cloud.automl.v1.TextSegmentOrBuilder> 
        getTextSegmentFieldBuilder() {
      if (textSegmentBuilder_ == null) {
        if (!(annotationCase_ == 3)) {
          annotation_ = com.google.cloud.automl.v1.TextSegment.getDefaultInstance();
        }
        textSegmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1.TextSegment, com.google.cloud.automl.v1.TextSegment.Builder, com.google.cloud.automl.v1.TextSegmentOrBuilder>(
                (com.google.cloud.automl.v1.TextSegment) annotation_,
                getParentForChildren(),
                isClean());
        annotation_ = null;
      }
      annotationCase_ = 3;
      onChanged();;
      return textSegmentBuilder_;
    }

    private float score_ ;
    /**
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A confidence estimate between 0.0 and 1.0. A higher value
     * means greater confidence in correctness of the annotation.
     * </pre>
     *
     * <code>float score = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      
      score_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.TextExtractionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextExtractionAnnotation)
  private static final com.google.cloud.automl.v1.TextExtractionAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.TextExtractionAnnotation();
  }

  public static com.google.cloud.automl.v1.TextExtractionAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextExtractionAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<TextExtractionAnnotation>() {
    @java.lang.Override
    public TextExtractionAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextExtractionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextExtractionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.TextExtractionAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

