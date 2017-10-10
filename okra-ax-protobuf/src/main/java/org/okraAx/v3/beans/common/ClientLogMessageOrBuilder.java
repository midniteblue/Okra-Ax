// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BeanCommon.proto

package org.okraAx.v3.beans.common;

public interface ClientLogMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.okraAx.v3.ClientLogMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *  携带的数据
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 1;</code>
   */
  int getContextCount();
  /**
   * <pre>
   *  携带的数据
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 1;</code>
   */
  boolean containsContext(
      java.lang.String key);
  /**
   * Use {@link #getContextMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getContext();
  /**
   * <pre>
   *  携带的数据
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getContextMap();
  /**
   * <pre>
   *  携带的数据
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 1;</code>
   */

  java.lang.String getContextOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   *  携带的数据
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 1;</code>
   */

  java.lang.String getContextOrThrow(
      java.lang.String key);

  /**
   * <pre>
   *  日志等级
   * </pre>
   *
   * <code>optional int32 logLevel = 2;</code>
   */
  int getLogLevel();

  /**
   * <pre>
   *  附加信息
   * </pre>
   *
   * <code>optional string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   *  附加信息
   * </pre>
   *
   * <code>optional string message = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   *  异常信息
   * </pre>
   *
   * <code>optional string throwable = 4;</code>
   */
  java.lang.String getThrowable();
  /**
   * <pre>
   *  异常信息
   * </pre>
   *
   * <code>optional string throwable = 4;</code>
   */
  com.google.protobuf.ByteString
      getThrowableBytes();
}
