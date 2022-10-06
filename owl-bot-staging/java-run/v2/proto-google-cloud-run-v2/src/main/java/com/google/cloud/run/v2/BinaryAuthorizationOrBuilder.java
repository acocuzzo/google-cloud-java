// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

public interface BinaryAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.BinaryAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If True, indicates to use the default project's binary authorization
   * policy. If False, binary authorization will be disabled.
   * </pre>
   *
   * <code>bool use_default = 1;</code>
   * @return Whether the useDefault field is set.
   */
  boolean hasUseDefault();
  /**
   * <pre>
   * If True, indicates to use the default project's binary authorization
   * policy. If False, binary authorization will be disabled.
   * </pre>
   *
   * <code>bool use_default = 1;</code>
   * @return The useDefault.
   */
  boolean getUseDefault();

  /**
   * <pre>
   * If present, indicates to use Breakglass using this justification.
   * If use_default is False, then it must be empty.
   * For more information on breakglass, see
   * https://cloud.google.com/binary-authorization/docs/using-breakglass
   * </pre>
   *
   * <code>string breakglass_justification = 2;</code>
   * @return The breakglassJustification.
   */
  java.lang.String getBreakglassJustification();
  /**
   * <pre>
   * If present, indicates to use Breakglass using this justification.
   * If use_default is False, then it must be empty.
   * For more information on breakglass, see
   * https://cloud.google.com/binary-authorization/docs/using-breakglass
   * </pre>
   *
   * <code>string breakglass_justification = 2;</code>
   * @return The bytes for breakglassJustification.
   */
  com.google.protobuf.ByteString
      getBreakglassJustificationBytes();

  public com.google.cloud.run.v2.BinaryAuthorization.BinauthzMethodCase getBinauthzMethodCase();
}
