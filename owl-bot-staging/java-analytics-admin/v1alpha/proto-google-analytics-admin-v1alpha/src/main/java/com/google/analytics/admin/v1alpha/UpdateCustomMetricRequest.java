// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Request message for UpdateCustomMetric RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UpdateCustomMetricRequest}
 */
public final class UpdateCustomMetricRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UpdateCustomMetricRequest)
    UpdateCustomMetricRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCustomMetricRequest.newBuilder() to construct.
  private UpdateCustomMetricRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCustomMetricRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCustomMetricRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_UpdateCustomMetricRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_UpdateCustomMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.class, com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.Builder.class);
  }

  public static final int CUSTOM_METRIC_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.CustomMetric customMetric_;
  /**
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   * @return Whether the customMetric field is set.
   */
  @java.lang.Override
  public boolean hasCustomMetric() {
    return customMetric_ != null;
  }
  /**
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   * @return The customMetric.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric() {
    return customMetric_ == null ? com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance() : customMetric_;
  }
  /**
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder() {
    return getCustomMetric();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be updated.
   * To replace the entire entity, use one path with the string "*" to match
   * all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (customMetric_ != null) {
      output.writeMessage(1, getCustomMetric());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customMetric_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomMetric());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest other = (com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest) obj;

    if (hasCustomMetric() != other.hasCustomMetric()) return false;
    if (hasCustomMetric()) {
      if (!getCustomMetric()
          .equals(other.getCustomMetric())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasCustomMetric()) {
      hash = (37 * hash) + CUSTOM_METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getCustomMetric().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest prototype) {
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
   * Request message for UpdateCustomMetric RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UpdateCustomMetricRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UpdateCustomMetricRequest)
      com.google.analytics.admin.v1alpha.UpdateCustomMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_UpdateCustomMetricRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_UpdateCustomMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.class, com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (customMetricBuilder_ == null) {
        customMetric_ = null;
      } else {
        customMetric_ = null;
        customMetricBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_UpdateCustomMetricRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest build() {
      com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest buildPartial() {
      com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest result = new com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest(this);
      if (customMetricBuilder_ == null) {
        result.customMetric_ = customMetric_;
      } else {
        result.customMetric_ = customMetricBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest other) {
      if (other == com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest.getDefaultInstance()) return this;
      if (other.hasCustomMetric()) {
        mergeCustomMetric(other.getCustomMetric());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getCustomMetricFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private com.google.analytics.admin.v1alpha.CustomMetric customMetric_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.CustomMetric, com.google.analytics.admin.v1alpha.CustomMetric.Builder, com.google.analytics.admin.v1alpha.CustomMetricOrBuilder> customMetricBuilder_;
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     * @return Whether the customMetric field is set.
     */
    public boolean hasCustomMetric() {
      return customMetricBuilder_ != null || customMetric_ != null;
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     * @return The customMetric.
     */
    public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric() {
      if (customMetricBuilder_ == null) {
        return customMetric_ == null ? com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance() : customMetric_;
      } else {
        return customMetricBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public Builder setCustomMetric(com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customMetric_ = value;
        onChanged();
      } else {
        customMetricBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public Builder setCustomMetric(
        com.google.analytics.admin.v1alpha.CustomMetric.Builder builderForValue) {
      if (customMetricBuilder_ == null) {
        customMetric_ = builderForValue.build();
        onChanged();
      } else {
        customMetricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public Builder mergeCustomMetric(com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricBuilder_ == null) {
        if (customMetric_ != null) {
          customMetric_ =
            com.google.analytics.admin.v1alpha.CustomMetric.newBuilder(customMetric_).mergeFrom(value).buildPartial();
        } else {
          customMetric_ = value;
        }
        onChanged();
      } else {
        customMetricBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public Builder clearCustomMetric() {
      if (customMetricBuilder_ == null) {
        customMetric_ = null;
        onChanged();
      } else {
        customMetric_ = null;
        customMetricBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric.Builder getCustomMetricBuilder() {
      
      onChanged();
      return getCustomMetricFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder() {
      if (customMetricBuilder_ != null) {
        return customMetricBuilder_.getMessageOrBuilder();
      } else {
        return customMetric_ == null ?
            com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance() : customMetric_;
      }
    }
    /**
     * <pre>
     * The CustomMetric to update
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.CustomMetric, com.google.analytics.admin.v1alpha.CustomMetric.Builder, com.google.analytics.admin.v1alpha.CustomMetricOrBuilder> 
        getCustomMetricFieldBuilder() {
      if (customMetricBuilder_ == null) {
        customMetricBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomMetric, com.google.analytics.admin.v1alpha.CustomMetric.Builder, com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>(
                getCustomMetric(),
                getParentForChildren(),
                isClean());
        customMetric_ = null;
      }
      return customMetricBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The list of fields to be updated. Omitted fields will not be updated.
     * To replace the entire entity, use one path with the string "*" to match
     * all fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UpdateCustomMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UpdateCustomMetricRequest)
  private static final com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest();
  }

  public static com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCustomMetricRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCustomMetricRequest>() {
    @java.lang.Override
    public UpdateCustomMetricRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCustomMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCustomMetricRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

