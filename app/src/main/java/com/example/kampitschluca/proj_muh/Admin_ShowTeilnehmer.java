package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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


    }
}