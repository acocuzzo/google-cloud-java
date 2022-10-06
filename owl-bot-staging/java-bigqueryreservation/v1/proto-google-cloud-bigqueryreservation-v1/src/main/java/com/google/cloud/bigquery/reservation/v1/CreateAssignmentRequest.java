// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

/**
 * <pre>
 * The request for [ReservationService.CreateAssignment][google.cloud.bigquery.reservation.v1.ReservationService.CreateAssignment].
 * Note: "bigquery.reservationAssignments.create" permission is required on the
 * related assignee.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.CreateAssignmentRequest}
 */
public final class CreateAssignmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)
    CreateAssignmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAssignmentRequest.newBuilder() to construct.
  private CreateAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAssignmentRequest() {
    parent_ = "";
    assignmentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAssignmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_CreateAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_CreateAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.class, com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent resource name of the assignment
   * E.g. `projects/myproject/locations/US/reservations/team1-prod`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource name of the assignment
   * E.g. `projects/myproject/locations/US/reservations/team1-prod`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNMENT_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.reservation.v1.Assignment assignment_;
  /**
   * <pre>
   * Assignment resource to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
   * @return Whether the assignment field is set.
   */
  @java.lang.Override
  public boolean hasAssignment() {
    return assignment_ != null;
  }
  /**
   * <pre>
   * Assignment resource to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
   * @return The assignment.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.Assignment getAssignment() {
    return assignment_ == null ? com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
  }
  /**
   * <pre>
   * Assignment resource to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentOrBuilder() {
    return getAssignment();
  }

  public static final int ASSIGNMENT_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object assignmentId_;
  /**
   * <pre>
   * The optional assignment ID. Assignment name will be generated automatically
   * if this field is empty.
   * This field must only contain lower case alphanumeric characters or dashes.
   * Max length is 64 characters.
   * </pre>
   *
   * <code>string assignment_id = 4;</code>
   * @return The assignmentId.
   */
  @java.lang.Override
  public java.lang.String getAssignmentId() {
    java.lang.Object ref = assignmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assignmentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The optional assignment ID. Assignment name will be generated automatically
   * if this field is empty.
   * This field must only contain lower case alphanumeric characters or dashes.
   * Max length is 64 characters.
   * </pre>
   *
   * <code>string assignment_id = 4;</code>
   * @return The bytes for assignmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssignmentIdBytes() {
    java.lang.Object ref = assignmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assignmentId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (assignment_ != null) {
      output.writeMessage(2, getAssignment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignmentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, assignmentId_);
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
    if (assignment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAssignment());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignmentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, assignmentId_);
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
    if (!(obj instanceof com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest other = (com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAssignment() != other.hasAssignment()) return false;
    if (hasAssignment()) {
      if (!getAssignment()
          .equals(other.getAssignment())) return false;
    }
    if (!getAssignmentId()
        .equals(other.getAssignmentId())) return false;
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
    if (hasAssignment()) {
      hash = (37 * hash) + ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAssignment().hashCode();
    }
    hash = (37 * hash) + ASSIGNMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssignmentId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest prototype) {
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
   * The request for [ReservationService.CreateAssignment][google.cloud.bigquery.reservation.v1.ReservationService.CreateAssignment].
   * Note: "bigquery.reservationAssignments.create" permission is required on the
   * related assignee.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.CreateAssignmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)
      com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_CreateAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_CreateAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.class, com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (assignmentBuilder_ == null) {
        assignment_ = null;
      } else {
        assignment_ = null;
        assignmentBuilder_ = null;
      }
      assignmentId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_CreateAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest build() {
      com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest buildPartial() {
      com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest result = new com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest(this);
      result.parent_ = parent_;
      if (assignmentBuilder_ == null) {
        result.assignment_ = assignment_;
      } else {
        result.assignment_ = assignmentBuilder_.build();
      }
      result.assignmentId_ = assignmentId_;
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
      if (other instanceof com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest) {
        return mergeFrom((com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest other) {
      if (other == com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasAssignment()) {
        mergeAssignment(other.getAssignment());
      }
      if (!other.getAssignmentId().isEmpty()) {
        assignmentId_ = other.assignmentId_;
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAssignmentFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 34: {
              assignmentId_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource name of the assignment
     * E.g. `projects/myproject/locations/US/reservations/team1-prod`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name of the assignment
     * E.g. `projects/myproject/locations/US/reservations/team1-prod`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name of the assignment
     * E.g. `projects/myproject/locations/US/reservations/team1-prod`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name of the assignment
     * E.g. `projects/myproject/locations/US/reservations/team1-prod`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name of the assignment
     * E.g. `projects/myproject/locations/US/reservations/team1-prod`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.reservation.v1.Assignment assignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder> assignmentBuilder_;
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     * @return Whether the assignment field is set.
     */
    public boolean hasAssignment() {
      return assignmentBuilder_ != null || assignment_ != null;
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     * @return The assignment.
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment getAssignment() {
      if (assignmentBuilder_ == null) {
        return assignment_ == null ? com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
      } else {
        return assignmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public Builder setAssignment(com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assignment_ = value;
        onChanged();
      } else {
        assignmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public Builder setAssignment(
        com.google.cloud.bigquery.reservation.v1.Assignment.Builder builderForValue) {
      if (assignmentBuilder_ == null) {
        assignment_ = builderForValue.build();
        onChanged();
      } else {
        assignmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public Builder mergeAssignment(com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (assignment_ != null) {
          assignment_ =
            com.google.cloud.bigquery.reservation.v1.Assignment.newBuilder(assignment_).mergeFrom(value).buildPartial();
        } else {
          assignment_ = value;
        }
        onChanged();
      } else {
        assignmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public Builder clearAssignment() {
      if (assignmentBuilder_ == null) {
        assignment_ = null;
        onChanged();
      } else {
        assignment_ = null;
        assignmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment.Builder getAssignmentBuilder() {
      
      onChanged();
      return getAssignmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentOrBuilder() {
      if (assignmentBuilder_ != null) {
        return assignmentBuilder_.getMessageOrBuilder();
      } else {
        return assignment_ == null ?
            com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
      }
    }
    /**
     * <pre>
     * Assignment resource to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder> 
        getAssignmentFieldBuilder() {
      if (assignmentBuilder_ == null) {
        assignmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>(
                getAssignment(),
                getParentForChildren(),
                isClean());
        assignment_ = null;
      }
      return assignmentBuilder_;
    }

    private java.lang.Object assignmentId_ = "";
    /**
     * <pre>
     * The optional assignment ID. Assignment name will be generated automatically
     * if this field is empty.
     * This field must only contain lower case alphanumeric characters or dashes.
     * Max length is 64 characters.
     * </pre>
     *
     * <code>string assignment_id = 4;</code>
     * @return The assignmentId.
     */
    public java.lang.String getAssignmentId() {
      java.lang.Object ref = assignmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assignmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The optional assignment ID. Assignment name will be generated automatically
     * if this field is empty.
     * This field must only contain lower case alphanumeric characters or dashes.
     * Max length is 64 characters.
     * </pre>
     *
     * <code>string assignment_id = 4;</code>
     * @return The bytes for assignmentId.
     */
    public com.google.protobuf.ByteString
        getAssignmentIdBytes() {
      java.lang.Object ref = assignmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assignmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The optional assignment ID. Assignment name will be generated automatically
     * if this field is empty.
     * This field must only contain lower case alphanumeric characters or dashes.
     * Max length is 64 characters.
     * </pre>
     *
     * <code>string assignment_id = 4;</code>
     * @param value The assignmentId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignmentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assignmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The optional assignment ID. Assignment name will be generated automatically
     * if this field is empty.
     * This field must only contain lower case alphanumeric characters or dashes.
     * Max length is 64 characters.
     * </pre>
     *
     * <code>string assignment_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignmentId() {
      
      assignmentId_ = getDefaultInstance().getAssignmentId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The optional assignment ID. Assignment name will be generated automatically
     * if this field is empty.
     * This field must only contain lower case alphanumeric characters or dashes.
     * Max length is 64 characters.
     * </pre>
     *
     * <code>string assignment_id = 4;</code>
     * @param value The bytes for assignmentId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assignmentId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.CreateAssignmentRequest)
  private static final com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest();
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAssignmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAssignmentRequest>() {
    @java.lang.Override
    public CreateAssignmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.CreateAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

