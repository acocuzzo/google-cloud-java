// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

public interface UpdateSlateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.UpdateSlateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource with updated fields.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the slate field is set.
   */
  boolean hasSlate();
  /**
   * <pre>
   * Required. The resource with updated fields.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The slate.
   */
  com.google.cloud.video.stitcher.v1.Slate getSlate();
  /**
   * <pre>
   * Required. The resource with updated fields.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Slate slate = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.stitcher.v1.SlateOrBuilder getSlateOrBuilder();

  /**
   * <pre>
   * Required. The update mask which specifies fields which should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The update mask which specifies fields which should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The update mask which specifies fields which should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
