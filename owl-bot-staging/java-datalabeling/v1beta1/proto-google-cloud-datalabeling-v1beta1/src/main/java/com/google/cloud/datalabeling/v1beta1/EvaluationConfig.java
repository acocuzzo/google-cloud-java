// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Configuration details used for calculating evaluation metrics and creating an
 * [Evaluation][google.cloud.datalabeling.v1beta1.Evaluation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationConfig}
 */
public final class EvaluationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.EvaluationConfig)
    EvaluationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvaluationConfig.newBuilder() to construct.
  private EvaluationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvaluationConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvaluationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.EvaluationConfig.class, com.google.cloud.datalabeling.v1beta1.EvaluationConfig.Builder.class);
  }

  private int verticalOptionCase_ = 0;
  private java.lang.Object verticalOption_;
  public enum VerticalOptionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOUNDING_BOX_EVALUATION_OPTIONS(1),
    VERTICALOPTION_NOT_SET(0);
    private final int value;
    private VerticalOptionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VerticalOptionCase valueOf(int value) {
      return forNumber(value);
    }

    public static VerticalOptionCase forNumber(int value) {
      switch (value) {
        case 1: return BOUNDING_BOX_EVALUATION_OPTIONS;
        case 0: return VERTICALOPTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public VerticalOptionCase
  getVerticalOptionCase() {
    return VerticalOptionCase.forNumber(
        verticalOptionCase_);
  }

  public static final int BOUNDING_BOX_EVALUATION_OPTIONS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Only specify this field if the related model performs image object
   * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
   * bounding boxes.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
   * @return Whether the boundingBoxEvaluationOptions field is set.
   */
  @java.lang.Override
  public boolean hasBoundingBoxEvaluationOptions() {
    return verticalOptionCase_ == 1;
  }
  /**
   * <pre>
   * Only specify this field if the related model performs image object
   * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
   * bounding boxes.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
   * @return The boundingBoxEvaluationOptions.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions getBoundingBoxEvaluationOptions() {
    if (verticalOptionCase_ == 1) {
       return (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_;
    }
    return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
  }
  /**
   * <pre>
   * Only specify this field if the related model performs image object
   * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
   * bounding boxes.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder getBoundingBoxEvaluationOptionsOrBuilder() {
    if (verticalOptionCase_ == 1) {
       return (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_;
    }
    return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
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
    if (verticalOptionCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (verticalOptionCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.EvaluationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.EvaluationConfig other = (com.google.cloud.datalabeling.v1beta1.EvaluationConfig) obj;

    if (!getVerticalOptionCase().equals(other.getVerticalOptionCase())) return false;
    switch (verticalOptionCase_) {
      case 1:
        if (!getBoundingBoxEvaluationOptions()
            .equals(other.getBoundingBoxEvaluationOptions())) return false;
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
    switch (verticalOptionCase_) {
      case 1:
        hash = (37 * hash) + BOUNDING_BOX_EVALUATION_OPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getBoundingBoxEvaluationOptions().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.EvaluationConfig prototype) {
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
   * Configuration details used for calculating evaluation metrics and creating an
   * [Evaluation][google.cloud.datalabeling.v1beta1.Evaluation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.EvaluationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.EvaluationConfig)
      com.google.cloud.datalabeling.v1beta1.EvaluationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.EvaluationConfig.class, com.google.cloud.datalabeling.v1beta1.EvaluationConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.EvaluationConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (boundingBoxEvaluationOptionsBuilder_ != null) {
        boundingBoxEvaluationOptionsBuilder_.clear();
      }
      verticalOptionCase_ = 0;
      verticalOption_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationConfig getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationConfig build() {
      com.google.cloud.datalabeling.v1beta1.EvaluationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EvaluationConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.EvaluationConfig result = new com.google.cloud.datalabeling.v1beta1.EvaluationConfig(this);
      if (verticalOptionCase_ == 1) {
        if (boundingBoxEvaluationOptionsBuilder_ == null) {
          result.verticalOption_ = verticalOption_;
        } else {
          result.verticalOption_ = boundingBoxEvaluationOptionsBuilder_.build();
        }
      }
      result.verticalOptionCase_ = verticalOptionCase_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.EvaluationConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.EvaluationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.EvaluationConfig other) {
      if (other == com.google.cloud.datalabeling.v1beta1.EvaluationConfig.getDefaultInstance()) return this;
      switch (other.getVerticalOptionCase()) {
        case BOUNDING_BOX_EVALUATION_OPTIONS: {
          mergeBoundingBoxEvaluationOptions(other.getBoundingBoxEvaluationOptions());
          break;
        }
        case VERTICALOPTION_NOT_SET: {
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
            case 10: {
              input.readMessage(
                  getBoundingBoxEvaluationOptionsFieldBuilder().getBuilder(),
                  extensionRegistry);
              verticalOptionCase_ = 1;
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
    private int verticalOptionCase_ = 0;
    private java.lang.Object verticalOption_;
    public VerticalOptionCase
        getVerticalOptionCase() {
      return VerticalOptionCase.forNumber(
          verticalOptionCase_);
    }

    public Builder clearVerticalOption() {
      verticalOptionCase_ = 0;
      verticalOption_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder> boundingBoxEvaluationOptionsBuilder_;
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     * @return Whether the boundingBoxEvaluationOptions field is set.
     */
    @java.lang.Override
    public boolean hasBoundingBoxEvaluationOptions() {
      return verticalOptionCase_ == 1;
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     * @return The boundingBoxEvaluationOptions.
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions getBoundingBoxEvaluationOptions() {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        if (verticalOptionCase_ == 1) {
          return (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_;
        }
        return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
      } else {
        if (verticalOptionCase_ == 1) {
          return boundingBoxEvaluationOptionsBuilder_.getMessage();
        }
        return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    public Builder setBoundingBoxEvaluationOptions(com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions value) {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        verticalOption_ = value;
        onChanged();
      } else {
        boundingBoxEvaluationOptionsBuilder_.setMessage(value);
      }
      verticalOptionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    public Builder setBoundingBoxEvaluationOptions(
        com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder builderForValue) {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        verticalOption_ = builderForValue.build();
        onChanged();
      } else {
        boundingBoxEvaluationOptionsBuilder_.setMessage(builderForValue.build());
      }
      verticalOptionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    public Builder mergeBoundingBoxEvaluationOptions(com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions value) {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        if (verticalOptionCase_ == 1 &&
            verticalOption_ != com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance()) {
          verticalOption_ = com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.newBuilder((com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_)
              .mergeFrom(value).buildPartial();
        } else {
          verticalOption_ = value;
        }
        onChanged();
      } else {
        if (verticalOptionCase_ == 1) {
          boundingBoxEvaluationOptionsBuilder_.mergeFrom(value);
        } else {
          boundingBoxEvaluationOptionsBuilder_.setMessage(value);
        }
      }
      verticalOptionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    public Builder clearBoundingBoxEvaluationOptions() {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        if (verticalOptionCase_ == 1) {
          verticalOptionCase_ = 0;
          verticalOption_ = null;
          onChanged();
        }
      } else {
        if (verticalOptionCase_ == 1) {
          verticalOptionCase_ = 0;
          verticalOption_ = null;
        }
        boundingBoxEvaluationOptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder getBoundingBoxEvaluationOptionsBuilder() {
      return getBoundingBoxEvaluationOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder getBoundingBoxEvaluationOptionsOrBuilder() {
      if ((verticalOptionCase_ == 1) && (boundingBoxEvaluationOptionsBuilder_ != null)) {
        return boundingBoxEvaluationOptionsBuilder_.getMessageOrBuilder();
      } else {
        if (verticalOptionCase_ == 1) {
          return (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_;
        }
        return com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Only specify this field if the related model performs image object
     * detection (`IMAGE_BOUNDING_BOX_ANNOTATION`). Describes how to evaluate
     * bounding boxes.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions bounding_box_evaluation_options = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder> 
        getBoundingBoxEvaluationOptionsFieldBuilder() {
      if (boundingBoxEvaluationOptionsBuilder_ == null) {
        if (!(verticalOptionCase_ == 1)) {
          verticalOption_ = com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.getDefaultInstance();
        }
        boundingBoxEvaluationOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions.Builder, com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptionsOrBuilder>(
                (com.google.cloud.datalabeling.v1beta1.BoundingBoxEvaluationOptions) verticalOption_,
                getParentForChildren(),
                isClean());
        verticalOption_ = null;
      }
      verticalOptionCase_ = 1;
      onChanged();;
      return boundingBoxEvaluationOptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.EvaluationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.EvaluationConfig)
  private static final com.google.cloud.datalabeling.v1beta1.EvaluationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.EvaluationConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.EvaluationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluationConfig>
      PARSER = new com.google.protobuf.AbstractParser<EvaluationConfig>() {
    @java.lang.Override
    public EvaluationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

