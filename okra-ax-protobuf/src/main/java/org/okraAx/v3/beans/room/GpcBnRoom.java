// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BeanRoom.proto

package org.okraAx.v3.beans.room;

public final class GpcBnRoom {
  private GpcBnRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_ApiCallbackVerifyPlayerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_ApiCallbackVerifyPlayerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_MsgPlayerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_MsgPlayerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_okraAx_v3_MsgPlayerInfo_ItemsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_okraAx_v3_MsgPlayerInfo_ItemsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016BeanRoom.proto\022\rorg.okraAx.v3\032\013AxAny.p" +
      "roto\"V\n\033ApiCallbackVerifyPlayerInfo\022\013\n\003r" +
      "et\030\001 \001(\005\022*\n\004info\030\002 \001(\0132\034.org.okraAx.v3.M" +
      "sgPlayerInfo\"\303\001\n\rMsgPlayerInfo\022\013\n\003uid\030\001 " +
      "\001(\003\022\014\n\004name\030\002 \001(\t\022\016\n\006figure\030\003 \001(\005\022!\n\003ext" +
      "\030\004 \001(\0132\024.org.okraAx.v3.AxAny\0226\n\005items\030\005 " +
      "\003(\0132\'.org.okraAx.v3.MsgPlayerInfo.ItemsE" +
      "ntry\032,\n\nItemsEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value" +
      "\030\002 \001(\005:\0028\001B)\n\030org.okraAx.v3.beans.roomB\t" +
      "GpcBnRoomH\001P\001b\006proto3"
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
          org.okraAx.v3.AxAnyProto.getDescriptor(),
        }, assigner);
    internal_static_org_okraAx_v3_ApiCallbackVerifyPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_okraAx_v3_ApiCallbackVerifyPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_ApiCallbackVerifyPlayerInfo_descriptor,
        new java.lang.String[] { "Ret", "Info", });
    internal_static_org_okraAx_v3_MsgPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_okraAx_v3_MsgPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_MsgPlayerInfo_descriptor,
        new java.lang.String[] { "Uid", "Name", "Figure", "Ext", "Items", });
    internal_static_org_okraAx_v3_MsgPlayerInfo_ItemsEntry_descriptor =
      internal_static_org_okraAx_v3_MsgPlayerInfo_descriptor.getNestedTypes().get(0);
    internal_static_org_okraAx_v3_MsgPlayerInfo_ItemsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_okraAx_v3_MsgPlayerInfo_ItemsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.okraAx.v3.AxAnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
