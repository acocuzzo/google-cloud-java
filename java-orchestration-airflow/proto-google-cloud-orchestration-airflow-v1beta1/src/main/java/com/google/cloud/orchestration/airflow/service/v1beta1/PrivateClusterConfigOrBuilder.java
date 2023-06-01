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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface PrivateClusterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. If `true`, access to the public endpoint of the GKE cluster is
   * denied.
   * </pre>
   *
   * <code>bool enable_private_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enablePrivateEndpoint.
   */
  boolean getEnablePrivateEndpoint();

  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IPv4 range for GKE master will be
   * reserved. If left blank, the default value of '172.16.0.0/23' is used.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The masterIpv4CidrBlock.
   */
  java.lang.String getMasterIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IPv4 range for GKE master will be
   * reserved. If left blank, the default value of '172.16.0.0/23' is used.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for masterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getMasterIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IP range in CIDR notation to use for the hosted master
   * network. This range is used for assigning internal IP addresses to the
   * cluster master or set of masters and to the internal load balancer virtual
   * IP. This range must not overlap with any other ranges in use within the
   * cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The masterIpv4ReservedRange.
   */
  java.lang.String getMasterIpv4ReservedRange();
  /**
   *
   *
   * <pre>
   * Output only. The IP range in CIDR notation to use for the hosted master
   * network. This range is used for assigning internal IP addresses to the
   * cluster master or set of masters and to the internal load balancer virtual
   * IP. This range must not overlap with any other ranges in use within the
   * cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_reserved_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for masterIpv4ReservedRange.
   */
  com.google.protobuf.ByteString getMasterIpv4ReservedRangeBytes();
}
