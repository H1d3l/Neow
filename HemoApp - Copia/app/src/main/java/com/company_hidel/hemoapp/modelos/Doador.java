package com.company_hidel.hemoapp.modelos;

import com.orm.SugarRecord;

/**
 * Created by hidel on 27/03/2017.
 */

public class Doador extends SugarRecord{
    private String nome;
    private String idade;
    private String sexo;
    private String telefone;
    private String tipo_sanguineo;


    public Doador(){

    }

    public Doador(String nome,String idade,String sexo,String telefone,String tipo_sanguineo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    @Override
    public String toString() {
        return "Doador{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipo_sanguineo='" + tipo_sanguineo + '\'' +
                '}';
    }
}
