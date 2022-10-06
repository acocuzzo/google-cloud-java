// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

/**
 * <pre>
 * Response to an batch document processing request. This is returned in
 * the LRO Operation after the operation is complete.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse}
 */
public final class BatchProcessDocumentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)
    BatchProcessDocumentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchProcessDocumentsResponse.newBuilder() to construct.
  private BatchProcessDocumentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchProcessDocumentsResponse() {
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchProcessDocumentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.class, com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.Builder.class);
  }

  public static final int RESPONSES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse> responses_;
  /**
   * <pre>
   * Responses for each individual document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse> getResponsesList() {
    return responses_;
  }
  /**
   * <pre>
   * Responses for each individual document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <pre>
   * Responses for each individual document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
   */
  @java.lang.Override
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <pre>
   * Responses for each individual document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <pre>
   * Responses for each individual document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
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
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(1, responses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, responses_.get(i));
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse other = (com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse) obj;

    if (!getResponsesList()
        .equals(other.getResponsesList())) return false;
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
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse prototype) {
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
   * Response to an batch document processing request. This is returned in
   * the LRO Operation after the operation is complete.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.class, com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
      } else {
        responses_ = null;
        responsesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse build() {
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse buildPartial() {
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse result = new com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse other) {
      if (other == com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse.getDefaultInstance()) return this;
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
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
              com.google.cloud.documentai.v1beta1.ProcessDocumentResponse m =
                  input.readMessage(
                      com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.parser(),
                      extensionRegistry);
              if (responsesBuilder_ == null) {
                ensureResponsesIsMutable();
                responses_.add(m);
              } else {
                responsesBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        responses_ = new java.util.ArrayList<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse>(responses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1beta1.ProcessDocumentResponse, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder, com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder> responsesBuilder_;

    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder setResponses(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder setResponses(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder addResponses(com.google.cloud.documentai.v1beta1.ProcessDocumentResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder addResponses(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder addResponses(
        com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder addResponses(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1beta1.ProcessDocumentResponse> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.getDefaultInstance());
    }
    /**
     * <pre>
     * Responses for each individual document.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1beta1.ProcessDocumentResponse responses = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.documentai.v1beta1.ProcessDocumentResponse, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder, com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.ProcessDocumentResponse, com.google.cloud.documentai.v1beta1.ProcessDocumentResponse.Builder, com.google.cloud.documentai.v1beta1.ProcessDocumentResponseOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse)
  private static final com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse();
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchProcessDocumentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchProcessDocumentsResponse>() {
    @java.lang.Override
    public BatchProcessDocumentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchProcessDocumentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchProcessDocumentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

