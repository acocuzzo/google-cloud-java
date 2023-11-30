/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

package com.google.cloud.securesourcemanager.v1;

public interface ListRepositoriesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securesourcemanager.v1.ListRepositoriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  java.util.List<com.google.cloud.securesourcemanager.v1.Repository> getRepositoriesList();
  /**
   *
   *
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  com.google.cloud.securesourcemanager.v1.Repository getRepositories(int index);
  /**
   *
   *
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  int getRepositoriesCount();
  /**
   *
   *
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securesourcemanager.v1.RepositoryOrBuilder>
      getRepositoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of repositories.
   * </pre>
   *
   * <code>repeated .google.cloud.securesourcemanager.v1.Repository repositories = 1;</code>
   */
  com.google.cloud.securesourcemanager.v1.RepositoryOrBuilder getRepositoriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server should return.
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
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
