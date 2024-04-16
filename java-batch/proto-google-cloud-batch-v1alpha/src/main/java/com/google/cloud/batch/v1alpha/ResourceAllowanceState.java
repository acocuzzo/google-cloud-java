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
// source: google/cloud/batch/v1alpha/resource_allowance.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1alpha;

/**
 *
 *
 * <pre>
 * ResourceAllowance valid state.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.batch.v1alpha.ResourceAllowanceState}
 */
public enum ResourceAllowanceState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_STATE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_ALLOWANCE_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * ResourceAllowance is active and in use.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_ACTIVE = 1;</code>
   */
  RESOURCE_ALLOWANCE_ACTIVE(1),
  /**
   *
   *
   * <pre>
   * ResourceAllowance limit is reached.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_DEPLETED = 2;</code>
   */
  RESOURCE_ALLOWANCE_DEPLETED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_ALLOWANCE_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * ResourceAllowance is active and in use.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_ACTIVE = 1;</code>
   */
  public static final int RESOURCE_ALLOWANCE_ACTIVE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * ResourceAllowance limit is reached.
   * </pre>
   *
   * <code>RESOURCE_ALLOWANCE_DEPLETED = 2;</code>
   */
  public static final int RESOURCE_ALLOWANCE_DEPLETED_VALUE = 2;

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
  public static ResourceAllowanceState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceAllowanceState forNumber(int value) {
    switch (value) {
      case 0:
        return RESOURCE_ALLOWANCE_STATE_UNSPECIFIED;
      case 1:
        return RESOURCE_ALLOWANCE_ACTIVE;
      case 2:
        return RESOURCE_ALLOWANCE_DEPLETED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceAllowanceState>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResourceAllowanceState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceAllowanceState>() {
            public ResourceAllowanceState findValueByNumber(int number) {
              return ResourceAllowanceState.forNumber(number);
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
    return com.google.cloud.batch.v1alpha.ResourceAllowanceProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final ResourceAllowanceState[] VALUES = values();

  public static ResourceAllowanceState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceAllowanceState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.batch.v1alpha.ResourceAllowanceState)
}
