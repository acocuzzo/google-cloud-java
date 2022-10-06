// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto

package com.google.cloud.networkmanagement.v1beta1;

/**
 * <pre>
 * Latency percentile rank and value.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1beta1.LatencyPercentile}
 */
public final class LatencyPercentile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1beta1.LatencyPercentile)
    LatencyPercentileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LatencyPercentile.newBuilder() to construct.
  private LatencyPercentile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LatencyPercentile() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LatencyPercentile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networkmanagement.v1beta1.TestOuterClass.internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1beta1.TestOuterClass.internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.class, com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder.class);
  }

  public static final int PERCENT_FIELD_NUMBER = 1;
  private int percent_;
  /**
   * <pre>
   * Percentage of samples this data point applies to.
   * </pre>
   *
   * <code>int32 percent = 1;</code>
   * @return The percent.
   */
  @java.lang.Override
  public int getPercent() {
    return percent_;
  }

  public static final int LATENCY_MICROS_FIELD_NUMBER = 2;
  private long latencyMicros_;
  /**
   * <pre>
   * percent-th percentile of latency observed, in microseconds.
   * Fraction of percent/100 of samples have latency lower or
   * equal to the value of this field.
   * </pre>
   *
   * <code>int64 latency_micros = 2;</code>
   * @return The latencyMicros.
   */
  @java.lang.Override
  public long getLatencyMicros() {
    return latencyMicros_;
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
    if (percent_ != 0) {
      output.writeInt32(1, percent_);
    }
    if (latencyMicros_ != 0L) {
      output.writeInt64(2, latencyMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (percent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, percent_);
    }
    if (latencyMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, latencyMicros_);
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1beta1.LatencyPercentile)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1beta1.LatencyPercentile other = (com.google.cloud.networkmanagement.v1beta1.LatencyPercentile) obj;

    if (getPercent()
        != other.getPercent()) return false;
    if (getLatencyMicros()
        != other.getLatencyMicros()) return false;
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
    hash = (37 * hash) + PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getPercent();
    hash = (37 * hash) + LATENCY_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLatencyMicros());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networkmanagement.v1beta1.LatencyPercentile prototype) {
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
   * Latency percentile rank and value.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1beta1.LatencyPercentile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1beta1.LatencyPercentile)
      com.google.cloud.networkmanagement.v1beta1.LatencyPercentileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass.internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass.internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.class, com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      percent_ = 0;

      latencyMicros_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1beta1.TestOuterClass.internal_static_google_cloud_networkmanagement_v1beta1_LatencyPercentile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile build() {
      com.google.cloud.networkmanagement.v1beta1.LatencyPercentile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile buildPartial() {
      com.google.cloud.networkmanagement.v1beta1.LatencyPercentile result = new com.google.cloud.networkmanagement.v1beta1.LatencyPercentile(this);
      result.percent_ = percent_;
      result.latencyMicros_ = latencyMicros_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1beta1.LatencyPercentile) {
        return mergeFrom((com.google.cloud.networkmanagement.v1beta1.LatencyPercentile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1beta1.LatencyPercentile other) {
      if (other == com.google.cloud.networkmanagement.v1beta1.LatencyPercentile.getDefaultInstance()) return this;
      if (other.getPercent() != 0) {
        setPercent(other.getPercent());
      }
      if (other.getLatencyMicros() != 0L) {
        setLatencyMicros(other.getLatencyMicros());
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
              percent_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              latencyMicros_ = input.readInt64();

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

    private int percent_ ;
    /**
     * <pre>
     * Percentage of samples this data point applies to.
     * </pre>
     *
     * <code>int32 percent = 1;</code>
     * @return The percent.
     */
    @java.lang.Override
    public int getPercent() {
      return percent_;
    }
    /**
     * <pre>
     * Percentage of samples this data point applies to.
     * </pre>
     *
     * <code>int32 percent = 1;</code>
     * @param value The percent to set.
     * @return This builder for chaining.
     */
    public Builder setPercent(int value) {
      
      percent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Percentage of samples this data point applies to.
     * </pre>
     *
     * <code>int32 percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercent() {
      
      percent_ = 0;
      onChanged();
      return this;
    }

    private long latencyMicros_ ;
    /**
     * <pre>
     * percent-th percentile of latency observed, in microseconds.
     * Fraction of percent/100 of samples have latency lower or
     * equal to the value of this field.
     * </pre>
     *
     * <code>int64 latency_micros = 2;</code>
     * @return The latencyMicros.
     */
    @java.lang.Override
    public long getLatencyMicros() {
      return latencyMicros_;
    }
    /**
     * <pre>
     * percent-th percentile of latency observed, in microseconds.
     * Fraction of percent/100 of samples have latency lower or
     * equal to the value of this field.
     * </pre>
     *
     * <code>int64 latency_micros = 2;</code>
     * @param value The latencyMicros to set.
     * @return This builder for chaining.
     */
    public Builder setLatencyMicros(long value) {
      
      latencyMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * percent-th percentile of latency observed, in microseconds.
     * Fraction of percent/100 of samples have latency lower or
     * equal to the value of this field.
     * </pre>
     *
     * <code>int64 latency_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatencyMicros() {
      
      latencyMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1beta1.LatencyPercentile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1beta1.LatencyPercentile)
  private static final com.google.cloud.networkmanagement.v1beta1.LatencyPercentile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1beta1.LatencyPercentile();
  }

  public static com.google.cloud.networkmanagement.v1beta1.LatencyPercentile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatencyPercentile>
      PARSER = new com.google.protobuf.AbstractParser<LatencyPercentile>() {
    @java.lang.Override
    public LatencyPercentile parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatencyPercentile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatencyPercentile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.LatencyPercentile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

