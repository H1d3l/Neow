package com.company_hidel.hemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.company_hidel.hemoapp.adpaters.ListaDoadoresRVAdpter;
import com.company_hidel.hemoapp.modelos.Doador;

import java.util.List;

public class ListaDoadoresActivity extends AppCompatActivity {

    private RecyclerView rvDoador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_doadores);
        rvDoador = (RecyclerView) findViewById(R.id.rv_listaDoadores);
        Intent intent = getIntent();
        carregar_Doadores();




    }
    public void carregar_Doadores() {

        List<Doador> lista_doador = Doador.listAll(Doador.class);

        //Adpter
        ListaDoadoresRVAdpter adapter = new ListaDoadoresRVAdpter(this, lista_doador);

        //teste de um modelo
        //RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_listaDoadores);
        rvDoador.setAdapter(adapter);
        //LayoutManager
        rvDoador.setLayoutManager(new LinearLayoutManager(this));


    }




}
