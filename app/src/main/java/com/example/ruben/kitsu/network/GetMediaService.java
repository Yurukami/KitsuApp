package com.example.ruben.kitsu.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetMedia {
    @GET("trending/anime")
    Call<JsonObject> getTrendingMedia();
}
