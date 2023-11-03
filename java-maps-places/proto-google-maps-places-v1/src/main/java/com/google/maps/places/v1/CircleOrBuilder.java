/*
 * Copyright 2023 Google LLC
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
// source: google/maps/places/v1/geometry.proto

package com.google.maps.places.v1;

public interface CircleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.Circle)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Center latitude and longitude.
   * The range of latitude must be within `[-90.0, 90.0]`. The range of the
   * longitude must be within `[-180.0, 180.0]`.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the center field is set.
   */
  boolean hasCenter();
  /**
   *
   *
   * <pre>
   * Required. Center latitude and longitude.
   * The range of latitude must be within `[-90.0, 90.0]`. The range of the
   * longitude must be within `[-180.0, 180.0]`.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The center.
   */
  com.google.type.LatLng getCenter();
  /**
   *
   *
   * <pre>
   * Required. Center latitude and longitude.
   * The range of latitude must be within `[-90.0, 90.0]`. The range of the
   * longitude must be within `[-180.0, 180.0]`.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.LatLngOrBuilder getCenterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Radius measured in meters. The radius must be within `[0.0,
   * 50000.0]`.
   * </pre>
   *
   * <code>double radius = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The radius.
   */
  double getRadius();
}
