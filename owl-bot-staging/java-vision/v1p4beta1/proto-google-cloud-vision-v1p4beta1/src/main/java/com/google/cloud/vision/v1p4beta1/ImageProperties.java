// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 * <pre>
 * Stores image properties, such as dominant colors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.ImageProperties}
 */
public final class ImageProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.ImageProperties)
    ImagePropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageProperties.newBuilder() to construct.
  private ImageProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageProperties() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_ImageProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_ImageProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.ImageProperties.class, com.google.cloud.vision.v1p4beta1.ImageProperties.Builder.class);
  }

  public static final int DOMINANT_COLORS_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominantColors_;
  /**
   * <pre>
   * If present, dominant colors completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
   * @return Whether the dominantColors field is set.
   */
  @java.lang.Override
  public boolean hasDominantColors() {
    return dominantColors_ != null;
  }
  /**
   * <pre>
   * If present, dominant colors completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
   * @return The dominantColors.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation getDominantColors() {
    return dominantColors_ == null ? com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.getDefaultInstance() : dominantColors_;
  }
  /**
   * <pre>
   * If present, dominant colors completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.DominantColorsAnnotationOrBuilder getDominantColorsOrBuilder() {
    return getDominantColors();
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
    if (dominantColors_ != null) {
      output.writeMessage(1, getDominantColors());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dominantColors_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDominantColors());
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.ImageProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.ImageProperties other = (com.google.cloud.vision.v1p4beta1.ImageProperties) obj;

    if (hasDominantColors() != other.hasDominantColors()) return false;
    if (hasDominantColors()) {
      if (!getDominantColors()
          .equals(other.getDominantColors())) return false;
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
    if (hasDominantColors()) {
      hash = (37 * hash) + DOMINANT_COLORS_FIELD_NUMBER;
      hash = (53 * hash) + getDominantColors().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p4beta1.ImageProperties parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.ImageProperties prototype) {
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
   * Stores image properties, such as dominant colors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.ImageProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.ImageProperties)
      com.google.cloud.vision.v1p4beta1.ImagePropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_ImageProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_ImageProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.ImageProperties.class, com.google.cloud.vision.v1p4beta1.ImageProperties.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.ImageProperties.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dominantColorsBuilder_ == null) {
        dominantColors_ = null;
      } else {
        dominantColors_ = null;
        dominantColorsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p4beta1_ImageProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ImageProperties getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.ImageProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ImageProperties build() {
      com.google.cloud.vision.v1p4beta1.ImageProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ImageProperties buildPartial() {
      com.google.cloud.vision.v1p4beta1.ImageProperties result = new com.google.cloud.vision.v1p4beta1.ImageProperties(this);
      if (dominantColorsBuilder_ == null) {
        result.dominantColors_ = dominantColors_;
      } else {
        result.dominantColors_ = dominantColorsBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.ImageProperties) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.ImageProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.ImageProperties other) {
      if (other == com.google.cloud.vision.v1p4beta1.ImageProperties.getDefaultInstance()) return this;
      if (other.hasDominantColors()) {
        mergeDominantColors(other.getDominantColors());
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
              input.readMessage(
                  getDominantColorsFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominantColors_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.Builder, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotationOrBuilder> dominantColorsBuilder_;
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     * @return Whether the dominantColors field is set.
     */
    public boolean hasDominantColors() {
      return dominantColorsBuilder_ != null || dominantColors_ != null;
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     * @return The dominantColors.
     */
    public com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation getDominantColors() {
      if (dominantColorsBuilder_ == null) {
        return dominantColors_ == null ? com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.getDefaultInstance() : dominantColors_;
      } else {
        return dominantColorsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public Builder setDominantColors(com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation value) {
      if (dominantColorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dominantColors_ = value;
        onChanged();
      } else {
        dominantColorsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public Builder setDominantColors(
        com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.Builder builderForValue) {
      if (dominantColorsBuilder_ == null) {
        dominantColors_ = builderForValue.build();
        onChanged();
      } else {
        dominantColorsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public Builder mergeDominantColors(com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation value) {
      if (dominantColorsBuilder_ == null) {
        if (dominantColors_ != null) {
          dominantColors_ =
            com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.newBuilder(dominantColors_).mergeFrom(value).buildPartial();
        } else {
          dominantColors_ = value;
        }
        onChanged();
      } else {
        dominantColorsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public Builder clearDominantColors() {
      if (dominantColorsBuilder_ == null) {
        dominantColors_ = null;
        onChanged();
      } else {
        dominantColors_ = null;
        dominantColorsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.Builder getDominantColorsBuilder() {
      
      onChanged();
      return getDominantColorsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.DominantColorsAnnotationOrBuilder getDominantColorsOrBuilder() {
      if (dominantColorsBuilder_ != null) {
        return dominantColorsBuilder_.getMessageOrBuilder();
      } else {
        return dominantColors_ == null ?
            com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.getDefaultInstance() : dominantColors_;
      }
    }
    /**
     * <pre>
     * If present, dominant colors completed successfully.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.DominantColorsAnnotation dominant_colors = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.Builder, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotationOrBuilder> 
        getDominantColorsFieldBuilder() {
      if (dominantColorsBuilder_ == null) {
        dominantColorsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotation.Builder, com.google.cloud.vision.v1p4beta1.DominantColorsAnnotationOrBuilder>(
                getDominantColors(),
                getParentForChildren(),
                isClean());
        dominantColors_ = null;
      }
      return dominantColorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.ImageProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.ImageProperties)
  private static final com.google.cloud.vision.v1p4beta1.ImageProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.ImageProperties();
  }

  public static com.google.cloud.vision.v1p4beta1.ImageProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageProperties>
      PARSER = new com.google.protobuf.AbstractParser<ImageProperties>() {
    @java.lang.Override
    public ImageProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.ImageProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

