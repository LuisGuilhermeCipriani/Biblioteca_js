/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author cipri
 */
public class LivroController {
    private Livro livro;
    private List<Livro> listaLivrosCadastrados;

    public LivroController() {
        livro = new Livro();
        listaLivrosCadastrados = new ArrayList<>();
    }

    public LivroController(Livro livro, List<Livro> listaLivrosCadastrados) {
        this.livro = livro;
        this.listaLivrosCadastrados = listaLivrosCadastrados;
    }

    public List<Livro> getListaLivrosCadastrados() {
        return listaLivrosCadastrados;
    }
    
    public void cadastrarLivro(){
        listaLivrosCadastrados.add(livro);
    }
}
