// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.certificatemanager.v1;

public interface DeleteDnsAuthorizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.certificatemanager.v1.DeleteDnsAuthorizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A name of the dns authorization to delete. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;dnsAuthorizations/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. A name of the dns authorization to delete. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;dnsAuthorizations/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
