package com.company_hidel.hemoapp.adpaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.company_hidel.hemoapp.R;
import com.company_hidel.hemoapp.modelos.Doador;

import java.util.List;

/**
 * Created by hidel on 29/03/2017.
 */

public class ListaDoadoresRVAdpter extends RecyclerView.Adapter<ListaDoadoresRVAdpter.ViewHolder> {
    private final Context context;
    private final List<Doador> lista_doadores;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.lista_doadores,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    //Preenche a linha dos itens
    public void onBindViewHolder(ViewHolder holder, int position) {
        Doador doador = this.lista_doadores.get(position);
        holder.tvDoadorNome.setText(doador.getNome());
        holder.tvDoadorSangue.setText(doador.getTipo_sanguineo());

    }

    @Override
    //Retorna quant itens da lista
    public int getItemCount() {
        return lista_doadores.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

            protected TextView tvDoadorNome;
            protected TextView tvDoadorSangue;


            public ViewHolder(View itemView) {
                super(itemView);

                tvDoadorNome = (TextView) itemView.findViewById(R.id.tv_doador_nome);
                tvDoadorSangue = (TextView) itemView.findViewById(R.id.tv_doador_tipoSanguineo);
            }
        }

        public ListaDoadoresRVAdpter(Context context, List<Doador>lista_doadores){

            this.context = context;
            this.lista_doadores = lista_doadores;
        }




}
