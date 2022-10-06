// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * Secondary IP range of a usable subnetwork.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.UsableSubnetworkSecondaryRange}
 */
public final class UsableSubnetworkSecondaryRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.UsableSubnetworkSecondaryRange)
    UsableSubnetworkSecondaryRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsableSubnetworkSecondaryRange.newBuilder() to construct.
  private UsableSubnetworkSecondaryRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsableSubnetworkSecondaryRange() {
    rangeName_ = "";
    ipCidrRange_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsableSubnetworkSecondaryRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UsableSubnetworkSecondaryRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UsableSubnetworkSecondaryRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.UsableSubnetworkSecondaryRange.class, com.google.container.v1.UsableSubnetworkSecondaryRange.Builder.class);
  }

  /**
   * <pre>
   * Status shows the current usage of a secondary IP range.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.UsableSubnetworkSecondaryRange.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * UNKNOWN is the zero value of the Status enum. It's not a valid status.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <pre>
     * UNUSED denotes that this range is unclaimed by any cluster.
     * </pre>
     *
     * <code>UNUSED = 1;</code>
     */
    UNUSED(1),
    /**
     * <pre>
     * IN_USE_SERVICE denotes that this range is claimed by a cluster for
     * services. It cannot be used for other clusters.
     * </pre>
     *
     * <code>IN_USE_SERVICE = 2;</code>
     */
    IN_USE_SERVICE(2),
    /**
     * <pre>
     * IN_USE_SHAREABLE_POD denotes this range was created by the network admin
     * and is currently claimed by a cluster for pods. It can only be used by
     * other clusters as a pod range.
     * </pre>
     *
     * <code>IN_USE_SHAREABLE_POD = 3;</code>
     */
    IN_USE_SHAREABLE_POD(3),
    /**
     * <pre>
     * IN_USE_MANAGED_POD denotes this range was created by GKE and is claimed
     * for pods. It cannot be used for other clusters.
     * </pre>
     *
     * <code>IN_USE_MANAGED_POD = 4;</code>
     */
    IN_USE_MANAGED_POD(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * UNKNOWN is the zero value of the Status enum. It's not a valid status.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * UNUSED denotes that this range is unclaimed by any cluster.
     * </pre>
     *
     * <code>UNUSED = 1;</code>
     */
    public static final int UNUSED_VALUE = 1;
    /**
     * <pre>
     * IN_USE_SERVICE denotes that this range is claimed by a cluster for
     * services. It cannot be used for other clusters.
     * </pre>
     *
     * <code>IN_USE_SERVICE = 2;</code>
     */
    public static final int IN_USE_SERVICE_VALUE = 2;
    /**
     * <pre>
     * IN_USE_SHAREABLE_POD denotes this range was created by the network admin
     * and is currently claimed by a cluster for pods. It can only be used by
     * other clusters as a pod range.
     * </pre>
     *
     * <code>IN_USE_SHAREABLE_POD = 3;</code>
     */
    public static final int IN_USE_SHAREABLE_POD_VALUE = 3;
    /**
     * <pre>
     * IN_USE_MANAGED_POD denotes this range was created by GKE and is claimed
     * for pods. It cannot be used for other clusters.
     * </pre>
     *
     * <code>IN_USE_MANAGED_POD = 4;</code>
     */
    public static final int IN_USE_MANAGED_POD_VALUE = 4;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return UNUSED;
        case 2: return IN_USE_SERVICE;
        case 3: return IN_USE_SHAREABLE_POD;
        case 4: return IN_USE_MANAGED_POD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return com.google.container.v1.UsableSubnetworkSecondaryRange.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.UsableSubnetworkSecondaryRange.Status)
  }

  public static final int RANGE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object rangeName_;
  /**
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding
   * an alias IP range to a VM instance.
   * </pre>
   *
   * <code>string range_name = 1;</code>
   * @return The rangeName.
   */
  @java.lang.Override
  public java.lang.String getRangeName() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rangeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding
   * an alias IP range to a VM instance.
   * </pre>
   *
   * <code>string range_name = 1;</code>
   * @return The bytes for rangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRangeNameBytes() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rangeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_CIDR_RANGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object ipCidrRange_;
  /**
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>string ip_cidr_range = 2;</code>
   * @return The ipCidrRange.
   */
  @java.lang.Override
  public java.lang.String getIpCidrRange() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipCidrRange_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>string ip_cidr_range = 2;</code>
   * @return The bytes for ipCidrRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpCidrRangeBytes() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipCidrRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <pre>
   * This field is to determine the status of the secondary range programmably.
   * </pre>
   *
   * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * This field is to determine the status of the secondary range programmably.
   * </pre>
   *
   * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.container.v1.UsableSubnetworkSecondaryRange.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.google.container.v1.UsableSubnetworkSecondaryRange.Status result = com.google.container.v1.UsableSubnetworkSecondaryRange.Status.valueOf(status_);
    return result == null ? com.google.container.v1.UsableSubnetworkSecondaryRange.Status.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rangeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rangeName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipCidrRange_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipCidrRange_);
    }
    if (status_ != com.google.container.v1.UsableSubnetworkSecondaryRange.Status.UNKNOWN.getNumber()) {
      output.writeEnum(3, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rangeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rangeName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipCidrRange_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipCidrRange_);
    }
    if (status_ != com.google.container.v1.UsableSubnetworkSecondaryRange.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
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
    if (!(obj instanceof com.google.container.v1.UsableSubnetworkSecondaryRange)) {
      return super.equals(obj);
    }
    com.google.container.v1.UsableSubnetworkSecondaryRange other = (com.google.container.v1.UsableSubnetworkSecondaryRange) obj;

    if (!getRangeName()
        .equals(other.getRangeName())) return false;
    if (!getIpCidrRange()
        .equals(other.getIpCidrRange())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + RANGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRangeName().hashCode();
    hash = (37 * hash) + IP_CIDR_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + getIpCidrRange().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.UsableSubnetworkSecondaryRange parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.UsableSubnetworkSecondaryRange prototype) {
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
   * Secondary IP range of a usable subnetwork.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.UsableSubnetworkSecondaryRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.UsableSubnetworkSecondaryRange)
      com.google.container.v1.UsableSubnetworkSecondaryRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UsableSubnetworkSecondaryRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UsableSubnetworkSecondaryRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.UsableSubnetworkSecondaryRange.class, com.google.container.v1.UsableSubnetworkSecondaryRange.Builder.class);
    }

    // Construct using com.google.container.v1.UsableSubnetworkSecondaryRange.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      rangeName_ = "";

      ipCidrRange_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UsableSubnetworkSecondaryRange_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.UsableSubnetworkSecondaryRange getDefaultInstanceForType() {
      return com.google.container.v1.UsableSubnetworkSecondaryRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.UsableSubnetworkSecondaryRange build() {
      com.google.container.v1.UsableSubnetworkSecondaryRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.UsableSubnetworkSecondaryRange buildPartial() {
      com.google.container.v1.UsableSubnetworkSecondaryRange result = new com.google.container.v1.UsableSubnetworkSecondaryRange(this);
      result.rangeName_ = rangeName_;
      result.ipCidrRange_ = ipCidrRange_;
      result.status_ = status_;
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
      if (other instanceof com.google.container.v1.UsableSubnetworkSecondaryRange) {
        return mergeFrom((com.google.container.v1.UsableSubnetworkSecondaryRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.UsableSubnetworkSecondaryRange other) {
      if (other == com.google.container.v1.UsableSubnetworkSecondaryRange.getDefaultInstance()) return this;
      if (!other.getRangeName().isEmpty()) {
        rangeName_ = other.rangeName_;
        onChanged();
      }
      if (!other.getIpCidrRange().isEmpty()) {
        ipCidrRange_ = other.ipCidrRange_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              rangeName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              ipCidrRange_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              status_ = input.readEnum();

              break;
            } // case 24
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

    private java.lang.Object rangeName_ = "";
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding
     * an alias IP range to a VM instance.
     * </pre>
     *
     * <code>string range_name = 1;</code>
     * @return The rangeName.
     */
    public java.lang.String getRangeName() {
      java.lang.Object ref = rangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding
     * an alias IP range to a VM instance.
     * </pre>
     *
     * <code>string range_name = 1;</code>
     * @return The bytes for rangeName.
     */
    public com.google.protobuf.ByteString
        getRangeNameBytes() {
      java.lang.Object ref = rangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding
     * an alias IP range to a VM instance.
     * </pre>
     *
     * <code>string range_name = 1;</code>
     * @param value The rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rangeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding
     * an alias IP range to a VM instance.
     * </pre>
     *
     * <code>string range_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRangeName() {
      
      rangeName_ = getDefaultInstance().getRangeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding
     * an alias IP range to a VM instance.
     * </pre>
     *
     * <code>string range_name = 1;</code>
     * @param value The bytes for rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rangeName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipCidrRange_ = "";
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range.
     * </pre>
     *
     * <code>string ip_cidr_range = 2;</code>
     * @return The ipCidrRange.
     */
    public java.lang.String getIpCidrRange() {
      java.lang.Object ref = ipCidrRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipCidrRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range.
     * </pre>
     *
     * <code>string ip_cidr_range = 2;</code>
     * @return The bytes for ipCidrRange.
     */
    public com.google.protobuf.ByteString
        getIpCidrRangeBytes() {
      java.lang.Object ref = ipCidrRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipCidrRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range.
     * </pre>
     *
     * <code>string ip_cidr_range = 2;</code>
     * @param value The ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRange(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipCidrRange_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range.
     * </pre>
     *
     * <code>string ip_cidr_range = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpCidrRange() {
      
      ipCidrRange_ = getDefaultInstance().getIpCidrRange();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range.
     * </pre>
     *
     * <code>string ip_cidr_range = 2;</code>
     * @param value The bytes for ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRangeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipCidrRange_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * This field is to determine the status of the secondary range programmably.
     * </pre>
     *
     * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * This field is to determine the status of the secondary range programmably.
     * </pre>
     *
     * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is to determine the status of the secondary range programmably.
     * </pre>
     *
     * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.container.v1.UsableSubnetworkSecondaryRange.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.google.container.v1.UsableSubnetworkSecondaryRange.Status result = com.google.container.v1.UsableSubnetworkSecondaryRange.Status.valueOf(status_);
      return result == null ? com.google.container.v1.UsableSubnetworkSecondaryRange.Status.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * This field is to determine the status of the secondary range programmably.
     * </pre>
     *
     * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.container.v1.UsableSubnetworkSecondaryRange.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is to determine the status of the secondary range programmably.
     * </pre>
     *
     * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.UsableSubnetworkSecondaryRange)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.UsableSubnetworkSecondaryRange)
  private static final com.google.container.v1.UsableSubnetworkSecondaryRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.UsableSubnetworkSecondaryRange();
  }

  public static com.google.container.v1.UsableSubnetworkSecondaryRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsableSubnetworkSecondaryRange>
      PARSER = new com.google.protobuf.AbstractParser<UsableSubnetworkSecondaryRange>() {
    @java.lang.Override
    public UsableSubnetworkSecondaryRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsableSubnetworkSecondaryRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsableSubnetworkSecondaryRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.UsableSubnetworkSecondaryRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

