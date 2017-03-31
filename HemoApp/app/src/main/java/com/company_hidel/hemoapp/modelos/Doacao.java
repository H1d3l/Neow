package com.company_hidel.hemoapp.modelos;

import com.orm.SugarRecord;

/**
 * Created by hidel on 29/03/2017.
 */

public class Doacao extends SugarRecord {
    private String data;
    private String doador;
    private String qtdBolsas;
    private String paciente;
    private String hospital;
    private String tp_doacao;


    public Doacao(String data, String doador, String qtdBolsas, String paciente, String hospital) {
        this.data = data;
        this.doador = doador;
        this.qtdBolsas = qtdBolsas;
        this.paciente = paciente;
        this.hospital = hospital;
    }

    public Doacao(String data, String doador, String qtdBolsas, String tp_doacao) {
        this.data = data;
        this.doador = doador;
        this.qtdBolsas = qtdBolsas;
        this.tp_doacao = tp_doacao;
    }



    public String getData() {
        return data;
    }

    public String getDoador() {
        return doador;
    }

    public String getQtdBolsas() {
        return qtdBolsas;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getHospital() {
        return hospital;
    }

    public String getTp_doacao() {
        return tp_doacao;
    }



    @Override
    public String toString() {
        return "Doacao{" +
                "data='" + data + '\'' +
                ", doador='" + doador + '\'' +
                ", qtdBolsas='" + qtdBolsas + '\'' +
                ", tp_doacao='" + tp_doacao + '\'' +
                '}';
    }
}
