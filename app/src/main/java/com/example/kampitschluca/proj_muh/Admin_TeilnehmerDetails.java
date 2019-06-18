package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Admin_TeilnehmerDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__teilnehmer_details);

        Intent intent = getIntent();
        Teilnehmer v = (Teilnehmer) intent.getSerializableExtra("object");

        TextView tvBez = findViewById(R.id.tv);
        tvBez.setText(v.getVorname()+" "+v.getNachname());
    }
}
