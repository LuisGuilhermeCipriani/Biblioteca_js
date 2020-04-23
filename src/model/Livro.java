/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumerator.Genero;

/**
 *
 * @author cipri
 */
public class Livro {
    private String nome;
    private String autor;
    private Genero genero;
    private String editora;
    private boolean alugado = false;
    private String lancamento;
    private int ID;
    private String usuarioAluguel;

    public Livro() {
    }

    public Livro(String nome, String autor, Genero genero, String editora, String lancamento, int ID, String usuarioAluguel) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.lancamento = lancamento;
        this.ID = ID;
        this.usuarioAluguel = usuarioAluguel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsuarioAluguel() {
        return usuarioAluguel;
    }

    public void setUsuarioAluguel(String usuarioAluguel) {
        this.usuarioAluguel = usuarioAluguel;
    }

    public String mensagemAluguel(){
        if(isAlugado()){
            return "Sim";
        }
        return "Não";
    }
    
}
