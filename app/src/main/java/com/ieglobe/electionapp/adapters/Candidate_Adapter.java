package com.ieglobe.electionapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ieglobe.electionapp.R;
import com.ieglobe.electionapp.models.Candidate_Model;

import java.util.List;


/**
 * Created by Sarbjyot_2 on 1/29/2016.
 */
public class Candidate_Adapter extends ArrayAdapter<Candidate_Model> {

    Activity ctx;
    LayoutInflater inflater;
    List<Candidate_Model> data;
    Animation rotate_anim;
    private int lastPosition = -1;
    int i=0;

    public Candidate_Adapter(Activity context, int resource,
                             List<Candidate_Model> data) {
        super(context, resource,data);
        this.ctx=context;
        inflater=LayoutInflater.from(context);
        this.data=data;

    }

    public class ViewHolder{

        RelativeLayout rev_one;
        ImageView icon;
        TextView title;
        private int lastPosition = -1;


    }

    public View getView(int position,View view, ViewGroup parent)

    {
        Candidate_Model candidate_model = data.get(position);
        final ViewHolder holder;
        holder = new ViewHolder();
        view = inflater.inflate(R.layout.candidate_inflate, parent, false);
        holder.title = (TextView) view.findViewById(R.id.text1);
        holder.icon = (ImageView) view.findViewById(R.id.icon);

        holder.title.setText(candidate_model.title);
        holder.icon.setImageResource(candidate_model.icon);


//            Picasso.with(ctx).load(data.get(position).getImage()).into(holder.Image);


        return view;

    }

    public int getSelectedCount() {

        return data.size();

    }



}

