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
// source: google/cloud/edgecontainer/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.edgecontainer.v1;

/**
 *
 *
 * <pre>
 * Generates an offline credential(offline) for a cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest}
 */
public final class GenerateOfflineCredentialRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest)
    GenerateOfflineCredentialRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateOfflineCredentialRequest.newBuilder() to construct.
  private GenerateOfflineCredentialRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateOfflineCredentialRequest() {
    cluster_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateOfflineCredentialRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.edgecontainer.v1.ServiceProto
        .internal_static_google_cloud_edgecontainer_v1_GenerateOfflineCredentialRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.edgecontainer.v1.ServiceProto
        .internal_static_google_cloud_edgecontainer_v1_GenerateOfflineCredentialRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest.class,
            com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest.Builder.class);
  }

  public static final int CLUSTER_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cluster_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the cluster.
   * </pre>
   *
   * <code>
   * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cluster.
   */
  @java.lang.Override
  public java.lang.String getCluster() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cluster_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the cluster.
   * </pre>
   *
   * <code>
   * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cluster.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterBytes() {
    java.lang.Object ref = cluster_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cluster_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cluster_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cluster_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cluster_);
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
    if (!(obj instanceof com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest other =
        (com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest) obj;

    if (!getCluster().equals(other.getCluster())) return false;
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
    hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + getCluster().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest parseFrom(
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
      com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest prototype) {
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
   * Generates an offline credential(offline) for a cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest)
      com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateOfflineCredentialRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateOfflineCredentialRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest.class,
              com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cluster_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.edgecontainer.v1.ServiceProto
          .internal_static_google_cloud_edgecontainer_v1_GenerateOfflineCredentialRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
        getDefaultInstanceForType() {
      return com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest build() {
      com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest buildPartial() {
      com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest result =
          new com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cluster_ = cluster_;
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
      if (other instanceof com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest) {
        return mergeFrom(
            (com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest other) {
      if (other
          == com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
              .getDefaultInstance()) return this;
      if (!other.getCluster().isEmpty()) {
        cluster_ = other.cluster_;
        bitField0_ |= 0x00000001;
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
                cluster_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object cluster_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the cluster.
     * </pre>
     *
     * <code>
     * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The cluster.
     */
    public java.lang.String getCluster() {
      java.lang.Object ref = cluster_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cluster_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the cluster.
     * </pre>
     *
     * <code>
     * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for cluster.
     */
    public com.google.protobuf.ByteString getClusterBytes() {
      java.lang.Object ref = cluster_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cluster_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the cluster.
     * </pre>
     *
     * <code>
     * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The cluster to set.
     * @return This builder for chaining.
     */
    public Builder setCluster(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cluster_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the cluster.
     * </pre>
     *
     * <code>
     * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCluster() {
      cluster_ = getDefaultInstance().getCluster();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the cluster.
     * </pre>
     *
     * <code>
     * string cluster = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for cluster to set.
     * @return This builder for chaining.
     */
    public Builder setClusterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cluster_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest)
  private static final com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest();
  }

  public static com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateOfflineCredentialRequest> PARSER =
      new com.google.protobuf.AbstractParser<GenerateOfflineCredentialRequest>() {
        @java.lang.Override
        public GenerateOfflineCredentialRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateOfflineCredentialRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateOfflineCredentialRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.edgecontainer.v1.GenerateOfflineCredentialRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
