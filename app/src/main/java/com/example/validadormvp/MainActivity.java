package com.example.validadormvp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.validadormvp.databinding.ActivityMainBinding;

public class MainActivity extends  AppCompatActivity implements  IViewPresenter  {
   private  ActivityMainBinding binding;
    String colordetexto;

    ValidationPresenter validationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        validationPresenter = new ValidationPresenter(this);

        binding.txtpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }


            @Override
            public void afterTextChanged(Editable editable) {
                validationPresenter.checkSegurity(binding.txtpassword.getText().toString());
                binding.txtpassword.setTextColor(Color.parseColor(colordetexto));


            }
        });

    }

    @Override
    public void showPasswordString(String textColor) {

        colordetexto = textColor;
    }


}