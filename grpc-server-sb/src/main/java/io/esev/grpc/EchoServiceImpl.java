package io.esev.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.boot.autoconfigure.grpc.server.GrpcService;

@GrpcService
public class EchoServiceImpl  extends EchoServiceGrpc.EchoServiceImplBase {

    @Override
    public void echo(EchoOuterClass.Echo request, StreamObserver<EchoOuterClass.Echo> responseObserver) {

        System.out.println("[SERVICE] Starting....");
        EchoOuterClass.Echo echo = EchoOuterClass.Echo.newBuilder().setMessage(request.getMessage()).build();

        System.out.println("[SERVICE] Response Back....");
        responseObserver.onNext(echo);
        responseObserver.onCompleted();

    }
}
