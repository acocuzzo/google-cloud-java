// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeconnect/v1/tether.proto

package com.google.cloud.apigeeconnect.v1;

/**
 * <pre>
 * The proto definition of url.
 * A url represents a URL and the general form represented is:
 *  `[scheme://][google.cloud.apigeeconnect.v1.Url.host][path]`
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeconnect.v1.Url}
 */
public final class Url extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeconnect.v1.Url)
    UrlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Url.newBuilder() to construct.
  private Url(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Url() {
    scheme_ = 0;
    host_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Url();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Url_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Url_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeconnect.v1.Url.class, com.google.cloud.apigeeconnect.v1.Url.Builder.class);
  }

  public static final int SCHEME_FIELD_NUMBER = 1;
  private int scheme_;
  /**
   * <pre>
   * Scheme.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
   * @return The enum numeric value on the wire for scheme.
   */
  @java.lang.Override public int getSchemeValue() {
    return scheme_;
  }
  /**
   * <pre>
   * Scheme.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
   * @return The scheme.
   */
  @java.lang.Override public com.google.cloud.apigeeconnect.v1.Scheme getScheme() {
    @SuppressWarnings("deprecation")
    com.google.cloud.apigeeconnect.v1.Scheme result = com.google.cloud.apigeeconnect.v1.Scheme.valueOf(scheme_);
    return result == null ? com.google.cloud.apigeeconnect.v1.Scheme.UNRECOGNIZED : result;
  }

  public static final int HOST_FIELD_NUMBER = 2;
  private volatile java.lang.Object host_;
  /**
   * <pre>
   * Host or Host:Port.
   * </pre>
   *
   * <code>string host = 2;</code>
   * @return The host.
   */
  @java.lang.Override
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Host or Host:Port.
   * </pre>
   *
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * Path starts with `/`.
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path starts with `/`.
   * </pre>
   *
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
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
    if (scheme_ != com.google.cloud.apigeeconnect.v1.Scheme.SCHEME_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, scheme_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scheme_ != com.google.cloud.apigeeconnect.v1.Scheme.SCHEME_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, scheme_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(host_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, host_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
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
    if (!(obj instanceof com.google.cloud.apigeeconnect.v1.Url)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeconnect.v1.Url other = (com.google.cloud.apigeeconnect.v1.Url) obj;

    if (scheme_ != other.scheme_) return false;
    if (!getHost()
        .equals(other.getHost())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
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
    hash = (37 * hash) + SCHEME_FIELD_NUMBER;
    hash = (53 * hash) + scheme_;
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.apigeeconnect.v1.Url parseFrom(
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
  public static Builder newBuilder(com.google.cloud.apigeeconnect.v1.Url prototype) {
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
   * The proto definition of url.
   * A url represents a URL and the general form represented is:
   *  `[scheme://][google.cloud.apigeeconnect.v1.Url.host][path]`
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeconnect.v1.Url}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeconnect.v1.Url)
      com.google.cloud.apigeeconnect.v1.UrlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Url_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Url_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeconnect.v1.Url.class, com.google.cloud.apigeeconnect.v1.Url.Builder.class);
    }

    // Construct using com.google.cloud.apigeeconnect.v1.Url.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      scheme_ = 0;

      host_ = "";

      path_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.apigeeconnect.v1.TetherProto.internal_static_google_cloud_apigeeconnect_v1_Url_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Url getDefaultInstanceForType() {
      return com.google.cloud.apigeeconnect.v1.Url.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Url build() {
      com.google.cloud.apigeeconnect.v1.Url result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Url buildPartial() {
      com.google.cloud.apigeeconnect.v1.Url result = new com.google.cloud.apigeeconnect.v1.Url(this);
      result.scheme_ = scheme_;
      result.host_ = host_;
      result.path_ = path_;
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
      if (other instanceof com.google.cloud.apigeeconnect.v1.Url) {
        return mergeFrom((com.google.cloud.apigeeconnect.v1.Url)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeconnect.v1.Url other) {
      if (other == com.google.cloud.apigeeconnect.v1.Url.getDefaultInstance()) return this;
      if (other.scheme_ != 0) {
        setSchemeValue(other.getSchemeValue());
      }
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
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
            case 8: {
              scheme_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              host_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              path_ = input.readStringRequireUtf8();

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

    private int scheme_ = 0;
    /**
     * <pre>
     * Scheme.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
     * @return The enum numeric value on the wire for scheme.
     */
    @java.lang.Override public int getSchemeValue() {
      return scheme_;
    }
    /**
     * <pre>
     * Scheme.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
     * @param value The enum numeric value on the wire for scheme to set.
     * @return This builder for chaining.
     */
    public Builder setSchemeValue(int value) {
      
      scheme_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheme.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
     * @return The scheme.
     */
    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Scheme getScheme() {
      @SuppressWarnings("deprecation")
      com.google.cloud.apigeeconnect.v1.Scheme result = com.google.cloud.apigeeconnect.v1.Scheme.valueOf(scheme_);
      return result == null ? com.google.cloud.apigeeconnect.v1.Scheme.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Scheme.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
     * @param value The scheme to set.
     * @return This builder for chaining.
     */
    public Builder setScheme(com.google.cloud.apigeeconnect.v1.Scheme value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      scheme_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scheme.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Scheme scheme = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScheme() {
      
      scheme_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object host_ = "";
    /**
     * <pre>
     * Host or Host:Port.
     * </pre>
     *
     * <code>string host = 2;</code>
     * @return The host.
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Host or Host:Port.
     * </pre>
     *
     * <code>string host = 2;</code>
     * @return The bytes for host.
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Host or Host:Port.
     * </pre>
     *
     * <code>string host = 2;</code>
     * @param value The host to set.
     * @return This builder for chaining.
     */
    public Builder setHost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host or Host:Port.
     * </pre>
     *
     * <code>string host = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host or Host:Port.
     * </pre>
     *
     * <code>string host = 2;</code>
     * @param value The bytes for host to set.
     * @return This builder for chaining.
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Path starts with `/`.
     * </pre>
     *
     * <code>string path = 3;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path starts with `/`.
     * </pre>
     *
     * <code>string path = 3;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path starts with `/`.
     * </pre>
     *
     * <code>string path = 3;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path starts with `/`.
     * </pre>
     *
     * <code>string path = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path starts with `/`.
     * </pre>
     *
     * <code>string path = 3;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeconnect.v1.Url)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeconnect.v1.Url)
  private static final com.google.cloud.apigeeconnect.v1.Url DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeconnect.v1.Url();
  }

  public static com.google.cloud.apigeeconnect.v1.Url getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Url>
      PARSER = new com.google.protobuf.AbstractParser<Url>() {
    @java.lang.Override
    public Url parsePartialFrom(
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

  public static com.google.protobuf.Parser<Url> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Url> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.Url getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

