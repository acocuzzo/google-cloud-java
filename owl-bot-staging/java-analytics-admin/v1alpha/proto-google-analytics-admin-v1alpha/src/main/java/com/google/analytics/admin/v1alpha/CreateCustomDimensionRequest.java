// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Request message for CreateCustomDimension RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateCustomDimensionRequest}
 */
public final class CreateCustomDimensionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateCustomDimensionRequest)
    CreateCustomDimensionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomDimensionRequest.newBuilder() to construct.
  private CreateCustomDimensionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomDimensionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomDimensionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateCustomDimensionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateCustomDimensionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.class, com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_DIMENSION_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.CustomDimension customDimension_;
  /**
   * <pre>
   * Required. The CustomDimension to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customDimension field is set.
   */
  @java.lang.Override
  public boolean hasCustomDimension() {
    return customDimension_ != null;
  }
  /**
   * <pre>
   * Required. The CustomDimension to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customDimension.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomDimension getCustomDimension() {
    return customDimension_ == null ? com.google.analytics.admin.v1alpha.CustomDimension.getDefaultInstance() : customDimension_;
  }
  /**
   * <pre>
   * Required. The CustomDimension to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder getCustomDimensionOrBuilder() {
    return getCustomDimension();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (customDimension_ != null) {
      output.writeMessage(2, getCustomDimension());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (customDimension_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCustomDimension());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest other = (com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasCustomDimension() != other.hasCustomDimension()) return false;
    if (hasCustomDimension()) {
      if (!getCustomDimension()
          .equals(other.getCustomDimension())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCustomDimension()) {
      hash = (37 * hash) + CUSTOM_DIMENSION_FIELD_NUMBER;
      hash = (53 * hash) + getCustomDimension().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest prototype) {
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
   * Request message for CreateCustomDimension RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateCustomDimensionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateCustomDimensionRequest)
      com.google.analytics.admin.v1alpha.CreateCustomDimensionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateCustomDimensionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateCustomDimensionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.class, com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (customDimensionBuilder_ == null) {
        customDimension_ = null;
      } else {
        customDimension_ = null;
        customDimensionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateCustomDimensionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest build() {
      com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest result = new com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest(this);
      result.parent_ = parent_;
      if (customDimensionBuilder_ == null) {
        result.customDimension_ = customDimension_;
      } else {
        result.customDimension_ = customDimensionBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest other) {
      if (other == com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCustomDimension()) {
        mergeCustomDimension(other.getCustomDimension());
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCustomDimensionFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.CustomDimension customDimension_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.CustomDimension, com.google.analytics.admin.v1alpha.CustomDimension.Builder, com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder> customDimensionBuilder_;
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the customDimension field is set.
     */
    public boolean hasCustomDimension() {
      return customDimensionBuilder_ != null || customDimension_ != null;
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customDimension.
     */
    public com.google.analytics.admin.v1alpha.CustomDimension getCustomDimension() {
      if (customDimensionBuilder_ == null) {
        return customDimension_ == null ? com.google.analytics.admin.v1alpha.CustomDimension.getDefaultInstance() : customDimension_;
      } else {
        return customDimensionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomDimension(com.google.analytics.admin.v1alpha.CustomDimension value) {
      if (customDimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customDimension_ = value;
        onChanged();
      } else {
        customDimensionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomDimension(
        com.google.analytics.admin.v1alpha.CustomDimension.Builder builderForValue) {
      if (customDimensionBuilder_ == null) {
        customDimension_ = builderForValue.build();
        onChanged();
      } else {
        customDimensionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCustomDimension(com.google.analytics.admin.v1alpha.CustomDimension value) {
      if (customDimensionBuilder_ == null) {
        if (customDimension_ != null) {
          customDimension_ =
            com.google.analytics.admin.v1alpha.CustomDimension.newBuilder(customDimension_).mergeFrom(value).buildPartial();
        } else {
          customDimension_ = value;
        }
        onChanged();
      } else {
        customDimensionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCustomDimension() {
      if (customDimensionBuilder_ == null) {
        customDimension_ = null;
        onChanged();
      } else {
        customDimension_ = null;
        customDimensionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.CustomDimension.Builder getCustomDimensionBuilder() {
      
      onChanged();
      return getCustomDimensionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder getCustomDimensionOrBuilder() {
      if (customDimensionBuilder_ != null) {
        return customDimensionBuilder_.getMessageOrBuilder();
      } else {
        return customDimension_ == null ?
            com.google.analytics.admin.v1alpha.CustomDimension.getDefaultInstance() : customDimension_;
      }
    }
    /**
     * <pre>
     * Required. The CustomDimension to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.CustomDimension custom_dimension = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.CustomDimension, com.google.analytics.admin.v1alpha.CustomDimension.Builder, com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder> 
        getCustomDimensionFieldBuilder() {
      if (customDimensionBuilder_ == null) {
        customDimensionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomDimension, com.google.analytics.admin.v1alpha.CustomDimension.Builder, com.google.analytics.admin.v1alpha.CustomDimensionOrBuilder>(
                getCustomDimension(),
                getParentForChildren(),
                isClean());
        customDimension_ = null;
      }
      return customDimensionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateCustomDimensionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateCustomDimensionRequest)
  private static final com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomDimensionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomDimensionRequest>() {
    @java.lang.Override
    public CreateCustomDimensionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomDimensionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomDimensionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

