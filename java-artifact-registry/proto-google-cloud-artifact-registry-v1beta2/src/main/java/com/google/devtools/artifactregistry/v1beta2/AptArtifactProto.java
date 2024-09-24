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
// source: google/devtools/artifactregistry/v1beta2/apt_artifact.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class AptArtifactProto {
  private AptArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_AptArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_AptArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsErrorInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/devtools/artifactregistry/v1bet"
          + "a2/apt_artifact.proto\022(google.devtools.a"
          + "rtifactregistry.v1beta2\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032\027google/rpc/status.proto\"\277\003\n\013AptArti"
          + "fact\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014package_name\030"
          + "\002 \001(\tB\003\340A\003\022\\\n\014package_type\030\003 \001(\0162A.googl"
          + "e.devtools.artifactregistry.v1beta2.AptA"
          + "rtifact.PackageTypeB\003\340A\003\022\031\n\014architecture"
          + "\030\004 \001(\tB\003\340A\003\022\026\n\tcomponent\030\005 \001(\tB\003\340A\003\022\031\n\014c"
          + "ontrol_file\030\006 \001(\014B\003\340A\003\"C\n\013PackageType\022\034\n"
          + "\030PACKAGE_TYPE_UNSPECIFIED\020\000\022\n\n\006BINARY\020\001\022"
          + "\n\n\006SOURCE\020\002:\220\001\352A\214\001\n+artifactregistry.goo"
          + "gleapis.com/AptArtifact\022]projects/{proje"
          + "ct}/locations/{location}/repositories/{r"
          + "epository}/aptArtifacts/{apt_artifact}\"B"
          + "\n\033ImportAptArtifactsGcsSource\022\014\n\004uris\030\001 "
          + "\003(\t\022\025\n\ruse_wildcards\030\002 \001(\010\"\222\001\n\031ImportApt"
          + "ArtifactsRequest\022[\n\ngcs_source\030\002 \001(\0132E.g"
          + "oogle.devtools.artifactregistry.v1beta2."
          + "ImportAptArtifactsGcsSourceH\000\022\016\n\006parent\030"
          + "\001 \001(\tB\010\n\006source\"\247\001\n\033ImportAptArtifactsEr"
          + "rorInfo\022[\n\ngcs_source\030\001 \001(\0132E.google.dev"
          + "tools.artifactregistry.v1beta2.ImportApt"
          + "ArtifactsGcsSourceH\000\022!\n\005error\030\002 \001(\0132\022.go"
          + "ogle.rpc.StatusB\010\n\006source\"\301\001\n\032ImportAptA"
          + "rtifactsResponse\022L\n\rapt_artifacts\030\001 \003(\0132"
          + "5.google.devtools.artifactregistry.v1bet"
          + "a2.AptArtifact\022U\n\006errors\030\002 \003(\0132E.google."
          + "devtools.artifactregistry.v1beta2.Import"
          + "AptArtifactsErrorInfo\"\034\n\032ImportAptArtifa"
          + "ctsMetadataB\224\002\n,com.google.devtools.arti"
          + "factregistry.v1beta2B\020AptArtifactProtoP\001"
          + "ZUcloud.google.com/go/artifactregistry/a"
          + "piv1beta2/artifactregistrypb;artifactreg"
          + "istrypb\252\002%Google.Cloud.ArtifactRegistry."
          + "V1Beta2\312\002%Google\\Cloud\\ArtifactRegistry\\"
          + "V1beta2\352\002(Google::Cloud::ArtifactRegistr"
          + "y::V1beta2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_AptArtifact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_AptArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_AptArtifact_descriptor,
            new java.lang.String[] {
              "Name", "PackageName", "PackageType", "Architecture", "Component", "ControlFile",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsGcsSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsGcsSource_descriptor,
            new java.lang.String[] {
              "Uris", "UseWildcards",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsRequest_descriptor,
            new java.lang.String[] {
              "GcsSource", "Parent", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsErrorInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsErrorInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsErrorInfo_descriptor,
            new java.lang.String[] {
              "GcsSource", "Error", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsResponse_descriptor,
            new java.lang.String[] {
              "AptArtifacts", "Errors",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
