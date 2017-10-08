package com.ieglobe.electionapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.ieglobe.electionapp.R;

public class Login extends AppCompatActivity {
    String url="http://202.164.59.107/election_app/webservices/user/signin";
    String user_type, voter_id, phone_number, device_type, longitude,latitude;
    EditText voter_id_txt,phone_number_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        device_type="android";
        longitude="0.00";
        latitude="0.00";
        user_type="candidate";

        voter_id_txt=(EditText)findViewById(R.id.et_voter_id);
        phone_number_txt=(EditText)findViewById(R.id.et_mobile);


    }
    public void candidate(View view)
    {
        startActivity(new Intent(Login.this, LoginType.class));

//
//        voter_id=voter_id_txt.getText().toString();
//        phone_number=phone_number_txt.getText().toString();
//
//        RestAdapter adp=new RestAdapter.Builder().setEndpoint(url).build();
//        CandidateLoginAPI loginAPI=adp.create(CandidateLoginAPI.class);
//        loginAPI.signIn(user_type, voter_id, phone_number, device_type, longitude, latitude, new Callback<ResponseLogin>() {
//            @Override
//            public void success(ResponseLogin web_response, Response response) {
//                if (web_response.getStatus() == 1) {
//
//                    com.ieglobe.electionapp.models.Response response1 = web_response.getResponse();
//                    SavePrefs.writePrefs(Login.this, Constants.KEY_NAME, response1.getUserName());
//
//                    Toast.makeText(Login.this, "Login Sucess", Toast.LENGTH_LONG).show();
//                    startActivity(new Intent(Login.this, Candidate.class));
//
//
//                } else {
//                    Toast.makeText(Login.this, "error", Toast.LENGTH_LONG).show();
//                }
//
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.e("Not ADDD", error.getMessage());
//            }
//        });
//
//
//
//

    }
}
