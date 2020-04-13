package com.example.bandungfood.model;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.bandungfood.R;

public class DetailFood extends AppCompatActivity {
    ImageView detail_img;
    TextView detail_name, detail_detail;
//    public static final String FOOD_ITEM = "food_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_food);
        Bundle bundle = getIntent().getExtras();

        detail_img = findViewById(R.id.detail_food_img);
        detail_name = findViewById(R.id.detail_food_name);
        detail_detail = findViewById(R.id.detail_food_detail);

        assert bundle != null;
        detail_img.setImageResource(bundle.getInt("img"));
        detail_name.setText(bundle.getString("name"));
        detail_detail.setText(bundle.getString("detail"));

        /**
         * Cara lain passing data dengan parcelable
         */
//        final Food food = getIntent().getParcelableExtra(FOOD_ITEM);
//        assert food != null;
//        Glide.with(this)
//                .load(food.getPhoto())
//                .into(detail_img);
//        detail_name.setText(food.getName());
//        detail_detail.setText(food.getDetail());
    }
}
