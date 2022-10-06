// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/products.proto

package com.google.cloud.channel.v1;

public interface MarketingInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.MarketingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Human readable name.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Human readable name.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Human readable description. Description can contain HTML.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description. Description can contain HTML.
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   * @return Whether the defaultLogo field is set.
   */
  boolean hasDefaultLogo();
  /**
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   * @return The defaultLogo.
   */
  com.google.cloud.channel.v1.Media getDefaultLogo();
  /**
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   */
  com.google.cloud.channel.v1.MediaOrBuilder getDefaultLogoOrBuilder();
}
