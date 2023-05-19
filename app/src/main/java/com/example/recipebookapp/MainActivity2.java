package com.example.recipebookapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private ArrayList<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.list_item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemModels = new ArrayList<>();
        // 아이템 데이터를 생성하여 itemModels에 추가합니다.
        itemModels.add(new ItemModel("김치 볶음밥", "10 Min", R.drawable.food1, 4.5f));
        itemModels.add(new ItemModel("제육 볶음", "15 Min", R.drawable.food2, 3.8f));
        itemModels.add(new ItemModel("크림 리조또", "20 Min", R.drawable.food2, 4.2f));
        // 추가적인 아이템 데이터를 추가할 수 있습니다.

        itemAdapter = new ItemAdapter(this, itemModels);
        recyclerView.setAdapter(itemAdapter);
    }
}
