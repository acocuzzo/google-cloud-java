// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1;

/**
 * <pre>
 * A response message for listing OS Policy assignment reports including the
 * page of results and page token.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse}
 */
public final class ListOSPolicyAssignmentReportsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)
    ListOSPolicyAssignmentReportsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOSPolicyAssignmentReportsResponse.newBuilder() to construct.
  private ListOSPolicyAssignmentReportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOSPolicyAssignmentReportsResponse() {
    osPolicyAssignmentReports_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOSPolicyAssignmentReportsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.class, com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.Builder.class);
  }

  public static final int OS_POLICY_ASSIGNMENT_REPORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> osPolicyAssignmentReports_;
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> getOsPolicyAssignmentReportsList() {
    return osPolicyAssignmentReports_;
  }
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder> 
      getOsPolicyAssignmentReportsOrBuilderList() {
    return osPolicyAssignmentReports_;
  }
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  @java.lang.Override
  public int getOsPolicyAssignmentReportsCount() {
    return osPolicyAssignmentReports_.size();
  }
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignmentReport getOsPolicyAssignmentReports(int index) {
    return osPolicyAssignmentReports_.get(index);
  }
  /**
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder getOsPolicyAssignmentReportsOrBuilder(
      int index) {
    return osPolicyAssignmentReports_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
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
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
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
    for (int i = 0; i < osPolicyAssignmentReports_.size(); i++) {
      output.writeMessage(1, osPolicyAssignmentReports_.get(i));
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
    for (int i = 0; i < osPolicyAssignmentReports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, osPolicyAssignmentReports_.get(i));
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
    if (!(obj instanceof com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse other = (com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse) obj;

    if (!getOsPolicyAssignmentReportsList()
        .equals(other.getOsPolicyAssignmentReportsList())) return false;
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
    if (getOsPolicyAssignmentReportsCount() > 0) {
      hash = (37 * hash) + OS_POLICY_ASSIGNMENT_REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getOsPolicyAssignmentReportsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse prototype) {
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
   * A response message for listing OS Policy assignment reports including the
   * page of results and page token.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.class, com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (osPolicyAssignmentReportsBuilder_ == null) {
        osPolicyAssignmentReports_ = java.util.Collections.emptyList();
      } else {
        osPolicyAssignmentReports_ = null;
        osPolicyAssignmentReportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.osconfig.v1.OSPolicyAssignmentReportsProto.internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentReportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse build() {
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse buildPartial() {
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse result = new com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse(this);
      int from_bitField0_ = bitField0_;
      if (osPolicyAssignmentReportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          osPolicyAssignmentReports_ = java.util.Collections.unmodifiableList(osPolicyAssignmentReports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.osPolicyAssignmentReports_ = osPolicyAssignmentReports_;
      } else {
        result.osPolicyAssignmentReports_ = osPolicyAssignmentReportsBuilder_.build();
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
      if (other instanceof com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse) {
        return mergeFrom((com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse other) {
      if (other == com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse.getDefaultInstance()) return this;
      if (osPolicyAssignmentReportsBuilder_ == null) {
        if (!other.osPolicyAssignmentReports_.isEmpty()) {
          if (osPolicyAssignmentReports_.isEmpty()) {
            osPolicyAssignmentReports_ = other.osPolicyAssignmentReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOsPolicyAssignmentReportsIsMutable();
            osPolicyAssignmentReports_.addAll(other.osPolicyAssignmentReports_);
          }
          onChanged();
        }
      } else {
        if (!other.osPolicyAssignmentReports_.isEmpty()) {
          if (osPolicyAssignmentReportsBuilder_.isEmpty()) {
            osPolicyAssignmentReportsBuilder_.dispose();
            osPolicyAssignmentReportsBuilder_ = null;
            osPolicyAssignmentReports_ = other.osPolicyAssignmentReports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            osPolicyAssignmentReportsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOsPolicyAssignmentReportsFieldBuilder() : null;
          } else {
            osPolicyAssignmentReportsBuilder_.addAllMessages(other.osPolicyAssignmentReports_);
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
              com.google.cloud.osconfig.v1.OSPolicyAssignmentReport m =
                  input.readMessage(
                      com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.parser(),
                      extensionRegistry);
              if (osPolicyAssignmentReportsBuilder_ == null) {
                ensureOsPolicyAssignmentReportsIsMutable();
                osPolicyAssignmentReports_.add(m);
              } else {
                osPolicyAssignmentReportsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> osPolicyAssignmentReports_ =
      java.util.Collections.emptyList();
    private void ensureOsPolicyAssignmentReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        osPolicyAssignmentReports_ = new java.util.ArrayList<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport>(osPolicyAssignmentReports_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.osconfig.v1.OSPolicyAssignmentReport, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder, com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder> osPolicyAssignmentReportsBuilder_;

    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> getOsPolicyAssignmentReportsList() {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(osPolicyAssignmentReports_);
      } else {
        return osPolicyAssignmentReportsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public int getOsPolicyAssignmentReportsCount() {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        return osPolicyAssignmentReports_.size();
      } else {
        return osPolicyAssignmentReportsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentReport getOsPolicyAssignmentReports(int index) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        return osPolicyAssignmentReports_.get(index);
      } else {
        return osPolicyAssignmentReportsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder setOsPolicyAssignmentReports(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport value) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.set(index, value);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder setOsPolicyAssignmentReports(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder builderForValue) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.set(index, builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder addOsPolicyAssignmentReports(com.google.cloud.osconfig.v1.OSPolicyAssignmentReport value) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.add(value);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder addOsPolicyAssignmentReports(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport value) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.add(index, value);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder addOsPolicyAssignmentReports(
        com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder builderForValue) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.add(builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder addOsPolicyAssignmentReports(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder builderForValue) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.add(index, builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder addAllOsPolicyAssignmentReports(
        java.lang.Iterable<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentReport> values) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        ensureOsPolicyAssignmentReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, osPolicyAssignmentReports_);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder clearOsPolicyAssignmentReports() {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        osPolicyAssignmentReports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public Builder removeOsPolicyAssignmentReports(int index) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        ensureOsPolicyAssignmentReportsIsMutable();
        osPolicyAssignmentReports_.remove(index);
        onChanged();
      } else {
        osPolicyAssignmentReportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder getOsPolicyAssignmentReportsBuilder(
        int index) {
      return getOsPolicyAssignmentReportsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder getOsPolicyAssignmentReportsOrBuilder(
        int index) {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        return osPolicyAssignmentReports_.get(index);  } else {
        return osPolicyAssignmentReportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder> 
         getOsPolicyAssignmentReportsOrBuilderList() {
      if (osPolicyAssignmentReportsBuilder_ != null) {
        return osPolicyAssignmentReportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(osPolicyAssignmentReports_);
      }
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder addOsPolicyAssignmentReportsBuilder() {
      return getOsPolicyAssignmentReportsFieldBuilder().addBuilder(
          com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.getDefaultInstance());
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder addOsPolicyAssignmentReportsBuilder(
        int index) {
      return getOsPolicyAssignmentReportsFieldBuilder().addBuilder(
          index, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.getDefaultInstance());
    }
    /**
     * <pre>
     * List of OS policy assignment reports.
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignmentReport os_policy_assignment_reports = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder> 
         getOsPolicyAssignmentReportsBuilderList() {
      return getOsPolicyAssignmentReportsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.osconfig.v1.OSPolicyAssignmentReport, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder, com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder> 
        getOsPolicyAssignmentReportsFieldBuilder() {
      if (osPolicyAssignmentReportsBuilder_ == null) {
        osPolicyAssignmentReportsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.osconfig.v1.OSPolicyAssignmentReport, com.google.cloud.osconfig.v1.OSPolicyAssignmentReport.Builder, com.google.cloud.osconfig.v1.OSPolicyAssignmentReportOrBuilder>(
                osPolicyAssignmentReports_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        osPolicyAssignmentReports_ = null;
      }
      return osPolicyAssignmentReportsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The pagination token to retrieve the next page of OS policy assignment
     * report objects.
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
     * The pagination token to retrieve the next page of OS policy assignment
     * report objects.
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
     * The pagination token to retrieve the next page of OS policy assignment
     * report objects.
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
     * The pagination token to retrieve the next page of OS policy assignment
     * report objects.
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
     * The pagination token to retrieve the next page of OS policy assignment
     * report objects.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse)
  private static final com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse();
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOSPolicyAssignmentReportsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOSPolicyAssignmentReportsResponse>() {
    @java.lang.Override
    public ListOSPolicyAssignmentReportsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOSPolicyAssignmentReportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOSPolicyAssignmentReportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

