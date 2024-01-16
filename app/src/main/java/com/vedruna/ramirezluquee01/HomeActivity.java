package com.vedruna.ramirezluquee01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    // El error que estás enfrentando indica que hay un intento de invocar el método getNavController() en un objeto nulo
    // de tipo NavHostFragment. Esto significa que NavHostFragment navHostFragment = (NavHostFragment)
    // getSupportFragmentManager().findFragmentById(R.id.frame); está devolviendo null.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //String userName = getIntent().getStringExtra("userName");

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        NavController navController = navHostFragment.getNavController();

            bottomNavigationView.setOnItemSelectedListener(item -> {
                if (item.getItemId() == R.id.navigation_home) {
                    navController.navigate(R.id.homeFragment);
                } else if (item.getItemId() == R.id.navigation_count) {
                    navController.navigate(R.id.countFragment);
                } else if (item.getItemId() == R.id.navigation_map) {
                    navController.navigate(R.id.mapsFragment);
                } else if (item.getItemId() == R.id.navigation_exit) {
                    finish();
                }
                return true;
            });

    }

}