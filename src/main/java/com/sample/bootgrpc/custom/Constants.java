package com.sample.bootgrpc.custom;

import io.grpc.Metadata;

public class Constants {
	public static final Metadata.Key<String> METADATA_KEY = Metadata.Key.of("apiKey", Metadata.ASCII_STRING_MARSHALLER);
	public static final String API_KEY = "4ec7ceea-2cc0-4a3e-b9bc-491777c5e0f3";
}
