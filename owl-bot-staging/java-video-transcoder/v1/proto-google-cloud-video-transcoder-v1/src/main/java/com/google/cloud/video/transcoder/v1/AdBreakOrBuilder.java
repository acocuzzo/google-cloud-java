// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/resources.proto

package com.google.cloud.video.transcoder.v1;

public interface AdBreakOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.AdBreak)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   * @return Whether the startTimeOffset field is set.
   */
  boolean hasStartTimeOffset();
  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   * @return The startTimeOffset.
   */
  com.google.protobuf.Duration getStartTimeOffset();
  /**
   * <pre>
   * Start time in seconds for the ad break, relative to the output file
   * timeline. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();
}
