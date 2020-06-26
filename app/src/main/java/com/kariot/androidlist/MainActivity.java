package com.kariot.androidlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.mRecyclerView);

        data.add("India");
        data.add("China");
        data.add("Japan");
        data.add("Russia");
        data.add("South Korea");
        data.add("Indonesia");
        data.add("Turkey");
        data.add("Saudi Arabia");
        data.add("Taiwan");
        data.add("Iran");
        data.add("India");
        data.add("China");
        data.add("Japan");
        data.add("Russia");
        data.add("South Korea");
        data.add("Indonesia");
        data.add("Turkey");
        data.add("Saudi Arabia");
        data.add("Taiwan");
        data.add("Iran");
        data.add("India");
        data.add("China");
        data.add("Japan");
        data.add("Russia");
        data.add("South Korea");
        data.add("Indonesia");
        data.add("Turkey");
        data.add("Saudi Arabia");
        data.add("Taiwan");
        data.add("Iran");
        data.add("India");
        data.add("China");
        data.add("Japan");
        data.add("Russia");
        data.add("South Korea");
        data.add("Indonesia");
        data.add("Turkey");
        data.add("Saudi Arabia");
        data.add("Taiwan");
        data.add("Iran");

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        AdapterNames myAdapter = new AdapterNames(data,getApplicationContext());
        mRecyclerView.setAdapter(myAdapter);


    }
}