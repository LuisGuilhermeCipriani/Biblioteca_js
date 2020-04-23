/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void cadastrarLivro(){
        listaLivrosCadastrados.add(livro);
    }
    
    public void alugar(String nomeLivro, String nomeUsuario){
        for(Livro l: listaLivrosCadastrados){
            if(l.getNome().toLowerCase().trim().equals(nomeLivro.toLowerCase().trim())){
                if(l.isAlugado() == false){
                    l.setAlugado(true);
                    l.setUsuarioAluguel(nomeUsuario);
                    JOptionPane.showMessageDialog(null, "Livro " + l.getNome() + " Alugado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null, "Livro está alugado para " + nomeUsuario);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Livro Não Cadastrado");
            }
        }
    }
    
    public void devolver(String nomeLivro, String nomeUsuario){
        for(Livro l: listaLivrosCadastrados){
            if(l.getNome().toLowerCase().trim().equals(nomeLivro.toLowerCase().trim())){
                if(l.isAlugado() == true){
                    if(l.getUsuarioAluguel().toLowerCase().trim().equals(nomeUsuario.toLowerCase().trim())){
                        l.setAlugado(false);
                        JOptionPane.showMessageDialog(null, "Livro " + l.getNome() + " Devolvido com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Livro " + l.getNome() + " Não Está Alugado Para " + nomeUsuario);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Livro Não Cadastrado");
            }
        }
    }
}
