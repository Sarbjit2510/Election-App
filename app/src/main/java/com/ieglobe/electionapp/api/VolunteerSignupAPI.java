package com.ieglobe.electionapp.api;

import com.ieglobe.electionapp.models.ResponseModel;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by pawneshwer on 11-Jun-16.
 */
public interface VolunteerSignupAPI {
    @FormUrlEncoded
    @POST("/user/register")
    public void signUp(@Field("name") String name,
                       @Field("age") String age,
                       @Field("user_type") String userType,
                       @Field("phone_number") String phone,
                       @Field("gender") String gender,
                       @Field("area") String area,
                       @Field("voter_id") String voterId,
                       Callback<ResponseModel> result);
}
