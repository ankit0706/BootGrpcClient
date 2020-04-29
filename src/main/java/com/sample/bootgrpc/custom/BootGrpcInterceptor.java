package com.sample.bootgrpc.custom;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

public class BootGrpcInterceptor implements ClientInterceptor{

	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
			CallOptions callOptions, Channel next) {
		return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

		      @Override
		      public void start(Listener<RespT> responseListener, Metadata headers) {
		        /* put custom header */
		        headers.put(Constants.METADATA_KEY, Constants.API_KEY);
		        super.start(new SimpleForwardingClientCallListener<RespT>(responseListener) {
		          @Override
		          public void onHeaders(Metadata headers) {
		             super.onHeaders(headers);
		          }
		        }, headers);
		      }// start
		    };// return
		  
	}

}
