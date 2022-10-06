// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

public interface ListInstancesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.ListInstancesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents a list of Data Fusion instances.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Instance instances = 1;</code>
   */
  java.util.List<com.google.cloud.datafusion.v1beta1.Instance> 
      getInstancesList();
  /**
   * <pre>
   * Represents a list of Data Fusion instances.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Instance instances = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.Instance getInstances(int index);
  /**
   * <pre>
   * Represents a list of Data Fusion instances.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Instance instances = 1;</code>
   */
  int getInstancesCount();
  /**
   * <pre>
   * Represents a list of Data Fusion instances.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Instance instances = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datafusion.v1beta1.InstanceOrBuilder> 
      getInstancesOrBuilderList();
  /**
   * <pre>
   * Represents a list of Data Fusion instances.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Instance instances = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.InstanceOrBuilder getInstancesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
