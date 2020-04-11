package com.example.bandungfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewFoodAdapter extends RecyclerView.Adapter<CardViewFoodAdapter.CardViewViewHolder> {
    private ArrayList<Food> foodArrayList;

    public CardViewFoodAdapter(ArrayList<Food> list){
        this.foodArrayList = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_food, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Food food = foodArrayList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imagePhoto);
        holder.mName.setText(food.getName());
        holder.mDetail.setText(food.getDetail());

    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imagePhoto;
        TextView mName, mDetail;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePhoto = itemView.findViewById(R.id.img_food_photo);
            mName = itemView.findViewById(R.id.rv_food_name);
            mDetail = itemView.findViewById(R.id.rv_food_detail);
        }
    }
}
