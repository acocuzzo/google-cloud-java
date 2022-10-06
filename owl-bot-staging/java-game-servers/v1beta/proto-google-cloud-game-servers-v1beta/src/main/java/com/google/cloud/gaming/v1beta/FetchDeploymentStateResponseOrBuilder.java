// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

public interface FetchDeploymentStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.FetchDeploymentStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The state of the game server deployment in each game server cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState cluster_state = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState> 
      getClusterStateList();
  /**
   * <pre>
   * The state of the game server deployment in each game server cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState cluster_state = 1;</code>
   */
  com.google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState getClusterState(int index);
  /**
   * <pre>
   * The state of the game server deployment in each game server cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState cluster_state = 1;</code>
   */
  int getClusterStateCount();
  /**
   * <pre>
   * The state of the game server deployment in each game server cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState cluster_state = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterStateOrBuilder> 
      getClusterStateOrBuilderList();
  /**
   * <pre>
   * The state of the game server deployment in each game server cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterState cluster_state = 1;</code>
   */
  com.google.cloud.gaming.v1beta.FetchDeploymentStateResponse.DeployedClusterStateOrBuilder getClusterStateOrBuilder(
      int index);

  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @return A list containing the unavailable.
   */
  java.util.List<java.lang.String>
      getUnavailableList();
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @return The count of unavailable.
   */
  int getUnavailableCount();
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @param index The index of the element to return.
   * @return The unavailable at the given index.
   */
  java.lang.String getUnavailable(int index);
  /**
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unavailable at the given index.
   */
  com.google.protobuf.ByteString
      getUnavailableBytes(int index);
}
