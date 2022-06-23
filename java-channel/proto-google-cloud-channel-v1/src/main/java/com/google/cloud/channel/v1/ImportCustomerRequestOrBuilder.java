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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ImportCustomerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ImportCustomerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Customer domain.
   * </pre>
   *
   * <code>string domain = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   *
   *
   * <pre>
   * Required. Customer domain.
   * </pre>
   *
   * <code>string domain = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Required. Customer domain.
   * </pre>
   *
   * <code>string domain = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * Required. Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the cloudIdentityId field is set.
   */
  boolean hasCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Required. Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cloudIdentityId.
   */
  java.lang.String getCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Required. Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cloudIdentityId.
   */
  com.google.protobuf.ByteString getCloudIdentityIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller's account.
   * Parent takes the format: accounts/{account_id} or
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller's account.
   * Parent takes the format: accounts/{account_id} or
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The super admin of the resold customer generates this token to
   * authorize a reseller to access their Cloud Identity and purchase
   * entitlements on their behalf. You can omit this token after authorization.
   * See https://support.google.com/a/answer/7643790 for more details.
   * </pre>
   *
   * <code>string auth_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The authToken.
   */
  java.lang.String getAuthToken();
  /**
   *
   *
   * <pre>
   * Optional. The super admin of the resold customer generates this token to
   * authorize a reseller to access their Cloud Identity and purchase
   * entitlements on their behalf. You can omit this token after authorization.
   * See https://support.google.com/a/answer/7643790 for more details.
   * </pre>
   *
   * <code>string auth_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for authToken.
   */
  com.google.protobuf.ByteString getAuthTokenBytes();

  /**
   *
   *
   * <pre>
   * Required. Choose to overwrite an existing customer if found.
   * This must be set to true if there is an existing customer with a
   * conflicting region code or domain.
   * </pre>
   *
   * <code>bool overwrite_if_exists = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The overwriteIfExists.
   */
  boolean getOverwriteIfExists();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Identity ID of a channel partner who will be the direct reseller for
   * the customer's order. This field is required for 2-tier transfer scenarios
   * and can be provided via the request Parent binding as well.
   * </pre>
   *
   * <code>string channel_partner_id = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The channelPartnerId.
   */
  java.lang.String getChannelPartnerId();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Identity ID of a channel partner who will be the direct reseller for
   * the customer's order. This field is required for 2-tier transfer scenarios
   * and can be provided via the request Parent binding as well.
   * </pre>
   *
   * <code>string channel_partner_id = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for channelPartnerId.
   */
  com.google.protobuf.ByteString getChannelPartnerIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the customer that will receive imported Cloud Identity
   * information.
   * Format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>
   * string customer = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the customer that will receive imported Cloud Identity
   * information.
   * Format: accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>
   * string customer = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString getCustomerBytes();

  public com.google.cloud.channel.v1.ImportCustomerRequest.CustomerIdentityCase
      getCustomerIdentityCase();
}
