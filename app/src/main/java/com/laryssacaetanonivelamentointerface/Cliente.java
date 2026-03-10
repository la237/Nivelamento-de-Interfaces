package com.laryssacaetanonivelamentointerface;

import android.util.Log;

import javax.security.auth.login.LoginException;

public class Cliente implements iCrud{
    private String nome;
    private String  email;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public void incluir() {
        Log.i(Api.TAG, "incluir: Cliente");
    }

    @Override
    public void alterar() {
        Log.i(Api.TAG, "alterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(Api.TAG, "deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(Api.TAG, "listar: Cliente");
    }
}
