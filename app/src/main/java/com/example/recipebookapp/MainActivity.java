package com.example.recipebookapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private ViewGroup rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.welcome_to);
        textView2 = findViewById(R.id.recipe_book);
        rootView = findViewById(android.R.id.content);

        Animation moveAnimation = AnimationUtils.loadAnimation(this, R.anim.move_welcome);
        Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_animation);

        // 텍스트의 초기 위치 고정
        textView1.clearAnimation();
        textView2.clearAnimation();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 애니메이션 이후에 login.xml 레이아웃 추가
                // LayoutInflater를 사용하여 login.xml 레이아웃을 생성
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                View loginView = inflater.inflate(R.layout.login, rootView, false);

                // 적절한 위치에 login.xml 레이아웃 추가
                rootView.addView(loginView);

                // 투명도 애니메이션 실행
                loginView.startAnimation(fadeAnimation);
                Button login_button = findViewById(R.id.button_login);
                Button register_button = findViewById(R.id.button_register);
                // 버튼에 대한 추가적인 동작 등을 설정할 수 있습니다.
                // 로그인 버튼 클릭
                login_button.setOnClickListener(v -> {
                    // 버튼 클릭 시 수행할 동작
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                });
                // 회원가입 버튼 클릭
                register_button.setOnClickListener(v -> {
                    View registerView = inflater.inflate(R.layout.register, rootView, false);
                    rootView.removeView(loginView);
                    rootView.addView(registerView);
                    Button register_cancel = findViewById(R.id.register_cancel);
                    register_cancel.setOnClickListener(f -> {
                        rootView.removeView(registerView);
                        rootView.addView(loginView);
                    });
                });



            }
        }, 1000);

        // 애니메이션 실행
        textView1.startAnimation(moveAnimation);
        textView2.startAnimation(moveAnimation);
    }
}
