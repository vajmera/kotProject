package com.example.hellokotlin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null;
    private var adapter:RecyclerView.Adapter<MyAdapter.ViewHolder>?=null; //if null then assign null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        layoutManager=LinearLayoutManager(this);

        //recyclerView.layoutManager=layoutManager;
         val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.layoutManager = layoutManager


        adapter=MyAdapter();
        recyclerView.adapter=adapter;

    }
}