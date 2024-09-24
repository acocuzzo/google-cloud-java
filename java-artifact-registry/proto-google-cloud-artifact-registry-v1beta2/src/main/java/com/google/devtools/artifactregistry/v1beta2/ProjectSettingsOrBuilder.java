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

public interface ProjectSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ProjectSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project's settings.
   *
   * Always of the form:
   * projects/{project-id}/projectSettings
   *
   * In update request: never set
   * In response: always set
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
   * The name of the project's settings.
   *
   * Always of the form:
   * projects/{project-id}/projectSettings
   *
   * In update request: never set
   * In response: always set
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
   * The redirection state of the legacy repositories in this project.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for legacyRedirectionState.
   */
  int getLegacyRedirectionStateValue();
  /**
   *
   *
   * <pre>
   * The redirection state of the legacy repositories in this project.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState legacy_redirection_state = 2;
   * </code>
   *
   * @return The legacyRedirectionState.
   */
  com.google.devtools.artifactregistry.v1beta2.ProjectSettings.RedirectionState
      getLegacyRedirectionState();
}
