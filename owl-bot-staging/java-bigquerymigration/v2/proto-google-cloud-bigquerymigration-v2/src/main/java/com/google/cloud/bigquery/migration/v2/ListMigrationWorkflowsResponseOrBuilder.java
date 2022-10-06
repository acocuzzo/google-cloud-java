// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2/migration_service.proto

package com.google.cloud.bigquery.migration.v2;

public interface ListMigrationWorkflowsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.ListMigrationWorkflowsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The migration workflows for the specified project / location.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationWorkflow migration_workflows = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.MigrationWorkflow> 
      getMigrationWorkflowsList();
  /**
   * <pre>
   * The migration workflows for the specified project / location.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationWorkflow migration_workflows = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2.MigrationWorkflow getMigrationWorkflows(int index);
  /**
   * <pre>
   * The migration workflows for the specified project / location.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationWorkflow migration_workflows = 1;</code>
   */
  int getMigrationWorkflowsCount();
  /**
   * <pre>
   * The migration workflows for the specified project / location.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationWorkflow migration_workflows = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.MigrationWorkflowOrBuilder> 
      getMigrationWorkflowsOrBuilderList();
  /**
   * <pre>
   * The migration workflows for the specified project / location.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.MigrationWorkflow migration_workflows = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2.MigrationWorkflowOrBuilder getMigrationWorkflowsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
