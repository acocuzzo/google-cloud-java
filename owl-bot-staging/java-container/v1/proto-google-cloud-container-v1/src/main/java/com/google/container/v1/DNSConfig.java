// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * DNSConfig contains the desired set of options for configuring clusterDNS.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.DNSConfig}
 */
public final class DNSConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.DNSConfig)
    DNSConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNSConfig.newBuilder() to construct.
  private DNSConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNSConfig() {
    clusterDns_ = 0;
    clusterDnsScope_ = 0;
    clusterDnsDomain_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNSConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DNSConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DNSConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.DNSConfig.class, com.google.container.v1.DNSConfig.Builder.class);
  }

  /**
   * <pre>
   * Provider lists the various in-cluster DNS providers.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.DNSConfig.Provider}
   */
  public enum Provider
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value
     * </pre>
     *
     * <code>PROVIDER_UNSPECIFIED = 0;</code>
     */
    PROVIDER_UNSPECIFIED(0),
    /**
     * <pre>
     * Use GKE default DNS provider(kube-dns) for DNS resolution.
     * </pre>
     *
     * <code>PLATFORM_DEFAULT = 1;</code>
     */
    PLATFORM_DEFAULT(1),
    /**
     * <pre>
     * Use CloudDNS for DNS resolution.
     * </pre>
     *
     * <code>CLOUD_DNS = 2;</code>
     */
    CLOUD_DNS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value
     * </pre>
     *
     * <code>PROVIDER_UNSPECIFIED = 0;</code>
     */
    public static final int PROVIDER_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Use GKE default DNS provider(kube-dns) for DNS resolution.
     * </pre>
     *
     * <code>PLATFORM_DEFAULT = 1;</code>
     */
    public static final int PLATFORM_DEFAULT_VALUE = 1;
    /**
     * <pre>
     * Use CloudDNS for DNS resolution.
     * </pre>
     *
     * <code>CLOUD_DNS = 2;</code>
     */
    public static final int CLOUD_DNS_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Provider valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Provider forNumber(int value) {
      switch (value) {
        case 0: return PROVIDER_UNSPECIFIED;
        case 1: return PLATFORM_DEFAULT;
        case 2: return CLOUD_DNS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Provider>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Provider> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Provider>() {
            public Provider findValueByNumber(int number) {
              return Provider.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.container.v1.DNSConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Provider[] VALUES = values();

    public static Provider valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Provider(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.DNSConfig.Provider)
  }

  /**
   * <pre>
   * DNSScope lists the various scopes of access to cluster DNS records.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.DNSConfig.DNSScope}
   */
  public enum DNSScope
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value, will be inferred as cluster scope.
     * </pre>
     *
     * <code>DNS_SCOPE_UNSPECIFIED = 0;</code>
     */
    DNS_SCOPE_UNSPECIFIED(0),
    /**
     * <pre>
     * DNS records are accessible from within the VPC.
     * </pre>
     *
     * <code>VPC_SCOPE = 2;</code>
     */
    VPC_SCOPE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value, will be inferred as cluster scope.
     * </pre>
     *
     * <code>DNS_SCOPE_UNSPECIFIED = 0;</code>
     */
    public static final int DNS_SCOPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * DNS records are accessible from within the VPC.
     * </pre>
     *
     * <code>VPC_SCOPE = 2;</code>
     */
    public static final int VPC_SCOPE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DNSScope valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DNSScope forNumber(int value) {
      switch (value) {
        case 0: return DNS_SCOPE_UNSPECIFIED;
        case 2: return VPC_SCOPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DNSScope>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DNSScope> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DNSScope>() {
            public DNSScope findValueByNumber(int number) {
              return DNSScope.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.container.v1.DNSConfig.getDescriptor().getEnumTypes().get(1);
    }

    private static final DNSScope[] VALUES = values();

    public static DNSScope valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DNSScope(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.DNSConfig.DNSScope)
  }

  public static final int CLUSTER_DNS_FIELD_NUMBER = 1;
  private int clusterDns_;
  /**
   * <pre>
   * cluster_dns indicates which in-cluster DNS provider should be used.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
   * @return The enum numeric value on the wire for clusterDns.
   */
  @java.lang.Override public int getClusterDnsValue() {
    return clusterDns_;
  }
  /**
   * <pre>
   * cluster_dns indicates which in-cluster DNS provider should be used.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
   * @return The clusterDns.
   */
  @java.lang.Override public com.google.container.v1.DNSConfig.Provider getClusterDns() {
    @SuppressWarnings("deprecation")
    com.google.container.v1.DNSConfig.Provider result = com.google.container.v1.DNSConfig.Provider.valueOf(clusterDns_);
    return result == null ? com.google.container.v1.DNSConfig.Provider.UNRECOGNIZED : result;
  }

  public static final int CLUSTER_DNS_SCOPE_FIELD_NUMBER = 2;
  private int clusterDnsScope_;
  /**
   * <pre>
   * cluster_dns_scope indicates the scope of access to cluster DNS records.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
   * @return The enum numeric value on the wire for clusterDnsScope.
   */
  @java.lang.Override public int getClusterDnsScopeValue() {
    return clusterDnsScope_;
  }
  /**
   * <pre>
   * cluster_dns_scope indicates the scope of access to cluster DNS records.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
   * @return The clusterDnsScope.
   */
  @java.lang.Override public com.google.container.v1.DNSConfig.DNSScope getClusterDnsScope() {
    @SuppressWarnings("deprecation")
    com.google.container.v1.DNSConfig.DNSScope result = com.google.container.v1.DNSConfig.DNSScope.valueOf(clusterDnsScope_);
    return result == null ? com.google.container.v1.DNSConfig.DNSScope.UNRECOGNIZED : result;
  }

  public static final int CLUSTER_DNS_DOMAIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterDnsDomain_;
  /**
   * <pre>
   * cluster_dns_domain is the suffix used for all cluster service records.
   * </pre>
   *
   * <code>string cluster_dns_domain = 3;</code>
   * @return The clusterDnsDomain.
   */
  @java.lang.Override
  public java.lang.String getClusterDnsDomain() {
    java.lang.Object ref = clusterDnsDomain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterDnsDomain_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * cluster_dns_domain is the suffix used for all cluster service records.
   * </pre>
   *
   * <code>string cluster_dns_domain = 3;</code>
   * @return The bytes for clusterDnsDomain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClusterDnsDomainBytes() {
    java.lang.Object ref = clusterDnsDomain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterDnsDomain_ = b;
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
    if (clusterDns_ != com.google.container.v1.DNSConfig.Provider.PROVIDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, clusterDns_);
    }
    if (clusterDnsScope_ != com.google.container.v1.DNSConfig.DNSScope.DNS_SCOPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, clusterDnsScope_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterDnsDomain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterDnsDomain_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clusterDns_ != com.google.container.v1.DNSConfig.Provider.PROVIDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, clusterDns_);
    }
    if (clusterDnsScope_ != com.google.container.v1.DNSConfig.DNSScope.DNS_SCOPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, clusterDnsScope_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterDnsDomain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterDnsDomain_);
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
    if (!(obj instanceof com.google.container.v1.DNSConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.DNSConfig other = (com.google.container.v1.DNSConfig) obj;

    if (clusterDns_ != other.clusterDns_) return false;
    if (clusterDnsScope_ != other.clusterDnsScope_) return false;
    if (!getClusterDnsDomain()
        .equals(other.getClusterDnsDomain())) return false;
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
    hash = (37 * hash) + CLUSTER_DNS_FIELD_NUMBER;
    hash = (53 * hash) + clusterDns_;
    hash = (37 * hash) + CLUSTER_DNS_SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + clusterDnsScope_;
    hash = (37 * hash) + CLUSTER_DNS_DOMAIN_FIELD_NUMBER;
    hash = (53 * hash) + getClusterDnsDomain().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.DNSConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DNSConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DNSConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.DNSConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.DNSConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.DNSConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.DNSConfig prototype) {
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
   * DNSConfig contains the desired set of options for configuring clusterDNS.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.DNSConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.DNSConfig)
      com.google.container.v1.DNSConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DNSConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DNSConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.DNSConfig.class, com.google.container.v1.DNSConfig.Builder.class);
    }

    // Construct using com.google.container.v1.DNSConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clusterDns_ = 0;

      clusterDnsScope_ = 0;

      clusterDnsDomain_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DNSConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.DNSConfig getDefaultInstanceForType() {
      return com.google.container.v1.DNSConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.DNSConfig build() {
      com.google.container.v1.DNSConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.DNSConfig buildPartial() {
      com.google.container.v1.DNSConfig result = new com.google.container.v1.DNSConfig(this);
      result.clusterDns_ = clusterDns_;
      result.clusterDnsScope_ = clusterDnsScope_;
      result.clusterDnsDomain_ = clusterDnsDomain_;
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
      if (other instanceof com.google.container.v1.DNSConfig) {
        return mergeFrom((com.google.container.v1.DNSConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.DNSConfig other) {
      if (other == com.google.container.v1.DNSConfig.getDefaultInstance()) return this;
      if (other.clusterDns_ != 0) {
        setClusterDnsValue(other.getClusterDnsValue());
      }
      if (other.clusterDnsScope_ != 0) {
        setClusterDnsScopeValue(other.getClusterDnsScopeValue());
      }
      if (!other.getClusterDnsDomain().isEmpty()) {
        clusterDnsDomain_ = other.clusterDnsDomain_;
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
            case 8: {
              clusterDns_ = input.readEnum();

              break;
            } // case 8
            case 16: {
              clusterDnsScope_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              clusterDnsDomain_ = input.readStringRequireUtf8();

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

    private int clusterDns_ = 0;
    /**
     * <pre>
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
     * @return The enum numeric value on the wire for clusterDns.
     */
    @java.lang.Override public int getClusterDnsValue() {
      return clusterDns_;
    }
    /**
     * <pre>
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
     * @param value The enum numeric value on the wire for clusterDns to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDnsValue(int value) {
      
      clusterDns_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
     * @return The clusterDns.
     */
    @java.lang.Override
    public com.google.container.v1.DNSConfig.Provider getClusterDns() {
      @SuppressWarnings("deprecation")
      com.google.container.v1.DNSConfig.Provider result = com.google.container.v1.DNSConfig.Provider.valueOf(clusterDns_);
      return result == null ? com.google.container.v1.DNSConfig.Provider.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
     * @param value The clusterDns to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDns(com.google.container.v1.DNSConfig.Provider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      clusterDns_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns indicates which in-cluster DNS provider should be used.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterDns() {
      
      clusterDns_ = 0;
      onChanged();
      return this;
    }

    private int clusterDnsScope_ = 0;
    /**
     * <pre>
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
     * @return The enum numeric value on the wire for clusterDnsScope.
     */
    @java.lang.Override public int getClusterDnsScopeValue() {
      return clusterDnsScope_;
    }
    /**
     * <pre>
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
     * @param value The enum numeric value on the wire for clusterDnsScope to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDnsScopeValue(int value) {
      
      clusterDnsScope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
     * @return The clusterDnsScope.
     */
    @java.lang.Override
    public com.google.container.v1.DNSConfig.DNSScope getClusterDnsScope() {
      @SuppressWarnings("deprecation")
      com.google.container.v1.DNSConfig.DNSScope result = com.google.container.v1.DNSConfig.DNSScope.valueOf(clusterDnsScope_);
      return result == null ? com.google.container.v1.DNSConfig.DNSScope.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
     * @param value The clusterDnsScope to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDnsScope(com.google.container.v1.DNSConfig.DNSScope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      clusterDnsScope_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns_scope indicates the scope of access to cluster DNS records.
     * </pre>
     *
     * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterDnsScope() {
      
      clusterDnsScope_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clusterDnsDomain_ = "";
    /**
     * <pre>
     * cluster_dns_domain is the suffix used for all cluster service records.
     * </pre>
     *
     * <code>string cluster_dns_domain = 3;</code>
     * @return The clusterDnsDomain.
     */
    public java.lang.String getClusterDnsDomain() {
      java.lang.Object ref = clusterDnsDomain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterDnsDomain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * cluster_dns_domain is the suffix used for all cluster service records.
     * </pre>
     *
     * <code>string cluster_dns_domain = 3;</code>
     * @return The bytes for clusterDnsDomain.
     */
    public com.google.protobuf.ByteString
        getClusterDnsDomainBytes() {
      java.lang.Object ref = clusterDnsDomain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterDnsDomain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * cluster_dns_domain is the suffix used for all cluster service records.
     * </pre>
     *
     * <code>string cluster_dns_domain = 3;</code>
     * @param value The clusterDnsDomain to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDnsDomain(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterDnsDomain_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns_domain is the suffix used for all cluster service records.
     * </pre>
     *
     * <code>string cluster_dns_domain = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterDnsDomain() {
      
      clusterDnsDomain_ = getDefaultInstance().getClusterDnsDomain();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * cluster_dns_domain is the suffix used for all cluster service records.
     * </pre>
     *
     * <code>string cluster_dns_domain = 3;</code>
     * @param value The bytes for clusterDnsDomain to set.
     * @return This builder for chaining.
     */
    public Builder setClusterDnsDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterDnsDomain_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.DNSConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.DNSConfig)
  private static final com.google.container.v1.DNSConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.DNSConfig();
  }

  public static com.google.container.v1.DNSConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNSConfig>
      PARSER = new com.google.protobuf.AbstractParser<DNSConfig>() {
    @java.lang.Override
    public DNSConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DNSConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNSConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.DNSConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

