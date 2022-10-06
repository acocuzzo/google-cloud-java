// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/products.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Represents a product's purchasable Stock Keeping Unit (SKU).
 * SKUs represent the different variations of the product. For example, Google
 * Workspace Business Standard and Google Workspace Business Plus are Google
 * Workspace product SKUs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.Sku}
 */
public final class Sku extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.Sku)
    SkuOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Sku.newBuilder() to construct.
  private Sku(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Sku() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Sku();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ProductsProto.internal_static_google_cloud_channel_v1_Sku_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ProductsProto.internal_static_google_cloud_channel_v1_Sku_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.Sku.class, com.google.cloud.channel.v1.Sku.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Resource Name of the SKU.
   * Format: products/{product_id}/skus/{sku_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource Name of the SKU.
   * Format: products/{product_id}/skus/{sku_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MARKETING_INFO_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.MarketingInfo marketingInfo_;
  /**
   * <pre>
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   * @return Whether the marketingInfo field is set.
   */
  @java.lang.Override
  public boolean hasMarketingInfo() {
    return marketingInfo_ != null;
  }
  /**
   * <pre>
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   * @return The marketingInfo.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.MarketingInfo getMarketingInfo() {
    return marketingInfo_ == null ? com.google.cloud.channel.v1.MarketingInfo.getDefaultInstance() : marketingInfo_;
  }
  /**
   * <pre>
   * Marketing information for the SKU.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.MarketingInfoOrBuilder getMarketingInfoOrBuilder() {
    return getMarketingInfo();
  }

  public static final int PRODUCT_FIELD_NUMBER = 3;
  private com.google.cloud.channel.v1.Product product_;
  /**
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   * @return The product.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Product getProduct() {
    return product_ == null ? com.google.cloud.channel.v1.Product.getDefaultInstance() : product_;
  }
  /**
   * <pre>
   * Product the SKU is associated with.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Product product = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (marketingInfo_ != null) {
      output.writeMessage(2, getMarketingInfo());
    }
    if (product_ != null) {
      output.writeMessage(3, getProduct());
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
    if (marketingInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMarketingInfo());
    }
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProduct());
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
    if (!(obj instanceof com.google.cloud.channel.v1.Sku)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.Sku other = (com.google.cloud.channel.v1.Sku) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasMarketingInfo() != other.hasMarketingInfo()) return false;
    if (hasMarketingInfo()) {
      if (!getMarketingInfo()
          .equals(other.getMarketingInfo())) return false;
    }
    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasMarketingInfo()) {
      hash = (37 * hash) + MARKETING_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getMarketingInfo().hashCode();
    }
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.Sku parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.Sku parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.Sku parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.Sku parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.Sku prototype) {
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
   * Represents a product's purchasable Stock Keeping Unit (SKU).
   * SKUs represent the different variations of the product. For example, Google
   * Workspace Business Standard and Google Workspace Business Plus are Google
   * Workspace product SKUs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.Sku}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.Sku)
      com.google.cloud.channel.v1.SkuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ProductsProto.internal_static_google_cloud_channel_v1_Sku_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ProductsProto.internal_static_google_cloud_channel_v1_Sku_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.Sku.class, com.google.cloud.channel.v1.Sku.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.Sku.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (marketingInfoBuilder_ == null) {
        marketingInfo_ = null;
      } else {
        marketingInfo_ = null;
        marketingInfoBuilder_ = null;
      }
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ProductsProto.internal_static_google_cloud_channel_v1_Sku_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Sku getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.Sku.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Sku build() {
      com.google.cloud.channel.v1.Sku result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Sku buildPartial() {
      com.google.cloud.channel.v1.Sku result = new com.google.cloud.channel.v1.Sku(this);
      result.name_ = name_;
      if (marketingInfoBuilder_ == null) {
        result.marketingInfo_ = marketingInfo_;
      } else {
        result.marketingInfo_ = marketingInfoBuilder_.build();
      }
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.Sku) {
        return mergeFrom((com.google.cloud.channel.v1.Sku)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.Sku other) {
      if (other == com.google.cloud.channel.v1.Sku.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasMarketingInfo()) {
        mergeMarketingInfo(other.getMarketingInfo());
      }
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMarketingInfoFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProductFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Resource Name of the SKU.
     * Format: products/{product_id}/skus/{sku_id}
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource Name of the SKU.
     * Format: products/{product_id}/skus/{sku_id}
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource Name of the SKU.
     * Format: products/{product_id}/skus/{sku_id}
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource Name of the SKU.
     * Format: products/{product_id}/skus/{sku_id}
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource Name of the SKU.
     * Format: products/{product_id}/skus/{sku_id}
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.MarketingInfo marketingInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.MarketingInfo, com.google.cloud.channel.v1.MarketingInfo.Builder, com.google.cloud.channel.v1.MarketingInfoOrBuilder> marketingInfoBuilder_;
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     * @return Whether the marketingInfo field is set.
     */
    public boolean hasMarketingInfo() {
      return marketingInfoBuilder_ != null || marketingInfo_ != null;
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     * @return The marketingInfo.
     */
    public com.google.cloud.channel.v1.MarketingInfo getMarketingInfo() {
      if (marketingInfoBuilder_ == null) {
        return marketingInfo_ == null ? com.google.cloud.channel.v1.MarketingInfo.getDefaultInstance() : marketingInfo_;
      } else {
        return marketingInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public Builder setMarketingInfo(com.google.cloud.channel.v1.MarketingInfo value) {
      if (marketingInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        marketingInfo_ = value;
        onChanged();
      } else {
        marketingInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public Builder setMarketingInfo(
        com.google.cloud.channel.v1.MarketingInfo.Builder builderForValue) {
      if (marketingInfoBuilder_ == null) {
        marketingInfo_ = builderForValue.build();
        onChanged();
      } else {
        marketingInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public Builder mergeMarketingInfo(com.google.cloud.channel.v1.MarketingInfo value) {
      if (marketingInfoBuilder_ == null) {
        if (marketingInfo_ != null) {
          marketingInfo_ =
            com.google.cloud.channel.v1.MarketingInfo.newBuilder(marketingInfo_).mergeFrom(value).buildPartial();
        } else {
          marketingInfo_ = value;
        }
        onChanged();
      } else {
        marketingInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public Builder clearMarketingInfo() {
      if (marketingInfoBuilder_ == null) {
        marketingInfo_ = null;
        onChanged();
      } else {
        marketingInfo_ = null;
        marketingInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public com.google.cloud.channel.v1.MarketingInfo.Builder getMarketingInfoBuilder() {
      
      onChanged();
      return getMarketingInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    public com.google.cloud.channel.v1.MarketingInfoOrBuilder getMarketingInfoOrBuilder() {
      if (marketingInfoBuilder_ != null) {
        return marketingInfoBuilder_.getMessageOrBuilder();
      } else {
        return marketingInfo_ == null ?
            com.google.cloud.channel.v1.MarketingInfo.getDefaultInstance() : marketingInfo_;
      }
    }
    /**
     * <pre>
     * Marketing information for the SKU.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.MarketingInfo marketing_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.MarketingInfo, com.google.cloud.channel.v1.MarketingInfo.Builder, com.google.cloud.channel.v1.MarketingInfoOrBuilder> 
        getMarketingInfoFieldBuilder() {
      if (marketingInfoBuilder_ == null) {
        marketingInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.MarketingInfo, com.google.cloud.channel.v1.MarketingInfo.Builder, com.google.cloud.channel.v1.MarketingInfoOrBuilder>(
                getMarketingInfo(),
                getParentForChildren(),
                isClean());
        marketingInfo_ = null;
      }
      return marketingInfoBuilder_;
    }

    private com.google.cloud.channel.v1.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.Product, com.google.cloud.channel.v1.Product.Builder, com.google.cloud.channel.v1.ProductOrBuilder> productBuilder_;
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     * @return The product.
     */
    public com.google.cloud.channel.v1.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? com.google.cloud.channel.v1.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public Builder setProduct(com.google.cloud.channel.v1.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public Builder setProduct(
        com.google.cloud.channel.v1.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public Builder mergeProduct(com.google.cloud.channel.v1.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            com.google.cloud.channel.v1.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public com.google.cloud.channel.v1.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    public com.google.cloud.channel.v1.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            com.google.cloud.channel.v1.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <pre>
     * Product the SKU is associated with.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Product product = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.Product, com.google.cloud.channel.v1.Product.Builder, com.google.cloud.channel.v1.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Product, com.google.cloud.channel.v1.Product.Builder, com.google.cloud.channel.v1.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.Sku)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Sku)
  private static final com.google.cloud.channel.v1.Sku DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.Sku();
  }

  public static com.google.cloud.channel.v1.Sku getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sku>
      PARSER = new com.google.protobuf.AbstractParser<Sku>() {
    @java.lang.Override
    public Sku parsePartialFrom(
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

  public static com.google.protobuf.Parser<Sku> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sku> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.Sku getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

