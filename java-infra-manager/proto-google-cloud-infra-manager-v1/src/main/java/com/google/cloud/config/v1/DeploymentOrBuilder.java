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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.config.v1;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A blueprint described using Terraform's HashiCorp Configuration Language
   * as a root module.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   *
   * @return Whether the terraformBlueprint field is set.
   */
  boolean hasTerraformBlueprint();
  /**
   *
   *
   * <pre>
   * A blueprint described using Terraform's HashiCorp Configuration Language
   * as a root module.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   *
   * @return The terraformBlueprint.
   */
  com.google.cloud.config.v1.TerraformBlueprint getTerraformBlueprint();
  /**
   *
   *
   * <pre>
   * A blueprint described using Terraform's HashiCorp Configuration Language
   * as a root module.
   * </pre>
   *
   * <code>.google.cloud.config.v1.TerraformBlueprint terraform_blueprint = 6;</code>
   */
  com.google.cloud.config.v1.TerraformBlueprintOrBuilder getTerraformBlueprintOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource name of the deployment.
   * Format: `projects/{project}/locations/{location}/deployments/{deployment}`
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
   * Resource name of the deployment.
   * Format: `projects/{project}/locations/{location}/deployments/{deployment}`
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
   * Output only. Time when the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the deployment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the deployment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the deployment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the deployment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined metadata for the deployment.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined metadata for the deployment.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined metadata for the deployment.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined metadata for the deployment.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-defined metadata for the deployment.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Current state of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.config.v1.Deployment.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Revision name that was most recently applied.
   * Format: `projects/{project}/locations/{location}/deployments/{deployment}/
   * revisions/{revision}`
   * </pre>
   *
   * <code>string latest_revision = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The latestRevision.
   */
  java.lang.String getLatestRevision();
  /**
   *
   *
   * <pre>
   * Output only. Revision name that was most recently applied.
   * Format: `projects/{project}/locations/{location}/deployments/{deployment}/
   * revisions/{revision}`
   * </pre>
   *
   * <code>string latest_revision = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for latestRevision.
   */
  com.google.protobuf.ByteString getLatestRevisionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Additional information regarding the current state.
   * </pre>
   *
   * <code>string state_detail = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetail.
   */
  java.lang.String getStateDetail();
  /**
   *
   *
   * <pre>
   * Output only. Additional information regarding the current state.
   * </pre>
   *
   * <code>string state_detail = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetail.
   */
  com.google.protobuf.ByteString getStateDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Error code describing errors that may have occurred.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.ErrorCode error_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   *
   *
   * <pre>
   * Output only. Error code describing errors that may have occurred.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.ErrorCode error_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The errorCode.
   */
  com.google.cloud.config.v1.Deployment.ErrorCode getErrorCode();

  /**
   *
   *
   * <pre>
   * Output only. Location of artifacts from a DeleteDeployment operation.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults delete_results = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteResults field is set.
   */
  boolean hasDeleteResults();
  /**
   *
   *
   * <pre>
   * Output only. Location of artifacts from a DeleteDeployment operation.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults delete_results = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteResults.
   */
  com.google.cloud.config.v1.ApplyResults getDeleteResults();
  /**
   *
   *
   * <pre>
   * Output only. Location of artifacts from a DeleteDeployment operation.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.ApplyResults delete_results = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.ApplyResultsOrBuilder getDeleteResultsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Cloud Build instance UUID associated with deleting this
   * deployment.
   * </pre>
   *
   * <code>string delete_build = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deleteBuild.
   */
  java.lang.String getDeleteBuild();
  /**
   *
   *
   * <pre>
   * Output only. Cloud Build instance UUID associated with deleting this
   * deployment.
   * </pre>
   *
   * <code>string delete_build = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for deleteBuild.
   */
  com.google.protobuf.ByteString getDeleteBuildBytes();

  /**
   *
   *
   * <pre>
   * Output only. Location of Cloud Build logs in Google Cloud Storage,
   * populated when deleting this deployment. Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string delete_logs = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deleteLogs.
   */
  java.lang.String getDeleteLogs();
  /**
   *
   *
   * <pre>
   * Output only. Location of Cloud Build logs in Google Cloud Storage,
   * populated when deleting this deployment. Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string delete_logs = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for deleteLogs.
   */
  com.google.protobuf.ByteString getDeleteLogsBytes();

  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when deleting this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.config.v1.TerraformError> getTfErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when deleting this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.TerraformError getTfErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when deleting this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getTfErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when deleting this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.config.v1.TerraformErrorOrBuilder>
      getTfErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Errors encountered when deleting this deployment.
   * Errors are truncated to 10 entries, see `delete_results` and `error_logs`
   * for full details.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.config.v1.TerraformError tf_errors = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.TerraformErrorOrBuilder getTfErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Location of Terraform error logs in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The errorLogs.
   */
  java.lang.String getErrorLogs();
  /**
   *
   *
   * <pre>
   * Output only. Location of Terraform error logs in Google Cloud Storage.
   * Format: `gs://{bucket}/{object}`.
   * </pre>
   *
   * <code>string error_logs = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for errorLogs.
   */
  com.google.protobuf.ByteString getErrorLogsBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-defined location of Cloud Build logs and artifacts in Google
   * Cloud Storage. Format: `gs://{bucket}/{folder}`
   *
   * A default bucket will be bootstrapped if the field is not set or empty.
   * Default bucket format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * - The field cannot be updated, including changing its presence
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the artifactsGcsBucket field is set.
   */
  boolean hasArtifactsGcsBucket();
  /**
   *
   *
   * <pre>
   * Optional. User-defined location of Cloud Build logs and artifacts in Google
   * Cloud Storage. Format: `gs://{bucket}/{folder}`
   *
   * A default bucket will be bootstrapped if the field is not set or empty.
   * Default bucket format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * - The field cannot be updated, including changing its presence
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The artifactsGcsBucket.
   */
  java.lang.String getArtifactsGcsBucket();
  /**
   *
   *
   * <pre>
   * Optional. User-defined location of Cloud Build logs and artifacts in Google
   * Cloud Storage. Format: `gs://{bucket}/{folder}`
   *
   * A default bucket will be bootstrapped if the field is not set or empty.
   * Default bucket format: `gs://&lt;project number&gt;-&lt;region&gt;-blueprint-config`
   * Constraints:
   * - The bucket needs to be in the same project as the deployment
   * - The path cannot be within the path of `gcs_source`
   * - The field cannot be updated, including changing its presence
   * </pre>
   *
   * <code>optional string artifacts_gcs_bucket = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for artifactsGcsBucket.
   */
  com.google.protobuf.ByteString getArtifactsGcsBucketBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-specified Service Account (SA) credentials to be used when
   * actuating resources.
   * Format: `projects/{projectID}/serviceAccounts/{serviceAccount}`
   * </pre>
   *
   * <code>
   * optional string service_account = 16 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. User-specified Service Account (SA) credentials to be used when
   * actuating resources.
   * Format: `projects/{projectID}/serviceAccounts/{serviceAccount}`
   * </pre>
   *
   * <code>
   * optional string service_account = 16 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. User-specified Service Account (SA) credentials to be used when
   * actuating resources.
   * Format: `projects/{projectID}/serviceAccounts/{serviceAccount}`
   * </pre>
   *
   * <code>
   * optional string service_account = 16 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * By default, Infra Manager will return a failure when
   * Terraform encounters a 409 code (resource conflict error) during actuation.
   * If this flag is set to true, Infra Manager will instead
   * attempt to automatically import the resource into the Terraform state (for
   * supported resource types) and continue actuation.
   *
   * Not all resource types are supported, refer to documentation.
   * </pre>
   *
   * <code>optional bool import_existing_resources = 17;</code>
   *
   * @return Whether the importExistingResources field is set.
   */
  boolean hasImportExistingResources();
  /**
   *
   *
   * <pre>
   * By default, Infra Manager will return a failure when
   * Terraform encounters a 409 code (resource conflict error) during actuation.
   * If this flag is set to true, Infra Manager will instead
   * attempt to automatically import the resource into the Terraform state (for
   * supported resource types) and continue actuation.
   *
   * Not all resource types are supported, refer to documentation.
   * </pre>
   *
   * <code>optional bool import_existing_resources = 17;</code>
   *
   * @return The importExistingResources.
   */
  boolean getImportExistingResources();

  /**
   *
   *
   * <pre>
   * Optional. The user-specified Cloud Build worker pool resource in which the
   * Cloud Build job will execute. Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPoolId}`.
   * If this field is unspecified, the default Cloud Build worker pool will be
   * used.
   * </pre>
   *
   * <code>
   * optional string worker_pool = 19 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the workerPool field is set.
   */
  boolean hasWorkerPool();
  /**
   *
   *
   * <pre>
   * Optional. The user-specified Cloud Build worker pool resource in which the
   * Cloud Build job will execute. Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPoolId}`.
   * If this field is unspecified, the default Cloud Build worker pool will be
   * used.
   * </pre>
   *
   * <code>
   * optional string worker_pool = 19 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();
  /**
   *
   *
   * <pre>
   * Optional. The user-specified Cloud Build worker pool resource in which the
   * Cloud Build job will execute. Format:
   * `projects/{project}/locations/{location}/workerPools/{workerPoolId}`.
   * If this field is unspecified, the default Cloud Build worker pool will be
   * used.
   * </pre>
   *
   * <code>
   * optional string worker_pool = 19 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current lock state of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.LockState lock_state = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lockState.
   */
  int getLockStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current lock state of the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.Deployment.LockState lock_state = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lockState.
   */
  com.google.cloud.config.v1.Deployment.LockState getLockState();

  /**
   *
   *
   * <pre>
   * Optional. The user-specified Terraform version constraint.
   * Example: "=1.3.10".
   * </pre>
   *
   * <code>optional string tf_version_constraint = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the tfVersionConstraint field is set.
   */
  boolean hasTfVersionConstraint();
  /**
   *
   *
   * <pre>
   * Optional. The user-specified Terraform version constraint.
   * Example: "=1.3.10".
   * </pre>
   *
   * <code>optional string tf_version_constraint = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tfVersionConstraint.
   */
  java.lang.String getTfVersionConstraint();
  /**
   *
   *
   * <pre>
   * Optional. The user-specified Terraform version constraint.
   * Example: "=1.3.10".
   * </pre>
   *
   * <code>optional string tf_version_constraint = 21 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for tfVersionConstraint.
   */
  com.google.protobuf.ByteString getTfVersionConstraintBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current Terraform version set on the deployment.
   * It is in the format of "Major.Minor.Patch", for example, "1.3.10".
   * </pre>
   *
   * <code>string tf_version = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tfVersion.
   */
  java.lang.String getTfVersion();
  /**
   *
   *
   * <pre>
   * Output only. The current Terraform version set on the deployment.
   * It is in the format of "Major.Minor.Patch", for example, "1.3.10".
   * </pre>
   *
   * <code>string tf_version = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for tfVersion.
   */
  com.google.protobuf.ByteString getTfVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Input to control quota checks for resources in terraform
   * configuration files. There are limited resources on which quota validation
   * applies.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.QuotaValidation quota_validation = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for quotaValidation.
   */
  int getQuotaValidationValue();
  /**
   *
   *
   * <pre>
   * Optional. Input to control quota checks for resources in terraform
   * configuration files. There are limited resources on which quota validation
   * applies.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.QuotaValidation quota_validation = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The quotaValidation.
   */
  com.google.cloud.config.v1.QuotaValidation getQuotaValidation();

  com.google.cloud.config.v1.Deployment.BlueprintCase getBlueprintCase();
}
