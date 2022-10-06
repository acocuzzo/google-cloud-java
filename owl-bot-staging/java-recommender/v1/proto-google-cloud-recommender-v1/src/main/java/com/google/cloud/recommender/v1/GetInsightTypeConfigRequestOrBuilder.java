// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommender_service.proto

package com.google.cloud.recommender.v1;

public interface GetInsightTypeConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.GetInsightTypeConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the InsightTypeConfig to get.
   * Acceptable formats:
   * * `projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * * `projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * * `organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the InsightTypeConfig to get.
   * Acceptable formats:
   * * `projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * * `projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * * `organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
