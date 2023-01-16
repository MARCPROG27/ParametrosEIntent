package com.example.parametroseintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.parametroseintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // DECLARAMOS LA VARIABLE BINDING
    private ActivityMainBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // AQUI SE INFLA LA VISTA
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // AQUI CON INTENT PASAMOS AL SIGUIENTE ACTIVITY
        binding.registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent passSecond = new Intent(MainActivity.this, MainActivitySegundoRegistro.class);
                startActivity(passSecond);
            }
        });

    }
}