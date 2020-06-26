package com.kariot.androidlist;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNames extends RecyclerView.Adapter<AdapterNames.NameVH>  {

    ArrayList<String> data;
    Context context;

    public AdapterNames(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override //to create a item in list view
    public NameVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NameVH viewholder = new NameVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_name_item,parent,false));
        return viewholder;
    }


    @Override //set properties to viewholder, basically sets value
    public void onBindViewHolder(@NonNull NameVH holder, final int position) {
        holder.txtName.setText(data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on "+data.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override //defines how many items in the lists
    public int getItemCount() {
        return data.size();
    }

    //Viewholder to represnt an item in the list
    class NameVH extends RecyclerView.ViewHolder {
        TextView txtName;
        public NameVH(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
