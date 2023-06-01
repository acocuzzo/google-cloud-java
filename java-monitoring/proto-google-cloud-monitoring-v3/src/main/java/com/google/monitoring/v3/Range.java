/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Range of numerical values within `min` and `max`.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.Range}
 */
public final class Range extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.Range)
    RangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Range.newBuilder() to construct.
  private Range(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Range() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Range();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_Range_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_Range_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.Range.class, com.google.monitoring.v3.Range.Builder.class);
  }

  public static final int MIN_FIELD_NUMBER = 1;
  private double min_ = 0D;
  /**
   *
   *
   * <pre>
   * Range minimum.
   * </pre>
   *
   * <code>double min = 1;</code>
   *
   * @return The min.
   */
  @java.lang.Override
  public double getMin() {
    return min_;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private double max_ = 0D;
  /**
   *
   *
   * <pre>
   * Range maximum.
   * </pre>
   *
   * <code>double max = 2;</code>
   *
   * @return The max.
   */
  @java.lang.Override
  public double getMax() {
    return max_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      output.writeDouble(1, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(max_) != 0) {
      output.writeDouble(2, max_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(max_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, max_);
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
    if (!(obj instanceof com.google.monitoring.v3.Range)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.Range other = (com.google.monitoring.v3.Range) obj;

    if (java.lang.Double.doubleToLongBits(getMin())
        != java.lang.Double.doubleToLongBits(other.getMin())) return false;
    if (java.lang.Double.doubleToLongBits(getMax())
        != java.lang.Double.doubleToLongBits(other.getMax())) return false;
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
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getMin()));
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getMax()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.Range parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Range parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Range parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Range parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Range parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Range parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Range parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Range parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.Range parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Range parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.Range parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Range parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.Range prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Range of numerical values within `min` and `max`.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.Range}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.Range)
      com.google.monitoring.v3.RangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_Range_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_Range_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.Range.class, com.google.monitoring.v3.Range.Builder.class);
    }

    // Construct using com.google.monitoring.v3.Range.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      min_ = 0D;
      max_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_Range_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.Range getDefaultInstanceForType() {
      return com.google.monitoring.v3.Range.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.Range build() {
      com.google.monitoring.v3.Range result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.Range buildPartial() {
      com.google.monitoring.v3.Range result = new com.google.monitoring.v3.Range(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.Range result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.min_ = min_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.max_ = max_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.Range) {
        return mergeFrom((com.google.monitoring.v3.Range) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.Range other) {
      if (other == com.google.monitoring.v3.Range.getDefaultInstance()) return this;
      if (other.getMin() != 0D) {
        setMin(other.getMin());
      }
      if (other.getMax() != 0D) {
        setMax(other.getMax());
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
            case 9:
              {
                min_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                max_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            default:
              {
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

    private int bitField0_;

    private double min_;
    /**
     *
     *
     * <pre>
     * Range minimum.
     * </pre>
     *
     * <code>double min = 1;</code>
     *
     * @return The min.
     */
    @java.lang.Override
    public double getMin() {
      return min_;
    }
    /**
     *
     *
     * <pre>
     * Range minimum.
     * </pre>
     *
     * <code>double min = 1;</code>
     *
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(double value) {

      min_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range minimum.
     * </pre>
     *
     * <code>double min = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      bitField0_ = (bitField0_ & ~0x00000001);
      min_ = 0D;
      onChanged();
      return this;
    }

    private double max_;
    /**
     *
     *
     * <pre>
     * Range maximum.
     * </pre>
     *
     * <code>double max = 2;</code>
     *
     * @return The max.
     */
    @java.lang.Override
    public double getMax() {
      return max_;
    }
    /**
     *
     *
     * <pre>
     * Range maximum.
     * </pre>
     *
     * <code>double max = 2;</code>
     *
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(double value) {

      max_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range maximum.
     * </pre>
     *
     * <code>double max = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      bitField0_ = (bitField0_ & ~0x00000002);
      max_ = 0D;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.Range)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.Range)
  private static final com.google.monitoring.v3.Range DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.Range();
  }

  public static com.google.monitoring.v3.Range getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Range> PARSER =
      new com.google.protobuf.AbstractParser<Range>() {
        @java.lang.Override
        public Range parsePartialFrom(
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

  public static com.google.protobuf.Parser<Range> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Range> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.Range getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
