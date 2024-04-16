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
// source: google/cloud/vertexai/v1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.vertexai.api;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Content_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Blob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Blob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_FileData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_FileData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_VideoMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_VideoMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_GenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_GenerationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_SafetySetting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_SafetySetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_SafetyRating_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_SafetyRating_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_CitationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_CitationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Candidate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Candidate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_Segment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_Segment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_GroundingAttribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_GroundingAttribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_GroundingAttribution_Web_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_GroundingAttribution_Web_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_GroundingMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_GroundingMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/vertexai/v1/content.proto"
          + "\022\030google.cloud.vertexai.v1\032\037google/api/f"
          + "ield_behavior.proto\032#google/cloud/vertex"
          + "ai/v1/tool.proto\032\036google/protobuf/durati"
          + "on.proto\032\026google/type/date.proto\"P\n\007Cont"
          + "ent\022\021\n\004role\030\001 \001(\tB\003\340A\001\0222\n\005parts\030\002 \003(\0132\036."
          + "google.cloud.vertexai.v1.PartB\003\340A\002\"\205\003\n\004P"
          + "art\022\023\n\004text\030\001 \001(\tB\003\340A\001H\000\022:\n\013inline_data\030"
          + "\002 \001(\0132\036.google.cloud.vertexai.v1.BlobB\003\340"
          + "A\001H\000\022<\n\tfile_data\030\003 \001(\0132\".google.cloud.v"
          + "ertexai.v1.FileDataB\003\340A\001H\000\022D\n\rfunction_c"
          + "all\030\005 \001(\0132&.google.cloud.vertexai.v1.Fun"
          + "ctionCallB\003\340A\001H\000\022L\n\021function_response\030\006 "
          + "\001(\0132*.google.cloud.vertexai.v1.FunctionR"
          + "esponseB\003\340A\001H\000\022F\n\016video_metadata\030\004 \001(\0132\'"
          + ".google.cloud.vertexai.v1.VideoMetadataB"
          + "\003\340A\001H\001B\006\n\004dataB\n\n\010metadata\"1\n\004Blob\022\026\n\tmi"
          + "me_type\030\001 \001(\tB\003\340A\002\022\021\n\004data\030\002 \001(\014B\003\340A\002\"9\n"
          + "\010FileData\022\026\n\tmime_type\030\001 \001(\tB\003\340A\002\022\025\n\010fil"
          + "e_uri\030\002 \001(\tB\003\340A\002\"y\n\rVideoMetadata\0224\n\014sta"
          + "rt_offset\030\001 \001(\0132\031.google.protobuf.Durati"
          + "onB\003\340A\001\0222\n\nend_offset\030\002 \001(\0132\031.google.pro"
          + "tobuf.DurationB\003\340A\001\"\226\002\n\020GenerationConfig"
          + "\022\035\n\013temperature\030\001 \001(\002B\003\340A\001H\000\210\001\001\022\027\n\005top_p"
          + "\030\002 \001(\002B\003\340A\001H\001\210\001\001\022\027\n\005top_k\030\003 \001(\002B\003\340A\001H\002\210\001"
          + "\001\022!\n\017candidate_count\030\004 \001(\005B\003\340A\001H\003\210\001\001\022#\n\021"
          + "max_output_tokens\030\005 \001(\005B\003\340A\001H\004\210\001\001\022\033\n\016sto"
          + "p_sequences\030\006 \003(\tB\003\340A\001B\016\n\014_temperatureB\010"
          + "\n\006_top_pB\010\n\006_top_kB\022\n\020_candidate_countB\024"
          + "\n\022_max_output_tokens\"\271\002\n\rSafetySetting\022="
          + "\n\010category\030\001 \001(\0162&.google.cloud.vertexai"
          + ".v1.HarmCategoryB\003\340A\002\022R\n\tthreshold\030\002 \001(\016"
          + "2:.google.cloud.vertexai.v1.SafetySettin"
          + "g.HarmBlockThresholdB\003\340A\002\"\224\001\n\022HarmBlockT"
          + "hreshold\022$\n HARM_BLOCK_THRESHOLD_UNSPECI"
          + "FIED\020\000\022\027\n\023BLOCK_LOW_AND_ABOVE\020\001\022\032\n\026BLOCK"
          + "_MEDIUM_AND_ABOVE\020\002\022\023\n\017BLOCK_ONLY_HIGH\020\003"
          + "\022\016\n\nBLOCK_NONE\020\004\"\271\004\n\014SafetyRating\022=\n\010cat"
          + "egory\030\001 \001(\0162&.google.cloud.vertexai.v1.H"
          + "armCategoryB\003\340A\003\022P\n\013probability\030\002 \001(\01626."
          + "google.cloud.vertexai.v1.SafetyRating.Ha"
          + "rmProbabilityB\003\340A\003\022\036\n\021probability_score\030"
          + "\005 \001(\002B\003\340A\003\022J\n\010severity\030\006 \001(\01623.google.cl"
          + "oud.vertexai.v1.SafetyRating.HarmSeverit"
          + "yB\003\340A\003\022\033\n\016severity_score\030\007 \001(\002B\003\340A\003\022\024\n\007b"
          + "locked\030\003 \001(\010B\003\340A\003\"b\n\017HarmProbability\022 \n\034"
          + "HARM_PROBABILITY_UNSPECIFIED\020\000\022\016\n\nNEGLIG"
          + "IBLE\020\001\022\007\n\003LOW\020\002\022\n\n\006MEDIUM\020\003\022\010\n\004HIGH\020\004\"\224\001"
          + "\n\014HarmSeverity\022\035\n\031HARM_SEVERITY_UNSPECIF"
          + "IED\020\000\022\034\n\030HARM_SEVERITY_NEGLIGIBLE\020\001\022\025\n\021H"
          + "ARM_SEVERITY_LOW\020\002\022\030\n\024HARM_SEVERITY_MEDI"
          + "UM\020\003\022\026\n\022HARM_SEVERITY_HIGH\020\004\"N\n\020Citation"
          + "Metadata\022:\n\tcitations\030\001 \003(\0132\".google.clo"
          + "ud.vertexai.v1.CitationB\003\340A\003\"\252\001\n\010Citatio"
          + "n\022\030\n\013start_index\030\001 \001(\005B\003\340A\003\022\026\n\tend_index"
          + "\030\002 \001(\005B\003\340A\003\022\020\n\003uri\030\003 \001(\tB\003\340A\003\022\022\n\005title\030\004"
          + " \001(\tB\003\340A\003\022\024\n\007license\030\005 \001(\tB\003\340A\003\0220\n\020publi"
          + "cation_date\030\006 \001(\0132\021.google.type.DateB\003\340A"
          + "\003\"\334\004\n\tCandidate\022\022\n\005index\030\001 \001(\005B\003\340A\003\0227\n\007c"
          + "ontent\030\002 \001(\0132!.google.cloud.vertexai.v1."
          + "ContentB\003\340A\003\022L\n\rfinish_reason\030\003 \001(\01620.go"
          + "ogle.cloud.vertexai.v1.Candidate.FinishR"
          + "easonB\003\340A\003\022C\n\016safety_ratings\030\004 \003(\0132&.goo"
          + "gle.cloud.vertexai.v1.SafetyRatingB\003\340A\003\022"
          + " \n\016finish_message\030\005 \001(\tB\003\340A\003H\000\210\001\001\022J\n\021cit"
          + "ation_metadata\030\006 \001(\0132*.google.cloud.vert"
          + "exai.v1.CitationMetadataB\003\340A\003\022L\n\022groundi"
          + "ng_metadata\030\007 \001(\0132+.google.cloud.vertexa"
          + "i.v1.GroundingMetadataB\003\340A\003\"\237\001\n\014FinishRe"
          + "ason\022\035\n\031FINISH_REASON_UNSPECIFIED\020\000\022\010\n\004S"
          + "TOP\020\001\022\016\n\nMAX_TOKENS\020\002\022\n\n\006SAFETY\020\003\022\016\n\nREC"
          + "ITATION\020\004\022\t\n\005OTHER\020\005\022\r\n\tBLOCKLIST\020\006\022\026\n\022P"
          + "ROHIBITED_CONTENT\020\007\022\010\n\004SPII\020\010B\021\n\017_finish"
          + "_message\"T\n\007Segment\022\027\n\npart_index\030\001 \001(\005B"
          + "\003\340A\003\022\030\n\013start_index\030\002 \001(\005B\003\340A\003\022\026\n\tend_in"
          + "dex\030\003 \001(\005B\003\340A\003\"\215\002\n\024GroundingAttribution\022"
          + "F\n\003web\030\003 \001(\01322.google.cloud.vertexai.v1."
          + "GroundingAttribution.WebB\003\340A\001H\000\0227\n\007segme"
          + "nt\030\001 \001(\0132!.google.cloud.vertexai.v1.Segm"
          + "entB\003\340A\003\022%\n\020confidence_score\030\002 \001(\002B\006\340A\001\340"
          + "A\003H\001\210\001\001\032+\n\003Web\022\020\n\003uri\030\001 \001(\tB\003\340A\003\022\022\n\005titl"
          + "e\030\002 \001(\tB\003\340A\003B\013\n\treferenceB\023\n\021_confidence"
          + "_score\"\211\001\n\021GroundingMetadata\022\037\n\022web_sear"
          + "ch_queries\030\001 \003(\tB\003\340A\001\022S\n\026grounding_attri"
          + "butions\030\002 \003(\0132..google.cloud.vertexai.v1"
          + ".GroundingAttributionB\003\340A\001*\264\001\n\014HarmCateg"
          + "ory\022\035\n\031HARM_CATEGORY_UNSPECIFIED\020\000\022\035\n\031HA"
          + "RM_CATEGORY_HATE_SPEECH\020\001\022#\n\037HARM_CATEGO"
          + "RY_DANGEROUS_CONTENT\020\002\022\034\n\030HARM_CATEGORY_"
          + "HARASSMENT\020\003\022#\n\037HARM_CATEGORY_SEXUALLY_E"
          + "XPLICIT\020\004B\311\001\n\035com.google.cloud.vertexai."
          + "apiB\014ContentProtoP\001Z>cloud.google.com/go"
          + "/aiplatform/apiv1/aiplatformpb;aiplatfor"
          + "mpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Googl"
          + "e\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::A"
          + "IPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.vertexai.api.ToolProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_Content_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_Content_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Content_descriptor,
            new java.lang.String[] {
              "Role", "Parts",
            });
    internal_static_google_cloud_vertexai_v1_Part_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vertexai_v1_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Part_descriptor,
            new java.lang.String[] {
              "Text",
              "InlineData",
              "FileData",
              "FunctionCall",
              "FunctionResponse",
              "VideoMetadata",
              "Data",
              "Metadata",
            });
    internal_static_google_cloud_vertexai_v1_Blob_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vertexai_v1_Blob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Blob_descriptor,
            new java.lang.String[] {
              "MimeType", "Data",
            });
    internal_static_google_cloud_vertexai_v1_FileData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vertexai_v1_FileData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_FileData_descriptor,
            new java.lang.String[] {
              "MimeType", "FileUri",
            });
    internal_static_google_cloud_vertexai_v1_VideoMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vertexai_v1_VideoMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_VideoMetadata_descriptor,
            new java.lang.String[] {
              "StartOffset", "EndOffset",
            });
    internal_static_google_cloud_vertexai_v1_GenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vertexai_v1_GenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_GenerationConfig_descriptor,
            new java.lang.String[] {
              "Temperature", "TopP", "TopK", "CandidateCount", "MaxOutputTokens", "StopSequences",
            });
    internal_static_google_cloud_vertexai_v1_SafetySetting_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_vertexai_v1_SafetySetting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_SafetySetting_descriptor,
            new java.lang.String[] {
              "Category", "Threshold",
            });
    internal_static_google_cloud_vertexai_v1_SafetyRating_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_vertexai_v1_SafetyRating_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_SafetyRating_descriptor,
            new java.lang.String[] {
              "Category", "Probability", "ProbabilityScore", "Severity", "SeverityScore", "Blocked",
            });
    internal_static_google_cloud_vertexai_v1_CitationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_vertexai_v1_CitationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_CitationMetadata_descriptor,
            new java.lang.String[] {
              "Citations",
            });
    internal_static_google_cloud_vertexai_v1_Citation_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_vertexai_v1_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Uri", "Title", "License", "PublicationDate",
            });
    internal_static_google_cloud_vertexai_v1_Candidate_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_vertexai_v1_Candidate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Candidate_descriptor,
            new java.lang.String[] {
              "Index",
              "Content",
              "FinishReason",
              "SafetyRatings",
              "FinishMessage",
              "CitationMetadata",
              "GroundingMetadata",
            });
    internal_static_google_cloud_vertexai_v1_Segment_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_vertexai_v1_Segment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_Segment_descriptor,
            new java.lang.String[] {
              "PartIndex", "StartIndex", "EndIndex",
            });
    internal_static_google_cloud_vertexai_v1_GroundingAttribution_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_vertexai_v1_GroundingAttribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_GroundingAttribution_descriptor,
            new java.lang.String[] {
              "Web", "Segment", "ConfidenceScore", "Reference",
            });
    internal_static_google_cloud_vertexai_v1_GroundingAttribution_Web_descriptor =
        internal_static_google_cloud_vertexai_v1_GroundingAttribution_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_GroundingAttribution_Web_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_GroundingAttribution_Web_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_vertexai_v1_GroundingMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_vertexai_v1_GroundingMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_GroundingMetadata_descriptor,
            new java.lang.String[] {
              "WebSearchQueries", "GroundingAttributions",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.vertexai.api.ToolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
