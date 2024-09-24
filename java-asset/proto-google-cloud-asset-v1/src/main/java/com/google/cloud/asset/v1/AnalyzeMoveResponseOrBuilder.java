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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface AnalyzeMoveResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeMoveResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Google Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1.MoveAnalysis> getMoveAnalysisList();
  /**
   *
   *
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Google Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  com.google.cloud.asset.v1.MoveAnalysis getMoveAnalysis(int index);
  /**
   *
   *
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Google Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  int getMoveAnalysisCount();
  /**
   *
   *
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Google Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.MoveAnalysisOrBuilder>
      getMoveAnalysisOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of analyses returned from performing the intended resource move
   * analysis. The analysis is grouped by different Google Cloud services.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.MoveAnalysis move_analysis = 1;</code>
   */
  com.google.cloud.asset.v1.MoveAnalysisOrBuilder getMoveAnalysisOrBuilder(int index);
}
