package com.example.telabemvindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TotalApagar extends AppCompatActivity {
    TextView tv_nomep,tv_itens,tv_valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_apagar);


        tv_nomep = findViewById(R.id.tv_nomep);
        tv_itens = findViewById(R.id.tv_itens);
        tv_valor = findViewById(R.id.tv_valor);

        Intent tp = getIntent();
        if(tp != null){
            Bundle params2 = tp.getExtras();
            String nome = params2.getString("nome");
            String carrinhoa = params2.getString("produtos");
            Double ValorC = params2.getDouble("vc");
            tv_nomep.setText(nome);
            tv_itens.setText("\n "+carrinhoa);
            tv_valor.setText(ValorC.toString());
        }

    }
}