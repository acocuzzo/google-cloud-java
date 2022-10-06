// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface CapacityCommitmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.CapacityCommitment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the capacity commitment, e.g.,
   * `projects/myproject/locations/US/capacityCommitments/123`
   * The commitment_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end
   * with a dash. Its maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the capacity commitment, e.g.,
   * `projects/myproject/locations/US/capacityCommitments/123`
   * The commitment_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end
   * with a dash. Its maximum length is 64 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Number of slots in this commitment.
   * </pre>
   *
   * <code>int64 slot_count = 2;</code>
   * @return The slotCount.
   */
  long getSlotCount();

  /**
   * <pre>
   * Capacity commitment commitment plan.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan plan = 3;</code>
   * @return The enum numeric value on the wire for plan.
   */
  int getPlanValue();
  /**
   * <pre>
   * Capacity commitment commitment plan.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan plan = 3;</code>
   * @return The plan.
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan getPlan();

  /**
   * <pre>
   * Output only. State of the commitment.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the commitment.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitment.State getState();

  /**
   * <pre>
   * Output only. The start of the current commitment period. It is applicable only for
   * ACTIVE capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the commitmentStartTime field is set.
   */
  boolean hasCommitmentStartTime();
  /**
   * <pre>
   * Output only. The start of the current commitment period. It is applicable only for
   * ACTIVE capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The commitmentStartTime.
   */
  com.google.protobuf.Timestamp getCommitmentStartTime();
  /**
   * <pre>
   * Output only. The start of the current commitment period. It is applicable only for
   * ACTIVE capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_start_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCommitmentStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. The end of the current commitment period. It is applicable only for ACTIVE
   * capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the commitmentEndTime field is set.
   */
  boolean hasCommitmentEndTime();
  /**
   * <pre>
   * Output only. The end of the current commitment period. It is applicable only for ACTIVE
   * capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The commitmentEndTime.
   */
  com.google.protobuf.Timestamp getCommitmentEndTime();
  /**
   * <pre>
   * Output only. The end of the current commitment period. It is applicable only for ACTIVE
   * capacity commitments.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commitment_end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCommitmentEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * </pre>
   *
   * <code>.google.rpc.Status failure_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the failureStatus field is set.
   */
  boolean hasFailureStatus();
  /**
   * <pre>
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * </pre>
   *
   * <code>.google.rpc.Status failure_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureStatus.
   */
  com.google.rpc.Status getFailureStatus();
  /**
   * <pre>
   * Output only. For FAILED commitment plan, provides the reason of failure.
   * </pre>
   *
   * <code>.google.rpc.Status failure_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getFailureStatusOrBuilder();

  /**
   * <pre>
   * The plan this capacity commitment is converted to after commitment_end_time
   * passes. Once the plan is changed, committed period is extended according to
   * commitment plan. Only applicable for ANNUAL and TRIAL commitments.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan renewal_plan = 8;</code>
   * @return The enum numeric value on the wire for renewalPlan.
   */
  int getRenewalPlanValue();
  /**
   * <pre>
   * The plan this capacity commitment is converted to after commitment_end_time
   * passes. Once the plan is changed, committed period is extended according to
   * commitment plan. Only applicable for ANNUAL and TRIAL commitments.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan renewal_plan = 8;</code>
   * @return The renewalPlan.
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitment.CommitmentPlan getRenewalPlan();

  /**
   * <pre>
   * Applicable only for commitments located within one of the BigQuery
   * multi-regions (US or EU).
   * If set to true, this commitment is placed in the organization's
   * secondary region which is designated for disaster recovery purposes.
   * If false, this commitment is placed in the organization's default region.
   * </pre>
   *
   * <code>bool multi_region_auxiliary = 10;</code>
   * @return The multiRegionAuxiliary.
   */
  boolean getMultiRegionAuxiliary();
}
