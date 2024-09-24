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
// source: google/devtools/artifactregistry/v1beta2/settings.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface UpdateProjectSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   *
   * @return Whether the projectSettings field is set.
   */
  boolean hasProjectSettings();
  /**
   *
   *
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   *
   * @return The projectSettings.
   */
  com.google.devtools.artifactregistry.v1beta2.ProjectSettings getProjectSettings();
  /**
   *
   *
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder
      getProjectSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
