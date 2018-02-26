package com.uninorte.futbolistas;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Futbolistas[] futbolistasArray = new Futbolistas[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView1 = findViewById(R.id.lv1);
        final Intent in = new Intent(this, Main2Activity.class);
        Futbolistas[] jugadores = {
                new Futbolistas("Juan","Lopez","Delantero","On"),
                new Futbolistas("Pedro","Martinez","Defensa","On"),
                new Futbolistas("Carlos","Loquesea","Delantero","Off"),
                new Futbolistas("Ramon","Arrieta","Defensa","Off"),
                new Futbolistas("Luis","Lalo","Arquero","On")
        };

        ArrayAdapter<Futbolistas> adapter = new ArrayAdapter<Futbolistas>(this, android.R.layout.simple_list_item_1,jugadores);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(in);
            }
        });
    }



}
