package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyEventsDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events_details);

        Intent intent = getIntent();
        Veranstaltung v= (Veranstaltung)intent.getSerializableExtra("object");

        TextView tvBez=findViewById(R.id.tvName);
        tvBez.setText(v.getBezeichnung());

        TextView tvTeilnehmer=findViewById(R.id.tvTeilnehmer);
        tvTeilnehmer.setText(String.valueOf(v.getTeilnehmeranzahl()));

        TextView tvPreos=findViewById(R.id.tvPreis);
        tvPreos.setText(String.valueOf(v.getPreis()));

        TextView tvVon=findViewById(R.id.tvDVon);
        tvVon.setText(v.getDateVonAsString());

        TextView tvBis=findViewById(R.id.tvDBis);
        tvBis.setText(v.getDateBisAsString());

        TextView tvTreffort=findViewById(R.id.tvTreffort);
        tvTreffort.setText(v.getTreffOrt());
    }
}
