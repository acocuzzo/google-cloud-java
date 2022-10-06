// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time at which the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The time at which the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The time at which the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * A human-readable description of the event. Note that these strings can
   * change at any time without notice. Any application logic must use the
   * information in the `details` field.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A human-readable description of the event. Note that these strings can
   * change at any time without notice. Any application logic must use the
   * information in the `details` field.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.DelayedEvent][google.cloud.lifesciences.v2beta.DelayedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.DelayedEvent delayed = 17;</code>
   * @return Whether the delayed field is set.
   */
  boolean hasDelayed();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.DelayedEvent][google.cloud.lifesciences.v2beta.DelayedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.DelayedEvent delayed = 17;</code>
   * @return The delayed.
   */
  com.google.cloud.lifesciences.v2beta.DelayedEvent getDelayed();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.DelayedEvent][google.cloud.lifesciences.v2beta.DelayedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.DelayedEvent delayed = 17;</code>
   */
  com.google.cloud.lifesciences.v2beta.DelayedEventOrBuilder getDelayedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerAssignedEvent][google.cloud.lifesciences.v2beta.WorkerAssignedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerAssignedEvent worker_assigned = 18;</code>
   * @return Whether the workerAssigned field is set.
   */
  boolean hasWorkerAssigned();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerAssignedEvent][google.cloud.lifesciences.v2beta.WorkerAssignedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerAssignedEvent worker_assigned = 18;</code>
   * @return The workerAssigned.
   */
  com.google.cloud.lifesciences.v2beta.WorkerAssignedEvent getWorkerAssigned();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerAssignedEvent][google.cloud.lifesciences.v2beta.WorkerAssignedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerAssignedEvent worker_assigned = 18;</code>
   */
  com.google.cloud.lifesciences.v2beta.WorkerAssignedEventOrBuilder getWorkerAssignedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerReleasedEvent][google.cloud.lifesciences.v2beta.WorkerReleasedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerReleasedEvent worker_released = 19;</code>
   * @return Whether the workerReleased field is set.
   */
  boolean hasWorkerReleased();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerReleasedEvent][google.cloud.lifesciences.v2beta.WorkerReleasedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerReleasedEvent worker_released = 19;</code>
   * @return The workerReleased.
   */
  com.google.cloud.lifesciences.v2beta.WorkerReleasedEvent getWorkerReleased();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.WorkerReleasedEvent][google.cloud.lifesciences.v2beta.WorkerReleasedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.WorkerReleasedEvent worker_released = 19;</code>
   */
  com.google.cloud.lifesciences.v2beta.WorkerReleasedEventOrBuilder getWorkerReleasedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStartedEvent][google.cloud.lifesciences.v2beta.PullStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStartedEvent pull_started = 20;</code>
   * @return Whether the pullStarted field is set.
   */
  boolean hasPullStarted();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStartedEvent][google.cloud.lifesciences.v2beta.PullStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStartedEvent pull_started = 20;</code>
   * @return The pullStarted.
   */
  com.google.cloud.lifesciences.v2beta.PullStartedEvent getPullStarted();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStartedEvent][google.cloud.lifesciences.v2beta.PullStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStartedEvent pull_started = 20;</code>
   */
  com.google.cloud.lifesciences.v2beta.PullStartedEventOrBuilder getPullStartedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStoppedEvent][google.cloud.lifesciences.v2beta.PullStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStoppedEvent pull_stopped = 21;</code>
   * @return Whether the pullStopped field is set.
   */
  boolean hasPullStopped();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStoppedEvent][google.cloud.lifesciences.v2beta.PullStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStoppedEvent pull_stopped = 21;</code>
   * @return The pullStopped.
   */
  com.google.cloud.lifesciences.v2beta.PullStoppedEvent getPullStopped();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.PullStoppedEvent][google.cloud.lifesciences.v2beta.PullStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PullStoppedEvent pull_stopped = 21;</code>
   */
  com.google.cloud.lifesciences.v2beta.PullStoppedEventOrBuilder getPullStoppedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStartedEvent][google.cloud.lifesciences.v2beta.ContainerStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStartedEvent container_started = 22;</code>
   * @return Whether the containerStarted field is set.
   */
  boolean hasContainerStarted();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStartedEvent][google.cloud.lifesciences.v2beta.ContainerStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStartedEvent container_started = 22;</code>
   * @return The containerStarted.
   */
  com.google.cloud.lifesciences.v2beta.ContainerStartedEvent getContainerStarted();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStartedEvent][google.cloud.lifesciences.v2beta.ContainerStartedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStartedEvent container_started = 22;</code>
   */
  com.google.cloud.lifesciences.v2beta.ContainerStartedEventOrBuilder getContainerStartedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStoppedEvent][google.cloud.lifesciences.v2beta.ContainerStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStoppedEvent container_stopped = 23;</code>
   * @return Whether the containerStopped field is set.
   */
  boolean hasContainerStopped();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStoppedEvent][google.cloud.lifesciences.v2beta.ContainerStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStoppedEvent container_stopped = 23;</code>
   * @return The containerStopped.
   */
  com.google.cloud.lifesciences.v2beta.ContainerStoppedEvent getContainerStopped();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerStoppedEvent][google.cloud.lifesciences.v2beta.ContainerStoppedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerStoppedEvent container_stopped = 23;</code>
   */
  com.google.cloud.lifesciences.v2beta.ContainerStoppedEventOrBuilder getContainerStoppedOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerKilledEvent][google.cloud.lifesciences.v2beta.ContainerKilledEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerKilledEvent container_killed = 24;</code>
   * @return Whether the containerKilled field is set.
   */
  boolean hasContainerKilled();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerKilledEvent][google.cloud.lifesciences.v2beta.ContainerKilledEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerKilledEvent container_killed = 24;</code>
   * @return The containerKilled.
   */
  com.google.cloud.lifesciences.v2beta.ContainerKilledEvent getContainerKilled();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.ContainerKilledEvent][google.cloud.lifesciences.v2beta.ContainerKilledEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ContainerKilledEvent container_killed = 24;</code>
   */
  com.google.cloud.lifesciences.v2beta.ContainerKilledEventOrBuilder getContainerKilledOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent][google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent unexpected_exit_status = 25;</code>
   * @return Whether the unexpectedExitStatus field is set.
   */
  boolean hasUnexpectedExitStatus();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent][google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent unexpected_exit_status = 25;</code>
   * @return The unexpectedExitStatus.
   */
  com.google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent getUnexpectedExitStatus();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent][google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent unexpected_exit_status = 25;</code>
   */
  com.google.cloud.lifesciences.v2beta.UnexpectedExitStatusEventOrBuilder getUnexpectedExitStatusOrBuilder();

  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.FailedEvent][google.cloud.lifesciences.v2beta.FailedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.FailedEvent failed = 26;</code>
   * @return Whether the failed field is set.
   */
  boolean hasFailed();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.FailedEvent][google.cloud.lifesciences.v2beta.FailedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.FailedEvent failed = 26;</code>
   * @return The failed.
   */
  com.google.cloud.lifesciences.v2beta.FailedEvent getFailed();
  /**
   * <pre>
   * See [google.cloud.lifesciences.v2beta.FailedEvent][google.cloud.lifesciences.v2beta.FailedEvent].
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.FailedEvent failed = 26;</code>
   */
  com.google.cloud.lifesciences.v2beta.FailedEventOrBuilder getFailedOrBuilder();

  public com.google.cloud.lifesciences.v2beta.Event.DetailsCase getDetailsCase();
}
