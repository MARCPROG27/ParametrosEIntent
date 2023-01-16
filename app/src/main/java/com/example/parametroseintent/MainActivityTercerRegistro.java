package com.example.parametroseintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import com.example.parametroseintent.databinding.ActivityMainTercerRegistroBinding;

public class MainActivityTercerRegistro extends AppCompatActivity {

    private ActivityMainTercerRegistroBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainTercerRegistroBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // RECIBO DATOS DESDE MAINACTIVITY2
        Intent intent = getIntent();
        String Name = getIntent().getExtras().getString("Name");
        String LastName = getIntent().getExtras().getString("LastName");
        String Mail = getIntent().getExtras().getString("Mail");
        openFragment(Name, LastName, Mail);
        openFragmentosegundo();
    }


    // MÉTODO  ENVIA DATOS AL FRAGMENTO OPEN FRAGMENT


    private void openFragment(String Name, String LastName, String Mail) {

        BlankFragment fragmentDatos = BlankFragment.newInstance(Name, LastName, Mail);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.contenedordatos.getId(), fragmentDatos,
                        BlankFragment.class.getSimpleName());
        transaction.commit();

    }

    // Metodo instancia fragmento 2 el cual mostrará datos y escenario del tiempo
    private void openFragmentosegundo() {
        SecondFragment secondFragment = new SecondFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.tiempo.getId(), secondFragment,
                        SecondFragment.class.getSimpleName());
        transaction.commit();


    }

}