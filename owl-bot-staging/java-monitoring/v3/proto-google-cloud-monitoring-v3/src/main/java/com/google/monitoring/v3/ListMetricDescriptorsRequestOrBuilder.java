// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface ListMetricDescriptorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListMetricDescriptorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If this field is empty, all custom and
   * system-defined metric descriptors are returned.
   * Otherwise, the [filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifies which metric descriptors are to be
   * returned. For example, the following filter matches all
   * [custom metrics](https://cloud.google.com/monitoring/custom-metrics):
   *     metric.type = starts_with("custom.googleapis.com/")
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * If this field is empty, all custom and
   * system-defined metric descriptors are returned.
   * Otherwise, the [filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifies which metric descriptors are to be
   * returned. For example, the following filter matches all
   * [custom metrics](https://cloud.google.com/monitoring/custom-metrics):
   *     metric.type = starts_with("custom.googleapis.com/")
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * A positive number that is the maximum number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
