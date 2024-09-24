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
// source: google/devtools/artifactregistry/v1/file.proto

package com.google.devtools.artifactregistry.v1;

public interface FileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.File)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the file, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/files/a%2Fb%2Fc.txt".
   * If the file ID part contains slashes, they are escaped.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the file, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/files/a%2Fb%2Fc.txt".
   * If the file ID part contains slashes, they are escaped.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The size of the File in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 3;</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * The hashes of the file content.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Hash hashes = 4;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1.Hash> getHashesList();
  /**
   *
   *
   * <pre>
   * The hashes of the file content.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Hash hashes = 4;</code>
   */
  com.google.devtools.artifactregistry.v1.Hash getHashes(int index);
  /**
   *
   *
   * <pre>
   * The hashes of the file content.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Hash hashes = 4;</code>
   */
  int getHashesCount();
  /**
   *
   *
   * <pre>
   * The hashes of the file content.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Hash hashes = 4;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1.HashOrBuilder>
      getHashesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The hashes of the file content.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1.Hash hashes = 4;</code>
   */
  com.google.devtools.artifactregistry.v1.HashOrBuilder getHashesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The time when the File was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the File was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the File was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the File was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the File was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the File was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the Package or Version that owns this file, if any.
   * </pre>
   *
   * <code>string owner = 7;</code>
   *
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   *
   *
   * <pre>
   * The name of the Package or Version that owns this file, if any.
   * </pre>
   *
   * <code>string owner = 7;</code>
   *
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString getOwnerBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the last attempt to refresh the file's data was
   * made. Only set when the repository is remote.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp fetch_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the fetchTime field is set.
   */
  boolean hasFetchTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the last attempt to refresh the file's data was
   * made. Only set when the repository is remote.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp fetch_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The fetchTime.
   */
  com.google.protobuf.Timestamp getFetchTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the last attempt to refresh the file's data was
   * made. Only set when the repository is remote.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp fetch_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getFetchTimeOrBuilder();
}
