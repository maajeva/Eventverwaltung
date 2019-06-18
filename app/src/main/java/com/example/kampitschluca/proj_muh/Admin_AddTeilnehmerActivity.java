package com.example.kampitschluca.proj_muh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Admin_AddTeilnehmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__add_teilnehmer);

        ListView v= findViewById(R.id.lv);
        ArrayAdapter<Teilnehmer> adapter;
        ArrayList<Teilnehmer> arrayList=new ArrayList<Teilnehmer>();
        arrayList.add(new Teilnehmer(2,"Cheda","Maajeva","chedarine","test","chedas@gmx.at","0664"));
        arrayList.add(new Teilnehmer(3,"Luca","Kampe","kampes","test","kampi@gmx.at","0664"));
        adapter = new ArrayAdapter<Teilnehmer>(this,android.R.layout.simple_list_item_1, arrayList);

        v.setAdapter(adapter);
    }
}
