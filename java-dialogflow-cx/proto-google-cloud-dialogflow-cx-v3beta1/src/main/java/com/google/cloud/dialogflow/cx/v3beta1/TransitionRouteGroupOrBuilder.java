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
// source: google/cloud/dialogflow/cx/v3beta1/transition_route_group.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface TransitionRouteGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the transition route group.
   * [TransitionRouteGroups.CreateTransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroups.CreateTransitionRouteGroup] populates the name
   * automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;Transition Route Group ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the transition route group.
   * [TransitionRouteGroups.CreateTransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroups.CreateTransitionRouteGroup] populates the name
   * automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;Transition Route Group ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the transition route group, unique within
   * the flow. The display name can be no longer than 30 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the transition route group, unique within
   * the flow. The display name can be no longer than 30 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Transition routes associated with the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 5;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute> getTransitionRoutesList();
  /**
   *
   *
   * <pre>
   * Transition routes associated with the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 5;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute getTransitionRoutes(int index);
  /**
   *
   *
   * <pre>
   * Transition routes associated with the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 5;
   * </code>
   */
  int getTransitionRoutesCount();
  /**
   *
   *
   * <pre>
   * Transition routes associated with the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder>
      getTransitionRoutesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Transition routes associated with the [TransitionRouteGroup][google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 5;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder getTransitionRoutesOrBuilder(
      int index);
}
