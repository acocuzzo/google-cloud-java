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
// source: google/maps/places/v1/places_service.proto

package com.google.maps.places.v1;

public interface SearchTextResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.SearchTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of places that meet the user's text search criteria.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  java.util.List<com.google.maps.places.v1.Place> getPlacesList();
  /**
   *
   *
   * <pre>
   * A list of places that meet the user's text search criteria.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  com.google.maps.places.v1.Place getPlaces(int index);
  /**
   *
   *
   * <pre>
   * A list of places that meet the user's text search criteria.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  int getPlacesCount();
  /**
   *
   *
   * <pre>
   * A list of places that meet the user's text search criteria.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.PlaceOrBuilder> getPlacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of places that meet the user's text search criteria.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  com.google.maps.places.v1.PlaceOrBuilder getPlacesOrBuilder(int index);
}
