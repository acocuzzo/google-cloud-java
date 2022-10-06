// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ProjectsEnableXpnResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ProjectsEnableXpnResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   * @return Whether the xpnResource field is set.
   */
  boolean hasXpnResource();
  /**
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   * @return The xpnResource.
   */
  com.google.cloud.compute.v1.XpnResourceId getXpnResource();
  /**
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   */
  com.google.cloud.compute.v1.XpnResourceIdOrBuilder getXpnResourceOrBuilder();
}
