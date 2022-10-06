// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

/**
 * <pre>
 * Response message for [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.ListModelEvaluationsResponse}
 */
public final class ListModelEvaluationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.ListModelEvaluationsResponse)
    ListModelEvaluationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListModelEvaluationsResponse.newBuilder() to construct.
  private ListModelEvaluationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListModelEvaluationsResponse() {
    modelEvaluation_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListModelEvaluationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.automl.v1.AutoMlProto.internal_static_google_cloud_automl_v1_ListModelEvaluationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.AutoMlProto.internal_static_google_cloud_automl_v1_ListModelEvaluationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.ListModelEvaluationsResponse.class, com.google.cloud.automl.v1.ListModelEvaluationsResponse.Builder.class);
  }

  public static final int MODEL_EVALUATION_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.automl.v1.ModelEvaluation> modelEvaluation_;
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.automl.v1.ModelEvaluation> getModelEvaluationList() {
    return modelEvaluation_;
  }
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.automl.v1.ModelEvaluationOrBuilder> 
      getModelEvaluationOrBuilderList() {
    return modelEvaluation_;
  }
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  @java.lang.Override
  public int getModelEvaluationCount() {
    return modelEvaluation_.size();
  }
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.ModelEvaluation getModelEvaluation(int index) {
    return modelEvaluation_.get(index);
  }
  /**
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1.ModelEvaluationOrBuilder getModelEvaluationOrBuilder(
      int index) {
    return modelEvaluation_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < modelEvaluation_.size(); i++) {
      output.writeMessage(1, modelEvaluation_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < modelEvaluation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, modelEvaluation_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.ListModelEvaluationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.ListModelEvaluationsResponse other = (com.google.cloud.automl.v1.ListModelEvaluationsResponse) obj;

    if (!getModelEvaluationList()
        .equals(other.getModelEvaluationList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getModelEvaluationCount() > 0) {
      hash = (37 * hash) + MODEL_EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getModelEvaluationList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.automl.v1.ListModelEvaluationsResponse prototype) {
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
   * Response message for [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.ListModelEvaluationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.ListModelEvaluationsResponse)
      com.google.cloud.automl.v1.ListModelEvaluationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.automl.v1.AutoMlProto.internal_static_google_cloud_automl_v1_ListModelEvaluationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.AutoMlProto.internal_static_google_cloud_automl_v1_ListModelEvaluationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.ListModelEvaluationsResponse.class, com.google.cloud.automl.v1.ListModelEvaluationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.ListModelEvaluationsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (modelEvaluationBuilder_ == null) {
        modelEvaluation_ = java.util.Collections.emptyList();
      } else {
        modelEvaluation_ = null;
        modelEvaluationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.automl.v1.AutoMlProto.internal_static_google_cloud_automl_v1_ListModelEvaluationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ListModelEvaluationsResponse getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.ListModelEvaluationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ListModelEvaluationsResponse build() {
      com.google.cloud.automl.v1.ListModelEvaluationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.ListModelEvaluationsResponse buildPartial() {
      com.google.cloud.automl.v1.ListModelEvaluationsResponse result = new com.google.cloud.automl.v1.ListModelEvaluationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (modelEvaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          modelEvaluation_ = java.util.Collections.unmodifiableList(modelEvaluation_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.modelEvaluation_ = modelEvaluation_;
      } else {
        result.modelEvaluation_ = modelEvaluationBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.automl.v1.ListModelEvaluationsResponse) {
        return mergeFrom((com.google.cloud.automl.v1.ListModelEvaluationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.ListModelEvaluationsResponse other) {
      if (other == com.google.cloud.automl.v1.ListModelEvaluationsResponse.getDefaultInstance()) return this;
      if (modelEvaluationBuilder_ == null) {
        if (!other.modelEvaluation_.isEmpty()) {
          if (modelEvaluation_.isEmpty()) {
            modelEvaluation_ = other.modelEvaluation_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelEvaluationIsMutable();
            modelEvaluation_.addAll(other.modelEvaluation_);
          }
          onChanged();
        }
      } else {
        if (!other.modelEvaluation_.isEmpty()) {
          if (modelEvaluationBuilder_.isEmpty()) {
            modelEvaluationBuilder_.dispose();
            modelEvaluationBuilder_ = null;
            modelEvaluation_ = other.modelEvaluation_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelEvaluationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModelEvaluationFieldBuilder() : null;
          } else {
            modelEvaluationBuilder_.addAllMessages(other.modelEvaluation_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10: {
              com.google.cloud.automl.v1.ModelEvaluation m =
                  input.readMessage(
                      com.google.cloud.automl.v1.ModelEvaluation.parser(),
                      extensionRegistry);
              if (modelEvaluationBuilder_ == null) {
                ensureModelEvaluationIsMutable();
                modelEvaluation_.add(m);
              } else {
                modelEvaluationBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
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

    private java.util.List<com.google.cloud.automl.v1.ModelEvaluation> modelEvaluation_ =
      java.util.Collections.emptyList();
    private void ensureModelEvaluationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        modelEvaluation_ = new java.util.ArrayList<com.google.cloud.automl.v1.ModelEvaluation>(modelEvaluation_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1.ModelEvaluation, com.google.cloud.automl.v1.ModelEvaluation.Builder, com.google.cloud.automl.v1.ModelEvaluationOrBuilder> modelEvaluationBuilder_;

    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1.ModelEvaluation> getModelEvaluationList() {
      if (modelEvaluationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(modelEvaluation_);
      } else {
        return modelEvaluationBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public int getModelEvaluationCount() {
      if (modelEvaluationBuilder_ == null) {
        return modelEvaluation_.size();
      } else {
        return modelEvaluationBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public com.google.cloud.automl.v1.ModelEvaluation getModelEvaluation(int index) {
      if (modelEvaluationBuilder_ == null) {
        return modelEvaluation_.get(index);
      } else {
        return modelEvaluationBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder setModelEvaluation(
        int index, com.google.cloud.automl.v1.ModelEvaluation value) {
      if (modelEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationIsMutable();
        modelEvaluation_.set(index, value);
        onChanged();
      } else {
        modelEvaluationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder setModelEvaluation(
        int index, com.google.cloud.automl.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationBuilder_ == null) {
        ensureModelEvaluationIsMutable();
        modelEvaluation_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelEvaluationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder addModelEvaluation(com.google.cloud.automl.v1.ModelEvaluation value) {
      if (modelEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationIsMutable();
        modelEvaluation_.add(value);
        onChanged();
      } else {
        modelEvaluationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder addModelEvaluation(
        int index, com.google.cloud.automl.v1.ModelEvaluation value) {
      if (modelEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelEvaluationIsMutable();
        modelEvaluation_.add(index, value);
        onChanged();
      } else {
        modelEvaluationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder addModelEvaluation(
        com.google.cloud.automl.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationBuilder_ == null) {
        ensureModelEvaluationIsMutable();
        modelEvaluation_.add(builderForValue.build());
        onChanged();
      } else {
        modelEvaluationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder addModelEvaluation(
        int index, com.google.cloud.automl.v1.ModelEvaluation.Builder builderForValue) {
      if (modelEvaluationBuilder_ == null) {
        ensureModelEvaluationIsMutable();
        modelEvaluation_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelEvaluationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder addAllModelEvaluation(
        java.lang.Iterable<? extends com.google.cloud.automl.v1.ModelEvaluation> values) {
      if (modelEvaluationBuilder_ == null) {
        ensureModelEvaluationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, modelEvaluation_);
        onChanged();
      } else {
        modelEvaluationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder clearModelEvaluation() {
      if (modelEvaluationBuilder_ == null) {
        modelEvaluation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelEvaluationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public Builder removeModelEvaluation(int index) {
      if (modelEvaluationBuilder_ == null) {
        ensureModelEvaluationIsMutable();
        modelEvaluation_.remove(index);
        onChanged();
      } else {
        modelEvaluationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public com.google.cloud.automl.v1.ModelEvaluation.Builder getModelEvaluationBuilder(
        int index) {
      return getModelEvaluationFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public com.google.cloud.automl.v1.ModelEvaluationOrBuilder getModelEvaluationOrBuilder(
        int index) {
      if (modelEvaluationBuilder_ == null) {
        return modelEvaluation_.get(index);  } else {
        return modelEvaluationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.automl.v1.ModelEvaluationOrBuilder> 
         getModelEvaluationOrBuilderList() {
      if (modelEvaluationBuilder_ != null) {
        return modelEvaluationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(modelEvaluation_);
      }
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public com.google.cloud.automl.v1.ModelEvaluation.Builder addModelEvaluationBuilder() {
      return getModelEvaluationFieldBuilder().addBuilder(
          com.google.cloud.automl.v1.ModelEvaluation.getDefaultInstance());
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public com.google.cloud.automl.v1.ModelEvaluation.Builder addModelEvaluationBuilder(
        int index) {
      return getModelEvaluationFieldBuilder().addBuilder(
          index, com.google.cloud.automl.v1.ModelEvaluation.getDefaultInstance());
    }
    /**
     * <pre>
     * List of model evaluations in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
     */
    public java.util.List<com.google.cloud.automl.v1.ModelEvaluation.Builder> 
         getModelEvaluationBuilderList() {
      return getModelEvaluationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.automl.v1.ModelEvaluation, com.google.cloud.automl.v1.ModelEvaluation.Builder, com.google.cloud.automl.v1.ModelEvaluationOrBuilder> 
        getModelEvaluationFieldBuilder() {
      if (modelEvaluationBuilder_ == null) {
        modelEvaluationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.automl.v1.ModelEvaluation, com.google.cloud.automl.v1.ModelEvaluation.Builder, com.google.cloud.automl.v1.ModelEvaluationOrBuilder>(
                modelEvaluation_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        modelEvaluation_ = null;
      }
      return modelEvaluationBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.ListModelEvaluationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.ListModelEvaluationsResponse)
  private static final com.google.cloud.automl.v1.ListModelEvaluationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.ListModelEvaluationsResponse();
  }

  public static com.google.cloud.automl.v1.ListModelEvaluationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelEvaluationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListModelEvaluationsResponse>() {
    @java.lang.Override
    public ListModelEvaluationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListModelEvaluationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelEvaluationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.ListModelEvaluationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

