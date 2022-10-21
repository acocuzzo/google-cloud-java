/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/enterpriseknowledgegraph/v1/job_state.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

/**
 *
 *
 * <pre>
 * Describes the state of a job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.enterpriseknowledgegraph.v1.JobState}
 */
public enum JobState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The job state is unspecified.
   * </pre>
   *
   * <code>JOB_STATE_UNSPECIFIED = 0;</code>
   */
  JOB_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The service is preparing to run the job.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 9;</code>
   */
  JOB_STATE_PENDING(9),
  /**
   *
   *
   * <pre>
   * The job is in progress.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 1;</code>
   */
  JOB_STATE_RUNNING(1),
  /**
   *
   *
   * <pre>
   * The job completed successfully.
   * </pre>
   *
   * <code>JOB_STATE_SUCCEEDED = 2;</code>
   */
  JOB_STATE_SUCCEEDED(2),
  /**
   *
   *
   * <pre>
   * The job failed.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 3;</code>
   */
  JOB_STATE_FAILED(3),
  /**
   *
   *
   * <pre>
   * The job has been cancelled.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 4;</code>
   */
  JOB_STATE_CANCELLED(4),
  /**
   *
   *
   * <pre>
   * Entity Recon API: The knowledge extraction job is running.
   * </pre>
   *
   * <code>JOB_STATE_KNOWLEDGE_EXTRACTION = 5;</code>
   */
  JOB_STATE_KNOWLEDGE_EXTRACTION(5),
  /**
   *
   *
   * <pre>
   * Entity Recon API: The preprocessing job is running.
   * </pre>
   *
   * <code>JOB_STATE_RECON_PREPROCESSING = 6;</code>
   */
  JOB_STATE_RECON_PREPROCESSING(6),
  /**
   *
   *
   * <pre>
   * Entity Recon API: The clustering job is running.
   * </pre>
   *
   * <code>JOB_STATE_CLUSTERING = 7;</code>
   */
  JOB_STATE_CLUSTERING(7),
  /**
   *
   *
   * <pre>
   * Entity Recon API: The exporting clusters job is running.
   * </pre>
   *
   * <code>JOB_STATE_EXPORTING_CLUSTERS = 8;</code>
   */
  JOB_STATE_EXPORTING_CLUSTERS(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The job state is unspecified.
   * </pre>
   *
   * <code>JOB_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int JOB_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The service is preparing to run the job.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 9;</code>
   */
  public static final int JOB_STATE_PENDING_VALUE = 9;
  /**
   *
   *
   * <pre>
   * The job is in progress.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 1;</code>
   */
  public static final int JOB_STATE_RUNNING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The job completed successfully.
   * </pre>
   *
   * <code>JOB_STATE_SUCCEEDED = 2;</code>
   */
  public static final int JOB_STATE_SUCCEEDED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The job failed.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 3;</code>
   */
  public static final int JOB_STATE_FAILED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The job has been cancelled.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 4;</code>
   */
  public static final int JOB_STATE_CANCELLED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Entity Recon API: The knowledge extraction job is running.
   * </pre>
   *
   * <code>JOB_STATE_KNOWLEDGE_EXTRACTION = 5;</code>
   */
  public static final int JOB_STATE_KNOWLEDGE_EXTRACTION_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Entity Recon API: The preprocessing job is running.
   * </pre>
   *
   * <code>JOB_STATE_RECON_PREPROCESSING = 6;</code>
   */
  public static final int JOB_STATE_RECON_PREPROCESSING_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Entity Recon API: The clustering job is running.
   * </pre>
   *
   * <code>JOB_STATE_CLUSTERING = 7;</code>
   */
  public static final int JOB_STATE_CLUSTERING_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Entity Recon API: The exporting clusters job is running.
   * </pre>
   *
   * <code>JOB_STATE_EXPORTING_CLUSTERS = 8;</code>
   */
  public static final int JOB_STATE_EXPORTING_CLUSTERS_VALUE = 8;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobState forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_STATE_UNSPECIFIED;
      case 9:
        return JOB_STATE_PENDING;
      case 1:
        return JOB_STATE_RUNNING;
      case 2:
        return JOB_STATE_SUCCEEDED;
      case 3:
        return JOB_STATE_FAILED;
      case 4:
        return JOB_STATE_CANCELLED;
      case 5:
        return JOB_STATE_KNOWLEDGE_EXTRACTION;
      case 6:
        return JOB_STATE_RECON_PREPROCESSING;
      case 7:
        return JOB_STATE_CLUSTERING;
      case 8:
        return JOB_STATE_EXPORTING_CLUSTERS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobState>() {
        public JobState findValueByNumber(int number) {
          return JobState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.enterpriseknowledgegraph.v1.JobStateProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final JobState[] VALUES = values();

  public static JobState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.enterpriseknowledgegraph.v1.JobState)
}
