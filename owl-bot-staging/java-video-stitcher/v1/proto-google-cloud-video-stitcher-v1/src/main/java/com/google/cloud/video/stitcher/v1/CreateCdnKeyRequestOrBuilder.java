// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

public interface CreateCdnKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.CreateCdnKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project in which the CDN key should be created, in the form of
   * `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project in which the CDN key should be created, in the form of
   * `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the cdnKey field is set.
   */
  boolean hasCdnKey();
  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cdnKey.
   */
  com.google.cloud.video.stitcher.v1.CdnKey getCdnKey();
  /**
   * <pre>
   * Required. The CDN key resource to create.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.CdnKey cdn_key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder getCdnKeyOrBuilder();

  /**
   * <pre>
   * Required. The ID to use for the CDN key, which will become the final component of
   * the CDN key's resource name.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The cdnKeyId.
   */
  java.lang.String getCdnKeyId();
  /**
   * <pre>
   * Required. The ID to use for the CDN key, which will become the final component of
   * the CDN key's resource name.
   * This value should conform to RFC-1034, which restricts to
   * lower-case letters, numbers, and hyphen, with the first character a
   * letter, the last a letter or a number, and a 63 character maximum.
   * </pre>
   *
   * <code>string cdn_key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for cdnKeyId.
   */
  com.google.protobuf.ByteString
      getCdnKeyIdBytes();
}
