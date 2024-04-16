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
// source: google/cloud/gkebackup/v1/restore_plan.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkebackup.v1;

public final class RestorePlanProto {
  private RestorePlanProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/gkebackup/v1/restore_plan"
          + ".proto\022\031google.cloud.gkebackup.v1\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\032\'google/cloud/gkebackup/v1"
          + "/restore.proto\032\037google/protobuf/timestam"
          + "p.proto\"\264\006\n\013RestorePlan\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\030\n\013description\030\005 \001(\tB\003\340A\001\022C\n\013ba"
          + "ckup_plan\030\006 \001(\tB.\340A\005\340A\002\372A%\n#gkebackup.go"
          + "ogleapis.com/BackupPlan\022<\n\007cluster\030\007 \001(\t"
          + "B+\340A\005\340A\002\372A\"\n container.googleapis.com/Cl"
          + "uster\022E\n\016restore_config\030\010 \001(\0132(.google.c"
          + "loud.gkebackup.v1.RestoreConfigB\003\340A\002\022G\n\006"
          + "labels\030\t \003(\01322.google.cloud.gkebackup.v1"
          + ".RestorePlan.LabelsEntryB\003\340A\001\022\021\n\004etag\030\n "
          + "\001(\tB\003\340A\003\022@\n\005state\030\013 \001(\0162,.google.cloud.g"
          + "kebackup.v1.RestorePlan.StateB\003\340A\003\022\031\n\014st"
          + "ate_reason\030\014 \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"X\n\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\023\n\017CLUSTER_PENDING\020"
          + "\001\022\t\n\005READY\020\002\022\n\n\006FAILED\020\003\022\014\n\010DELETING\020\004:n"
          + "\352Ak\n$gkebackup.googleapis.com/RestorePla"
          + "n\022Cprojects/{project}/locations/{locatio"
          + "n}/restorePlans/{restore_plan}B\307\001\n\035com.g"
          + "oogle.cloud.gkebackup.v1B\020RestorePlanPro"
          + "toP\001Z;cloud.google.com/go/gkebackup/apiv"
          + "1/gkebackuppb;gkebackuppb\252\002\031Google.Cloud"
          + ".GkeBackup.V1\312\002\031Google\\Cloud\\GkeBackup\\V"
          + "1\352\002\034Google::Cloud::GkeBackup::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkebackup.v1.RestoreProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_RestorePlan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Description",
              "BackupPlan",
              "Cluster",
              "RestoreConfig",
              "Labels",
              "Etag",
              "State",
              "StateReason",
            });
    internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_RestorePlan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_RestorePlan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.gkebackup.v1.RestoreProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
