// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetLegacyAbacRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetLegacyAbacRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3456
   * @return The projectId.
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3456
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3462
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3462
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.cluster_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3466
   * @return The clusterId.
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster to update.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.SetLegacyAbacRequest.cluster_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=3466
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * Required. Whether ABAC authorization will be enabled in the cluster.
   * </pre>
   *
   * <code>bool enabled = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * The name (project, location, cluster name) of the cluster to set legacy
   * abac. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster name) of the cluster to set legacy
   * abac. Specified in the format `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
