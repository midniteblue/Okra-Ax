// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc/include/google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `float`.
 * The JSON representation for `FloatValue` is JSON number.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.FloatValue}
 */
public  final class FloatValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.protobuf.FloatValue)
    FloatValueOrBuilder {
  // Use FloatValue.newBuilder() to construct.
  private FloatValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FloatValue() {
    value_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FloatValue(
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
          case 13: {

            value_ = input.readFloat();
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
    return com.google.protobuf.WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.WrappersProto.internal_static_google_protobuf_FloatValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.FloatValue.class, com.google.protobuf.FloatValue.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private float value_;
  /**
   * <pre>
   * The float value.
   * </pre>
   *
   * <code>optional float value = 1;</code>
   */
  public float getValue() {
    return value_;
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
    if (value_ != 0F) {
      output.writeFloat(1, value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, value_);
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
    if (!(obj instanceof com.google.protobuf.FloatValue)) {
      return super.equals(obj);
    }
    com.google.protobuf.FloatValue other = (com.google.protobuf.FloatValue) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getValue())
        == java.lang.Float.floatToIntBits(
            other.getValue()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.FloatValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.FloatValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.FloatValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.FloatValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.FloatValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.FloatValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.FloatValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.protobuf.FloatValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.FloatValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.FloatValue parseFrom(
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
  public static Builder newBuilder(com.google.protobuf.FloatValue prototype) {
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
   * Wrapper message for `float`.
   * The JSON representation for `FloatValue` is JSON number.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.FloatValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.FloatValue)
      com.google.protobuf.FloatValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_FloatValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.FloatValue.class, com.google.protobuf.FloatValue.Builder.class);
    }

    // Construct using com.google.protobuf.FloatValue.newBuilder()
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
      value_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
    }

    public com.google.protobuf.FloatValue getDefaultInstanceForType() {
      return com.google.protobuf.FloatValue.getDefaultInstance();
    }

    public com.google.protobuf.FloatValue build() {
      com.google.protobuf.FloatValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.protobuf.FloatValue buildPartial() {
      com.google.protobuf.FloatValue result = new com.google.protobuf.FloatValue(this);
      result.value_ = value_;
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
      if (other instanceof com.google.protobuf.FloatValue) {
        return mergeFrom((com.google.protobuf.FloatValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.FloatValue other) {
      if (other == com.google.protobuf.FloatValue.getDefaultInstance()) return this;
      if (other.getValue() != 0F) {
        setValue(other.getValue());
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
      com.google.protobuf.FloatValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.protobuf.FloatValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float value_ ;
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>optional float value = 1;</code>
     */
    public float getValue() {
      return value_;
    }
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>optional float value = 1;</code>
     */
    public Builder setValue(float value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>optional float value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.protobuf.FloatValue)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.FloatValue)
  private static final com.google.protobuf.FloatValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.FloatValue();
  }

  public static com.google.protobuf.FloatValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatValue>
      PARSER = new com.google.protobuf.AbstractParser<FloatValue>() {
    public FloatValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FloatValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FloatValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatValue> getParserForType() {
    return PARSER;
  }

  public com.google.protobuf.FloatValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

