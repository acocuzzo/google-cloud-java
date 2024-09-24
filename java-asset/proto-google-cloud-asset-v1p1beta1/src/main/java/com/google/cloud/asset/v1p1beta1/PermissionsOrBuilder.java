/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/asset/v1p1beta1/assets.proto

package com.google.cloud.asset.v1p1beta1;

public interface PermissionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.Permissions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of permissions. Example permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   *
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String> getPermissionsList();
  /**
   *
   *
   * <pre>
   * A list of permissions. Example permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   *
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   *
   *
   * <pre>
   * A list of permissions. Example permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   *
   *
   * <pre>
   * A list of permissions. Example permission string: "compute.disk.get".
   * </pre>
   *
   * <code>repeated string permissions = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString getPermissionsBytes(int index);
}
