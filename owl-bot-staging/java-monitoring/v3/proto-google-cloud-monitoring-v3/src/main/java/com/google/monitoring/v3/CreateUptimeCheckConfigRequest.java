// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The protocol for the `CreateUptimeCheckConfig` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateUptimeCheckConfigRequest}
 */
public final class CreateUptimeCheckConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateUptimeCheckConfigRequest)
    CreateUptimeCheckConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUptimeCheckConfigRequest.newBuilder() to construct.
  private CreateUptimeCheckConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUptimeCheckConfigRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUptimeCheckConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateUptimeCheckConfigRequest.class, com.google.monitoring.v3.CreateUptimeCheckConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
   * to create the Uptime check. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
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
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
   * to create the Uptime check. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
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

  public static final int UPTIME_CHECK_CONFIG_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.UptimeCheckConfig uptimeCheckConfig_;
  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the uptimeCheckConfig field is set.
   */
  @java.lang.Override
  public boolean hasUptimeCheckConfig() {
    return uptimeCheckConfig_ != null;
  }
  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The uptimeCheckConfig.
   */
  @java.lang.Override
  public com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig() {
    return uptimeCheckConfig_ == null ? com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
  }
  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder() {
    return getUptimeCheckConfig();
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
    if (uptimeCheckConfig_ != null) {
      output.writeMessage(2, getUptimeCheckConfig());
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
    if (uptimeCheckConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUptimeCheckConfig());
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
    if (!(obj instanceof com.google.monitoring.v3.CreateUptimeCheckConfigRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateUptimeCheckConfigRequest other = (com.google.monitoring.v3.CreateUptimeCheckConfigRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasUptimeCheckConfig() != other.hasUptimeCheckConfig()) return false;
    if (hasUptimeCheckConfig()) {
      if (!getUptimeCheckConfig()
          .equals(other.getUptimeCheckConfig())) return false;
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
    if (hasUptimeCheckConfig()) {
      hash = (37 * hash) + UPTIME_CHECK_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getUptimeCheckConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.CreateUptimeCheckConfigRequest prototype) {
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
   * The protocol for the `CreateUptimeCheckConfig` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateUptimeCheckConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateUptimeCheckConfigRequest)
      com.google.monitoring.v3.CreateUptimeCheckConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateUptimeCheckConfigRequest.class, com.google.monitoring.v3.CreateUptimeCheckConfigRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateUptimeCheckConfigRequest.newBuilder()
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

      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = null;
      } else {
        uptimeCheckConfig_ = null;
        uptimeCheckConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateUptimeCheckConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest build() {
      com.google.monitoring.v3.CreateUptimeCheckConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest buildPartial() {
      com.google.monitoring.v3.CreateUptimeCheckConfigRequest result = new com.google.monitoring.v3.CreateUptimeCheckConfigRequest(this);
      result.parent_ = parent_;
      if (uptimeCheckConfigBuilder_ == null) {
        result.uptimeCheckConfig_ = uptimeCheckConfig_;
      } else {
        result.uptimeCheckConfig_ = uptimeCheckConfigBuilder_.build();
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
      if (other instanceof com.google.monitoring.v3.CreateUptimeCheckConfigRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateUptimeCheckConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateUptimeCheckConfigRequest other) {
      if (other == com.google.monitoring.v3.CreateUptimeCheckConfigRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasUptimeCheckConfig()) {
        mergeUptimeCheckConfig(other.getUptimeCheckConfig());
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
                  getUptimeCheckConfigFieldBuilder().getBuilder(),
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
     * Required. The
     * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
     * to create the Uptime check. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. The
     * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
     * to create the Uptime check. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. The
     * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
     * to create the Uptime check. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. The
     * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
     * to create the Uptime check. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. The
     * [project](https://cloud.google.com/monitoring/api/v3#project_name) in which
     * to create the Uptime check. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
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

    private com.google.monitoring.v3.UptimeCheckConfig uptimeCheckConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder> uptimeCheckConfigBuilder_;
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the uptimeCheckConfig field is set.
     */
    public boolean hasUptimeCheckConfig() {
      return uptimeCheckConfigBuilder_ != null || uptimeCheckConfig_ != null;
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The uptimeCheckConfig.
     */
    public com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig() {
      if (uptimeCheckConfigBuilder_ == null) {
        return uptimeCheckConfig_ == null ? com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
      } else {
        return uptimeCheckConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUptimeCheckConfig(com.google.monitoring.v3.UptimeCheckConfig value) {
      if (uptimeCheckConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uptimeCheckConfig_ = value;
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUptimeCheckConfig(
        com.google.monitoring.v3.UptimeCheckConfig.Builder builderForValue) {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = builderForValue.build();
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUptimeCheckConfig(com.google.monitoring.v3.UptimeCheckConfig value) {
      if (uptimeCheckConfigBuilder_ == null) {
        if (uptimeCheckConfig_ != null) {
          uptimeCheckConfig_ =
            com.google.monitoring.v3.UptimeCheckConfig.newBuilder(uptimeCheckConfig_).mergeFrom(value).buildPartial();
        } else {
          uptimeCheckConfig_ = value;
        }
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUptimeCheckConfig() {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = null;
        onChanged();
      } else {
        uptimeCheckConfig_ = null;
        uptimeCheckConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.v3.UptimeCheckConfig.Builder getUptimeCheckConfigBuilder() {
      
      onChanged();
      return getUptimeCheckConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder() {
      if (uptimeCheckConfigBuilder_ != null) {
        return uptimeCheckConfigBuilder_.getMessageOrBuilder();
      } else {
        return uptimeCheckConfig_ == null ?
            com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
      }
    }
    /**
     * <pre>
     * Required. The new Uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder> 
        getUptimeCheckConfigFieldBuilder() {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder>(
                getUptimeCheckConfig(),
                getParentForChildren(),
                isClean());
        uptimeCheckConfig_ = null;
      }
      return uptimeCheckConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateUptimeCheckConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateUptimeCheckConfigRequest)
  private static final com.google.monitoring.v3.CreateUptimeCheckConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateUptimeCheckConfigRequest();
  }

  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUptimeCheckConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUptimeCheckConfigRequest>() {
    @java.lang.Override
    public CreateUptimeCheckConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUptimeCheckConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUptimeCheckConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

