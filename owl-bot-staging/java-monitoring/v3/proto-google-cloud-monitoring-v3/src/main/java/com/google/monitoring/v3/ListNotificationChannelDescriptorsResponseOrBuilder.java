// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface ListNotificationChannelDescriptorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListNotificationChannelDescriptorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The monitored resource descriptors supported for the specified
   * project, optionally filtered.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.NotificationChannelDescriptor channel_descriptors = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.NotificationChannelDescriptor> 
      getChannelDescriptorsList();
  /**
   * <pre>
   * The monitored resource descriptors supported for the specified
   * project, optionally filtered.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.NotificationChannelDescriptor channel_descriptors = 1;</code>
   */
  com.google.monitoring.v3.NotificationChannelDescriptor getChannelDescriptors(int index);
  /**
   * <pre>
   * The monitored resource descriptors supported for the specified
   * project, optionally filtered.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.NotificationChannelDescriptor channel_descriptors = 1;</code>
   */
  int getChannelDescriptorsCount();
  /**
   * <pre>
   * The monitored resource descriptors supported for the specified
   * project, optionally filtered.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.NotificationChannelDescriptor channel_descriptors = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.NotificationChannelDescriptorOrBuilder> 
      getChannelDescriptorsOrBuilderList();
  /**
   * <pre>
   * The monitored resource descriptors supported for the specified
   * project, optionally filtered.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.NotificationChannelDescriptor channel_descriptors = 1;</code>
   */
  com.google.monitoring.v3.NotificationChannelDescriptorOrBuilder getChannelDescriptorsOrBuilder(
      int index);

  /**
   * <pre>
   * If not empty, indicates that there may be more results that match
   * the request. Use the value in the `page_token` field in a
   * subsequent request to fetch the next set of results. If empty,
   * all results have been returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If not empty, indicates that there may be more results that match
   * the request. Use the value in the `page_token` field in a
   * subsequent request to fetch the next set of results. If empty,
   * all results have been returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
