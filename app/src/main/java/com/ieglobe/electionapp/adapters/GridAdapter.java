package com.ieglobe.electionapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ieglobe.electionapp.R;
import com.ieglobe.electionapp.models.GridModel;

import java.util.ArrayList;

/**
 * Created by pawneshwer on 11-Jun-16.
 */
public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder>{
    private Context context;
    private  ArrayList<GridModel> arrayList = new ArrayList<>();
    private Activity activity;
    private LayoutInflater inflater;

    public GridAdapter(Context context, ArrayList<GridModel> arrayList){
        this.context = context;
        this.arrayList = arrayList;
        activity = (Activity) context;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.grid_layout,parent,false);
        GridViewHolder viewHolder = new GridViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, final int position) {
        GridModel model = arrayList.get(position);
        holder.name.setText(model.getText());
        holder.img.setImageResource(model.icon);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on "+ (position+1), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name;
        RelativeLayout layout;
        public GridViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.icon);
            name = (TextView) itemView.findViewById(R.id.name);
            layout = (RelativeLayout) itemView.findViewById(R.id.layout);
        }
    }
}
