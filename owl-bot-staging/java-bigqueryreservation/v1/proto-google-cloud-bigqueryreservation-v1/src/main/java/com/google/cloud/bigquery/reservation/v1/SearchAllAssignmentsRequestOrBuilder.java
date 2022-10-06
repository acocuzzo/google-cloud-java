// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface SearchAllAssignmentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.SearchAllAssignmentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name with location (project name could be the wildcard '-'),
   * e.g.:
   *   `projects/-/locations/US`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name with location (project name could be the wildcard '-'),
   * e.g.:
   *   `projects/-/locations/US`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Please specify resource name as assignee in the query.
   * Examples:
   * * `assignee=projects/myproject`
   * * `assignee=folders/123`
   * * `assignee=organizations/456`
   * </pre>
   *
   * <code>string query = 2;</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Please specify resource name as assignee in the query.
   * Examples:
   * * `assignee=projects/myproject`
   * * `assignee=folders/123`
   * * `assignee=organizations/456`
   * </pre>
   *
   * <code>string query = 2;</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The maximum number of items to return per page.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The next_page_token value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The next_page_token value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
