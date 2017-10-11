package com.example.leonardorios.myapplication;

import android.widget.DatePicker;
import android.widget.EditText;

import com.example.leonardorios.myapplication.modelos.Audios;

/**
 * Created by Leonardo Rios on 09/10/2017.
 */

public class FormularioHelper {

    private final EditText campo_nome;
    private final EditText campo_descricao;
    private final EditText campo_url;
    private final EditText campo_pregador;
    private final EditText campo_serie;
    private final DatePicker campo_data;

    public FormularioHelper(FormularioActivity formulario_activity)
    {
        campo_nome = (EditText) formulario_activity.findViewById(R.id.audio_nome);
        campo_descricao = (EditText) formulario_activity.findViewById(R.id.audio_desc);
        campo_url = (EditText) formulario_activity.findViewById(R.id.audio_url);
        campo_pregador = (EditText) formulario_activity.findViewById(R.id.audio_pregador);
        campo_serie = (EditText) formulario_activity.findViewById(R.id.audio_serie);
        campo_data = (DatePicker) formulario_activity.findViewById(R.id.date_picker);
    }

    public Audios PegaAudio()
    {
        Audios audio = new Audios();

        audio.setNome(campo_nome.getText().toString());
        audio.setDescricao(campo_descricao.getText().toString());
        audio.setUrl(campo_url.getText().toString());
        audio.setPregador(campo_pregador.getText().toString());
        audio.setSerie(campo_serie.getText().toString());
        //audio.setData(campo_data.get);

        return audio;
    }
}
