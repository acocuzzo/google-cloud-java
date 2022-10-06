// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/model_service.proto

package com.google.cloud.retail.v2beta;

public interface UpdateModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.UpdateModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The body of the updated
   * [Model][google.cloud.retail.v2beta.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * Required. The body of the updated
   * [Model][google.cloud.retail.v2beta.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The model.
   */
  com.google.cloud.retail.v2beta.Model getModel();
  /**
   * <pre>
   * Required. The body of the updated
   * [Model][google.cloud.retail.v2beta.Model].
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2beta.ModelOrBuilder getModelOrBuilder();

  /**
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Indicates which fields in the provided 'model' to
   * update. If not set, by default updates all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
