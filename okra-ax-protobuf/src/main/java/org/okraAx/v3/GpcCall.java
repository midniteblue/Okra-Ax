// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Gpc.proto

package org.okraAx.v3;

/**
 * <pre>
 *  Gpc Call Message.
 *  Async remote produce call based on GPB(Google Protocol Buffers).
 * </pre>
 *
 * Protobuf type {@code org.okraAx.v3.GpcCall}
 */
public  final class GpcCall extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.okraAx.v3.GpcCall)
    GpcCallOrBuilder {
  // Use GpcCall.newBuilder() to construct.
  private GpcCall(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GpcCall() {
    method_ = "";
    params_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GpcCall(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 18: {

            params_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.okraAx.v3.Gpc.internal_static_org_okraAx_v3_GpcCall_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.okraAx.v3.Gpc.internal_static_org_okraAx_v3_GpcCall_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.okraAx.v3.GpcCall.class, org.okraAx.v3.GpcCall.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  private volatile java.lang.Object method_;
  /**
   * <pre>
   *  the remote call produce name.
   * </pre>
   *
   * <code>optional string method = 1;</code>
   */
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *  the remote call produce name.
   * </pre>
   *
   * <code>optional string method = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString params_;
  /**
   * <pre>
   *  the request param message. the message must be gpb message.
   *  the gpb param message will be covert to args array for java method.
   *  example:
   *      take the {&#64;link GpcError} in this proto file as an example.
   *  define the gpb service:
   *  ...
   *  service  XXXService {
   *      rpc doAction (GpcError) returns (GpcVoid);
   *      ... define any more rpc.
   *  }
   *  map the java method:
   *      void doAction(int state, String msg).
   * </pre>
   *
   * <code>optional bytes params = 2;</code>
   */
  public com.google.protobuf.ByteString getParams() {
    return params_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
    }
    if (!params_.isEmpty()) {
      output.writeBytes(2, params_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
    }
    if (!params_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, params_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.okraAx.v3.GpcCall)) {
      return super.equals(obj);
    }
    org.okraAx.v3.GpcCall other = (org.okraAx.v3.GpcCall) obj;

    boolean result = true;
    result = result && getMethod()
        .equals(other.getMethod());
    result = result && getParams()
        .equals(other.getParams());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    hash = (37 * hash) + PARAMS_FIELD_NUMBER;
    hash = (53 * hash) + getParams().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.okraAx.v3.GpcCall parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.okraAx.v3.GpcCall parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.okraAx.v3.GpcCall parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.okraAx.v3.GpcCall parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.okraAx.v3.GpcCall parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.GpcCall parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.okraAx.v3.GpcCall parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.GpcCall parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.okraAx.v3.GpcCall parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.GpcCall parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.okraAx.v3.GpcCall prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *  Gpc Call Message.
   *  Async remote produce call based on GPB(Google Protocol Buffers).
   * </pre>
   *
   * Protobuf type {@code org.okraAx.v3.GpcCall}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.okraAx.v3.GpcCall)
      org.okraAx.v3.GpcCallOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.okraAx.v3.Gpc.internal_static_org_okraAx_v3_GpcCall_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.okraAx.v3.Gpc.internal_static_org_okraAx_v3_GpcCall_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.okraAx.v3.GpcCall.class, org.okraAx.v3.GpcCall.Builder.class);
    }

    // Construct using org.okraAx.v3.GpcCall.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      method_ = "";

      params_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.okraAx.v3.Gpc.internal_static_org_okraAx_v3_GpcCall_descriptor;
    }

    public org.okraAx.v3.GpcCall getDefaultInstanceForType() {
      return org.okraAx.v3.GpcCall.getDefaultInstance();
    }

    public org.okraAx.v3.GpcCall build() {
      org.okraAx.v3.GpcCall result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.okraAx.v3.GpcCall buildPartial() {
      org.okraAx.v3.GpcCall result = new org.okraAx.v3.GpcCall(this);
      result.method_ = method_;
      result.params_ = params_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.okraAx.v3.GpcCall) {
        return mergeFrom((org.okraAx.v3.GpcCall)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.okraAx.v3.GpcCall other) {
      if (other == org.okraAx.v3.GpcCall.getDefaultInstance()) return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (other.getParams() != com.google.protobuf.ByteString.EMPTY) {
        setParams(other.getParams());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.okraAx.v3.GpcCall parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.okraAx.v3.GpcCall) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object method_ = "";
    /**
     * <pre>
     *  the remote call produce name.
     * </pre>
     *
     * <code>optional string method = 1;</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *  the remote call produce name.
     * </pre>
     *
     * <code>optional string method = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *  the remote call produce name.
     * </pre>
     *
     * <code>optional string method = 1;</code>
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  the remote call produce name.
     * </pre>
     *
     * <code>optional string method = 1;</code>
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  the remote call produce name.
     * </pre>
     *
     * <code>optional string method = 1;</code>
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString params_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     *  the request param message. the message must be gpb message.
     *  the gpb param message will be covert to args array for java method.
     *  example:
     *      take the {&#64;link GpcError} in this proto file as an example.
     *  define the gpb service:
     *  ...
     *  service  XXXService {
     *      rpc doAction (GpcError) returns (GpcVoid);
     *      ... define any more rpc.
     *  }
     *  map the java method:
     *      void doAction(int state, String msg).
     * </pre>
     *
     * <code>optional bytes params = 2;</code>
     */
    public com.google.protobuf.ByteString getParams() {
      return params_;
    }
    /**
     * <pre>
     *  the request param message. the message must be gpb message.
     *  the gpb param message will be covert to args array for java method.
     *  example:
     *      take the {&#64;link GpcError} in this proto file as an example.
     *  define the gpb service:
     *  ...
     *  service  XXXService {
     *      rpc doAction (GpcError) returns (GpcVoid);
     *      ... define any more rpc.
     *  }
     *  map the java method:
     *      void doAction(int state, String msg).
     * </pre>
     *
     * <code>optional bytes params = 2;</code>
     */
    public Builder setParams(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      params_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  the request param message. the message must be gpb message.
     *  the gpb param message will be covert to args array for java method.
     *  example:
     *      take the {&#64;link GpcError} in this proto file as an example.
     *  define the gpb service:
     *  ...
     *  service  XXXService {
     *      rpc doAction (GpcError) returns (GpcVoid);
     *      ... define any more rpc.
     *  }
     *  map the java method:
     *      void doAction(int state, String msg).
     * </pre>
     *
     * <code>optional bytes params = 2;</code>
     */
    public Builder clearParams() {
      
      params_ = getDefaultInstance().getParams();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.okraAx.v3.GpcCall)
  }

  // @@protoc_insertion_point(class_scope:org.okraAx.v3.GpcCall)
  private static final org.okraAx.v3.GpcCall DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.okraAx.v3.GpcCall();
  }

  public static org.okraAx.v3.GpcCall getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GpcCall>
      PARSER = new com.google.protobuf.AbstractParser<GpcCall>() {
    public GpcCall parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GpcCall(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GpcCall> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GpcCall> getParserForType() {
    return PARSER;
  }

  public org.okraAx.v3.GpcCall getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

