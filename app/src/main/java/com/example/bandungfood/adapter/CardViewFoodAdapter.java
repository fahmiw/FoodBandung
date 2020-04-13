package com.example.bandungfood.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.bandungfood.data.Food;
import com.example.bandungfood.R;
import com.example.bandungfood.model.DetailFood;

import java.util.ArrayList;

public class CardViewFoodAdapter extends RecyclerView.Adapter<CardViewFoodAdapter.CardViewViewHolder> {
    private ArrayList<Food> foodArrayList;
//    private OnItemClickCallback mOnItemClickCallback;

    public CardViewFoodAdapter(ArrayList<Food> list){
        this.foodArrayList = list;
    }

    /**
     * Cara lain passing data dengan parcelable
     */
//    public void setOnItemClickCallback (OnItemClickCallback onItemClickCallback){
//        this.mOnItemClickCallback = onItemClickCallback;
//    }
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_food, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Food food = foodArrayList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imagePhoto);
        holder.mName.setText(food.getName());
        holder.mDetail.setText(food.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              mOnItemClickCallback.onItemClicked(food);
                Bundle bundle = new Bundle();
                bundle.putInt("img", food.getPhoto());
                bundle.putString("name", food.getName());
                bundle.putString("detail", food.getDetail());
                Intent intent = new Intent(v.getContext(), DetailFood.class);
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });

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

    /**
     * Cara lain passing data dengan parcelable
     */
//    public interface OnItemClickCallback {
//        void onItemClicked(Food data);
//    }

}
