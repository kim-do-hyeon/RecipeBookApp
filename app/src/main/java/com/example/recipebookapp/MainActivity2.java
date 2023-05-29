package com.example.recipebookapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private ArrayList<ItemModel> itemModels;

    private AppCompatImageButton filterButton;

    private Dialog filterDialog;

    @SuppressLint({"ClickableViewAccessibility", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.list_item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemModels = new ArrayList<>();
        // 아이템 데이터를 생성하여 itemModels에 추가합니다.
        itemModels.add(new ItemModel("김치 볶음밥", "10 Min", R.drawable.food1, 4.5f));
        itemModels.add(new ItemModel("닭 볶음탕", "30 Min", R.drawable.food2, 3.8f));
        itemModels.add(new ItemModel("제육 볶음", "20 Min", R.drawable.food3, 4.2f));
        itemModels.add(new ItemModel("크림 리조또", "15 Min", R.drawable.food4, 3.8f));
        itemModels.add(new ItemModel("고구마 맛탕", "20 Min", R.drawable.food5, 3.8f));
        itemModels.add(new ItemModel("오뎅탕", "10 Min", R.drawable.food6, 3.8f));
        // 추가적인 아이템 데이터를 추가할 수 있습니다.

        itemAdapter = new ItemAdapter(this, itemModels);
        recyclerView.setAdapter(itemAdapter);

        filterButton = findViewById(R.id.filter_Button);
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // filter.xml을 인플레이션하여 다이얼로그로 표시
                LayoutInflater inflater = LayoutInflater.from(MainActivity2.this);
                View filterView = inflater.inflate(R.layout.filter, null);

                filterDialog = new Dialog(MainActivity2.this);
                filterDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                filterDialog.setContentView(filterView);

                // 다이얼로그 크기 및 위치 설정
                Window window = filterDialog.getWindow();
                WindowManager.LayoutParams layoutParams = window.getAttributes();
                layoutParams.gravity = Gravity.TOP;
                layoutParams.y = 300;
                window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, 900);

                filterDialog.show();
            }
        });
    }
}
