// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/vizier_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * This message will be placed in the metadata field of a
 * google.longrunning.Operation associated with a CheckTrialEarlyStoppingState
 * request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata}
 */
public final class CheckTrialEarlyStoppingStateMetatdata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)
    CheckTrialEarlyStoppingStateMetatdataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckTrialEarlyStoppingStateMetatdata.newBuilder() to construct.
  private CheckTrialEarlyStoppingStateMetatdata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckTrialEarlyStoppingStateMetatdata() {
    study_ = "";
    trial_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckTrialEarlyStoppingStateMetatdata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto.internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateMetatdata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto.internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateMetatdata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.class, com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.Builder.class);
  }

  public static final int GENERIC_METADATA_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  @java.lang.Override
  public boolean hasGenericMetadata() {
    return genericMetadata_ != null;
  }
  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
    return genericMetadata_ == null ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
  }
  /**
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
    return getGenericMetadata();
  }

  public static final int STUDY_FIELD_NUMBER = 2;
  private volatile java.lang.Object study_;
  /**
   * <pre>
   * The name of the Study that the Trial belongs to.
   * </pre>
   *
   * <code>string study = 2;</code>
   * @return The study.
   */
  @java.lang.Override
  public java.lang.String getStudy() {
    java.lang.Object ref = study_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      study_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Study that the Trial belongs to.
   * </pre>
   *
   * <code>string study = 2;</code>
   * @return The bytes for study.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStudyBytes() {
    java.lang.Object ref = study_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      study_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRIAL_FIELD_NUMBER = 3;
  private volatile java.lang.Object trial_;
  /**
   * <pre>
   * The Trial name.
   * </pre>
   *
   * <code>string trial = 3;</code>
   * @return The trial.
   */
  @java.lang.Override
  public java.lang.String getTrial() {
    java.lang.Object ref = trial_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trial_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Trial name.
   * </pre>
   *
   * <code>string trial = 3;</code>
   * @return The bytes for trial.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTrialBytes() {
    java.lang.Object ref = trial_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trial_ = b;
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
    if (genericMetadata_ != null) {
      output.writeMessage(1, getGenericMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(study_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, study_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trial_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, trial_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (genericMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGenericMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(study_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, study_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trial_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, trial_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata other = (com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata) obj;

    if (hasGenericMetadata() != other.hasGenericMetadata()) return false;
    if (hasGenericMetadata()) {
      if (!getGenericMetadata()
          .equals(other.getGenericMetadata())) return false;
    }
    if (!getStudy()
        .equals(other.getStudy())) return false;
    if (!getTrial()
        .equals(other.getTrial())) return false;
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
    if (hasGenericMetadata()) {
      hash = (37 * hash) + GENERIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getGenericMetadata().hashCode();
    }
    hash = (37 * hash) + STUDY_FIELD_NUMBER;
    hash = (53 * hash) + getStudy().hashCode();
    hash = (37 * hash) + TRIAL_FIELD_NUMBER;
    hash = (53 * hash) + getTrial().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata prototype) {
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
   * This message will be placed in the metadata field of a
   * google.longrunning.Operation associated with a CheckTrialEarlyStoppingState
   * request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto.internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateMetatdata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto.internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateMetatdata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.class, com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }
      study_ = "";

      trial_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto.internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateMetatdata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata build() {
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata buildPartial() {
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata result = new com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata(this);
      if (genericMetadataBuilder_ == null) {
        result.genericMetadata_ = genericMetadata_;
      } else {
        result.genericMetadata_ = genericMetadataBuilder_.build();
      }
      result.study_ = study_;
      result.trial_ = trial_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata) {
        return mergeFrom((com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata other) {
      if (other == com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata.getDefaultInstance()) return this;
      if (other.hasGenericMetadata()) {
        mergeGenericMetadata(other.getGenericMetadata());
      }
      if (!other.getStudy().isEmpty()) {
        study_ = other.study_;
        onChanged();
      }
      if (!other.getTrial().isEmpty()) {
        trial_ = other.trial_;
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
              input.readMessage(
                  getGenericMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              study_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              trial_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private com.google.cloud.aiplatform.v1.GenericOperationMetadata genericMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder> genericMetadataBuilder_;
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return Whether the genericMetadata field is set.
     */
    public boolean hasGenericMetadata() {
      return genericMetadataBuilder_ != null || genericMetadata_ != null;
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     * @return The genericMetadata.
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        return genericMetadata_ == null ? com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      } else {
        return genericMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        genericMetadata_ = value;
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder setGenericMetadata(
        com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder builderForValue) {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = builderForValue.build();
        onChanged();
      } else {
        genericMetadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder mergeGenericMetadata(com.google.cloud.aiplatform.v1.GenericOperationMetadata value) {
      if (genericMetadataBuilder_ == null) {
        if (genericMetadata_ != null) {
          genericMetadata_ =
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.newBuilder(genericMetadata_).mergeFrom(value).buildPartial();
        } else {
          genericMetadata_ = value;
        }
        onChanged();
      } else {
        genericMetadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public Builder clearGenericMetadata() {
      if (genericMetadataBuilder_ == null) {
        genericMetadata_ = null;
        onChanged();
      } else {
        genericMetadata_ = null;
        genericMetadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder getGenericMetadataBuilder() {
      
      onChanged();
      return getGenericMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder() {
      if (genericMetadataBuilder_ != null) {
        return genericMetadataBuilder_.getMessageOrBuilder();
      } else {
        return genericMetadata_ == null ?
            com.google.cloud.aiplatform.v1.GenericOperationMetadata.getDefaultInstance() : genericMetadata_;
      }
    }
    /**
     * <pre>
     * Operation metadata for suggesting Trials.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder> 
        getGenericMetadataFieldBuilder() {
      if (genericMetadataBuilder_ == null) {
        genericMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GenericOperationMetadata, com.google.cloud.aiplatform.v1.GenericOperationMetadata.Builder, com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder>(
                getGenericMetadata(),
                getParentForChildren(),
                isClean());
        genericMetadata_ = null;
      }
      return genericMetadataBuilder_;
    }

    private java.lang.Object study_ = "";
    /**
     * <pre>
     * The name of the Study that the Trial belongs to.
     * </pre>
     *
     * <code>string study = 2;</code>
     * @return The study.
     */
    public java.lang.String getStudy() {
      java.lang.Object ref = study_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        study_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Study that the Trial belongs to.
     * </pre>
     *
     * <code>string study = 2;</code>
     * @return The bytes for study.
     */
    public com.google.protobuf.ByteString
        getStudyBytes() {
      java.lang.Object ref = study_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        study_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Study that the Trial belongs to.
     * </pre>
     *
     * <code>string study = 2;</code>
     * @param value The study to set.
     * @return This builder for chaining.
     */
    public Builder setStudy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      study_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Study that the Trial belongs to.
     * </pre>
     *
     * <code>string study = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudy() {
      
      study_ = getDefaultInstance().getStudy();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Study that the Trial belongs to.
     * </pre>
     *
     * <code>string study = 2;</code>
     * @param value The bytes for study to set.
     * @return This builder for chaining.
     */
    public Builder setStudyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      study_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object trial_ = "";
    /**
     * <pre>
     * The Trial name.
     * </pre>
     *
     * <code>string trial = 3;</code>
     * @return The trial.
     */
    public java.lang.String getTrial() {
      java.lang.Object ref = trial_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trial_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Trial name.
     * </pre>
     *
     * <code>string trial = 3;</code>
     * @return The bytes for trial.
     */
    public com.google.protobuf.ByteString
        getTrialBytes() {
      java.lang.Object ref = trial_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trial_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Trial name.
     * </pre>
     *
     * <code>string trial = 3;</code>
     * @param value The trial to set.
     * @return This builder for chaining.
     */
    public Builder setTrial(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      trial_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Trial name.
     * </pre>
     *
     * <code>string trial = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrial() {
      
      trial_ = getDefaultInstance().getTrial();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Trial name.
     * </pre>
     *
     * <code>string trial = 3;</code>
     * @param value The bytes for trial to set.
     * @return This builder for chaining.
     */
    public Builder setTrialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      trial_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata)
  private static final com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata();
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckTrialEarlyStoppingStateMetatdata>
      PARSER = new com.google.protobuf.AbstractParser<CheckTrialEarlyStoppingStateMetatdata>() {
    @java.lang.Override
    public CheckTrialEarlyStoppingStateMetatdata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckTrialEarlyStoppingStateMetatdata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckTrialEarlyStoppingStateMetatdata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateMetatdata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

