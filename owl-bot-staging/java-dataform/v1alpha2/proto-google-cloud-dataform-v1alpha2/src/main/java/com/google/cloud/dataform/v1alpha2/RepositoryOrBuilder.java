// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface RepositoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.Repository)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the gitRemoteSettings field is set.
   */
  boolean hasGitRemoteSettings();
  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The gitRemoteSettings.
   */
  com.google.cloud.dataform.v1alpha2.Repository.GitRemoteSettings getGitRemoteSettings();
  /**
   * <pre>
   * Optional. If set, configures this repository to be linked to a Git remote.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Repository.GitRemoteSettings git_remote_settings = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataform.v1alpha2.Repository.GitRemoteSettingsOrBuilder getGitRemoteSettingsOrBuilder();
}
