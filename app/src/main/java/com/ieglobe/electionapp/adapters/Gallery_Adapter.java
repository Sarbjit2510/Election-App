package com.ieglobe.electionapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.ieglobe.electionapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by Sarbjyot_2 on 1/29/2016.
 */
public class Gallery_Adapter extends ArrayAdapter<String> {

    Activity ctx;
    LayoutInflater inflater;
    List<String> data;
    Animation rotate_anim;
    private int lastPosition = -1;
    int i=0;

    public Gallery_Adapter(Activity context, int resource,
                           List<String> data) {
        super(context, resource,data);
        this.ctx=context;
        inflater=LayoutInflater.from(context);
        this.data=data;

    }

    public class ViewHolder{

        ImageView Image1;


    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder=new ViewHolder();
        view=inflater.inflate(R.layout.gallery_inflate,null);

        holder.Image1=(ImageView)view.findViewById(R.id.image1);

        Picasso.with(ctx).load(data.get(position).toString()).into(holder.Image1);



        return view;

    }

    public int getSelectedCount() {

        return data.size();

    }



}

