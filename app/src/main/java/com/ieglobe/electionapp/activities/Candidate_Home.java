package com.ieglobe.electionapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.ieglobe.electionapp.R;
import com.ieglobe.electionapp.adapters.Candidate_Adapter;
import com.ieglobe.electionapp.models.Candidate_Model;

import java.util.ArrayList;

public class Candidate_Home extends AppCompatActivity
{
    TextView header_name;
    ArrayList<Candidate_Model>al;
    int []icon={R.drawable.user,R.drawable.social,R.drawable.gallery,R.drawable.vision,R.drawable.live,R.drawable.chat,R.drawable.near,R.drawable.time,R.drawable.invite,R.drawable.compaliants,R.drawable.achive,R.drawable.calender};
    String [] title={"PERSONE","SOCIAL MEDIA","GALLERY","VISOIN","LIVE TELECAST","GROUP DISCUSSION","NEAR BY","TIME TARCKER","INVITE VOLUNTER","COMPLAINTS","ACHIVEMENTS","UPCOMING EVENTS"};
    int []icon_voter={R.drawable.user,R.drawable.social,R.drawable.gallery,R.drawable.vision,R.drawable.live,R.drawable.achive};
    String [] title_voter={"PERSONE","SOCIAL MEDIA","GALLERY","VISOIN","LIVE TELECAST","ACHIVEMENTS"};
    int []icon_vol={R.drawable.user,R.drawable.social,R.drawable.gallery,R.drawable.vision,R.drawable.live,R.drawable.near,R.drawable.timer,R.drawable.invite,R.drawable.achive,R.drawable.calender};
    String [] title_vol={"PERSONE","SOCIAL MEDIA","GALLERY","VISOIN","LIVE TELECAST","NEAR BY","TIME TARCKER","ACHIVEMENTS","UPCOMING EVENTS"};

    String type;
   // int i;
    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_candidate__home);
        header_name=(TextView)findViewById(R.id.header_name);
        al=new ArrayList<Candidate_Model>();
        gv=(GridView)findViewById(R.id.grid1);
        Intent i1=getIntent();
         type=i1.getStringExtra("type");

        if(type.equalsIgnoreCase("candidate"))
        {
            for(int i=0;i<title.length;i++)
            {
                Candidate_Model model=new Candidate_Model(icon[i],title[i]);
                al.add(model);


            }
            header_name.setText("Candidate");
            Candidate_Adapter cand_adap=new Candidate_Adapter(Candidate_Home.this, R.layout.candidate_inflate,al);
            gv.setAdapter(cand_adap);

            gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             if(position==9) {
                 Intent i1 = new Intent(Candidate_Home.this, Complaint.class);
                 startActivity(i1);
             }
                    if(position==2) {
                        Intent i1 = new Intent(Candidate_Home.this, Gallery_View.class);
                        startActivity(i1);
                    }

                }
            });

        }
        else if(type.equalsIgnoreCase("voter"))
        {
            for(int i=0;i<title_voter.length;i++)
            {
                Candidate_Model model=new Candidate_Model(icon_voter[i],title_voter[i]);
                al.add(model);


            }
            header_name.setText("Voter");

            Candidate_Adapter cand_adap=new Candidate_Adapter(Candidate_Home.this, R.layout.candidate_inflate,al);
            gv.setAdapter(cand_adap);


        }
        else
        {
            for(int i=0;i<title_vol.length;i++)
            {
                Candidate_Model model=new Candidate_Model(icon_vol[i],title_vol[i]);
                al.add(model);


            }
            header_name.setText("Volunter");

            Candidate_Adapter cand_adap=new Candidate_Adapter(Candidate_Home.this, R.layout.candidate_inflate,al);
            gv.setAdapter(cand_adap);


        }
    }
}
