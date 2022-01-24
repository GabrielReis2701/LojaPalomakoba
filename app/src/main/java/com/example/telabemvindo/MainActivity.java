package com.example.telabemvindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_nome,et_senha;
    Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nome = findViewById(R.id.et_nome);
        et_senha = findViewById(R.id.et_senha);
        bt_entrar = findViewById(R.id.bt_entrar);

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),TelaBemVindo.class);
                Bundle params = new Bundle();
                params.putString("nome",et_nome.getText().toString());
                params.putString("senha",et_senha.getText().toString());
                String senha = et_senha.getText().toString();
                i.putExtras(params);
                startActivity(i);

            }
        });
    }
}