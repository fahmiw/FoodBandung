package com.example.bandungfood.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.bandungfood.R;

public class DetailFood extends AppCompatActivity {
    ImageView detail_img;
    TextView detail_name, detail_detail, detail_price, detail_recipe, detail_link;
//    public static final String FOOD_ITEM = "food_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_food);
        Bundle bundle = getIntent().getExtras();

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogoDescription(getResources().getString(R.string.app_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        detail_img = findViewById(R.id.detail_food_img);
        detail_name = findViewById(R.id.detail_food_name);
        detail_detail = findViewById(R.id.detail_food_detail);
        detail_price = findViewById(R.id.detail_food_price);
        detail_recipe = findViewById(R.id.detail_food_recipe);
        detail_link = findViewById(R.id.detail_link);

        assert bundle != null;
        detail_img.setImageResource(bundle.getInt("img"));
        detail_name.setText(bundle.getString("name"));
        detail_detail.setText(bundle.getString("detail"));
        detail_price.setText(bundle.getString("price"));
        detail_recipe.setText(bundle.getString("recipe"));


        // Link ke browser untuk More Photo
        detail_link.setMovementMethod(LinkMovementMethod.getInstance());
        detail_link.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(bundle.getString("link")));
                startActivity(browserIntent);
            }
        });

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
