// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FyChessMessage.proto

package org.okraAx.v3.chess.beans;

/**
 * <pre>
 * [push:101] - 推送棋子移动
 * </pre>
 *
 * Protobuf type {@code org.okraAx.v3.PushChessMove}
 */
public  final class PushChessMove extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.okraAx.v3.PushChessMove)
    PushChessMoveOrBuilder {
  // Use PushChessMove.newBuilder() to construct.
  private PushChessMove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PushChessMove() {
    fromX_ = 0;
    fromY_ = 0;
    toX_ = 0;
    toY_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PushChessMove(
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
          case 8: {

            fromX_ = input.readInt32();
            break;
          }
          case 16: {

            fromY_ = input.readInt32();
            break;
          }
          case 24: {

            toX_ = input.readInt32();
            break;
          }
          case 32: {

            toY_ = input.readInt32();
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
    return org.okraAx.v3.chess.beans.FyChessMi.internal_static_org_okraAx_v3_PushChessMove_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.okraAx.v3.chess.beans.FyChessMi.internal_static_org_okraAx_v3_PushChessMove_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.okraAx.v3.chess.beans.PushChessMove.class, org.okraAx.v3.chess.beans.PushChessMove.Builder.class);
  }

  public static final int FROMX_FIELD_NUMBER = 1;
  private int fromX_;
  /**
   * <code>optional int32 fromX = 1;</code>
   */
  public int getFromX() {
    return fromX_;
  }

  public static final int FROMY_FIELD_NUMBER = 2;
  private int fromY_;
  /**
   * <code>optional int32 fromY = 2;</code>
   */
  public int getFromY() {
    return fromY_;
  }

  public static final int TOX_FIELD_NUMBER = 3;
  private int toX_;
  /**
   * <code>optional int32 toX = 3;</code>
   */
  public int getToX() {
    return toX_;
  }

  public static final int TOY_FIELD_NUMBER = 4;
  private int toY_;
  /**
   * <code>optional int32 toY = 4;</code>
   */
  public int getToY() {
    return toY_;
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
    if (fromX_ != 0) {
      output.writeInt32(1, fromX_);
    }
    if (fromY_ != 0) {
      output.writeInt32(2, fromY_);
    }
    if (toX_ != 0) {
      output.writeInt32(3, toX_);
    }
    if (toY_ != 0) {
      output.writeInt32(4, toY_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fromX_);
    }
    if (fromY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, fromY_);
    }
    if (toX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, toX_);
    }
    if (toY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, toY_);
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
    if (!(obj instanceof org.okraAx.v3.chess.beans.PushChessMove)) {
      return super.equals(obj);
    }
    org.okraAx.v3.chess.beans.PushChessMove other = (org.okraAx.v3.chess.beans.PushChessMove) obj;

    boolean result = true;
    result = result && (getFromX()
        == other.getFromX());
    result = result && (getFromY()
        == other.getFromY());
    result = result && (getToX()
        == other.getToX());
    result = result && (getToY()
        == other.getToY());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + FROMX_FIELD_NUMBER;
    hash = (53 * hash) + getFromX();
    hash = (37 * hash) + FROMY_FIELD_NUMBER;
    hash = (53 * hash) + getFromY();
    hash = (37 * hash) + TOX_FIELD_NUMBER;
    hash = (53 * hash) + getToX();
    hash = (37 * hash) + TOY_FIELD_NUMBER;
    hash = (53 * hash) + getToY();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.okraAx.v3.chess.beans.PushChessMove parseFrom(
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
  public static Builder newBuilder(org.okraAx.v3.chess.beans.PushChessMove prototype) {
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
   * [push:101] - 推送棋子移动
   * </pre>
   *
   * Protobuf type {@code org.okraAx.v3.PushChessMove}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.okraAx.v3.PushChessMove)
      org.okraAx.v3.chess.beans.PushChessMoveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.okraAx.v3.chess.beans.FyChessMi.internal_static_org_okraAx_v3_PushChessMove_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.okraAx.v3.chess.beans.FyChessMi.internal_static_org_okraAx_v3_PushChessMove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.okraAx.v3.chess.beans.PushChessMove.class, org.okraAx.v3.chess.beans.PushChessMove.Builder.class);
    }

    // Construct using org.okraAx.v3.chess.beans.PushChessMove.newBuilder()
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
      fromX_ = 0;

      fromY_ = 0;

      toX_ = 0;

      toY_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.okraAx.v3.chess.beans.FyChessMi.internal_static_org_okraAx_v3_PushChessMove_descriptor;
    }

    public org.okraAx.v3.chess.beans.PushChessMove getDefaultInstanceForType() {
      return org.okraAx.v3.chess.beans.PushChessMove.getDefaultInstance();
    }

    public org.okraAx.v3.chess.beans.PushChessMove build() {
      org.okraAx.v3.chess.beans.PushChessMove result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.okraAx.v3.chess.beans.PushChessMove buildPartial() {
      org.okraAx.v3.chess.beans.PushChessMove result = new org.okraAx.v3.chess.beans.PushChessMove(this);
      result.fromX_ = fromX_;
      result.fromY_ = fromY_;
      result.toX_ = toX_;
      result.toY_ = toY_;
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
      if (other instanceof org.okraAx.v3.chess.beans.PushChessMove) {
        return mergeFrom((org.okraAx.v3.chess.beans.PushChessMove)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.okraAx.v3.chess.beans.PushChessMove other) {
      if (other == org.okraAx.v3.chess.beans.PushChessMove.getDefaultInstance()) return this;
      if (other.getFromX() != 0) {
        setFromX(other.getFromX());
      }
      if (other.getFromY() != 0) {
        setFromY(other.getFromY());
      }
      if (other.getToX() != 0) {
        setToX(other.getToX());
      }
      if (other.getToY() != 0) {
        setToY(other.getToY());
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
      org.okraAx.v3.chess.beans.PushChessMove parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.okraAx.v3.chess.beans.PushChessMove) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fromX_ ;
    /**
     * <code>optional int32 fromX = 1;</code>
     */
    public int getFromX() {
      return fromX_;
    }
    /**
     * <code>optional int32 fromX = 1;</code>
     */
    public Builder setFromX(int value) {
      
      fromX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 fromX = 1;</code>
     */
    public Builder clearFromX() {
      
      fromX_ = 0;
      onChanged();
      return this;
    }

    private int fromY_ ;
    /**
     * <code>optional int32 fromY = 2;</code>
     */
    public int getFromY() {
      return fromY_;
    }
    /**
     * <code>optional int32 fromY = 2;</code>
     */
    public Builder setFromY(int value) {
      
      fromY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 fromY = 2;</code>
     */
    public Builder clearFromY() {
      
      fromY_ = 0;
      onChanged();
      return this;
    }

    private int toX_ ;
    /**
     * <code>optional int32 toX = 3;</code>
     */
    public int getToX() {
      return toX_;
    }
    /**
     * <code>optional int32 toX = 3;</code>
     */
    public Builder setToX(int value) {
      
      toX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 toX = 3;</code>
     */
    public Builder clearToX() {
      
      toX_ = 0;
      onChanged();
      return this;
    }

    private int toY_ ;
    /**
     * <code>optional int32 toY = 4;</code>
     */
    public int getToY() {
      return toY_;
    }
    /**
     * <code>optional int32 toY = 4;</code>
     */
    public Builder setToY(int value) {
      
      toY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 toY = 4;</code>
     */
    public Builder clearToY() {
      
      toY_ = 0;
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


    // @@protoc_insertion_point(builder_scope:org.okraAx.v3.PushChessMove)
  }

  // @@protoc_insertion_point(class_scope:org.okraAx.v3.PushChessMove)
  private static final org.okraAx.v3.chess.beans.PushChessMove DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.okraAx.v3.chess.beans.PushChessMove();
  }

  public static org.okraAx.v3.chess.beans.PushChessMove getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PushChessMove>
      PARSER = new com.google.protobuf.AbstractParser<PushChessMove>() {
    public PushChessMove parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PushChessMove(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PushChessMove> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PushChessMove> getParserForType() {
    return PARSER;
  }

  public org.okraAx.v3.chess.beans.PushChessMove getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
