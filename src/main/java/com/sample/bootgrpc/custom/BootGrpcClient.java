package com.sample.bootgrpc.custom;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sample.bootgrpc.api.BootRequest;
import com.sample.bootgrpc.api.BootResponse;
import com.sample.bootgrpc.api.BootServiceGrpc;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class BootGrpcClient {

	BootServiceGrpc.BootServiceBlockingStub client;
	
	@Value("${request.name}")
	String name;
	
	@Value("${service.url}")
	String url;
	
	@Value("${service.port}")
	String port;

	@PostConstruct
	private void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(url, Integer.parseInt(port)).usePlaintext().build();
			
		BootGrpcInterceptor clientInterceptor = new BootGrpcInterceptor();
		Channel interceptedChannel = ClientInterceptors.intercept(managedChannel, clientInterceptor);
		
		//This comes from the generated service code from proto file
		client = BootServiceGrpc.newBlockingStub(interceptedChannel);
				
		try {
			BootRequest request = BootRequest.newBuilder().setName(name).build();
			BootResponse response = client.giveBootValues(request);
			System.out.println(response.getRespName() + " / " + response.getRespId());
		}finally {
			if(managedChannel != null) {
				try {
					managedChannel.awaitTermination(100, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
}
