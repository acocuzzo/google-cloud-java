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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Resource representation as defined by the corresponding service providing the
 * resource for a given API version.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.VersionedResource}
 */
public final class VersionedResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.VersionedResource)
    VersionedResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VersionedResource.newBuilder() to construct.
  private VersionedResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VersionedResource() {
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VersionedResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_VersionedResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_VersionedResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.VersionedResource.class,
            com.google.cloud.asset.v1.VersionedResource.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * API version of the resource.
   *
   * Example:
   * If the resource is an instance provided by Compute Engine v1 API as defined
   * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
   * version will be "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * API version of the resource.
   *
   * Example:
   * If the resource is an instance provided by Compute Engine v1 API as defined
   * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
   * version will be "v1".
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct resource_;
  /**
   *
   *
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   *
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   *
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   *
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   *
   *
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   *
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   *
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getResource() {
    return resource_ == null ? com.google.protobuf.Struct.getDefaultInstance() : resource_;
  }
  /**
   *
   *
   * <pre>
   * JSON representation of the resource as defined by the corresponding
   * service providing this resource.
   *
   * Example:
   * If the resource is an instance provided by Compute Engine, this field will
   * contain the JSON representation of the instance as defined by Compute
   * Engine:
   * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
   *
   * You can find the resource definition for each supported resource type in
   * this table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getResourceOrBuilder() {
    return resource_ == null ? com.google.protobuf.Struct.getDefaultInstance() : resource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (resource_ != null) {
      output.writeMessage(2, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResource());
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
    if (!(obj instanceof com.google.cloud.asset.v1.VersionedResource)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.VersionedResource other =
        (com.google.cloud.asset.v1.VersionedResource) obj;

    if (!getVersion().equals(other.getVersion())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource().equals(other.getResource())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.VersionedResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.VersionedResource prototype) {
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
   * Resource representation as defined by the corresponding service providing the
   * resource for a given API version.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.VersionedResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.VersionedResource)
      com.google.cloud.asset.v1.VersionedResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_VersionedResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_VersionedResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.VersionedResource.class,
              com.google.cloud.asset.v1.VersionedResource.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.VersionedResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      version_ = "";
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_VersionedResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.VersionedResource getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.VersionedResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.VersionedResource build() {
      com.google.cloud.asset.v1.VersionedResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.VersionedResource buildPartial() {
      com.google.cloud.asset.v1.VersionedResource result =
          new com.google.cloud.asset.v1.VersionedResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.VersionedResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resource_ = resourceBuilder_ == null ? resource_ : resourceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.VersionedResource) {
        return mergeFrom((com.google.cloud.asset.v1.VersionedResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.VersionedResource other) {
      if (other == com.google.cloud.asset.v1.VersionedResource.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
            case 10:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getResourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * API version of the resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine v1 API as defined
     * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
     * version will be "v1".
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * API version of the resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine v1 API as defined
     * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
     * version will be "v1".
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * API version of the resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine v1 API as defined
     * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
     * version will be "v1".
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * API version of the resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine v1 API as defined
     * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
     * version will be "v1".
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * API version of the resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine v1 API as defined
     * in `https://cloud.google.com/compute/docs/reference/rest/v1/instances`,
     * version will be "v1".
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        resourceBuilder_;
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     *
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     *
     * @return The resource.
     */
    public com.google.protobuf.Struct getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.protobuf.Struct.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public Builder setResource(com.google.protobuf.Struct value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public Builder setResource(com.google.protobuf.Struct.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public Builder mergeResource(com.google.protobuf.Struct value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && resource_ != null
            && resource_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getResourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ? com.google.protobuf.Struct.getDefaultInstance() : resource_;
      }
    }
    /**
     *
     *
     * <pre>
     * JSON representation of the resource as defined by the corresponding
     * service providing this resource.
     *
     * Example:
     * If the resource is an instance provided by Compute Engine, this field will
     * contain the JSON representation of the instance as defined by Compute
     * Engine:
     * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`.
     *
     * You can find the resource definition for each supported resource type in
     * this table:
     * `https://cloud.google.com/asset-inventory/docs/supported-asset-types`
     * </pre>
     *
     * <code>.google.protobuf.Struct resource = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getResource(), getParentForChildren(), isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.VersionedResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.VersionedResource)
  private static final com.google.cloud.asset.v1.VersionedResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.VersionedResource();
  }

  public static com.google.cloud.asset.v1.VersionedResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionedResource> PARSER =
      new com.google.protobuf.AbstractParser<VersionedResource>() {
        @java.lang.Override
        public VersionedResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<VersionedResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionedResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.VersionedResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
