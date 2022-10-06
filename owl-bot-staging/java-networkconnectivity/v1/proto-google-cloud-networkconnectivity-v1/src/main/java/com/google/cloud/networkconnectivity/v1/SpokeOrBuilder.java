// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface SpokeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.Spoke)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The name of the spoke. Spoke names must be unique. They use the
   * following form:
   *     `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The name of the spoke. Spoke names must be unique. They use the
   * following form:
   *     `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The time the spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time the spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time the spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time the spoke was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time the spoke was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time the spoke was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional labels in key:value format. For more information about labels, see
   * [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional labels in key:value format. For more information about labels, see
   * [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional labels in key:value format. For more information about labels, see
   * [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional labels in key:value format. For more information about labels, see
   * [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
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
   * <pre>
   * Optional labels in key:value format. For more information about labels, see
   * [Requirements for
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * An optional description of the spoke.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * An optional description of the spoke.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Immutable. The name of the hub that this spoke is attached to.
   * </pre>
   *
   * <code>string hub = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The hub.
   */
  java.lang.String getHub();
  /**
   * <pre>
   * Immutable. The name of the hub that this spoke is attached to.
   * </pre>
   *
   * <code>string hub = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for hub.
   */
  com.google.protobuf.ByteString
      getHubBytes();

  /**
   * <pre>
   * VPN tunnels that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedVpnTunnels linked_vpn_tunnels = 17;</code>
   * @return Whether the linkedVpnTunnels field is set.
   */
  boolean hasLinkedVpnTunnels();
  /**
   * <pre>
   * VPN tunnels that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedVpnTunnels linked_vpn_tunnels = 17;</code>
   * @return The linkedVpnTunnels.
   */
  com.google.cloud.networkconnectivity.v1.LinkedVpnTunnels getLinkedVpnTunnels();
  /**
   * <pre>
   * VPN tunnels that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedVpnTunnels linked_vpn_tunnels = 17;</code>
   */
  com.google.cloud.networkconnectivity.v1.LinkedVpnTunnelsOrBuilder getLinkedVpnTunnelsOrBuilder();

  /**
   * <pre>
   * VLAN attachments that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedInterconnectAttachments linked_interconnect_attachments = 18;</code>
   * @return Whether the linkedInterconnectAttachments field is set.
   */
  boolean hasLinkedInterconnectAttachments();
  /**
   * <pre>
   * VLAN attachments that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedInterconnectAttachments linked_interconnect_attachments = 18;</code>
   * @return The linkedInterconnectAttachments.
   */
  com.google.cloud.networkconnectivity.v1.LinkedInterconnectAttachments getLinkedInterconnectAttachments();
  /**
   * <pre>
   * VLAN attachments that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedInterconnectAttachments linked_interconnect_attachments = 18;</code>
   */
  com.google.cloud.networkconnectivity.v1.LinkedInterconnectAttachmentsOrBuilder getLinkedInterconnectAttachmentsOrBuilder();

  /**
   * <pre>
   * Router appliance instances that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances linked_router_appliance_instances = 19;</code>
   * @return Whether the linkedRouterApplianceInstances field is set.
   */
  boolean hasLinkedRouterApplianceInstances();
  /**
   * <pre>
   * Router appliance instances that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances linked_router_appliance_instances = 19;</code>
   * @return The linkedRouterApplianceInstances.
   */
  com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances getLinkedRouterApplianceInstances();
  /**
   * <pre>
   * Router appliance instances that are associated with the spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances linked_router_appliance_instances = 19;</code>
   */
  com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstancesOrBuilder getLinkedRouterApplianceInstancesOrBuilder();

  /**
   * <pre>
   * Output only. The Google-generated UUID for the spoke. This value is unique across all
   * spoke resources. If a spoke is deleted and another with the same name is
   * created, the new spoke is assigned a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   * <pre>
   * Output only. The Google-generated UUID for the spoke. This value is unique across all
   * spoke resources. If a spoke is deleted and another with the same name is
   * created, the new spoke is assigned a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString
      getUniqueIdBytes();

  /**
   * <pre>
   * Output only. The current lifecycle state of this spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.State state = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current lifecycle state of this spoke.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.State state = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.networkconnectivity.v1.State getState();
}
