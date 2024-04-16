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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.2
package com.google.privacy.dlp.v2;

public interface DataSourceTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataSourceType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. An identifying string to the type of resource being profiled.
   * Current values: google/bigquery/table, google/project
   * </pre>
   *
   * <code>string data_source = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataSource.
   */
  java.lang.String getDataSource();
  /**
   *
   *
   * <pre>
   * Output only. An identifying string to the type of resource being profiled.
   * Current values: google/bigquery/table, google/project
   * </pre>
   *
   * <code>string data_source = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dataSource.
   */
  com.google.protobuf.ByteString getDataSourceBytes();
}
