package com.example.leonardorios.myapplication.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.text.NoCopySpan;

import com.example.leonardorios.myapplication.modelos.Audios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Leonardo Rios on 11/10/2017.
 */

public class AudiosDAO extends SQLiteOpenHelper{
    public AudiosDAO(Context contexto)
    {
        super(contexto, "audios", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE Audios (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, descricao TEXT, url TEXT NOT NULL, pregador TEXT NOT NULL, serie TEXT, data DATE);";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS Audios;";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public void Insere(Audios audio)
    {
        SQLiteDatabase sqlLite = getWritableDatabase();

        ContentValues content = new ContentValues();
        content.put("nome", audio.getNome());
        content.put("descricao", audio.getDescricao());
        content.put("pregador", audio.getPregador());
        content.put("serie", audio.getSerie());
        content.put("url", audio.getUrl());

        sqlLite.insert("Audios", null, content);
    }

    public List<Audios> BuscaAudios()
    {
        String sql = "SELECT * FROM Audios;";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        List<Audios> audios = new ArrayList<Audios>();

        while (cursor.moveToNext())
        {
            Audios audio = new Audios();

            audio.setNome(cursor.getString(cursor.getColumnIndex("nome")));
            audio.setDescricao(cursor.getString(cursor.getColumnIndex("descricao")));
            audio.setUrl(cursor.getString(cursor.getColumnIndex("url")));
            audio.setPregador(cursor.getString(cursor.getColumnIndex("pregador")));
            audio.setSerie(cursor.getString(cursor.getColumnIndex("serie")));
        }

        return audios;
    }
}
