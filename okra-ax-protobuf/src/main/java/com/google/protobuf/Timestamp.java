// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc/include/google/protobuf/timestamp.proto

package com.google.protobuf;

/**
 * <pre>
 * A Timestamp represents a point in time independent of any time zone
 * or calendar, represented as seconds and fractions of seconds at
 * nanosecond resolution in UTC Epoch time. It is encoded using the
 * Proleptic Gregorian Calendar which extends the Gregorian calendar
 * backwards to year one. It is encoded assuming all minutes are 60
 * seconds long, i.e. leap seconds are "smeared" so that no leap second
 * table is needed for interpretation. Range is from
 * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
 * By restricting to that range, we ensure that we can convert to
 * and from  RFC 3339 date strings.
 * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
 * Example 1: Compute Timestamp from POSIX `time()`.
 *     Timestamp timestamp;
 *     timestamp.set_seconds(time(NULL));
 *     timestamp.set_nanos(0);
 * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
 *     struct timeval tv;
 *     gettimeofday(&amp;tv, NULL);
 *     Timestamp timestamp;
 *     timestamp.set_seconds(tv.tv_sec);
 *     timestamp.set_nanos(tv.tv_usec * 1000);
 * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
 *     FILETIME ft;
 *     GetSystemTimeAsFileTime(&amp;ft);
 *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;
 *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
 *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
 *     Timestamp timestamp;
 *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
 *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
 * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
 *     long millis = System.currentTimeMillis();
 *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
 *         .setNanos((int) ((millis % 1000) * 1000000)).build();
 * Example 5: Compute Timestamp from current time in Python.
 *     timestamp = Timestamp()
 *     timestamp.GetCurrentTime()
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Timestamp}
 */
public  final class Timestamp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Timestamp)
    TimestampOrBuilder {
  // Use Timestamp.newBuilder() to construct.
  private Timestamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Timestamp() {
    seconds_ = 0L;
    nanos_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Timestamp(
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

            seconds_ = input.readInt64();
            break;
          }
          case 16: {

            nanos_ = input.readInt32();
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
    return com.google.protobuf.TimestampProto.internal_static_google_protobuf_Timestamp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.TimestampProto.internal_static_google_protobuf_Timestamp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.Timestamp.class, com.google.protobuf.Timestamp.Builder.class);
  }

  public static final int SECONDS_FIELD_NUMBER = 1;
  private long seconds_;
  /**
   * <pre>
   * Represents seconds of UTC time since Unix epoch
   * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
   * 9999-12-31T23:59:59Z inclusive.
   * </pre>
   *
   * <code>optional int64 seconds = 1;</code>
   */
  public long getSeconds() {
    return seconds_;
  }

  public static final int NANOS_FIELD_NUMBER = 2;
  private int nanos_;
  /**
   * <pre>
   * Non-negative fractions of a second at nanosecond resolution. Negative
   * second values with fractions must still have non-negative nanos values
   * that count forward in time. Must be from 0 to 999,999,999
   * inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 2;</code>
   */
  public int getNanos() {
    return nanos_;
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
    if (seconds_ != 0L) {
      output.writeInt64(1, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(2, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nanos_);
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
    if (!(obj instanceof com.google.protobuf.Timestamp)) {
      return super.equals(obj);
    }
    com.google.protobuf.Timestamp other = (com.google.protobuf.Timestamp) obj;

    boolean result = true;
    result = result && (getSeconds()
        == other.getSeconds());
    result = result && (getNanos()
        == other.getNanos());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeconds());
    hash = (37 * hash) + NANOS_FIELD_NUMBER;
    hash = (53 * hash) + getNanos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Timestamp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.Timestamp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Timestamp parseFrom(
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
  public static Builder newBuilder(com.google.protobuf.Timestamp prototype) {
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
   * A Timestamp represents a point in time independent of any time zone
   * or calendar, represented as seconds and fractions of seconds at
   * nanosecond resolution in UTC Epoch time. It is encoded using the
   * Proleptic Gregorian Calendar which extends the Gregorian calendar
   * backwards to year one. It is encoded assuming all minutes are 60
   * seconds long, i.e. leap seconds are "smeared" so that no leap second
   * table is needed for interpretation. Range is from
   * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
   * By restricting to that range, we ensure that we can convert to
   * and from  RFC 3339 date strings.
   * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
   * Example 1: Compute Timestamp from POSIX `time()`.
   *     Timestamp timestamp;
   *     timestamp.set_seconds(time(NULL));
   *     timestamp.set_nanos(0);
   * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
   *     struct timeval tv;
   *     gettimeofday(&amp;tv, NULL);
   *     Timestamp timestamp;
   *     timestamp.set_seconds(tv.tv_sec);
   *     timestamp.set_nanos(tv.tv_usec * 1000);
   * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
   *     FILETIME ft;
   *     GetSystemTimeAsFileTime(&amp;ft);
   *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) &lt;&lt; 32) | ft.dwLowDateTime;
   *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
   *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
   *     Timestamp timestamp;
   *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
   *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
   * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
   *     long millis = System.currentTimeMillis();
   *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
   *         .setNanos((int) ((millis % 1000) * 1000000)).build();
   * Example 5: Compute Timestamp from current time in Python.
   *     timestamp = Timestamp()
   *     timestamp.GetCurrentTime()
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Timestamp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Timestamp)
      com.google.protobuf.TimestampOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.TimestampProto.internal_static_google_protobuf_Timestamp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.TimestampProto.internal_static_google_protobuf_Timestamp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.Timestamp.class, com.google.protobuf.Timestamp.Builder.class);
    }

    // Construct using com.google.protobuf.Timestamp.newBuilder()
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
      seconds_ = 0L;

      nanos_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.TimestampProto.internal_static_google_protobuf_Timestamp_descriptor;
    }

    public com.google.protobuf.Timestamp getDefaultInstanceForType() {
      return com.google.protobuf.Timestamp.getDefaultInstance();
    }

    public com.google.protobuf.Timestamp build() {
      com.google.protobuf.Timestamp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.protobuf.Timestamp buildPartial() {
      com.google.protobuf.Timestamp result = new com.google.protobuf.Timestamp(this);
      result.seconds_ = seconds_;
      result.nanos_ = nanos_;
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
      if (other instanceof com.google.protobuf.Timestamp) {
        return mergeFrom((com.google.protobuf.Timestamp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.Timestamp other) {
      if (other == com.google.protobuf.Timestamp.getDefaultInstance()) return this;
      if (other.getSeconds() != 0L) {
        setSeconds(other.getSeconds());
      }
      if (other.getNanos() != 0) {
        setNanos(other.getNanos());
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
      com.google.protobuf.Timestamp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.protobuf.Timestamp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long seconds_ ;
    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public long getSeconds() {
      return seconds_;
    }
    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder setSeconds(long value) {
      
      seconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     * </pre>
     *
     * <code>optional int64 seconds = 1;</code>
     */
    public Builder clearSeconds() {
      
      seconds_ = 0L;
      onChanged();
      return this;
    }

    private int nanos_ ;
    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public int getNanos() {
      return nanos_;
    }
    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder setNanos(int value) {
      
      nanos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 2;</code>
     */
    public Builder clearNanos() {
      
      nanos_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.protobuf.Timestamp)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Timestamp)
  private static final com.google.protobuf.Timestamp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.Timestamp();
  }

  public static com.google.protobuf.Timestamp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timestamp>
      PARSER = new com.google.protobuf.AbstractParser<Timestamp>() {
    public Timestamp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Timestamp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Timestamp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timestamp> getParserForType() {
    return PARSER;
  }

  public com.google.protobuf.Timestamp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

