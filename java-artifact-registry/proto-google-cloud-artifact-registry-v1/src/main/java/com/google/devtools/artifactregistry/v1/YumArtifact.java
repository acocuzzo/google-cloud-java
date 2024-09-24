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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * A detailed representation of a Yum artifact.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.YumArtifact}
 */
public final class YumArtifact extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.YumArtifact)
    YumArtifactOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use YumArtifact.newBuilder() to construct.
  private YumArtifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private YumArtifact() {
    name_ = "";
    packageName_ = "";
    packageType_ = 0;
    architecture_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new YumArtifact();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.YumArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.YumArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.YumArtifact.class,
            com.google.devtools.artifactregistry.v1.YumArtifact.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Package type is either binary or source.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.artifactregistry.v1.YumArtifact.PackageType}
   */
  public enum PackageType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Package type is not specified.
     * </pre>
     *
     * <code>PACKAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    PACKAGE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Binary package (.rpm).
     * </pre>
     *
     * <code>BINARY = 1;</code>
     */
    BINARY(1),
    /**
     *
     *
     * <pre>
     * Source package (.srpm).
     * </pre>
     *
     * <code>SOURCE = 2;</code>
     */
    SOURCE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Package type is not specified.
     * </pre>
     *
     * <code>PACKAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int PACKAGE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Binary package (.rpm).
     * </pre>
     *
     * <code>BINARY = 1;</code>
     */
    public static final int BINARY_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Source package (.srpm).
     * </pre>
     *
     * <code>SOURCE = 2;</code>
     */
    public static final int SOURCE_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PackageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PackageType forNumber(int value) {
      switch (value) {
        case 0:
          return PACKAGE_TYPE_UNSPECIFIED;
        case 1:
          return BINARY;
        case 2:
          return SOURCE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PackageType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<PackageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PackageType>() {
          public PackageType findValueByNumber(int number) {
            return PackageType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.YumArtifact.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final PackageType[] VALUES = values();

    public static PackageType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PackageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.artifactregistry.v1.YumArtifact.PackageType)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The Artifact Registry resource name of the artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The Artifact Registry resource name of the artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object packageName_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The packageName.
   */
  @java.lang.Override
  public java.lang.String getPackageName() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The yum package name of the artifact.
   * </pre>
   *
   * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for packageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageNameBytes() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PACKAGE_TYPE_FIELD_NUMBER = 3;
  private int packageType_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for packageType.
   */
  @java.lang.Override
  public int getPackageTypeValue() {
    return packageType_;
  }
  /**
   *
   *
   * <pre>
   * Output only. An artifact is a binary or source package.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The packageType.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.YumArtifact.PackageType getPackageType() {
    com.google.devtools.artifactregistry.v1.YumArtifact.PackageType result =
        com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.forNumber(packageType_);
    return result == null
        ? com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.UNRECOGNIZED
        : result;
  }

  public static final int ARCHITECTURE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object architecture_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The architecture.
   */
  @java.lang.Override
  public java.lang.String getArchitecture() {
    java.lang.Object ref = architecture_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      architecture_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Operating system architecture of the artifact.
   * </pre>
   *
   * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for architecture.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getArchitectureBytes() {
    java.lang.Object ref = architecture_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      architecture_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, packageName_);
    }
    if (packageType_
        != com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.PACKAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(architecture_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, architecture_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(packageName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, packageName_);
    }
    if (packageType_
        != com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.PACKAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, packageType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(architecture_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, architecture_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.YumArtifact)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.YumArtifact other =
        (com.google.devtools.artifactregistry.v1.YumArtifact) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getPackageName().equals(other.getPackageName())) return false;
    if (packageType_ != other.packageType_) return false;
    if (!getArchitecture().equals(other.getArchitecture())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PACKAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPackageName().hashCode();
    hash = (37 * hash) + PACKAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + packageType_;
    hash = (37 * hash) + ARCHITECTURE_FIELD_NUMBER;
    hash = (53 * hash) + getArchitecture().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact parseFrom(
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

  public static Builder newBuilder(com.google.devtools.artifactregistry.v1.YumArtifact prototype) {
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
   * A detailed representation of a Yum artifact.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.YumArtifact}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.YumArtifact)
      com.google.devtools.artifactregistry.v1.YumArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.YumArtifact.class,
              com.google.devtools.artifactregistry.v1.YumArtifact.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1.YumArtifact.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      packageName_ = "";
      packageType_ = 0;
      architecture_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.YumArtifact getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.YumArtifact.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.YumArtifact build() {
      com.google.devtools.artifactregistry.v1.YumArtifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.YumArtifact buildPartial() {
      com.google.devtools.artifactregistry.v1.YumArtifact result =
          new com.google.devtools.artifactregistry.v1.YumArtifact(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.artifactregistry.v1.YumArtifact result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.packageName_ = packageName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.packageType_ = packageType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.architecture_ = architecture_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.artifactregistry.v1.YumArtifact) {
        return mergeFrom((com.google.devtools.artifactregistry.v1.YumArtifact) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1.YumArtifact other) {
      if (other == com.google.devtools.artifactregistry.v1.YumArtifact.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPackageName().isEmpty()) {
        packageName_ = other.packageName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.packageType_ != 0) {
        setPackageTypeValue(other.getPackageTypeValue());
      }
      if (!other.getArchitecture().isEmpty()) {
        architecture_ = other.architecture_;
        bitField0_ |= 0x00000008;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                packageName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                packageType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                architecture_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The Artifact Registry resource name of the artifact.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object packageName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The packageName.
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for packageName.
     */
    public com.google.protobuf.ByteString getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      packageName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageName() {
      packageName_ = getDefaultInstance().getPackageName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The yum package name of the artifact.
     * </pre>
     *
     * <code>string package_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      packageName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int packageType_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>
     * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for packageType.
     */
    @java.lang.Override
    public int getPackageTypeValue() {
      return packageType_;
    }
    /**
     *
     *
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>
     * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageTypeValue(int value) {
      packageType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>
     * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The packageType.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.YumArtifact.PackageType getPackageType() {
      com.google.devtools.artifactregistry.v1.YumArtifact.PackageType result =
          com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.forNumber(packageType_);
      return result == null
          ? com.google.devtools.artifactregistry.v1.YumArtifact.PackageType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>
     * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The packageType to set.
     * @return This builder for chaining.
     */
    public Builder setPackageType(
        com.google.devtools.artifactregistry.v1.YumArtifact.PackageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      packageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An artifact is a binary or source package.
     * </pre>
     *
     * <code>
     * .google.devtools.artifactregistry.v1.YumArtifact.PackageType package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      packageType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object architecture_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The architecture.
     */
    public java.lang.String getArchitecture() {
      java.lang.Object ref = architecture_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        architecture_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for architecture.
     */
    public com.google.protobuf.ByteString getArchitectureBytes() {
      java.lang.Object ref = architecture_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        architecture_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The architecture to set.
     * @return This builder for chaining.
     */
    public Builder setArchitecture(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      architecture_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearArchitecture() {
      architecture_ = getDefaultInstance().getArchitecture();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Operating system architecture of the artifact.
     * </pre>
     *
     * <code>string architecture = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for architecture to set.
     * @return This builder for chaining.
     */
    public Builder setArchitectureBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      architecture_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.YumArtifact)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.YumArtifact)
  private static final com.google.devtools.artifactregistry.v1.YumArtifact DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.YumArtifact();
  }

  public static com.google.devtools.artifactregistry.v1.YumArtifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YumArtifact> PARSER =
      new com.google.protobuf.AbstractParser<YumArtifact>() {
        @java.lang.Override
        public YumArtifact parsePartialFrom(
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

  public static com.google.protobuf.Parser<YumArtifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YumArtifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.YumArtifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
