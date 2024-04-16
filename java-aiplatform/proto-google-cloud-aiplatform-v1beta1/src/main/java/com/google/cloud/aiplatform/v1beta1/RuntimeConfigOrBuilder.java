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
// source: google/cloud/aiplatform/v1beta1/extension.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface RuntimeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Code execution runtime configurations for code interpreter extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.CodeInterpreterRuntimeConfig code_interpreter_runtime_config = 2;
   * </code>
   *
   * @return Whether the codeInterpreterRuntimeConfig field is set.
   */
  boolean hasCodeInterpreterRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Code execution runtime configurations for code interpreter extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.CodeInterpreterRuntimeConfig code_interpreter_runtime_config = 2;
   * </code>
   *
   * @return The codeInterpreterRuntimeConfig.
   */
  com.google.cloud.aiplatform.v1beta1.RuntimeConfig.CodeInterpreterRuntimeConfig
      getCodeInterpreterRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Code execution runtime configurations for code interpreter extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.CodeInterpreterRuntimeConfig code_interpreter_runtime_config = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RuntimeConfig.CodeInterpreterRuntimeConfigOrBuilder
      getCodeInterpreterRuntimeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Runtime configuration for Vertext AI Search extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.VertexAISearchRuntimeConfig vertex_ai_search_runtime_config = 6;
   * </code>
   *
   * @return Whether the vertexAiSearchRuntimeConfig field is set.
   */
  boolean hasVertexAiSearchRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Runtime configuration for Vertext AI Search extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.VertexAISearchRuntimeConfig vertex_ai_search_runtime_config = 6;
   * </code>
   *
   * @return The vertexAiSearchRuntimeConfig.
   */
  com.google.cloud.aiplatform.v1beta1.RuntimeConfig.VertexAISearchRuntimeConfig
      getVertexAiSearchRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Runtime configuration for Vertext AI Search extension.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RuntimeConfig.VertexAISearchRuntimeConfig vertex_ai_search_runtime_config = 6;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RuntimeConfig.VertexAISearchRuntimeConfigOrBuilder
      getVertexAiSearchRuntimeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Default parameters that will be set for all the execution of this
   * extension. If specified, the parameter values can be overridden by values
   * in [[ExecuteExtensionRequest.operation_params]] at request time.
   *
   * The struct should be in a form of map with param name as the key and actual
   * param value as the value.
   * E.g. If this operation requires a param "name" to be set to "abc". you can
   * set this to something like {"name": "abc"}.
   * </pre>
   *
   * <code>.google.protobuf.Struct default_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the defaultParams field is set.
   */
  boolean hasDefaultParams();
  /**
   *
   *
   * <pre>
   * Optional. Default parameters that will be set for all the execution of this
   * extension. If specified, the parameter values can be overridden by values
   * in [[ExecuteExtensionRequest.operation_params]] at request time.
   *
   * The struct should be in a form of map with param name as the key and actual
   * param value as the value.
   * E.g. If this operation requires a param "name" to be set to "abc". you can
   * set this to something like {"name": "abc"}.
   * </pre>
   *
   * <code>.google.protobuf.Struct default_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The defaultParams.
   */
  com.google.protobuf.Struct getDefaultParams();
  /**
   *
   *
   * <pre>
   * Optional. Default parameters that will be set for all the execution of this
   * extension. If specified, the parameter values can be overridden by values
   * in [[ExecuteExtensionRequest.operation_params]] at request time.
   *
   * The struct should be in a form of map with param name as the key and actual
   * param value as the value.
   * E.g. If this operation requires a param "name" to be set to "abc". you can
   * set this to something like {"name": "abc"}.
   * </pre>
   *
   * <code>.google.protobuf.Struct default_params = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.StructOrBuilder getDefaultParamsOrBuilder();

  com.google.cloud.aiplatform.v1beta1.RuntimeConfig.GoogleFirstPartyExtensionConfigCase
      getGoogleFirstPartyExtensionConfigCase();
}
