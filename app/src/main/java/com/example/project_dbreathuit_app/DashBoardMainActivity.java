package com.example.project_dbreathuit_app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashBoardMainActivity extends AppCompatActivity {
    private API_SERVICE apiService;
    private Button ButtonWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

//        bottomNavigationView.setOnItemSelectedListener(item -> {
//            if (item.getItemId() == R.id.bottom_home) {
//                // Do something for bottom_home
//                return true;
//            } else if (item.getItemId() == R.id.bottom_map) {
//                startActivity(new Intent(getApplicationContext(), MapActivity.class));
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//                return true;
//            } else if (item.getItemId() == R.id.bottom_newspaper) {
//                startActivity(new Intent(getApplicationContext(), NewspaperActivity.class));
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//                return true;
//            } else if (item.getItemId() == R.id.bottom_profile) {
//                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//                finish();
//                return true;
//            }
//
//            return false;
//        });

//        BottomNavigationView bottomNavigationView = findViewById(R.id.NavigationBottom);

//        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
//            switch (item.getItemId()) {
//                case R.id.dashboard_main:
//                    // Handle the Home tab
//                    return true;
//                case R.id.navigation_dashboard:
//                    // Handle the Dashboard tab
//                    return true;
//                case R.id.navigation_notifications:
//                    // Handle the Notifications tab
//                    return true;
//                default:
//                    return false;
//            }
//        });
//        ButtonWelcome = findViewById(R.id.ButtonWelcome);
//        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
//        String token = sharedPreferences.getString("token", "");
//        Log.d("hihihi",token);
////
//        apiService  = API_CLIENT.getClient("https://uiot.ixxc.dev/api/master/user/",token).create(API_SERVICE.class);
//        // Make the API call
//        Call<User> call = apiService.getUser();
//        call.enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                if (response.isSuccessful()) {
//                    Log.d("hihi","s");
//                    // Handle the successful response
//                    User data = response.body();
//                    ButtonWelcome.setText(data.getFirstName()+data.getLastName());
//                    // Do something with the data
//                } else {
//                    // Handle the error response
//                    Log.d("hihi","s1");
//
//                    // You can access the error message using response.errorBody().string()
//                }
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//                // Handle the network failure
//                Log.d("hihi","s2");
//
//            }
//        });
    }
}