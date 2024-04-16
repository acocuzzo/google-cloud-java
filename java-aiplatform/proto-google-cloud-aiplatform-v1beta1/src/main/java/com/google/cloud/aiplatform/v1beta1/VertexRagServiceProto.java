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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class VertexRagServiceProto {
  private VertexRagServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RagQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RagQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_VertexRagStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_VertexRagStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RagContexts_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RagContexts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RagContexts_Context_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RagContexts_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/vertex"
          + "_rag_service.proto\022\037google.cloud.aiplatf"
          + "orm.v1beta1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\"G\n\010RagQuery\022\023\n\004text\030\001 \001(\tB\003\340A\001H\000\022"
          + "\035\n\020similarity_top_k\030\002 \001(\005B\003\340A\001B\007\n\005query\""
          + "\263\002\n\027RetrieveContextsRequest\022c\n\020vertex_ra"
          + "g_store\030\002 \001(\0132G.google.cloud.aiplatform."
          + "v1beta1.RetrieveContextsRequest.VertexRa"
          + "gStoreH\000\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locati"
          + "ons.googleapis.com/Location\022=\n\005query\030\003 \001"
          + "(\0132).google.cloud.aiplatform.v1beta1.Rag"
          + "QueryB\003\340A\002\032*\n\016VertexRagStore\022\030\n\013rag_corp"
          + "ora\030\001 \003(\tB\003\340A\002B\r\n\013data_source\"\224\001\n\013RagCon"
          + "texts\022F\n\010contexts\030\001 \003(\01324.google.cloud.a"
          + "iplatform.v1beta1.RagContexts.Context\032=\n"
          + "\007Context\022\022\n\nsource_uri\030\001 \001(\t\022\014\n\004text\030\002 \001"
          + "(\t\022\020\n\010distance\030\003 \001(\001\"Z\n\030RetrieveContexts"
          + "Response\022>\n\010contexts\030\001 \001(\0132,.google.clou"
          + "d.aiplatform.v1beta1.RagContexts2\300\002\n\020Ver"
          + "texRagService\022\334\001\n\020RetrieveContexts\0228.goo"
          + "gle.cloud.aiplatform.v1beta1.RetrieveCon"
          + "textsRequest\0329.google.cloud.aiplatform.v"
          + "1beta1.RetrieveContextsResponse\"S\332A\014pare"
          + "nt,query\202\323\344\223\002>\"9/v1beta1/{parent=project"
          + "s/*/locations/*}:retrieveContexts:\001*\032M\312A"
          + "\031aiplatform.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\354\001\n#"
          + "com.google.cloud.aiplatform.v1beta1B\025Ver"
          + "texRagServiceProtoP\001ZCcloud.google.com/g"
          + "o/aiplatform/apiv1beta1/aiplatformpb;aip"
          + "latformpb\252\002\037Google.Cloud.AIPlatform.V1Be"
          + "ta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\""
          + "Google::Cloud::AIPlatform::V1beta1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_RagQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RagQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RagQuery_descriptor,
            new java.lang.String[] {
              "Text", "SimilarityTopK", "Query",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_descriptor,
            new java.lang.String[] {
              "VertexRagStore", "Parent", "Query", "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_VertexRagStore_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_VertexRagStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsRequest_VertexRagStore_descriptor,
            new java.lang.String[] {
              "RagCorpora",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RagContexts_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_RagContexts_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RagContexts_descriptor,
            new java.lang.String[] {
              "Contexts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RagContexts_Context_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_RagContexts_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RagContexts_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RagContexts_Context_descriptor,
            new java.lang.String[] {
              "SourceUri", "Text", "Distance",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor,
            new java.lang.String[] {
              "Contexts",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
