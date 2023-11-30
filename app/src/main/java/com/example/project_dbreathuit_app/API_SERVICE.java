package com.example.project_dbreathuit_app;


import com.example.project_dbreathuit_app.model.LoginResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API_SERVICE {
    @FormUrlEncoded
    @POST("token") // Replace "login" with your API endpoint
    Call<LoginResponseModel> login(
            @Field("client_id") String client_id,
            @Field("username") String username,
            @Field("password") String password,
            @Field("grant_type") String grant_type
    );

//    @GET("user")
//    Call<User> getUser();//, @Header("Authorization") String auth);

//    'https://uiot.ixxc.dev/api/master/map
//    @GET("api/master/asset/user/current")
//    Observable<ArrayList<Current>> getCurrent();
}
