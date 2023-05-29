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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private ViewGroup rootView;

    public static String Username;
    public static String Password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Login API Service Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://13.209.40.181:5555/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);


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
                    EditText edit_Username = findViewById(R.id.editTextUsername);
                    EditText edit_Password = findViewById(R.id.editTextPassword);
                    Username = edit_Username.getText().toString();
                    Password = edit_Password.getText().toString();

                    // Retrofit을 사용하여 POST 요청을 보냄
                    Call<Login_Model> call = apiService.login(Username, Password);
                    call.enqueue(new Callback<Login_Model>() {
                         @Override
                         public void onResponse(Call<Login_Model> call, Response<Login_Model> response) {
                             if (response.isSuccessful()) {
                                 Login_Model result = response.body();
                                 if(result.getType().equals("fail")){
                                    Toast.makeText(getApplicationContext(), "아이디 또는 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show();
                                 }else{
                                    Toast.makeText(getApplicationContext(), "환영합니다!", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                    startActivity(intent);
                                 }
                             } else {
                                 // 서버로부터 응답을 받았으나 실패한 경우의 처리 로직
                                 // 실패 이유 등을 확인.
                             }
                         }
                         @Override
                         public void onFailure(Call<Login_Model> call, Throwable t) {
                             // 요청 실패 시의 처리 로직
                         }
                    });
                });
                // 회원가입 버튼 클릭
                register_button.setOnClickListener(v -> {
                    View registerView = inflater.inflate(R.layout.register, rootView, false);
                    rootView.removeView(loginView);
                    rootView.addView(registerView);

                    Button register_submit = findViewById(R.id.register_submit);
                    register_submit.setOnClickListener(g -> {
                        // 회원가입 로직
                        EditText register_id = findViewById(R.id.register_id);
                        EditText register_password = findViewById(R.id.register_password);
                        Username = register_id.getText().toString();
                        Password = register_password.getText().toString();
                        Call<Login_Model> call = apiService.register(Username, Password);
                        call.enqueue(new Callback<Login_Model>() {
                            @Override
                            public void onResponse(Call<Login_Model> call, Response<Login_Model> response) {
                                if (response.isSuccessful()) {
                                    Login_Model result = response.body();
                                    if(result.getType().equals("duplicate")){
                                        Toast.makeText(getApplicationContext(), "이미 등록된 회원이 존재합니다.", Toast.LENGTH_SHORT).show();
                                    }else{
                                        Toast.makeText(getApplicationContext(), "회원가입이 정상적으로 처리되었습니다", Toast.LENGTH_SHORT).show();
                                        rootView.removeView(registerView);
                                        rootView.addView(loginView);
                                    }
                                } else {
                                    // 서버로부터 응답을 받았으나 실패한 경우의 처리 로직
                                    // 실패 이유 등을 확인.
                                }
                            }
                            @Override
                            public void onFailure(Call<Login_Model> call, Throwable t) {
                                // 요청 실패 시의 처리 로직
                            }
                        });
                    });



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

    };

}
