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
// source: google/cloud/aiplatform/v1beta1/notebook_euc_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface NotebookEucConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NotebookEucConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input only. Whether EUC is disabled in this NotebookRuntimeTemplate.
   * In proto3, the default value of a boolean is false. In this way, by default
   * EUC will be enabled for NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>bool euc_disabled = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The eucDisabled.
   */
  boolean getEucDisabled();

  /**
   *
   *
   * <pre>
   * Output only. Whether ActAs check is bypassed for service account attached
   * to the VM. If false, we need ActAs check for the default Compute Engine
   * Service account. When a Runtime is created, a VM is allocated using Default
   * Compute Engine Service Account. Any user requesting to use this Runtime
   * requires Service Account User (ActAs) permission over this SA. If true,
   * Runtime owner is using EUC and does not require the above permission as VM
   * no longer use default Compute Engine SA, but a P4SA.
   * </pre>
   *
   * <code>bool bypass_actas_check = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bypassActasCheck.
   */
  boolean getBypassActasCheck();
}
