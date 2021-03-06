package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Admin_DetailsEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_events);

        Intent intent = getIntent();
        Veranstaltung v = (Veranstaltung) intent.getSerializableExtra("object");

        TextView tvBez = findViewById(R.id.tvName);
        tvBez.setText(v.getBezeichnung());

        TextView tvTeilnehmer = findViewById(R.id.tvTeilnehmer);
        tvTeilnehmer.setText(String.valueOf(v.getTeilnehmeranzahl()));

        TextView tvPreos = findViewById(R.id.tvPreis);
        tvPreos.setText(String.valueOf(v.getPreis()));

        TextView tvVon = findViewById(R.id.tvDVon);
        tvVon.setText(v.getDateVonAsString());

        TextView tvBis = findViewById(R.id.tvDBis);
        tvBis.setText(v.getDateBisAsString());

        TextView tvTreffort = findViewById(R.id.tvTreffort);
        tvTreffort.setText(v.getTreffOrt());

        Button b=findViewById(R.id.teilnehmer);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Admin_DetailsEvents.this,Admin_ShowTeilnehmer.class);
                startActivity(intent);
            }
        });

        Button save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

}