// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1/tag.proto

package com.google.devtools.artifactregistry.v1;

public interface ListTagsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListTagsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the parent resource whose tags will be listed.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The name of the parent resource whose tags will be listed.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *   * `version`
   *  An example of using a filter:
   *   * `version="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"`
   *   --&gt; Tags that are applied to the version `1.0` in package `pkg1`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * An expression for filtering the results of the request. Filter rules are
   * case insensitive. The fields eligible for filtering are:
   *   * `version`
   *  An example of using a filter:
   *   * `version="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"`
   *   --&gt; Tags that are applied to the version `1.0` in package `pkg1`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The maximum number of tags to return. Maximum page size is 10,000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
