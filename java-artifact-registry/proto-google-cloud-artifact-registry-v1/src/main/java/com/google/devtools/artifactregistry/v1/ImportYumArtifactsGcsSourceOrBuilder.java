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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

public interface ImportYumArtifactsGcsSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * </pre>
   *
   * <code>repeated string uris = 1;</code>
   *
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String> getUrisList();
  /**
   *
   *
   * <pre>
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * </pre>
   *
   * <code>repeated string uris = 1;</code>
   *
   * @return The count of uris.
   */
  int getUrisCount();
  /**
   *
   *
   * <pre>
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * </pre>
   *
   * <code>repeated string uris = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);
  /**
   *
   *
   * <pre>
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * </pre>
   *
   * <code>repeated string uris = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString getUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Supports URI wildcards for matching multiple objects from a single URI.
   * </pre>
   *
   * <code>bool use_wildcards = 2;</code>
   *
   * @return The useWildcards.
   */
  boolean getUseWildcards();
}
