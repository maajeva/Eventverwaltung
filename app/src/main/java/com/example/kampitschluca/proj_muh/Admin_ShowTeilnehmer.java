package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class Admin_ShowTeilnehmer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_teilnehmerlist);

        final ListView v= findViewById(R.id.lv);
        ArrayAdapter<Teilnehmer> adapter;
        ArrayList<Teilnehmer> arrayList=new ArrayList<Teilnehmer>();
        arrayList.add(new Teilnehmer(1,"Lukas","Kerth","lukas","test","luki@gmx.at","0664"));
        adapter = new ArrayAdapter<Teilnehmer>(this,android.R.layout.simple_list_item_1, arrayList);

        v.setAdapter(adapter);

        Button b=findViewById(R.id.addTeilnehmer);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Admin_ShowTeilnehmer.this,Admin_AddTeilnehmerActivity.class);
                startActivity(intent);
            }
        });

        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Teilnehmer t=(Teilnehmer) v.getItemAtPosition(position);
                Intent intent = new Intent(Admin_ShowTeilnehmer.this, Admin_TeilnehmerDetails.class);
                intent.putExtra("object", t);
                startActivity(intent);
            }
        });


    }
}