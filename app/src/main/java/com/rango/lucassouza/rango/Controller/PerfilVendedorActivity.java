package com.rango.lucassouza.rango.Controller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.rango.lucassouza.rango.R;
import com.rango.lucassouza.rango.adapter.CustomListAdapter;
import com.rango.lucassouza.rango.adapter.HorizontalAdapter;

import java.util.List;

public class PerfilVendedorActivity extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Dog1",
            "Dog2",
            "Dog3",
            "Dog4",
            "Dog5"
    };

    Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_vendedor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView horizontal_recycler_view= (RecyclerView) findViewById(R.id.product_list);

        HorizontalAdapter horizontalAdapter=new HorizontalAdapter(itemname,imgid);

        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(PerfilVendedorActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);


        horizontal_recycler_view.setAdapter(horizontalAdapter);



        /*CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView) findViewById(R.id.product_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });*/


    }


}
