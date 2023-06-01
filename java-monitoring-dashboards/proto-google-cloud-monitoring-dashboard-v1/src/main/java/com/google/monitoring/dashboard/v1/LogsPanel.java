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
// source: google/monitoring/dashboard/v1/logs_panel.proto

package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * A widget that displays a stream of log.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.LogsPanel}
 */
public final class LogsPanel extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.LogsPanel)
    LogsPanelOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogsPanel.newBuilder() to construct.
  private LogsPanel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogsPanel() {
    filter_ = "";
    resourceNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogsPanel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.dashboard.v1.LogsPanelProto
        .internal_static_google_monitoring_dashboard_v1_LogsPanel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.LogsPanelProto
        .internal_static_google_monitoring_dashboard_v1_LogsPanel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.LogsPanel.class,
            com.google.monitoring.dashboard.v1.LogsPanel.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   *
   *
   * <pre>
   * A filter that chooses which log entries to return.  See [Advanced Logs
   * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter that chooses which log entries to return.  See [Advanced Logs
   * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAMES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList resourceNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @return A list containing the resourceNames.
   */
  public com.google.protobuf.ProtocolStringList getResourceNamesList() {
    return resourceNames_;
  }
  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @return The count of resourceNames.
   */
  public int getResourceNamesCount() {
    return resourceNames_.size();
  }
  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  public java.lang.String getResourceNames(int index) {
    return resourceNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The names of logging resources to collect logs for. Currently only projects
   * are supported. If empty, the widget will default to the host project.
   * </pre>
   *
   * <code>repeated string resource_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
    return resourceNames_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filter_);
    }
    for (int i = 0; i < resourceNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filter_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resourceNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceNamesList().size();
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.LogsPanel)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.LogsPanel other =
        (com.google.monitoring.dashboard.v1.LogsPanel) obj;

    if (!getFilter().equals(other.getFilter())) return false;
    if (!getResourceNamesList().equals(other.getResourceNamesList())) return false;
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
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    if (getResourceNamesCount() > 0) {
      hash = (37 * hash) + RESOURCE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getResourceNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.dashboard.v1.LogsPanel prototype) {
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
   * A widget that displays a stream of log.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.LogsPanel}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.LogsPanel)
      com.google.monitoring.dashboard.v1.LogsPanelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.LogsPanelProto
          .internal_static_google_monitoring_dashboard_v1_LogsPanel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.LogsPanelProto
          .internal_static_google_monitoring_dashboard_v1_LogsPanel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.LogsPanel.class,
              com.google.monitoring.dashboard.v1.LogsPanel.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.LogsPanel.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filter_ = "";
      resourceNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.LogsPanelProto
          .internal_static_google_monitoring_dashboard_v1_LogsPanel_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.LogsPanel getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.LogsPanel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.LogsPanel build() {
      com.google.monitoring.dashboard.v1.LogsPanel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.LogsPanel buildPartial() {
      com.google.monitoring.dashboard.v1.LogsPanel result =
          new com.google.monitoring.dashboard.v1.LogsPanel(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.LogsPanel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filter_ = filter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        resourceNames_.makeImmutable();
        result.resourceNames_ = resourceNames_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.LogsPanel) {
        return mergeFrom((com.google.monitoring.dashboard.v1.LogsPanel) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.LogsPanel other) {
      if (other == com.google.monitoring.dashboard.v1.LogsPanel.getDefaultInstance()) return this;
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.resourceNames_.isEmpty()) {
        if (resourceNames_.isEmpty()) {
          resourceNames_ = other.resourceNames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureResourceNamesIsMutable();
          resourceNames_.addAll(other.resourceNames_);
        }
        onChanged();
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
            case 10:
              {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureResourceNamesIsMutable();
                resourceNames_.add(s);
                break;
              } // case 18
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

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * A filter that chooses which log entries to return.  See [Advanced Logs
     * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
     * Only log entries that match the filter are returned.  An empty filter
     * matches all log entries.
     * </pre>
     *
     * <code>string filter = 1;</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter that chooses which log entries to return.  See [Advanced Logs
     * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
     * Only log entries that match the filter are returned.  An empty filter
     * matches all log entries.
     * </pre>
     *
     * <code>string filter = 1;</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter that chooses which log entries to return.  See [Advanced Logs
     * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
     * Only log entries that match the filter are returned.  An empty filter
     * matches all log entries.
     * </pre>
     *
     * <code>string filter = 1;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter that chooses which log entries to return.  See [Advanced Logs
     * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
     * Only log entries that match the filter are returned.  An empty filter
     * matches all log entries.
     * </pre>
     *
     * <code>string filter = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter that chooses which log entries to return.  See [Advanced Logs
     * Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
     * Only log entries that match the filter are returned.  An empty filter
     * matches all log entries.
     * </pre>
     *
     * <code>string filter = 1;</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList resourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureResourceNamesIsMutable() {
      if (!resourceNames_.isModifiable()) {
        resourceNames_ = new com.google.protobuf.LazyStringArrayList(resourceNames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @return A list containing the resourceNames.
     */
    public com.google.protobuf.ProtocolStringList getResourceNamesList() {
      resourceNames_.makeImmutable();
      return resourceNames_;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @return The count of resourceNames.
     */
    public int getResourceNamesCount() {
      return resourceNames_.size();
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The resourceNames at the given index.
     */
    public java.lang.String getResourceNames(int index) {
      return resourceNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the resourceNames at the given index.
     */
    public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
      return resourceNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The resourceNames to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceNamesIsMutable();
      resourceNames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param value The resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addResourceNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceNamesIsMutable();
      resourceNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param values The resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceNames(java.lang.Iterable<java.lang.String> values) {
      ensureResourceNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceNames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceNames() {
      resourceNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of logging resources to collect logs for. Currently only projects
     * are supported. If empty, the widget will default to the host project.
     * </pre>
     *
     * <code>repeated string resource_names = 2;</code>
     *
     * @param value The bytes of the resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addResourceNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureResourceNamesIsMutable();
      resourceNames_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.LogsPanel)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.LogsPanel)
  private static final com.google.monitoring.dashboard.v1.LogsPanel DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.LogsPanel();
  }

  public static com.google.monitoring.dashboard.v1.LogsPanel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogsPanel> PARSER =
      new com.google.protobuf.AbstractParser<LogsPanel>() {
        @java.lang.Override
        public LogsPanel parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogsPanel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogsPanel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.LogsPanel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
