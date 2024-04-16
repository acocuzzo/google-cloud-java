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
// source: google/api/cloudquotas/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.api.cloudquotas.v1;

public interface QuotaPreferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.QuotaPreference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required except in the CREATE requests.
   * The resource name of the quota preference.
   * The ID component following "locations/" must be "global".
   * Example:
   * `projects/123/locations/global/quotaPreferences/my-config-for-us-east1`
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
   * Required except in the CREATE requests.
   * The resource name of the quota preference.
   * The ID component following "locations/" must be "global".
   * Example:
   * `projects/123/locations/global/quotaPreferences/my-config-for-us-east1`
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
   * Immutable. The dimensions that this quota preference applies to. The key of
   * the map entry is the name of a dimension, such as "region", "zone",
   * "network_id", and the value of the map entry is the dimension value.
   *
   * If a dimension is missing from the map of dimensions, the quota preference
   * applies to all the dimension values except for those that have other quota
   * preferences configured for the specific value.
   *
   * NOTE: QuotaPreferences can only be applied across all values of "user" and
   * "resource" dimension. Do not set values for "user" or "resource" in the
   * dimension map.
   *
   * Example: {"provider", "Foo Inc"} where "provider" is a service specific
   * dimension.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * Immutable. The dimensions that this quota preference applies to. The key of
   * the map entry is the name of a dimension, such as "region", "zone",
   * "network_id", and the value of the map entry is the dimension value.
   *
   * If a dimension is missing from the map of dimensions, the quota preference
   * applies to all the dimension values except for those that have other quota
   * preferences configured for the specific value.
   *
   * NOTE: QuotaPreferences can only be applied across all values of "user" and
   * "resource" dimension. Do not set values for "user" or "resource" in the
   * dimension map.
   *
   * Example: {"provider", "Foo Inc"} where "provider" is a service specific
   * dimension.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  boolean containsDimensions(java.lang.String key);
  /** Use {@link #getDimensionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDimensions();
  /**
   *
   *
   * <pre>
   * Immutable. The dimensions that this quota preference applies to. The key of
   * the map entry is the name of a dimension, such as "region", "zone",
   * "network_id", and the value of the map entry is the dimension value.
   *
   * If a dimension is missing from the map of dimensions, the quota preference
   * applies to all the dimension values except for those that have other quota
   * preferences configured for the specific value.
   *
   * NOTE: QuotaPreferences can only be applied across all values of "user" and
   * "resource" dimension. Do not set values for "user" or "resource" in the
   * dimension map.
   *
   * Example: {"provider", "Foo Inc"} where "provider" is a service specific
   * dimension.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDimensionsMap();
  /**
   *
   *
   * <pre>
   * Immutable. The dimensions that this quota preference applies to. The key of
   * the map entry is the name of a dimension, such as "region", "zone",
   * "network_id", and the value of the map entry is the dimension value.
   *
   * If a dimension is missing from the map of dimensions, the quota preference
   * applies to all the dimension values except for those that have other quota
   * preferences configured for the specific value.
   *
   * NOTE: QuotaPreferences can only be applied across all values of "user" and
   * "resource" dimension. Do not set values for "user" or "resource" in the
   * dimension map.
   *
   * Example: {"provider", "Foo Inc"} where "provider" is a service specific
   * dimension.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  /* nullable */
  java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Immutable. The dimensions that this quota preference applies to. The key of
   * the map entry is the name of a dimension, such as "region", "zone",
   * "network_id", and the value of the map entry is the dimension value.
   *
   * If a dimension is missing from the map of dimensions, the quota preference
   * applies to all the dimension values except for those that have other quota
   * preferences configured for the specific value.
   *
   * NOTE: QuotaPreferences can only be applied across all values of "user" and
   * "resource" dimension. Do not set values for "user" or "resource" in the
   * dimension map.
   *
   * Example: {"provider", "Foo Inc"} where "provider" is a service specific
   * dimension.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 2 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  java.lang.String getDimensionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Preferred quota configuration.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaConfig quota_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the quotaConfig field is set.
   */
  boolean hasQuotaConfig();
  /**
   *
   *
   * <pre>
   * Required. Preferred quota configuration.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaConfig quota_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The quotaConfig.
   */
  com.google.api.cloudquotas.v1.QuotaConfig getQuotaConfig();
  /**
   *
   *
   * <pre>
   * Required. Preferred quota configuration.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaConfig quota_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.api.cloudquotas.v1.QuotaConfigOrBuilder getQuotaConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The current etag of the quota preference. If an etag is provided
   * on update and does not match the current server's etag of the quota
   * preference, the request will be blocked and an ABORTED error will be
   * returned. See https://google.aip.dev/134#etags for more details on etags.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The current etag of the quota preference. If an etag is provided
   * on update and does not match the current server's etag of the quota
   * preference, the request will be blocked and an ABORTED error will be
   * returned. See https://google.aip.dev/134#etags for more details on etags.
   * </pre>
   *
   * <code>string etag = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The name of the service to which the quota preference is applied.
   * </pre>
   *
   * <code>string service = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Required. The name of the service to which the quota preference is applied.
   * </pre>
   *
   * <code>string service = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the quota to which the quota preference is applied. A
   * quota name is unique in the service. Example: `CpusPerProjectPerRegion`
   * </pre>
   *
   * <code>string quota_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The quotaId.
   */
  java.lang.String getQuotaId();
  /**
   *
   *
   * <pre>
   * Required. The id of the quota to which the quota preference is applied. A
   * quota name is unique in the service. Example: `CpusPerProjectPerRegion`
   * </pre>
   *
   * <code>string quota_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for quotaId.
   */
  com.google.protobuf.ByteString getQuotaIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Is the quota preference pending Google Cloud approval and
   * fulfillment.
   * </pre>
   *
   * <code>bool reconciling = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * The reason / justification for this quota preference.
   * </pre>
   *
   * <code>string justification = 11;</code>
   *
   * @return The justification.
   */
  java.lang.String getJustification();
  /**
   *
   *
   * <pre>
   * The reason / justification for this quota preference.
   * </pre>
   *
   * <code>string justification = 11;</code>
   *
   * @return The bytes for justification.
   */
  com.google.protobuf.ByteString getJustificationBytes();

  /**
   *
   *
   * <pre>
   * Input only. An email address that can be used for quota related
   * communication between the Google Cloud and the user in case the Google
   * Cloud needs further information to make a decision on whether the user
   * preferred quota can be granted.
   *
   * The email address is optional for decrease quota preferences. In another
   * word, QuotaConfig.preferred_value is smaller than the
   * QuotaDetails.reset_value. It is required for increase quota preferences.
   * The Google account for the email address must have quota update permission
   * for the project, folder or organization this quota preference is for.
   * </pre>
   *
   * <code>string contact_email = 12 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The contactEmail.
   */
  java.lang.String getContactEmail();
  /**
   *
   *
   * <pre>
   * Input only. An email address that can be used for quota related
   * communication between the Google Cloud and the user in case the Google
   * Cloud needs further information to make a decision on whether the user
   * preferred quota can be granted.
   *
   * The email address is optional for decrease quota preferences. In another
   * word, QuotaConfig.preferred_value is smaller than the
   * QuotaDetails.reset_value. It is required for increase quota preferences.
   * The Google account for the email address must have quota update permission
   * for the project, folder or organization this quota preference is for.
   * </pre>
   *
   * <code>string contact_email = 12 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for contactEmail.
   */
  com.google.protobuf.ByteString getContactEmailBytes();
}
