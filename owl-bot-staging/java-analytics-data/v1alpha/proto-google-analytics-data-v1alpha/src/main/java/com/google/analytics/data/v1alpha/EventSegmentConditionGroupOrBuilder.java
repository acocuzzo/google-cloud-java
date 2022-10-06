// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface EventSegmentConditionGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.EventSegmentConditionGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   * @return The enum numeric value on the wire for conditionScoping.
   */
  int getConditionScopingValue();
  /**
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   * @return The conditionScoping.
   */
  com.google.analytics.data.v1alpha.EventCriteriaScoping getConditionScoping();

  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   * @return Whether the segmentFilterExpression field is set.
   */
  boolean hasSegmentFilterExpression();
  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   * @return The segmentFilterExpression.
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression();
  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder getSegmentFilterExpressionOrBuilder();
}
