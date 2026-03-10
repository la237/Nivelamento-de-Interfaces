package com.laryssacaetanonivelamentointerface;

import android.util.Log;

public class Produto implements iCrud {
    private String Fornecedor;
    private String Nome;

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        Fornecedor = fornecedor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


    @Override
    public void incluir() {
        Log.i(Api.TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(Api.TAG, "alterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(Api.TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(Api.TAG, "listar: Produto");
    }
}
