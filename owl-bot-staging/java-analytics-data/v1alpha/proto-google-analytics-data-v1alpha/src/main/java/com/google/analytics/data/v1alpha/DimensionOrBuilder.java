// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface DimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Dimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names.
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like within the allowed character set. For example if a
   * `dimensionExpression` concatenates `country` and `city`, you could call
   * that dimension `countryAndCity`. Dimension names that you choose must match
   * the regular expression `^[a-zA-Z0-9_]$`.
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names.
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like within the allowed character set. For example if a
   * `dimensionExpression` concatenates `country` and `city`, you could call
   * that dimension `countryAndCity`. Dimension names that you choose must match
   * the regular expression `^[a-zA-Z0-9_]$`.
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   * @return Whether the dimensionExpression field is set.
   */
  boolean hasDimensionExpression();
  /**
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   * @return The dimensionExpression.
   */
  com.google.analytics.data.v1alpha.DimensionExpression getDimensionExpression();
  /**
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.DimensionExpression dimension_expression = 2;</code>
   */
  com.google.analytics.data.v1alpha.DimensionExpressionOrBuilder getDimensionExpressionOrBuilder();
}
