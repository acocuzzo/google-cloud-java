// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

/**
 * <pre>
 * Parameters to control Optical Character Recognition (OCR) behavior.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.OcrParams}
 */
public final class OcrParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.OcrParams)
    OcrParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OcrParams.newBuilder() to construct.
  private OcrParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OcrParams() {
    languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OcrParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_OcrParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.OcrParams.class, com.google.cloud.documentai.v1beta1.OcrParams.Builder.class);
  }

  public static final int LANGUAGE_HINTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList languageHints_;
  /**
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return A list containing the languageHints.
   */
  public com.google.protobuf.ProtocolStringList
      getLanguageHintsList() {
    return languageHints_;
  }
  /**
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @return The count of languageHints.
   */
  public int getLanguageHintsCount() {
    return languageHints_.size();
  }
  /**
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the element to return.
   * @return The languageHints at the given index.
   */
  public java.lang.String getLanguageHints(int index) {
    return languageHints_.get(index);
  }
  /**
   * <pre>
   * List of languages to use for OCR. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Document processing returns an
   * error if one or more of the specified languages is not one of the
   * supported languages.
   * </pre>
   *
   * <code>repeated string language_hints = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageHints at the given index.
   */
  public com.google.protobuf.ByteString
      getLanguageHintsBytes(int index) {
    return languageHints_.getByteString(index);
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
    for (int i = 0; i < languageHints_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageHints_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < languageHints_.size(); i++) {
        dataSize += computeStringSizeNoTag(languageHints_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLanguageHintsList().size();
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.OcrParams)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.OcrParams other = (com.google.cloud.documentai.v1beta1.OcrParams) obj;

    if (!getLanguageHintsList()
        .equals(other.getLanguageHintsList())) return false;
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
    if (getLanguageHintsCount() > 0) {
      hash = (37 * hash) + LANGUAGE_HINTS_FIELD_NUMBER;
      hash = (53 * hash) + getLanguageHintsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta1.OcrParams parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta1.OcrParams prototype) {
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
   * Parameters to control Optical Character Recognition (OCR) behavior.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.OcrParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.OcrParams)
      com.google.cloud.documentai.v1beta1.OcrParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_OcrParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.OcrParams.class, com.google.cloud.documentai.v1beta1.OcrParams.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.OcrParams.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto.internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.OcrParams getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.OcrParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.OcrParams build() {
      com.google.cloud.documentai.v1beta1.OcrParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.OcrParams buildPartial() {
      com.google.cloud.documentai.v1beta1.OcrParams result = new com.google.cloud.documentai.v1beta1.OcrParams(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        languageHints_ = languageHints_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.languageHints_ = languageHints_;
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
      if (other instanceof com.google.cloud.documentai.v1beta1.OcrParams) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.OcrParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta1.OcrParams other) {
      if (other == com.google.cloud.documentai.v1beta1.OcrParams.getDefaultInstance()) return this;
      if (!other.languageHints_.isEmpty()) {
        if (languageHints_.isEmpty()) {
          languageHints_ = other.languageHints_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLanguageHintsIsMutable();
          languageHints_.addAll(other.languageHints_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureLanguageHintsIsMutable();
              languageHints_.add(s);
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

    private com.google.protobuf.LazyStringList languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLanguageHintsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        languageHints_ = new com.google.protobuf.LazyStringArrayList(languageHints_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return A list containing the languageHints.
     */
    public com.google.protobuf.ProtocolStringList
        getLanguageHintsList() {
      return languageHints_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return The count of languageHints.
     */
    public int getLanguageHintsCount() {
      return languageHints_.size();
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index of the element to return.
     * @return The languageHints at the given index.
     */
    public java.lang.String getLanguageHints(int index) {
      return languageHints_.get(index);
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the languageHints at the given index.
     */
    public com.google.protobuf.ByteString
        getLanguageHintsBytes(int index) {
      return languageHints_.getByteString(index);
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param index The index to set the value at.
     * @param value The languageHints to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageHints(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguageHintsIsMutable();
      languageHints_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param value The languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageHints(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLanguageHintsIsMutable();
      languageHints_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param values The languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addAllLanguageHints(
        java.lang.Iterable<java.lang.String> values) {
      ensureLanguageHintsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, languageHints_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageHints() {
      languageHints_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of languages to use for OCR. In most cases, an empty value
     * yields the best results since it enables automatic language detection. For
     * languages based on the Latin alphabet, setting `language_hints` is not
     * needed. In rare cases, when the language of the text in the image is known,
     * setting a hint will help get better results (although it will be a
     * significant hindrance if the hint is wrong). Document processing returns an
     * error if one or more of the specified languages is not one of the
     * supported languages.
     * </pre>
     *
     * <code>repeated string language_hints = 1;</code>
     * @param value The bytes of the languageHints to add.
     * @return This builder for chaining.
     */
    public Builder addLanguageHintsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLanguageHintsIsMutable();
      languageHints_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.OcrParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.OcrParams)
  private static final com.google.cloud.documentai.v1beta1.OcrParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.OcrParams();
  }

  public static com.google.cloud.documentai.v1beta1.OcrParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OcrParams>
      PARSER = new com.google.protobuf.AbstractParser<OcrParams>() {
    @java.lang.Override
    public OcrParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<OcrParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OcrParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.OcrParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

