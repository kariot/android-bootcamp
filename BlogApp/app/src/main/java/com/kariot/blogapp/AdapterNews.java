package com.kariot.blogapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
        final ModelNews dataItem = data.get(position);
        holder.txtTitle.setText(dataItem.getNewsTitle());
        holder.txtDesc.setText(dataItem.getNewsDesc());
        Glide.with(context).load(dataItem.getNewsImg()).into(holder.imgNews);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(context,NewsDetailsActivity.class);
                newIntent.putExtra("URL",dataItem.getNewsURL());
                context.startActivity(newIntent);
            }
        });

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
