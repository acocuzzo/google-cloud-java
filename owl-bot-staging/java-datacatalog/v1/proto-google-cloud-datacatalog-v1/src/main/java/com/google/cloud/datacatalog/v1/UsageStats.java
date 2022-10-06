// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/usage.proto

package com.google.cloud.datacatalog.v1;

/**
 * <pre>
 * Detailed statistics on the entry's usage.
 * Usage statistics have the following limitations:
 * - Only BigQuery tables have them.
 * - They only include BigQuery query jobs.
 * - They might be underestimated because wildcard table references
 *   are not yet counted. For more information, see
 *   [Querying multiple tables using a wildcard table]
 *   (https://cloud.google.com/bigquery/docs/querying-wildcard-tables)
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UsageStats}
 */
public final class UsageStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UsageStats)
    UsageStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsageStats.newBuilder() to construct.
  private UsageStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsageStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsageStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1.Usage.internal_static_google_cloud_datacatalog_v1_UsageStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Usage.internal_static_google_cloud_datacatalog_v1_UsageStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UsageStats.class, com.google.cloud.datacatalog.v1.UsageStats.Builder.class);
  }

  public static final int TOTAL_COMPLETIONS_FIELD_NUMBER = 1;
  private float totalCompletions_;
  /**
   * <pre>
   * The number of successful uses of the underlying entry.
   * </pre>
   *
   * <code>float total_completions = 1;</code>
   * @return The totalCompletions.
   */
  @java.lang.Override
  public float getTotalCompletions() {
    return totalCompletions_;
  }

  public static final int TOTAL_FAILURES_FIELD_NUMBER = 2;
  private float totalFailures_;
  /**
   * <pre>
   * The number of failed attempts to use the underlying entry.
   * </pre>
   *
   * <code>float total_failures = 2;</code>
   * @return The totalFailures.
   */
  @java.lang.Override
  public float getTotalFailures() {
    return totalFailures_;
  }

  public static final int TOTAL_CANCELLATIONS_FIELD_NUMBER = 3;
  private float totalCancellations_;
  /**
   * <pre>
   * The number of cancelled attempts to use the underlying entry.
   * </pre>
   *
   * <code>float total_cancellations = 3;</code>
   * @return The totalCancellations.
   */
  @java.lang.Override
  public float getTotalCancellations() {
    return totalCancellations_;
  }

  public static final int TOTAL_EXECUTION_TIME_FOR_COMPLETIONS_MILLIS_FIELD_NUMBER = 4;
  private float totalExecutionTimeForCompletionsMillis_;
  /**
   * <pre>
   * Total time spent only on successful uses, in milliseconds.
   * </pre>
   *
   * <code>float total_execution_time_for_completions_millis = 4;</code>
   * @return The totalExecutionTimeForCompletionsMillis.
   */
  @java.lang.Override
  public float getTotalExecutionTimeForCompletionsMillis() {
    return totalExecutionTimeForCompletionsMillis_;
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
    if (java.lang.Float.floatToRawIntBits(totalCompletions_) != 0) {
      output.writeFloat(1, totalCompletions_);
    }
    if (java.lang.Float.floatToRawIntBits(totalFailures_) != 0) {
      output.writeFloat(2, totalFailures_);
    }
    if (java.lang.Float.floatToRawIntBits(totalCancellations_) != 0) {
      output.writeFloat(3, totalCancellations_);
    }
    if (java.lang.Float.floatToRawIntBits(totalExecutionTimeForCompletionsMillis_) != 0) {
      output.writeFloat(4, totalExecutionTimeForCompletionsMillis_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(totalCompletions_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, totalCompletions_);
    }
    if (java.lang.Float.floatToRawIntBits(totalFailures_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, totalFailures_);
    }
    if (java.lang.Float.floatToRawIntBits(totalCancellations_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, totalCancellations_);
    }
    if (java.lang.Float.floatToRawIntBits(totalExecutionTimeForCompletionsMillis_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, totalExecutionTimeForCompletionsMillis_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UsageStats)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UsageStats other = (com.google.cloud.datacatalog.v1.UsageStats) obj;

    if (java.lang.Float.floatToIntBits(getTotalCompletions())
        != java.lang.Float.floatToIntBits(
            other.getTotalCompletions())) return false;
    if (java.lang.Float.floatToIntBits(getTotalFailures())
        != java.lang.Float.floatToIntBits(
            other.getTotalFailures())) return false;
    if (java.lang.Float.floatToIntBits(getTotalCancellations())
        != java.lang.Float.floatToIntBits(
            other.getTotalCancellations())) return false;
    if (java.lang.Float.floatToIntBits(getTotalExecutionTimeForCompletionsMillis())
        != java.lang.Float.floatToIntBits(
            other.getTotalExecutionTimeForCompletionsMillis())) return false;
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
    hash = (37 * hash) + TOTAL_COMPLETIONS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalCompletions());
    hash = (37 * hash) + TOTAL_FAILURES_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalFailures());
    hash = (37 * hash) + TOTAL_CANCELLATIONS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalCancellations());
    hash = (37 * hash) + TOTAL_EXECUTION_TIME_FOR_COMPLETIONS_MILLIS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalExecutionTimeForCompletionsMillis());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1.UsageStats parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1.UsageStats prototype) {
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
   * Detailed statistics on the entry's usage.
   * Usage statistics have the following limitations:
   * - Only BigQuery tables have them.
   * - They only include BigQuery query jobs.
   * - They might be underestimated because wildcard table references
   *   are not yet counted. For more information, see
   *   [Querying multiple tables using a wildcard table]
   *   (https://cloud.google.com/bigquery/docs/querying-wildcard-tables)
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UsageStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UsageStats)
      com.google.cloud.datacatalog.v1.UsageStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1.Usage.internal_static_google_cloud_datacatalog_v1_UsageStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Usage.internal_static_google_cloud_datacatalog_v1_UsageStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UsageStats.class, com.google.cloud.datacatalog.v1.UsageStats.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UsageStats.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      totalCompletions_ = 0F;

      totalFailures_ = 0F;

      totalCancellations_ = 0F;

      totalExecutionTimeForCompletionsMillis_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Usage.internal_static_google_cloud_datacatalog_v1_UsageStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageStats getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UsageStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageStats build() {
      com.google.cloud.datacatalog.v1.UsageStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageStats buildPartial() {
      com.google.cloud.datacatalog.v1.UsageStats result = new com.google.cloud.datacatalog.v1.UsageStats(this);
      result.totalCompletions_ = totalCompletions_;
      result.totalFailures_ = totalFailures_;
      result.totalCancellations_ = totalCancellations_;
      result.totalExecutionTimeForCompletionsMillis_ = totalExecutionTimeForCompletionsMillis_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.UsageStats) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UsageStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UsageStats other) {
      if (other == com.google.cloud.datacatalog.v1.UsageStats.getDefaultInstance()) return this;
      if (other.getTotalCompletions() != 0F) {
        setTotalCompletions(other.getTotalCompletions());
      }
      if (other.getTotalFailures() != 0F) {
        setTotalFailures(other.getTotalFailures());
      }
      if (other.getTotalCancellations() != 0F) {
        setTotalCancellations(other.getTotalCancellations());
      }
      if (other.getTotalExecutionTimeForCompletionsMillis() != 0F) {
        setTotalExecutionTimeForCompletionsMillis(other.getTotalExecutionTimeForCompletionsMillis());
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
              totalCompletions_ = input.readFloat();

              break;
            } // case 13
            case 21: {
              totalFailures_ = input.readFloat();

              break;
            } // case 21
            case 29: {
              totalCancellations_ = input.readFloat();

              break;
            } // case 29
            case 37: {
              totalExecutionTimeForCompletionsMillis_ = input.readFloat();

              break;
            } // case 37
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

    private float totalCompletions_ ;
    /**
     * <pre>
     * The number of successful uses of the underlying entry.
     * </pre>
     *
     * <code>float total_completions = 1;</code>
     * @return The totalCompletions.
     */
    @java.lang.Override
    public float getTotalCompletions() {
      return totalCompletions_;
    }
    /**
     * <pre>
     * The number of successful uses of the underlying entry.
     * </pre>
     *
     * <code>float total_completions = 1;</code>
     * @param value The totalCompletions to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCompletions(float value) {
      
      totalCompletions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of successful uses of the underlying entry.
     * </pre>
     *
     * <code>float total_completions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCompletions() {
      
      totalCompletions_ = 0F;
      onChanged();
      return this;
    }

    private float totalFailures_ ;
    /**
     * <pre>
     * The number of failed attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_failures = 2;</code>
     * @return The totalFailures.
     */
    @java.lang.Override
    public float getTotalFailures() {
      return totalFailures_;
    }
    /**
     * <pre>
     * The number of failed attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_failures = 2;</code>
     * @param value The totalFailures to set.
     * @return This builder for chaining.
     */
    public Builder setTotalFailures(float value) {
      
      totalFailures_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of failed attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_failures = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalFailures() {
      
      totalFailures_ = 0F;
      onChanged();
      return this;
    }

    private float totalCancellations_ ;
    /**
     * <pre>
     * The number of cancelled attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_cancellations = 3;</code>
     * @return The totalCancellations.
     */
    @java.lang.Override
    public float getTotalCancellations() {
      return totalCancellations_;
    }
    /**
     * <pre>
     * The number of cancelled attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_cancellations = 3;</code>
     * @param value The totalCancellations to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCancellations(float value) {
      
      totalCancellations_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of cancelled attempts to use the underlying entry.
     * </pre>
     *
     * <code>float total_cancellations = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCancellations() {
      
      totalCancellations_ = 0F;
      onChanged();
      return this;
    }

    private float totalExecutionTimeForCompletionsMillis_ ;
    /**
     * <pre>
     * Total time spent only on successful uses, in milliseconds.
     * </pre>
     *
     * <code>float total_execution_time_for_completions_millis = 4;</code>
     * @return The totalExecutionTimeForCompletionsMillis.
     */
    @java.lang.Override
    public float getTotalExecutionTimeForCompletionsMillis() {
      return totalExecutionTimeForCompletionsMillis_;
    }
    /**
     * <pre>
     * Total time spent only on successful uses, in milliseconds.
     * </pre>
     *
     * <code>float total_execution_time_for_completions_millis = 4;</code>
     * @param value The totalExecutionTimeForCompletionsMillis to set.
     * @return This builder for chaining.
     */
    public Builder setTotalExecutionTimeForCompletionsMillis(float value) {
      
      totalExecutionTimeForCompletionsMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total time spent only on successful uses, in milliseconds.
     * </pre>
     *
     * <code>float total_execution_time_for_completions_millis = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalExecutionTimeForCompletionsMillis() {
      
      totalExecutionTimeForCompletionsMillis_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UsageStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UsageStats)
  private static final com.google.cloud.datacatalog.v1.UsageStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UsageStats();
  }

  public static com.google.cloud.datacatalog.v1.UsageStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageStats>
      PARSER = new com.google.protobuf.AbstractParser<UsageStats>() {
    @java.lang.Override
    public UsageStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UsageStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

