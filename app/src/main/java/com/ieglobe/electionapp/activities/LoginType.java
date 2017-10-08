package com.ieglobe.electionapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.ieglobe.electionapp.R;

public class LoginType extends AppCompatActivity implements View.OnClickListener {
    ImageView cand_login,vol_login,voter_login;
    String type="",type1="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_type);
          cand_login=(ImageView)findViewById(R.id.cand_login);
          vol_login=(ImageView)findViewById(R.id.vol_login);
          voter_login=(ImageView)findViewById(R.id.voter_login);
      cand_login.setOnClickListener(this);
        voter_login.setOnClickListener(this);
        vol_login.setOnClickListener(this);
         Intent i=getIntent();
        type1=i.getStringExtra("type");

    }

    @Override
    public void onClick(View v)
    {
        if(type1.equals("login"))
        {
            switch (v.getId())
            {
                case R.id.cand_login:
                    type="candidate";
                    Intent i= new Intent(LoginType.this,Candidate_Home.class);
                    i.putExtra("type","candidate");
                    startActivity(i);
                    break;

                case R.id.vol_login:
                    type="volunter";
                    Intent i11= new Intent(LoginType.this,Candidate_Home.class);
                    i11.putExtra("type","volunter");
                    startActivity(i11);
                    break;

                case R.id.voter_login:
                    type="voter";
                    Intent i1= new Intent(LoginType.this,Candidate_Home.class);
                    i1.putExtra("type","voter");
                    startActivity(i1);
                    break;
            }
          }

        else
        {
            Intent i1= new Intent(LoginType.this,Register.class);
            i1.putExtra("type","voter");
            startActivity(i1);


        }

    }


}
