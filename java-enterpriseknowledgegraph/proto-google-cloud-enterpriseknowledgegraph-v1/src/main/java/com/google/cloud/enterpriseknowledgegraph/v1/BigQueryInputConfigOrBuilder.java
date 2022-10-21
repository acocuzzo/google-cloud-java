/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

public interface BigQueryInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.BigQueryInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format is “projects/&#42;&#47;datasets/&#42;&#47;tables/&#42;”.
   * </pre>
   *
   * <code>
   * string bigquery_table = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bigqueryTable.
   */
  java.lang.String getBigqueryTable();
  /**
   *
   *
   * <pre>
   * Required. Format is “projects/&#42;&#47;datasets/&#42;&#47;tables/&#42;”.
   * </pre>
   *
   * <code>
   * string bigquery_table = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for bigqueryTable.
   */
  com.google.protobuf.ByteString getBigqueryTableBytes();

  /**
   *
   *
   * <pre>
   * Required. Schema mapping file
   * </pre>
   *
   * <code>string gcs_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   *
   *
   * <pre>
   * Required. Schema mapping file
   * </pre>
   *
   * <code>string gcs_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString getGcsUriBytes();
}
