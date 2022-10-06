// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/script_manifest.proto

package com.google.apps.script.type;

public interface HttpOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.HttpOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration for the token sent in the HTTP Authorization header
   * </pre>
   *
   * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
   * @return The enum numeric value on the wire for authorizationHeader.
   */
  int getAuthorizationHeaderValue();
  /**
   * <pre>
   * Configuration for the token sent in the HTTP Authorization header
   * </pre>
   *
   * <code>.google.apps.script.type.HttpAuthorizationHeader authorization_header = 1;</code>
   * @return The authorizationHeader.
   */
  com.google.apps.script.type.HttpAuthorizationHeader getAuthorizationHeader();
}
