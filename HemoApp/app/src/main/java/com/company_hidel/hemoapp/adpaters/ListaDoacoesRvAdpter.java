package com.company_hidel.hemoapp.adpaters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.company_hidel.hemoapp.R;
import com.company_hidel.hemoapp.modelos.Doacao;


import java.util.List;

/**
 * Created by hidel on 30/03/2017.
 */

public class ListaDoacoesRvAdpter extends RecyclerView.Adapter<ListaDoacoesRvAdpter.ViewHolder>{
    private final Context context;
    private final List<Doacao> lista_doacao;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_doacoes,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Doacao doacao = this.lista_doacao.get(position);
        holder.tv_Nome.setText(doacao.getDoador());
        holder.tv_Bolsa.setText(doacao.getQtdBolsas());
        holder.tv_Data.setText(doacao.getData());
        holder.tv_tpDoacao.setText(doacao.getTp_doacao());
        //PArei aki!!!!!!!!!!!!!!

    }

    @Override
    public int getItemCount() {
        return lista_doacao.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        protected TextView tv_Nome;
        protected TextView tv_Data;
        protected TextView tv_Bolsa;
        protected TextView tv_tpDoacao;



        public ViewHolder(View itemView) {
            super(itemView);

            tv_Nome = (TextView) itemView.findViewById(R.id.tv_doador_nome);
            tv_Data = (TextView) itemView.findViewById(R.id.tv_data);
            tv_Bolsa = (TextView) itemView.findViewById(R.id.tv_qtd_bolsa);
            tv_tpDoacao = (TextView) itemView.findViewById(R.id.tv_tp_doacao);
        }

    }
    public ListaDoacoesRvAdpter(Context context, List<Doacao> lista_doacao){


        this.context = context;
        this.lista_doacao = lista_doacao;
    }





}
