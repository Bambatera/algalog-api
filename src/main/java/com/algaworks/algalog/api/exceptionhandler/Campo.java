/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.algalog.api.exceptionhandler;

/**
 *
 * @author leand
 */
public class Campo {
    
    private String nomeCampo;
    private String mensagem;

    public Campo(String nomeCampo, String mensagem) {
        this.nomeCampo = nomeCampo;
        this.mensagem = mensagem;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public String getMensagem() {
        return mensagem;
    }
    
    
}
