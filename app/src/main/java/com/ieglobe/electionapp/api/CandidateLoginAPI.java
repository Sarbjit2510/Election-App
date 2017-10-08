package com.ieglobe.electionapp.api;

import com.ieglobe.electionapp.models.ResponseLogin;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by pawneshwer on 11-Jun-16.
 */
public interface CandidateLoginAPI
{
    @FormUrlEncoded
    @POST("user/signin")
    public void signIn(@Field("user_id") String user_id,
                       @Field("voter_id") String voter_id,
                       @Field("phone_number") String phone_number,
                       @Field("device_type") String device_type,
                       @Field("longitude") String longitude,
                       @Field("latitude") String latitude,

                       Callback<ResponseLogin> result);

}
