/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/areainsights/v1/area_insights_service.proto

// Protobuf Java Version: 3.25.4
package com.google.maps.areainsights.v1;

/**
 *
 *
 * <pre>
 * Response for the ComputeInsights RPC.
 * </pre>
 *
 * Protobuf type {@code google.maps.areainsights.v1.ComputeInsightsResponse}
 */
public final class ComputeInsightsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.areainsights.v1.ComputeInsightsResponse)
    ComputeInsightsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputeInsightsResponse.newBuilder() to construct.
  private ComputeInsightsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeInsightsResponse() {
    placeInsights_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeInsightsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto
        .internal_static_google_maps_areainsights_v1_ComputeInsightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto
        .internal_static_google_maps_areainsights_v1_ComputeInsightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.areainsights.v1.ComputeInsightsResponse.class,
            com.google.maps.areainsights.v1.ComputeInsightsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int COUNT_FIELD_NUMBER = 1;
  private long count_ = 0L;
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_COUNT.
   * </pre>
   *
   * <code>optional int64 count = 1;</code>
   *
   * @return Whether the count field is set.
   */
  @java.lang.Override
  public boolean hasCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_COUNT.
   * </pre>
   *
   * <code>optional int64 count = 1;</code>
   *
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
  }

  public static final int PLACE_INSIGHTS_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private java.util.List<com.google.maps.areainsights.v1.PlaceInsight> placeInsights_;
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_PLACES.
   * </pre>
   *
   * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.maps.areainsights.v1.PlaceInsight> getPlaceInsightsList() {
    return placeInsights_;
  }
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_PLACES.
   * </pre>
   *
   * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.maps.areainsights.v1.PlaceInsightOrBuilder>
      getPlaceInsightsOrBuilderList() {
    return placeInsights_;
  }
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_PLACES.
   * </pre>
   *
   * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
   */
  @java.lang.Override
  public int getPlaceInsightsCount() {
    return placeInsights_.size();
  }
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_PLACES.
   * </pre>
   *
   * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
   */
  @java.lang.Override
  public com.google.maps.areainsights.v1.PlaceInsight getPlaceInsights(int index) {
    return placeInsights_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Result for Insights.INSIGHT_PLACES.
   * </pre>
   *
   * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
   */
  @java.lang.Override
  public com.google.maps.areainsights.v1.PlaceInsightOrBuilder getPlaceInsightsOrBuilder(
      int index) {
    return placeInsights_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, count_);
    }
    for (int i = 0; i < placeInsights_.size(); i++) {
      output.writeMessage(5, placeInsights_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, count_);
    }
    for (int i = 0; i < placeInsights_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, placeInsights_.get(i));
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
    if (!(obj instanceof com.google.maps.areainsights.v1.ComputeInsightsResponse)) {
      return super.equals(obj);
    }
    com.google.maps.areainsights.v1.ComputeInsightsResponse other =
        (com.google.maps.areainsights.v1.ComputeInsightsResponse) obj;

    if (hasCount() != other.hasCount()) return false;
    if (hasCount()) {
      if (getCount() != other.getCount()) return false;
    }
    if (!getPlaceInsightsList().equals(other.getPlaceInsightsList())) return false;
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
    if (hasCount()) {
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCount());
    }
    if (getPlaceInsightsCount() > 0) {
      hash = (37 * hash) + PLACE_INSIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getPlaceInsightsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.maps.areainsights.v1.ComputeInsightsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the ComputeInsights RPC.
   * </pre>
   *
   * Protobuf type {@code google.maps.areainsights.v1.ComputeInsightsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.areainsights.v1.ComputeInsightsResponse)
      com.google.maps.areainsights.v1.ComputeInsightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_ComputeInsightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_ComputeInsightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.areainsights.v1.ComputeInsightsResponse.class,
              com.google.maps.areainsights.v1.ComputeInsightsResponse.Builder.class);
    }

    // Construct using com.google.maps.areainsights.v1.ComputeInsightsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      count_ = 0L;
      if (placeInsightsBuilder_ == null) {
        placeInsights_ = java.util.Collections.emptyList();
      } else {
        placeInsights_ = null;
        placeInsightsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_ComputeInsightsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.ComputeInsightsResponse getDefaultInstanceForType() {
      return com.google.maps.areainsights.v1.ComputeInsightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.ComputeInsightsResponse build() {
      com.google.maps.areainsights.v1.ComputeInsightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.ComputeInsightsResponse buildPartial() {
      com.google.maps.areainsights.v1.ComputeInsightsResponse result =
          new com.google.maps.areainsights.v1.ComputeInsightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.maps.areainsights.v1.ComputeInsightsResponse result) {
      if (placeInsightsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          placeInsights_ = java.util.Collections.unmodifiableList(placeInsights_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.placeInsights_ = placeInsights_;
      } else {
        result.placeInsights_ = placeInsightsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.maps.areainsights.v1.ComputeInsightsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.count_ = count_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.maps.areainsights.v1.ComputeInsightsResponse) {
        return mergeFrom((com.google.maps.areainsights.v1.ComputeInsightsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.areainsights.v1.ComputeInsightsResponse other) {
      if (other == com.google.maps.areainsights.v1.ComputeInsightsResponse.getDefaultInstance())
        return this;
      if (other.hasCount()) {
        setCount(other.getCount());
      }
      if (placeInsightsBuilder_ == null) {
        if (!other.placeInsights_.isEmpty()) {
          if (placeInsights_.isEmpty()) {
            placeInsights_ = other.placeInsights_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePlaceInsightsIsMutable();
            placeInsights_.addAll(other.placeInsights_);
          }
          onChanged();
        }
      } else {
        if (!other.placeInsights_.isEmpty()) {
          if (placeInsightsBuilder_.isEmpty()) {
            placeInsightsBuilder_.dispose();
            placeInsightsBuilder_ = null;
            placeInsights_ = other.placeInsights_;
            bitField0_ = (bitField0_ & ~0x00000002);
            placeInsightsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPlaceInsightsFieldBuilder()
                    : null;
          } else {
            placeInsightsBuilder_.addAllMessages(other.placeInsights_);
          }
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
            case 8:
              {
                count_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 42:
              {
                com.google.maps.areainsights.v1.PlaceInsight m =
                    input.readMessage(
                        com.google.maps.areainsights.v1.PlaceInsight.parser(), extensionRegistry);
                if (placeInsightsBuilder_ == null) {
                  ensurePlaceInsightsIsMutable();
                  placeInsights_.add(m);
                } else {
                  placeInsightsBuilder_.addMessage(m);
                }
                break;
              } // case 42
            default:
              {
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

    private long count_;
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_COUNT.
     * </pre>
     *
     * <code>optional int64 count = 1;</code>
     *
     * @return Whether the count field is set.
     */
    @java.lang.Override
    public boolean hasCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_COUNT.
     * </pre>
     *
     * <code>optional int64 count = 1;</code>
     *
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_COUNT.
     * </pre>
     *
     * <code>optional int64 count = 1;</code>
     *
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_COUNT.
     * </pre>
     *
     * <code>optional int64 count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      count_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.maps.areainsights.v1.PlaceInsight> placeInsights_ =
        java.util.Collections.emptyList();

    private void ensurePlaceInsightsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        placeInsights_ =
            new java.util.ArrayList<com.google.maps.areainsights.v1.PlaceInsight>(placeInsights_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.maps.areainsights.v1.PlaceInsight,
            com.google.maps.areainsights.v1.PlaceInsight.Builder,
            com.google.maps.areainsights.v1.PlaceInsightOrBuilder>
        placeInsightsBuilder_;

    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public java.util.List<com.google.maps.areainsights.v1.PlaceInsight> getPlaceInsightsList() {
      if (placeInsightsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(placeInsights_);
      } else {
        return placeInsightsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public int getPlaceInsightsCount() {
      if (placeInsightsBuilder_ == null) {
        return placeInsights_.size();
      } else {
        return placeInsightsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public com.google.maps.areainsights.v1.PlaceInsight getPlaceInsights(int index) {
      if (placeInsightsBuilder_ == null) {
        return placeInsights_.get(index);
      } else {
        return placeInsightsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder setPlaceInsights(int index, com.google.maps.areainsights.v1.PlaceInsight value) {
      if (placeInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlaceInsightsIsMutable();
        placeInsights_.set(index, value);
        onChanged();
      } else {
        placeInsightsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder setPlaceInsights(
        int index, com.google.maps.areainsights.v1.PlaceInsight.Builder builderForValue) {
      if (placeInsightsBuilder_ == null) {
        ensurePlaceInsightsIsMutable();
        placeInsights_.set(index, builderForValue.build());
        onChanged();
      } else {
        placeInsightsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder addPlaceInsights(com.google.maps.areainsights.v1.PlaceInsight value) {
      if (placeInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlaceInsightsIsMutable();
        placeInsights_.add(value);
        onChanged();
      } else {
        placeInsightsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder addPlaceInsights(int index, com.google.maps.areainsights.v1.PlaceInsight value) {
      if (placeInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlaceInsightsIsMutable();
        placeInsights_.add(index, value);
        onChanged();
      } else {
        placeInsightsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder addPlaceInsights(
        com.google.maps.areainsights.v1.PlaceInsight.Builder builderForValue) {
      if (placeInsightsBuilder_ == null) {
        ensurePlaceInsightsIsMutable();
        placeInsights_.add(builderForValue.build());
        onChanged();
      } else {
        placeInsightsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder addPlaceInsights(
        int index, com.google.maps.areainsights.v1.PlaceInsight.Builder builderForValue) {
      if (placeInsightsBuilder_ == null) {
        ensurePlaceInsightsIsMutable();
        placeInsights_.add(index, builderForValue.build());
        onChanged();
      } else {
        placeInsightsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder addAllPlaceInsights(
        java.lang.Iterable<? extends com.google.maps.areainsights.v1.PlaceInsight> values) {
      if (placeInsightsBuilder_ == null) {
        ensurePlaceInsightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, placeInsights_);
        onChanged();
      } else {
        placeInsightsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder clearPlaceInsights() {
      if (placeInsightsBuilder_ == null) {
        placeInsights_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        placeInsightsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public Builder removePlaceInsights(int index) {
      if (placeInsightsBuilder_ == null) {
        ensurePlaceInsightsIsMutable();
        placeInsights_.remove(index);
        onChanged();
      } else {
        placeInsightsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public com.google.maps.areainsights.v1.PlaceInsight.Builder getPlaceInsightsBuilder(int index) {
      return getPlaceInsightsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public com.google.maps.areainsights.v1.PlaceInsightOrBuilder getPlaceInsightsOrBuilder(
        int index) {
      if (placeInsightsBuilder_ == null) {
        return placeInsights_.get(index);
      } else {
        return placeInsightsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public java.util.List<? extends com.google.maps.areainsights.v1.PlaceInsightOrBuilder>
        getPlaceInsightsOrBuilderList() {
      if (placeInsightsBuilder_ != null) {
        return placeInsightsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(placeInsights_);
      }
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public com.google.maps.areainsights.v1.PlaceInsight.Builder addPlaceInsightsBuilder() {
      return getPlaceInsightsFieldBuilder()
          .addBuilder(com.google.maps.areainsights.v1.PlaceInsight.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public com.google.maps.areainsights.v1.PlaceInsight.Builder addPlaceInsightsBuilder(int index) {
      return getPlaceInsightsFieldBuilder()
          .addBuilder(index, com.google.maps.areainsights.v1.PlaceInsight.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Result for Insights.INSIGHT_PLACES.
     * </pre>
     *
     * <code>repeated .google.maps.areainsights.v1.PlaceInsight place_insights = 5;</code>
     */
    public java.util.List<com.google.maps.areainsights.v1.PlaceInsight.Builder>
        getPlaceInsightsBuilderList() {
      return getPlaceInsightsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.maps.areainsights.v1.PlaceInsight,
            com.google.maps.areainsights.v1.PlaceInsight.Builder,
            com.google.maps.areainsights.v1.PlaceInsightOrBuilder>
        getPlaceInsightsFieldBuilder() {
      if (placeInsightsBuilder_ == null) {
        placeInsightsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.maps.areainsights.v1.PlaceInsight,
                com.google.maps.areainsights.v1.PlaceInsight.Builder,
                com.google.maps.areainsights.v1.PlaceInsightOrBuilder>(
                placeInsights_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        placeInsights_ = null;
      }
      return placeInsightsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.maps.areainsights.v1.ComputeInsightsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.maps.areainsights.v1.ComputeInsightsResponse)
  private static final com.google.maps.areainsights.v1.ComputeInsightsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.areainsights.v1.ComputeInsightsResponse();
  }

  public static com.google.maps.areainsights.v1.ComputeInsightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeInsightsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ComputeInsightsResponse>() {
        @java.lang.Override
        public ComputeInsightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeInsightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeInsightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.areainsights.v1.ComputeInsightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
