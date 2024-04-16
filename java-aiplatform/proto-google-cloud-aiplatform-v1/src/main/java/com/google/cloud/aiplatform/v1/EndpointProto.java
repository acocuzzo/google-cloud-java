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
// source: google/cloud/aiplatform/v1/endpoint.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/aiplatform/v1/endpoint.pr"
          + "oto\022\032google.cloud.aiplatform.v1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\0320google/cloud/aiplatform/v1/"
          + "encryption_spec.proto\032,google/cloud/aipl"
          + "atform/v1/explanation.proto\032#google/clou"
          + "d/aiplatform/v1/io.proto\0322google/cloud/a"
          + "iplatform/v1/machine_resources.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\"\302\010\n\010Endpoi"
          + "nt\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 "
          + "\001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022G\n\017deploye"
          + "d_models\030\004 \003(\0132).google.cloud.aiplatform"
          + ".v1.DeployedModelB\003\340A\003\022M\n\rtraffic_split\030"
          + "\005 \003(\01326.google.cloud.aiplatform.v1.Endpo"
          + "int.TrafficSplitEntry\022\014\n\004etag\030\006 \001(\t\022@\n\006l"
          + "abels\030\007 \003(\01320.google.cloud.aiplatform.v1"
          + ".Endpoint.LabelsEntry\0224\n\013create_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\t \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022C\n\017encryption_spec\030\n \001(\0132*.goo"
          + "gle.cloud.aiplatform.v1.EncryptionSpec\0227"
          + "\n\007network\030\r \001(\tB&\340A\001\372A \n\036compute.googlea"
          + "pis.com/Network\022*\n\036enable_private_servic"
          + "e_connect\030\021 \001(\010B\002\030\001\022g\n\037model_deployment_"
          + "monitoring_job\030\016 \001(\tB>\340A\003\372A8\n6aiplatform"
          + ".googleapis.com/ModelDeploymentMonitorin"
          + "gJob\022p\n\'predict_request_response_logging"
          + "_config\030\022 \001(\0132?.google.cloud.aiplatform."
          + "v1.PredictRequestResponseLoggingConfig\0323"
          + "\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\005:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001:\265\001\352A\261\001\n\"aiplatform.go"
          + "ogleapis.com/Endpoint\022<projects/{project"
          + "}/locations/{location}/endpoints/{endpoi"
          + "nt}\022Mprojects/{project}/locations/{locat"
          + "ion}/publishers/{publisher}/models/{mode"
          + "l}\"\332\005\n\rDeployedModel\022M\n\023dedicated_resour"
          + "ces\030\007 \001(\0132..google.cloud.aiplatform.v1.D"
          + "edicatedResourcesH\000\022M\n\023automatic_resourc"
          + "es\030\010 \001(\0132..google.cloud.aiplatform.v1.Au"
          + "tomaticResourcesH\000\022Q\n\020shared_resources\030\021"
          + " \001(\tB5\372A2\n0aiplatform.googleapis.com/Dep"
          + "loymentResourcePoolH\000\022\017\n\002id\030\001 \001(\tB\003\340A\005\0226"
          + "\n\005model\030\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.google"
          + "apis.com/Model\022\035\n\020model_version_id\030\022 \001(\t"
          + "B\003\340A\003\022\024\n\014display_name\030\003 \001(\t\0224\n\013create_ti"
          + "me\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\022E\n\020explanation_spec\030\t \001(\0132+.google.clo"
          + "ud.aiplatform.v1.ExplanationSpec\022\034\n\024disa"
          + "ble_explanations\030\023 \001(\010\022\027\n\017service_accoun"
          + "t\030\013 \001(\t\022!\n\031disable_container_logging\030\017 \001"
          + "(\010\022\035\n\025enable_access_logging\030\r \001(\010\022L\n\021pri"
          + "vate_endpoints\030\016 \001(\0132,.google.cloud.aipl"
          + "atform.v1.PrivateEndpointsB\003\340A\003B\026\n\024predi"
          + "ction_resources\"\217\001\n\020PrivateEndpoints\022\035\n\020"
          + "predict_http_uri\030\001 \001(\tB\003\340A\003\022\035\n\020explain_h"
          + "ttp_uri\030\002 \001(\tB\003\340A\003\022\034\n\017health_http_uri\030\003 "
          + "\001(\tB\003\340A\003\022\037\n\022service_attachment\030\004 \001(\tB\003\340A"
          + "\003\"\234\001\n#PredictRequestResponseLoggingConfi"
          + "g\022\017\n\007enabled\030\001 \001(\010\022\025\n\rsampling_rate\030\002 \001("
          + "\001\022M\n\024bigquery_destination\030\003 \001(\0132/.google"
          + ".cloud.aiplatform.v1.BigQueryDestination"
          + "B\313\001\n\036com.google.cloud.aiplatform.v1B\rEnd"
          + "pointProtoP\001Z>cloud.google.com/go/aiplat"
          + "form/apiv1/aiplatformpb;aiplatformpb\252\002\032G"
          + "oogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud"
          + "\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfo"
          + "rm::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedModels",
              "TrafficSplit",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "EncryptionSpec",
              "Network",
              "EnablePrivateServiceConnect",
              "ModelDeploymentMonitoringJob",
              "PredictRequestResponseLoggingConfig",
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "SharedResources",
              "Id",
              "Model",
              "ModelVersionId",
              "DisplayName",
              "CreateTime",
              "ExplanationSpec",
              "DisableExplanations",
              "ServiceAccount",
              "DisableContainerLogging",
              "EnableAccessLogging",
              "PrivateEndpoints",
              "PredictionResources",
            });
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PrivateEndpoints_descriptor,
            new java.lang.String[] {
              "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment",
            });
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictRequestResponseLoggingConfig_descriptor,
            new java.lang.String[] {
              "Enabled", "SamplingRate", "BigqueryDestination",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
