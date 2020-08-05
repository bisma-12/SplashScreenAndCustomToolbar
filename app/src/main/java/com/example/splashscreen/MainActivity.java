package com.example.splashscreen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    TextView txt;
    int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_tool_bar);

        // type casting of xml elements to java
        btn1=(Button)findViewById(R.id.button_count);
        btn2=(Button)findViewById(R.id.button_reset);
        btn3=(Button)findViewById(R.id.button_minus);
        txt=(TextView)findViewById(R.id.show);



        // creating listeners

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                txt.setText(String.valueOf(cont));

            }
        });

       btn2.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               cont=0;
               txt.setText(String.valueOf(cont));
               return false;
           }
       });

       btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (cont>0){
                   cont--;
                   txt.setText(String.valueOf(cont));

               }

           }
       });
    }


}