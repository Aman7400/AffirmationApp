package com.example.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.R
import com.example.affirmation.models.Affirmation

////class ItemAdapter(private val context: Context,private val dataSet : List<Affirmation>) {
////
////    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
////
////    }
//
//}

class  ItemAdapter(private val context: Context,private val dataSet : List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tv : TextView = itemView.findViewById(R.id.item_title)
        val iv : ImageView = itemView.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.tv.text = context.resources.getString(item.stringResourceID)
        holder.iv.setImageResource(item.imageResourceID)
    }

    override fun getItemCount(): Int {

        return dataSet.size

    }
}