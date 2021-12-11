package com.example.beginer_dicoding_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNewsAdapter(val listNews: ArrayList<News>) :
    RecyclerView.Adapter<ListNewsAdapter.ListViewHolder>() {
    private lateinit var  onItemClickCallback:OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback =onItemClickCallback
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var newsTitle: TextView = itemView.findViewById(R.id.news_name)
        var newsDetail: TextView = itemView.findViewById(R.id.news_detail)
        var newsImage: ImageView = itemView.findViewById(R.id.img_news)

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.row_news, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val news = listNews[position]
        Glide.with(holder.itemView.context).load(news.image)
            .apply(RequestOptions().override(55, 55)).into(holder.newsImage)

        holder.newsTitle.text = news.name
        holder.newsDetail.text = news.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listNews[holder.adapterPosition])
        }
    }
    override fun getItemCount(): Int {
        return listNews.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data:News)
    }
}


