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
// source: google/cloud/aiplatform/v1beta1/schedule.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ScheduleProto {
  private ScheduleProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Schedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Schedule_RunResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schedule_RunResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1beta1/schedu"
          + "le.proto\022\037google.cloud.aiplatform.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032>google/cloud/aipl"
          + "atform/v1beta1/model_monitoring_service."
          + "proto\0326google/cloud/aiplatform/v1beta1/p"
          + "ipeline_service.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\205\n\n\010Schedule\022\016\n\004cron\030\n \001("
          + "\tH\000\022`\n\033create_pipeline_job_request\030\016 \001(\013"
          + "29.google.cloud.aiplatform.v1beta1.Creat"
          + "ePipelineJobRequestH\001\022o\n#create_model_mo"
          + "nitoring_job_request\030\017 \001(\0132@.google.clou"
          + "d.aiplatform.v1beta1.CreateModelMonitori"
          + "ngJobRequestH\001\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014dis"
          + "play_name\030\002 \001(\tB\003\340A\002\0223\n\nstart_time\030\003 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\001\0221\n\010end"
          + "_time\030\004 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\001\022\032\n\rmax_run_count\030\020 \001(\003B\003\340A\001\022\036\n\021star"
          + "ted_run_count\030\021 \001(\003B\003\340A\003\022C\n\005state\030\005 \001(\0162"
          + "/.google.cloud.aiplatform.v1beta1.Schedu"
          + "le.StateB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0224\n\013update_ti"
          + "me\030\023 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\0226\n\rnext_run_time\030\007 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\0228\n\017last_pause_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0229\n\020l"
          + "ast_resume_time\030\t \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\022%\n\030max_concurrent_run_cou"
          + "nt\030\013 \001(\003B\003\340A\002\022\033\n\016allow_queueing\030\014 \001(\010B\003\340"
          + "A\001\022\025\n\010catch_up\030\r \001(\010B\003\340A\003\022_\n\033last_schedu"
          + "led_run_response\030\022 \001(\01325.google.cloud.ai"
          + "platform.v1beta1.Schedule.RunResponseB\003\340"
          + "A\003\032[\n\013RunResponse\0226\n\022scheduled_run_time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\022\024\n\014run"
          + "_response\030\002 \001(\t\"E\n\005State\022\025\n\021STATE_UNSPEC"
          + "IFIED\020\000\022\n\n\006ACTIVE\020\001\022\n\n\006PAUSED\020\002\022\r\n\tCOMPL"
          + "ETED\020\003:e\352Ab\n\"aiplatform.googleapis.com/S"
          + "chedule\022<projects/{project}/locations/{l"
          + "ocation}/schedules/{schedule}B\024\n\022time_sp"
          + "ecificationB\t\n\007requestB\344\001\n#com.google.cl"
          + "oud.aiplatform.v1beta1B\rScheduleProtoP\001Z"
          + "Ccloud.google.com/go/aiplatform/apiv1bet"
          + "a1/aiplatformpb;aiplatformpb\252\002\037Google.Cl"
          + "oud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AI"
          + "Platform\\V1beta1\352\002\"Google::Cloud::AIPlat"
          + "form::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringServiceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineServiceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Schedule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Schedule_descriptor,
            new java.lang.String[] {
              "Cron",
              "CreatePipelineJobRequest",
              "CreateModelMonitoringJobRequest",
              "Name",
              "DisplayName",
              "StartTime",
              "EndTime",
              "MaxRunCount",
              "StartedRunCount",
              "State",
              "CreateTime",
              "UpdateTime",
              "NextRunTime",
              "LastPauseTime",
              "LastResumeTime",
              "MaxConcurrentRunCount",
              "AllowQueueing",
              "CatchUp",
              "LastScheduledRunResponse",
              "TimeSpecification",
              "Request",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Schedule_RunResponse_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Schedule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schedule_RunResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Schedule_RunResponse_descriptor,
            new java.lang.String[] {
              "ScheduledRunTime", "RunResponse",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringServiceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
