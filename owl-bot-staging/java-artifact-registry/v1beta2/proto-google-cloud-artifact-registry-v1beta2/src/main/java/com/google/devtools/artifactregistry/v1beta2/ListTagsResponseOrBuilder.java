// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/tag.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface ListTagsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ListTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The tags returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag tags = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.Tag> 
      getTagsList();
  /**
   * <pre>
   * The tags returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag tags = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.Tag getTags(int index);
  /**
   * <pre>
   * The tags returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag tags = 1;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * The tags returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag tags = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <pre>
   * The tags returned.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag tags = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <pre>
   * The token to retrieve the next page of tags, or empty if there are no
   * more tags to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The token to retrieve the next page of tags, or empty if there are no
   * more tags to return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
