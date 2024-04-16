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
// source: google/cloud/secretmanager/v1beta2/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.secretmanager.v1beta2;

public interface ListSecretVersionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1beta2.ListSecretVersionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] associated with the
   * [SecretVersions][google.cloud.secretmanager.v1beta2.SecretVersion] to list,
   * in the format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
   * Required. The resource name of the
   * [Secret][google.cloud.secretmanager.v1beta2.Secret] associated with the
   * [SecretVersions][google.cloud.secretmanager.v1beta2.SecretVersion] to list,
   * in the format `projects/&#42;&#47;secrets/&#42;` or `projects/&#42;&#47;locations/&#42;&#47;secrets/&#42;`.
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
   * Optional. The maximum number of results to be returned in a single page. If
   * set to 0, the server decides the number of results to return. If the
   * number is greater than 25000, it is capped at 25000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Pagination token, returned earlier via
   * ListSecretVersionsResponse.next_page_token][].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Pagination token, returned earlier via
   * ListSecretVersionsResponse.next_page_token][].
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filter string, adhering to the rules in
   * [List-operation
   * filtering](https://cloud.google.com/secret-manager/docs/filtering). List
   * only secret versions matching the filter. If filter is empty, all secret
   * versions are listed.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter string, adhering to the rules in
   * [List-operation
   * filtering](https://cloud.google.com/secret-manager/docs/filtering). List
   * only secret versions matching the filter. If filter is empty, all secret
   * versions are listed.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
