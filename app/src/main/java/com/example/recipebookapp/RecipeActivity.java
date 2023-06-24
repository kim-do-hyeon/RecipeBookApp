package com.example.recipebookapp;// RecipeActivity.java

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {
    private FrameLayout modalContainer;
    private TextView foodTitle;
    private TextView recipeTime;
    private TextView recipeKcal;
    private TextView recipeServings;

    private ImageView recipeImageView;
    private Button modalButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        modalContainer = findViewById(R.id.modal_container);
        foodTitle = findViewById(R.id.food_title);
        recipeTime = findViewById(R.id.recipe_time_text);
        recipeKcal = findViewById(R.id.recipe_kcal_text);
        recipeServings = findViewById(R.id.recipe_servings_text);
        recipeImageView = findViewById(R.id.recipe_food_img);
        modalButton = findViewById(R.id.modal_button);

        Intent intent = getIntent();
        String itemTitle = intent.getStringExtra("itemTitle");
        String itemTime = intent.getStringExtra("itemTime");
        int itemImage = intent.getIntExtra("itemImage", 0);
        int itemKcal = intent.getIntExtra("itemKcal", 0);
        int itemServings = intent.getIntExtra("itemServings", 0);

        foodTitle.setText(itemTitle);
        recipeTime.setText(itemTime);
        recipeImageView.setImageResource(itemImage);
        recipeKcal.setText(String.valueOf(itemKcal) + " Kcal");
        recipeServings.setText(String.valueOf(itemServings) + " 인분");

        ImageView backIcon = findViewById(R.id.backicon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        modalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemTitle.equals("김치 볶음밥")) {
                    Intent intent = new Intent(RecipeActivity.this, KimchiFriedRice.class);
                    startActivity(intent);
                } else if (itemTitle.equals("닭 볶음탕")) {
                    Intent intent = new Intent(RecipeActivity.this, BraisedSpicyChicken.class);
                    startActivity(intent);
                }
                // 다른 레시피에 대한 조건문 추가

                // 원하는 레시피에 해당하는 자바 파일로 이동하는 조건문을 작성하세요.
            }
        });

    }
}
