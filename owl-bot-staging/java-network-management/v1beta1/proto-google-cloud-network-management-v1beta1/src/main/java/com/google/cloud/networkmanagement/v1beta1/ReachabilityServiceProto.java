// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1beta1/reachability.proto

package com.google.cloud.networkmanagement.v1beta1;

public final class ReachabilityServiceProto {
  private ReachabilityServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/networkmanagement/v1beta1" +
      "/reachability.proto\022&google.cloud.networ" +
      "kmanagement.v1beta1\032\034google/api/annotati" +
      "ons.proto\032\027google/api/client.proto\032\037goog" +
      "le/api/field_behavior.proto\032>google/clou" +
      "d/networkmanagement/v1beta1/connectivity" +
      "_test.proto\032#google/longrunning/operatio" +
      "ns.proto\032 google/protobuf/field_mask.pro" +
      "to\032\037google/protobuf/timestamp.proto\"|\n\034L" +
      "istConnectivityTestsRequest\022\023\n\006parent\030\001 " +
      "\001(\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke" +
      "n\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(" +
      "\t\"\232\001\n\035ListConnectivityTestsResponse\022K\n\tr" +
      "esources\030\001 \003(\01328.google.cloud.networkman" +
      "agement.v1beta1.ConnectivityTest\022\027\n\017next" +
      "_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"/" +
      "\n\032GetConnectivityTestRequest\022\021\n\004name\030\001 \001" +
      "(\tB\003\340A\002\"\233\001\n\035CreateConnectivityTestReques" +
      "t\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\024\n\007test_id\030\002 \001(\tB" +
      "\003\340A\002\022O\n\010resource\030\003 \001(\01328.google.cloud.ne" +
      "tworkmanagement.v1beta1.ConnectivityTest" +
      "B\003\340A\002\"\246\001\n\035UpdateConnectivityTestRequest\022" +
      "4\n\013update_mask\030\001 \001(\0132\032.google.protobuf.F" +
      "ieldMaskB\003\340A\002\022O\n\010resource\030\002 \001(\01328.google" +
      ".cloud.networkmanagement.v1beta1.Connect" +
      "ivityTestB\003\340A\002\"2\n\035DeleteConnectivityTest" +
      "Request\022\021\n\004name\030\001 \001(\tB\003\340A\002\"1\n\034RerunConne" +
      "ctivityTestRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\326\001" +
      "\n\021OperationMetadata\022/\n\013create_time\030\001 \001(\013" +
      "2\032.google.protobuf.Timestamp\022,\n\010end_time" +
      "\030\002 \001(\0132\032.google.protobuf.Timestamp\022\016\n\006ta" +
      "rget\030\003 \001(\t\022\014\n\004verb\030\004 \001(\t\022\025\n\rstatus_detai" +
      "l\030\005 \001(\t\022\030\n\020cancel_requested\030\006 \001(\010\022\023\n\013api" +
      "_version\030\007 \001(\t2\243\r\n\023ReachabilityService\022\355" +
      "\001\n\025ListConnectivityTests\022D.google.cloud." +
      "networkmanagement.v1beta1.ListConnectivi" +
      "tyTestsRequest\032E.google.cloud.networkman" +
      "agement.v1beta1.ListConnectivityTestsRes" +
      "ponse\"G\202\323\344\223\002A\022?/v1beta1/{parent=projects" +
      "/*/locations/global}/connectivityTests\022\334" +
      "\001\n\023GetConnectivityTest\022B.google.cloud.ne" +
      "tworkmanagement.v1beta1.GetConnectivityT" +
      "estRequest\0328.google.cloud.networkmanagem" +
      "ent.v1beta1.ConnectivityTest\"G\202\323\344\223\002A\022?/v" +
      "1beta1/{name=projects/*/locations/global" +
      "/connectivityTests/*}\022\241\002\n\026CreateConnecti" +
      "vityTest\022E.google.cloud.networkmanagemen" +
      "t.v1beta1.CreateConnectivityTestRequest\032" +
      "\035.google.longrunning.Operation\"\240\001\202\323\344\223\002K\"" +
      "?/v1beta1/{parent=projects/*/locations/g" +
      "lobal}/connectivityTests:\010resource\312AL\n7g" +
      "oogle.cloud.networkmanagement.v1beta1.Co" +
      "nnectivityTest\022\021OperationMetadata\022\252\002\n\026Up" +
      "dateConnectivityTest\022E.google.cloud.netw" +
      "orkmanagement.v1beta1.UpdateConnectivity" +
      "TestRequest\032\035.google.longrunning.Operati" +
      "on\"\251\001\202\323\344\223\002T2H/v1beta1/{resource.name=pro" +
      "jects/*/locations/global/connectivityTes" +
      "ts/*}:\010resource\312AL\n7google.cloud.network" +
      "management.v1beta1.ConnectivityTest\022\021Ope" +
      "rationMetadata\022\236\002\n\025RerunConnectivityTest" +
      "\022D.google.cloud.networkmanagement.v1beta" +
      "1.RerunConnectivityTestRequest\032\035.google." +
      "longrunning.Operation\"\237\001\202\323\344\223\002J\"E/v1beta1" +
      "/{name=projects/*/locations/global/conne" +
      "ctivityTests/*}:rerun:\001*\312AL\n7google.clou" +
      "d.networkmanagement.v1beta1.Connectivity" +
      "Test\022\021OperationMetadata\022\364\001\n\026DeleteConnec" +
      "tivityTest\022E.google.cloud.networkmanagem" +
      "ent.v1beta1.DeleteConnectivityTestReques" +
      "t\032\035.google.longrunning.Operation\"t\202\323\344\223\002A" +
      "*?/v1beta1/{name=projects/*/locations/gl" +
      "obal/connectivityTests/*}\312A*\n\025google.pro" +
      "tobuf.Empty\022\021OperationMetadata\032T\312A netwo" +
      "rkmanagement.googleapis.com\322A.https://ww" +
      "w.googleapis.com/auth/cloud-platformB\237\002\n" +
      "*com.google.cloud.networkmanagement.v1be" +
      "ta1B\030ReachabilityServiceProtoP\001ZWgoogle." +
      "golang.org/genproto/googleapis/cloud/net" +
      "workmanagement/v1beta1;networkmanagement" +
      "\252\002&Google.Cloud.NetworkManagement.V1Beta" +
      "1\312\002&Google\\Cloud\\NetworkManagement\\V1bet" +
      "a1\352\002)Google::Cloud::NetworkManagement::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.networkmanagement.v1beta1.TestOuterClass.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_ListConnectivityTestsResponse_descriptor,
        new java.lang.String[] { "Resources", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_GetConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_CreateConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Parent", "TestId", "Resource", });
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_UpdateConnectivityTestRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Resource", });
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_DeleteConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_RerunConnectivityTestRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_networkmanagement_v1beta1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusDetail", "CancelRequested", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.networkmanagement.v1beta1.TestOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
