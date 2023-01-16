package com.example.parametroseintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.example.parametroseintent.databinding.ActivityMainSegundoRegistroBinding;

public class MainActivitySegundoRegistro extends AppCompatActivity {

    private ActivityMainSegundoRegistroBinding mbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mbinding = ActivityMainSegundoRegistroBinding.inflate(getLayoutInflater());
        setContentView(mbinding.getRoot());

        //__________________________________________________________________________
        // --- boton escucha informacion y luego pasa los datos a las variables name,lastname y Mail

        mbinding.enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = mbinding.name.getText().toString();
                String lastName = mbinding.lastName.getText().toString();
                String Mail = mbinding.Mail.getText().toString();

                // con el siguiente log verificamos el contenido de las variables name y lastname
                Log.d("Prueba", name + "  " + lastName);

                if (name.isEmpty() || lastName.isEmpty() || Mail.isEmpty()) {
                    Toast.makeText(MainActivitySegundoRegistro.this, "Complete los campos", Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(MainActivitySegundoRegistro.this, "Hola" + name + "" + lastName, Toast.LENGTH_LONG).show();
                    //se llama al metodo para pasar datos
                    pasardatosaMain3(name, lastName, Mail);

                }


            }
        });

    }

    // con el siguiente método se envían las variables al mainactivity tercero

    private void pasardatosaMain3(String name, String lastName, String Mail) {
        Log.d("Prueba", " " + name + " " + lastName);
        Intent pasodedatosmain3 = new Intent(MainActivitySegundoRegistro.this, MainActivityTercerRegistro.class);
        pasodedatosmain3.putExtra("Name", name);
        pasodedatosmain3.putExtra("LastName", lastName);
        pasodedatosmain3.putExtra("Mail", Mail);
        startActivity(pasodedatosmain3);

    }

}
