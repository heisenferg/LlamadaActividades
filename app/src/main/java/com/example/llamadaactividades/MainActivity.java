package com.example.llamadaactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int SELECCIONA_PROVINCIA = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SeleccionaProvincias.class);
                startActivityForResult(i, SELECCIONA_PROVINCIA);
            }
        });
    }




    public void onActivityResult (int requesCode, int resultCode, Intent data) {

        super.onActivityResult(requesCode, resultCode, data);
        if (requesCode==SELECCIONA_PROVINCIA){
            if (resultCode == RESULT_OK){
                TextView t = findViewById(R.id.t);
                t.setText("Se ha seleccionado " + data.getExtras().getString("SELECCION"));
            }
        }
    }
}