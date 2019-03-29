// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * Specifies workflow execution target.
 * Either `managed_cluster` or `cluster_selector` is required.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement}
 */
public final class WorkflowTemplatePlacement extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)
    WorkflowTemplatePlacementOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkflowTemplatePlacement.newBuilder() to construct.
  private WorkflowTemplatePlacement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkflowTemplatePlacement() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WorkflowTemplatePlacement(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder subBuilder = null;
              if (placementCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_).toBuilder();
              }
              placement_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1beta2.ManagedCluster.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_);
                placement_ = subBuilder.buildPartial();
              }
              placementCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder subBuilder = null;
              if (placementCase_ == 2) {
                subBuilder =
                    ((com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_).toBuilder();
              }
              placement_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1beta2.ClusterSelector.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_);
                placement_ = subBuilder.buildPartial();
              }
              placementCase_ = 2;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1beta2_WorkflowTemplatePlacement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1beta2_WorkflowTemplatePlacement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.class,
            com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.Builder.class);
  }

  private int placementCase_ = 0;
  private java.lang.Object placement_;

  public enum PlacementCase implements com.google.protobuf.Internal.EnumLite {
    MANAGED_CLUSTER(1),
    CLUSTER_SELECTOR(2),
    PLACEMENT_NOT_SET(0);
    private final int value;

    private PlacementCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static PlacementCase valueOf(int value) {
      return forNumber(value);
    }

    public static PlacementCase forNumber(int value) {
      switch (value) {
        case 1:
          return MANAGED_CLUSTER;
        case 2:
          return CLUSTER_SELECTOR;
        case 0:
          return PLACEMENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public PlacementCase getPlacementCase() {
    return PlacementCase.forNumber(placementCase_);
  }

  public static final int MANAGED_CLUSTER_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  public boolean hasManagedCluster() {
    return placementCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ManagedCluster getManagedCluster() {
    if (placementCase_ == 1) {
      return (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_;
    }
    return com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder getManagedClusterOrBuilder() {
    if (placementCase_ == 1) {
      return (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_;
    }
    return com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
  }

  public static final int CLUSTER_SELECTOR_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  public boolean hasClusterSelector() {
    return placementCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ClusterSelector getClusterSelector() {
    if (placementCase_ == 2) {
      return (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_;
    }
    return com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  public com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder getClusterSelectorOrBuilder() {
    if (placementCase_ == 2) {
      return (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_;
    }
    return com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
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
    if (placementCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_);
    }
    if (placementCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (placementCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_);
    }
    if (placementCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement other =
        (com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement) obj;

    if (!getPlacementCase().equals(other.getPlacementCase())) return false;
    switch (placementCase_) {
      case 1:
        if (!getManagedCluster().equals(other.getManagedCluster())) return false;
        break;
      case 2:
        if (!getClusterSelector().equals(other.getClusterSelector())) return false;
        break;
      case 0:
      default:
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
    switch (placementCase_) {
      case 1:
        hash = (37 * hash) + MANAGED_CLUSTER_FIELD_NUMBER;
        hash = (53 * hash) + getManagedCluster().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CLUSTER_SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getClusterSelector().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parseFrom(
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
      com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement prototype) {
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
   * Specifies workflow execution target.
   * Either `managed_cluster` or `cluster_selector` is required.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)
      com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowTemplatePlacement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowTemplatePlacement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.class,
              com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.newBuilder()
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
      placementCase_ = 0;
      placement_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1beta2_WorkflowTemplatePlacement_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement build() {
      com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement buildPartial() {
      com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement result =
          new com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement(this);
      if (placementCase_ == 1) {
        if (managedClusterBuilder_ == null) {
          result.placement_ = placement_;
        } else {
          result.placement_ = managedClusterBuilder_.build();
        }
      }
      if (placementCase_ == 2) {
        if (clusterSelectorBuilder_ == null) {
          result.placement_ = placement_;
        } else {
          result.placement_ = clusterSelectorBuilder_.build();
        }
      }
      result.placementCase_ = placementCase_;
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement other) {
      if (other == com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.getDefaultInstance())
        return this;
      switch (other.getPlacementCase()) {
        case MANAGED_CLUSTER:
          {
            mergeManagedCluster(other.getManagedCluster());
            break;
          }
        case CLUSTER_SELECTOR:
          {
            mergeClusterSelector(other.getClusterSelector());
            break;
          }
        case PLACEMENT_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int placementCase_ = 0;
    private java.lang.Object placement_;

    public PlacementCase getPlacementCase() {
      return PlacementCase.forNumber(placementCase_);
    }

    public Builder clearPlacement() {
      placementCase_ = 0;
      placement_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.ManagedCluster,
            com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder,
            com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder>
        managedClusterBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public boolean hasManagedCluster() {
      return placementCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ManagedCluster getManagedCluster() {
      if (managedClusterBuilder_ == null) {
        if (placementCase_ == 1) {
          return (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_;
        }
        return com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
      } else {
        if (placementCase_ == 1) {
          return managedClusterBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public Builder setManagedCluster(com.google.cloud.dataproc.v1beta2.ManagedCluster value) {
      if (managedClusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        placement_ = value;
        onChanged();
      } else {
        managedClusterBuilder_.setMessage(value);
      }
      placementCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public Builder setManagedCluster(
        com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder builderForValue) {
      if (managedClusterBuilder_ == null) {
        placement_ = builderForValue.build();
        onChanged();
      } else {
        managedClusterBuilder_.setMessage(builderForValue.build());
      }
      placementCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public Builder mergeManagedCluster(com.google.cloud.dataproc.v1beta2.ManagedCluster value) {
      if (managedClusterBuilder_ == null) {
        if (placementCase_ == 1
            && placement_
                != com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance()) {
          placement_ =
              com.google.cloud.dataproc.v1beta2.ManagedCluster.newBuilder(
                      (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          placement_ = value;
        }
        onChanged();
      } else {
        if (placementCase_ == 1) {
          managedClusterBuilder_.mergeFrom(value);
        }
        managedClusterBuilder_.setMessage(value);
      }
      placementCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public Builder clearManagedCluster() {
      if (managedClusterBuilder_ == null) {
        if (placementCase_ == 1) {
          placementCase_ = 0;
          placement_ = null;
          onChanged();
        }
      } else {
        if (placementCase_ == 1) {
          placementCase_ = 0;
          placement_ = null;
        }
        managedClusterBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder getManagedClusterBuilder() {
      return getManagedClusterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder getManagedClusterOrBuilder() {
      if ((placementCase_ == 1) && (managedClusterBuilder_ != null)) {
        return managedClusterBuilder_.getMessageOrBuilder();
      } else {
        if (placementCase_ == 1) {
          return (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_;
        }
        return com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A cluster that is managed by the workflow.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.ManagedCluster,
            com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder,
            com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder>
        getManagedClusterFieldBuilder() {
      if (managedClusterBuilder_ == null) {
        if (!(placementCase_ == 1)) {
          placement_ = com.google.cloud.dataproc.v1beta2.ManagedCluster.getDefaultInstance();
        }
        managedClusterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1beta2.ManagedCluster,
                com.google.cloud.dataproc.v1beta2.ManagedCluster.Builder,
                com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder>(
                (com.google.cloud.dataproc.v1beta2.ManagedCluster) placement_,
                getParentForChildren(),
                isClean());
        placement_ = null;
      }
      placementCase_ = 1;
      onChanged();
      ;
      return managedClusterBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.ClusterSelector,
            com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder,
            com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder>
        clusterSelectorBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public boolean hasClusterSelector() {
      return placementCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ClusterSelector getClusterSelector() {
      if (clusterSelectorBuilder_ == null) {
        if (placementCase_ == 2) {
          return (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_;
        }
        return com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
      } else {
        if (placementCase_ == 2) {
          return clusterSelectorBuilder_.getMessage();
        }
        return com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public Builder setClusterSelector(com.google.cloud.dataproc.v1beta2.ClusterSelector value) {
      if (clusterSelectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        placement_ = value;
        onChanged();
      } else {
        clusterSelectorBuilder_.setMessage(value);
      }
      placementCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public Builder setClusterSelector(
        com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder builderForValue) {
      if (clusterSelectorBuilder_ == null) {
        placement_ = builderForValue.build();
        onChanged();
      } else {
        clusterSelectorBuilder_.setMessage(builderForValue.build());
      }
      placementCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public Builder mergeClusterSelector(com.google.cloud.dataproc.v1beta2.ClusterSelector value) {
      if (clusterSelectorBuilder_ == null) {
        if (placementCase_ == 2
            && placement_
                != com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance()) {
          placement_ =
              com.google.cloud.dataproc.v1beta2.ClusterSelector.newBuilder(
                      (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          placement_ = value;
        }
        onChanged();
      } else {
        if (placementCase_ == 2) {
          clusterSelectorBuilder_.mergeFrom(value);
        }
        clusterSelectorBuilder_.setMessage(value);
      }
      placementCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public Builder clearClusterSelector() {
      if (clusterSelectorBuilder_ == null) {
        if (placementCase_ == 2) {
          placementCase_ = 0;
          placement_ = null;
          onChanged();
        }
      } else {
        if (placementCase_ == 2) {
          placementCase_ = 0;
          placement_ = null;
        }
        clusterSelectorBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder getClusterSelectorBuilder() {
      return getClusterSelectorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    public com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder
        getClusterSelectorOrBuilder() {
      if ((placementCase_ == 2) && (clusterSelectorBuilder_ != null)) {
        return clusterSelectorBuilder_.getMessageOrBuilder();
      } else {
        if (placementCase_ == 2) {
          return (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_;
        }
        return com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A selector that chooses target cluster for jobs based
     * on metadata.
     * The selector is evaluated at the time each job is submitted.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.ClusterSelector,
            com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder,
            com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder>
        getClusterSelectorFieldBuilder() {
      if (clusterSelectorBuilder_ == null) {
        if (!(placementCase_ == 2)) {
          placement_ = com.google.cloud.dataproc.v1beta2.ClusterSelector.getDefaultInstance();
        }
        clusterSelectorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1beta2.ClusterSelector,
                com.google.cloud.dataproc.v1beta2.ClusterSelector.Builder,
                com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder>(
                (com.google.cloud.dataproc.v1beta2.ClusterSelector) placement_,
                getParentForChildren(),
                isClean());
        placement_ = null;
      }
      placementCase_ = 2;
      onChanged();
      ;
      return clusterSelectorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)
  private static final com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement();
  }

  public static com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowTemplatePlacement> PARSER =
      new com.google.protobuf.AbstractParser<WorkflowTemplatePlacement>() {
        @java.lang.Override
        public WorkflowTemplatePlacement parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WorkflowTemplatePlacement(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WorkflowTemplatePlacement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowTemplatePlacement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
