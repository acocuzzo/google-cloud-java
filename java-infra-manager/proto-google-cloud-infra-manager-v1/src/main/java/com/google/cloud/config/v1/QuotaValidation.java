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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.config.v1;

/**
 *
 *
 * <pre>
 * Enum values to control quota checks for resources in terraform
 * configuration files.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.config.v1.QuotaValidation}
 */
public enum QuotaValidation implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default value.
   * QuotaValidation on terraform configuration files will be disabled in
   * this case.
   * </pre>
   *
   * <code>QUOTA_VALIDATION_UNSPECIFIED = 0;</code>
   */
  QUOTA_VALIDATION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Enable computing quotas for resources in terraform configuration files to
   * get visibility on resources with insufficient quotas.
   * </pre>
   *
   * <code>ENABLED = 1;</code>
   */
  ENABLED(1),
  /**
   *
   *
   * <pre>
   * Enforce quota checks so deployment fails if there isn't sufficient quotas
   * available to deploy resources in terraform configuration files.
   * </pre>
   *
   * <code>ENFORCED = 2;</code>
   */
  ENFORCED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default value.
   * QuotaValidation on terraform configuration files will be disabled in
   * this case.
   * </pre>
   *
   * <code>QUOTA_VALIDATION_UNSPECIFIED = 0;</code>
   */
  public static final int QUOTA_VALIDATION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Enable computing quotas for resources in terraform configuration files to
   * get visibility on resources with insufficient quotas.
   * </pre>
   *
   * <code>ENABLED = 1;</code>
   */
  public static final int ENABLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Enforce quota checks so deployment fails if there isn't sufficient quotas
   * available to deploy resources in terraform configuration files.
   * </pre>
   *
   * <code>ENFORCED = 2;</code>
   */
  public static final int ENFORCED_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static QuotaValidation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QuotaValidation forNumber(int value) {
    switch (value) {
      case 0:
        return QUOTA_VALIDATION_UNSPECIFIED;
      case 1:
        return ENABLED;
      case 2:
        return ENFORCED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QuotaValidation> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<QuotaValidation> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<QuotaValidation>() {
        public QuotaValidation findValueByNumber(int number) {
          return QuotaValidation.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.config.v1.ConfigProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final QuotaValidation[] VALUES = values();

  public static QuotaValidation valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private QuotaValidation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.config.v1.QuotaValidation)
}
