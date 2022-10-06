// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface FaceDetectionAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.FaceDetectionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.Track> 
      getTracksList();
  /**
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 3;</code>
   */
  com.google.cloud.videointelligence.v1.Track getTracks(int index);
  /**
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 3;</code>
   */
  int getTracksCount();
  /**
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TrackOrBuilder> 
      getTracksOrBuilderList();
  /**
   * <pre>
   * The face tracks with attributes.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.Track tracks = 3;</code>
   */
  com.google.cloud.videointelligence.v1.TrackOrBuilder getTracksOrBuilder(
      int index);

  /**
   * <pre>
   * The thumbnail of a person's face.
   * </pre>
   *
   * <code>bytes thumbnail = 4;</code>
   * @return The thumbnail.
   */
  com.google.protobuf.ByteString getThumbnail();

  /**
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 5;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 5;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
