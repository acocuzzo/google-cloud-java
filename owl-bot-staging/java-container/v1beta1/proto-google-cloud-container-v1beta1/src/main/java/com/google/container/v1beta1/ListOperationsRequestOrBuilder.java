// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface ListOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ListOperationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.ListOperationsRequest.project_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2916
   * @return The projectId.
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the parent field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.ListOperationsRequest.project_id is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2916
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) to return
   * operations for, or `-` for all zones. This field has been deprecated and
   * replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.ListOperationsRequest.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2925
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) to return
   * operations for, or `-` for all zones. This field has been deprecated and
   * replaced by the parent field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   * @deprecated google.container.v1beta1.ListOperationsRequest.zone is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=2925
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The parent (project and location) where the operations will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent (project and location) where the operations will be listed.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * Location "-" matches all zones and all regions.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
