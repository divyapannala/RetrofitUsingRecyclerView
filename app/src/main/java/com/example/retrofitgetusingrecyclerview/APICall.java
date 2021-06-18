package com.example.retrofitgetusingrecyclerview;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APICall {

  @GET("users")
    Call<List<Details>> getdetails();
}
