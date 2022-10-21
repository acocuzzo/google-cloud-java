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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

package com.google.cloud.enterpriseknowledgegraph.v1;

public interface CreateEntityReconciliationJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.CreateEntityReconciliationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * EntityReconciliationJob in. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to create the
   * EntityReconciliationJob in. Format:
   * `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entityReconciliationJob field is set.
   */
  boolean hasEntityReconciliationJob();
  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityReconciliationJob.
   */
  com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob getEntityReconciliationJob();
  /**
   *
   *
   * <pre>
   * Required. The EntityReconciliationJob to create.
   * </pre>
   *
   * <code>
   * .google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJob entity_reconciliation_job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobOrBuilder
      getEntityReconciliationJobOrBuilder();
}
