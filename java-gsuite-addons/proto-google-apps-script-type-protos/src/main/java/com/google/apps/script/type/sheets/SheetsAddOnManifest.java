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
// source: google/apps/script/type/sheets/sheets_addon_manifest.proto

package com.google.apps.script.type.sheets;

/**
 *
 *
 * <pre>
 * Sheets add-on manifest.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.sheets.SheetsAddOnManifest}
 */
public final class SheetsAddOnManifest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.sheets.SheetsAddOnManifest)
    SheetsAddOnManifestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SheetsAddOnManifest.newBuilder() to construct.
  private SheetsAddOnManifest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SheetsAddOnManifest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SheetsAddOnManifest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SheetsAddOnManifest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 26:
            {
              com.google.apps.script.type.HomepageExtensionPoint.Builder subBuilder = null;
              if (homepageTrigger_ != null) {
                subBuilder = homepageTrigger_.toBuilder();
              }
              homepageTrigger_ =
                  input.readMessage(
                      com.google.apps.script.type.HomepageExtensionPoint.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(homepageTrigger_);
                homepageTrigger_ = subBuilder.buildPartial();
              }

              break;
            }
          case 42:
            {
              com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder subBuilder = null;
              if (onFileScopeGrantedTrigger_ != null) {
                subBuilder = onFileScopeGrantedTrigger_.toBuilder();
              }
              onFileScopeGrantedTrigger_ =
                  input.readMessage(
                      com.google.apps.script.type.sheets.SheetsExtensionPoint.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(onFileScopeGrantedTrigger_);
                onFileScopeGrantedTrigger_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.sheets.SheetsAddOnManifestProto
        .internal_static_google_apps_script_type_sheets_SheetsAddOnManifest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.sheets.SheetsAddOnManifestProto
        .internal_static_google_apps_script_type_sheets_SheetsAddOnManifest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.sheets.SheetsAddOnManifest.class,
            com.google.apps.script.type.sheets.SheetsAddOnManifest.Builder.class);
  }

  public static final int HOMEPAGE_TRIGGER_FIELD_NUMBER = 3;
  private com.google.apps.script.type.HomepageExtensionPoint homepageTrigger_;
  /**
   *
   *
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
   *
   * @return Whether the homepageTrigger field is set.
   */
  @java.lang.Override
  public boolean hasHomepageTrigger() {
    return homepageTrigger_ != null;
  }
  /**
   *
   *
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
   *
   * @return The homepageTrigger.
   */
  @java.lang.Override
  public com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger() {
    return homepageTrigger_ == null
        ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance()
        : homepageTrigger_;
  }
  /**
   *
   *
   * <pre>
   * If present, this overrides the configuration from
   * `addOns.common.homepageTrigger`.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
   */
  @java.lang.Override
  public com.google.apps.script.type.HomepageExtensionPointOrBuilder getHomepageTriggerOrBuilder() {
    return getHomepageTrigger();
  }

  public static final int ON_FILE_SCOPE_GRANTED_TRIGGER_FIELD_NUMBER = 5;
  private com.google.apps.script.type.sheets.SheetsExtensionPoint onFileScopeGrantedTrigger_;
  /**
   *
   *
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
   * </code>
   *
   * @return Whether the onFileScopeGrantedTrigger field is set.
   */
  @java.lang.Override
  public boolean hasOnFileScopeGrantedTrigger() {
    return onFileScopeGrantedTrigger_ != null;
  }
  /**
   *
   *
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
   * </code>
   *
   * @return The onFileScopeGrantedTrigger.
   */
  @java.lang.Override
  public com.google.apps.script.type.sheets.SheetsExtensionPoint getOnFileScopeGrantedTrigger() {
    return onFileScopeGrantedTrigger_ == null
        ? com.google.apps.script.type.sheets.SheetsExtensionPoint.getDefaultInstance()
        : onFileScopeGrantedTrigger_;
  }
  /**
   *
   *
   * <pre>
   * Endpoint to execute when file scope authorization is granted
   * for this document/user pair.
   * </pre>
   *
   * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
   * </code>
   */
  @java.lang.Override
  public com.google.apps.script.type.sheets.SheetsExtensionPointOrBuilder
      getOnFileScopeGrantedTriggerOrBuilder() {
    return getOnFileScopeGrantedTrigger();
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
    if (homepageTrigger_ != null) {
      output.writeMessage(3, getHomepageTrigger());
    }
    if (onFileScopeGrantedTrigger_ != null) {
      output.writeMessage(5, getOnFileScopeGrantedTrigger());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (homepageTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getHomepageTrigger());
    }
    if (onFileScopeGrantedTrigger_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5, getOnFileScopeGrantedTrigger());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.apps.script.type.sheets.SheetsAddOnManifest)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.sheets.SheetsAddOnManifest other =
        (com.google.apps.script.type.sheets.SheetsAddOnManifest) obj;

    if (hasHomepageTrigger() != other.hasHomepageTrigger()) return false;
    if (hasHomepageTrigger()) {
      if (!getHomepageTrigger().equals(other.getHomepageTrigger())) return false;
    }
    if (hasOnFileScopeGrantedTrigger() != other.hasOnFileScopeGrantedTrigger()) return false;
    if (hasOnFileScopeGrantedTrigger()) {
      if (!getOnFileScopeGrantedTrigger().equals(other.getOnFileScopeGrantedTrigger()))
        return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHomepageTrigger()) {
      hash = (37 * hash) + HOMEPAGE_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getHomepageTrigger().hashCode();
    }
    if (hasOnFileScopeGrantedTrigger()) {
      hash = (37 * hash) + ON_FILE_SCOPE_GRANTED_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getOnFileScopeGrantedTrigger().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest parseFrom(
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

  public static Builder newBuilder(
      com.google.apps.script.type.sheets.SheetsAddOnManifest prototype) {
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
   * Sheets add-on manifest.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.sheets.SheetsAddOnManifest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.sheets.SheetsAddOnManifest)
      com.google.apps.script.type.sheets.SheetsAddOnManifestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.sheets.SheetsAddOnManifestProto
          .internal_static_google_apps_script_type_sheets_SheetsAddOnManifest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.sheets.SheetsAddOnManifestProto
          .internal_static_google_apps_script_type_sheets_SheetsAddOnManifest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.sheets.SheetsAddOnManifest.class,
              com.google.apps.script.type.sheets.SheetsAddOnManifest.Builder.class);
    }

    // Construct using com.google.apps.script.type.sheets.SheetsAddOnManifest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = null;
      } else {
        homepageTrigger_ = null;
        homepageTriggerBuilder_ = null;
      }
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTrigger_ = null;
      } else {
        onFileScopeGrantedTrigger_ = null;
        onFileScopeGrantedTriggerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.sheets.SheetsAddOnManifestProto
          .internal_static_google_apps_script_type_sheets_SheetsAddOnManifest_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.sheets.SheetsAddOnManifest getDefaultInstanceForType() {
      return com.google.apps.script.type.sheets.SheetsAddOnManifest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.sheets.SheetsAddOnManifest build() {
      com.google.apps.script.type.sheets.SheetsAddOnManifest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.sheets.SheetsAddOnManifest buildPartial() {
      com.google.apps.script.type.sheets.SheetsAddOnManifest result =
          new com.google.apps.script.type.sheets.SheetsAddOnManifest(this);
      if (homepageTriggerBuilder_ == null) {
        result.homepageTrigger_ = homepageTrigger_;
      } else {
        result.homepageTrigger_ = homepageTriggerBuilder_.build();
      }
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        result.onFileScopeGrantedTrigger_ = onFileScopeGrantedTrigger_;
      } else {
        result.onFileScopeGrantedTrigger_ = onFileScopeGrantedTriggerBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.apps.script.type.sheets.SheetsAddOnManifest) {
        return mergeFrom((com.google.apps.script.type.sheets.SheetsAddOnManifest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.sheets.SheetsAddOnManifest other) {
      if (other == com.google.apps.script.type.sheets.SheetsAddOnManifest.getDefaultInstance())
        return this;
      if (other.hasHomepageTrigger()) {
        mergeHomepageTrigger(other.getHomepageTrigger());
      }
      if (other.hasOnFileScopeGrantedTrigger()) {
        mergeOnFileScopeGrantedTrigger(other.getOnFileScopeGrantedTrigger());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.apps.script.type.sheets.SheetsAddOnManifest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.apps.script.type.sheets.SheetsAddOnManifest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.apps.script.type.HomepageExtensionPoint homepageTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.HomepageExtensionPoint,
            com.google.apps.script.type.HomepageExtensionPoint.Builder,
            com.google.apps.script.type.HomepageExtensionPointOrBuilder>
        homepageTriggerBuilder_;
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     *
     * @return Whether the homepageTrigger field is set.
     */
    public boolean hasHomepageTrigger() {
      return homepageTriggerBuilder_ != null || homepageTrigger_ != null;
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     *
     * @return The homepageTrigger.
     */
    public com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger() {
      if (homepageTriggerBuilder_ == null) {
        return homepageTrigger_ == null
            ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance()
            : homepageTrigger_;
      } else {
        return homepageTriggerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public Builder setHomepageTrigger(com.google.apps.script.type.HomepageExtensionPoint value) {
      if (homepageTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        homepageTrigger_ = value;
        onChanged();
      } else {
        homepageTriggerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public Builder setHomepageTrigger(
        com.google.apps.script.type.HomepageExtensionPoint.Builder builderForValue) {
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = builderForValue.build();
        onChanged();
      } else {
        homepageTriggerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public Builder mergeHomepageTrigger(com.google.apps.script.type.HomepageExtensionPoint value) {
      if (homepageTriggerBuilder_ == null) {
        if (homepageTrigger_ != null) {
          homepageTrigger_ =
              com.google.apps.script.type.HomepageExtensionPoint.newBuilder(homepageTrigger_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          homepageTrigger_ = value;
        }
        onChanged();
      } else {
        homepageTriggerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public Builder clearHomepageTrigger() {
      if (homepageTriggerBuilder_ == null) {
        homepageTrigger_ = null;
        onChanged();
      } else {
        homepageTrigger_ = null;
        homepageTriggerBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public com.google.apps.script.type.HomepageExtensionPoint.Builder getHomepageTriggerBuilder() {

      onChanged();
      return getHomepageTriggerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    public com.google.apps.script.type.HomepageExtensionPointOrBuilder
        getHomepageTriggerOrBuilder() {
      if (homepageTriggerBuilder_ != null) {
        return homepageTriggerBuilder_.getMessageOrBuilder();
      } else {
        return homepageTrigger_ == null
            ? com.google.apps.script.type.HomepageExtensionPoint.getDefaultInstance()
            : homepageTrigger_;
      }
    }
    /**
     *
     *
     * <pre>
     * If present, this overrides the configuration from
     * `addOns.common.homepageTrigger`.
     * </pre>
     *
     * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.HomepageExtensionPoint,
            com.google.apps.script.type.HomepageExtensionPoint.Builder,
            com.google.apps.script.type.HomepageExtensionPointOrBuilder>
        getHomepageTriggerFieldBuilder() {
      if (homepageTriggerBuilder_ == null) {
        homepageTriggerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.script.type.HomepageExtensionPoint,
                com.google.apps.script.type.HomepageExtensionPoint.Builder,
                com.google.apps.script.type.HomepageExtensionPointOrBuilder>(
                getHomepageTrigger(), getParentForChildren(), isClean());
        homepageTrigger_ = null;
      }
      return homepageTriggerBuilder_;
    }

    private com.google.apps.script.type.sheets.SheetsExtensionPoint onFileScopeGrantedTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.sheets.SheetsExtensionPoint,
            com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder,
            com.google.apps.script.type.sheets.SheetsExtensionPointOrBuilder>
        onFileScopeGrantedTriggerBuilder_;
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     *
     * @return Whether the onFileScopeGrantedTrigger field is set.
     */
    public boolean hasOnFileScopeGrantedTrigger() {
      return onFileScopeGrantedTriggerBuilder_ != null || onFileScopeGrantedTrigger_ != null;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     *
     * @return The onFileScopeGrantedTrigger.
     */
    public com.google.apps.script.type.sheets.SheetsExtensionPoint getOnFileScopeGrantedTrigger() {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        return onFileScopeGrantedTrigger_ == null
            ? com.google.apps.script.type.sheets.SheetsExtensionPoint.getDefaultInstance()
            : onFileScopeGrantedTrigger_;
      } else {
        return onFileScopeGrantedTriggerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public Builder setOnFileScopeGrantedTrigger(
        com.google.apps.script.type.sheets.SheetsExtensionPoint value) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        onFileScopeGrantedTrigger_ = value;
        onChanged();
      } else {
        onFileScopeGrantedTriggerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public Builder setOnFileScopeGrantedTrigger(
        com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder builderForValue) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTrigger_ = builderForValue.build();
        onChanged();
      } else {
        onFileScopeGrantedTriggerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public Builder mergeOnFileScopeGrantedTrigger(
        com.google.apps.script.type.sheets.SheetsExtensionPoint value) {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        if (onFileScopeGrantedTrigger_ != null) {
          onFileScopeGrantedTrigger_ =
              com.google.apps.script.type.sheets.SheetsExtensionPoint.newBuilder(
                      onFileScopeGrantedTrigger_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          onFileScopeGrantedTrigger_ = value;
        }
        onChanged();
      } else {
        onFileScopeGrantedTriggerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public Builder clearOnFileScopeGrantedTrigger() {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTrigger_ = null;
        onChanged();
      } else {
        onFileScopeGrantedTrigger_ = null;
        onFileScopeGrantedTriggerBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder
        getOnFileScopeGrantedTriggerBuilder() {

      onChanged();
      return getOnFileScopeGrantedTriggerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    public com.google.apps.script.type.sheets.SheetsExtensionPointOrBuilder
        getOnFileScopeGrantedTriggerOrBuilder() {
      if (onFileScopeGrantedTriggerBuilder_ != null) {
        return onFileScopeGrantedTriggerBuilder_.getMessageOrBuilder();
      } else {
        return onFileScopeGrantedTrigger_ == null
            ? com.google.apps.script.type.sheets.SheetsExtensionPoint.getDefaultInstance()
            : onFileScopeGrantedTrigger_;
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint to execute when file scope authorization is granted
     * for this document/user pair.
     * </pre>
     *
     * <code>.google.apps.script.type.sheets.SheetsExtensionPoint on_file_scope_granted_trigger = 5;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.apps.script.type.sheets.SheetsExtensionPoint,
            com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder,
            com.google.apps.script.type.sheets.SheetsExtensionPointOrBuilder>
        getOnFileScopeGrantedTriggerFieldBuilder() {
      if (onFileScopeGrantedTriggerBuilder_ == null) {
        onFileScopeGrantedTriggerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.apps.script.type.sheets.SheetsExtensionPoint,
                com.google.apps.script.type.sheets.SheetsExtensionPoint.Builder,
                com.google.apps.script.type.sheets.SheetsExtensionPointOrBuilder>(
                getOnFileScopeGrantedTrigger(), getParentForChildren(), isClean());
        onFileScopeGrantedTrigger_ = null;
      }
      return onFileScopeGrantedTriggerBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.sheets.SheetsAddOnManifest)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.sheets.SheetsAddOnManifest)
  private static final com.google.apps.script.type.sheets.SheetsAddOnManifest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.sheets.SheetsAddOnManifest();
  }

  public static com.google.apps.script.type.sheets.SheetsAddOnManifest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SheetsAddOnManifest> PARSER =
      new com.google.protobuf.AbstractParser<SheetsAddOnManifest>() {
        @java.lang.Override
        public SheetsAddOnManifest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SheetsAddOnManifest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SheetsAddOnManifest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SheetsAddOnManifest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.sheets.SheetsAddOnManifest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
