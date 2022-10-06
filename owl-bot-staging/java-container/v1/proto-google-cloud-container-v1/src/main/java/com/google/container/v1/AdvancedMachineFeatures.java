// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * Specifies options for controlling advanced machine features.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AdvancedMachineFeatures}
 */
public final class AdvancedMachineFeatures extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AdvancedMachineFeatures)
    AdvancedMachineFeaturesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvancedMachineFeatures.newBuilder() to construct.
  private AdvancedMachineFeatures(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvancedMachineFeatures() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvancedMachineFeatures();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_AdvancedMachineFeatures_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_AdvancedMachineFeatures_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AdvancedMachineFeatures.class, com.google.container.v1.AdvancedMachineFeatures.Builder.class);
  }

  private int bitField0_;
  public static final int THREADS_PER_CORE_FIELD_NUMBER = 1;
  private long threadsPerCore_;
  /**
   * <pre>
   * The number of threads per physical core. To disable simultaneous
   * multithreading (SMT) set this to 1. If unset, the maximum number of threads
   * supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int64 threads_per_core = 1;</code>
   * @return Whether the threadsPerCore field is set.
   */
  @java.lang.Override
  public boolean hasThreadsPerCore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The number of threads per physical core. To disable simultaneous
   * multithreading (SMT) set this to 1. If unset, the maximum number of threads
   * supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int64 threads_per_core = 1;</code>
   * @return The threadsPerCore.
   */
  @java.lang.Override
  public long getThreadsPerCore() {
    return threadsPerCore_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, threadsPerCore_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, threadsPerCore_);
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
    if (!(obj instanceof com.google.container.v1.AdvancedMachineFeatures)) {
      return super.equals(obj);
    }
    com.google.container.v1.AdvancedMachineFeatures other = (com.google.container.v1.AdvancedMachineFeatures) obj;

    if (hasThreadsPerCore() != other.hasThreadsPerCore()) return false;
    if (hasThreadsPerCore()) {
      if (getThreadsPerCore()
          != other.getThreadsPerCore()) return false;
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
    if (hasThreadsPerCore()) {
      hash = (37 * hash) + THREADS_PER_CORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getThreadsPerCore());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.AdvancedMachineFeatures parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.AdvancedMachineFeatures prototype) {
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
   * Specifies options for controlling advanced machine features.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AdvancedMachineFeatures}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AdvancedMachineFeatures)
      com.google.container.v1.AdvancedMachineFeaturesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_AdvancedMachineFeatures_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_AdvancedMachineFeatures_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AdvancedMachineFeatures.class, com.google.container.v1.AdvancedMachineFeatures.Builder.class);
    }

    // Construct using com.google.container.v1.AdvancedMachineFeatures.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      threadsPerCore_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_AdvancedMachineFeatures_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AdvancedMachineFeatures getDefaultInstanceForType() {
      return com.google.container.v1.AdvancedMachineFeatures.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AdvancedMachineFeatures build() {
      com.google.container.v1.AdvancedMachineFeatures result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AdvancedMachineFeatures buildPartial() {
      com.google.container.v1.AdvancedMachineFeatures result = new com.google.container.v1.AdvancedMachineFeatures(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.threadsPerCore_ = threadsPerCore_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.container.v1.AdvancedMachineFeatures) {
        return mergeFrom((com.google.container.v1.AdvancedMachineFeatures)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AdvancedMachineFeatures other) {
      if (other == com.google.container.v1.AdvancedMachineFeatures.getDefaultInstance()) return this;
      if (other.hasThreadsPerCore()) {
        setThreadsPerCore(other.getThreadsPerCore());
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
            case 8: {
              threadsPerCore_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long threadsPerCore_ ;
    /**
     * <pre>
     * The number of threads per physical core. To disable simultaneous
     * multithreading (SMT) set this to 1. If unset, the maximum number of threads
     * supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int64 threads_per_core = 1;</code>
     * @return Whether the threadsPerCore field is set.
     */
    @java.lang.Override
    public boolean hasThreadsPerCore() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The number of threads per physical core. To disable simultaneous
     * multithreading (SMT) set this to 1. If unset, the maximum number of threads
     * supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int64 threads_per_core = 1;</code>
     * @return The threadsPerCore.
     */
    @java.lang.Override
    public long getThreadsPerCore() {
      return threadsPerCore_;
    }
    /**
     * <pre>
     * The number of threads per physical core. To disable simultaneous
     * multithreading (SMT) set this to 1. If unset, the maximum number of threads
     * supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int64 threads_per_core = 1;</code>
     * @param value The threadsPerCore to set.
     * @return This builder for chaining.
     */
    public Builder setThreadsPerCore(long value) {
      bitField0_ |= 0x00000001;
      threadsPerCore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of threads per physical core. To disable simultaneous
     * multithreading (SMT) set this to 1. If unset, the maximum number of threads
     * supported per core by the underlying processor is assumed.
     * </pre>
     *
     * <code>optional int64 threads_per_core = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadsPerCore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      threadsPerCore_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.AdvancedMachineFeatures)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AdvancedMachineFeatures)
  private static final com.google.container.v1.AdvancedMachineFeatures DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AdvancedMachineFeatures();
  }

  public static com.google.container.v1.AdvancedMachineFeatures getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvancedMachineFeatures>
      PARSER = new com.google.protobuf.AbstractParser<AdvancedMachineFeatures>() {
    @java.lang.Override
    public AdvancedMachineFeatures parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdvancedMachineFeatures> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvancedMachineFeatures> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AdvancedMachineFeatures getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

