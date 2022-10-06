// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface ListWorkerPoolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ListWorkerPoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v1.WorkerPool> 
      getWorkerPoolsList();
  /**
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  com.google.cloudbuild.v1.WorkerPool getWorkerPools(int index);
  /**
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  int getWorkerPoolsCount();
  /**
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.WorkerPoolOrBuilder> 
      getWorkerPoolsOrBuilderList();
  /**
   * <pre>
   * `WorkerPools` for the specified project.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.WorkerPool worker_pools = 1;</code>
   */
  com.google.cloudbuild.v1.WorkerPoolOrBuilder getWorkerPoolsOrBuilder(
      int index);

  /**
   * <pre>
   * Continuation token used to page through large result sets. Provide this
   * value in a subsequent ListWorkerPoolsRequest to return the next page of
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Continuation token used to page through large result sets. Provide this
   * value in a subsequent ListWorkerPoolsRequest to return the next page of
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
