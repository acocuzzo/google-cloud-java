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
// source: google/cloud/networksecurity/v1/server_tls_policy.proto

package com.google.cloud.networksecurity.v1;

public interface ServerTlsPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.ServerTlsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the ServerTlsPolicy resource. It matches the pattern
   * `projects/&#42;&#47;locations/{location}/serverTlsPolicies/{server_tls_policy}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the ServerTlsPolicy resource. It matches the pattern
   * `projects/&#42;&#47;locations/{location}/serverTlsPolicies/{server_tls_policy}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Free-text description of the resource.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Free-text description of the resource.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   *
   * Determines if server allows plaintext connections. If set to true, server
   * allows plain text connections. By default, it is set to false. This setting
   * is not exclusive of other encryption modes. For example, if `allow_open`
   * and `mtls_policy` are set, server allows both plain text and mTLS
   * connections. See documentation of other encryption modes to confirm
   * compatibility.
   *
   * Consider using it if you wish to upgrade in place your deployment to TLS
   * while having mixed TLS and non-TLS traffic reaching port :80.
   * </pre>
   *
   * <code>bool allow_open = 6;</code>
   *
   * @return The allowOpen.
   */
  boolean getAllowOpen();

  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision server identity (public and private keys).
   * Cannot be combined with `allow_open` as a permissive mode that allows both
   * plain text and TLS is not supported.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.CertificateProvider server_certificate = 7;</code>
   *
   * @return Whether the serverCertificate field is set.
   */
  boolean hasServerCertificate();
  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision server identity (public and private keys).
   * Cannot be combined with `allow_open` as a permissive mode that allows both
   * plain text and TLS is not supported.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.CertificateProvider server_certificate = 7;</code>
   *
   * @return The serverCertificate.
   */
  com.google.cloud.networksecurity.v1.CertificateProvider getServerCertificate();
  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision server identity (public and private keys).
   * Cannot be combined with `allow_open` as a permissive mode that allows both
   * plain text and TLS is not supported.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.CertificateProvider server_certificate = 7;</code>
   */
  com.google.cloud.networksecurity.v1.CertificateProviderOrBuilder getServerCertificateOrBuilder();

  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision peer validation certificates for peer to
   * peer authentication (Mutual TLS - mTLS). If not specified, client
   * certificate will not be requested. The connection is treated as TLS and not
   * mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain
   * text and mTLS connections.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ServerTlsPolicy.MTLSPolicy mtls_policy = 8;</code>
   *
   * @return Whether the mtlsPolicy field is set.
   */
  boolean hasMtlsPolicy();
  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision peer validation certificates for peer to
   * peer authentication (Mutual TLS - mTLS). If not specified, client
   * certificate will not be requested. The connection is treated as TLS and not
   * mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain
   * text and mTLS connections.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ServerTlsPolicy.MTLSPolicy mtls_policy = 8;</code>
   *
   * @return The mtlsPolicy.
   */
  com.google.cloud.networksecurity.v1.ServerTlsPolicy.MTLSPolicy getMtlsPolicy();
  /**
   *
   *
   * <pre>
   *
   * Defines a mechanism to provision peer validation certificates for peer to
   * peer authentication (Mutual TLS - mTLS). If not specified, client
   * certificate will not be requested. The connection is treated as TLS and not
   * mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain
   * text and mTLS connections.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ServerTlsPolicy.MTLSPolicy mtls_policy = 8;</code>
   */
  com.google.cloud.networksecurity.v1.ServerTlsPolicy.MTLSPolicyOrBuilder getMtlsPolicyOrBuilder();
}
