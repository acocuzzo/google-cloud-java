// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2beta/functions.proto

package com.google.cloud.functions.v2beta;

/**
 * <pre>
 * The location of the function source code.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2beta.Source}
 */
public final class Source extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2beta.Source)
    SourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Source.newBuilder() to construct.
  private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Source() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Source();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.functions.v2beta.FunctionsProto.internal_static_google_cloud_functions_v2beta_Source_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2beta.FunctionsProto.internal_static_google_cloud_functions_v2beta_Source_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2beta.Source.class, com.google.cloud.functions.v2beta.Source.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STORAGE_SOURCE(1),
    REPO_SOURCE(2),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return STORAGE_SOURCE;
        case 2: return REPO_SOURCE;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int STORAGE_SOURCE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
   * @return Whether the storageSource field is set.
   */
  @java.lang.Override
  public boolean hasStorageSource() {
    return sourceCase_ == 1;
  }
  /**
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
   * @return The storageSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.StorageSource getStorageSource() {
    if (sourceCase_ == 1) {
       return (com.google.cloud.functions.v2beta.StorageSource) source_;
    }
    return com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
  }
  /**
   * <pre>
   * If provided, get the source from this location in Google Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.StorageSourceOrBuilder getStorageSourceOrBuilder() {
    if (sourceCase_ == 1) {
       return (com.google.cloud.functions.v2beta.StorageSource) source_;
    }
    return com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
  }

  public static final int REPO_SOURCE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
   * @return Whether the repoSource field is set.
   */
  @java.lang.Override
  public boolean hasRepoSource() {
    return sourceCase_ == 2;
  }
  /**
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
   * @return The repoSource.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.RepoSource getRepoSource() {
    if (sourceCase_ == 2) {
       return (com.google.cloud.functions.v2beta.RepoSource) source_;
    }
    return com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
  }
  /**
   * <pre>
   * If provided, get the source from this location in a Cloud Source
   * Repository.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.functions.v2beta.RepoSourceOrBuilder getRepoSourceOrBuilder() {
    if (sourceCase_ == 2) {
       return (com.google.cloud.functions.v2beta.RepoSource) source_;
    }
    return com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.functions.v2beta.StorageSource) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.functions.v2beta.RepoSource) source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.functions.v2beta.StorageSource) source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.cloud.functions.v2beta.RepoSource) source_);
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
    if (!(obj instanceof com.google.cloud.functions.v2beta.Source)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2beta.Source other = (com.google.cloud.functions.v2beta.Source) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getStorageSource()
            .equals(other.getStorageSource())) return false;
        break;
      case 2:
        if (!getRepoSource()
            .equals(other.getRepoSource())) return false;
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + STORAGE_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getStorageSource().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REPO_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getRepoSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2beta.Source parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v2beta.Source parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2beta.Source parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v2beta.Source parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v2beta.Source prototype) {
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
   * The location of the function source code.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2beta.Source}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2beta.Source)
      com.google.cloud.functions.v2beta.SourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v2beta.FunctionsProto.internal_static_google_cloud_functions_v2beta_Source_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2beta.FunctionsProto.internal_static_google_cloud_functions_v2beta_Source_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2beta.Source.class, com.google.cloud.functions.v2beta.Source.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2beta.Source.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (storageSourceBuilder_ != null) {
        storageSourceBuilder_.clear();
      }
      if (repoSourceBuilder_ != null) {
        repoSourceBuilder_.clear();
      }
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v2beta.FunctionsProto.internal_static_google_cloud_functions_v2beta_Source_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.Source getDefaultInstanceForType() {
      return com.google.cloud.functions.v2beta.Source.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.Source build() {
      com.google.cloud.functions.v2beta.Source result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2beta.Source buildPartial() {
      com.google.cloud.functions.v2beta.Source result = new com.google.cloud.functions.v2beta.Source(this);
      if (sourceCase_ == 1) {
        if (storageSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = storageSourceBuilder_.build();
        }
      }
      if (sourceCase_ == 2) {
        if (repoSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = repoSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.functions.v2beta.Source) {
        return mergeFrom((com.google.cloud.functions.v2beta.Source)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2beta.Source other) {
      if (other == com.google.cloud.functions.v2beta.Source.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case STORAGE_SOURCE: {
          mergeStorageSource(other.getStorageSource());
          break;
        }
        case REPO_SOURCE: {
          mergeRepoSource(other.getRepoSource());
          break;
        }
        case SOURCE_NOT_SET: {
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
            case 10: {
              input.readMessage(
                  getStorageSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              sourceCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRepoSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              sourceCase_ = 2;
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
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2beta.StorageSource, com.google.cloud.functions.v2beta.StorageSource.Builder, com.google.cloud.functions.v2beta.StorageSourceOrBuilder> storageSourceBuilder_;
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     * @return Whether the storageSource field is set.
     */
    @java.lang.Override
    public boolean hasStorageSource() {
      return sourceCase_ == 1;
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     * @return The storageSource.
     */
    @java.lang.Override
    public com.google.cloud.functions.v2beta.StorageSource getStorageSource() {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.functions.v2beta.StorageSource) source_;
        }
        return com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return storageSourceBuilder_.getMessage();
        }
        return com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    public Builder setStorageSource(com.google.cloud.functions.v2beta.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    public Builder setStorageSource(
        com.google.cloud.functions.v2beta.StorageSource.Builder builderForValue) {
      if (storageSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        storageSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    public Builder mergeStorageSource(com.google.cloud.functions.v2beta.StorageSource value) {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 1 &&
            source_ != com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance()) {
          source_ = com.google.cloud.functions.v2beta.StorageSource.newBuilder((com.google.cloud.functions.v2beta.StorageSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          storageSourceBuilder_.mergeFrom(value);
        } else {
          storageSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    public Builder clearStorageSource() {
      if (storageSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        storageSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    public com.google.cloud.functions.v2beta.StorageSource.Builder getStorageSourceBuilder() {
      return getStorageSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.functions.v2beta.StorageSourceOrBuilder getStorageSourceOrBuilder() {
      if ((sourceCase_ == 1) && (storageSourceBuilder_ != null)) {
        return storageSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.functions.v2beta.StorageSource) source_;
        }
        return com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If provided, get the source from this location in Google Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.StorageSource storage_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2beta.StorageSource, com.google.cloud.functions.v2beta.StorageSource.Builder, com.google.cloud.functions.v2beta.StorageSourceOrBuilder> 
        getStorageSourceFieldBuilder() {
      if (storageSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.functions.v2beta.StorageSource.getDefaultInstance();
        }
        storageSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.StorageSource, com.google.cloud.functions.v2beta.StorageSource.Builder, com.google.cloud.functions.v2beta.StorageSourceOrBuilder>(
                (com.google.cloud.functions.v2beta.StorageSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();;
      return storageSourceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2beta.RepoSource, com.google.cloud.functions.v2beta.RepoSource.Builder, com.google.cloud.functions.v2beta.RepoSourceOrBuilder> repoSourceBuilder_;
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     * @return Whether the repoSource field is set.
     */
    @java.lang.Override
    public boolean hasRepoSource() {
      return sourceCase_ == 2;
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     * @return The repoSource.
     */
    @java.lang.Override
    public com.google.cloud.functions.v2beta.RepoSource getRepoSource() {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloud.functions.v2beta.RepoSource) source_;
        }
        return com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return repoSourceBuilder_.getMessage();
        }
        return com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    public Builder setRepoSource(com.google.cloud.functions.v2beta.RepoSource value) {
      if (repoSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        repoSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    public Builder setRepoSource(
        com.google.cloud.functions.v2beta.RepoSource.Builder builderForValue) {
      if (repoSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        repoSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    public Builder mergeRepoSource(com.google.cloud.functions.v2beta.RepoSource value) {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance()) {
          source_ = com.google.cloud.functions.v2beta.RepoSource.newBuilder((com.google.cloud.functions.v2beta.RepoSource) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          repoSourceBuilder_.mergeFrom(value);
        } else {
          repoSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    public Builder clearRepoSource() {
      if (repoSourceBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        repoSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    public com.google.cloud.functions.v2beta.RepoSource.Builder getRepoSourceBuilder() {
      return getRepoSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.functions.v2beta.RepoSourceOrBuilder getRepoSourceOrBuilder() {
      if ((sourceCase_ == 2) && (repoSourceBuilder_ != null)) {
        return repoSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloud.functions.v2beta.RepoSource) source_;
        }
        return com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If provided, get the source from this location in a Cloud Source
     * Repository.
     * </pre>
     *
     * <code>.google.cloud.functions.v2beta.RepoSource repo_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.functions.v2beta.RepoSource, com.google.cloud.functions.v2beta.RepoSource.Builder, com.google.cloud.functions.v2beta.RepoSourceOrBuilder> 
        getRepoSourceFieldBuilder() {
      if (repoSourceBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloud.functions.v2beta.RepoSource.getDefaultInstance();
        }
        repoSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.functions.v2beta.RepoSource, com.google.cloud.functions.v2beta.RepoSource.Builder, com.google.cloud.functions.v2beta.RepoSourceOrBuilder>(
                (com.google.cloud.functions.v2beta.RepoSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();;
      return repoSourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2beta.Source)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2beta.Source)
  private static final com.google.cloud.functions.v2beta.Source DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2beta.Source();
  }

  public static com.google.cloud.functions.v2beta.Source getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Source>
      PARSER = new com.google.protobuf.AbstractParser<Source>() {
    @java.lang.Override
    public Source parsePartialFrom(
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

  public static com.google.protobuf.Parser<Source> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Source> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2beta.Source getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

