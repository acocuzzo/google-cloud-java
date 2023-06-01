/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/scorecard.proto

package com.google.monitoring.dashboard.v1;

public final class ScorecardProto {
  private ScorecardProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/monitoring/dashboard/v1/scoreca"
          + "rd.proto\022\036google.monitoring.dashboard.v1"
          + "\032\037google/api/field_behavior.proto\032,googl"
          + "e/monitoring/dashboard/v1/metrics.proto\032"
          + "\036google/protobuf/duration.proto\"\235\004\n\tScor"
          + "ecard\022P\n\021time_series_query\030\001 \001(\0132/.googl"
          + "e.monitoring.dashboard.v1.TimeSeriesQuer"
          + "yB\004\342A\001\002\022I\n\ngauge_view\030\004 \001(\01323.google.mon"
          + "itoring.dashboard.v1.Scorecard.GaugeView"
          + "H\000\022T\n\020spark_chart_view\030\005 \001(\01328.google.mo"
          + "nitoring.dashboard.v1.Scorecard.SparkCha"
          + "rtViewH\000\022=\n\nthresholds\030\006 \003(\0132).google.mo"
          + "nitoring.dashboard.v1.Threshold\0325\n\tGauge"
          + "View\022\023\n\013lower_bound\030\001 \001(\001\022\023\n\013upper_bound"
          + "\030\002 \001(\001\032\231\001\n\016SparkChartView\022N\n\020spark_chart"
          + "_type\030\001 \001(\0162..google.monitoring.dashboar"
          + "d.v1.SparkChartTypeB\004\342A\001\002\0227\n\024min_alignme"
          + "nt_period\030\002 \001(\0132\031.google.protobuf.Durati"
          + "onB\013\n\tdata_viewB\367\001\n\"com.google.monitorin"
          + "g.dashboard.v1B\016ScorecardProtoP\001ZFcloud."
          + "google.com/go/monitoring/dashboard/apiv1"
          + "/dashboardpb;dashboardpb\252\002$Google.Cloud."
          + "Monitoring.Dashboard.V1\312\002$Google\\Cloud\\M"
          + "onitoring\\Dashboard\\V1\352\002(Google::Cloud::"
          + "Monitoring::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Scorecard_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor,
            new java.lang.String[] {
              "TimeSeriesQuery", "GaugeView", "SparkChartView", "Thresholds", "DataView",
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor =
        internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor,
            new java.lang.String[] {
              "LowerBound", "UpperBound",
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor =
        internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor,
            new java.lang.String[] {
              "SparkChartType", "MinAlignmentPeriod",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
