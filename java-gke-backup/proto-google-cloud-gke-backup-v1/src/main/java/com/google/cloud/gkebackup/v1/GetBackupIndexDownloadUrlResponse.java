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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Response message for GetBackupIndexDownloadUrl.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse}
 */
public final class GetBackupIndexDownloadUrlResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse)
    GetBackupIndexDownloadUrlResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetBackupIndexDownloadUrlResponse.newBuilder() to construct.
  private GetBackupIndexDownloadUrlResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetBackupIndexDownloadUrlResponse() {
    signedUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetBackupIndexDownloadUrlResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_GetBackupIndexDownloadUrlResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_GetBackupIndexDownloadUrlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.class,
            com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.Builder.class);
  }

  public static final int SIGNED_URL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object signedUrl_ = "";
  /**
   * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The signedUrl.
   */
  @java.lang.Override
  public java.lang.String getSignedUrl() {
    java.lang.Object ref = signedUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signedUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for signedUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignedUrlBytes() {
    java.lang.Object ref = signedUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      signedUrl_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signedUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, signedUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signedUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, signedUrl_);
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse other =
        (com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse) obj;

    if (!getSignedUrl().equals(other.getSignedUrl())) return false;
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
    hash = (37 * hash) + SIGNED_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSignedUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse parseFrom(
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
      com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse prototype) {
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
   * Response message for GetBackupIndexDownloadUrl.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse)
      com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_GetBackupIndexDownloadUrlResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_GetBackupIndexDownloadUrlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.class,
              com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      signedUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_GetBackupIndexDownloadUrlResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse build() {
      com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse buildPartial() {
      com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse result =
          new com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signedUrl_ = signedUrl_;
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
      if (other instanceof com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse) {
        return mergeFrom((com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse other) {
      if (other
          == com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse.getDefaultInstance())
        return this;
      if (!other.getSignedUrl().isEmpty()) {
        signedUrl_ = other.signedUrl_;
        bitField0_ |= 0x00000001;
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
            case 10:
              {
                signedUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object signedUrl_ = "";
    /**
     * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The signedUrl.
     */
    public java.lang.String getSignedUrl() {
      java.lang.Object ref = signedUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signedUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for signedUrl.
     */
    public com.google.protobuf.ByteString getSignedUrlBytes() {
      java.lang.Object ref = signedUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        signedUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The signedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      signedUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignedUrl() {
      signedUrl_ = getDefaultInstance().getSignedUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string signed_url = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for signedUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      signedUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse)
  private static final com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse();
  }

  public static com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBackupIndexDownloadUrlResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetBackupIndexDownloadUrlResponse>() {
        @java.lang.Override
        public GetBackupIndexDownloadUrlResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBackupIndexDownloadUrlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBackupIndexDownloadUrlResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.GetBackupIndexDownloadUrlResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
