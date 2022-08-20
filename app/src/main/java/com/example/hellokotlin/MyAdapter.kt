package com.example.hellokotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

   private var titles=arrayOf("one","two","three");
    private var details=arrayOf("writing","umano","dassa");
    //R.drawable-hdpi.github_icon
    private var images=intArrayOf(R.drawable.github_icon,R.drawable.github_icon,R.drawable.github_icon);


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        //to inflate our card layout and pass view object

        val temp=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false);

        //pass to view holder object
        return ViewHolder(temp);

    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=titles[position]
        holder.itemDescription.text=details[position];
        holder.itemImage.setImageResource(images[position]);
    }

    override fun getItemCount(): Int {
        return titles.size;
    }

    //create inner class, receive itemview, need to implement REcyclerview and pass itemView

    inner class ViewHolder(itemView :View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle: TextView
        var itemDescription:TextView

        init{
            itemImage=itemView.findViewById(R.id.image_view);
            itemTitle=itemView.findViewById(R.id.text_view);
            itemDescription=itemView.findViewById(R.id.text_view2);
        }

    }

}