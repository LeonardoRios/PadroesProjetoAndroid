package com.example.leonardorios.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.leonardorios.myapplication.DAO.AudiosDAO;
import com.example.leonardorios.myapplication.modelos.Audios;

import java.util.List;

public class ListaAudiosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_audios);

        //Código do formulário lista audios

        //String[] audios = {"audio1", "audio2", "audio3", "audio4"};
        AudiosDAO dao =  new AudiosDAO(this);
        List<Audios> audios = dao.BuscaAudios();

        dao.close();

        ListView lista = (ListView) findViewById(R.id.lista_audios);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, audios);

        lista.setAdapter(adapter);

        Button botao = (Button) findViewById(R.id.btnAdd);
        botao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intentFormulario = new Intent(ListaAudiosActivity.this, FormularioActivity.class);
                startActivity(intentFormulario);
            }
        });
    }

}
