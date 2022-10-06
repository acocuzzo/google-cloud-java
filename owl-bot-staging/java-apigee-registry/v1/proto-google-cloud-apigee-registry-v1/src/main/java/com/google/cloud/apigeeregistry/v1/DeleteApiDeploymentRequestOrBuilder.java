// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface DeleteApiDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.DeleteApiDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the deployment to delete.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the deployment to delete.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, any child resources will also be deleted.
   * (Otherwise, the request will only work if there are no child resources.)
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
