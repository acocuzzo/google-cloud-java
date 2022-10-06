// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface ListDevicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.ListDevicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  java.util.List<com.google.cloud.iot.v1.Device> 
      getDevicesList();
  /**
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  com.google.cloud.iot.v1.Device getDevices(int index);
  /**
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.iot.v1.DeviceOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceOrBuilder getDevicesOrBuilder(
      int index);

  /**
   * <pre>
   * If not empty, indicates that there may be more devices that match the
   * request; this value should be passed in a new `ListDevicesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If not empty, indicates that there may be more devices that match the
   * request; this value should be passed in a new `ListDevicesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
