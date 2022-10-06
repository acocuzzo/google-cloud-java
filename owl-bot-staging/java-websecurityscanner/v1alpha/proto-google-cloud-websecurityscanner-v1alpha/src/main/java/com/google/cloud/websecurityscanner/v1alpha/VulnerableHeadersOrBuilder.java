// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

package com.google.cloud.websecurityscanner.v1alpha;

public interface VulnerableHeadersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.VulnerableHeaders)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header headers = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header> 
      getHeadersList();
  /**
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header headers = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header getHeaders(int index);
  /**
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header headers = 1;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header headers = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.HeaderOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header headers = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.HeaderOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header missing_headers = 2;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header> 
      getMissingHeadersList();
  /**
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header missing_headers = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header getMissingHeaders(int index);
  /**
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header missing_headers = 2;</code>
   */
  int getMissingHeadersCount();
  /**
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header missing_headers = 2;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.HeaderOrBuilder> 
      getMissingHeadersOrBuilderList();
  /**
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.Header missing_headers = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableHeaders.HeaderOrBuilder getMissingHeadersOrBuilder(
      int index);
}
