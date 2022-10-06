// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1/cloud_memcache.proto

package com.google.cloud.memcache.v1;

public interface UpdateInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.memcache.v1.UpdateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Mask of fields to update.
   *  *   `displayName`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update.
   *  *   `displayName`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update.
   *  *   `displayName`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. A Memcached Instance.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.memcache.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Required. A Memcached Instance.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.memcache.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  com.google.cloud.memcache.v1.Instance getInstance();
  /**
   * <pre>
   * Required. A Memcached Instance.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.memcache.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.memcache.v1.InstanceOrBuilder getInstanceOrBuilder();
}
