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
// source: google/devtools/artifactregistry/v1beta2/version.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 *
 *
 * <pre>
 * The request to list versions.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListVersionsRequest}
 */
public final class ListVersionsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ListVersionsRequest)
    ListVersionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListVersionsRequest.newBuilder() to construct.
  private ListVersionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListVersionsRequest() {
    parent_ = "";
    pageToken_ = "";
    view_ = 0;
    orderBy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListVersionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1beta2.VersionProto
        .internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.VersionProto
        .internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.class,
            com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * The name of the parent resource whose versions will be listed.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the parent resource whose versions will be listed.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_ = 0;
  /**
   *
   *
   * <pre>
   * The maximum number of versions to return. Maximum page size is 1,000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   *
   *
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 4;
  private int view_ = 0;
  /**
   *
   *
   * <pre>
   * The view that should be returned in the response.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * The view that should be returned in the response.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.VersionView getView() {
    com.google.devtools.artifactregistry.v1beta2.VersionView result =
        com.google.devtools.artifactregistry.v1beta2.VersionView.forNumber(view_);
    return result == null
        ? com.google.devtools.artifactregistry.v1beta2.VersionView.UNRECOGNIZED
        : result;
  }

  public static final int ORDER_BY_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object orderBy_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The field to order the results by.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  @java.lang.Override
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The field to order the results by.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      orderBy_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (view_
        != com.google.devtools.artifactregistry.v1beta2.VersionView.VERSION_VIEW_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, orderBy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (view_
        != com.google.devtools.artifactregistry.v1beta2.VersionView.VERSION_VIEW_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, orderBy_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest other =
        (com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (view_ != other.view_) return false;
    if (!getOrderBy().equals(other.getOrderBy())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderBy().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest parseFrom(
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
      com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest prototype) {
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
   * The request to list versions.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ListVersionsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ListVersionsRequest)
      com.google.devtools.artifactregistry.v1beta2.ListVersionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.VersionProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.VersionProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.class,
              com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      pageSize_ = 0;
      pageToken_ = "";
      view_ = 0;
      orderBy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.VersionProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest
        getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest build() {
      com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest result =
          new com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.view_ = view_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.orderBy_ = orderBy_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest other) {
      if (other
          == com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        bitField0_ |= 0x00000010;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                view_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 42:
              {
                orderBy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000010;
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The name of the parent resource whose versions will be listed.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the parent resource whose versions will be listed.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the parent resource whose versions will be listed.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the parent resource whose versions will be listed.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the parent resource whose versions will be listed.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * The maximum number of versions to return. Maximum page size is 1,000.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of versions to return. Maximum page size is 1,000.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of versions to return. Maximum page size is 1,000.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * The next_page_token value returned from a previous list request, if any.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The next_page_token value returned from a previous list request, if any.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The next_page_token value returned from a previous list request, if any.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next_page_token value returned from a previous list request, if any.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The next_page_token value returned from a previous list request, if any.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * The view that should be returned in the response.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * The view that should be returned in the response.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The view that should be returned in the response.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.VersionView getView() {
      com.google.devtools.artifactregistry.v1beta2.VersionView result =
          com.google.devtools.artifactregistry.v1beta2.VersionView.forNumber(view_);
      return result == null
          ? com.google.devtools.artifactregistry.v1beta2.VersionView.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The view that should be returned in the response.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.devtools.artifactregistry.v1beta2.VersionView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The view that should be returned in the response.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.VersionView view = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000008);
      view_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The field to order the results by.
     * </pre>
     *
     * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The orderBy.
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The field to order the results by.
     * </pre>
     *
     * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for orderBy.
     */
    public com.google.protobuf.ByteString getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The field to order the results by.
     * </pre>
     *
     * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      orderBy_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The field to order the results by.
     * </pre>
     *
     * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrderBy() {
      orderBy_ = getDefaultInstance().getOrderBy();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The field to order the results by.
     * </pre>
     *
     * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderByBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      orderBy_ = value;
      bitField0_ |= 0x00000010;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ListVersionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ListVersionsRequest)
  private static final com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVersionsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListVersionsRequest>() {
        @java.lang.Override
        public ListVersionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVersionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVersionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
