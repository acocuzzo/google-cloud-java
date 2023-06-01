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
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public interface ListDatasetVersionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1alpha.ListDatasetVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All the versions of the dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Dataset datasets = 1;</code>
   */
  java.util.List<com.google.maps.mapsplatformdatasets.v1alpha.Dataset> getDatasetsList();
  /**
   *
   *
   * <pre>
   * All the versions of the dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Dataset datasets = 1;</code>
   */
  com.google.maps.mapsplatformdatasets.v1alpha.Dataset getDatasets(int index);
  /**
   *
   *
   * <pre>
   * All the versions of the dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Dataset datasets = 1;</code>
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * All the versions of the dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Dataset datasets = 1;</code>
   */
  java.util.List<? extends com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder>
      getDatasetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All the versions of the dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Dataset datasets = 1;</code>
   */
  com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder getDatasetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
