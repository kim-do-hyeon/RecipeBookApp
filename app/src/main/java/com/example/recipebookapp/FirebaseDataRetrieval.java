package com.example.recipebookapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirebaseDataRetrieval extends AppCompatActivity {
    private static final String TAG = "FirebaseDataRetrieval";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터베이스 참조 생성
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("COOKRCP01");

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot rowSnapshot : dataSnapshot.getChildren()) {
                        String rowKey = rowSnapshot.getKey();
                        DataSnapshot rowDataSnapshot = rowSnapshot.child("row");

                        if (rowDataSnapshot.exists()) {
                            String infoCar = rowDataSnapshot.child("INFO_CAR").getValue(String.class);
                            String infoEng = rowDataSnapshot.child("INFO_ENG").getValue(String.class);
                            String infoFat = rowDataSnapshot.child("INFO_FAT").getValue(String.class);
                            String infoNa = rowDataSnapshot.child("INFO_NA").getValue(String.class);
                            String infoPro = rowDataSnapshot.child("INFO_PRO").getValue(String.class);
                            String infoWgt = rowDataSnapshot.child("INFO_WGT").getValue(String.class);
                            String manual01 = rowDataSnapshot.child("MANUAL01").getValue(String.class);
                            String manual02 = rowDataSnapshot.child("MANUAL02").getValue(String.class);
                            String manual03 = rowDataSnapshot.child("MANUAL03").getValue(String.class);
                            // ... 필요한 다른 데이터 속성들도 가져오기

                            // 분리된 데이터 활용 예시: Log로 출력
                            Log.d(TAG, "Row: " + rowKey);
                            Log.d(TAG, "INFO_CAR: " + infoCar);
                            Log.d(TAG, "INFO_ENG: " + infoEng);
                            Log.d(TAG, "INFO_FAT: " + infoFat);
                            Log.d(TAG, "INFO_NA: " + infoNa);
                            Log.d(TAG, "INFO_PRO: " + infoPro);
                            Log.d(TAG, "INFO_WGT: " + infoWgt);
                            Log.d(TAG, "MANUAL01: " + manual01);
                            Log.d(TAG, "MANUAL02: " + manual02);
                            Log.d(TAG, "MANUAL03: " + manual03);
                            // ... 필요한 다른 데이터 속성들도 출력

                            // 분리된 데이터를 활용하여 작업 수행
                            // ...

                        } else {
                            Log.e(TAG, "No 'row' data found for Row " + rowKey);
                        }
                    }
                } else {
                    Log.e(TAG, "No data found at 'COOKRCP01' path");
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.e(TAG, "Data retrieval cancelled: " + error.getMessage());
            }
        });
    }
}
