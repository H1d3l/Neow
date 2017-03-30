package com.company_hidel.hemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.company_hidel.hemoapp.adpaters.ListaDoadoresRVAdpter;
import com.company_hidel.hemoapp.modelos.Doador;

import java.util.List;

public class ListaDoadoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_doadores);


        RecyclerView rvDoador = (RecyclerView) findViewById(R.id.rv_listaDoadores);

        List<Doador> lista_doadores = Doador.listAll(Doador.class);
        //Adpter
        ListaDoadoresRVAdpter adpter = new ListaDoadoresRVAdpter(this,lista_doadores);
        //LayoutManager
        rvDoador.setLayoutManager(new LinearLayoutManager(this));
    }
}
