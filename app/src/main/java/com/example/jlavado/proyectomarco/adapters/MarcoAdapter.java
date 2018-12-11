package com.example.jlavado.proyectomarco.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jlavado.proyectomarco.Modelo.Marco;
import com.example.jlavado.proyectomarco.R;

import java.util.ArrayList;

public class MarcoAdapter extends RecyclerView.Adapter<MarcoAdapter.ViewHolder>{
    ArrayList<Marco> itemMarco;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    public MarcoAdapter(ArrayList<Marco> itemMarcos,OnItemClickListener onItemClickListener) {
        this.itemMarco=itemMarcos;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.txtCampo1.setText(String.valueOf(itemMarco.get(position).getCampo1()));
        holder.txtCampo2.setText(String.valueOf(itemMarco.get(position).getCampo2()));
        holder.txtCampo3.setText(String.valueOf(itemMarco.get(position).getCampo3()));
        holder.txtCampo4.setText(String.valueOf(itemMarco.get(position).getCampo4()));
        holder.txtCampo5.setText(String.valueOf(itemMarco.get(position).getCampo5()));
        holder.txtCampo6.setText(String.valueOf(itemMarco.get(position).getCampo6()));
        holder.txtCampo7.setText(String.valueOf(itemMarco.get(position).getCampo7()));

    }

    @Override
    public int getItemCount() {
        return itemMarco.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtCampo1;
        TextView txtCampo2;
        TextView txtCampo3;
        TextView txtCampo4;
        TextView txtCampo5;
        TextView txtCampo6;
        TextView txtCampo7;


        public ViewHolder(View itemView) {
            super(itemView);
            txtCampo1 =   itemView.findViewById(R.id.txt_campo1);
            txtCampo2 =   itemView.findViewById(R.id.txt_campo2);
            txtCampo3 =   itemView.findViewById(R.id.txt_campo3);
            txtCampo4 =   itemView.findViewById(R.id.txt_campo4);
            txtCampo5 =   itemView.findViewById(R.id.txt_campo5);
            txtCampo6 =   itemView.findViewById(R.id.txt_campo6);
            txtCampo7 =   itemView.findViewById(R.id.txt_campo7);

        }
    }





}
