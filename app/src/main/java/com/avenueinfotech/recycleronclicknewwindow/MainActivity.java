package com.avenueinfotech.recycleronclicknewwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.avenueinfotech.recycleronclicknewwindow.mData.SpaceCraftsCollection;
import com.avenueinfotech.recycleronclicknewwindow.mRecycler.MyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this, SpaceCraftsCollection.getSpaceCrafts());
        rv.setAdapter(adapter);
    }
}
