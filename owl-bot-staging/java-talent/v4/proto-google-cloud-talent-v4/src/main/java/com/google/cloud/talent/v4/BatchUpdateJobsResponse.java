// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/job_service.proto

package com.google.cloud.talent.v4;

/**
 * <pre>
 * The result of [JobService.BatchUpdateJobs][google.cloud.talent.v4.JobService.BatchUpdateJobs]. It's used to
 * replace [google.longrunning.Operation.response][google.longrunning.Operation.response] in case of success.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.BatchUpdateJobsResponse}
 */
public final class BatchUpdateJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.BatchUpdateJobsResponse)
    BatchUpdateJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchUpdateJobsResponse.newBuilder() to construct.
  private BatchUpdateJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchUpdateJobsResponse() {
    jobResults_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchUpdateJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.BatchUpdateJobsResponse.class, com.google.cloud.talent.v4.BatchUpdateJobsResponse.Builder.class);
  }

  public static final int JOB_RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.talent.v4.JobResult> jobResults_;
  /**
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.talent.v4.JobResult> getJobResultsList() {
    return jobResults_;
  }
  /**
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.talent.v4.JobResultOrBuilder> 
      getJobResultsOrBuilderList() {
    return jobResults_;
  }
  /**
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public int getJobResultsCount() {
    return jobResults_.size();
  }
  /**
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.JobResult getJobResults(int index) {
    return jobResults_.get(index);
  }
  /**
   * <pre>
   * List of job mutation results from a batch update operation. It can change
   * until operation status is FINISHED, FAILED or CANCELLED.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.JobResultOrBuilder getJobResultsOrBuilder(
      int index) {
    return jobResults_.get(index);
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
    for (int i = 0; i < jobResults_.size(); i++) {
      output.writeMessage(1, jobResults_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobResults_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobResults_.get(i));
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
    if (!(obj instanceof com.google.cloud.talent.v4.BatchUpdateJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.BatchUpdateJobsResponse other = (com.google.cloud.talent.v4.BatchUpdateJobsResponse) obj;

    if (!getJobResultsList()
        .equals(other.getJobResultsList())) return false;
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
    if (getJobResultsCount() > 0) {
      hash = (37 * hash) + JOB_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getJobResultsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4.BatchUpdateJobsResponse prototype) {
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
   * The result of [JobService.BatchUpdateJobs][google.cloud.talent.v4.JobService.BatchUpdateJobs]. It's used to
   * replace [google.longrunning.Operation.response][google.longrunning.Operation.response] in case of success.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.BatchUpdateJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.BatchUpdateJobsResponse)
      com.google.cloud.talent.v4.BatchUpdateJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.BatchUpdateJobsResponse.class, com.google.cloud.talent.v4.BatchUpdateJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.BatchUpdateJobsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobResultsBuilder_ == null) {
        jobResults_ = java.util.Collections.emptyList();
      } else {
        jobResults_ = null;
        jobResultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_BatchUpdateJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.BatchUpdateJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.BatchUpdateJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.BatchUpdateJobsResponse build() {
      com.google.cloud.talent.v4.BatchUpdateJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.BatchUpdateJobsResponse buildPartial() {
      com.google.cloud.talent.v4.BatchUpdateJobsResponse result = new com.google.cloud.talent.v4.BatchUpdateJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (jobResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobResults_ = java.util.Collections.unmodifiableList(jobResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobResults_ = jobResults_;
      } else {
        result.jobResults_ = jobResultsBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4.BatchUpdateJobsResponse) {
        return mergeFrom((com.google.cloud.talent.v4.BatchUpdateJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.BatchUpdateJobsResponse other) {
      if (other == com.google.cloud.talent.v4.BatchUpdateJobsResponse.getDefaultInstance()) return this;
      if (jobResultsBuilder_ == null) {
        if (!other.jobResults_.isEmpty()) {
          if (jobResults_.isEmpty()) {
            jobResults_ = other.jobResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobResultsIsMutable();
            jobResults_.addAll(other.jobResults_);
          }
          onChanged();
        }
      } else {
        if (!other.jobResults_.isEmpty()) {
          if (jobResultsBuilder_.isEmpty()) {
            jobResultsBuilder_.dispose();
            jobResultsBuilder_ = null;
            jobResults_ = other.jobResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobResultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobResultsFieldBuilder() : null;
          } else {
            jobResultsBuilder_.addAllMessages(other.jobResults_);
          }
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
              com.google.cloud.talent.v4.JobResult m =
                  input.readMessage(
                      com.google.cloud.talent.v4.JobResult.parser(),
                      extensionRegistry);
              if (jobResultsBuilder_ == null) {
                ensureJobResultsIsMutable();
                jobResults_.add(m);
              } else {
                jobResultsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.talent.v4.JobResult> jobResults_ =
      java.util.Collections.emptyList();
    private void ensureJobResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobResults_ = new java.util.ArrayList<com.google.cloud.talent.v4.JobResult>(jobResults_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.talent.v4.JobResult, com.google.cloud.talent.v4.JobResult.Builder, com.google.cloud.talent.v4.JobResultOrBuilder> jobResultsBuilder_;

    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public java.util.List<com.google.cloud.talent.v4.JobResult> getJobResultsList() {
      if (jobResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobResults_);
      } else {
        return jobResultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public int getJobResultsCount() {
      if (jobResultsBuilder_ == null) {
        return jobResults_.size();
      } else {
        return jobResultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public com.google.cloud.talent.v4.JobResult getJobResults(int index) {
      if (jobResultsBuilder_ == null) {
        return jobResults_.get(index);
      } else {
        return jobResultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder setJobResults(
        int index, com.google.cloud.talent.v4.JobResult value) {
      if (jobResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobResultsIsMutable();
        jobResults_.set(index, value);
        onChanged();
      } else {
        jobResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder setJobResults(
        int index, com.google.cloud.talent.v4.JobResult.Builder builderForValue) {
      if (jobResultsBuilder_ == null) {
        ensureJobResultsIsMutable();
        jobResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder addJobResults(com.google.cloud.talent.v4.JobResult value) {
      if (jobResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobResultsIsMutable();
        jobResults_.add(value);
        onChanged();
      } else {
        jobResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder addJobResults(
        int index, com.google.cloud.talent.v4.JobResult value) {
      if (jobResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobResultsIsMutable();
        jobResults_.add(index, value);
        onChanged();
      } else {
        jobResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder addJobResults(
        com.google.cloud.talent.v4.JobResult.Builder builderForValue) {
      if (jobResultsBuilder_ == null) {
        ensureJobResultsIsMutable();
        jobResults_.add(builderForValue.build());
        onChanged();
      } else {
        jobResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder addJobResults(
        int index, com.google.cloud.talent.v4.JobResult.Builder builderForValue) {
      if (jobResultsBuilder_ == null) {
        ensureJobResultsIsMutable();
        jobResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder addAllJobResults(
        java.lang.Iterable<? extends com.google.cloud.talent.v4.JobResult> values) {
      if (jobResultsBuilder_ == null) {
        ensureJobResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobResults_);
        onChanged();
      } else {
        jobResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder clearJobResults() {
      if (jobResultsBuilder_ == null) {
        jobResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobResultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public Builder removeJobResults(int index) {
      if (jobResultsBuilder_ == null) {
        ensureJobResultsIsMutable();
        jobResults_.remove(index);
        onChanged();
      } else {
        jobResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public com.google.cloud.talent.v4.JobResult.Builder getJobResultsBuilder(
        int index) {
      return getJobResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public com.google.cloud.talent.v4.JobResultOrBuilder getJobResultsOrBuilder(
        int index) {
      if (jobResultsBuilder_ == null) {
        return jobResults_.get(index);  } else {
        return jobResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.talent.v4.JobResultOrBuilder> 
         getJobResultsOrBuilderList() {
      if (jobResultsBuilder_ != null) {
        return jobResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobResults_);
      }
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public com.google.cloud.talent.v4.JobResult.Builder addJobResultsBuilder() {
      return getJobResultsFieldBuilder().addBuilder(
          com.google.cloud.talent.v4.JobResult.getDefaultInstance());
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public com.google.cloud.talent.v4.JobResult.Builder addJobResultsBuilder(
        int index) {
      return getJobResultsFieldBuilder().addBuilder(
          index, com.google.cloud.talent.v4.JobResult.getDefaultInstance());
    }
    /**
     * <pre>
     * List of job mutation results from a batch update operation. It can change
     * until operation status is FINISHED, FAILED or CANCELLED.
     * </pre>
     *
     * <code>repeated .google.cloud.talent.v4.JobResult job_results = 1;</code>
     */
    public java.util.List<com.google.cloud.talent.v4.JobResult.Builder> 
         getJobResultsBuilderList() {
      return getJobResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.talent.v4.JobResult, com.google.cloud.talent.v4.JobResult.Builder, com.google.cloud.talent.v4.JobResultOrBuilder> 
        getJobResultsFieldBuilder() {
      if (jobResultsBuilder_ == null) {
        jobResultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.talent.v4.JobResult, com.google.cloud.talent.v4.JobResult.Builder, com.google.cloud.talent.v4.JobResultOrBuilder>(
                jobResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jobResults_ = null;
      }
      return jobResultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.BatchUpdateJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.BatchUpdateJobsResponse)
  private static final com.google.cloud.talent.v4.BatchUpdateJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.BatchUpdateJobsResponse();
  }

  public static com.google.cloud.talent.v4.BatchUpdateJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchUpdateJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchUpdateJobsResponse>() {
    @java.lang.Override
    public BatchUpdateJobsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchUpdateJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchUpdateJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.BatchUpdateJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

