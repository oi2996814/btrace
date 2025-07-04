// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/trace/etw/etw_event.proto
// Protobuf Java Version: 4.29.3

package perfetto.protos;

public final class EtwEvent {
  private EtwEvent() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      EtwEvent.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EtwTraceEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.EtwTraceEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    boolean hasTimestamp();
    /**
     * <code>optional uint64 timestamp = 1;</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <code>optional uint32 cpu = 4;</code>
     * @return Whether the cpu field is set.
     */
    boolean hasCpu();
    /**
     * <code>optional uint32 cpu = 4;</code>
     * @return The cpu.
     */
    int getCpu();

    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     * @return Whether the cSwitch field is set.
     */
    boolean hasCSwitch();
    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     * @return The cSwitch.
     */
    perfetto.protos.Etw.CSwitchEtwEvent getCSwitch();
    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     */
    perfetto.protos.Etw.CSwitchEtwEventOrBuilder getCSwitchOrBuilder();

    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     * @return Whether the readyThread field is set.
     */
    boolean hasReadyThread();
    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     * @return The readyThread.
     */
    perfetto.protos.Etw.ReadyThreadEtwEvent getReadyThread();
    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     */
    perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder getReadyThreadOrBuilder();

    perfetto.protos.EtwEvent.EtwTraceEvent.EventCase getEventCase();
  }
  /**
   * Protobuf type {@code perfetto.protos.EtwTraceEvent}
   */
  public static final class EtwTraceEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.EtwTraceEvent)
      EtwTraceEventOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        EtwTraceEvent.class.getName());
    }
    // Use EtwTraceEvent.newBuilder() to construct.
    private EtwTraceEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private EtwTraceEvent() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return perfetto.protos.EtwEvent.internal_static_perfetto_protos_EtwTraceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return perfetto.protos.EtwEvent.internal_static_perfetto_protos_EtwTraceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              perfetto.protos.EtwEvent.EtwTraceEvent.class, perfetto.protos.EtwEvent.EtwTraceEvent.Builder.class);
    }

    private int bitField0_;
    private int eventCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object event_;
    public enum EventCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      C_SWITCH(2),
      READY_THREAD(3),
      EVENT_NOT_SET(0);
      private final int value;
      private EventCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static EventCase valueOf(int value) {
        return forNumber(value);
      }

      public static EventCase forNumber(int value) {
        switch (value) {
          case 2: return C_SWITCH;
          case 3: return READY_THREAD;
          case 0: return EVENT_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public EventCase
    getEventCase() {
      return EventCase.forNumber(
          eventCase_);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_ = 0L;
    /**
     * <code>optional uint64 timestamp = 1;</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int CPU_FIELD_NUMBER = 4;
    private int cpu_ = 0;
    /**
     * <code>optional uint32 cpu = 4;</code>
     * @return Whether the cpu field is set.
     */
    @java.lang.Override
    public boolean hasCpu() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 cpu = 4;</code>
     * @return The cpu.
     */
    @java.lang.Override
    public int getCpu() {
      return cpu_;
    }

    public static final int C_SWITCH_FIELD_NUMBER = 2;
    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     * @return Whether the cSwitch field is set.
     */
    @java.lang.Override
    public boolean hasCSwitch() {
      return eventCase_ == 2;
    }
    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     * @return The cSwitch.
     */
    @java.lang.Override
    public perfetto.protos.Etw.CSwitchEtwEvent getCSwitch() {
      if (eventCase_ == 2) {
         return (perfetto.protos.Etw.CSwitchEtwEvent) event_;
      }
      return perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
    }
    /**
     * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
     */
    @java.lang.Override
    public perfetto.protos.Etw.CSwitchEtwEventOrBuilder getCSwitchOrBuilder() {
      if (eventCase_ == 2) {
         return (perfetto.protos.Etw.CSwitchEtwEvent) event_;
      }
      return perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
    }

    public static final int READY_THREAD_FIELD_NUMBER = 3;
    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     * @return Whether the readyThread field is set.
     */
    @java.lang.Override
    public boolean hasReadyThread() {
      return eventCase_ == 3;
    }
    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     * @return The readyThread.
     */
    @java.lang.Override
    public perfetto.protos.Etw.ReadyThreadEtwEvent getReadyThread() {
      if (eventCase_ == 3) {
         return (perfetto.protos.Etw.ReadyThreadEtwEvent) event_;
      }
      return perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
    }
    /**
     * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
     */
    @java.lang.Override
    public perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder getReadyThreadOrBuilder() {
      if (eventCase_ == 3) {
         return (perfetto.protos.Etw.ReadyThreadEtwEvent) event_;
      }
      return perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt64(1, timestamp_);
      }
      if (eventCase_ == 2) {
        output.writeMessage(2, (perfetto.protos.Etw.CSwitchEtwEvent) event_);
      }
      if (eventCase_ == 3) {
        output.writeMessage(3, (perfetto.protos.Etw.ReadyThreadEtwEvent) event_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(4, cpu_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, timestamp_);
      }
      if (eventCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (perfetto.protos.Etw.CSwitchEtwEvent) event_);
      }
      if (eventCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (perfetto.protos.Etw.ReadyThreadEtwEvent) event_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cpu_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof perfetto.protos.EtwEvent.EtwTraceEvent)) {
        return super.equals(obj);
      }
      perfetto.protos.EtwEvent.EtwTraceEvent other = (perfetto.protos.EtwEvent.EtwTraceEvent) obj;

      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
      }
      if (hasCpu() != other.hasCpu()) return false;
      if (hasCpu()) {
        if (getCpu()
            != other.getCpu()) return false;
      }
      if (!getEventCase().equals(other.getEventCase())) return false;
      switch (eventCase_) {
        case 2:
          if (!getCSwitch()
              .equals(other.getCSwitch())) return false;
          break;
        case 3:
          if (!getReadyThread()
              .equals(other.getReadyThread())) return false;
          break;
        case 0:
        default:
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTimestamp());
      }
      if (hasCpu()) {
        hash = (37 * hash) + CPU_FIELD_NUMBER;
        hash = (53 * hash) + getCpu();
      }
      switch (eventCase_) {
        case 2:
          hash = (37 * hash) + C_SWITCH_FIELD_NUMBER;
          hash = (53 * hash) + getCSwitch().hashCode();
          break;
        case 3:
          hash = (37 * hash) + READY_THREAD_FIELD_NUMBER;
          hash = (53 * hash) + getReadyThread().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static perfetto.protos.EtwEvent.EtwTraceEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static perfetto.protos.EtwEvent.EtwTraceEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static perfetto.protos.EtwEvent.EtwTraceEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(perfetto.protos.EtwEvent.EtwTraceEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code perfetto.protos.EtwTraceEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.EtwTraceEvent)
        perfetto.protos.EtwEvent.EtwTraceEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return perfetto.protos.EtwEvent.internal_static_perfetto_protos_EtwTraceEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return perfetto.protos.EtwEvent.internal_static_perfetto_protos_EtwTraceEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                perfetto.protos.EtwEvent.EtwTraceEvent.class, perfetto.protos.EtwEvent.EtwTraceEvent.Builder.class);
      }

      // Construct using perfetto.protos.EtwEvent.EtwTraceEvent.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        timestamp_ = 0L;
        cpu_ = 0;
        if (cSwitchBuilder_ != null) {
          cSwitchBuilder_.clear();
        }
        if (readyThreadBuilder_ != null) {
          readyThreadBuilder_.clear();
        }
        eventCase_ = 0;
        event_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return perfetto.protos.EtwEvent.internal_static_perfetto_protos_EtwTraceEvent_descriptor;
      }

      @java.lang.Override
      public perfetto.protos.EtwEvent.EtwTraceEvent getDefaultInstanceForType() {
        return perfetto.protos.EtwEvent.EtwTraceEvent.getDefaultInstance();
      }

      @java.lang.Override
      public perfetto.protos.EtwEvent.EtwTraceEvent build() {
        perfetto.protos.EtwEvent.EtwTraceEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public perfetto.protos.EtwEvent.EtwTraceEvent buildPartial() {
        perfetto.protos.EtwEvent.EtwTraceEvent result = new perfetto.protos.EtwEvent.EtwTraceEvent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(perfetto.protos.EtwEvent.EtwTraceEvent result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cpu_ = cpu_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      private void buildPartialOneofs(perfetto.protos.EtwEvent.EtwTraceEvent result) {
        result.eventCase_ = eventCase_;
        result.event_ = this.event_;
        if (eventCase_ == 2 &&
            cSwitchBuilder_ != null) {
          result.event_ = cSwitchBuilder_.build();
        }
        if (eventCase_ == 3 &&
            readyThreadBuilder_ != null) {
          result.event_ = readyThreadBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof perfetto.protos.EtwEvent.EtwTraceEvent) {
          return mergeFrom((perfetto.protos.EtwEvent.EtwTraceEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(perfetto.protos.EtwEvent.EtwTraceEvent other) {
        if (other == perfetto.protos.EtwEvent.EtwTraceEvent.getDefaultInstance()) return this;
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasCpu()) {
          setCpu(other.getCpu());
        }
        switch (other.getEventCase()) {
          case C_SWITCH: {
            mergeCSwitch(other.getCSwitch());
            break;
          }
          case READY_THREAD: {
            mergeReadyThread(other.getReadyThread());
            break;
          }
          case EVENT_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                timestamp_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getCSwitchFieldBuilder().getBuilder(),
                    extensionRegistry);
                eventCase_ = 2;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getReadyThreadFieldBuilder().getBuilder(),
                    extensionRegistry);
                eventCase_ = 3;
                break;
              } // case 26
              case 32: {
                cpu_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int eventCase_ = 0;
      private java.lang.Object event_;
      public EventCase
          getEventCase() {
        return EventCase.forNumber(
            eventCase_);
      }

      public Builder clearEvent() {
        eventCase_ = 0;
        event_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private long timestamp_ ;
      /**
       * <code>optional uint64 timestamp = 1;</code>
       * @return Whether the timestamp field is set.
       */
      @java.lang.Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint64 timestamp = 1;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>optional uint64 timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {

        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int cpu_ ;
      /**
       * <code>optional uint32 cpu = 4;</code>
       * @return Whether the cpu field is set.
       */
      @java.lang.Override
      public boolean hasCpu() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional uint32 cpu = 4;</code>
       * @return The cpu.
       */
      @java.lang.Override
      public int getCpu() {
        return cpu_;
      }
      /**
       * <code>optional uint32 cpu = 4;</code>
       * @param value The cpu to set.
       * @return This builder for chaining.
       */
      public Builder setCpu(int value) {

        cpu_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cpu = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCpu() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cpu_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilder<
          perfetto.protos.Etw.CSwitchEtwEvent, perfetto.protos.Etw.CSwitchEtwEvent.Builder, perfetto.protos.Etw.CSwitchEtwEventOrBuilder> cSwitchBuilder_;
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       * @return Whether the cSwitch field is set.
       */
      @java.lang.Override
      public boolean hasCSwitch() {
        return eventCase_ == 2;
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       * @return The cSwitch.
       */
      @java.lang.Override
      public perfetto.protos.Etw.CSwitchEtwEvent getCSwitch() {
        if (cSwitchBuilder_ == null) {
          if (eventCase_ == 2) {
            return (perfetto.protos.Etw.CSwitchEtwEvent) event_;
          }
          return perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
        } else {
          if (eventCase_ == 2) {
            return cSwitchBuilder_.getMessage();
          }
          return perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
        }
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      public Builder setCSwitch(perfetto.protos.Etw.CSwitchEtwEvent value) {
        if (cSwitchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          cSwitchBuilder_.setMessage(value);
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      public Builder setCSwitch(
          perfetto.protos.Etw.CSwitchEtwEvent.Builder builderForValue) {
        if (cSwitchBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          cSwitchBuilder_.setMessage(builderForValue.build());
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      public Builder mergeCSwitch(perfetto.protos.Etw.CSwitchEtwEvent value) {
        if (cSwitchBuilder_ == null) {
          if (eventCase_ == 2 &&
              event_ != perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance()) {
            event_ = perfetto.protos.Etw.CSwitchEtwEvent.newBuilder((perfetto.protos.Etw.CSwitchEtwEvent) event_)
                .mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          if (eventCase_ == 2) {
            cSwitchBuilder_.mergeFrom(value);
          } else {
            cSwitchBuilder_.setMessage(value);
          }
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      public Builder clearCSwitch() {
        if (cSwitchBuilder_ == null) {
          if (eventCase_ == 2) {
            eventCase_ = 0;
            event_ = null;
            onChanged();
          }
        } else {
          if (eventCase_ == 2) {
            eventCase_ = 0;
            event_ = null;
          }
          cSwitchBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      public perfetto.protos.Etw.CSwitchEtwEvent.Builder getCSwitchBuilder() {
        return getCSwitchFieldBuilder().getBuilder();
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      @java.lang.Override
      public perfetto.protos.Etw.CSwitchEtwEventOrBuilder getCSwitchOrBuilder() {
        if ((eventCase_ == 2) && (cSwitchBuilder_ != null)) {
          return cSwitchBuilder_.getMessageOrBuilder();
        } else {
          if (eventCase_ == 2) {
            return (perfetto.protos.Etw.CSwitchEtwEvent) event_;
          }
          return perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
        }
      }
      /**
       * <code>.perfetto.protos.CSwitchEtwEvent c_switch = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          perfetto.protos.Etw.CSwitchEtwEvent, perfetto.protos.Etw.CSwitchEtwEvent.Builder, perfetto.protos.Etw.CSwitchEtwEventOrBuilder> 
          getCSwitchFieldBuilder() {
        if (cSwitchBuilder_ == null) {
          if (!(eventCase_ == 2)) {
            event_ = perfetto.protos.Etw.CSwitchEtwEvent.getDefaultInstance();
          }
          cSwitchBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              perfetto.protos.Etw.CSwitchEtwEvent, perfetto.protos.Etw.CSwitchEtwEvent.Builder, perfetto.protos.Etw.CSwitchEtwEventOrBuilder>(
                  (perfetto.protos.Etw.CSwitchEtwEvent) event_,
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        eventCase_ = 2;
        onChanged();
        return cSwitchBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilder<
          perfetto.protos.Etw.ReadyThreadEtwEvent, perfetto.protos.Etw.ReadyThreadEtwEvent.Builder, perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder> readyThreadBuilder_;
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       * @return Whether the readyThread field is set.
       */
      @java.lang.Override
      public boolean hasReadyThread() {
        return eventCase_ == 3;
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       * @return The readyThread.
       */
      @java.lang.Override
      public perfetto.protos.Etw.ReadyThreadEtwEvent getReadyThread() {
        if (readyThreadBuilder_ == null) {
          if (eventCase_ == 3) {
            return (perfetto.protos.Etw.ReadyThreadEtwEvent) event_;
          }
          return perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
        } else {
          if (eventCase_ == 3) {
            return readyThreadBuilder_.getMessage();
          }
          return perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
        }
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      public Builder setReadyThread(perfetto.protos.Etw.ReadyThreadEtwEvent value) {
        if (readyThreadBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          readyThreadBuilder_.setMessage(value);
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      public Builder setReadyThread(
          perfetto.protos.Etw.ReadyThreadEtwEvent.Builder builderForValue) {
        if (readyThreadBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          readyThreadBuilder_.setMessage(builderForValue.build());
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      public Builder mergeReadyThread(perfetto.protos.Etw.ReadyThreadEtwEvent value) {
        if (readyThreadBuilder_ == null) {
          if (eventCase_ == 3 &&
              event_ != perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance()) {
            event_ = perfetto.protos.Etw.ReadyThreadEtwEvent.newBuilder((perfetto.protos.Etw.ReadyThreadEtwEvent) event_)
                .mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          if (eventCase_ == 3) {
            readyThreadBuilder_.mergeFrom(value);
          } else {
            readyThreadBuilder_.setMessage(value);
          }
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      public Builder clearReadyThread() {
        if (readyThreadBuilder_ == null) {
          if (eventCase_ == 3) {
            eventCase_ = 0;
            event_ = null;
            onChanged();
          }
        } else {
          if (eventCase_ == 3) {
            eventCase_ = 0;
            event_ = null;
          }
          readyThreadBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      public perfetto.protos.Etw.ReadyThreadEtwEvent.Builder getReadyThreadBuilder() {
        return getReadyThreadFieldBuilder().getBuilder();
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      @java.lang.Override
      public perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder getReadyThreadOrBuilder() {
        if ((eventCase_ == 3) && (readyThreadBuilder_ != null)) {
          return readyThreadBuilder_.getMessageOrBuilder();
        } else {
          if (eventCase_ == 3) {
            return (perfetto.protos.Etw.ReadyThreadEtwEvent) event_;
          }
          return perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
        }
      }
      /**
       * <code>.perfetto.protos.ReadyThreadEtwEvent ready_thread = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          perfetto.protos.Etw.ReadyThreadEtwEvent, perfetto.protos.Etw.ReadyThreadEtwEvent.Builder, perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder> 
          getReadyThreadFieldBuilder() {
        if (readyThreadBuilder_ == null) {
          if (!(eventCase_ == 3)) {
            event_ = perfetto.protos.Etw.ReadyThreadEtwEvent.getDefaultInstance();
          }
          readyThreadBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              perfetto.protos.Etw.ReadyThreadEtwEvent, perfetto.protos.Etw.ReadyThreadEtwEvent.Builder, perfetto.protos.Etw.ReadyThreadEtwEventOrBuilder>(
                  (perfetto.protos.Etw.ReadyThreadEtwEvent) event_,
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        eventCase_ = 3;
        onChanged();
        return readyThreadBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:perfetto.protos.EtwTraceEvent)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.EtwTraceEvent)
    private static final perfetto.protos.EtwEvent.EtwTraceEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new perfetto.protos.EtwEvent.EtwTraceEvent();
    }

    public static perfetto.protos.EtwEvent.EtwTraceEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EtwTraceEvent>
        PARSER = new com.google.protobuf.AbstractParser<EtwTraceEvent>() {
      @java.lang.Override
      public EtwTraceEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<EtwTraceEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EtwTraceEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public perfetto.protos.EtwEvent.EtwTraceEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_EtwTraceEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_perfetto_protos_EtwTraceEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)protos/perfetto/trace/etw/etw_event.pr" +
      "oto\022\017perfetto.protos\032#protos/perfetto/tr" +
      "ace/etw/etw.proto\"\254\001\n\rEtwTraceEvent\022\021\n\tt" +
      "imestamp\030\001 \001(\004\022\013\n\003cpu\030\004 \001(\r\0224\n\010c_switch\030" +
      "\002 \001(\0132 .perfetto.protos.CSwitchEtwEventH" +
      "\000\022<\n\014ready_thread\030\003 \001(\0132$.perfetto.proto" +
      "s.ReadyThreadEtwEventH\000B\007\n\005event"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          perfetto.protos.Etw.getDescriptor(),
        });
    internal_static_perfetto_protos_EtwTraceEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_EtwTraceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_perfetto_protos_EtwTraceEvent_descriptor,
        new java.lang.String[] { "Timestamp", "Cpu", "CSwitch", "ReadyThread", "Event", });
    descriptor.resolveAllFeaturesImmutable();
    perfetto.protos.Etw.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
