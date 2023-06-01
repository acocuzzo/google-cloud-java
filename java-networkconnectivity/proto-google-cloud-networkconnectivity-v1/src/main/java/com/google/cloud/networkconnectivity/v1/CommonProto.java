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
// source: google/cloud/networkconnectivity/v1/common.proto

package com.google.cloud.networkconnectivity.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/networkconnectivity/v1/co"
          + "mmon.proto\022#google.cloud.networkconnecti"
          + "vity.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\207\002\n\021OperationMetada"
          + "ta\0225\n\013create_time\030\001 \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\0222\n\010end_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\004\342A\001\003\022\024\n\006target\030"
          + "\003 \001(\tB\004\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004\342A\001\003\022\034\n\016statu"
          + "s_message\030\005 \001(\tB\004\342A\001\003\022$\n\026requested_cance"
          + "llation\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_version\030\007 \001(\t"
          + "B\004\342A\001\003B\332\003\n\'com.google.cloud.networkconne"
          + "ctivity.v1B\013CommonProtoP\001ZYcloud.google."
          + "com/go/networkconnectivity/apiv1/network"
          + "connectivitypb;networkconnectivitypb\252\002#G"
          + "oogle.Cloud.NetworkConnectivity.V1\312\002#Goo"
          + "gle\\Cloud\\NetworkConnectivity\\V1\352\002&Googl"
          + "e::Cloud::NetworkConnectivity::V1\352Az\n-co"
          + "mpute.googleapis.com/InterconnectAttachm"
          + "ent\022Iprojects/{project}/regions/{region}"
          + "/interconnectAttachments/{resource_id}\352A"
          + "R\n\036compute.googleapis.com/Network\0220proje"
          + "cts/{project}/global/networks/{resource_"
          + "id}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
