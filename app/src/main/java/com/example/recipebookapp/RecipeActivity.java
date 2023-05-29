package com.example.recipebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.recipebookapp.R;

public class RecipeActivity extends AppCompatActivity {
    private FrameLayout modalContainer;
    private TextView foodTitle;
    private TextView recipeTime;

    private ImageView recipeImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        modalContainer = findViewById(R.id.modal_container);
        foodTitle = findViewById(R.id.food_title);
        recipeTime = findViewById(R.id.recipe_time_text);
        recipeImageView = findViewById(R.id.recipe_food_img);


        // 모달 뷰 추가
        View modalView = createModalView();
        addModalView(modalView);

        // 인텐트에서 데이터 가져오기
        Intent intent = getIntent();
        String itemTitle = intent.getStringExtra("itemTitle");
        String itemTime = intent.getStringExtra("itemTime");
        int itemImage = intent.getIntExtra("itemImage",0);


        // 데이터 적용
        foodTitle.setText(itemTitle);
        recipeTime.setText(itemTime);
        recipeImageView.setImageResource(itemImage); // 이미지 설정

        ImageView backIcon = findViewById(R.id.backicon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity2
                Intent intent = new Intent(RecipeActivity.this, MainActivity2.class);
                startActivity(intent);
                finish(); // Optional, if you want to finish the current activity
            }
        });
    }

    // 모달 뷰 생성
    private View createModalView() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View modalView = inflater.inflate(R.layout.modal_view, modalContainer, false);
        // 필요한 경우 모달 뷰의 내용을 설정하거나 조작하는 추가적인 로직을 구현할 수 있습니다.
        return modalView;
    }

    // 모달 뷰 추가
    private void addModalView(View modalView) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.gravity = Gravity.BOTTOM;
        modalContainer.addView(modalView, layoutParams);
    }
}
