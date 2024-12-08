// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.app.grpc.stubs;

/**
 * Protobuf type {@code reservation.GetAllReservationsResponse}
 */
public  final class GetAllReservationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:reservation.GetAllReservationsResponse)
    GetAllReservationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllReservationsResponse.newBuilder() to construct.
  private GetAllReservationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllReservationsResponse() {
    reservations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAllReservationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllReservationsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              reservations_ = new java.util.ArrayList<com.app.grpc.stubs.Reservation>();
              mutable_bitField0_ |= 0x00000001;
            }
            reservations_.add(
                input.readMessage(com.app.grpc.stubs.Reservation.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        reservations_ = java.util.Collections.unmodifiableList(reservations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.app.grpc.stubs.ReservationOuterClass.internal_static_reservation_GetAllReservationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.app.grpc.stubs.ReservationOuterClass.internal_static_reservation_GetAllReservationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.app.grpc.stubs.GetAllReservationsResponse.class, com.app.grpc.stubs.GetAllReservationsResponse.Builder.class);
  }

  public static final int RESERVATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.app.grpc.stubs.Reservation> reservations_;
  /**
   * <code>repeated .reservation.Reservation reservations = 1;</code>
   */
  public java.util.List<com.app.grpc.stubs.Reservation> getReservationsList() {
    return reservations_;
  }
  /**
   * <code>repeated .reservation.Reservation reservations = 1;</code>
   */
  public java.util.List<? extends com.app.grpc.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList() {
    return reservations_;
  }
  /**
   * <code>repeated .reservation.Reservation reservations = 1;</code>
   */
  public int getReservationsCount() {
    return reservations_.size();
  }
  /**
   * <code>repeated .reservation.Reservation reservations = 1;</code>
   */
  public com.app.grpc.stubs.Reservation getReservations(int index) {
    return reservations_.get(index);
  }
  /**
   * <code>repeated .reservation.Reservation reservations = 1;</code>
   */
  public com.app.grpc.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index) {
    return reservations_.get(index);
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
    for (int i = 0; i < reservations_.size(); i++) {
      output.writeMessage(1, reservations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reservations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reservations_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.app.grpc.stubs.GetAllReservationsResponse)) {
      return super.equals(obj);
    }
    com.app.grpc.stubs.GetAllReservationsResponse other = (com.app.grpc.stubs.GetAllReservationsResponse) obj;

    if (!getReservationsList()
        .equals(other.getReservationsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getReservationsCount() > 0) {
      hash = (37 * hash) + RESERVATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getReservationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.app.grpc.stubs.GetAllReservationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.app.grpc.stubs.GetAllReservationsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code reservation.GetAllReservationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:reservation.GetAllReservationsResponse)
      com.app.grpc.stubs.GetAllReservationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.app.grpc.stubs.ReservationOuterClass.internal_static_reservation_GetAllReservationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.app.grpc.stubs.ReservationOuterClass.internal_static_reservation_GetAllReservationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.app.grpc.stubs.GetAllReservationsResponse.class, com.app.grpc.stubs.GetAllReservationsResponse.Builder.class);
    }

    // Construct using com.app.grpc.stubs.GetAllReservationsResponse.newBuilder()
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
        getReservationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.app.grpc.stubs.ReservationOuterClass.internal_static_reservation_GetAllReservationsResponse_descriptor;
    }

    @java.lang.Override
    public com.app.grpc.stubs.GetAllReservationsResponse getDefaultInstanceForType() {
      return com.app.grpc.stubs.GetAllReservationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.app.grpc.stubs.GetAllReservationsResponse build() {
      com.app.grpc.stubs.GetAllReservationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.app.grpc.stubs.GetAllReservationsResponse buildPartial() {
      com.app.grpc.stubs.GetAllReservationsResponse result = new com.app.grpc.stubs.GetAllReservationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (reservationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reservations_ = java.util.Collections.unmodifiableList(reservations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reservations_ = reservations_;
      } else {
        result.reservations_ = reservationsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.app.grpc.stubs.GetAllReservationsResponse) {
        return mergeFrom((com.app.grpc.stubs.GetAllReservationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.app.grpc.stubs.GetAllReservationsResponse other) {
      if (other == com.app.grpc.stubs.GetAllReservationsResponse.getDefaultInstance()) return this;
      if (reservationsBuilder_ == null) {
        if (!other.reservations_.isEmpty()) {
          if (reservations_.isEmpty()) {
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReservationsIsMutable();
            reservations_.addAll(other.reservations_);
          }
          onChanged();
        }
      } else {
        if (!other.reservations_.isEmpty()) {
          if (reservationsBuilder_.isEmpty()) {
            reservationsBuilder_.dispose();
            reservationsBuilder_ = null;
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reservationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReservationsFieldBuilder() : null;
          } else {
            reservationsBuilder_.addAllMessages(other.reservations_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.app.grpc.stubs.GetAllReservationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.app.grpc.stubs.GetAllReservationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.app.grpc.stubs.Reservation> reservations_ =
      java.util.Collections.emptyList();
    private void ensureReservationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reservations_ = new java.util.ArrayList<com.app.grpc.stubs.Reservation>(reservations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.app.grpc.stubs.Reservation, com.app.grpc.stubs.Reservation.Builder, com.app.grpc.stubs.ReservationOrBuilder> reservationsBuilder_;

    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public java.util.List<com.app.grpc.stubs.Reservation> getReservationsList() {
      if (reservationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reservations_);
      } else {
        return reservationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public int getReservationsCount() {
      if (reservationsBuilder_ == null) {
        return reservations_.size();
      } else {
        return reservationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public com.app.grpc.stubs.Reservation getReservations(int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);
      } else {
        return reservationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.app.grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.set(index, value);
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.app.grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.set(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder addReservations(com.app.grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.app.grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(index, value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        com.app.grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.app.grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder addAllReservations(
        java.lang.Iterable<? extends com.app.grpc.stubs.Reservation> values) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reservations_);
        onChanged();
      } else {
        reservationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder clearReservations() {
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public Builder removeReservations(int index) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.remove(index);
        onChanged();
      } else {
        reservationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public com.app.grpc.stubs.Reservation.Builder getReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public com.app.grpc.stubs.ReservationOrBuilder getReservationsOrBuilder(
        int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);  } else {
        return reservationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public java.util.List<? extends com.app.grpc.stubs.ReservationOrBuilder> 
         getReservationsOrBuilderList() {
      if (reservationsBuilder_ != null) {
        return reservationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reservations_);
      }
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public com.app.grpc.stubs.Reservation.Builder addReservationsBuilder() {
      return getReservationsFieldBuilder().addBuilder(
          com.app.grpc.stubs.Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public com.app.grpc.stubs.Reservation.Builder addReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().addBuilder(
          index, com.app.grpc.stubs.Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .reservation.Reservation reservations = 1;</code>
     */
    public java.util.List<com.app.grpc.stubs.Reservation.Builder> 
         getReservationsBuilderList() {
      return getReservationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.app.grpc.stubs.Reservation, com.app.grpc.stubs.Reservation.Builder, com.app.grpc.stubs.ReservationOrBuilder> 
        getReservationsFieldBuilder() {
      if (reservationsBuilder_ == null) {
        reservationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.app.grpc.stubs.Reservation, com.app.grpc.stubs.Reservation.Builder, com.app.grpc.stubs.ReservationOrBuilder>(
                reservations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reservations_ = null;
      }
      return reservationsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:reservation.GetAllReservationsResponse)
  }

  // @@protoc_insertion_point(class_scope:reservation.GetAllReservationsResponse)
  private static final com.app.grpc.stubs.GetAllReservationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.app.grpc.stubs.GetAllReservationsResponse();
  }

  public static com.app.grpc.stubs.GetAllReservationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllReservationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllReservationsResponse>() {
    @java.lang.Override
    public GetAllReservationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllReservationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllReservationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllReservationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.app.grpc.stubs.GetAllReservationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

