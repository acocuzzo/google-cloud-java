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
// source: google/cloud/domains/v1alpha2/domains.proto

package com.google.cloud.domains.v1alpha2;

/**
 *
 *
 * <pre>
 * Response for the `RetrieveTransferParameters` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse}
 */
public final class RetrieveTransferParametersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)
    RetrieveTransferParametersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrieveTransferParametersResponse.newBuilder() to construct.
  private RetrieveTransferParametersResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrieveTransferParametersResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrieveTransferParametersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RetrieveTransferParametersResponse(
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
          case 10:
            {
              com.google.cloud.domains.v1alpha2.TransferParameters.Builder subBuilder = null;
              if (transferParameters_ != null) {
                subBuilder = transferParameters_.toBuilder();
              }
              transferParameters_ =
                  input.readMessage(
                      com.google.cloud.domains.v1alpha2.TransferParameters.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(transferParameters_);
                transferParameters_ = subBuilder.buildPartial();
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
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_RetrieveTransferParametersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1alpha2.DomainsProto
        .internal_static_google_cloud_domains_v1alpha2_RetrieveTransferParametersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse.class,
            com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse.Builder.class);
  }

  public static final int TRANSFER_PARAMETERS_FIELD_NUMBER = 1;
  private com.google.cloud.domains.v1alpha2.TransferParameters transferParameters_;
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
   *
   * @return Whether the transferParameters field is set.
   */
  @java.lang.Override
  public boolean hasTransferParameters() {
    return transferParameters_ != null;
  }
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
   *
   * @return The transferParameters.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.TransferParameters getTransferParameters() {
    return transferParameters_ == null
        ? com.google.cloud.domains.v1alpha2.TransferParameters.getDefaultInstance()
        : transferParameters_;
  }
  /**
   *
   *
   * <pre>
   * Parameters to use when calling the `TransferDomain` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.TransferParametersOrBuilder
      getTransferParametersOrBuilder() {
    return getTransferParameters();
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
    if (transferParameters_ != null) {
      output.writeMessage(1, getTransferParameters());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transferParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTransferParameters());
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
    if (!(obj instanceof com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse other =
        (com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse) obj;

    if (hasTransferParameters() != other.hasTransferParameters()) return false;
    if (hasTransferParameters()) {
      if (!getTransferParameters().equals(other.getTransferParameters())) return false;
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
    if (hasTransferParameters()) {
      hash = (37 * hash) + TRANSFER_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferParameters().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parseFrom(
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
      com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse prototype) {
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
   * Response for the `RetrieveTransferParameters` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)
      com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveTransferParametersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveTransferParametersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse.class,
              com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse.newBuilder()
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
      if (transferParametersBuilder_ == null) {
        transferParameters_ = null;
      } else {
        transferParameters_ = null;
        transferParametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1alpha2.DomainsProto
          .internal_static_google_cloud_domains_v1alpha2_RetrieveTransferParametersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
        getDefaultInstanceForType() {
      return com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse build() {
      com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse buildPartial() {
      com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse result =
          new com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse(this);
      if (transferParametersBuilder_ == null) {
        result.transferParameters_ = transferParameters_;
      } else {
        result.transferParameters_ = transferParametersBuilder_.build();
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
      if (other instanceof com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse) {
        return mergeFrom(
            (com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse other) {
      if (other
          == com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
              .getDefaultInstance()) return this;
      if (other.hasTransferParameters()) {
        mergeTransferParameters(other.getTransferParameters());
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
      com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.domains.v1alpha2.TransferParameters transferParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.TransferParameters,
            com.google.cloud.domains.v1alpha2.TransferParameters.Builder,
            com.google.cloud.domains.v1alpha2.TransferParametersOrBuilder>
        transferParametersBuilder_;
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     *
     * @return Whether the transferParameters field is set.
     */
    public boolean hasTransferParameters() {
      return transferParametersBuilder_ != null || transferParameters_ != null;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     *
     * @return The transferParameters.
     */
    public com.google.cloud.domains.v1alpha2.TransferParameters getTransferParameters() {
      if (transferParametersBuilder_ == null) {
        return transferParameters_ == null
            ? com.google.cloud.domains.v1alpha2.TransferParameters.getDefaultInstance()
            : transferParameters_;
      } else {
        return transferParametersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder setTransferParameters(
        com.google.cloud.domains.v1alpha2.TransferParameters value) {
      if (transferParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transferParameters_ = value;
        onChanged();
      } else {
        transferParametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder setTransferParameters(
        com.google.cloud.domains.v1alpha2.TransferParameters.Builder builderForValue) {
      if (transferParametersBuilder_ == null) {
        transferParameters_ = builderForValue.build();
        onChanged();
      } else {
        transferParametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder mergeTransferParameters(
        com.google.cloud.domains.v1alpha2.TransferParameters value) {
      if (transferParametersBuilder_ == null) {
        if (transferParameters_ != null) {
          transferParameters_ =
              com.google.cloud.domains.v1alpha2.TransferParameters.newBuilder(transferParameters_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          transferParameters_ = value;
        }
        onChanged();
      } else {
        transferParametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public Builder clearTransferParameters() {
      if (transferParametersBuilder_ == null) {
        transferParameters_ = null;
        onChanged();
      } else {
        transferParameters_ = null;
        transferParametersBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1alpha2.TransferParameters.Builder
        getTransferParametersBuilder() {

      onChanged();
      return getTransferParametersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    public com.google.cloud.domains.v1alpha2.TransferParametersOrBuilder
        getTransferParametersOrBuilder() {
      if (transferParametersBuilder_ != null) {
        return transferParametersBuilder_.getMessageOrBuilder();
      } else {
        return transferParameters_ == null
            ? com.google.cloud.domains.v1alpha2.TransferParameters.getDefaultInstance()
            : transferParameters_;
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters to use when calling the `TransferDomain` method.
     * </pre>
     *
     * <code>.google.cloud.domains.v1alpha2.TransferParameters transfer_parameters = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.domains.v1alpha2.TransferParameters,
            com.google.cloud.domains.v1alpha2.TransferParameters.Builder,
            com.google.cloud.domains.v1alpha2.TransferParametersOrBuilder>
        getTransferParametersFieldBuilder() {
      if (transferParametersBuilder_ == null) {
        transferParametersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.domains.v1alpha2.TransferParameters,
                com.google.cloud.domains.v1alpha2.TransferParameters.Builder,
                com.google.cloud.domains.v1alpha2.TransferParametersOrBuilder>(
                getTransferParameters(), getParentForChildren(), isClean());
        transferParameters_ = null;
      }
      return transferParametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse)
  private static final com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse();
  }

  public static com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveTransferParametersResponse> PARSER =
      new com.google.protobuf.AbstractParser<RetrieveTransferParametersResponse>() {
        @java.lang.Override
        public RetrieveTransferParametersResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RetrieveTransferParametersResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RetrieveTransferParametersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveTransferParametersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1alpha2.RetrieveTransferParametersResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
