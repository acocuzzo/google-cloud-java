// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/channel_partner_links.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * ChannelPartnerLinkState represents state of a channel partner link.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.ChannelPartnerLinkState}
 */
public enum ChannelPartnerLinkState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>CHANNEL_PARTNER_LINK_STATE_UNSPECIFIED = 0;</code>
   */
  CHANNEL_PARTNER_LINK_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * An invitation has been sent to the reseller to create a channel partner
   * link.
   * </pre>
   *
   * <code>INVITED = 1;</code>
   */
  INVITED(1),
  /**
   * <pre>
   * Status when the reseller is active.
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  ACTIVE(2),
  /**
   * <pre>
   * Status when the reseller has been revoked by the distributor.
   * </pre>
   *
   * <code>REVOKED = 3;</code>
   */
  REVOKED(3),
  /**
   * <pre>
   * Status when the reseller is suspended by Google or distributor.
   * </pre>
   *
   * <code>SUSPENDED = 4;</code>
   */
  SUSPENDED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>CHANNEL_PARTNER_LINK_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int CHANNEL_PARTNER_LINK_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * An invitation has been sent to the reseller to create a channel partner
   * link.
   * </pre>
   *
   * <code>INVITED = 1;</code>
   */
  public static final int INVITED_VALUE = 1;
  /**
   * <pre>
   * Status when the reseller is active.
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  public static final int ACTIVE_VALUE = 2;
  /**
   * <pre>
   * Status when the reseller has been revoked by the distributor.
   * </pre>
   *
   * <code>REVOKED = 3;</code>
   */
  public static final int REVOKED_VALUE = 3;
  /**
   * <pre>
   * Status when the reseller is suspended by Google or distributor.
   * </pre>
   *
   * <code>SUSPENDED = 4;</code>
   */
  public static final int SUSPENDED_VALUE = 4;


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
  public static ChannelPartnerLinkState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChannelPartnerLinkState forNumber(int value) {
    switch (value) {
      case 0: return CHANNEL_PARTNER_LINK_STATE_UNSPECIFIED;
      case 1: return INVITED;
      case 2: return ACTIVE;
      case 3: return REVOKED;
      case 4: return SUSPENDED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChannelPartnerLinkState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChannelPartnerLinkState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChannelPartnerLinkState>() {
          public ChannelPartnerLinkState findValueByNumber(int number) {
            return ChannelPartnerLinkState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.channel.v1.ChannelPartnerLinksProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ChannelPartnerLinkState[] VALUES = values();

  public static ChannelPartnerLinkState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ChannelPartnerLinkState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.ChannelPartnerLinkState)
}

