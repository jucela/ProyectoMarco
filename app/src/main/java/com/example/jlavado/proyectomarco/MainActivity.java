package com.example.jlavado.proyectomarco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jlavado.proyectomarco.Modelo.Marco;
import com.example.jlavado.proyectomarco.Modelo.MarcoFiltro;
import com.example.jlavado.proyectomarco.adapters.DataCamposAdapter;
import com.example.jlavado.proyectomarco.adapters.MarcoAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MarcoAdapter marcoAdapter;
    private ArrayList<Marco> itemMarcos;
    private DataCamposAdapter adapter;
    //private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<Marco> adapter = new ArrayAdapter<Marco>(this,R.layout.item_campo,R.id.txt_item1,Marco.getMarcos());
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);

//        ArrayAdapter<MarcoFiltro> adapterSp1 = new ArrayAdapter<MarcoFiltro>(this,R.layout.item_campo,R.id.txt_item1,MarcoFiltro.getConfigFiltro());
////        Spinner spinner = (Spinner) findViewById(R.id.sp_filtro1);
////        spinner.setAdapter(adapterSp1);
//
//        ArrayAdapter<String> adapterSp2 = new ArrayAdapter<String>(this,R.layout.item_campo,R.id.txt_item1,MarcoFiltro.getFiltros());
//        Spinner spinner2 = (Spinner) findViewById(R.id.sp_filtro2);
//        spinner2.setAdapter(adapterSp2);

        ArrayList<MarcoFiltro> filtros=new ArrayList<MarcoFiltro>(MarcoFiltro.getConfigFiltro());

        procesarFiltro1(filtros);



    }

    public void procesarFiltro1(ArrayList<MarcoFiltro> datos) {
        String x = String.valueOf(datos.get(0).getPosicion());
        Toast.makeText(MainActivity.this, "valor:" + x, Toast.LENGTH_SHORT).show();
        //itemMarcos = new ArrayList<Marco>();


        if (x.equals("1")) {
             ArrayAdapter<MarcoFiltro> adapterSp1 = new ArrayAdapter<MarcoFiltro>(this,R.layout.item_campo,R.id.txt_item1,datos);
             Spinner spinner = (Spinner) findViewById(R.id.sp_filtro1);
             spinner.setAdapter(adapterSp1);
        }
        else {Toast.makeText(MainActivity.this, "valor:" + datos.get(1), Toast.LENGTH_SHORT).show();}
    }

}
