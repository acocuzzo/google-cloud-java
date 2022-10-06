// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface PhraseMatchRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.PhraseMatchRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The phrase to be matched.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. The phrase to be matched.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * Specifies whether the phrase must be missing from the transcript segment or
   * present in the transcript segment.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   * @return The negated.
   */
  boolean getNegated();

  /**
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   * @return The config.
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig getConfig();
  /**
   * <pre>
   * Provides additional information about the rule that specifies how to apply
   * the rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig config = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder getConfigOrBuilder();
}
