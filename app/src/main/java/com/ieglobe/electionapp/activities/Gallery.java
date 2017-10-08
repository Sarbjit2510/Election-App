package com.ieglobe.electionapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.ieglobe.electionapp.R;
import com.ieglobe.electionapp.adapters.Gallery_Adapter;
import com.ieglobe.electionapp.api.Gallery_Api;
import com.ieglobe.electionapp.models.Gallery_Model;
import com.ieglobe.electionapp.models.Gallery_Response;
import com.ieglobe.electionapp.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Gallery extends AppCompatActivity {
    GridView gv;
    ArrayList<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery__view);

        gv=(GridView)findViewById(R.id.grid1);
        data=new ArrayList<String>();
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Constants.ROOT_URL).build();
        Gallery_Api api = restAdapter.create(Gallery_Api.class);
        api.gallery("image", new Callback<Gallery_Model>() {

            public void success(Gallery_Model gallery_model, Response response) {
                if (gallery_model.getStatus() == 1) {
                    List<Gallery_Response> response1 = gallery_model.getResponse();
                    for (int i = 0; i < response1.size(); i++) {
                        Gallery_Response gallery_response = response1.get(i);
                        String gallery = gallery_response.getGallery();
                        data.add(gallery);


                    }
                    Gallery_Adapter adp = new Gallery_Adapter(Gallery.this, R.layout.gallery_inflate, data);
                    gv.setAdapter(adp);
                }

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }
}
