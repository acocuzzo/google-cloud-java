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
// source: google/cloud/discoveryengine/v1beta/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public interface FirestoreSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.FirestoreSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project ID that the Cloud SQL source is in with a length limit of 128
   * characters. If not specified, inherits the project ID from the parent
   * request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project ID that the Cloud SQL source is in with a length limit of 128
   * characters. If not specified, inherits the project ID from the parent
   * request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Firestore database to copy the data from with a length limit
   * of 256 characters.
   * </pre>
   *
   * <code>string database_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The databaseId.
   */
  java.lang.String getDatabaseId();
  /**
   *
   *
   * <pre>
   * Required. The Firestore database to copy the data from with a length limit
   * of 256 characters.
   * </pre>
   *
   * <code>string database_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for databaseId.
   */
  com.google.protobuf.ByteString getDatabaseIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Firestore collection to copy the data from with a length
   * limit of 1,500 characters.
   * </pre>
   *
   * <code>string collection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   *
   *
   * <pre>
   * Required. The Firestore collection to copy the data from with a length
   * limit of 1,500 characters.
   * </pre>
   *
   * <code>string collection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString getCollectionIdBytes();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * Firestore export to a specific Cloud Storage directory.
   *
   * Ensure that the Firestore service account has the necessary Cloud
   * Storage Admin permissions to access the specified Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 4;</code>
   *
   * @return The gcsStagingDir.
   */
  java.lang.String getGcsStagingDir();
  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * Firestore export to a specific Cloud Storage directory.
   *
   * Ensure that the Firestore service account has the necessary Cloud
   * Storage Admin permissions to access the specified Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 4;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  com.google.protobuf.ByteString getGcsStagingDirBytes();
}
