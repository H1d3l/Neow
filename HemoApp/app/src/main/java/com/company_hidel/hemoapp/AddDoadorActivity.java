package com.company_hidel.hemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.company_hidel.hemoapp.modelos.Doador;

public class AddDoadorActivity extends AppCompatActivity {

    private final String TAG = "AddDoadorActivity";

    EditText nome;
    EditText idade;
    RadioGroup sexo;
    Spinner tipoSangue;
    EditText telefone;
    Button confirmar;
    Button cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doador);

        nome = (EditText) findViewById(R.id.ed_Nome);
        idade = (EditText) findViewById(R.id.ed_idade);
        telefone = (EditText) findViewById(R.id.ed_phone);
        sexo =(RadioGroup) findViewById(R.id.bt_sexo);
        tipoSangue = (Spinner) findViewById(R.id.tipo_sanguineo);
        confirmar = (Button) findViewById(R.id.bt_Confirm);
    }

    public void SalvarDoador(View view) {
        String nomeString = nome.getText().toString();
        String idadeString = idade.getText().toString();
        String telefoneString = telefone.getText().toString();
        String sexoString = (sexo.getCheckedRadioButtonId() == R.id.bt_masculino) ? "Masculino" : "Feminino";
        String tipoSanguineo = tipoSangue.getSelectedItem().toString();
        Doador novo_doador = new Doador(nomeString,idadeString,sexoString,telefoneString,tipoSanguineo);
        Doador doador1 = Doador.findById(Doador.class,1);


        if(!nomeString.equals("") && !idadeString.equals("") && !telefoneString.equals("") && !sexoString.equals("") && !tipoSanguineo.equals("")){
            novo_doador.save();
            Toast.makeText(this,"Doador Cadastrado" ,Toast.LENGTH_SHORT).show();
            finish();

        }else{
            Toast.makeText(this,"Dados invalidos" ,Toast.LENGTH_SHORT).show();
            finish();




        }

        Log.i(TAG, "Doador: " + novo_doador);


    }


}
