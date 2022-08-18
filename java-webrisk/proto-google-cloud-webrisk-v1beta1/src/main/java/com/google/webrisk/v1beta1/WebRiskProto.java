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
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

public final class WebRiskProto {
  private WebRiskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_Constraints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_Constraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_Checksum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_Checksum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_ThreatUri_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_ThreatUri_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_ThreatHash_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_ThreatHash_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ThreatEntryAdditions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ThreatEntryAdditions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_RawIndices_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_RawHashes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_RawHashes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_webrisk_v1beta1_RiceDeltaEncoding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_webrisk_v1beta1_RiceDeltaEncoding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/webrisk/v1beta1/webrisk.p"
          + "roto\022\034google.cloud.webrisk.v1beta1\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\362\002\n\034"
          + "ComputeThreatListDiffRequest\022B\n\013threat_t"
          + "ype\030\001 \001(\0162(.google.cloud.webrisk.v1beta1"
          + ".ThreatTypeB\003\340A\002\022\025\n\rversion_token\030\002 \001(\014\022"
          + "`\n\013constraints\030\003 \001(\0132F.google.cloud.webr"
          + "isk.v1beta1.ComputeThreatListDiffRequest"
          + ".ConstraintsB\003\340A\002\032\224\001\n\013Constraints\022\030\n\020max"
          + "_diff_entries\030\001 \001(\005\022\034\n\024max_database_entr"
          + "ies\030\002 \001(\005\022M\n\026supported_compressions\030\003 \003("
          + "\0162-.google.cloud.webrisk.v1beta1.Compres"
          + "sionType\"\232\004\n\035ComputeThreatListDiffRespon"
          + "se\022_\n\rresponse_type\030\004 \001(\0162H.google.cloud"
          + ".webrisk.v1beta1.ComputeThreatListDiffRe"
          + "sponse.ResponseType\022E\n\tadditions\030\005 \001(\01322"
          + ".google.cloud.webrisk.v1beta1.ThreatEntr"
          + "yAdditions\022C\n\010removals\030\006 \001(\01321.google.cl"
          + "oud.webrisk.v1beta1.ThreatEntryRemovals\022"
          + "\031\n\021new_version_token\030\007 \001(\014\022V\n\010checksum\030\010"
          + " \001(\0132D.google.cloud.webrisk.v1beta1.Comp"
          + "uteThreatListDiffResponse.Checksum\0229\n\025re"
          + "commended_next_diff\030\002 \001(\0132\032.google.proto"
          + "buf.Timestamp\032\032\n\010Checksum\022\016\n\006sha256\030\001 \001("
          + "\014\"B\n\014ResponseType\022\035\n\031RESPONSE_TYPE_UNSPE"
          + "CIFIED\020\000\022\010\n\004DIFF\020\001\022\t\n\005RESET\020\002\"j\n\021SearchU"
          + "risRequest\022\020\n\003uri\030\001 \001(\tB\003\340A\002\022C\n\014threat_t"
          + "ypes\030\002 \003(\0162(.google.cloud.webrisk.v1beta"
          + "1.ThreatTypeB\003\340A\002\"\336\001\n\022SearchUrisResponse"
          + "\022J\n\006threat\030\001 \001(\0132:.google.cloud.webrisk."
          + "v1beta1.SearchUrisResponse.ThreatUri\032|\n\t"
          + "ThreatUri\022>\n\014threat_types\030\001 \003(\0162(.google"
          + ".cloud.webrisk.v1beta1.ThreatType\022/\n\013exp"
          + "ire_time\030\002 \001(\0132\032.google.protobuf.Timesta"
          + "mp\"o\n\023SearchHashesRequest\022\023\n\013hash_prefix"
          + "\030\001 \001(\014\022C\n\014threat_types\030\002 \003(\0162(.google.cl"
          + "oud.webrisk.v1beta1.ThreatTypeB\003\340A\002\"\256\002\n\024"
          + "SearchHashesResponse\022N\n\007threats\030\001 \003(\0132=."
          + "google.cloud.webrisk.v1beta1.SearchHashe"
          + "sResponse.ThreatHash\0228\n\024negative_expire_"
          + "time\030\002 \001(\0132\032.google.protobuf.Timestamp\032\213"
          + "\001\n\nThreatHash\022>\n\014threat_types\030\001 \003(\0162(.go"
          + "ogle.cloud.webrisk.v1beta1.ThreatType\022\014\n"
          + "\004hash\030\002 \001(\014\022/\n\013expire_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\"\231\001\n\024ThreatEntryAddi"
          + "tions\022;\n\nraw_hashes\030\001 \003(\0132\'.google.cloud"
          + ".webrisk.v1beta1.RawHashes\022D\n\013rice_hashe"
          + "s\030\002 \001(\0132/.google.cloud.webrisk.v1beta1.R"
          + "iceDeltaEncoding\"\233\001\n\023ThreatEntryRemovals"
          + "\022=\n\013raw_indices\030\001 \001(\0132(.google.cloud.web"
          + "risk.v1beta1.RawIndices\022E\n\014rice_indices\030"
          + "\002 \001(\0132/.google.cloud.webrisk.v1beta1.Ric"
          + "eDeltaEncoding\"\035\n\nRawIndices\022\017\n\007indices\030"
          + "\001 \003(\005\"4\n\tRawHashes\022\023\n\013prefix_size\030\001 \001(\005\022"
          + "\022\n\nraw_hashes\030\002 \001(\014\"k\n\021RiceDeltaEncoding"
          + "\022\023\n\013first_value\030\001 \001(\003\022\026\n\016rice_parameter\030"
          + "\002 \001(\005\022\023\n\013entry_count\030\003 \001(\005\022\024\n\014encoded_da"
          + "ta\030\004 \001(\014*e\n\nThreatType\022\033\n\027THREAT_TYPE_UN"
          + "SPECIFIED\020\000\022\013\n\007MALWARE\020\001\022\026\n\022SOCIAL_ENGIN"
          + "EERING\020\002\022\025\n\021UNWANTED_SOFTWARE\020\003*F\n\017Compr"
          + "essionType\022 \n\034COMPRESSION_TYPE_UNSPECIFI"
          + "ED\020\000\022\007\n\003RAW\020\001\022\010\n\004RICE\020\0022\236\005\n\025WebRiskServi"
          + "ceV1Beta1\022\342\001\n\025ComputeThreatListDiff\022:.go"
          + "ogle.cloud.webrisk.v1beta1.ComputeThreat"
          + "ListDiffRequest\032;.google.cloud.webrisk.v"
          + "1beta1.ComputeThreatListDiffResponse\"P\202\323"
          + "\344\223\002\"\022 /v1beta1/threatLists:computeDiff\332A"
          + "%threat_type,version_token,constraints\022\240"
          + "\001\n\nSearchUris\022/.google.cloud.webrisk.v1b"
          + "eta1.SearchUrisRequest\0320.google.cloud.we"
          + "brisk.v1beta1.SearchUrisResponse\"/\202\323\344\223\002\026"
          + "\022\024/v1beta1/uris:search\332A\020uri,threat_type"
          + "s\022\260\001\n\014SearchHashes\0221.google.cloud.webris"
          + "k.v1beta1.SearchHashesRequest\0322.google.c"
          + "loud.webrisk.v1beta1.SearchHashesRespons"
          + "e\"9\202\323\344\223\002\030\022\026/v1beta1/hashes:search\332A\030hash"
          + "_prefix,threat_types\032J\312A\026webrisk.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\330\001\n\032com.google.webrisk."
          + "v1beta1B\014WebRiskProtoP\001ZCgoogle.golang.o"
          + "rg/genproto/googleapis/cloud/webrisk/v1b"
          + "eta1;webrisk\242\002\004GCWR\252\002\034Google.Cloud.WebRi"
          + "sk.V1Beta1\312\002\034Google\\Cloud\\WebRisk\\V1beta"
          + "1\352\002\037Google::Cloud::WebRisk::V1beta1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_descriptor,
            new java.lang.String[] {
              "ThreatType", "VersionToken", "Constraints",
            });
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_Constraints_descriptor =
        internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_Constraints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffRequest_Constraints_descriptor,
            new java.lang.String[] {
              "MaxDiffEntries", "MaxDatabaseEntries", "SupportedCompressions",
            });
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_descriptor,
            new java.lang.String[] {
              "ResponseType",
              "Additions",
              "Removals",
              "NewVersionToken",
              "Checksum",
              "RecommendedNextDiff",
            });
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_Checksum_descriptor =
        internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_Checksum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ComputeThreatListDiffResponse_Checksum_descriptor,
            new java.lang.String[] {
              "Sha256",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchUrisRequest_descriptor,
            new java.lang.String[] {
              "Uri", "ThreatTypes",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_descriptor,
            new java.lang.String[] {
              "Threat",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_ThreatUri_descriptor =
        internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_ThreatUri_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchUrisResponse_ThreatUri_descriptor,
            new java.lang.String[] {
              "ThreatTypes", "ExpireTime",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchHashesRequest_descriptor,
            new java.lang.String[] {
              "HashPrefix", "ThreatTypes",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_descriptor,
            new java.lang.String[] {
              "Threats", "NegativeExpireTime",
            });
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_ThreatHash_descriptor =
        internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_ThreatHash_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_SearchHashesResponse_ThreatHash_descriptor,
            new java.lang.String[] {
              "ThreatTypes", "Hash", "ExpireTime",
            });
    internal_static_google_cloud_webrisk_v1beta1_ThreatEntryAdditions_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_webrisk_v1beta1_ThreatEntryAdditions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ThreatEntryAdditions_descriptor,
            new java.lang.String[] {
              "RawHashes", "RiceHashes",
            });
    internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_ThreatEntryRemovals_descriptor,
            new java.lang.String[] {
              "RawIndices", "RiceIndices",
            });
    internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_webrisk_v1beta1_RawIndices_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_RawIndices_descriptor,
            new java.lang.String[] {
              "Indices",
            });
    internal_static_google_cloud_webrisk_v1beta1_RawHashes_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_webrisk_v1beta1_RawHashes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_RawHashes_descriptor,
            new java.lang.String[] {
              "PrefixSize", "RawHashes",
            });
    internal_static_google_cloud_webrisk_v1beta1_RiceDeltaEncoding_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_webrisk_v1beta1_RiceDeltaEncoding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_webrisk_v1beta1_RiceDeltaEncoding_descriptor,
            new java.lang.String[] {
              "FirstValue", "RiceParameter", "EntryCount", "EncodedData",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
