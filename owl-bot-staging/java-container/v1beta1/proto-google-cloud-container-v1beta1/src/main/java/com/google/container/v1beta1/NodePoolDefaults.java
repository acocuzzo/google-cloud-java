// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * Subset of Nodepool message that has defaults.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NodePoolDefaults}
 */
public final class NodePoolDefaults extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NodePoolDefaults)
    NodePoolDefaultsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodePoolDefaults.newBuilder() to construct.
  private NodePoolDefaults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodePoolDefaults() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodePoolDefaults();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolDefaults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolDefaults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NodePoolDefaults.class, com.google.container.v1beta1.NodePoolDefaults.Builder.class);
  }

  public static final int NODE_CONFIG_DEFAULTS_FIELD_NUMBER = 1;
  private com.google.container.v1beta1.NodeConfigDefaults nodeConfigDefaults_;
  /**
   * <pre>
   * Subset of NodeConfig message that has defaults.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
   * @return Whether the nodeConfigDefaults field is set.
   */
  @java.lang.Override
  public boolean hasNodeConfigDefaults() {
    return nodeConfigDefaults_ != null;
  }
  /**
   * <pre>
   * Subset of NodeConfig message that has defaults.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
   * @return The nodeConfigDefaults.
   */
  @java.lang.Override
  public com.google.container.v1beta1.NodeConfigDefaults getNodeConfigDefaults() {
    return nodeConfigDefaults_ == null ? com.google.container.v1beta1.NodeConfigDefaults.getDefaultInstance() : nodeConfigDefaults_;
  }
  /**
   * <pre>
   * Subset of NodeConfig message that has defaults.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.NodeConfigDefaultsOrBuilder getNodeConfigDefaultsOrBuilder() {
    return getNodeConfigDefaults();
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
    if (nodeConfigDefaults_ != null) {
      output.writeMessage(1, getNodeConfigDefaults());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeConfigDefaults_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNodeConfigDefaults());
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
    if (!(obj instanceof com.google.container.v1beta1.NodePoolDefaults)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NodePoolDefaults other = (com.google.container.v1beta1.NodePoolDefaults) obj;

    if (hasNodeConfigDefaults() != other.hasNodeConfigDefaults()) return false;
    if (hasNodeConfigDefaults()) {
      if (!getNodeConfigDefaults()
          .equals(other.getNodeConfigDefaults())) return false;
    }
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
    if (hasNodeConfigDefaults()) {
      hash = (37 * hash) + NODE_CONFIG_DEFAULTS_FIELD_NUMBER;
      hash = (53 * hash) + getNodeConfigDefaults().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.NodePoolDefaults parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.NodePoolDefaults prototype) {
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
   * Subset of Nodepool message that has defaults.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NodePoolDefaults}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NodePoolDefaults)
      com.google.container.v1beta1.NodePoolDefaultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolDefaults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolDefaults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NodePoolDefaults.class, com.google.container.v1beta1.NodePoolDefaults.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NodePoolDefaults.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nodeConfigDefaultsBuilder_ == null) {
        nodeConfigDefaults_ = null;
      } else {
        nodeConfigDefaults_ = null;
        nodeConfigDefaultsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_NodePoolDefaults_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolDefaults getDefaultInstanceForType() {
      return com.google.container.v1beta1.NodePoolDefaults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolDefaults build() {
      com.google.container.v1beta1.NodePoolDefaults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodePoolDefaults buildPartial() {
      com.google.container.v1beta1.NodePoolDefaults result = new com.google.container.v1beta1.NodePoolDefaults(this);
      if (nodeConfigDefaultsBuilder_ == null) {
        result.nodeConfigDefaults_ = nodeConfigDefaults_;
      } else {
        result.nodeConfigDefaults_ = nodeConfigDefaultsBuilder_.build();
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
      if (other instanceof com.google.container.v1beta1.NodePoolDefaults) {
        return mergeFrom((com.google.container.v1beta1.NodePoolDefaults)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NodePoolDefaults other) {
      if (other == com.google.container.v1beta1.NodePoolDefaults.getDefaultInstance()) return this;
      if (other.hasNodeConfigDefaults()) {
        mergeNodeConfigDefaults(other.getNodeConfigDefaults());
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
              input.readMessage(
                  getNodeConfigDefaultsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.google.container.v1beta1.NodeConfigDefaults nodeConfigDefaults_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.NodeConfigDefaults, com.google.container.v1beta1.NodeConfigDefaults.Builder, com.google.container.v1beta1.NodeConfigDefaultsOrBuilder> nodeConfigDefaultsBuilder_;
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     * @return Whether the nodeConfigDefaults field is set.
     */
    public boolean hasNodeConfigDefaults() {
      return nodeConfigDefaultsBuilder_ != null || nodeConfigDefaults_ != null;
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     * @return The nodeConfigDefaults.
     */
    public com.google.container.v1beta1.NodeConfigDefaults getNodeConfigDefaults() {
      if (nodeConfigDefaultsBuilder_ == null) {
        return nodeConfigDefaults_ == null ? com.google.container.v1beta1.NodeConfigDefaults.getDefaultInstance() : nodeConfigDefaults_;
      } else {
        return nodeConfigDefaultsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public Builder setNodeConfigDefaults(com.google.container.v1beta1.NodeConfigDefaults value) {
      if (nodeConfigDefaultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodeConfigDefaults_ = value;
        onChanged();
      } else {
        nodeConfigDefaultsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public Builder setNodeConfigDefaults(
        com.google.container.v1beta1.NodeConfigDefaults.Builder builderForValue) {
      if (nodeConfigDefaultsBuilder_ == null) {
        nodeConfigDefaults_ = builderForValue.build();
        onChanged();
      } else {
        nodeConfigDefaultsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public Builder mergeNodeConfigDefaults(com.google.container.v1beta1.NodeConfigDefaults value) {
      if (nodeConfigDefaultsBuilder_ == null) {
        if (nodeConfigDefaults_ != null) {
          nodeConfigDefaults_ =
            com.google.container.v1beta1.NodeConfigDefaults.newBuilder(nodeConfigDefaults_).mergeFrom(value).buildPartial();
        } else {
          nodeConfigDefaults_ = value;
        }
        onChanged();
      } else {
        nodeConfigDefaultsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public Builder clearNodeConfigDefaults() {
      if (nodeConfigDefaultsBuilder_ == null) {
        nodeConfigDefaults_ = null;
        onChanged();
      } else {
        nodeConfigDefaults_ = null;
        nodeConfigDefaultsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public com.google.container.v1beta1.NodeConfigDefaults.Builder getNodeConfigDefaultsBuilder() {
      
      onChanged();
      return getNodeConfigDefaultsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    public com.google.container.v1beta1.NodeConfigDefaultsOrBuilder getNodeConfigDefaultsOrBuilder() {
      if (nodeConfigDefaultsBuilder_ != null) {
        return nodeConfigDefaultsBuilder_.getMessageOrBuilder();
      } else {
        return nodeConfigDefaults_ == null ?
            com.google.container.v1beta1.NodeConfigDefaults.getDefaultInstance() : nodeConfigDefaults_;
      }
    }
    /**
     * <pre>
     * Subset of NodeConfig message that has defaults.
     * </pre>
     *
     * <code>.google.container.v1beta1.NodeConfigDefaults node_config_defaults = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1beta1.NodeConfigDefaults, com.google.container.v1beta1.NodeConfigDefaults.Builder, com.google.container.v1beta1.NodeConfigDefaultsOrBuilder> 
        getNodeConfigDefaultsFieldBuilder() {
      if (nodeConfigDefaultsBuilder_ == null) {
        nodeConfigDefaultsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.NodeConfigDefaults, com.google.container.v1beta1.NodeConfigDefaults.Builder, com.google.container.v1beta1.NodeConfigDefaultsOrBuilder>(
                getNodeConfigDefaults(),
                getParentForChildren(),
                isClean());
        nodeConfigDefaults_ = null;
      }
      return nodeConfigDefaultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NodePoolDefaults)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NodePoolDefaults)
  private static final com.google.container.v1beta1.NodePoolDefaults DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NodePoolDefaults();
  }

  public static com.google.container.v1beta1.NodePoolDefaults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodePoolDefaults>
      PARSER = new com.google.protobuf.AbstractParser<NodePoolDefaults>() {
    @java.lang.Override
    public NodePoolDefaults parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodePoolDefaults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodePoolDefaults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NodePoolDefaults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

