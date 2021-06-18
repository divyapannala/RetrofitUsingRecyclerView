package com.example.retrofitgetusingrecyclerview;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {

    public static String BASE_URL="https://jsonplaceholder.typicode.com/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }



}
