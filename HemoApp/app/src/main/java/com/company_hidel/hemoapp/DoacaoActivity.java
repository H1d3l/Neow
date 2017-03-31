package com.company_hidel.hemoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ViewStubCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.company_hidel.hemoapp.adpaters.ListaDoacoesRvAdpter;
import com.company_hidel.hemoapp.modelos.Doacao;

import java.util.List;

public class DoacaoActivity extends AppCompatActivity {

    private final String TAG = "DoacaoActivity";

    EditText edpaciente;
    EditText edhospital;
    EditText ednome ;
    EditText edata ;
    RadioGroup qtdBolsa ;
    RadioGroup tp_doacao;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__doacao);

        ednome = (EditText) findViewById(R.id.ed_Nome);
        edata = (EditText) findViewById(R.id.ed_data);
        qtdBolsa = (RadioGroup) findViewById(R.id.Bolsas);
        tp_doacao = (RadioGroup) findViewById(R.id.tp_doacao);


    }

    public void seleciona_destino(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final View viewDialog = getLayoutInflater().inflate(R.layout.informacao_destino, null);

        builder.setView(viewDialog)
                .setTitle("Informação Destino")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edpaciente = (EditText) viewDialog.findViewById(R.id.ed_username);
                        edhospital = (EditText) viewDialog.findViewById(R.id.ed_info_hospital);

                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }



    public void SalvarDoacao(View view) {

//        String paciente = edpaciente.getText().toString();
  //      String hospital = edhospital.getText().toString();

        String nome = ednome.getText().toString();
        String data = edata.getText().toString();
        String doacao = (tp_doacao.getCheckedRadioButtonId() == R.id.rb_Livre) ? "Livre" : "Destinada" ;
        String bolsa = (qtdBolsa.getCheckedRadioButtonId() == R.id.n1 )? "1 bolsa" : "2 bolsas";

            Doacao nova_doacao = new Doacao(data, nome, bolsa, doacao);
            nova_doacao.save();
            Toast.makeText(this, "Doacao Cadastrada", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Doador: " + nova_doacao);
            Log.i(TAG, "Saiu da Activity da doação ");
            finish();


        /*else if (!doacao.equals("Livre")){
            Doacao nova_doacao = new Doacao(data, nome, bolsa,paciente,hospital);
            nova_doacao.save();
            Toast.makeText(this, "Doacao Cadastrada", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Doador: " + nova_doacao);
            Log.i(TAG, "Saiu da Activity da doação ");
            finish();
            }

*/




    }



}
