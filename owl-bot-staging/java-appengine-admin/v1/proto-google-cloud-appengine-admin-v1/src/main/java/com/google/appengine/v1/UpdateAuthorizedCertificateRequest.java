// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Request message for `AuthorizedCertificates.UpdateAuthorizedCertificate`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.UpdateAuthorizedCertificateRequest}
 */
public final class UpdateAuthorizedCertificateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.UpdateAuthorizedCertificateRequest)
    UpdateAuthorizedCertificateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAuthorizedCertificateRequest.newBuilder() to construct.
  private UpdateAuthorizedCertificateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAuthorizedCertificateRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAuthorizedCertificateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_UpdateAuthorizedCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_UpdateAuthorizedCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.UpdateAuthorizedCertificateRequest.class, com.google.appengine.v1.UpdateAuthorizedCertificateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the resource to update. Example:
   * `apps/myapp/authorizedCertificates/12345`.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * Name of the resource to update. Example:
   * `apps/myapp/authorizedCertificates/12345`.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int CERTIFICATE_FIELD_NUMBER = 2;
  private com.google.appengine.v1.AuthorizedCertificate certificate_;
  /**
   * <pre>
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   * <pre>
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.appengine.v1.AuthorizedCertificate getCertificate() {
    return certificate_ == null ? com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
  }
  /**
   * <pre>
   * An `AuthorizedCertificate` containing the updated resource. Only fields set
   * in the field mask will be updated.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.AuthorizedCertificateOrBuilder getCertificateOrBuilder() {
    return getCertificate();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated. Updates are only
   * supported on the `certificate_raw_data` and `display_name` fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (certificate_ != null) {
      output.writeMessage(2, getCertificate());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
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
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCertificate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.appengine.v1.UpdateAuthorizedCertificateRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.UpdateAuthorizedCertificateRequest other = (com.google.appengine.v1.UpdateAuthorizedCertificateRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate()
          .equals(other.getCertificate())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.UpdateAuthorizedCertificateRequest prototype) {
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
   * Request message for `AuthorizedCertificates.UpdateAuthorizedCertificate`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.UpdateAuthorizedCertificateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.UpdateAuthorizedCertificateRequest)
      com.google.appengine.v1.UpdateAuthorizedCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_UpdateAuthorizedCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_UpdateAuthorizedCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.UpdateAuthorizedCertificateRequest.class, com.google.appengine.v1.UpdateAuthorizedCertificateRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1.UpdateAuthorizedCertificateRequest.newBuilder()
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

      if (certificateBuilder_ == null) {
        certificate_ = null;
      } else {
        certificate_ = null;
        certificateBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_UpdateAuthorizedCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateAuthorizedCertificateRequest getDefaultInstanceForType() {
      return com.google.appengine.v1.UpdateAuthorizedCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateAuthorizedCertificateRequest build() {
      com.google.appengine.v1.UpdateAuthorizedCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.UpdateAuthorizedCertificateRequest buildPartial() {
      com.google.appengine.v1.UpdateAuthorizedCertificateRequest result = new com.google.appengine.v1.UpdateAuthorizedCertificateRequest(this);
      result.name_ = name_;
      if (certificateBuilder_ == null) {
        result.certificate_ = certificate_;
      } else {
        result.certificate_ = certificateBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.appengine.v1.UpdateAuthorizedCertificateRequest) {
        return mergeFrom((com.google.appengine.v1.UpdateAuthorizedCertificateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.UpdateAuthorizedCertificateRequest other) {
      if (other == com.google.appengine.v1.UpdateAuthorizedCertificateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
              input.readMessage(
                  getCertificateFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the resource to update. Example:
     * `apps/myapp/authorizedCertificates/12345`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the resource to update. Example:
     * `apps/myapp/authorizedCertificates/12345`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the resource to update. Example:
     * `apps/myapp/authorizedCertificates/12345`.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the resource to update. Example:
     * `apps/myapp/authorizedCertificates/12345`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the resource to update. Example:
     * `apps/myapp/authorizedCertificates/12345`.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private com.google.appengine.v1.AuthorizedCertificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder> certificateBuilder_;
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return certificateBuilder_ != null || certificate_ != null;
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     * @return The certificate.
     */
    public com.google.appengine.v1.AuthorizedCertificate getCertificate() {
      if (certificateBuilder_ == null) {
        return certificate_ == null ? com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
      } else {
        return certificateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder setCertificate(com.google.appengine.v1.AuthorizedCertificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificate_ = value;
        onChanged();
      } else {
        certificateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder setCertificate(
        com.google.appengine.v1.AuthorizedCertificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
        onChanged();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder mergeCertificate(com.google.appengine.v1.AuthorizedCertificate value) {
      if (certificateBuilder_ == null) {
        if (certificate_ != null) {
          certificate_ =
            com.google.appengine.v1.AuthorizedCertificate.newBuilder(certificate_).mergeFrom(value).buildPartial();
        } else {
          certificate_ = value;
        }
        onChanged();
      } else {
        certificateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public Builder clearCertificate() {
      if (certificateBuilder_ == null) {
        certificate_ = null;
        onChanged();
      } else {
        certificate_ = null;
        certificateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public com.google.appengine.v1.AuthorizedCertificate.Builder getCertificateBuilder() {
      
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    public com.google.appengine.v1.AuthorizedCertificateOrBuilder getCertificateOrBuilder() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilder();
      } else {
        return certificate_ == null ?
            com.google.appengine.v1.AuthorizedCertificate.getDefaultInstance() : certificate_;
      }
    }
    /**
     * <pre>
     * An `AuthorizedCertificate` containing the updated resource. Only fields set
     * in the field mask will be updated.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthorizedCertificate certificate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder> 
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.AuthorizedCertificate, com.google.appengine.v1.AuthorizedCertificate.Builder, com.google.appengine.v1.AuthorizedCertificateOrBuilder>(
                getCertificate(),
                getParentForChildren(),
                isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated. Updates are only
     * supported on the `certificate_raw_data` and `display_name` fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.UpdateAuthorizedCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.UpdateAuthorizedCertificateRequest)
  private static final com.google.appengine.v1.UpdateAuthorizedCertificateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.UpdateAuthorizedCertificateRequest();
  }

  public static com.google.appengine.v1.UpdateAuthorizedCertificateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAuthorizedCertificateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAuthorizedCertificateRequest>() {
    @java.lang.Override
    public UpdateAuthorizedCertificateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAuthorizedCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAuthorizedCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.UpdateAuthorizedCertificateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

