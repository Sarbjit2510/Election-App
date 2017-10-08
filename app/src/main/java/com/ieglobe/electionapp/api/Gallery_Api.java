package com.ieglobe.electionapp.api;

import com.ieglobe.electionapp.models.Gallery_Model;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by pawneshwer on 11-Jun-16.
 */
public interface Gallery_Api
{
    @FormUrlEncoded
    @POST("/gallery/get_gallery")
    public void gallery(@Field("type") String type,
                       Callback<Gallery_Model> result);

}
