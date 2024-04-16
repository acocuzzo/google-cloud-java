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
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.datatransfer.v1;

public interface EnrollDataSourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project resource in the form:
   * `projects/{project_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the project resource in the form:
   * `projects/{project_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @return A list containing the dataSourceIds.
   */
  java.util.List<java.lang.String> getDataSourceIdsList();
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @return The count of dataSourceIds.
   */
  int getDataSourceIdsCount();
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The dataSourceIds at the given index.
   */
  java.lang.String getDataSourceIds(int index);
  /**
   *
   *
   * <pre>
   * Data sources that are enrolled. It is required to provide at least one
   * data source id.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dataSourceIds at the given index.
   */
  com.google.protobuf.ByteString getDataSourceIdsBytes(int index);
}
