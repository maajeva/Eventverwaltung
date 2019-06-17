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

public class Admin_myEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_myevents);

        final ListView v= findViewById(R.id.lv);
        ArrayAdapter<Veranstaltung> adapter;
        ArrayList<Veranstaltung> arrayList=new ArrayList<Veranstaltung>();
        arrayList.add(new Veranstaltung(1,"Schwimmen",15,10,new Date(119,10,01),new Date(2019,10,02),"Villach"));
        adapter = new ArrayAdapter<Veranstaltung>(this,android.R.layout.simple_list_item_1, arrayList);

        v.setAdapter(adapter);

        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Veranstaltung s=(Veranstaltung) v.getItemAtPosition(position);
                Intent intent = new Intent(Admin_myEvents.this, Admin_DetailsEvents.class);
                intent.putExtra("object", s);
                startActivity(intent);
            }
        });


    }
}
