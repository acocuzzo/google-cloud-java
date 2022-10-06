// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_text_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

/**
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs}
 */
public final class AutoMlTextClassificationInputs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)
    AutoMlTextClassificationInputsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoMlTextClassificationInputs.newBuilder() to construct.
  private AutoMlTextClassificationInputs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoMlTextClassificationInputs() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoMlTextClassificationInputs();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLTextClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLTextClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.Builder.class);
  }

  public static final int MULTI_LABEL_FIELD_NUMBER = 1;
  private boolean multiLabel_;
  /**
   * <code>bool multi_label = 1;</code>
   * @return The multiLabel.
   */
  @java.lang.Override
  public boolean getMultiLabel() {
    return multiLabel_;
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
    if (multiLabel_ != false) {
      output.writeBool(1, multiLabel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (multiLabel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, multiLabel_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs other = (com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs) obj;

    if (getMultiLabel()
        != other.getMultiLabel()) return false;
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
    hash = (37 * hash) + MULTI_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMultiLabel());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs prototype) {
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
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLTextClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLTextClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.class, com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      multiLabel_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMLTextClassificationProto.internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlTextClassificationInputs_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs build() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs buildPartial() {
      com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs result = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs(this);
      result.multiLabel_ = multiLabel_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs other) {
      if (other == com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs.getDefaultInstance()) return this;
      if (other.getMultiLabel() != false) {
        setMultiLabel(other.getMultiLabel());
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
              multiLabel_ = input.readBool();

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

    private boolean multiLabel_ ;
    /**
     * <code>bool multi_label = 1;</code>
     * @return The multiLabel.
     */
    @java.lang.Override
    public boolean getMultiLabel() {
      return multiLabel_;
    }
    /**
     * <code>bool multi_label = 1;</code>
     * @param value The multiLabel to set.
     * @return This builder for chaining.
     */
    public Builder setMultiLabel(boolean value) {
      
      multiLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool multi_label = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiLabel() {
      
      multiLabel_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs)
  private static final com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs();
  }

  public static com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoMlTextClassificationInputs>
      PARSER = new com.google.protobuf.AbstractParser<AutoMlTextClassificationInputs>() {
    @java.lang.Override
    public AutoMlTextClassificationInputs parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoMlTextClassificationInputs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoMlTextClassificationInputs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlTextClassificationInputs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

