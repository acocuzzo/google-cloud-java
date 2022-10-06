// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_time_series_forecasting.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 * <pre>
 * Model metadata specific to AutoML Forecasting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata}
 */
public final class AutoMlForecastingMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)
    AutoMlForecastingMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoMlForecastingMetadata.newBuilder() to construct.
  private AutoMlForecastingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoMlForecastingMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoMlForecastingMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLForecastingProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLForecastingProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.Builder.class);
  }

  public static final int TRAIN_COST_MILLI_NODE_HOURS_FIELD_NUMBER = 1;
  private long trainCostMilliNodeHours_;
  /**
   * <pre>
   * Output only. The actual training cost of the model, expressed in milli
   * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
   * to not exceed the train budget.
   * </pre>
   *
   * <code>int64 train_cost_milli_node_hours = 1;</code>
   * @return The trainCostMilliNodeHours.
   */
  @java.lang.Override
  public long getTrainCostMilliNodeHours() {
    return trainCostMilliNodeHours_;
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
    if (trainCostMilliNodeHours_ != 0L) {
      output.writeInt64(1, trainCostMilliNodeHours_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainCostMilliNodeHours_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, trainCostMilliNodeHours_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata other = (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata) obj;

    if (getTrainCostMilliNodeHours()
        != other.getTrainCostMilliNodeHours()) return false;
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
    hash = (37 * hash) + TRAIN_COST_MILLI_NODE_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrainCostMilliNodeHours());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata prototype) {
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
   * Model metadata specific to AutoML Forecasting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLForecastingProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLForecastingProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trainCostMilliNodeHours_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLForecastingProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlForecastingMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata result = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata(this);
      result.trainCostMilliNodeHours_ = trainCostMilliNodeHours_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata.getDefaultInstance()) return this;
      if (other.getTrainCostMilliNodeHours() != 0L) {
        setTrainCostMilliNodeHours(other.getTrainCostMilliNodeHours());
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
            case 8: {
              trainCostMilliNodeHours_ = input.readInt64();

              break;
            } // case 8
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

    private long trainCostMilliNodeHours_ ;
    /**
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     * @return The trainCostMilliNodeHours.
     */
    @java.lang.Override
    public long getTrainCostMilliNodeHours() {
      return trainCostMilliNodeHours_;
    }
    /**
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     * @param value The trainCostMilliNodeHours to set.
     * @return This builder for chaining.
     */
    public Builder setTrainCostMilliNodeHours(long value) {
      
      trainCostMilliNodeHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The actual training cost of the model, expressed in milli
     * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
     * to not exceed the train budget.
     * </pre>
     *
     * <code>int64 train_cost_milli_node_hours = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainCostMilliNodeHours() {
      
      trainCostMilliNodeHours_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlForecastingMetadata>
      PARSER = new com.google.protobuf.AbstractParser<AutoMlForecastingMetadata>() {
    @java.lang.Override
    public AutoMlForecastingMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlForecastingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlForecastingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlForecastingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

