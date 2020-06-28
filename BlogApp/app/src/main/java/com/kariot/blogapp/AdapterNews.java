package com.kariot.blogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterNews extends RecyclerView.Adapter<AdapterNews.NewsVH> {

    Context context;
    ArrayList<ModelNews> data;

    public AdapterNews(Context context, ArrayList<ModelNews> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public NewsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_news_item, parent, false);
        NewsVH newsVH = new NewsVH(view);
        return newsVH;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsVH holder, int position) {
        ModelNews dataItem = data.get(position);
        holder.txtTitle.setText(dataItem.newsTitle);
        holder.txtDesc.setText(dataItem.newsDesc);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class NewsVH extends RecyclerView.ViewHolder {

        TextView txtTitle, txtDesc;
        ImageView imgNews;

        public NewsVH(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDesc = itemView.findViewById(R.id.txtDec);
            imgNews = itemView.findViewById(R.id.newsImg);
        }
    }
}
