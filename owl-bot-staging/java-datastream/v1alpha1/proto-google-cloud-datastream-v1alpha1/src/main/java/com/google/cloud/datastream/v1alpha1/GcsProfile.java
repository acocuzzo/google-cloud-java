// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 * <pre>
 * Cloud Storage bucket profile.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.GcsProfile}
 */
public final class GcsProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.GcsProfile)
    GcsProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsProfile.newBuilder() to construct.
  private GcsProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsProfile() {
    bucketName_ = "";
    rootPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_GcsProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_GcsProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.GcsProfile.class, com.google.cloud.datastream.v1alpha1.GcsProfile.Builder.class);
  }

  public static final int BUCKET_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object bucketName_;
  /**
   * <pre>
   * Required. The full project and resource path for Cloud Storage bucket including the
   * name.
   * </pre>
   *
   * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bucketName.
   */
  @java.lang.Override
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The full project and resource path for Cloud Storage bucket including the
   * name.
   * </pre>
   *
   * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for bucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucketName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOT_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object rootPath_;
  /**
   * <pre>
   * The root path inside the Cloud Storage bucket.
   * </pre>
   *
   * <code>string root_path = 2;</code>
   * @return The rootPath.
   */
  @java.lang.Override
  public java.lang.String getRootPath() {
    java.lang.Object ref = rootPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rootPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The root path inside the Cloud Storage bucket.
   * </pre>
   *
   * <code>string root_path = 2;</code>
   * @return The bytes for rootPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootPathBytes() {
    java.lang.Object ref = rootPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rootPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucketName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, rootPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucketName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, rootPath_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.GcsProfile)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.GcsProfile other = (com.google.cloud.datastream.v1alpha1.GcsProfile) obj;

    if (!getBucketName()
        .equals(other.getBucketName())) return false;
    if (!getRootPath()
        .equals(other.getRootPath())) return false;
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
    hash = (37 * hash) + BUCKET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (37 * hash) + ROOT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getRootPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1alpha1.GcsProfile parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.GcsProfile prototype) {
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
   * Cloud Storage bucket profile.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.GcsProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.GcsProfile)
      com.google.cloud.datastream.v1alpha1.GcsProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_GcsProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_GcsProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.GcsProfile.class, com.google.cloud.datastream.v1alpha1.GcsProfile.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.GcsProfile.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bucketName_ = "";

      rootPath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.internal_static_google_cloud_datastream_v1alpha1_GcsProfile_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.GcsProfile getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.GcsProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.GcsProfile build() {
      com.google.cloud.datastream.v1alpha1.GcsProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.GcsProfile buildPartial() {
      com.google.cloud.datastream.v1alpha1.GcsProfile result = new com.google.cloud.datastream.v1alpha1.GcsProfile(this);
      result.bucketName_ = bucketName_;
      result.rootPath_ = rootPath_;
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.GcsProfile) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.GcsProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.GcsProfile other) {
      if (other == com.google.cloud.datastream.v1alpha1.GcsProfile.getDefaultInstance()) return this;
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
        onChanged();
      }
      if (!other.getRootPath().isEmpty()) {
        rootPath_ = other.rootPath_;
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
              bucketName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              rootPath_ = input.readStringRequireUtf8();

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

    private java.lang.Object bucketName_ = "";
    /**
     * <pre>
     * Required. The full project and resource path for Cloud Storage bucket including the
     * name.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bucketName.
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The full project and resource path for Cloud Storage bucket including the
     * name.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for bucketName.
     */
    public com.google.protobuf.ByteString
        getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The full project and resource path for Cloud Storage bucket including the
     * name.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bucketName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The full project and resource path for Cloud Storage bucket including the
     * name.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketName() {
      
      bucketName_ = getDefaultInstance().getBucketName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The full project and resource path for Cloud Storage bucket including the
     * name.
     * </pre>
     *
     * <code>string bucket_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bucketName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object rootPath_ = "";
    /**
     * <pre>
     * The root path inside the Cloud Storage bucket.
     * </pre>
     *
     * <code>string root_path = 2;</code>
     * @return The rootPath.
     */
    public java.lang.String getRootPath() {
      java.lang.Object ref = rootPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rootPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The root path inside the Cloud Storage bucket.
     * </pre>
     *
     * <code>string root_path = 2;</code>
     * @return The bytes for rootPath.
     */
    public com.google.protobuf.ByteString
        getRootPathBytes() {
      java.lang.Object ref = rootPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rootPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The root path inside the Cloud Storage bucket.
     * </pre>
     *
     * <code>string root_path = 2;</code>
     * @param value The rootPath to set.
     * @return This builder for chaining.
     */
    public Builder setRootPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rootPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The root path inside the Cloud Storage bucket.
     * </pre>
     *
     * <code>string root_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRootPath() {
      
      rootPath_ = getDefaultInstance().getRootPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The root path inside the Cloud Storage bucket.
     * </pre>
     *
     * <code>string root_path = 2;</code>
     * @param value The bytes for rootPath to set.
     * @return This builder for chaining.
     */
    public Builder setRootPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rootPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.GcsProfile)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.GcsProfile)
  private static final com.google.cloud.datastream.v1alpha1.GcsProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.GcsProfile();
  }

  public static com.google.cloud.datastream.v1alpha1.GcsProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsProfile>
      PARSER = new com.google.protobuf.AbstractParser<GcsProfile>() {
    @java.lang.Override
    public GcsProfile parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.GcsProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

