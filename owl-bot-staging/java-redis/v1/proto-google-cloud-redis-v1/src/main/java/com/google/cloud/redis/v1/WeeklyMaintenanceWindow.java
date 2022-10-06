// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

/**
 * <pre>
 * Time window in which disruptive maintenance updates occur. Non-disruptive
 * updates can occur inside or outside this window.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1.WeeklyMaintenanceWindow}
 */
public final class WeeklyMaintenanceWindow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1.WeeklyMaintenanceWindow)
    WeeklyMaintenanceWindowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeeklyMaintenanceWindow.newBuilder() to construct.
  private WeeklyMaintenanceWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeeklyMaintenanceWindow() {
    day_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeeklyMaintenanceWindow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto.internal_static_google_cloud_redis_v1_WeeklyMaintenanceWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto.internal_static_google_cloud_redis_v1_WeeklyMaintenanceWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1.WeeklyMaintenanceWindow.class, com.google.cloud.redis.v1.WeeklyMaintenanceWindow.Builder.class);
  }

  public static final int DAY_FIELD_NUMBER = 1;
  private int day_;
  /**
   * <pre>
   * Required. The day of week that maintenance updates occur.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for day.
   */
  @java.lang.Override public int getDayValue() {
    return day_;
  }
  /**
   * <pre>
   * Required. The day of week that maintenance updates occur.
   * </pre>
   *
   * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The day.
   */
  @java.lang.Override public com.google.type.DayOfWeek getDay() {
    @SuppressWarnings("deprecation")
    com.google.type.DayOfWeek result = com.google.type.DayOfWeek.valueOf(day_);
    return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.type.TimeOfDay startTime_;
  /**
   * <pre>
   * Required. Start time of the window in UTC time.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <pre>
   * Required. Start time of the window in UTC time.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.type.TimeOfDay getStartTime() {
    return startTime_ == null ? com.google.type.TimeOfDay.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * Required. Start time of the window in UTC time.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.type.TimeOfDayOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration duration_;
  /**
   * <pre>
   * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <pre>
   * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The duration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <pre>
   * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
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
    if (day_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, day_);
    }
    if (startTime_ != null) {
      output.writeMessage(2, getStartTime());
    }
    if (duration_ != null) {
      output.writeMessage(3, getDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (day_ != com.google.type.DayOfWeek.DAY_OF_WEEK_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, day_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartTime());
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDuration());
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
    if (!(obj instanceof com.google.cloud.redis.v1.WeeklyMaintenanceWindow)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1.WeeklyMaintenanceWindow other = (com.google.cloud.redis.v1.WeeklyMaintenanceWindow) obj;

    if (day_ != other.day_) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
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
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + day_;
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow parseFrom(
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
  public static Builder newBuilder(com.google.cloud.redis.v1.WeeklyMaintenanceWindow prototype) {
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
   * Time window in which disruptive maintenance updates occur. Non-disruptive
   * updates can occur inside or outside this window.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1.WeeklyMaintenanceWindow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1.WeeklyMaintenanceWindow)
      com.google.cloud.redis.v1.WeeklyMaintenanceWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto.internal_static_google_cloud_redis_v1_WeeklyMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto.internal_static_google_cloud_redis_v1_WeeklyMaintenanceWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1.WeeklyMaintenanceWindow.class, com.google.cloud.redis.v1.WeeklyMaintenanceWindow.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1.WeeklyMaintenanceWindow.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      day_ = 0;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto.internal_static_google_cloud_redis_v1_WeeklyMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.WeeklyMaintenanceWindow getDefaultInstanceForType() {
      return com.google.cloud.redis.v1.WeeklyMaintenanceWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.WeeklyMaintenanceWindow build() {
      com.google.cloud.redis.v1.WeeklyMaintenanceWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.WeeklyMaintenanceWindow buildPartial() {
      com.google.cloud.redis.v1.WeeklyMaintenanceWindow result = new com.google.cloud.redis.v1.WeeklyMaintenanceWindow(this);
      result.day_ = day_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
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
      if (other instanceof com.google.cloud.redis.v1.WeeklyMaintenanceWindow) {
        return mergeFrom((com.google.cloud.redis.v1.WeeklyMaintenanceWindow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1.WeeklyMaintenanceWindow other) {
      if (other == com.google.cloud.redis.v1.WeeklyMaintenanceWindow.getDefaultInstance()) return this;
      if (other.day_ != 0) {
        setDayValue(other.getDayValue());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
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
              day_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStartTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDurationFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private int day_ = 0;
    /**
     * <pre>
     * Required. The day of week that maintenance updates occur.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for day.
     */
    @java.lang.Override public int getDayValue() {
      return day_;
    }
    /**
     * <pre>
     * Required. The day of week that maintenance updates occur.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for day to set.
     * @return This builder for chaining.
     */
    public Builder setDayValue(int value) {
      
      day_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The day of week that maintenance updates occur.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The day.
     */
    @java.lang.Override
    public com.google.type.DayOfWeek getDay() {
      @SuppressWarnings("deprecation")
      com.google.type.DayOfWeek result = com.google.type.DayOfWeek.valueOf(day_);
      return result == null ? com.google.type.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The day of week that maintenance updates occur.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The day to set.
     * @return This builder for chaining.
     */
    public Builder setDay(com.google.type.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      day_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The day of week that maintenance updates occur.
     * </pre>
     *
     * <code>.google.type.DayOfWeek day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDay() {
      
      day_ = 0;
      onChanged();
      return this;
    }

    private com.google.type.TimeOfDay startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.TimeOfDay, com.google.type.TimeOfDay.Builder, com.google.type.TimeOfDayOrBuilder> startTimeBuilder_;
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The startTime.
     */
    public com.google.type.TimeOfDay getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.type.TimeOfDay.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStartTime(com.google.type.TimeOfDay value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setStartTime(
        com.google.type.TimeOfDay.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeStartTime(com.google.type.TimeOfDay value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
            com.google.type.TimeOfDay.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.type.TimeOfDay.Builder getStartTimeBuilder() {
      
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.type.TimeOfDayOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.type.TimeOfDay.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <pre>
     * Required. Start time of the window in UTC time.
     * </pre>
     *
     * <code>.google.type.TimeOfDay start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.TimeOfDay, com.google.type.TimeOfDay.Builder, com.google.type.TimeOfDayOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.TimeOfDay, com.google.type.TimeOfDay.Builder, com.google.type.TimeOfDayOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
            com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <pre>
     * Output only. Duration of the maintenance window. The current window is fixed at 1 hour.
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1.WeeklyMaintenanceWindow)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1.WeeklyMaintenanceWindow)
  private static final com.google.cloud.redis.v1.WeeklyMaintenanceWindow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1.WeeklyMaintenanceWindow();
  }

  public static com.google.cloud.redis.v1.WeeklyMaintenanceWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeeklyMaintenanceWindow>
      PARSER = new com.google.protobuf.AbstractParser<WeeklyMaintenanceWindow>() {
    @java.lang.Override
    public WeeklyMaintenanceWindow parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeeklyMaintenanceWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeeklyMaintenanceWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1.WeeklyMaintenanceWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

