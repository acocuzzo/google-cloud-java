// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface DeleteGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.DeleteGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The group to delete. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The group to delete. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If this field is true, then the request means to delete a group with all
   * its descendants. Otherwise, the request means to delete a group only when
   * it has no descendants. The default value is false.
   * </pre>
   *
   * <code>bool recursive = 4;</code>
   * @return The recursive.
   */
  boolean getRecursive();
}
