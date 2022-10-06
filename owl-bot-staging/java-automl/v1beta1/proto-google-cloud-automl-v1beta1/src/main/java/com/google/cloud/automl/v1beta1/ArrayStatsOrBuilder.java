// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_stats.proto

package com.google.cloud.automl.v1beta1;

public interface ArrayStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ArrayStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   * @return Whether the memberStats field is set.
   */
  boolean hasMemberStats();
  /**
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   * @return The memberStats.
   */
  com.google.cloud.automl.v1beta1.DataStats getMemberStats();
  /**
   * <pre>
   * Stats of all the values of all arrays, as if they were a single long
   * series of data. The type depends on the element type of the array.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DataStats member_stats = 2;</code>
   */
  com.google.cloud.automl.v1beta1.DataStatsOrBuilder getMemberStatsOrBuilder();
}
