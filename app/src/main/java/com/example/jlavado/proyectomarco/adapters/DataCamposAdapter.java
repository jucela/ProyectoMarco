package com.example.jlavado.proyectomarco.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jlavado.proyectomarco.Modelo.Marco;
import com.example.jlavado.proyectomarco.R;

import java.util.ArrayList;

public class DataCamposAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context myContext;
    private ArrayList<Marco> myData;

    public DataCamposAdapter(ArrayList<Marco> Data)
    { myData= Data;}
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_campo,parent,false);

       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.itemView.setTextDirection(myData.indexOf(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView item1,item2;

        public ViewHolder(View itemView) {
            super(itemView);

            item1 = (TextView) itemView.findViewById(R.id.txt_item1);
            item2 = (TextView) itemView.findViewById(R.id.txt_item2);
        }
    }
}
