package com.sample.bootgrpc.api;

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
    value = "by gRPC proto compiler (version 1.16.0)",
    comments = "Source: bootService.proto")
public final class BootServiceGrpc {

  private BootServiceGrpc() {}

  public static final String SERVICE_NAME = "com.sample.bootgrpc.BootService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sample.bootgrpc.api.BootRequest,
      com.sample.bootgrpc.api.BootResponse> getGiveBootValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GiveBootValues",
      requestType = com.sample.bootgrpc.api.BootRequest.class,
      responseType = com.sample.bootgrpc.api.BootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sample.bootgrpc.api.BootRequest,
      com.sample.bootgrpc.api.BootResponse> getGiveBootValuesMethod() {
    io.grpc.MethodDescriptor<com.sample.bootgrpc.api.BootRequest, com.sample.bootgrpc.api.BootResponse> getGiveBootValuesMethod;
    if ((getGiveBootValuesMethod = BootServiceGrpc.getGiveBootValuesMethod) == null) {
      synchronized (BootServiceGrpc.class) {
        if ((getGiveBootValuesMethod = BootServiceGrpc.getGiveBootValuesMethod) == null) {
          BootServiceGrpc.getGiveBootValuesMethod = getGiveBootValuesMethod = 
              io.grpc.MethodDescriptor.<com.sample.bootgrpc.api.BootRequest, com.sample.bootgrpc.api.BootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.sample.bootgrpc.BootService", "GiveBootValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sample.bootgrpc.api.BootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sample.bootgrpc.api.BootResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BootServiceMethodDescriptorSupplier("GiveBootValues"))
                  .build();
          }
        }
     }
     return getGiveBootValuesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BootServiceStub newStub(io.grpc.Channel channel) {
    return new BootServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BootServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BootServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BootServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BootServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BootServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void giveBootValues(com.sample.bootgrpc.api.BootRequest request,
        io.grpc.stub.StreamObserver<com.sample.bootgrpc.api.BootResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGiveBootValuesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGiveBootValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sample.bootgrpc.api.BootRequest,
                com.sample.bootgrpc.api.BootResponse>(
                  this, METHODID_GIVE_BOOT_VALUES)))
          .build();
    }
  }

  /**
   */
  public static final class BootServiceStub extends io.grpc.stub.AbstractStub<BootServiceStub> {
    private BootServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootServiceStub(channel, callOptions);
    }

    /**
     */
    public void giveBootValues(com.sample.bootgrpc.api.BootRequest request,
        io.grpc.stub.StreamObserver<com.sample.bootgrpc.api.BootResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGiveBootValuesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BootServiceBlockingStub extends io.grpc.stub.AbstractStub<BootServiceBlockingStub> {
    private BootServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sample.bootgrpc.api.BootResponse giveBootValues(com.sample.bootgrpc.api.BootRequest request) {
      return blockingUnaryCall(
          getChannel(), getGiveBootValuesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BootServiceFutureStub extends io.grpc.stub.AbstractStub<BootServiceFutureStub> {
    private BootServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BootServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BootServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BootServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sample.bootgrpc.api.BootResponse> giveBootValues(
        com.sample.bootgrpc.api.BootRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGiveBootValuesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GIVE_BOOT_VALUES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BootServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BootServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GIVE_BOOT_VALUES:
          serviceImpl.giveBootValues((com.sample.bootgrpc.api.BootRequest) request,
              (io.grpc.stub.StreamObserver<com.sample.bootgrpc.api.BootResponse>) responseObserver);
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

  private static abstract class BootServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BootServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sample.bootgrpc.api.BootMessageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BootService");
    }
  }

  private static final class BootServiceFileDescriptorSupplier
      extends BootServiceBaseDescriptorSupplier {
    BootServiceFileDescriptorSupplier() {}
  }

  private static final class BootServiceMethodDescriptorSupplier
      extends BootServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BootServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BootServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BootServiceFileDescriptorSupplier())
              .addMethod(getGiveBootValuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
