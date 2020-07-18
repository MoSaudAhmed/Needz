package com.need.needz.services;

import com.need.needz.services.requests.LoginRequest;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NeedzServices {

    @POST("login_action")
    Single<Response<Result>> loginAction(@Body LoginRequest loginModel);

}
