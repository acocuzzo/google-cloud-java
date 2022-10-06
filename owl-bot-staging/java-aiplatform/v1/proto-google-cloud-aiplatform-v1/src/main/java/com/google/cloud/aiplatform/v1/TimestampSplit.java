// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Assigns input data to training, validation, and test sets based on a
 * provided timestamps. The youngest data pieces are assigned to training set,
 * next to validation set, and the oldest to the test set.
 * Supported only for tabular Datasets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.TimestampSplit}
 */
public final class TimestampSplit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.TimestampSplit)
    TimestampSplitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimestampSplit.newBuilder() to construct.
  private TimestampSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimestampSplit() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimestampSplit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_TimestampSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.TimestampSplit.class, com.google.cloud.aiplatform.v1.TimestampSplit.Builder.class);
  }

  public static final int TRAINING_FRACTION_FIELD_NUMBER = 1;
  private double trainingFraction_;
  /**
   * <pre>
   * The fraction of the input data that is to be used to train the Model.
   * </pre>
   *
   * <code>double training_fraction = 1;</code>
   * @return The trainingFraction.
   */
  @java.lang.Override
  public double getTrainingFraction() {
    return trainingFraction_;
  }

  public static final int VALIDATION_FRACTION_FIELD_NUMBER = 2;
  private double validationFraction_;
  /**
   * <pre>
   * The fraction of the input data that is to be used to validate the Model.
   * </pre>
   *
   * <code>double validation_fraction = 2;</code>
   * @return The validationFraction.
   */
  @java.lang.Override
  public double getValidationFraction() {
    return validationFraction_;
  }

  public static final int TEST_FRACTION_FIELD_NUMBER = 3;
  private double testFraction_;
  /**
   * <pre>
   * The fraction of the input data that is to be used to evaluate the Model.
   * </pre>
   *
   * <code>double test_fraction = 3;</code>
   * @return The testFraction.
   */
  @java.lang.Override
  public double getTestFraction() {
    return testFraction_;
  }

  public static final int KEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The values of the key (the values in the column) must be in RFC 3339
   * `date-time` format, where `time-offset` = `"Z"`
   * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
   * present or has an invalid value, that piece is ignored by the pipeline.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The values of the key (the values in the column) must be in RFC 3339
   * `date-time` format, where `time-offset` = `"Z"`
   * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
   * present or has an invalid value, that piece is ignored by the pipeline.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
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
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      output.writeDouble(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      output.writeDouble(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      output.writeDouble(3, testFraction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, testFraction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, key_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.TimestampSplit)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.TimestampSplit other = (com.google.cloud.aiplatform.v1.TimestampSplit) obj;

    if (java.lang.Double.doubleToLongBits(getTrainingFraction())
        != java.lang.Double.doubleToLongBits(
            other.getTrainingFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getValidationFraction())
        != java.lang.Double.doubleToLongBits(
            other.getValidationFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getTestFraction())
        != java.lang.Double.doubleToLongBits(
            other.getTestFraction())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
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
    hash = (37 * hash) + TRAINING_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTrainingFraction()));
    hash = (37 * hash) + VALIDATION_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValidationFraction()));
    hash = (37 * hash) + TEST_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTestFraction()));
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.TimestampSplit parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.TimestampSplit prototype) {
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
   * Assigns input data to training, validation, and test sets based on a
   * provided timestamps. The youngest data pieces are assigned to training set,
   * next to validation set, and the oldest to the test set.
   * Supported only for tabular Datasets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.TimestampSplit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.TimestampSplit)
      com.google.cloud.aiplatform.v1.TimestampSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_TimestampSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.TimestampSplit.class, com.google.cloud.aiplatform.v1.TimestampSplit.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.TimestampSplit.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trainingFraction_ = 0D;

      validationFraction_ = 0D;

      testFraction_ = 0D;

      key_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto.internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TimestampSplit getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.TimestampSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TimestampSplit build() {
      com.google.cloud.aiplatform.v1.TimestampSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.TimestampSplit buildPartial() {
      com.google.cloud.aiplatform.v1.TimestampSplit result = new com.google.cloud.aiplatform.v1.TimestampSplit(this);
      result.trainingFraction_ = trainingFraction_;
      result.validationFraction_ = validationFraction_;
      result.testFraction_ = testFraction_;
      result.key_ = key_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.TimestampSplit) {
        return mergeFrom((com.google.cloud.aiplatform.v1.TimestampSplit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.TimestampSplit other) {
      if (other == com.google.cloud.aiplatform.v1.TimestampSplit.getDefaultInstance()) return this;
      if (other.getTrainingFraction() != 0D) {
        setTrainingFraction(other.getTrainingFraction());
      }
      if (other.getValidationFraction() != 0D) {
        setValidationFraction(other.getValidationFraction());
      }
      if (other.getTestFraction() != 0D) {
        setTestFraction(other.getTestFraction());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
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
            case 9: {
              trainingFraction_ = input.readDouble();

              break;
            } // case 9
            case 17: {
              validationFraction_ = input.readDouble();

              break;
            } // case 17
            case 25: {
              testFraction_ = input.readDouble();

              break;
            } // case 25
            case 34: {
              key_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private double trainingFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @return The trainingFraction.
     */
    @java.lang.Override
    public double getTrainingFraction() {
      return trainingFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @param value The trainingFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingFraction(double value) {
      
      trainingFraction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainingFraction() {
      
      trainingFraction_ = 0D;
      onChanged();
      return this;
    }

    private double validationFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @return The validationFraction.
     */
    @java.lang.Override
    public double getValidationFraction() {
      return validationFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @param value The validationFraction to set.
     * @return This builder for chaining.
     */
    public Builder setValidationFraction(double value) {
      
      validationFraction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidationFraction() {
      
      validationFraction_ = 0D;
      onChanged();
      return this;
    }

    private double testFraction_ ;
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @return The testFraction.
     */
    @java.lang.Override
    public double getTestFraction() {
      return testFraction_;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @param value The testFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTestFraction(double value) {
      
      testFraction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestFraction() {
      
      testFraction_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The values of the key (the values in the column) must be in RFC 3339
     * `date-time` format, where `time-offset` = `"Z"`
     * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
     * present or has an invalid value, that piece is ignored by the pipeline.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The values of the key (the values in the column) must be in RFC 3339
     * `date-time` format, where `time-offset` = `"Z"`
     * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
     * present or has an invalid value, that piece is ignored by the pipeline.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The values of the key (the values in the column) must be in RFC 3339
     * `date-time` format, where `time-offset` = `"Z"`
     * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
     * present or has an invalid value, that piece is ignored by the pipeline.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The values of the key (the values in the column) must be in RFC 3339
     * `date-time` format, where `time-offset` = `"Z"`
     * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
     * present or has an invalid value, that piece is ignored by the pipeline.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The values of the key (the values in the column) must be in RFC 3339
     * `date-time` format, where `time-offset` = `"Z"`
     * (e.g. 1985-04-12T23:20:50.52Z). If for a piece of data the key is not
     * present or has an invalid value, that piece is ignored by the pipeline.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.TimestampSplit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.TimestampSplit)
  private static final com.google.cloud.aiplatform.v1.TimestampSplit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.TimestampSplit();
  }

  public static com.google.cloud.aiplatform.v1.TimestampSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimestampSplit>
      PARSER = new com.google.protobuf.AbstractParser<TimestampSplit>() {
    @java.lang.Override
    public TimestampSplit parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimestampSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimestampSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.TimestampSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

