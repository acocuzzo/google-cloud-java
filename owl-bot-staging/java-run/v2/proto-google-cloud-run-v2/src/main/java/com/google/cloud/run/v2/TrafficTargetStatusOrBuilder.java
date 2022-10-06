// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/traffic_target.proto

package com.google.cloud.run.v2;

public interface TrafficTargetStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.TrafficTargetStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The allocation type for this traffic target.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The allocation type for this traffic target.
   * </pre>
   *
   * <code>.google.cloud.run.v2.TrafficTargetAllocationType type = 1;</code>
   * @return The type.
   */
  com.google.cloud.run.v2.TrafficTargetAllocationType getType();

  /**
   * <pre>
   * Revision to which this traffic is sent.
   * </pre>
   *
   * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * Revision to which this traffic is sent.
   * </pre>
   *
   * <code>string revision = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString
      getRevisionBytes();

  /**
   * <pre>
   * Specifies percent of the traffic to this Revision.
   * </pre>
   *
   * <code>int32 percent = 3;</code>
   * @return The percent.
   */
  int getPercent();

  /**
   * <pre>
   * Indicates the string used in the URI to exclusively reference this target.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Indicates the string used in the URI to exclusively reference this target.
   * </pre>
   *
   * <code>string tag = 4;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Displays the target URI.
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Displays the target URI.
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
