package com.example.youcontrolstory;






import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog.Builder;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button wi;
    Button lo;
    TextView sit;
    ProgressBar p;
    final int pro=25;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          wi=(Button)findViewById(R.id.button);
          lo=(Button)findViewById(R.id.button2);
          sit=(TextView)findViewById((R.id.textView));
          p=(ProgressBar)findViewById(R.id.progressBar2);
           sit.setText(R.string.a);
          lo.setText(R.string.a1);
          wi.setText(R.string.a2);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
           wi.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   x++;
                   p.incrementProgressBy(pro);
                   if(x==1)
                   {
                       sit.setText(R.string.b);
                       lo.setText(R.string.b1);
                       wi.setText(R.string.b2);
                       Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_SHORT).show();

                   }
                  else if(x==2)
                   {
                       sit.setText(R.string.c);
                       lo.setText(R.string.c1);
                       wi.setText(R.string.c2);
                       Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_SHORT).show();
                   }
                  else if(x==3)
                   {
                       sit.setText(R.string.d);
                       lo.setText(R.string.d1);
                       wi.setText(R.string.d2);
                       Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_SHORT).show();

                   }
                 else


                   {
                       androidx.appcompat.app.AlertDialog.Builder A = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this);
                       A.setTitle("The Prince of Persia and the Princess of Arabia got married!!");
                       A.setCancelable(false);
                       A.setPositiveButton("exit", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               finish();

                           }
                       });
                       A.show();
                   }


               }
           });



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
          lo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  androidx.appcompat.app.AlertDialog.Builder A = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this);
                  A.setTitle("The Prince is dead!!");
                  A.setCancelable(false);
                  A.setMessage("try a different Story line for a better ending");
                  A.setPositiveButton("exit", new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          finish();

                      }
                  });
                  A.show();
              }
          });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

}


