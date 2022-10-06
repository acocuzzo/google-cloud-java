// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/service.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Traffic routing configuration for versions within a single service. Traffic
 * splits define how traffic directed to the service is assigned to versions.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.TrafficSplit}
 */
public final class TrafficSplit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.TrafficSplit)
    TrafficSplitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficSplit.newBuilder() to construct.
  private TrafficSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficSplit() {
    shardBy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrafficSplit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAllocations();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.TrafficSplit.class, com.google.appengine.v1.TrafficSplit.Builder.class);
  }

  /**
   * <pre>
   * Available sharding mechanisms.
   * </pre>
   *
   * Protobuf enum {@code google.appengine.v1.TrafficSplit.ShardBy}
   */
  public enum ShardBy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Diversion method unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Diversion based on a specially named cookie, "GOOGAPPUID." The cookie
     * must be set by the application itself or no diversion will occur.
     * </pre>
     *
     * <code>COOKIE = 1;</code>
     */
    COOKIE(1),
    /**
     * <pre>
     * Diversion based on applying the modulus operation to a fingerprint
     * of the IP address.
     * </pre>
     *
     * <code>IP = 2;</code>
     */
    IP(2),
    /**
     * <pre>
     * Diversion based on weighted random assignment. An incoming request is
     * randomly routed to a version in the traffic split, with probability
     * proportional to the version's traffic share.
     * </pre>
     *
     * <code>RANDOM = 3;</code>
     */
    RANDOM(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Diversion method unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Diversion based on a specially named cookie, "GOOGAPPUID." The cookie
     * must be set by the application itself or no diversion will occur.
     * </pre>
     *
     * <code>COOKIE = 1;</code>
     */
    public static final int COOKIE_VALUE = 1;
    /**
     * <pre>
     * Diversion based on applying the modulus operation to a fingerprint
     * of the IP address.
     * </pre>
     *
     * <code>IP = 2;</code>
     */
    public static final int IP_VALUE = 2;
    /**
     * <pre>
     * Diversion based on weighted random assignment. An incoming request is
     * randomly routed to a version in the traffic split, with probability
     * proportional to the version's traffic share.
     * </pre>
     *
     * <code>RANDOM = 3;</code>
     */
    public static final int RANDOM_VALUE = 3;


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
    public static ShardBy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ShardBy forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return COOKIE;
        case 2: return IP;
        case 3: return RANDOM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShardBy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ShardBy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ShardBy>() {
            public ShardBy findValueByNumber(int number) {
              return ShardBy.forNumber(number);
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
      return com.google.appengine.v1.TrafficSplit.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShardBy[] VALUES = values();

    public static ShardBy valueOf(
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

    private ShardBy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.appengine.v1.TrafficSplit.ShardBy)
  }

  public static final int SHARD_BY_FIELD_NUMBER = 1;
  private int shardBy_;
  /**
   * <pre>
   * Mechanism used to determine which version a request is sent to.
   * The traffic selection algorithm will
   * be stable for either type until allocations are changed.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
   * @return The enum numeric value on the wire for shardBy.
   */
  @java.lang.Override public int getShardByValue() {
    return shardBy_;
  }
  /**
   * <pre>
   * Mechanism used to determine which version a request is sent to.
   * The traffic selection algorithm will
   * be stable for either type until allocations are changed.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
   * @return The shardBy.
   */
  @java.lang.Override public com.google.appengine.v1.TrafficSplit.ShardBy getShardBy() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.TrafficSplit.ShardBy result = com.google.appengine.v1.TrafficSplit.ShardBy.valueOf(shardBy_);
    return result == null ? com.google.appengine.v1.TrafficSplit.ShardBy.UNRECOGNIZED : result;
  }

  public static final int ALLOCATIONS_FIELD_NUMBER = 2;
  private static final class AllocationsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Double> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Double>newDefaultInstance(
                com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.DOUBLE,
                0D);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Double> allocations_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Double>
  internalGetAllocations() {
    if (allocations_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AllocationsDefaultEntryHolder.defaultEntry);
    }
    return allocations_;
  }

  public int getAllocationsCount() {
    return internalGetAllocations().getMap().size();
  }
  /**
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */

  @java.lang.Override
  public boolean containsAllocations(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetAllocations().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAllocationsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Double> getAllocations() {
    return getAllocationsMap();
  }
  /**
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Double> getAllocationsMap() {
    return internalGetAllocations().getMap();
  }
  /**
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  @java.lang.Override

  public double getAllocationsOrDefault(
      java.lang.String key,
      double defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Double> map =
        internalGetAllocations().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Mapping from version IDs within the service to fractional
   * (0.000, 1] allocations of traffic for that version. Each version can
   * be specified only once, but some versions in the service may not
   * have any traffic allocation. Services that have traffic allocated
   * cannot be deleted until either the service is deleted or
   * their traffic allocation is removed. Allocations must sum to 1.
   * Up to two decimal place precision is supported for IP-based splits and
   * up to three decimal places is supported for cookie-based splits.
   * </pre>
   *
   * <code>map&lt;string, double&gt; allocations = 2;</code>
   */
  @java.lang.Override

  public double getAllocationsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Double> map =
        internalGetAllocations().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (shardBy_ != com.google.appengine.v1.TrafficSplit.ShardBy.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, shardBy_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAllocations(),
        AllocationsDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shardBy_ != com.google.appengine.v1.TrafficSplit.ShardBy.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, shardBy_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Double> entry
         : internalGetAllocations().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Double>
      allocations__ = AllocationsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, allocations__);
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
    if (!(obj instanceof com.google.appengine.v1.TrafficSplit)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.TrafficSplit other = (com.google.appengine.v1.TrafficSplit) obj;

    if (shardBy_ != other.shardBy_) return false;
    if (!internalGetAllocations().equals(
        other.internalGetAllocations())) return false;
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
    hash = (37 * hash) + SHARD_BY_FIELD_NUMBER;
    hash = (53 * hash) + shardBy_;
    if (!internalGetAllocations().getMap().isEmpty()) {
      hash = (37 * hash) + ALLOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAllocations().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.TrafficSplit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.TrafficSplit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.TrafficSplit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.TrafficSplit parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.TrafficSplit prototype) {
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
   * Traffic routing configuration for versions within a single service. Traffic
   * splits define how traffic directed to the service is assigned to versions.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.TrafficSplit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.TrafficSplit)
      com.google.appengine.v1.TrafficSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAllocations();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAllocations();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.TrafficSplit.class, com.google.appengine.v1.TrafficSplit.Builder.class);
    }

    // Construct using com.google.appengine.v1.TrafficSplit.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      shardBy_ = 0;

      internalGetMutableAllocations().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.ServiceProto.internal_static_google_appengine_v1_TrafficSplit_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.TrafficSplit getDefaultInstanceForType() {
      return com.google.appengine.v1.TrafficSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.TrafficSplit build() {
      com.google.appengine.v1.TrafficSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.TrafficSplit buildPartial() {
      com.google.appengine.v1.TrafficSplit result = new com.google.appengine.v1.TrafficSplit(this);
      int from_bitField0_ = bitField0_;
      result.shardBy_ = shardBy_;
      result.allocations_ = internalGetAllocations();
      result.allocations_.makeImmutable();
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
      if (other instanceof com.google.appengine.v1.TrafficSplit) {
        return mergeFrom((com.google.appengine.v1.TrafficSplit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.TrafficSplit other) {
      if (other == com.google.appengine.v1.TrafficSplit.getDefaultInstance()) return this;
      if (other.shardBy_ != 0) {
        setShardByValue(other.getShardByValue());
      }
      internalGetMutableAllocations().mergeFrom(
          other.internalGetAllocations());
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
              shardBy_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Double>
              allocations__ = input.readMessage(
                  AllocationsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableAllocations().getMutableMap().put(
                  allocations__.getKey(), allocations__.getValue());
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
    private int bitField0_;

    private int shardBy_ = 0;
    /**
     * <pre>
     * Mechanism used to determine which version a request is sent to.
     * The traffic selection algorithm will
     * be stable for either type until allocations are changed.
     * </pre>
     *
     * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
     * @return The enum numeric value on the wire for shardBy.
     */
    @java.lang.Override public int getShardByValue() {
      return shardBy_;
    }
    /**
     * <pre>
     * Mechanism used to determine which version a request is sent to.
     * The traffic selection algorithm will
     * be stable for either type until allocations are changed.
     * </pre>
     *
     * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
     * @param value The enum numeric value on the wire for shardBy to set.
     * @return This builder for chaining.
     */
    public Builder setShardByValue(int value) {
      
      shardBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mechanism used to determine which version a request is sent to.
     * The traffic selection algorithm will
     * be stable for either type until allocations are changed.
     * </pre>
     *
     * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
     * @return The shardBy.
     */
    @java.lang.Override
    public com.google.appengine.v1.TrafficSplit.ShardBy getShardBy() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.TrafficSplit.ShardBy result = com.google.appengine.v1.TrafficSplit.ShardBy.valueOf(shardBy_);
      return result == null ? com.google.appengine.v1.TrafficSplit.ShardBy.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Mechanism used to determine which version a request is sent to.
     * The traffic selection algorithm will
     * be stable for either type until allocations are changed.
     * </pre>
     *
     * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
     * @param value The shardBy to set.
     * @return This builder for chaining.
     */
    public Builder setShardBy(com.google.appengine.v1.TrafficSplit.ShardBy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shardBy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mechanism used to determine which version a request is sent to.
     * The traffic selection algorithm will
     * be stable for either type until allocations are changed.
     * </pre>
     *
     * <code>.google.appengine.v1.TrafficSplit.ShardBy shard_by = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShardBy() {
      
      shardBy_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Double> allocations_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Double>
    internalGetAllocations() {
      if (allocations_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AllocationsDefaultEntryHolder.defaultEntry);
      }
      return allocations_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Double>
    internalGetMutableAllocations() {
      onChanged();;
      if (allocations_ == null) {
        allocations_ = com.google.protobuf.MapField.newMapField(
            AllocationsDefaultEntryHolder.defaultEntry);
      }
      if (!allocations_.isMutable()) {
        allocations_ = allocations_.copy();
      }
      return allocations_;
    }

    public int getAllocationsCount() {
      return internalGetAllocations().getMap().size();
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */

    @java.lang.Override
    public boolean containsAllocations(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAllocations().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAllocationsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Double> getAllocations() {
      return getAllocationsMap();
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Double> getAllocationsMap() {
      return internalGetAllocations().getMap();
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */
    @java.lang.Override

    public double getAllocationsOrDefault(
        java.lang.String key,
        double defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Double> map =
          internalGetAllocations().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */
    @java.lang.Override

    public double getAllocationsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Double> map =
          internalGetAllocations().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAllocations() {
      internalGetMutableAllocations().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */

    public Builder removeAllocations(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableAllocations().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Double>
    getMutableAllocations() {
      return internalGetMutableAllocations().getMutableMap();
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */
    public Builder putAllocations(
        java.lang.String key,
        double value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableAllocations().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Mapping from version IDs within the service to fractional
     * (0.000, 1] allocations of traffic for that version. Each version can
     * be specified only once, but some versions in the service may not
     * have any traffic allocation. Services that have traffic allocated
     * cannot be deleted until either the service is deleted or
     * their traffic allocation is removed. Allocations must sum to 1.
     * Up to two decimal place precision is supported for IP-based splits and
     * up to three decimal places is supported for cookie-based splits.
     * </pre>
     *
     * <code>map&lt;string, double&gt; allocations = 2;</code>
     */

    public Builder putAllAllocations(
        java.util.Map<java.lang.String, java.lang.Double> values) {
      internalGetMutableAllocations().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.TrafficSplit)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.TrafficSplit)
  private static final com.google.appengine.v1.TrafficSplit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.TrafficSplit();
  }

  public static com.google.appengine.v1.TrafficSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficSplit>
      PARSER = new com.google.protobuf.AbstractParser<TrafficSplit>() {
    @java.lang.Override
    public TrafficSplit parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.TrafficSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

