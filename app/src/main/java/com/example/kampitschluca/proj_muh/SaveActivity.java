package com.example.kampitschluca.proj_muh;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class SaveActivity extends Activity {
    PopupWindow popUp;
    LinearLayout layout;
    TextView tv;
    LinearLayout.LayoutParams params;
    LinearLayout mainLayout;
    Button but;
    boolean click = true;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        popUp = new PopupWindow(this);
        layout = new LinearLayout(this);
        tv = new TextView(this);
        but = new Button(this);


                    popUp.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
                    popUp.update(50, 50, 300, 80);




        params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        layout.setOrientation(LinearLayout.VERTICAL);
        tv.setText("Is your input correct?");

        but.setText("Yes");
        but.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                    popUp.dismiss();
            }

        });
        layout.addView(tv, params);
        layout.addView(but, params);
        popUp.setContentView(layout);
      //  setContentView(layout);
    }
    }
