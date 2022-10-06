// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/common.proto

package com.google.monitoring.dashboard.v1;

public interface StatisticalTimeSeriesFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
   * @return The enum numeric value on the wire for rankingMethod.
   */
  int getRankingMethodValue();
  /**
   * <pre>
   * `rankingMethod` is applied to a set of time series, and then the produced
   * value for each individual time series is used to compare a given time
   * series to others.
   * These are methods that cannot be applied stream-by-stream, but rather
   * require the full context of a request to evaluate time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method ranking_method = 1;</code>
   * @return The rankingMethod.
   */
  com.google.monitoring.dashboard.v1.StatisticalTimeSeriesFilter.Method getRankingMethod();

  /**
   * <pre>
   * How many time series to output.
   * </pre>
   *
   * <code>int32 num_time_series = 2;</code>
   * @return The numTimeSeries.
   */
  int getNumTimeSeries();
}
