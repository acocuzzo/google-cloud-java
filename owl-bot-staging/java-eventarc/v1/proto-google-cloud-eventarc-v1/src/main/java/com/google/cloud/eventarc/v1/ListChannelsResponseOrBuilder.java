// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

public interface ListChannelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.ListChannelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The requested channels, up to the number specified in `page_size`.
   * </pre>
   *
   * <code>repeated .google.cloud.eventarc.v1.Channel channels = 1;</code>
   */
  java.util.List<com.google.cloud.eventarc.v1.Channel> 
      getChannelsList();
  /**
   * <pre>
   * The requested channels, up to the number specified in `page_size`.
   * </pre>
   *
   * <code>repeated .google.cloud.eventarc.v1.Channel channels = 1;</code>
   */
  com.google.cloud.eventarc.v1.Channel getChannels(int index);
  /**
   * <pre>
   * The requested channels, up to the number specified in `page_size`.
   * </pre>
   *
   * <code>repeated .google.cloud.eventarc.v1.Channel channels = 1;</code>
   */
  int getChannelsCount();
  /**
   * <pre>
   * The requested channels, up to the number specified in `page_size`.
   * </pre>
   *
   * <code>repeated .google.cloud.eventarc.v1.Channel channels = 1;</code>
   */
  java.util.List<? extends com.google.cloud.eventarc.v1.ChannelOrBuilder> 
      getChannelsOrBuilderList();
  /**
   * <pre>
   * The requested channels, up to the number specified in `page_size`.
   * </pre>
   *
   * <code>repeated .google.cloud.eventarc.v1.Channel channels = 1;</code>
   */
  com.google.cloud.eventarc.v1.ChannelOrBuilder getChannelsOrBuilder(
      int index);

  /**
   * <pre>
   * A page token that can be sent to ListChannels to request the next page.
   * If this is empty, then there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A page token that can be sent to ListChannels to request the next page.
   * If this is empty, then there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Unreachable resources, if any.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Unreachable resources, if any.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Unreachable resources, if any.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Unreachable resources, if any.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
