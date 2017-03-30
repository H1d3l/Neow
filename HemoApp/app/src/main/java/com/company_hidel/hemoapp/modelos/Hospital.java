package com.company_hidel.hemoapp.modelos;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.util.List;

/**
 * Created by hidel on 27/03/2017.
 */

public class Hospital extends SugarRecord{
    private String nome_Hospital;
    private String rua;
    private int numero;
    private String cidade;
    private String uf;
    private int telefone;
    private String email;


    public Hospital(){

    }

    public Hospital(String nome,String rua,int numero,String cidade,String uf,int telefone,String email){
        this.nome_Hospital = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;

    }
}
