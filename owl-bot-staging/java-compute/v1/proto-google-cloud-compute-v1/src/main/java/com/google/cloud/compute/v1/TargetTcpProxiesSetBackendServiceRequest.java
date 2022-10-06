// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest}
 */
public final class TargetTcpProxiesSetBackendServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)
    TargetTcpProxiesSetBackendServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetTcpProxiesSetBackendServiceRequest.newBuilder() to construct.
  private TargetTcpProxiesSetBackendServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetTcpProxiesSetBackendServiceRequest() {
    service_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetTcpProxiesSetBackendServiceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetTcpProxiesSetBackendServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetTcpProxiesSetBackendServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.class, com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_FIELD_NUMBER = 373540533;
  private volatile java.lang.Object service_;
  /**
   * <pre>
   * The URL of the new BackendService resource for the targetTcpProxy.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The URL of the new BackendService resource for the targetTcpProxy.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URL of the new BackendService resource for the targetTcpProxy.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 373540533, service_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(373540533, service_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest other = (com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest) obj;

    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService()
          .equals(other.getService())) return false;
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
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)
      com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetTcpProxiesSetBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetTcpProxiesSetBackendServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.class, com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      service_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetTcpProxiesSetBackendServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest build() {
      com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest buildPartial() {
      com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest result = new com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.service_ = service_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest other) {
      if (other == com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest.getDefaultInstance()) return this;
      if (other.hasService()) {
        bitField0_ |= 0x00000001;
        service_ = other.service_;
        onChanged();
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
            case -1306643030: {
              service_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1306643030
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
    private int bitField0_;

    private java.lang.Object service_ = "";
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {
      bitField0_ = (bitField0_ & ~0x00000001);
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the new BackendService resource for the targetTcpProxy.
     * </pre>
     *
     * <code>optional string service = 373540533;</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      service_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest)
  private static final com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest();
  }

  public static com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetTcpProxiesSetBackendServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<TargetTcpProxiesSetBackendServiceRequest>() {
    @java.lang.Override
    public TargetTcpProxiesSetBackendServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetTcpProxiesSetBackendServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetTcpProxiesSetBackendServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

