// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface StatusConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.StatusCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Machine-friendly representation of the condition
   * Deprecated. Use canonical_code instead.
   * </pre>
   *
   * <code>.google.container.v1beta1.StatusCondition.Code code = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.StatusCondition.code is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4347
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Deprecated int getCodeValue();
  /**
   * <pre>
   * Machine-friendly representation of the condition
   * Deprecated. Use canonical_code instead.
   * </pre>
   *
   * <code>.google.container.v1beta1.StatusCondition.Code code = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.StatusCondition.code is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=4347
   * @return The code.
   */
  @java.lang.Deprecated com.google.container.v1beta1.StatusCondition.Code getCode();

  /**
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code canonical_code = 3;</code>
   * @return The enum numeric value on the wire for canonicalCode.
   */
  int getCanonicalCodeValue();
  /**
   * <pre>
   * Canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code canonical_code = 3;</code>
   * @return The canonicalCode.
   */
  com.google.rpc.Code getCanonicalCode();
}
