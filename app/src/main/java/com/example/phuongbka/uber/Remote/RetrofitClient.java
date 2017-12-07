package com.example.phuongbka.uber.Remote;

import retrofit2.Retrofit;

/**
 * Created by phuongbka on 12/7/17.
 */

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl()
        }
    }
}
