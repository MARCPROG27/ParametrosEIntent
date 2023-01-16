package com.example.parametroseintent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.parametroseintent.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {
    private FragmentBlankBinding mBinding;
    private String name;
    private String LastName;
    private String Mail;

    public BlankFragment() {
        // Required empty public constructor
    }


    public static BlankFragment newInstance(String name, String LastName, String Mail) {
        BlankFragment fragment = new BlankFragment();
        // recibir o enviar datos
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("lastName", LastName);
        args.putString("Mail", Mail);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("name");
            LastName = getArguments().getString("lastName");
            Mail = getArguments().getString("Mail");
            //  COMPROBACION DE CONTENIDO DE VARIABLES CON LOG
            Log.d("Prueba", " " + name + " " + LastName);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentBlankBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }


    //  setear las variables recibidas
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mBinding.name1.setText(name);
        mBinding.LastName.setText(LastName);
        mBinding.Mail1.setText(Mail);
    }

}