package com.daveco.thewalkingdog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MascotasFavoritas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar mySecondBar = (Toolbar) findViewById(R.id.ab_actividad2);
        setSupportActionBar(mySecondBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
