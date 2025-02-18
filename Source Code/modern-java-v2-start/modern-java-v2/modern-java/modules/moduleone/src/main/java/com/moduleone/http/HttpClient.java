package com.moduleone.http;

import java.time.Duration;

public class HttpClient {

    private final java.net.http.HttpClient client = java.net.http.HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(2))
            .build();
}
