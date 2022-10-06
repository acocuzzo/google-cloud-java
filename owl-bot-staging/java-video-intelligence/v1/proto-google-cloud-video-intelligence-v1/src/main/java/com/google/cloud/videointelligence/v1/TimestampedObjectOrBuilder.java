// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface TimestampedObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.TimestampedObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Normalized Bounding box in a frame, where the object is located.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   * @return Whether the normalizedBoundingBox field is set.
   */
  boolean hasNormalizedBoundingBox();
  /**
   * <pre>
   * Normalized Bounding box in a frame, where the object is located.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   * @return The normalizedBoundingBox.
   */
  com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBox();
  /**
   * <pre>
   * Normalized Bounding box in a frame, where the object is located.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   */
  com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder getNormalizedBoundingBoxOrBuilder();

  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this object.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this object.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this object.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();

  /**
   * <pre>
   * Optional. The attributes of the object in the bounding box.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.DetectedAttribute> 
      getAttributesList();
  /**
   * <pre>
   * Optional. The attributes of the object in the bounding box.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.videointelligence.v1.DetectedAttribute getAttributes(int index);
  /**
   * <pre>
   * Optional. The attributes of the object in the bounding box.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Optional. The attributes of the object in the bounding box.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.DetectedAttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * Optional. The attributes of the object in the bounding box.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedAttribute attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.videointelligence.v1.DetectedAttributeOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. The detected landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedLandmark landmarks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.DetectedLandmark> 
      getLandmarksList();
  /**
   * <pre>
   * Optional. The detected landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedLandmark landmarks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.videointelligence.v1.DetectedLandmark getLandmarks(int index);
  /**
   * <pre>
   * Optional. The detected landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedLandmark landmarks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLandmarksCount();
  /**
   * <pre>
   * Optional. The detected landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedLandmark landmarks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.DetectedLandmarkOrBuilder> 
      getLandmarksOrBuilderList();
  /**
   * <pre>
   * Optional. The detected landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.DetectedLandmark landmarks = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.videointelligence.v1.DetectedLandmarkOrBuilder getLandmarksOrBuilder(
      int index);
}
