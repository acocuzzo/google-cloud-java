// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

/**
 * <pre>
 * A collection of router appliance instances. If you configure multiple router
 * appliance instances to receive data from the same set of sites outside of
 * Google Cloud, we recommend that you associate those instances with the same
 * spoke.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances}
 */
public final class LinkedRouterApplianceInstances extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
    LinkedRouterApplianceInstancesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LinkedRouterApplianceInstances.newBuilder() to construct.
  private LinkedRouterApplianceInstances(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LinkedRouterApplianceInstances() {
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LinkedRouterApplianceInstances();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto.internal_static_google_cloud_networkconnectivity_v1_LinkedRouterApplianceInstances_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1.HubProto.internal_static_google_cloud_networkconnectivity_v1_LinkedRouterApplianceInstances_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.class, com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.Builder.class);
  }

  public static final int INSTANCES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> instances_;
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  @java.lang.Override
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.RouterApplianceInstance getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
  }

  public static final int SITE_TO_SITE_DATA_TRANSFER_FIELD_NUMBER = 2;
  private boolean siteToSiteDataTransfer_;
  /**
   * <pre>
   * A value that controls whether site-to-site data transfer is enabled for
   * these resources. Data transfer is available only in [supported
   * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
   * </pre>
   *
   * <code>bool site_to_site_data_transfer = 2;</code>
   * @return The siteToSiteDataTransfer.
   */
  @java.lang.Override
  public boolean getSiteToSiteDataTransfer() {
    return siteToSiteDataTransfer_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(1, instances_.get(i));
    }
    if (siteToSiteDataTransfer_ != false) {
      output.writeBool(2, siteToSiteDataTransfer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, instances_.get(i));
    }
    if (siteToSiteDataTransfer_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, siteToSiteDataTransfer_);
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
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances other = (com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances) obj;

    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
    if (getSiteToSiteDataTransfer()
        != other.getSiteToSiteDataTransfer()) return false;
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
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (37 * hash) + SITE_TO_SITE_DATA_TRANSFER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSiteToSiteDataTransfer());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A collection of router appliance instances. If you configure multiple router
   * appliance instances to receive data from the same set of sites outside of
   * Google Cloud, we recommend that you associate those instances with the same
   * spoke.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
      com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstancesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto.internal_static_google_cloud_networkconnectivity_v1_LinkedRouterApplianceInstances_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1.HubProto.internal_static_google_cloud_networkconnectivity_v1_LinkedRouterApplianceInstances_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.class, com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
      } else {
        instances_ = null;
        instancesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      siteToSiteDataTransfer_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1.HubProto.internal_static_google_cloud_networkconnectivity_v1_LinkedRouterApplianceInstances_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances build() {
      com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances buildPartial() {
      com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances result = new com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances(this);
      int from_bitField0_ = bitField0_;
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
      result.siteToSiteDataTransfer_ = siteToSiteDataTransfer_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances other) {
      if (other == com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances.getDefaultInstance()) return this;
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
          }
        }
      }
      if (other.getSiteToSiteDataTransfer() != false) {
        setSiteToSiteDataTransfer(other.getSiteToSiteDataTransfer());
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
            case 10: {
              com.google.cloud.networkconnectivity.v1.RouterApplianceInstance m =
                  input.readMessage(
                      com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.parser(),
                      extensionRegistry);
              if (instancesBuilder_ == null) {
                ensureInstancesIsMutable();
                instances_.add(m);
              } else {
                instancesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              siteToSiteDataTransfer_ = input.readBool();

              break;
            } // case 16
            default: {
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

    private java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instances_ = new java.util.ArrayList<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance>(instances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.networkconnectivity.v1.RouterApplianceInstance, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder, com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder> instancesBuilder_;

    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.RouterApplianceInstance getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder addInstances(com.google.cloud.networkconnectivity.v1.RouterApplianceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder addInstances(
        com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of router appliance instances.
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
     */
    public java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.networkconnectivity.v1.RouterApplianceInstance, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder, com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.networkconnectivity.v1.RouterApplianceInstance, com.google.cloud.networkconnectivity.v1.RouterApplianceInstance.Builder, com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
    }

    private boolean siteToSiteDataTransfer_ ;
    /**
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. Data transfer is available only in [supported
     * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     * @return The siteToSiteDataTransfer.
     */
    @java.lang.Override
    public boolean getSiteToSiteDataTransfer() {
      return siteToSiteDataTransfer_;
    }
    /**
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. Data transfer is available only in [supported
     * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     * @param value The siteToSiteDataTransfer to set.
     * @return This builder for chaining.
     */
    public Builder setSiteToSiteDataTransfer(boolean value) {
      
      siteToSiteDataTransfer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A value that controls whether site-to-site data transfer is enabled for
     * these resources. Data transfer is available only in [supported
     * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
     * </pre>
     *
     * <code>bool site_to_site_data_transfer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSiteToSiteDataTransfer() {
      
      siteToSiteDataTransfer_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
  private static final com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances();
  }

  public static com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkedRouterApplianceInstances>
      PARSER = new com.google.protobuf.AbstractParser<LinkedRouterApplianceInstances>() {
    @java.lang.Override
    public LinkedRouterApplianceInstances parsePartialFrom(
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

  public static com.google.protobuf.Parser<LinkedRouterApplianceInstances> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkedRouterApplianceInstances> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

