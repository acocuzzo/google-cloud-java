/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 *
 *
 * <pre>
 * The system resources for the pipeline run.
 *
 * At least one zone or region must be specified or the pipeline run will fail.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.Resources}
 */
public final class Resources extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.Resources)
    ResourcesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Resources.newBuilder() to construct.
  private Resources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Resources() {
    regions_ = com.google.protobuf.LazyStringArrayList.emptyList();
    zones_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Resources();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_Resources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_Resources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.Resources.class,
            com.google.cloud.lifesciences.v2beta.Resources.Builder.class);
  }

  public static final int REGIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList regions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return A list containing the regions.
   */
  public com.google.protobuf.ProtocolStringList getRegionsList() {
    return regions_;
  }
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @return The count of regions.
   */
  public int getRegionsCount() {
    return regions_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The regions at the given index.
   */
  public java.lang.String getRegions(int index) {
    return regions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of regions allowed for VM allocation. If set, the `zones` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string regions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regions at the given index.
   */
  public com.google.protobuf.ByteString getRegionsBytes(int index) {
    return regions_.getByteString(index);
  }

  public static final int ZONES_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList zones_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @return A list containing the zones.
   */
  public com.google.protobuf.ProtocolStringList getZonesList() {
    return zones_;
  }
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @return The count of zones.
   */
  public int getZonesCount() {
    return zones_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The zones at the given index.
   */
  public java.lang.String getZones(int index) {
    return zones_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of zones allowed for VM allocation. If set, the `regions` field
   * must not be set.
   * </pre>
   *
   * <code>repeated string zones = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the zones at the given index.
   */
  public com.google.protobuf.ByteString getZonesBytes(int index) {
    return zones_.getByteString(index);
  }

  public static final int VIRTUAL_MACHINE_FIELD_NUMBER = 4;
  private com.google.cloud.lifesciences.v2beta.VirtualMachine virtualMachine_;
  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   *
   * @return Whether the virtualMachine field is set.
   */
  @java.lang.Override
  public boolean hasVirtualMachine() {
    return virtualMachine_ != null;
  }
  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   *
   * @return The virtualMachine.
   */
  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.VirtualMachine getVirtualMachine() {
    return virtualMachine_ == null
        ? com.google.cloud.lifesciences.v2beta.VirtualMachine.getDefaultInstance()
        : virtualMachine_;
  }
  /**
   *
   *
   * <pre>
   * The virtual machine specification.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder getVirtualMachineOrBuilder() {
    return virtualMachine_ == null
        ? com.google.cloud.lifesciences.v2beta.VirtualMachine.getDefaultInstance()
        : virtualMachine_;
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
    for (int i = 0; i < regions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, regions_.getRaw(i));
    }
    for (int i = 0; i < zones_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, zones_.getRaw(i));
    }
    if (virtualMachine_ != null) {
      output.writeMessage(4, getVirtualMachine());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < regions_.size(); i++) {
        dataSize += computeStringSizeNoTag(regions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRegionsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < zones_.size(); i++) {
        dataSize += computeStringSizeNoTag(zones_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getZonesList().size();
    }
    if (virtualMachine_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getVirtualMachine());
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.Resources)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.Resources other =
        (com.google.cloud.lifesciences.v2beta.Resources) obj;

    if (!getRegionsList().equals(other.getRegionsList())) return false;
    if (!getZonesList().equals(other.getZonesList())) return false;
    if (hasVirtualMachine() != other.hasVirtualMachine()) return false;
    if (hasVirtualMachine()) {
      if (!getVirtualMachine().equals(other.getVirtualMachine())) return false;
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
    if (getRegionsCount() > 0) {
      hash = (37 * hash) + REGIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRegionsList().hashCode();
    }
    if (getZonesCount() > 0) {
      hash = (37 * hash) + ZONES_FIELD_NUMBER;
      hash = (53 * hash) + getZonesList().hashCode();
    }
    if (hasVirtualMachine()) {
      hash = (37 * hash) + VIRTUAL_MACHINE_FIELD_NUMBER;
      hash = (53 * hash) + getVirtualMachine().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Resources parseFrom(
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

  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.Resources prototype) {
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
   * The system resources for the pipeline run.
   *
   * At least one zone or region must be specified or the pipeline run will fail.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.Resources}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.Resources)
      com.google.cloud.lifesciences.v2beta.ResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Resources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Resources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.Resources.class,
              com.google.cloud.lifesciences.v2beta.Resources.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.Resources.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      regions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      zones_ = com.google.protobuf.LazyStringArrayList.emptyList();
      virtualMachine_ = null;
      if (virtualMachineBuilder_ != null) {
        virtualMachineBuilder_.dispose();
        virtualMachineBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Resources_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Resources getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.Resources.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Resources build() {
      com.google.cloud.lifesciences.v2beta.Resources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Resources buildPartial() {
      com.google.cloud.lifesciences.v2beta.Resources result =
          new com.google.cloud.lifesciences.v2beta.Resources(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.Resources result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        regions_.makeImmutable();
        result.regions_ = regions_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        zones_.makeImmutable();
        result.zones_ = zones_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.virtualMachine_ =
            virtualMachineBuilder_ == null ? virtualMachine_ : virtualMachineBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.Resources) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.Resources) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.Resources other) {
      if (other == com.google.cloud.lifesciences.v2beta.Resources.getDefaultInstance()) return this;
      if (!other.regions_.isEmpty()) {
        if (regions_.isEmpty()) {
          regions_ = other.regions_;
          bitField0_ |= 0x00000001;
        } else {
          ensureRegionsIsMutable();
          regions_.addAll(other.regions_);
        }
        onChanged();
      }
      if (!other.zones_.isEmpty()) {
        if (zones_.isEmpty()) {
          zones_ = other.zones_;
          bitField0_ |= 0x00000002;
        } else {
          ensureZonesIsMutable();
          zones_.addAll(other.zones_);
        }
        onChanged();
      }
      if (other.hasVirtualMachine()) {
        mergeVirtualMachine(other.getVirtualMachine());
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
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureRegionsIsMutable();
                regions_.add(s);
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureZonesIsMutable();
                zones_.add(s);
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getVirtualMachineFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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

    private com.google.protobuf.LazyStringArrayList regions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureRegionsIsMutable() {
      if (!regions_.isModifiable()) {
        regions_ = new com.google.protobuf.LazyStringArrayList(regions_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @return A list containing the regions.
     */
    public com.google.protobuf.ProtocolStringList getRegionsList() {
      regions_.makeImmutable();
      return regions_;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @return The count of regions.
     */
    public int getRegionsCount() {
      return regions_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The regions at the given index.
     */
    public java.lang.String getRegions(int index) {
      return regions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the regions at the given index.
     */
    public com.google.protobuf.ByteString getRegionsBytes(int index) {
      return regions_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The regions to set.
     * @return This builder for chaining.
     */
    public Builder setRegions(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRegionsIsMutable();
      regions_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param value The regions to add.
     * @return This builder for chaining.
     */
    public Builder addRegions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRegionsIsMutable();
      regions_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param values The regions to add.
     * @return This builder for chaining.
     */
    public Builder addAllRegions(java.lang.Iterable<java.lang.String> values) {
      ensureRegionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, regions_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegions() {
      regions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of regions allowed for VM allocation. If set, the `zones` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string regions = 2;</code>
     *
     * @param value The bytes of the regions to add.
     * @return This builder for chaining.
     */
    public Builder addRegionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureRegionsIsMutable();
      regions_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList zones_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureZonesIsMutable() {
      if (!zones_.isModifiable()) {
        zones_ = new com.google.protobuf.LazyStringArrayList(zones_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @return A list containing the zones.
     */
    public com.google.protobuf.ProtocolStringList getZonesList() {
      zones_.makeImmutable();
      return zones_;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @return The count of zones.
     */
    public int getZonesCount() {
      return zones_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The zones at the given index.
     */
    public java.lang.String getZones(int index) {
      return zones_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the zones at the given index.
     */
    public com.google.protobuf.ByteString getZonesBytes(int index) {
      return zones_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The zones to set.
     * @return This builder for chaining.
     */
    public Builder setZones(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureZonesIsMutable();
      zones_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param value The zones to add.
     * @return This builder for chaining.
     */
    public Builder addZones(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureZonesIsMutable();
      zones_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param values The zones to add.
     * @return This builder for chaining.
     */
    public Builder addAllZones(java.lang.Iterable<java.lang.String> values) {
      ensureZonesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, zones_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZones() {
      zones_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of zones allowed for VM allocation. If set, the `regions` field
     * must not be set.
     * </pre>
     *
     * <code>repeated string zones = 3;</code>
     *
     * @param value The bytes of the zones to add.
     * @return This builder for chaining.
     */
    public Builder addZonesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureZonesIsMutable();
      zones_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.lifesciences.v2beta.VirtualMachine virtualMachine_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.lifesciences.v2beta.VirtualMachine,
            com.google.cloud.lifesciences.v2beta.VirtualMachine.Builder,
            com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder>
        virtualMachineBuilder_;
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     *
     * @return Whether the virtualMachine field is set.
     */
    public boolean hasVirtualMachine() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     *
     * @return The virtualMachine.
     */
    public com.google.cloud.lifesciences.v2beta.VirtualMachine getVirtualMachine() {
      if (virtualMachineBuilder_ == null) {
        return virtualMachine_ == null
            ? com.google.cloud.lifesciences.v2beta.VirtualMachine.getDefaultInstance()
            : virtualMachine_;
      } else {
        return virtualMachineBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public Builder setVirtualMachine(com.google.cloud.lifesciences.v2beta.VirtualMachine value) {
      if (virtualMachineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        virtualMachine_ = value;
      } else {
        virtualMachineBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public Builder setVirtualMachine(
        com.google.cloud.lifesciences.v2beta.VirtualMachine.Builder builderForValue) {
      if (virtualMachineBuilder_ == null) {
        virtualMachine_ = builderForValue.build();
      } else {
        virtualMachineBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public Builder mergeVirtualMachine(com.google.cloud.lifesciences.v2beta.VirtualMachine value) {
      if (virtualMachineBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && virtualMachine_ != null
            && virtualMachine_
                != com.google.cloud.lifesciences.v2beta.VirtualMachine.getDefaultInstance()) {
          getVirtualMachineBuilder().mergeFrom(value);
        } else {
          virtualMachine_ = value;
        }
      } else {
        virtualMachineBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public Builder clearVirtualMachine() {
      bitField0_ = (bitField0_ & ~0x00000004);
      virtualMachine_ = null;
      if (virtualMachineBuilder_ != null) {
        virtualMachineBuilder_.dispose();
        virtualMachineBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public com.google.cloud.lifesciences.v2beta.VirtualMachine.Builder getVirtualMachineBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVirtualMachineFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    public com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder
        getVirtualMachineOrBuilder() {
      if (virtualMachineBuilder_ != null) {
        return virtualMachineBuilder_.getMessageOrBuilder();
      } else {
        return virtualMachine_ == null
            ? com.google.cloud.lifesciences.v2beta.VirtualMachine.getDefaultInstance()
            : virtualMachine_;
      }
    }
    /**
     *
     *
     * <pre>
     * The virtual machine specification.
     * </pre>
     *
     * <code>.google.cloud.lifesciences.v2beta.VirtualMachine virtual_machine = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.lifesciences.v2beta.VirtualMachine,
            com.google.cloud.lifesciences.v2beta.VirtualMachine.Builder,
            com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder>
        getVirtualMachineFieldBuilder() {
      if (virtualMachineBuilder_ == null) {
        virtualMachineBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.lifesciences.v2beta.VirtualMachine,
                com.google.cloud.lifesciences.v2beta.VirtualMachine.Builder,
                com.google.cloud.lifesciences.v2beta.VirtualMachineOrBuilder>(
                getVirtualMachine(), getParentForChildren(), isClean());
        virtualMachine_ = null;
      }
      return virtualMachineBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.Resources)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.Resources)
  private static final com.google.cloud.lifesciences.v2beta.Resources DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.Resources();
  }

  public static com.google.cloud.lifesciences.v2beta.Resources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resources> PARSER =
      new com.google.protobuf.AbstractParser<Resources>() {
        @java.lang.Override
        public Resources parsePartialFrom(
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

  public static com.google.protobuf.Parser<Resources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.Resources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
