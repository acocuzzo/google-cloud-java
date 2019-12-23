/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ServiceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ServiceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An identifier of the service, such as the name of the
   * executable, job, or Google App Engine service name. This field is expected
   * to have a low number of values that are relatively stable over time, as
   * opposed to `version`, which can be changed whenever new code is deployed.
   * Contains the service name for error reports extracted from Google
   * App Engine logs or `default` if the App Engine default service is used.
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * An identifier of the service, such as the name of the
   * executable, job, or Google App Engine service name. This field is expected
   * to have a low number of values that are relatively stable over time, as
   * opposed to `version`, which can be changed whenever new code is deployed.
   * Contains the service name for error reports extracted from Google
   * App Engine logs or `default` if the App Engine default service is used.
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Represents the source code version that the developer provided,
   * which could represent a version label or a Git SHA-1 hash, for example.
   * For App Engine standard environment, the version is set to the version of
   * the app.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Represents the source code version that the developer provided,
   * which could represent a version label or a Git SHA-1 hash, for example.
   * For App Engine standard environment, the version is set to the version of
   * the app.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Type of the MonitoredResource. List of possible values:
   * https://cloud.google.com/monitoring/api/resources
   * Value is set automatically for incoming errors and must not be set when
   * reporting errors.
   * </pre>
   *
   * <code>string resource_type = 4;</code>
   *
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   *
   *
   * <pre>
   * Type of the MonitoredResource. List of possible values:
   * https://cloud.google.com/monitoring/api/resources
   * Value is set automatically for incoming errors and must not be set when
   * reporting errors.
   * </pre>
   *
   * <code>string resource_type = 4;</code>
   *
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString getResourceTypeBytes();
}
