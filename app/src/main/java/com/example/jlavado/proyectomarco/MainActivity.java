package com.example.jlavado.proyectomarco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jlavado.proyectomarco.adapters.MarcoAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MarcoAdapter marcoAdapter;
    private ArrayList<Marco> itemMarcos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        ArrayAdapter<Marco> adapter = new ArrayAdapter<Marco>(this,R.layout.item_campo,R.id.txt_item,Marco.getMarcos());
//        ListView listView = (ListView) findViewById(R.id.list_item);
//        listView.setAdapter(adapter);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_campos);
        recyclerView.setAdapter(adapter);

        public void setearAdapter(){
            marcoAdapter = new MarcoAdapter(itemMarcos, new MarcoAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                }
            });
            recyclerView.setAdapter(marcoAdapter);
        }

    }
}
