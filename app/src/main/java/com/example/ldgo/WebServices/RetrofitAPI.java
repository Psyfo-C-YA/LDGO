package com.example.ldgo.WebServices;

import android.telecom.Call;

import com.example.ldgo.Model.DirectionPlaceModel.DirectionResponseModel;
import com.example.ldgo.Model.GooglePlaceModel.GoogleResponseModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.*;

public interface RetrofitAPI {

    @GET
    Call<GoogleResponseModel> getNearByPlaces(@Url String url);

    @GET
    Call<DirectionResponseModel> getDirection(@Url String url);
}
