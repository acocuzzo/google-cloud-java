// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface AnalyzeSentimentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.AnalyzeSentimentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The overall sentiment of the input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 1;</code>
   */
  boolean hasDocumentSentiment();
  /**
   *
   *
   * <pre>
   * The overall sentiment of the input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 1;</code>
   */
  com.google.cloud.language.v1.Sentiment getDocumentSentiment();
  /**
   *
   *
   * <pre>
   * The overall sentiment of the input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Sentiment document_sentiment = 1;</code>
   */
  com.google.cloud.language.v1.SentimentOrBuilder getDocumentSentimentOrBuilder();

  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  java.lang.String getLanguage();
  /**
   *
   *
   * <pre>
   * The language of the text, which will be the same as the language specified
   * in the request or, if not specified, the automatically-detected language.
   * See [Document.language][google.cloud.language.v1.Document.language] field for more details.
   * </pre>
   *
   * <code>string language = 2;</code>
   */
  com.google.protobuf.ByteString getLanguageBytes();

  /**
   *
   *
   * <pre>
   * The sentiment for all the sentences in the document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 3;</code>
   */
  java.util.List<com.google.cloud.language.v1.Sentence> getSentencesList();
  /**
   *
   *
   * <pre>
   * The sentiment for all the sentences in the document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 3;</code>
   */
  com.google.cloud.language.v1.Sentence getSentences(int index);
  /**
   *
   *
   * <pre>
   * The sentiment for all the sentences in the document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 3;</code>
   */
  int getSentencesCount();
  /**
   *
   *
   * <pre>
   * The sentiment for all the sentences in the document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 3;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.SentenceOrBuilder>
      getSentencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The sentiment for all the sentences in the document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.Sentence sentences = 3;</code>
   */
  com.google.cloud.language.v1.SentenceOrBuilder getSentencesOrBuilder(int index);
}
