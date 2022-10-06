// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ReplicationSyncOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ReplicationSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   * @return Whether the lastSyncTime field is set.
   */
  boolean hasLastSyncTime();
  /**
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   * @return The lastSyncTime.
   */
  com.google.protobuf.Timestamp getLastSyncTime();
  /**
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastSyncTimeOrBuilder();
}
