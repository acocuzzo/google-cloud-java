// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommender_config.proto

package com.google.cloud.recommender.v1beta1;

public interface RecommenderGenerationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.RecommenderGenerationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   * @return The params.
   */
  com.google.protobuf.Struct getParams();
  /**
   * <pre>
   * Parameters for this RecommenderGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();
}
