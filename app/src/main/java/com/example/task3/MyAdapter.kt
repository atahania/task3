package com.example.task3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_item.view.*

class MyAdapter (private val names: ArrayList<String>): RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       return ItemViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.single_item
               ,parent
           ,false
           )
       )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val name=names[position]

        holder.itemView.apply {
            textView.text=name
        }
    }

    override fun getItemCount() = names.size
    }