// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface JsonFileFormatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.JsonFileFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
   * @return The enum numeric value on the wire for schemaFileFormat.
   */
  int getSchemaFileFormatValue();
  /**
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
   * @return The schemaFileFormat.
   */
  com.google.cloud.datastream.v1alpha1.SchemaFileFormat getSchemaFileFormat();

  /**
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;</code>
   * @return The enum numeric value on the wire for compression.
   */
  int getCompressionValue();
  /**
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;</code>
   * @return The compression.
   */
  com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression getCompression();
}
