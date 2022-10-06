// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface CreateServiceAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.CreateServiceAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The accountId.
   */
  java.lang.String getAccountId();
  /**
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for accountId.
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   * @return The serviceAccount.
   */
  com.google.iam.admin.v1.ServiceAccount getServiceAccount();
  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to
   * create. Currently, only the following values are user assignable:
   * `display_name` and `description`.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   */
  com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder();
}
