package com.company_hidel.hemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class AddHospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hospital);

        Intent intent = getIntent();
    }


    public void bt_Confirmar(View view) {

    }

    public void bt_Cancelar(View view) {
    }
}
