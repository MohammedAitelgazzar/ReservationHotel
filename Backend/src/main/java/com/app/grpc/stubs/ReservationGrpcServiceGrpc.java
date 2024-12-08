package com.app.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationGrpcServiceGrpc {

  private ReservationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "reservation.ReservationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.app.grpc.stubs.GetAllReservationsRequest,
      com.app.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservations",
      requestType = com.app.grpc.stubs.GetAllReservationsRequest.class,
      responseType = com.app.grpc.stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.app.grpc.stubs.GetAllReservationsRequest,
      com.app.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.app.grpc.stubs.GetAllReservationsRequest, com.app.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationGrpcServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationGrpcServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationGrpcServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationGrpcServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.app.grpc.stubs.GetAllReservationsRequest, com.app.grpc.stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationGrpcService", "getAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationGrpcServiceMethodDescriptorSupplier("getAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.app.grpc.stubs.GetReservationByIdRequest,
      com.app.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationById",
      requestType = com.app.grpc.stubs.GetReservationByIdRequest.class,
      responseType = com.app.grpc.stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.app.grpc.stubs.GetReservationByIdRequest,
      com.app.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.app.grpc.stubs.GetReservationByIdRequest, com.app.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationGrpcServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationGrpcServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationGrpcServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationGrpcServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.app.grpc.stubs.GetReservationByIdRequest, com.app.grpc.stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationGrpcService", "getReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationGrpcServiceMethodDescriptorSupplier("getReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.app.grpc.stubs.SaveReservationRequest,
      com.app.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveReservation",
      requestType = com.app.grpc.stubs.SaveReservationRequest.class,
      responseType = com.app.grpc.stubs.SaveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.app.grpc.stubs.SaveReservationRequest,
      com.app.grpc.stubs.SaveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<com.app.grpc.stubs.SaveReservationRequest, com.app.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = ReservationGrpcServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationGrpcServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationGrpcServiceGrpc.getSaveReservationMethod) == null) {
          ReservationGrpcServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.app.grpc.stubs.SaveReservationRequest, com.app.grpc.stubs.SaveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationGrpcService", "saveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.SaveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.SaveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationGrpcServiceMethodDescriptorSupplier("saveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.app.grpc.stubs.DeleteReservationRequest,
      com.app.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReservation",
      requestType = com.app.grpc.stubs.DeleteReservationRequest.class,
      responseType = com.app.grpc.stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.app.grpc.stubs.DeleteReservationRequest,
      com.app.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.app.grpc.stubs.DeleteReservationRequest, com.app.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationGrpcServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationGrpcServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationGrpcServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationGrpcServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<com.app.grpc.stubs.DeleteReservationRequest, com.app.grpc.stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "reservation.ReservationGrpcService", "deleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.app.grpc.stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationGrpcServiceMethodDescriptorSupplier("deleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllReservations(com.app.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void getReservationById(com.app.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveReservation(com.app.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(com.app.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.app.grpc.stubs.GetAllReservationsRequest,
                com.app.grpc.stubs.GetAllReservationsResponse>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.app.grpc.stubs.GetReservationByIdRequest,
                com.app.grpc.stubs.GetReservationByIdResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.app.grpc.stubs.SaveReservationRequest,
                com.app.grpc.stubs.SaveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.app.grpc.stubs.DeleteReservationRequest,
                com.app.grpc.stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationGrpcServiceStub extends io.grpc.stub.AbstractStub<ReservationGrpcServiceStub> {
    private ReservationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllReservations(com.app.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(com.app.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveReservation(com.app.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.app.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.app.grpc.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationGrpcServiceBlockingStub> {
    private ReservationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.app.grpc.stubs.GetAllReservationsResponse getAllReservations(com.app.grpc.stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.app.grpc.stubs.GetReservationByIdResponse getReservationById(com.app.grpc.stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.app.grpc.stubs.SaveReservationResponse saveReservation(com.app.grpc.stubs.SaveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.app.grpc.stubs.DeleteReservationResponse deleteReservation(com.app.grpc.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationGrpcServiceFutureStub> {
    private ReservationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.app.grpc.stubs.GetAllReservationsResponse> getAllReservations(
        com.app.grpc.stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.app.grpc.stubs.GetReservationByIdResponse> getReservationById(
        com.app.grpc.stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.app.grpc.stubs.SaveReservationResponse> saveReservation(
        com.app.grpc.stubs.SaveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.app.grpc.stubs.DeleteReservationResponse> deleteReservation(
        com.app.grpc.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RESERVATIONS = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_SAVE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.app.grpc.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((com.app.grpc.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.app.grpc.stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.app.grpc.stubs.SaveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.app.grpc.stubs.SaveReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.app.grpc.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.app.grpc.stubs.DeleteReservationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.app.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationGrpcService");
    }
  }

  private static final class ReservationGrpcServiceFileDescriptorSupplier
      extends ReservationGrpcServiceBaseDescriptorSupplier {
    ReservationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationGrpcServiceMethodDescriptorSupplier
      extends ReservationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
