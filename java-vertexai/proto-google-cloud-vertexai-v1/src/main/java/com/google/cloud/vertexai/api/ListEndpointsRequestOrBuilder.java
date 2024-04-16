/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/vertexai/v1/endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vertexai.api;

public interface ListEndpointsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1.ListEndpointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location from which to list the
   * Endpoints. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location from which to list the
   * Endpoints. Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `endpoint` supports `=` and `!=`. `endpoint` represents the Endpoint
   *   ID,
   *     i.e. the last segment of the Endpoint's [resource
   *     name][google.cloud.aiplatform.v1.Endpoint.name].
   *   * `display_name` supports `=` and `!=`.
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:*` or `labels:key` - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `base_model_name` only supports `=`.
   *
   * Some examples:
   *
   *   * `endpoint=1`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `baseModelName="text-bison"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `endpoint` supports `=` and `!=`. `endpoint` represents the Endpoint
   *   ID,
   *     i.e. the last segment of the Endpoint's [resource
   *     name][google.cloud.aiplatform.v1.Endpoint.name].
   *   * `display_name` supports `=` and `!=`.
   *   * `labels` supports general map functions that is:
   *     * `labels.key=value` - key:value equality
   *     * `labels.key:*` or `labels:key` - key existence
   *     * A key including a space must be quoted. `labels."a key"`.
   *   * `base_model_name` only supports `=`.
   *
   * Some examples:
   *
   *   * `endpoint=1`
   *   * `displayName="myDisplayName"`
   *   * `labels.myKey="myValue"`
   *   * `baseModelName="text-bison"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListEndpointsResponse.next_page_token][google.cloud.aiplatform.v1.ListEndpointsResponse.next_page_token]
   * of the previous
   * [EndpointService.ListEndpoints][google.cloud.aiplatform.v1.EndpointService.ListEndpoints]
   * call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListEndpointsResponse.next_page_token][google.cloud.aiplatform.v1.ListEndpointsResponse.next_page_token]
   * of the previous
   * [EndpointService.ListEndpoints][google.cloud.aiplatform.v1.EndpointService.ListEndpoints]
   * call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by, sorted in ascending order.
   * Use "desc" after a field name for descending.
   * Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
