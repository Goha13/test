package com.example.gainitleuova.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {
    @GET("messages1.json")
    Call<List<Message>> messages();
}
