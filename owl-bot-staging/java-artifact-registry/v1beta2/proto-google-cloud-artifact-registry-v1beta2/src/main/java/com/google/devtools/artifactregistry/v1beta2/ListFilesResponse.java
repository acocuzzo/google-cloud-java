// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/file.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * The response from listing files.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListFilesResponse}
 */
public final class ListFilesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ListFilesResponse)
    ListFilesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFilesResponse.newBuilder() to construct.
  private ListFilesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFilesResponse() {
    files_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFilesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.artifactregistry.v1beta2.FileProto.internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.FileProto.internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.class, com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.Builder.class);
  }

  public static final int FILES_FIELD_NUMBER = 1;
  private java.util.List<com.google.devtools.artifactregistry.v1beta2.File> files_;
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.artifactregistry.v1beta2.File> getFilesList() {
    return files_;
  }
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.FileOrBuilder> 
      getFilesOrBuilderList() {
    return files_;
  }
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  @java.lang.Override
  public int getFilesCount() {
    return files_.size();
  }
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.File getFiles(int index) {
    return files_.get(index);
  }
  /**
   * <pre>
   * The files returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.FileOrBuilder getFilesOrBuilder(
      int index) {
    return files_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The token to retrieve the next page of files, or empty if there are no
   * more files to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The token to retrieve the next page of files, or empty if there are no
   * more files to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < files_.size(); i++) {
      output.writeMessage(1, files_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < files_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, files_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ListFilesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ListFilesResponse other = (com.google.devtools.artifactregistry.v1beta2.ListFilesResponse) obj;

    if (!getFilesList()
        .equals(other.getFilesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getFilesCount() > 0) {
      hash = (37 * hash) + FILES_FIELD_NUMBER;
      hash = (53 * hash) + getFilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.ListFilesResponse prototype) {
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
   * The response from listing files.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListFilesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ListFilesResponse)
      com.google.devtools.artifactregistry.v1beta2.ListFilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.FileProto.internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.FileProto.internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.class, com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
      } else {
        files_ = null;
        filesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.FileProto.internal_static_google_devtools_artifactregistry_v1beta2_ListFilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListFilesResponse getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListFilesResponse build() {
      com.google.devtools.artifactregistry.v1beta2.ListFilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListFilesResponse buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ListFilesResponse result = new com.google.devtools.artifactregistry.v1beta2.ListFilesResponse(this);
      int from_bitField0_ = bitField0_;
      if (filesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          files_ = java.util.Collections.unmodifiableList(files_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.files_ = files_;
      } else {
        result.files_ = filesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.ListFilesResponse) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.ListFilesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.ListFilesResponse other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.ListFilesResponse.getDefaultInstance()) return this;
      if (filesBuilder_ == null) {
        if (!other.files_.isEmpty()) {
          if (files_.isEmpty()) {
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFilesIsMutable();
            files_.addAll(other.files_);
          }
          onChanged();
        }
      } else {
        if (!other.files_.isEmpty()) {
          if (filesBuilder_.isEmpty()) {
            filesBuilder_.dispose();
            filesBuilder_ = null;
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFilesFieldBuilder() : null;
          } else {
            filesBuilder_.addAllMessages(other.files_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
              com.google.devtools.artifactregistry.v1beta2.File m =
                  input.readMessage(
                      com.google.devtools.artifactregistry.v1beta2.File.parser(),
                      extensionRegistry);
              if (filesBuilder_ == null) {
                ensureFilesIsMutable();
                files_.add(m);
              } else {
                filesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.devtools.artifactregistry.v1beta2.File> files_ =
      java.util.Collections.emptyList();
    private void ensureFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        files_ = new java.util.ArrayList<com.google.devtools.artifactregistry.v1beta2.File>(files_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.File, com.google.devtools.artifactregistry.v1beta2.File.Builder, com.google.devtools.artifactregistry.v1beta2.FileOrBuilder> filesBuilder_;

    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1beta2.File> getFilesList() {
      if (filesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(files_);
      } else {
        return filesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public int getFilesCount() {
      if (filesBuilder_ == null) {
        return files_.size();
      } else {
        return filesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.File getFiles(int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);
      } else {
        return filesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder setFiles(
        int index, com.google.devtools.artifactregistry.v1beta2.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.set(index, value);
        onChanged();
      } else {
        filesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder setFiles(
        int index, com.google.devtools.artifactregistry.v1beta2.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.set(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder addFiles(com.google.devtools.artifactregistry.v1beta2.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(value);
        onChanged();
      } else {
        filesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder addFiles(
        int index, com.google.devtools.artifactregistry.v1beta2.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(index, value);
        onChanged();
      } else {
        filesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder addFiles(
        com.google.devtools.artifactregistry.v1beta2.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder addFiles(
        int index, com.google.devtools.artifactregistry.v1beta2.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder addAllFiles(
        java.lang.Iterable<? extends com.google.devtools.artifactregistry.v1beta2.File> values) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, files_);
        onChanged();
      } else {
        filesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder clearFiles() {
      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public Builder removeFiles(int index) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.remove(index);
        onChanged();
      } else {
        filesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.File.Builder getFilesBuilder(
        int index) {
      return getFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.FileOrBuilder getFilesOrBuilder(
        int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);  } else {
        return filesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.FileOrBuilder> 
         getFilesOrBuilderList() {
      if (filesBuilder_ != null) {
        return filesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(files_);
      }
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.File.Builder addFilesBuilder() {
      return getFilesFieldBuilder().addBuilder(
          com.google.devtools.artifactregistry.v1beta2.File.getDefaultInstance());
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.File.Builder addFilesBuilder(
        int index) {
      return getFilesFieldBuilder().addBuilder(
          index, com.google.devtools.artifactregistry.v1beta2.File.getDefaultInstance());
    }
    /**
     * <pre>
     * The files returned.
     * </pre>
     *
     * <code>repeated .google.devtools.artifactregistry.v1beta2.File files = 1;</code>
     */
    public java.util.List<com.google.devtools.artifactregistry.v1beta2.File.Builder> 
         getFilesBuilderList() {
      return getFilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.File, com.google.devtools.artifactregistry.v1beta2.File.Builder, com.google.devtools.artifactregistry.v1beta2.FileOrBuilder> 
        getFilesFieldBuilder() {
      if (filesBuilder_ == null) {
        filesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.File, com.google.devtools.artifactregistry.v1beta2.File.Builder, com.google.devtools.artifactregistry.v1beta2.FileOrBuilder>(
                files_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        files_ = null;
      }
      return filesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The token to retrieve the next page of files, or empty if there are no
     * more files to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The token to retrieve the next page of files, or empty if there are no
     * more files to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The token to retrieve the next page of files, or empty if there are no
     * more files to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token to retrieve the next page of files, or empty if there are no
     * more files to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token to retrieve the next page of files, or empty if there are no
     * more files to return.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ListFilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ListFilesResponse)
  private static final com.google.devtools.artifactregistry.v1beta2.ListFilesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.ListFilesResponse();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListFilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFilesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListFilesResponse>() {
    @java.lang.Override
    public ListFilesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ListFilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

