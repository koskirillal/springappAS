package com.example.testandroidspring.api;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitService {
    private static final String BASE_URL = "http://192.168.1.66:8081";
    private static Retrofit retrofit;
    private static Retrofit create(){
        return new Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(BASE_URL).build();
    }
    public static Retrofit getInstance(){
        if (retrofit==null){
            retrofit=create();
            return retrofit;
        }else{
            return retrofit;
        }
    }

}
