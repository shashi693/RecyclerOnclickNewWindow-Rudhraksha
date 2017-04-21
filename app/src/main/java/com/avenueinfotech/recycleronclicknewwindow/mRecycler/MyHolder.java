package com.avenueinfotech.recycleronclicknewwindow.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.avenueinfotech.recycleronclicknewwindow.R;

/**
 * Created by shashikant on 20-04-2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView nameTxt;
    ImageView img;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        img = (ImageView)itemView.findViewById(R.id.movieImage);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}
