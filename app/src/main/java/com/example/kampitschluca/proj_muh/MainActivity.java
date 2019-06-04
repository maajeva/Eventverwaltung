package com.example.kampitschluca.proj_muh;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    boolean click = true;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teilnehmer);
        Button save  = findViewById(R.id.btnOkay);
        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
              Log.d("Im Button", "save");
                 /*   Intent intent = new Intent(MainActivity.this, SaveActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);*/
                 showPopup();
                }
        });
        Button cancel  = findViewById(R.id.btnCancel);
        cancel.setOnClickListener(new View.OnClickListener(){ @Override
        public void onClick(View v) {
            Log.d("Im Button", "cancel") ;
            finish();
        }
        });
    }
    private void showPopup() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setCancelable(false);
        dialog.setTitle("Last Check");
        dialog.setMessage("Every Entry right? \n Here are your inputs: \n" + getInputInfo() );
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
        Intent intent = new Intent(MainActivity.this, HB_MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
})
        .setNegativeButton("No ", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        //Action for "Cancel".
        }
        });

final AlertDialog alert = dialog.create();
        alert.show();
        }

private String getInputInfo() {
        TextView fn =  (EditText)findViewById(R.id.lbFirmenname);
        TextView vn =  (EditText)findViewById(R.id.lbVorname);
        TextView nn =  (EditText)findViewById(R.id.lbNachname);
        TextView pwd =  (EditText)findViewById(R.id.tfPassword);
        TextView username =  (EditText)findViewById(R.id.lbNachname);
        TextView email =  (EditText)findViewById(R.id.tfEmail);
        TextView adresse =  (EditText)findViewById(R.id.lbAdresse);
        TextView postleizahl =  (EditText)findViewById(R.id.tfPostZahl);
        TextView telNR = (EditText)findViewById(R.id.lbTelefonnummer);

        Veranstalter v = new Veranstalter(fn.getText().toString(),vn.getText().toString(),nn.getText().toString(),pwd.getText().toString(),username.getText().toString(),email.getText().toString(),adresse.getText().toString(),postleizahl.getText().toString(), telNR.getText().toString()) ;

        return "Firmenname: "+ v.getFirmenname() + "\nVorname: " + v.getVorname() + "\nNachname: " + v.getNachname()  + "\nPasswort: " +v.getPasswort() +  "\nUsername: " + v.getBenutzername() + "\nEmail: " + v.getEmail() + "\nAdresse: " + v.getAdresse() + " \nPostleizahl: " + v.getPostleizahl() + "\nTelefonnummer: " + v.getTelNr();
    }
}
