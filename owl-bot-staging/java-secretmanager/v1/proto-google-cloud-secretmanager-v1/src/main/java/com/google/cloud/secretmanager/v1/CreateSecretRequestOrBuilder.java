// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/service.proto

package com.google.cloud.secretmanager.v1;

public interface CreateSecretRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.CreateSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the project to associate with the
   * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the project to associate with the
   * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. This must be unique within the project.
   * A secret ID is a string with a maximum length of 255 characters and can
   * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
   * underscore (`_`) characters.
   * </pre>
   *
   * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The secretId.
   */
  java.lang.String getSecretId();
  /**
   * <pre>
   * Required. This must be unique within the project.
   * A secret ID is a string with a maximum length of 255 characters and can
   * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
   * underscore (`_`) characters.
   * </pre>
   *
   * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for secretId.
   */
  com.google.protobuf.ByteString
      getSecretIdBytes();

  /**
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The secret.
   */
  com.google.cloud.secretmanager.v1.Secret getSecret();
  /**
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.secretmanager.v1.SecretOrBuilder getSecretOrBuilder();
}
