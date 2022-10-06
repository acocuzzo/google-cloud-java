// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface BlueGreenSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.BlueGreenSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;</code>
   * @return Whether the standardRolloutPolicy field is set.
   */
  boolean hasStandardRolloutPolicy();
  /**
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;</code>
   * @return The standardRolloutPolicy.
   */
  com.google.container.v1beta1.BlueGreenSettings.StandardRolloutPolicy getStandardRolloutPolicy();
  /**
   * <pre>
   * Standard policy for the blue-green upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.BlueGreenSettings.StandardRolloutPolicy standard_rollout_policy = 1;</code>
   */
  com.google.container.v1beta1.BlueGreenSettings.StandardRolloutPolicyOrBuilder getStandardRolloutPolicyOrBuilder();

  /**
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   * @return Whether the nodePoolSoakDuration field is set.
   */
  boolean hasNodePoolSoakDuration();
  /**
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   * @return The nodePoolSoakDuration.
   */
  com.google.protobuf.Duration getNodePoolSoakDuration();
  /**
   * <pre>
   * Time needed after draining entire blue pool. After this period, blue pool
   * will be cleaned up.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration node_pool_soak_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getNodePoolSoakDurationOrBuilder();

  public com.google.container.v1beta1.BlueGreenSettings.RolloutPolicyCase getRolloutPolicyCase();
}
