package com.example.summer_class;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.edtx);
        button=(Button)findViewById(R.id.btn);
        button1=(Button)findViewById(R.id.ui);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty())
                {
                    editText.setError("Enter a number");
                }
                else
                {
                    String s=editText.getText().toString();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("user",s);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

    public void ui(View view) {
        startActivity(new Intent(MainActivity.this,Main3Activity.class));
    }
}
