package com.example.leonardorios.myapplication.modelos;

import java.util.Date;

/**
 * Created by Leonardo Rios on 09/10/2017.
 */

public class Audios {

    private Long id;
    private String nome;
    private String descricao;
    private String url;
    private String pregador;
    private String serie;
    private Date data;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPregador() {
        return pregador;
    }

    public void setPregador(String pregador) {
        this.pregador = pregador;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String toString()
    {
        return getNome();
    }
}
