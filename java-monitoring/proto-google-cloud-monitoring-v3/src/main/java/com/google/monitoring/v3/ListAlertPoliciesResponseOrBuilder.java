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
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

public interface ListAlertPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListAlertPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The returned alert policies.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy alert_policies = 3;</code>
   */
  java.util.List<com.google.monitoring.v3.AlertPolicy> getAlertPoliciesList();
  /**
   *
   *
   * <pre>
   * The returned alert policies.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy alert_policies = 3;</code>
   */
  com.google.monitoring.v3.AlertPolicy getAlertPolicies(int index);
  /**
   *
   *
   * <pre>
   * The returned alert policies.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy alert_policies = 3;</code>
   */
  int getAlertPoliciesCount();
  /**
   *
   *
   * <pre>
   * The returned alert policies.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy alert_policies = 3;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.AlertPolicyOrBuilder>
      getAlertPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The returned alert policies.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.AlertPolicy alert_policies = 3;</code>
   */
  com.google.monitoring.v3.AlertPolicyOrBuilder getAlertPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there might be more results than were returned, then this field is set
   * to a non-empty value. To see the additional results,
   * use that value as `page_token` in the next call to this method.
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
   * If there might be more results than were returned, then this field is set
   * to a non-empty value. To see the additional results,
   * use that value as `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of alert policies in all pages. This number is only an
   * estimate, and may change in subsequent pages. https://aip.dev/158
   * </pre>
   *
   * <code>int32 total_size = 4;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
