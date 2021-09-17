package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText val1, val2;
    TextView res;
    Button Suma, Resta, Multi, Divi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = (EditText) findViewById(R.id.valor1);
        val2 = (EditText)findViewById(R.id.valor2);
        res = (TextView) findViewById(R.id.valorResul);
        Suma = (Button) findViewById(R.id.suma);
        Resta = (Button) findViewById(R.id.resta);
        Multi = (Button) findViewById(R.id.multiplicar);
        Divi = (Button) findViewById(R.id.dividir);

        Suma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                suma();
            }
        });

        Resta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                resta();
            }
        });

        Multi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                multi();
            }
        });

        Divi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View v)
            {
                divi();
            }
        });


    }

    private void suma()
    {
        double  x,y;
        double r;
        x = Integer.parseInt(val1.getText().toString());
        y = Integer.parseInt(val2.getText().toString());
        r = x+y;
        res.setText(String.valueOf(r));
    }

    private void resta()
    {
        double  x,y;
        double r;
        x = Integer.parseInt(val1.getText().toString());
        y = Integer.parseInt(val2.getText().toString());
        r = x-y;
        res.setText(String.valueOf(r));
    }

    private void multi()
    {
        double  x,y;
        double r;
        x = Integer.parseInt(val1.getText().toString());
        y = Integer.parseInt(val2.getText().toString());
        r = x*y;
        res.setText(String.valueOf(r));
    }

    private void divi()
    {
        double  x,y;
        double r;
        x = Integer.parseInt(val1.getText().toString());
        y = Integer.parseInt(val2.getText().toString());
        r = x/y;
        res.setText(String.valueOf(r));
    }
}