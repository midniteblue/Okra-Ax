// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FyChessMessage.proto

package org.okraAx.v3.chess.beans;

public final class FyChessMi {
  private FyChessMi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_MsgChessMove_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_MsgChessMove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ReqChessJoin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ReqChessJoin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ResChessJoin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ResChessJoin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ResChessMove_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ResChessMove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ReqChessRoomInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ReqChessRoomInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ResChessRoomInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ResChessRoomInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ResChessRoomInfo_RoomInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ResChessRoomInfo_RoomInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_PushChessMove_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_PushChessMove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_PushReport_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_PushReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_PushChessInit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_PushChessInit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FyChessMessage.proto\022\rorg.okraAx.v3\"F\n" +
      "\014MsgChessMove\022\r\n\005fromX\030\001 \001(\005\022\r\n\005fromY\030\002 " +
      "\001(\005\022\013\n\003toX\030\003 \001(\005\022\013\n\003toY\030\004 \001(\005\",\n\014ReqChes" +
      "sJoin\022\014\n\004name\030\001 \001(\t\022\016\n\006roomId\030\002 \001(\003\"\034\n\014R" +
      "esChessJoin\022\014\n\004side\030\001 \001(\005\"\037\n\014ResChessMov" +
      "e\022\017\n\007movable\030\001 \001(\010\"\022\n\020ReqChessRoomInfo\"t" +
      "\n\020ResChessRoomInfo\0227\n\005infos\030\001 \003(\0132(.org." +
      "okraAx.v3.ResChessRoomInfo.RoomInfo\032\'\n\010R" +
      "oomInfo\022\n\n\002id\030\001 \001(\005\022\017\n\007players\030\002 \003(\t\"G\n\r" +
      "PushChessMove\022\r\n\005fromX\030\001 \001(\005\022\r\n\005fromY\030\002 ",
      "\001(\005\022\013\n\003toX\030\003 \001(\005\022\013\n\003toY\030\004 \001(\005\"\032\n\nPushRep" +
      "ort\022\014\n\004side\030\001 \001(\005\"\017\n\rPushChessInitB*\n\031or" +
      "g.okraAx.v3.chess.beansB\tFyChessMiH\001P\001b\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_okraAx_v3_MsgChessMove_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_okraAx_v3_MsgChessMove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_MsgChessMove_descriptor,
        new java.lang.String[] { "FromX", "FromY", "ToX", "ToY", });
    internal_static_org_okraAx_v3_ReqChessJoin_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_okraAx_v3_ReqChessJoin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ReqChessJoin_descriptor,
        new java.lang.String[] { "Name", "RoomId", });
    internal_static_org_okraAx_v3_ResChessJoin_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_okraAx_v3_ResChessJoin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ResChessJoin_descriptor,
        new java.lang.String[] { "Side", });
    internal_static_org_okraAx_v3_ResChessMove_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_okraAx_v3_ResChessMove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ResChessMove_descriptor,
        new java.lang.String[] { "Movable", });
    internal_static_org_okraAx_v3_ReqChessRoomInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_okraAx_v3_ReqChessRoomInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ReqChessRoomInfo_descriptor,
        new java.lang.String[] { });
    internal_static_org_okraAx_v3_ResChessRoomInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_okraAx_v3_ResChessRoomInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ResChessRoomInfo_descriptor,
        new java.lang.String[] { "Infos", });
    internal_static_org_okraAx_v3_ResChessRoomInfo_RoomInfo_descriptor =
      internal_static_org_okraAx_v3_ResChessRoomInfo_descriptor.getNestedTypes().get(0);
    internal_static_org_okraAx_v3_ResChessRoomInfo_RoomInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ResChessRoomInfo_RoomInfo_descriptor,
        new java.lang.String[] { "Id", "Players", });
    internal_static_org_okraAx_v3_PushChessMove_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_okraAx_v3_PushChessMove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_PushChessMove_descriptor,
        new java.lang.String[] { "FromX", "FromY", "ToX", "ToY", });
    internal_static_org_okraAx_v3_PushReport_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_okraAx_v3_PushReport_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_PushReport_descriptor,
        new java.lang.String[] { "Side", });
    internal_static_org_okraAx_v3_PushChessInit_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_okraAx_v3_PushChessInit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_PushChessInit_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
