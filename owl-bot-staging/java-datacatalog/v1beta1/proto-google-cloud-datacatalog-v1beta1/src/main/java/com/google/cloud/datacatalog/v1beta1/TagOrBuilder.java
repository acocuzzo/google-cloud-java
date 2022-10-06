// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public interface TagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the tag in URL format. Example:
   * * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id}
   * where `tag_id` is a system-generated identifier.
   * Note that this Tag may not actually be stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the tag in URL format. Example:
   * * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id}
   * where `tag_id` is a system-generated identifier.
   * Note that this Tag may not actually be stored in the location in this name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The resource name of the tag template that this tag uses. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The template.
   */
  java.lang.String getTemplate();
  /**
   * <pre>
   * Required. The resource name of the tag template that this tag uses. Example:
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for template.
   */
  com.google.protobuf.ByteString
      getTemplateBytes();

  /**
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The templateDisplayName.
   */
  java.lang.String getTemplateDisplayName();
  /**
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for templateDisplayName.
   */
  com.google.protobuf.ByteString
      getTemplateDisplayNameBytes();

  /**
   * <pre>
   * Resources like Entry can have schemas associated with them. This scope
   * allows users to attach tags to an individual column based on that schema.
   * For attaching a tag to a nested column, use `.` to separate the column
   * names. Example:
   * * `outer_column.inner_column`
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return Whether the column field is set.
   */
  boolean hasColumn();
  /**
   * <pre>
   * Resources like Entry can have schemas associated with them. This scope
   * allows users to attach tags to an individual column based on that schema.
   * For attaching a tag to a nested column, use `.` to separate the column
   * names. Example:
   * * `outer_column.inner_column`
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   * <pre>
   * Resources like Entry can have schemas associated with them. This scope
   * allows users to attach tags to an individual column based on that schema.
   * For attaching a tag to a nested column, use `.` to separate the column
   * names. Example:
   * * `outer_column.inner_column`
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString
      getColumnBytes();

  /**
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional information
   * about that field. Valid field IDs are defined by the tag's template. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional information
   * about that field. Valid field IDs are defined by the tag's template. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.TagField>
  getFields();
  /**
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional information
   * about that field. Valid field IDs are defined by the tag's template. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1beta1.TagField>
  getFieldsMap();
  /**
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional information
   * about that field. Valid field IDs are defined by the tag's template. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  /* nullable */
com.google.cloud.datacatalog.v1beta1.TagField getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.datacatalog.v1beta1.TagField defaultValue);
  /**
   * <pre>
   * Required. This maps the ID of a tag field to the value of and additional information
   * about that field. Valid field IDs are defined by the tag's template. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1beta1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  com.google.cloud.datacatalog.v1beta1.TagField getFieldsOrThrow(
      java.lang.String key);

  public com.google.cloud.datacatalog.v1beta1.Tag.ScopeCase getScopeCase();
}
