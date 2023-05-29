package com.example.recipebookapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @FormUrlEncoded
    @POST("api/v1/login")
    Call<Login_Model> login(
            @Field("username") String username,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("api/v1/register")
    Call<Login_Model> register(
            @Field("username") String username,
            @Field("password") String password
    );
}
