package com.example.bandungfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.bandungfood.adapter.CardViewFoodAdapter;
import com.example.bandungfood.data.Food;
import com.example.bandungfood.data.FoodData;
import com.example.bandungfood.model.About;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food> foodArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        rvFood.setHasFixedSize(true);
        foodArrayList.addAll(FoodData.getListData());
        showRvCardView();
    }

    private void showRvCardView() {
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        CardViewFoodAdapter cardViewFoodAdapter = new CardViewFoodAdapter(foodArrayList);
        rvFood.setAdapter(cardViewFoodAdapter);

        /**
         * Cara lain passing data dengan parcelable
         */
//        cardViewFoodAdapter.setOnItemClickCallback(new CardViewFoodAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Food data) {
////                Intent moveDetail = new Intent(MainActivity.this, DetailFood.class);
////                moveDetail.putExtra(DetailFood.FOOD_ITEM, data);
////                startActivity(moveDetail);
//            }
//        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        if (itemId == R.id.about) {
            Intent moveIntent = new Intent(MainActivity.this, About.class);
            startActivity(moveIntent);
        }
    }

}
