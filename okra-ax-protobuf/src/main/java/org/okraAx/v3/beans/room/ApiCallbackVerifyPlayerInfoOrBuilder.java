// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BeanRoom.proto

package org.okraAx.v3.beans.room;

public interface ApiCallbackVerifyPlayerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.okraAx.v3.ApiCallbackVerifyPlayerInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 ret = 1;</code>
   */
  int getRet();

  /**
   * <code>optional .org.okraAx.v3.MsgPlayerInfo info = 2;</code>
   */
  boolean hasInfo();
  /**
   * <code>optional .org.okraAx.v3.MsgPlayerInfo info = 2;</code>
   */
  org.okraAx.v3.beans.room.MsgPlayerInfo getInfo();
  /**
   * <code>optional .org.okraAx.v3.MsgPlayerInfo info = 2;</code>
   */
  org.okraAx.v3.beans.room.MsgPlayerInfoOrBuilder getInfoOrBuilder();
}
