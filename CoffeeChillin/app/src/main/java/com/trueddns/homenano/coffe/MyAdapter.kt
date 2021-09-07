package com.trueddns.homenano.coffe

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(private val postList: List<Coffee>, private  val context: Context): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.coffee_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTextValue!!.text =  postList[position].title
        holder.bindContentValue!!.text = postList[position].content

        holder.bindCardView!!.setOnClickListener{
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("ID", postList[position].id)
            context!!.startActivity(intent)
        }

        // Load photo
        Picasso.get().load(postList[position].thumbnail).error(R.mipmap.ic_launcher_round)
            .placeholder(R.mipmap.ic_launcher_round)
            .into(holder.bindImageView)


    }

    override fun getItemCount(): Int {
        return postList.size
    }

}