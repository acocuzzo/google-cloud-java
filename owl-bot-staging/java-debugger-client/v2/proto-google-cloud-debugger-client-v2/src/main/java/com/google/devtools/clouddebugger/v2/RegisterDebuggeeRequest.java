// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to register a debuggee.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.RegisterDebuggeeRequest}
 */
public final class RegisterDebuggeeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)
    RegisterDebuggeeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterDebuggeeRequest.newBuilder() to construct.
  private RegisterDebuggeeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterDebuggeeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterDebuggeeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.class, com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.Builder.class);
  }

  public static final int DEBUGGEE_FIELD_NUMBER = 1;
  private com.google.devtools.clouddebugger.v2.Debuggee debuggee_;
  /**
   * <pre>
   * Required. Debuggee information to register.
   * The fields `project`, `uniquifier`, `description` and `agent_version`
   * of the debuggee must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the debuggee field is set.
   */
  @java.lang.Override
  public boolean hasDebuggee() {
    return debuggee_ != null;
  }
  /**
   * <pre>
   * Required. Debuggee information to register.
   * The fields `project`, `uniquifier`, `description` and `agent_version`
   * of the debuggee must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The debuggee.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.Debuggee getDebuggee() {
    return debuggee_ == null ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance() : debuggee_;
  }
  /**
   * <pre>
   * Required. Debuggee information to register.
   * The fields `project`, `uniquifier`, `description` and `agent_version`
   * of the debuggee must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeeOrBuilder() {
    return getDebuggee();
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
    if (debuggee_ != null) {
      output.writeMessage(1, getDebuggee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (debuggee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDebuggee());
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest other = (com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest) obj;

    if (hasDebuggee() != other.hasDebuggee()) return false;
    if (hasDebuggee()) {
      if (!getDebuggee()
          .equals(other.getDebuggee())) return false;
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
    if (hasDebuggee()) {
      hash = (37 * hash) + DEBUGGEE_FIELD_NUMBER;
      hash = (53 * hash) + getDebuggee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest prototype) {
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
   * Request to register a debuggee.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.RegisterDebuggeeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.class, com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (debuggeeBuilder_ == null) {
        debuggee_ = null;
      } else {
        debuggee_ = null;
        debuggeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_RegisterDebuggeeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest build() {
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest result = new com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest(this);
      if (debuggeeBuilder_ == null) {
        result.debuggee_ = debuggee_;
      } else {
        result.debuggee_ = debuggeeBuilder_.build();
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
      if (other instanceof com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.getDefaultInstance()) return this;
      if (other.hasDebuggee()) {
        mergeDebuggee(other.getDebuggee());
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
                  getDebuggeeFieldBuilder().getBuilder(),
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

    private com.google.devtools.clouddebugger.v2.Debuggee debuggee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Debuggee, com.google.devtools.clouddebugger.v2.Debuggee.Builder, com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder> debuggeeBuilder_;
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the debuggee field is set.
     */
    public boolean hasDebuggee() {
      return debuggeeBuilder_ != null || debuggee_ != null;
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The debuggee.
     */
    public com.google.devtools.clouddebugger.v2.Debuggee getDebuggee() {
      if (debuggeeBuilder_ == null) {
        return debuggee_ == null ? com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance() : debuggee_;
      } else {
        return debuggeeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDebuggee(com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        debuggee_ = value;
        onChanged();
      } else {
        debuggeeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDebuggee(
        com.google.devtools.clouddebugger.v2.Debuggee.Builder builderForValue) {
      if (debuggeeBuilder_ == null) {
        debuggee_ = builderForValue.build();
        onChanged();
      } else {
        debuggeeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDebuggee(com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeeBuilder_ == null) {
        if (debuggee_ != null) {
          debuggee_ =
            com.google.devtools.clouddebugger.v2.Debuggee.newBuilder(debuggee_).mergeFrom(value).buildPartial();
        } else {
          debuggee_ = value;
        }
        onChanged();
      } else {
        debuggeeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDebuggee() {
      if (debuggeeBuilder_ == null) {
        debuggee_ = null;
        onChanged();
      } else {
        debuggee_ = null;
        debuggeeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee.Builder getDebuggeeBuilder() {
      
      onChanged();
      return getDebuggeeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeeOrBuilder() {
      if (debuggeeBuilder_ != null) {
        return debuggeeBuilder_.getMessageOrBuilder();
      } else {
        return debuggee_ == null ?
            com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance() : debuggee_;
      }
    }
    /**
     * <pre>
     * Required. Debuggee information to register.
     * The fields `project`, `uniquifier`, `description` and `agent_version`
     * of the debuggee must be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Debuggee debuggee = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Debuggee, com.google.devtools.clouddebugger.v2.Debuggee.Builder, com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder> 
        getDebuggeeFieldBuilder() {
      if (debuggeeBuilder_ == null) {
        debuggeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Debuggee, com.google.devtools.clouddebugger.v2.Debuggee.Builder, com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>(
                getDebuggee(),
                getParentForChildren(),
                isClean());
        debuggee_ = null;
      }
      return debuggeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.RegisterDebuggeeRequest)
  private static final com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest();
  }

  public static com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterDebuggeeRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterDebuggeeRequest>() {
    @java.lang.Override
    public RegisterDebuggeeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterDebuggeeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterDebuggeeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

