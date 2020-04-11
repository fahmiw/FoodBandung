package com.example.bandungfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
    }
}
