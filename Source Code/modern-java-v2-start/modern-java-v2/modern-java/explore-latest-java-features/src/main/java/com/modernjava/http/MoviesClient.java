package com.modernjava.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.net.http.HttpRequest.newBuilder;

public class MoviesClient {

    public static String ALL_MOVIES_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movies.json";
    public static String MOVIE_BY_ID_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movie_by_id.json";


}
