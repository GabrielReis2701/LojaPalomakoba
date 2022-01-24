package com.example.telabemvindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class TelaBemVindo extends AppCompatActivity {

    TextView tv_nome;
    CheckBox Arroz,feijao,mamao;
    Button bt_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_bem_vindo);

        Arroz = findViewById(R.id.cb_Arroz);
        feijao = findViewById(R.id.cb_feijao);
        mamao = findViewById(R.id.cb_mamao);
        bt_calcular = findViewById(R.id.bt_calcular);
        tv_nome = findViewById(R.id.tv_nome);

        Intent it = getIntent();
        if (it != null){
            Bundle params = it.getExtras();
            String nome = params.getString("nome");
            String senha = params.getString("senha");
            tv_nome.setText(""+nome);
        }

        }
    public void calcular(View view){
        String carrinho = " ";
        Double valor =0.0;
        if(Arroz.isChecked()){
            carrinho +="Arroz\n";
            valor += 3.50;
        }
        if (feijao.isChecked()) {
                carrinho += " feijão\n";
                valor += 5.50;
        }
        if (mamao.isChecked()) {
                    carrinho += " mamao\n";
                    valor += 7.50;
        }
        Intent itv = new Intent(getBaseContext(),TotalApagar.class);
        Bundle param1 = new Bundle();
        param1.putString("nome",tv_nome.getText().toString());
        param1.putString("produtos",carrinho);
        param1.putDouble("vc",valor);
        itv.putExtras(param1);
        startActivity(itv);
    }


    }