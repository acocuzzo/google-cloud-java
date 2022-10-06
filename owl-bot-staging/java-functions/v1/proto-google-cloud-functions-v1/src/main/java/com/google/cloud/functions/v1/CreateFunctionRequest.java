// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

/**
 * <pre>
 * Request for the `CreateFunction` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1.CreateFunctionRequest}
 */
public final class CreateFunctionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1.CreateFunctionRequest)
    CreateFunctionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFunctionRequest.newBuilder() to construct.
  private CreateFunctionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFunctionRequest() {
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFunctionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_CreateFunctionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1.CreateFunctionRequest.class, com.google.cloud.functions.v1.CreateFunctionRequest.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object location_;
  /**
   * <pre>
   * Required. The project and location in which the function should be created, specified
   * in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The project and location in which the function should be created, specified
   * in the format `projects/&#42;&#47;locations/&#42;`
   * </pre>
   *
   * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUNCTION_FIELD_NUMBER = 2;
  private com.google.cloud.functions.v1.CloudFunction function_;
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the function field is set.
   */
  @java.lang.Override
  public boolean hasFunction() {
    return function_ != null;
  }
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The function.
   */
  @java.lang.Override
  public com.google.cloud.functions.v1.CloudFunction getFunction() {
    return function_ == null ? com.google.cloud.functions.v1.CloudFunction.getDefaultInstance() : function_;
  }
  /**
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v1.CloudFunctionOrBuilder getFunctionOrBuilder() {
    return getFunction();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (function_ != null) {
      output.writeMessage(2, getFunction());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (function_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFunction());
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
    if (!(obj instanceof com.google.cloud.functions.v1.CreateFunctionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1.CreateFunctionRequest other = (com.google.cloud.functions.v1.CreateFunctionRequest) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (hasFunction() != other.hasFunction()) return false;
    if (hasFunction()) {
      if (!getFunction()
          .equals(other.getFunction())) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    if (hasFunction()) {
      hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
      hash = (53 * hash) + getFunction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1.CreateFunctionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v1.CreateFunctionRequest prototype) {
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
   * Request for the `CreateFunction` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1.CreateFunctionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1.CreateFunctionRequest)
      com.google.cloud.functions.v1.CreateFunctionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_CreateFunctionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1.CreateFunctionRequest.class, com.google.cloud.functions.v1.CreateFunctionRequest.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1.CreateFunctionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      location_ = "";

      if (functionBuilder_ == null) {
        function_ = null;
      } else {
        function_ = null;
        functionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v1.FunctionsProto.internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CreateFunctionRequest getDefaultInstanceForType() {
      return com.google.cloud.functions.v1.CreateFunctionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CreateFunctionRequest build() {
      com.google.cloud.functions.v1.CreateFunctionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CreateFunctionRequest buildPartial() {
      com.google.cloud.functions.v1.CreateFunctionRequest result = new com.google.cloud.functions.v1.CreateFunctionRequest(this);
      result.location_ = location_;
      if (functionBuilder_ == null) {
        result.function_ = function_;
      } else {
        result.function_ = functionBuilder_.build();
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
      if (other instanceof com.google.cloud.functions.v1.CreateFunctionRequest) {
        return mergeFrom((com.google.cloud.functions.v1.CreateFunctionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1.CreateFunctionRequest other) {
      if (other == com.google.cloud.functions.v1.CreateFunctionRequest.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.hasFunction()) {
        mergeFunction(other.getFunction());
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
              location_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFunctionFieldBuilder().getBuilder(),
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

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * Required. The project and location in which the function should be created, specified
     * in the format `projects/&#42;&#47;locations/&#42;`
     * </pre>
     *
     * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location in which the function should be created, specified
     * in the format `projects/&#42;&#47;locations/&#42;`
     * </pre>
     *
     * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location in which the function should be created, specified
     * in the format `projects/&#42;&#47;locations/&#42;`
     * </pre>
     *
     * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location in which the function should be created, specified
     * in the format `projects/&#42;&#47;locations/&#42;`
     * </pre>
     *
     * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location in which the function should be created, specified
     * in the format `projects/&#42;&#47;locations/&#42;`
     * </pre>
     *
     * <code>string location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.functions.v1.CloudFunction function_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v1.CloudFunction, com.google.cloud.functions.v1.CloudFunction.Builder, com.google.cloud.functions.v1.CloudFunctionOrBuilder> functionBuilder_;
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the function field is set.
     */
    public boolean hasFunction() {
      return functionBuilder_ != null || function_ != null;
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The function.
     */
    public com.google.cloud.functions.v1.CloudFunction getFunction() {
      if (functionBuilder_ == null) {
        return function_ == null ? com.google.cloud.functions.v1.CloudFunction.getDefaultInstance() : function_;
      } else {
        return functionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFunction(com.google.cloud.functions.v1.CloudFunction value) {
      if (functionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        function_ = value;
        onChanged();
      } else {
        functionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFunction(
        com.google.cloud.functions.v1.CloudFunction.Builder builderForValue) {
      if (functionBuilder_ == null) {
        function_ = builderForValue.build();
        onChanged();
      } else {
        functionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFunction(com.google.cloud.functions.v1.CloudFunction value) {
      if (functionBuilder_ == null) {
        if (function_ != null) {
          function_ =
            com.google.cloud.functions.v1.CloudFunction.newBuilder(function_).mergeFrom(value).buildPartial();
        } else {
          function_ = value;
        }
        onChanged();
      } else {
        functionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFunction() {
      if (functionBuilder_ == null) {
        function_ = null;
        onChanged();
      } else {
        function_ = null;
        functionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.functions.v1.CloudFunction.Builder getFunctionBuilder() {
      
      onChanged();
      return getFunctionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.functions.v1.CloudFunctionOrBuilder getFunctionOrBuilder() {
      if (functionBuilder_ != null) {
        return functionBuilder_.getMessageOrBuilder();
      } else {
        return function_ == null ?
            com.google.cloud.functions.v1.CloudFunction.getDefaultInstance() : function_;
      }
    }
    /**
     * <pre>
     * Required. Function to be created.
     * </pre>
     *
     * <code>.google.cloud.functions.v1.CloudFunction function = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v1.CloudFunction, com.google.cloud.functions.v1.CloudFunction.Builder, com.google.cloud.functions.v1.CloudFunctionOrBuilder> 
        getFunctionFieldBuilder() {
      if (functionBuilder_ == null) {
        functionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v1.CloudFunction, com.google.cloud.functions.v1.CloudFunction.Builder, com.google.cloud.functions.v1.CloudFunctionOrBuilder>(
                getFunction(),
                getParentForChildren(),
                isClean());
        function_ = null;
      }
      return functionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1.CreateFunctionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1.CreateFunctionRequest)
  private static final com.google.cloud.functions.v1.CreateFunctionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1.CreateFunctionRequest();
  }

  public static com.google.cloud.functions.v1.CreateFunctionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFunctionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFunctionRequest>() {
    @java.lang.Override
    public CreateFunctionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFunctionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFunctionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v1.CreateFunctionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

