package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewActivity extends AppCompatActivity {


    private RecyclerView rv1;
    private MyAdapter mAdapter;
    private List<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        rv1 = findViewById(R.id.rv1);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter();
        rv1.setAdapter(mAdapter);
        initList();
        mAdapter.setData(list);
        mAdapter.notifyDataSetChanged();

    }


    protected void initList() {
        for(int i=0;i<30;i++){
            Data data = new Data();
            data.index = i+"";
            data.title = "这是第" + i + "篇title";
            data.recommend = i%5==0;
            data.hot = i%3==0;
            data.New = i%7==0;
            list.add(data);
        }
    }

}
