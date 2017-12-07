package com.example.phuongbka.uber.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by phuongbka on 12/7/17.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
