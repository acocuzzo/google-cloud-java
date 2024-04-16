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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.edgecontainer.v1;

public interface MachineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.Machine)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the machine.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the machine.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Canonical resource name of the node that this machine is responsible for
   * hosting e.g.
   * projects/{project}/locations/{location}/clusters/{cluster_id}/nodePools/{pool_id}/{node},
   * Or empty if the machine is not assigned to assume the role of a node.
   *
   * For control plane nodes hosted on edge machines, this will return
   * the following format:
   *   "projects/{project}/locations/{location}/clusters/{cluster_id}/controlPlaneNodes/{node}".
   * </pre>
   *
   * <code>string hosted_node = 5;</code>
   *
   * @return The hostedNode.
   */
  java.lang.String getHostedNode();
  /**
   *
   *
   * <pre>
   * Canonical resource name of the node that this machine is responsible for
   * hosting e.g.
   * projects/{project}/locations/{location}/clusters/{cluster_id}/nodePools/{pool_id}/{node},
   * Or empty if the machine is not assigned to assume the role of a node.
   *
   * For control plane nodes hosted on edge machines, this will return
   * the following format:
   *   "projects/{project}/locations/{location}/clusters/{cluster_id}/controlPlaneNodes/{node}".
   * </pre>
   *
   * <code>string hosted_node = 5;</code>
   *
   * @return The bytes for hostedNode.
   */
  com.google.protobuf.ByteString getHostedNodeBytes();

  /**
   *
   *
   * <pre>
   * The Google Distributed Cloud Edge zone of this machine.
   * </pre>
   *
   * <code>string zone = 6;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The Google Distributed Cloud Edge zone of this machine.
   * </pre>
   *
   * <code>string zone = 6;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. The software version of the machine.
   * </pre>
   *
   * <code>string version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Output only. The software version of the machine.
   * </pre>
   *
   * <code>string version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the machine is disabled. If disabled, the machine is
   * unable to enter service.
   * </pre>
   *
   * <code>bool disabled = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();
}
