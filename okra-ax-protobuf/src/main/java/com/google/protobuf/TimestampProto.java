// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc/include/google/protobuf/timestamp.proto

package com.google.protobuf;

public final class TimestampProto {
  private TimestampProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Timestamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Timestamp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.protoc/include/google/protobuf/timesta" +
      "mp.proto\022\017google.protobuf\"+\n\tTimestamp\022\017" +
      "\n\007seconds\030\001 \001(\003\022\r\n\005nanos\030\002 \001(\005B~\n\023com.go" +
      "ogle.protobufB\016TimestampProtoP\001Z+github." +
      "com/golang/protobuf/ptypes/timestamp\370\001\001\242" +
      "\002\003GPB\252\002\036Google.Protobuf.WellKnownTypesb\006" +
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
    internal_static_google_protobuf_Timestamp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Timestamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Timestamp_descriptor,
        new java.lang.String[] { "Seconds", "Nanos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
