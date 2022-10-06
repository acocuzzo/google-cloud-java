// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1beta1/tls.proto

package com.google.cloud.networksecurity.v1beta1;

/**
 * <pre>
 * Specification of certificate provider. Defines the mechanism to obtain the
 * certificate and private key for peer to peer authentication.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1beta1.CertificateProvider}
 */
public final class CertificateProvider extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1beta1.CertificateProvider)
    CertificateProviderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CertificateProvider.newBuilder() to construct.
  private CertificateProvider(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CertificateProvider() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CertificateProvider();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1beta1.TlsProto.internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1beta1.TlsProto.internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1beta1.CertificateProvider.class, com.google.cloud.networksecurity.v1beta1.CertificateProvider.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GRPC_ENDPOINT(2),
    CERTIFICATE_PROVIDER_INSTANCE(3),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 2: return GRPC_ENDPOINT;
        case 3: return CERTIFICATE_PROVIDER_INSTANCE;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int GRPC_ENDPOINT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the cert and private key.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   * @return Whether the grpcEndpoint field is set.
   */
  @java.lang.Override
  public boolean hasGrpcEndpoint() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the cert and private key.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   * @return The grpcEndpoint.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.GrpcEndpoint getGrpcEndpoint() {
    if (typeCase_ == 2) {
       return (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_;
    }
    return com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
  }
  /**
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the cert and private key.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder getGrpcEndpointOrBuilder() {
    if (typeCase_ == 2) {
       return (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_;
    }
    return com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
  }

  public static final int CERTIFICATE_PROVIDER_INSTANCE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   * @return Whether the certificateProviderInstance field is set.
   */
  @java.lang.Override
  public boolean hasCertificateProviderInstance() {
    return typeCase_ == 3;
  }
  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   * @return The certificateProviderInstance.
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance getCertificateProviderInstance() {
    if (typeCase_ == 3) {
       return (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_;
    }
    return com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
  }
  /**
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder getCertificateProviderInstanceOrBuilder() {
    if (typeCase_ == 3) {
       return (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_;
    }
    return com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
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
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_);
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1beta1.CertificateProvider)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1beta1.CertificateProvider other = (com.google.cloud.networksecurity.v1beta1.CertificateProvider) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 2:
        if (!getGrpcEndpoint()
            .equals(other.getGrpcEndpoint())) return false;
        break;
      case 3:
        if (!getCertificateProviderInstance()
            .equals(other.getCertificateProviderInstance())) return false;
        break;
      case 0:
      default:
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
    switch (typeCase_) {
      case 2:
        hash = (37 * hash) + GRPC_ENDPOINT_FIELD_NUMBER;
        hash = (53 * hash) + getGrpcEndpoint().hashCode();
        break;
      case 3:
        hash = (37 * hash) + CERTIFICATE_PROVIDER_INSTANCE_FIELD_NUMBER;
        hash = (53 * hash) + getCertificateProviderInstance().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1beta1.CertificateProvider prototype) {
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
   * Specification of certificate provider. Defines the mechanism to obtain the
   * certificate and private key for peer to peer authentication.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1beta1.CertificateProvider}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1beta1.CertificateProvider)
      com.google.cloud.networksecurity.v1beta1.CertificateProviderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1beta1.TlsProto.internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1beta1.TlsProto.internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1beta1.CertificateProvider.class, com.google.cloud.networksecurity.v1beta1.CertificateProvider.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1beta1.CertificateProvider.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (grpcEndpointBuilder_ != null) {
        grpcEndpointBuilder_.clear();
      }
      if (certificateProviderInstanceBuilder_ != null) {
        certificateProviderInstanceBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1beta1.TlsProto.internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CertificateProvider getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1beta1.CertificateProvider.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CertificateProvider build() {
      com.google.cloud.networksecurity.v1beta1.CertificateProvider result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CertificateProvider buildPartial() {
      com.google.cloud.networksecurity.v1beta1.CertificateProvider result = new com.google.cloud.networksecurity.v1beta1.CertificateProvider(this);
      if (typeCase_ == 2) {
        if (grpcEndpointBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = grpcEndpointBuilder_.build();
        }
      }
      if (typeCase_ == 3) {
        if (certificateProviderInstanceBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = certificateProviderInstanceBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.google.cloud.networksecurity.v1beta1.CertificateProvider) {
        return mergeFrom((com.google.cloud.networksecurity.v1beta1.CertificateProvider)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1beta1.CertificateProvider other) {
      if (other == com.google.cloud.networksecurity.v1beta1.CertificateProvider.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case GRPC_ENDPOINT: {
          mergeGrpcEndpoint(other.getGrpcEndpoint());
          break;
        }
        case CERTIFICATE_PROVIDER_INSTANCE: {
          mergeCertificateProviderInstance(other.getCertificateProviderInstance());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
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
            case 18: {
              input.readMessage(
                  getGrpcEndpointFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCertificateProviderInstanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 3;
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.GrpcEndpoint, com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.Builder, com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder> grpcEndpointBuilder_;
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     * @return Whether the grpcEndpoint field is set.
     */
    @java.lang.Override
    public boolean hasGrpcEndpoint() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     * @return The grpcEndpoint.
     */
    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.GrpcEndpoint getGrpcEndpoint() {
      if (grpcEndpointBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_;
        }
        return com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return grpcEndpointBuilder_.getMessage();
        }
        return com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    public Builder setGrpcEndpoint(com.google.cloud.networksecurity.v1beta1.GrpcEndpoint value) {
      if (grpcEndpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        grpcEndpointBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    public Builder setGrpcEndpoint(
        com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.Builder builderForValue) {
      if (grpcEndpointBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        grpcEndpointBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    public Builder mergeGrpcEndpoint(com.google.cloud.networksecurity.v1beta1.GrpcEndpoint value) {
      if (grpcEndpointBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance()) {
          type_ = com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.newBuilder((com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          grpcEndpointBuilder_.mergeFrom(value);
        } else {
          grpcEndpointBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    public Builder clearGrpcEndpoint() {
      if (grpcEndpointBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        grpcEndpointBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    public com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.Builder getGrpcEndpointBuilder() {
      return getGrpcEndpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder getGrpcEndpointOrBuilder() {
      if ((typeCase_ == 2) && (grpcEndpointBuilder_ != null)) {
        return grpcEndpointBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_;
        }
        return com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * gRPC specific configuration to access the gRPC server to
     * obtain the cert and private key.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.GrpcEndpoint grpc_endpoint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.GrpcEndpoint, com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.Builder, com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder> 
        getGrpcEndpointFieldBuilder() {
      if (grpcEndpointBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.getDefaultInstance();
        }
        grpcEndpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1beta1.GrpcEndpoint, com.google.cloud.networksecurity.v1beta1.GrpcEndpoint.Builder, com.google.cloud.networksecurity.v1beta1.GrpcEndpointOrBuilder>(
                (com.google.cloud.networksecurity.v1beta1.GrpcEndpoint) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return grpcEndpointBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.Builder, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder> certificateProviderInstanceBuilder_;
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     * @return Whether the certificateProviderInstance field is set.
     */
    @java.lang.Override
    public boolean hasCertificateProviderInstance() {
      return typeCase_ == 3;
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     * @return The certificateProviderInstance.
     */
    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance getCertificateProviderInstance() {
      if (certificateProviderInstanceBuilder_ == null) {
        if (typeCase_ == 3) {
          return (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_;
        }
        return com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return certificateProviderInstanceBuilder_.getMessage();
        }
        return com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    public Builder setCertificateProviderInstance(com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance value) {
      if (certificateProviderInstanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        certificateProviderInstanceBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    public Builder setCertificateProviderInstance(
        com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.Builder builderForValue) {
      if (certificateProviderInstanceBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        certificateProviderInstanceBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    public Builder mergeCertificateProviderInstance(com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance value) {
      if (certificateProviderInstanceBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance()) {
          type_ = com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.newBuilder((com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          certificateProviderInstanceBuilder_.mergeFrom(value);
        } else {
          certificateProviderInstanceBuilder_.setMessage(value);
        }
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    public Builder clearCertificateProviderInstance() {
      if (certificateProviderInstanceBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        certificateProviderInstanceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    public com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.Builder getCertificateProviderInstanceBuilder() {
      return getCertificateProviderInstanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder getCertificateProviderInstanceOrBuilder() {
      if ((typeCase_ == 3) && (certificateProviderInstanceBuilder_ != null)) {
        return certificateProviderInstanceBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_;
        }
        return com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The certificate provider instance specification that will be passed to
     * the data plane, which will be used to load necessary credential
     * information.
     * </pre>
     *
     * <code>.google.cloud.networksecurity.v1beta1.CertificateProviderInstance certificate_provider_instance = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.Builder, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder> 
        getCertificateProviderInstanceFieldBuilder() {
      if (certificateProviderInstanceBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.getDefaultInstance();
        }
        certificateProviderInstanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance.Builder, com.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceOrBuilder>(
                (com.google.cloud.networksecurity.v1beta1.CertificateProviderInstance) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();;
      return certificateProviderInstanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1beta1.CertificateProvider)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.CertificateProvider)
  private static final com.google.cloud.networksecurity.v1beta1.CertificateProvider DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1beta1.CertificateProvider();
  }

  public static com.google.cloud.networksecurity.v1beta1.CertificateProvider getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateProvider>
      PARSER = new com.google.protobuf.AbstractParser<CertificateProvider>() {
    @java.lang.Override
    public CertificateProvider parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateProvider> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateProvider> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1beta1.CertificateProvider getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

