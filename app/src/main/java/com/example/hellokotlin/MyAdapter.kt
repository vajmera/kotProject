package com.example.hellokotlin

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataSet: Array<String>) :
RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.textView)
        }
    }
}