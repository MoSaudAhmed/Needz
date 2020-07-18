package com.need.needz.services;

import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private NeedzServices needzServices;
    //private String BASE_URL = "http://myneedz.co.in/api/";
    private String BASE_URL = "https://api.collude.cloud/api/";

    public RestClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(buildOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        needzServices = retrofit.create(NeedzServices.class);

    }

    public NeedzServices getNeedzServices() {
        return needzServices;
    }

    private OkHttpClient buildOkHttpClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        //retry on connection failure
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .writeTimeout(120, TimeUnit.SECONDS)
                .connectTimeout(120, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .readTimeout(120, TimeUnit.SECONDS)
                .connectionPool(new ConnectionPool(0, 1, TimeUnit.NANOSECONDS));

        httpClient.addInterceptor(chain -> {
            Request original = chain.request();

            Request needzRequest = original.newBuilder()
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("Accept-Language", "en-gb")
                    .method(original.method(), original.body())
                    .build();
            return chain.proceed(needzRequest);

        });

        httpClient.addInterceptor(logging);
        httpClient.connectTimeout(1, TimeUnit.MINUTES);
        httpClient.readTimeout(1, TimeUnit.MINUTES);

        return httpClient.build();
    }

}
