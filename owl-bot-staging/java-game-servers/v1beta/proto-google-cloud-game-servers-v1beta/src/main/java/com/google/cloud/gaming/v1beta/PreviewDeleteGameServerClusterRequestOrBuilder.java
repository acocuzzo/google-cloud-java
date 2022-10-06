// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_clusters.proto

package com.google.cloud.gaming.v1beta;

public interface PreviewDeleteGameServerClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.PreviewDeleteGameServerClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the game server cluster to delete. Uses the form:
   * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the game server cluster to delete. Uses the form:
   * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the previewTime field is set.
   */
  boolean hasPreviewTime();
  /**
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The previewTime.
   */
  com.google.protobuf.Timestamp getPreviewTime();
  /**
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getPreviewTimeOrBuilder();
}
