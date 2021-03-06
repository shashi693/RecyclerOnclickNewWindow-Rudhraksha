package com.avenueinfotech.recycleronclicknewwindow.mRecycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.avenueinfotech.recycleronclicknewwindow.R;
import com.avenueinfotech.recycleronclicknewwindow.mData.SpaceCraft;
import com.avenueinfotech.recycleronclicknewwindow.mDetail.DetailActivity;

import java.util.ArrayList;

/**
 * Created by shashikant on 20-04-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    ArrayList<SpaceCraft> spaceCrafts;

    public MyAdapter(Context c, ArrayList<SpaceCraft> spaceCrafts) {
        this.c = c;
        this.spaceCrafts = spaceCrafts;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        final String name=spaceCrafts.get(position).getName();
        final int image=spaceCrafts.get(position).getImage();

        //BIND DATA
        holder.nameTxt.setText(name);
        holder.img.setImageResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name,image);
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return spaceCrafts.size();
    }

    private void openDetailActivity(String name,int image)
    {
        Intent i=new Intent(c, DetailActivity.class);

        //PACK DATA TO SEND
        i.putExtra("NAME_KEY",name);
        i.putExtra("IMAGE_KEY",image);

        //open activity
        c.startActivity(i);

    }
}
