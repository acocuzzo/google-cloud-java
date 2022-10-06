// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Funnel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * In an open funnel, users can enter the funnel in any step, and in a closed
   * funnel, users must enter the funnel in the first step. Optional. If
   * unspecified, a closed funnel is used.
   * </pre>
   *
   * <code>bool is_open_funnel = 1;</code>
   * @return The isOpenFunnel.
   */
  boolean getIsOpenFunnel();

  /**
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.FunnelStep> 
      getStepsList();
  /**
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelStep getSteps(int index);
  /**
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  int getStepsCount();
  /**
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.FunnelStepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <pre>
   * The sequential steps of this funnel.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.FunnelStep steps = 2;</code>
   */
  com.google.analytics.data.v1alpha.FunnelStepOrBuilder getStepsOrBuilder(
      int index);
}
