// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 * <pre>
 * Location of the source manifest in Google Cloud Storage.
 * This feature is in Preview; see description
 * [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.StorageSourceManifest}
 */
public final class StorageSourceManifest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.StorageSourceManifest)
    StorageSourceManifestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StorageSourceManifest.newBuilder() to construct.
  private StorageSourceManifest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StorageSourceManifest() {
    bucket_ = "";
    object_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StorageSourceManifest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_StorageSourceManifest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_StorageSourceManifest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.StorageSourceManifest.class, com.google.cloudbuild.v1.StorageSourceManifest.Builder.class);
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  private volatile java.lang.Object bucket_;
  /**
   * <pre>
   * Google Cloud Storage bucket containing the source manifest (see [Bucket
   * Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   * @return The bucket.
   */
  @java.lang.Override
  public java.lang.String getBucket() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Google Cloud Storage bucket containing the source manifest (see [Bucket
   * Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   * @return The bytes for bucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBucketBytes() {
    java.lang.Object ref = bucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_FIELD_NUMBER = 2;
  private volatile java.lang.Object object_;
  /**
   * <pre>
   * Google Cloud Storage object containing the source manifest.
   * This object must be a JSON file.
   * </pre>
   *
   * <code>string object = 2;</code>
   * @return The object.
   */
  @java.lang.Override
  public java.lang.String getObject() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      object_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Google Cloud Storage object containing the source manifest.
   * This object must be a JSON file.
   * </pre>
   *
   * <code>string object = 2;</code>
   * @return The bytes for object.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectBytes() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      object_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENERATION_FIELD_NUMBER = 3;
  private long generation_;
  /**
   * <pre>
   * Google Cloud Storage generation for the object. If the generation is
   * omitted, the latest generation will be used.
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   * @return The generation.
   */
  @java.lang.Override
  public long getGeneration() {
    return generation_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, object_);
    }
    if (generation_ != 0L) {
      output.writeInt64(3, generation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(object_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, object_);
    }
    if (generation_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, generation_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.StorageSourceManifest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.StorageSourceManifest other = (com.google.cloudbuild.v1.StorageSourceManifest) obj;

    if (!getBucket()
        .equals(other.getBucket())) return false;
    if (!getObject()
        .equals(other.getObject())) return false;
    if (getGeneration()
        != other.getGeneration()) return false;
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
    hash = (37 * hash) + BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getBucket().hashCode();
    hash = (37 * hash) + OBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getObject().hashCode();
    hash = (37 * hash) + GENERATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGeneration());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.StorageSourceManifest parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.StorageSourceManifest prototype) {
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
   * Location of the source manifest in Google Cloud Storage.
   * This feature is in Preview; see description
   * [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.StorageSourceManifest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.StorageSourceManifest)
      com.google.cloudbuild.v1.StorageSourceManifestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_StorageSourceManifest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_StorageSourceManifest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.StorageSourceManifest.class, com.google.cloudbuild.v1.StorageSourceManifest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.StorageSourceManifest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bucket_ = "";

      object_ = "";

      generation_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_StorageSourceManifest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSourceManifest getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.StorageSourceManifest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSourceManifest build() {
      com.google.cloudbuild.v1.StorageSourceManifest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.StorageSourceManifest buildPartial() {
      com.google.cloudbuild.v1.StorageSourceManifest result = new com.google.cloudbuild.v1.StorageSourceManifest(this);
      result.bucket_ = bucket_;
      result.object_ = object_;
      result.generation_ = generation_;
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
      if (other instanceof com.google.cloudbuild.v1.StorageSourceManifest) {
        return mergeFrom((com.google.cloudbuild.v1.StorageSourceManifest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.StorageSourceManifest other) {
      if (other == com.google.cloudbuild.v1.StorageSourceManifest.getDefaultInstance()) return this;
      if (!other.getBucket().isEmpty()) {
        bucket_ = other.bucket_;
        onChanged();
      }
      if (!other.getObject().isEmpty()) {
        object_ = other.object_;
        onChanged();
      }
      if (other.getGeneration() != 0L) {
        setGeneration(other.getGeneration());
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
              bucket_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              object_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              generation_ = input.readInt64();

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

    private java.lang.Object bucket_ = "";
    /**
     * <pre>
     * Google Cloud Storage bucket containing the source manifest (see [Bucket
     * Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return The bucket.
     */
    public java.lang.String getBucket() {
      java.lang.Object ref = bucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage bucket containing the source manifest (see [Bucket
     * Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return The bytes for bucket.
     */
    public com.google.protobuf.ByteString
        getBucketBytes() {
      java.lang.Object ref = bucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage bucket containing the source manifest (see [Bucket
     * Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @param value The bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage bucket containing the source manifest (see [Bucket
     * Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucket() {
      
      bucket_ = getDefaultInstance().getBucket();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage bucket containing the source manifest (see [Bucket
     * Name
     * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * </pre>
     *
     * <code>string bucket = 1;</code>
     * @param value The bytes for bucket to set.
     * @return This builder for chaining.
     */
    public Builder setBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bucket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object object_ = "";
    /**
     * <pre>
     * Google Cloud Storage object containing the source manifest.
     * This object must be a JSON file.
     * </pre>
     *
     * <code>string object = 2;</code>
     * @return The object.
     */
    public java.lang.String getObject() {
      java.lang.Object ref = object_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        object_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage object containing the source manifest.
     * This object must be a JSON file.
     * </pre>
     *
     * <code>string object = 2;</code>
     * @return The bytes for object.
     */
    public com.google.protobuf.ByteString
        getObjectBytes() {
      java.lang.Object ref = object_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        object_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Google Cloud Storage object containing the source manifest.
     * This object must be a JSON file.
     * </pre>
     *
     * <code>string object = 2;</code>
     * @param value The object to set.
     * @return This builder for chaining.
     */
    public Builder setObject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      object_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage object containing the source manifest.
     * This object must be a JSON file.
     * </pre>
     *
     * <code>string object = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearObject() {
      
      object_ = getDefaultInstance().getObject();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage object containing the source manifest.
     * This object must be a JSON file.
     * </pre>
     *
     * <code>string object = 2;</code>
     * @param value The bytes for object to set.
     * @return This builder for chaining.
     */
    public Builder setObjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      object_ = value;
      onChanged();
      return this;
    }

    private long generation_ ;
    /**
     * <pre>
     * Google Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @return The generation.
     */
    @java.lang.Override
    public long getGeneration() {
      return generation_;
    }
    /**
     * <pre>
     * Google Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @param value The generation to set.
     * @return This builder for chaining.
     */
    public Builder setGeneration(long value) {
      
      generation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Storage generation for the object. If the generation is
     * omitted, the latest generation will be used.
     * </pre>
     *
     * <code>int64 generation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGeneration() {
      
      generation_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.StorageSourceManifest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.StorageSourceManifest)
  private static final com.google.cloudbuild.v1.StorageSourceManifest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.StorageSourceManifest();
  }

  public static com.google.cloudbuild.v1.StorageSourceManifest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageSourceManifest>
      PARSER = new com.google.protobuf.AbstractParser<StorageSourceManifest>() {
    @java.lang.Override
    public StorageSourceManifest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StorageSourceManifest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageSourceManifest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.StorageSourceManifest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

