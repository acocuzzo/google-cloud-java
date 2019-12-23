/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ListEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ListEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/` plus the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/` plus the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString getProjectNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The group for which events shall be returned.
   * </pre>
   *
   * <code>string group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   *
   *
   * <pre>
   * Required. The group for which events shall be returned.
   * </pre>
   *
   * <code>string group_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString getGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. List only ErrorGroups which belong to a service context that
   * matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceFilter field is set.
   */
  boolean hasServiceFilter();
  /**
   *
   *
   * <pre>
   * Optional. List only ErrorGroups which belong to a service context that
   * matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceFilter.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter getServiceFilter();
  /**
   *
   *
   * <pre>
   * Optional. List only ErrorGroups which belong to a service context that
   * matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilterOrBuilder
      getServiceFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List only data for the given time range.
   * If not set a default time range is used. The field time_range_begin
   * in the response will specify the beginning of this time range.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the timeRange field is set.
   */
  boolean hasTimeRange();
  /**
   *
   *
   * <pre>
   * Optional. List only data for the given time range.
   * If not set a default time range is used. The field time_range_begin
   * in the response will specify the beginning of this time range.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The timeRange.
   */
  com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange getTimeRange();
  /**
   *
   *
   * <pre>
   * Optional. List only data for the given time range.
   * If not set a default time range is used. The field time_range_begin
   * in the response will specify the beginning of this time range.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRangeOrBuilder getTimeRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return per response.
   * </pre>
   *
   * <code>int32 page_size = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A `next_page_token` provided by a previous response.
   * </pre>
   *
   * <code>string page_token = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A `next_page_token` provided by a previous response.
   * </pre>
   *
   * <code>string page_token = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
