// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata}
 */
public final class AutoMlImageClassificationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)
    AutoMlImageClassificationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoMlImageClassificationMetadata.newBuilder() to construct.
  private AutoMlImageClassificationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoMlImageClassificationMetadata() {
    successfulStopReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoMlImageClassificationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.Builder.class);
  }

  /**
   * Protobuf enum {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason}
   */
  public enum SuccessfulStopReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>SUCCESSFUL_STOP_REASON_UNSPECIFIED = 0;</code>
     */
    SUCCESSFUL_STOP_REASON_UNSPECIFIED(0),
    /**
     * <pre>
     * The inputs.budgetMilliNodeHours had been reached.
     * </pre>
     *
     * <code>BUDGET_REACHED = 1;</code>
     */
    BUDGET_REACHED(1),
    /**
     * <pre>
     * Further training of the Model ceased to increase its quality, since it
     * already has converged.
     * </pre>
     *
     * <code>MODEL_CONVERGED = 2;</code>
     */
    MODEL_CONVERGED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Should not be set.
     * </pre>
     *
     * <code>SUCCESSFUL_STOP_REASON_UNSPECIFIED = 0;</code>
     */
    public static final int SUCCESSFUL_STOP_REASON_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The inputs.budgetMilliNodeHours had been reached.
     * </pre>
     *
     * <code>BUDGET_REACHED = 1;</code>
     */
    public static final int BUDGET_REACHED_VALUE = 1;
    /**
     * <pre>
     * Further training of the Model ceased to increase its quality, since it
     * already has converged.
     * </pre>
     *
     * <code>MODEL_CONVERGED = 2;</code>
     */
    public static final int MODEL_CONVERGED_VALUE = 2;


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
    public static SuccessfulStopReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SuccessfulStopReason forNumber(int value) {
      switch (value) {
        case 0: return SUCCESSFUL_STOP_REASON_UNSPECIFIED;
        case 1: return BUDGET_REACHED;
        case 2: return MODEL_CONVERGED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SuccessfulStopReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SuccessfulStopReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SuccessfulStopReason>() {
            public SuccessfulStopReason findValueByNumber(int number) {
              return SuccessfulStopReason.forNumber(number);
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
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final SuccessfulStopReason[] VALUES = values();

    public static SuccessfulStopReason valueOf(
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

    private SuccessfulStopReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason)
  }

  public static final int COST_MILLI_NODE_HOURS_FIELD_NUMBER = 1;
  private long costMilliNodeHours_;
  /**
   * <pre>
   * The actual training cost of creating this model, expressed in
   * milli node hours, i.e. 1,000 value in this field means 1 node hour.
   * Guaranteed to not exceed inputs.budgetMilliNodeHours.
   * </pre>
   *
   * <code>int64 cost_milli_node_hours = 1;</code>
   * @return The costMilliNodeHours.
   */
  @java.lang.Override
  public long getCostMilliNodeHours() {
    return costMilliNodeHours_;
  }

  public static final int SUCCESSFUL_STOP_REASON_FIELD_NUMBER = 2;
  private int successfulStopReason_;
  /**
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
   * @return The enum numeric value on the wire for successfulStopReason.
   */
  @java.lang.Override public int getSuccessfulStopReasonValue() {
    return successfulStopReason_;
  }
  /**
   * <pre>
   * For successful job completions, this is the reason why the job has
   * finished.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
   * @return The successfulStopReason.
   */
  @java.lang.Override public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason getSuccessfulStopReason() {
    @SuppressWarnings("deprecation")
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason result = com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.valueOf(successfulStopReason_);
    return result == null ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.UNRECOGNIZED : result;
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
    if (costMilliNodeHours_ != 0L) {
      output.writeInt64(1, costMilliNodeHours_);
    }
    if (successfulStopReason_ != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.SUCCESSFUL_STOP_REASON_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, successfulStopReason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (costMilliNodeHours_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, costMilliNodeHours_);
    }
    if (successfulStopReason_ != com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.SUCCESSFUL_STOP_REASON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, successfulStopReason_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata other = (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata) obj;

    if (getCostMilliNodeHours()
        != other.getCostMilliNodeHours()) return false;
    if (successfulStopReason_ != other.successfulStopReason_) return false;
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
    hash = (37 * hash) + COST_MILLI_NODE_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCostMilliNodeHours());
    hash = (37 * hash) + SUCCESSFUL_STOP_REASON_FIELD_NUMBER;
    hash = (53 * hash) + successfulStopReason_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata prototype) {
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
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      costMilliNodeHours_ = 0L;

      successfulStopReason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLImageClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata result = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata(this);
      result.costMilliNodeHours_ = costMilliNodeHours_;
      result.successfulStopReason_ = successfulStopReason_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.getDefaultInstance()) return this;
      if (other.getCostMilliNodeHours() != 0L) {
        setCostMilliNodeHours(other.getCostMilliNodeHours());
      }
      if (other.successfulStopReason_ != 0) {
        setSuccessfulStopReasonValue(other.getSuccessfulStopReasonValue());
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
              costMilliNodeHours_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              successfulStopReason_ = input.readEnum();

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

    private long costMilliNodeHours_ ;
    /**
     * <pre>
     * The actual training cost of creating this model, expressed in
     * milli node hours, i.e. 1,000 value in this field means 1 node hour.
     * Guaranteed to not exceed inputs.budgetMilliNodeHours.
     * </pre>
     *
     * <code>int64 cost_milli_node_hours = 1;</code>
     * @return The costMilliNodeHours.
     */
    @java.lang.Override
    public long getCostMilliNodeHours() {
      return costMilliNodeHours_;
    }
    /**
     * <pre>
     * The actual training cost of creating this model, expressed in
     * milli node hours, i.e. 1,000 value in this field means 1 node hour.
     * Guaranteed to not exceed inputs.budgetMilliNodeHours.
     * </pre>
     *
     * <code>int64 cost_milli_node_hours = 1;</code>
     * @param value The costMilliNodeHours to set.
     * @return This builder for chaining.
     */
    public Builder setCostMilliNodeHours(long value) {
      
      costMilliNodeHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual training cost of creating this model, expressed in
     * milli node hours, i.e. 1,000 value in this field means 1 node hour.
     * Guaranteed to not exceed inputs.budgetMilliNodeHours.
     * </pre>
     *
     * <code>int64 cost_milli_node_hours = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCostMilliNodeHours() {
      
      costMilliNodeHours_ = 0L;
      onChanged();
      return this;
    }

    private int successfulStopReason_ = 0;
    /**
     * <pre>
     * For successful job completions, this is the reason why the job has
     * finished.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
     * @return The enum numeric value on the wire for successfulStopReason.
     */
    @java.lang.Override public int getSuccessfulStopReasonValue() {
      return successfulStopReason_;
    }
    /**
     * <pre>
     * For successful job completions, this is the reason why the job has
     * finished.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
     * @param value The enum numeric value on the wire for successfulStopReason to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfulStopReasonValue(int value) {
      
      successfulStopReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For successful job completions, this is the reason why the job has
     * finished.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
     * @return The successfulStopReason.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason getSuccessfulStopReason() {
      @SuppressWarnings("deprecation")
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason result = com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.valueOf(successfulStopReason_);
      return result == null ? com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * For successful job completions, this is the reason why the job has
     * finished.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
     * @param value The successfulStopReason to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfulStopReason(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      successfulStopReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For successful job completions, this is the reason why the job has
     * finished.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata.SuccessfulStopReason successful_stop_reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccessfulStopReason() {
      
      successfulStopReason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlImageClassificationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<AutoMlImageClassificationMetadata>() {
    @java.lang.Override
    public AutoMlImageClassificationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlImageClassificationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlImageClassificationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlImageClassificationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

