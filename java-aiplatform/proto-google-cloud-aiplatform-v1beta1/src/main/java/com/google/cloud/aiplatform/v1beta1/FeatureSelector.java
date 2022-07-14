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
// source: google/cloud/aiplatform/v1beta1/feature_selector.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Selector for Features of an EntityType.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.FeatureSelector}
 */
public final class FeatureSelector extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.FeatureSelector)
    FeatureSelectorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FeatureSelector.newBuilder() to construct.
  private FeatureSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FeatureSelector() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FeatureSelector();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FeatureSelector(
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
              com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder subBuilder = null;
              if (idMatcher_ != null) {
                subBuilder = idMatcher_.toBuilder();
              }
              idMatcher_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.IdMatcher.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(idMatcher_);
                idMatcher_ = subBuilder.buildPartial();
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
    return com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto
        .internal_static_google_cloud_aiplatform_v1beta1_FeatureSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto
        .internal_static_google_cloud_aiplatform_v1beta1_FeatureSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.FeatureSelector.class,
            com.google.cloud.aiplatform.v1beta1.FeatureSelector.Builder.class);
  }

  public static final int ID_MATCHER_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.IdMatcher idMatcher_;
  /**
   *
   *
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the idMatcher field is set.
   */
  @java.lang.Override
  public boolean hasIdMatcher() {
    return idMatcher_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The idMatcher.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IdMatcher getIdMatcher() {
    return idMatcher_ == null
        ? com.google.cloud.aiplatform.v1beta1.IdMatcher.getDefaultInstance()
        : idMatcher_;
  }
  /**
   *
   *
   * <pre>
   * Required. Matches Features based on ID.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IdMatcherOrBuilder getIdMatcherOrBuilder() {
    return getIdMatcher();
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
    if (idMatcher_ != null) {
      output.writeMessage(1, getIdMatcher());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idMatcher_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIdMatcher());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.FeatureSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.FeatureSelector other =
        (com.google.cloud.aiplatform.v1beta1.FeatureSelector) obj;

    if (hasIdMatcher() != other.hasIdMatcher()) return false;
    if (hasIdMatcher()) {
      if (!getIdMatcher().equals(other.getIdMatcher())) return false;
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
    if (hasIdMatcher()) {
      hash = (37 * hash) + ID_MATCHER_FIELD_NUMBER;
      hash = (53 * hash) + getIdMatcher().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.FeatureSelector prototype) {
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
   * Selector for Features of an EntityType.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.FeatureSelector}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.FeatureSelector)
      com.google.cloud.aiplatform.v1beta1.FeatureSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto
          .internal_static_google_cloud_aiplatform_v1beta1_FeatureSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto
          .internal_static_google_cloud_aiplatform_v1beta1_FeatureSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.FeatureSelector.class,
              com.google.cloud.aiplatform.v1beta1.FeatureSelector.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.FeatureSelector.newBuilder()
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
      if (idMatcherBuilder_ == null) {
        idMatcher_ = null;
      } else {
        idMatcher_ = null;
        idMatcherBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto
          .internal_static_google_cloud_aiplatform_v1beta1_FeatureSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FeatureSelector getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.FeatureSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FeatureSelector build() {
      com.google.cloud.aiplatform.v1beta1.FeatureSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.FeatureSelector buildPartial() {
      com.google.cloud.aiplatform.v1beta1.FeatureSelector result =
          new com.google.cloud.aiplatform.v1beta1.FeatureSelector(this);
      if (idMatcherBuilder_ == null) {
        result.idMatcher_ = idMatcher_;
      } else {
        result.idMatcher_ = idMatcherBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.FeatureSelector) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.FeatureSelector) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.FeatureSelector other) {
      if (other == com.google.cloud.aiplatform.v1beta1.FeatureSelector.getDefaultInstance())
        return this;
      if (other.hasIdMatcher()) {
        mergeIdMatcher(other.getIdMatcher());
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
      com.google.cloud.aiplatform.v1beta1.FeatureSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.FeatureSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.IdMatcher idMatcher_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IdMatcher,
            com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder,
            com.google.cloud.aiplatform.v1beta1.IdMatcherOrBuilder>
        idMatcherBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the idMatcher field is set.
     */
    public boolean hasIdMatcher() {
      return idMatcherBuilder_ != null || idMatcher_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The idMatcher.
     */
    public com.google.cloud.aiplatform.v1beta1.IdMatcher getIdMatcher() {
      if (idMatcherBuilder_ == null) {
        return idMatcher_ == null
            ? com.google.cloud.aiplatform.v1beta1.IdMatcher.getDefaultInstance()
            : idMatcher_;
      } else {
        return idMatcherBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIdMatcher(com.google.cloud.aiplatform.v1beta1.IdMatcher value) {
      if (idMatcherBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        idMatcher_ = value;
        onChanged();
      } else {
        idMatcherBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIdMatcher(
        com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder builderForValue) {
      if (idMatcherBuilder_ == null) {
        idMatcher_ = builderForValue.build();
        onChanged();
      } else {
        idMatcherBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIdMatcher(com.google.cloud.aiplatform.v1beta1.IdMatcher value) {
      if (idMatcherBuilder_ == null) {
        if (idMatcher_ != null) {
          idMatcher_ =
              com.google.cloud.aiplatform.v1beta1.IdMatcher.newBuilder(idMatcher_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          idMatcher_ = value;
        }
        onChanged();
      } else {
        idMatcherBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIdMatcher() {
      if (idMatcherBuilder_ == null) {
        idMatcher_ = null;
        onChanged();
      } else {
        idMatcher_ = null;
        idMatcherBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder getIdMatcherBuilder() {

      onChanged();
      return getIdMatcherFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.IdMatcherOrBuilder getIdMatcherOrBuilder() {
      if (idMatcherBuilder_ != null) {
        return idMatcherBuilder_.getMessageOrBuilder();
      } else {
        return idMatcher_ == null
            ? com.google.cloud.aiplatform.v1beta1.IdMatcher.getDefaultInstance()
            : idMatcher_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Matches Features based on ID.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.IdMatcher id_matcher = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IdMatcher,
            com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder,
            com.google.cloud.aiplatform.v1beta1.IdMatcherOrBuilder>
        getIdMatcherFieldBuilder() {
      if (idMatcherBuilder_ == null) {
        idMatcherBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.IdMatcher,
                com.google.cloud.aiplatform.v1beta1.IdMatcher.Builder,
                com.google.cloud.aiplatform.v1beta1.IdMatcherOrBuilder>(
                getIdMatcher(), getParentForChildren(), isClean());
        idMatcher_ = null;
      }
      return idMatcherBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.FeatureSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.FeatureSelector)
  private static final com.google.cloud.aiplatform.v1beta1.FeatureSelector DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.FeatureSelector();
  }

  public static com.google.cloud.aiplatform.v1beta1.FeatureSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureSelector> PARSER =
      new com.google.protobuf.AbstractParser<FeatureSelector>() {
        @java.lang.Override
        public FeatureSelector parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FeatureSelector(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FeatureSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.FeatureSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
