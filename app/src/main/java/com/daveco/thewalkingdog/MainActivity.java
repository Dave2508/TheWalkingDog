package com.daveco.thewalkingdog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        Mascotas = new ArrayList<Mascota>();

        Mascotas.add(new Mascota(R.drawable.schnauzer,R.drawable.bone, "Jack", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.french_poodle,R.drawable.bone, "Bob", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.pastor_alem_n,R.drawable.bone, "Sam", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.beagle,R.drawable.bone, "Zack", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.dachshund,R.drawable.bone, "Slinky", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.labrador,R.drawable.bone, "Chester", 0,R.drawable.bone_like));
        Mascotas.add(new Mascota(R.drawable.pitbull,R.drawable.bone, "Jhonny", 0,R.drawable.bone_like));

        ArrayList<String> nombreMascota = new ArrayList<>();
        for (Mascota mascota : Mascotas){
            nombreMascota.add(mascota.getNombre_mascota());
        }
    }

    public void GoMascotasFav (View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

}
