package com.example.ejemploreto1_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
Button recommendations,statistics,registerItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recommendations=findViewById(R.id.button3);
        statistics=findViewById(R.id.button2);
        registerItem=findViewById(R.id.button4);

        Intent recomendaciones= new Intent(getApplicationContext(),
                RecommendationActivity.class);
        Intent estadisticas= new Intent(getApplicationContext(),
                StatisticsActivity.class);
        Intent registrarItem= new Intent(getApplicationContext(),
                ItemRegisterActivity.class);

        recommendations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(recomendaciones);
            }
        });

        statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(estadisticas);
            }
        });
        registerItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(registrarItem);
            }
        });

    }
}