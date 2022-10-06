// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface ChangeHistoryEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ChangeHistoryEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this change history event. This ID is unique across Google Analytics.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID of this change history event. This ID is unique across Google Analytics.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Time when change was made.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp change_time = 2;</code>
   * @return Whether the changeTime field is set.
   */
  boolean hasChangeTime();
  /**
   * <pre>
   * Time when change was made.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp change_time = 2;</code>
   * @return The changeTime.
   */
  com.google.protobuf.Timestamp getChangeTime();
  /**
   * <pre>
   * Time when change was made.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp change_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getChangeTimeOrBuilder();

  /**
   * <pre>
   * The type of actor that made this change.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ActorType actor_type = 3;</code>
   * @return The enum numeric value on the wire for actorType.
   */
  int getActorTypeValue();
  /**
   * <pre>
   * The type of actor that made this change.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ActorType actor_type = 3;</code>
   * @return The actorType.
   */
  com.google.analytics.admin.v1alpha.ActorType getActorType();

  /**
   * <pre>
   * Email address of the Google account that made the change. This will be a
   * valid email address if the actor field is set to USER, and empty otherwise.
   * Google accounts that have been deleted will cause an error.
   * </pre>
   *
   * <code>string user_actor_email = 4;</code>
   * @return The userActorEmail.
   */
  java.lang.String getUserActorEmail();
  /**
   * <pre>
   * Email address of the Google account that made the change. This will be a
   * valid email address if the actor field is set to USER, and empty otherwise.
   * Google accounts that have been deleted will cause an error.
   * </pre>
   *
   * <code>string user_actor_email = 4;</code>
   * @return The bytes for userActorEmail.
   */
  com.google.protobuf.ByteString
      getUserActorEmailBytes();

  /**
   * <pre>
   * If true, then the list of changes returned was filtered, and does not
   * represent all changes that occurred in this event.
   * </pre>
   *
   * <code>bool changes_filtered = 5;</code>
   * @return The changesFiltered.
   */
  boolean getChangesFiltered();

  /**
   * <pre>
   * A list of changes made in this change history event that fit the filters
   * specified in SearchChangeHistoryEventsRequest.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ChangeHistoryChange changes = 6;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.ChangeHistoryChange> 
      getChangesList();
  /**
   * <pre>
   * A list of changes made in this change history event that fit the filters
   * specified in SearchChangeHistoryEventsRequest.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ChangeHistoryChange changes = 6;</code>
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChange getChanges(int index);
  /**
   * <pre>
   * A list of changes made in this change history event that fit the filters
   * specified in SearchChangeHistoryEventsRequest.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ChangeHistoryChange changes = 6;</code>
   */
  int getChangesCount();
  /**
   * <pre>
   * A list of changes made in this change history event that fit the filters
   * specified in SearchChangeHistoryEventsRequest.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ChangeHistoryChange changes = 6;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.ChangeHistoryChangeOrBuilder> 
      getChangesOrBuilderList();
  /**
   * <pre>
   * A list of changes made in this change history event that fit the filters
   * specified in SearchChangeHistoryEventsRequest.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ChangeHistoryChange changes = 6;</code>
   */
  com.google.analytics.admin.v1alpha.ChangeHistoryChangeOrBuilder getChangesOrBuilder(
      int index);
}
