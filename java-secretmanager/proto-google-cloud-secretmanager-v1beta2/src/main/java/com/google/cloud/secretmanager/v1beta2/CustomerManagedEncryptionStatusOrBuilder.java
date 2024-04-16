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
// source: google/cloud/secretmanager/v1beta2/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.secretmanager.v1beta2;

public interface CustomerManagedEncryptionStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1beta2.CustomerManagedEncryptionStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Cloud KMS CryptoKeyVersion used to
   * encrypt the secret payload, in the following format:
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The kmsKeyVersionName.
   */
  java.lang.String getKmsKeyVersionName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Cloud KMS CryptoKeyVersion used to
   * encrypt the secret payload, in the following format:
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string kms_key_version_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for kmsKeyVersionName.
   */
  com.google.protobuf.ByteString getKmsKeyVersionNameBytes();
}
