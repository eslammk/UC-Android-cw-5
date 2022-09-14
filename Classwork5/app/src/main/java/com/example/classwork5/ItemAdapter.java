package com.example.classwork5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {

    ArrayList<Items> itemsList = new ArrayList<>();
    Context context ;

    public ItemAdapter(ArrayList<Items> itemsList, Context context) {
        this.itemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder)holder ).textname.setText(itemsList.get(position).getItemName());
        ((ViewHolder)holder ).textprice.setText(itemsList.get(position).getItemPrice() + " KD");
        ((ViewHolder)holder ).img.setImageResource(itemsList.get(position).getItemImg());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        TextView textname , textprice ;
        ImageView img ;
        View v ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;

            textname = v.findViewById(R.id.textname);
            textprice = v.findViewById(R.id.textprice);
            img = v.findViewById(R.id.imageView);
        }
    }





}
