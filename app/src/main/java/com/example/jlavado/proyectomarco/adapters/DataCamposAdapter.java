package com.example.jlavado.proyectomarco.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.jlavado.proyectomarco.Marco;
import com.example.jlavado.proyectomarco.R;

import java.util.ArrayList;

public class DataCamposAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context myContext;
    private ArrayAdapter<Marco> mydata;

    public DataCamposAdapter(ArrayAdapter<Marco> data)
    { mydata= data;}
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_campo,parent,false);

       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.itemView.setTextDirection(mydata);
    }

    @Override
    public int getItemCount() {
        return getItemCount();
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
