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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.2
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Settings specific to keys that can be used for WAF (Web Application
 * Firewall).
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.WafSettings}
 */
public final class WafSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.WafSettings)
    WafSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WafSettings.newBuilder() to construct.
  private WafSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WafSettings() {
    wafService_ = 0;
    wafFeature_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WafSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_WafSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_WafSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.WafSettings.class,
            com.google.recaptchaenterprise.v1.WafSettings.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Supported WAF features. For more information, see
   * https://cloud.google.com/recaptcha-enterprise/docs/usecase#comparison_of_features.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature}
   */
  public enum WafFeature implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Undefined feature.
     * </pre>
     *
     * <code>WAF_FEATURE_UNSPECIFIED = 0;</code>
     */
    WAF_FEATURE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Redirects suspicious traffic to reCAPTCHA.
     * </pre>
     *
     * <code>CHALLENGE_PAGE = 1;</code>
     */
    CHALLENGE_PAGE(1),
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA session-tokens to protect the whole user session on the
     * site's domain.
     * </pre>
     *
     * <code>SESSION_TOKEN = 2;</code>
     */
    SESSION_TOKEN(2),
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA action-tokens to protect user actions.
     * </pre>
     *
     * <code>ACTION_TOKEN = 3;</code>
     */
    ACTION_TOKEN(3),
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA WAF express protection to protect any content other than
     * web pages, like APIs and IoT devices.
     * </pre>
     *
     * <code>EXPRESS = 5;</code>
     */
    EXPRESS(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Undefined feature.
     * </pre>
     *
     * <code>WAF_FEATURE_UNSPECIFIED = 0;</code>
     */
    public static final int WAF_FEATURE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Redirects suspicious traffic to reCAPTCHA.
     * </pre>
     *
     * <code>CHALLENGE_PAGE = 1;</code>
     */
    public static final int CHALLENGE_PAGE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA session-tokens to protect the whole user session on the
     * site's domain.
     * </pre>
     *
     * <code>SESSION_TOKEN = 2;</code>
     */
    public static final int SESSION_TOKEN_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA action-tokens to protect user actions.
     * </pre>
     *
     * <code>ACTION_TOKEN = 3;</code>
     */
    public static final int ACTION_TOKEN_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Use reCAPTCHA WAF express protection to protect any content other than
     * web pages, like APIs and IoT devices.
     * </pre>
     *
     * <code>EXPRESS = 5;</code>
     */
    public static final int EXPRESS_VALUE = 5;

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
    public static WafFeature valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WafFeature forNumber(int value) {
      switch (value) {
        case 0:
          return WAF_FEATURE_UNSPECIFIED;
        case 1:
          return CHALLENGE_PAGE;
        case 2:
          return SESSION_TOKEN;
        case 3:
          return ACTION_TOKEN;
        case 5:
          return EXPRESS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WafFeature> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<WafFeature> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WafFeature>() {
          public WafFeature findValueByNumber(int number) {
            return WafFeature.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.WafSettings.getDescriptor().getEnumTypes().get(0);
    }

    private static final WafFeature[] VALUES = values();

    public static WafFeature valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WafFeature(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature)
  }

  /**
   *
   *
   * <pre>
   * Web Application Firewalls supported by reCAPTCHA Enterprise.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recaptchaenterprise.v1.WafSettings.WafService}
   */
  public enum WafService implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Undefined WAF
     * </pre>
     *
     * <code>WAF_SERVICE_UNSPECIFIED = 0;</code>
     */
    WAF_SERVICE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Cloud Armor
     * </pre>
     *
     * <code>CA = 1;</code>
     */
    CA(1),
    /**
     *
     *
     * <pre>
     * Fastly
     * </pre>
     *
     * <code>FASTLY = 3;</code>
     */
    FASTLY(3),
    /**
     *
     *
     * <pre>
     * Cloudflare
     * </pre>
     *
     * <code>CLOUDFLARE = 4;</code>
     */
    CLOUDFLARE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Undefined WAF
     * </pre>
     *
     * <code>WAF_SERVICE_UNSPECIFIED = 0;</code>
     */
    public static final int WAF_SERVICE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Cloud Armor
     * </pre>
     *
     * <code>CA = 1;</code>
     */
    public static final int CA_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Fastly
     * </pre>
     *
     * <code>FASTLY = 3;</code>
     */
    public static final int FASTLY_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Cloudflare
     * </pre>
     *
     * <code>CLOUDFLARE = 4;</code>
     */
    public static final int CLOUDFLARE_VALUE = 4;

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
    public static WafService valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WafService forNumber(int value) {
      switch (value) {
        case 0:
          return WAF_SERVICE_UNSPECIFIED;
        case 1:
          return CA;
        case 3:
          return FASTLY;
        case 4:
          return CLOUDFLARE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WafService> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<WafService> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WafService>() {
          public WafService findValueByNumber(int number) {
            return WafService.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.WafSettings.getDescriptor().getEnumTypes().get(1);
    }

    private static final WafService[] VALUES = values();

    public static WafService valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WafService(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.WafSettings.WafService)
  }

  public static final int WAF_SERVICE_FIELD_NUMBER = 1;
  private int wafService_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The WAF service that uses this key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for wafService.
   */
  @java.lang.Override
  public int getWafServiceValue() {
    return wafService_;
  }
  /**
   *
   *
   * <pre>
   * Required. The WAF service that uses this key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The wafService.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.WafSettings.WafService getWafService() {
    com.google.recaptchaenterprise.v1.WafSettings.WafService result =
        com.google.recaptchaenterprise.v1.WafSettings.WafService.forNumber(wafService_);
    return result == null
        ? com.google.recaptchaenterprise.v1.WafSettings.WafService.UNRECOGNIZED
        : result;
  }

  public static final int WAF_FEATURE_FIELD_NUMBER = 2;
  private int wafFeature_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The WAF feature for which this key is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for wafFeature.
   */
  @java.lang.Override
  public int getWafFeatureValue() {
    return wafFeature_;
  }
  /**
   *
   *
   * <pre>
   * Required. The WAF feature for which this key is enabled.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The wafFeature.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.WafSettings.WafFeature getWafFeature() {
    com.google.recaptchaenterprise.v1.WafSettings.WafFeature result =
        com.google.recaptchaenterprise.v1.WafSettings.WafFeature.forNumber(wafFeature_);
    return result == null
        ? com.google.recaptchaenterprise.v1.WafSettings.WafFeature.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (wafService_
        != com.google.recaptchaenterprise.v1.WafSettings.WafService.WAF_SERVICE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, wafService_);
    }
    if (wafFeature_
        != com.google.recaptchaenterprise.v1.WafSettings.WafFeature.WAF_FEATURE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, wafFeature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (wafService_
        != com.google.recaptchaenterprise.v1.WafSettings.WafService.WAF_SERVICE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, wafService_);
    }
    if (wafFeature_
        != com.google.recaptchaenterprise.v1.WafSettings.WafFeature.WAF_FEATURE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, wafFeature_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.recaptchaenterprise.v1.WafSettings)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.WafSettings other =
        (com.google.recaptchaenterprise.v1.WafSettings) obj;

    if (wafService_ != other.wafService_) return false;
    if (wafFeature_ != other.wafFeature_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WAF_SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + wafService_;
    hash = (37 * hash) + WAF_FEATURE_FIELD_NUMBER;
    hash = (53 * hash) + wafFeature_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.WafSettings parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.WafSettings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Settings specific to keys that can be used for WAF (Web Application
   * Firewall).
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.WafSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.WafSettings)
      com.google.recaptchaenterprise.v1.WafSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_WafSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_WafSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.WafSettings.class,
              com.google.recaptchaenterprise.v1.WafSettings.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.WafSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      wafService_ = 0;
      wafFeature_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_WafSettings_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.WafSettings getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.WafSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.WafSettings build() {
      com.google.recaptchaenterprise.v1.WafSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.WafSettings buildPartial() {
      com.google.recaptchaenterprise.v1.WafSettings result =
          new com.google.recaptchaenterprise.v1.WafSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.WafSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wafService_ = wafService_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.wafFeature_ = wafFeature_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.recaptchaenterprise.v1.WafSettings) {
        return mergeFrom((com.google.recaptchaenterprise.v1.WafSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.WafSettings other) {
      if (other == com.google.recaptchaenterprise.v1.WafSettings.getDefaultInstance()) return this;
      if (other.wafService_ != 0) {
        setWafServiceValue(other.getWafServiceValue());
      }
      if (other.wafFeature_ != 0) {
        setWafFeatureValue(other.getWafFeatureValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                wafService_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                wafFeature_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int wafService_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The WAF service that uses this key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for wafService.
     */
    @java.lang.Override
    public int getWafServiceValue() {
      return wafService_;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF service that uses this key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for wafService to set.
     * @return This builder for chaining.
     */
    public Builder setWafServiceValue(int value) {
      wafService_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF service that uses this key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The wafService.
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.WafSettings.WafService getWafService() {
      com.google.recaptchaenterprise.v1.WafSettings.WafService result =
          com.google.recaptchaenterprise.v1.WafSettings.WafService.forNumber(wafService_);
      return result == null
          ? com.google.recaptchaenterprise.v1.WafSettings.WafService.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF service that uses this key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The wafService to set.
     * @return This builder for chaining.
     */
    public Builder setWafService(com.google.recaptchaenterprise.v1.WafSettings.WafService value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      wafService_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF service that uses this key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafService waf_service = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWafService() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wafService_ = 0;
      onChanged();
      return this;
    }

    private int wafFeature_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The WAF feature for which this key is enabled.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for wafFeature.
     */
    @java.lang.Override
    public int getWafFeatureValue() {
      return wafFeature_;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF feature for which this key is enabled.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for wafFeature to set.
     * @return This builder for chaining.
     */
    public Builder setWafFeatureValue(int value) {
      wafFeature_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF feature for which this key is enabled.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The wafFeature.
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.WafSettings.WafFeature getWafFeature() {
      com.google.recaptchaenterprise.v1.WafSettings.WafFeature result =
          com.google.recaptchaenterprise.v1.WafSettings.WafFeature.forNumber(wafFeature_);
      return result == null
          ? com.google.recaptchaenterprise.v1.WafSettings.WafFeature.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF feature for which this key is enabled.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The wafFeature to set.
     * @return This builder for chaining.
     */
    public Builder setWafFeature(com.google.recaptchaenterprise.v1.WafSettings.WafFeature value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      wafFeature_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The WAF feature for which this key is enabled.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.WafSettings.WafFeature waf_feature = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWafFeature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      wafFeature_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.WafSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.WafSettings)
  private static final com.google.recaptchaenterprise.v1.WafSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.WafSettings();
  }

  public static com.google.recaptchaenterprise.v1.WafSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WafSettings> PARSER =
      new com.google.protobuf.AbstractParser<WafSettings>() {
        @java.lang.Override
        public WafSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<WafSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WafSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.WafSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
