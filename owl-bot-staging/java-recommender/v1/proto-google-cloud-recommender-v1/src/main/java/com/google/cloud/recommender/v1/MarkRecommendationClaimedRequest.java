// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommender_service.proto

package com.google.cloud.recommender.v1;

/**
 * <pre>
 * Request for the `MarkRecommendationClaimed` Method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1.MarkRecommendationClaimedRequest}
 */
public final class MarkRecommendationClaimedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1.MarkRecommendationClaimedRequest)
    MarkRecommendationClaimedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarkRecommendationClaimedRequest.newBuilder() to construct.
  private MarkRecommendationClaimedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarkRecommendationClaimedRequest() {
    name_ = "";
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarkRecommendationClaimedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetStateMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.class, com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Name of the recommendation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Name of the recommendation.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_METADATA_FIELD_NUMBER = 2;
  private static final class StateMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_StateMetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> stateMetadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetStateMetadata() {
    if (stateMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StateMetadataDefaultEntryHolder.defaultEntry);
    }
    return stateMetadata_;
  }

  public int getStateMetadataCount() {
    return internalGetStateMetadata().getMap().size();
  }
  /**
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
   * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */

  @java.lang.Override
  public boolean containsStateMetadata(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetStateMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStateMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
    return getStateMetadataMap();
  }
  /**
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
   * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
    return internalGetStateMetadata().getMap();
  }
  /**
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
   * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getStateMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetStateMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
   * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getStateMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetStateMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ETAG_FIELD_NUMBER = 3;
  private volatile java.lang.Object etag_;
  /**
   * <pre>
   * Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etag_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetStateMetadata(),
        StateMetadataDefaultEntryHolder.defaultEntry,
        2);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, etag_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetStateMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      stateMetadata__ = StateMetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, stateMetadata__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(etag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, etag_);
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
    if (!(obj instanceof com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest other = (com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!internalGetStateMetadata().equals(
        other.internalGetStateMetadata())) return false;
    if (!getEtag()
        .equals(other.getEtag())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetStateMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + STATE_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStateMetadata().hashCode();
    }
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest prototype) {
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
   * Request for the `MarkRecommendationClaimed` Method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1.MarkRecommendationClaimedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1.MarkRecommendationClaimedRequest)
      com.google.cloud.recommender.v1.MarkRecommendationClaimedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetStateMetadata();
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
          return internalGetMutableStateMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.class, com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      internalGetMutableStateMetadata().clear();
      etag_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommender.v1.RecommenderProto.internal_static_google_cloud_recommender_v1_MarkRecommendationClaimedRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest build() {
      com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest buildPartial() {
      com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest result = new com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.stateMetadata_ = internalGetStateMetadata();
      result.stateMetadata_.makeImmutable();
      result.etag_ = etag_;
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
      if (other instanceof com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest) {
        return mergeFrom((com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest other) {
      if (other == com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableStateMetadata().mergeFrom(
          other.internalGetStateMetadata());
      if (!other.getEtag().isEmpty()) {
        etag_ = other.etag_;
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
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              stateMetadata__ = input.readMessage(
                  StateMetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableStateMetadata().getMutableMap().put(
                  stateMetadata__.getKey(), stateMetadata__.getValue());
              break;
            } // case 18
            case 26: {
              etag_ = input.readStringRequireUtf8();

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
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Name of the recommendation.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the recommendation.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Name of the recommendation.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the recommendation.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Name of the recommendation.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> stateMetadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetStateMetadata() {
      if (stateMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StateMetadataDefaultEntryHolder.defaultEntry);
      }
      return stateMetadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableStateMetadata() {
      onChanged();;
      if (stateMetadata_ == null) {
        stateMetadata_ = com.google.protobuf.MapField.newMapField(
            StateMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!stateMetadata_.isMutable()) {
        stateMetadata_ = stateMetadata_.copy();
      }
      return stateMetadata_;
    }

    public int getStateMetadataCount() {
      return internalGetStateMetadata().getMap().size();
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */

    @java.lang.Override
    public boolean containsStateMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetStateMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStateMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getStateMetadata() {
      return getStateMetadataMap();
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap() {
      return internalGetStateMetadata().getMap();
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getStateMetadataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStateMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getStateMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetStateMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearStateMetadata() {
      internalGetMutableStateMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */

    public Builder removeStateMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableStateMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableStateMetadata() {
      return internalGetMutableStateMetadata().getMutableMap();
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */
    public Builder putStateMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableStateMetadata().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * State properties to include with this state. Overwrites any existing
     * `state_metadata`.
     * Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`.
     * Values must match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
     * </pre>
     *
     * <code>map&lt;string, string&gt; state_metadata = 2;</code>
     */

    public Builder putAllStateMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableStateMetadata().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object etag_ = "";
    /**
     * <pre>
     * Required. Fingerprint of the Recommendation. Provides optimistic locking.
     * </pre>
     *
     * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Fingerprint of the Recommendation. Provides optimistic locking.
     * </pre>
     *
     * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString
        getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Fingerprint of the Recommendation. Provides optimistic locking.
     * </pre>
     *
     * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      etag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Fingerprint of the Recommendation. Provides optimistic locking.
     * </pre>
     *
     * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      
      etag_ = getDefaultInstance().getEtag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Fingerprint of the Recommendation. Provides optimistic locking.
     * </pre>
     *
     * <code>string etag = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      etag_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1.MarkRecommendationClaimedRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1.MarkRecommendationClaimedRequest)
  private static final com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest();
  }

  public static com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarkRecommendationClaimedRequest>
      PARSER = new com.google.protobuf.AbstractParser<MarkRecommendationClaimedRequest>() {
    @java.lang.Override
    public MarkRecommendationClaimedRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MarkRecommendationClaimedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarkRecommendationClaimedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1.MarkRecommendationClaimedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

