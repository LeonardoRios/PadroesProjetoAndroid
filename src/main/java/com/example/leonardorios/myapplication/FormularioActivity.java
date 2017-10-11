package com.example.leonardorios.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.leonardorios.myapplication.DAO.AudiosDAO;
import com.example.leonardorios.myapplication.modelos.Audios;

public class FormularioActivity extends AppCompatActivity {

    private FormularioHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        helper = new FormularioHelper(this);

        //Código do formulário lista audios

        Button botao = (Button) findViewById(R.id.btnsalvar);
        botao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Toast.makeText(FormularioActivity.this, "Botão clicado!", Toast.LENGTH_SHORT).show();

                Audios audio = helper.PegaAudio();

                AudiosDAO dao = new AudiosDAO(FormularioActivity.this);

                dao.Insere(audio);

                Intent intentFormulario = new Intent(FormularioActivity.this, ListaAudiosActivity.class);
                finish();
            }
        });

    }

}
