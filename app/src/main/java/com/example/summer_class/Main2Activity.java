package com.example.summer_class;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button button_log,button_pow,button_tab,button_fact;
    Double a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_log=(Button)findViewById(R.id.log10);
        button_pow=(Button)findViewById(R.id.power);
        button_tab=(Button)findViewById(R.id.table);
        button_fact=(Button)findViewById(R.id.fact);
        Bundle bundle = getIntent().getExtras();
        String s= bundle.getString("user");
        a=Double.parseDouble(s);
        button_log.setOnClickListener(Main2Activity.this);
        button_fact.setOnClickListener(Main2Activity.this);
        button_tab.setOnClickListener(Main2Activity.this);
        button_pow.setOnClickListener(Main2Activity.this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.log10:
                //Toast.makeText(Main2Activity.this,Double.toString(Math.log10(a)),Toast.LENGTH_LONG).show();
                AlertDialog.Builder alert1= new AlertDialog.Builder(Main2Activity.this);
                alert1.setTitle("Log 10");
                alert1.setMessage(Double.toString(Math.log10(a)));
                alert1.show();
                break;
            case R.id.fact:
                int fact=1;
                for (int i=1;i<=Math.abs(a);i++)
                {
                    fact=fact*i;
                }

                //Toast.makeText(Main2Activity.this,Integer.toString(fact),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alert2= new AlertDialog.Builder(Main2Activity.this);
                alert2.setTitle("factorial");
                alert2.setMessage(Double.toString(fact));
                alert2.show();
                break;
            case R.id.power:
                //Toast.makeText(Main2Activity.this,Double.toString(Math.pow(a,5)),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alert3= new AlertDialog.Builder(Main2Activity.this);
                alert3.setTitle("Power of 5");
                alert3.setMessage(Double.toString(Math.pow(a,5)));
                alert3.show();
                break;
            case R.id.table:
                String t="";
                for (int i=1;i<=10;i++)
                {
                    t=t+a*i+"\n";
                }
                //Toast.makeText(Main2Activity.this,t,Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alert4= new AlertDialog.Builder(Main2Activity.this);
                alert4.setTitle("Table");
                alert4.setMessage(t);
                alert4.show();
                break;
        }

    }
}
