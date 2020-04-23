/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import enumerator.Genero;
import java.util.List;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author cipri
 */
public class FormTelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FormTelaCadastro
     */
    public FormTelaCadastro() {
        initComponents();
    }

    public void selecionaGenero(){
        if(CBGenero.getSelectedItem().equals("Biografia")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Biografia);
        }else if(CBGenero.getSelectedItem().equals("Conto")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Conto);
        }else if(CBGenero.getSelectedItem().equals("Drama")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Drama);
        }else if(CBGenero.getSelectedItem().equals("Ficção")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Ficção);
        }else if(CBGenero.getSelectedItem().equals("Historia")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Historia);
        }else if(CBGenero.getSelectedItem().equals("Poesia")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Poesia);
        }else if(CBGenero.getSelectedItem().equals("Quadrinhos")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Quadrinhos);
        }else if(CBGenero.getSelectedItem().equals("Terror")){
            FormTelaPrincipal.livroController.getLivro().setGenero(Genero.Terror);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LBCadastrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFNome = new javax.swing.JTextField();
        TFData = new javax.swing.JTextField();
        TFAutor = new javax.swing.JTextField();
        TFEditora = new javax.swing.JTextField();
        CBGenero = new javax.swing.JComboBox<>();
        BTLimpar = new javax.swing.JButton();
        BTSalvar = new javax.swing.JButton();
        BTSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setEnabled(false);

        LBCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBCadastrar.setText("Digite as informações abaixo para cadastrar um livro");

        jLabel2.setText("Nome do Livro");

        jLabel3.setText("Autor do Livro");

        jLabel4.setText("Gênero do Livro");

        jLabel5.setText("Editora do Livro");

        jLabel6.setText("Data de Lançamento do Livro");

        TFNome.setToolTipText("Ex: Helena");

        TFData.setToolTipText("");

        CBGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma das opções", "Biografia", "Conto", "Drama", "Ficção", "Historia", "Poesia", "Quadrinhos", "Terror" }));

        BTLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/limpar.png"))); // NOI18N
        BTLimpar.setText("Limpar");
        BTLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTLimparActionPerformed(evt);
            }
        });

        BTSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/salvar.png"))); // NOI18N
        BTSalvar.setText("Cadastrar");
        BTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalvarActionPerformed(evt);
            }
        });

        BTSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/sair.png"))); // NOI18N
        BTSair.setText("Sair");
        BTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBCadastrar)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(TFEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TFData, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(BTLimpar)
                        .addGap(45, 45, 45)
                        .addComponent(BTSalvar)
                        .addGap(42, 42, 42)
                        .addComponent(BTSair)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LBCadastrar)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTLimpar)
                    .addComponent(BTSalvar)
                    .addComponent(BTSair))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvarActionPerformed
        List<Livro> listaLivrosCadastrados = FormTelaPrincipal.livroController.getListaLivrosCadastrados();
        String nome = TFNome.getText();
        String autor = TFAutor.getText();
        String data = TFData.getText();
        String editora = TFEditora.getText();
        FormTelaPrincipal.livroController.setLivro(new Livro());
        selecionaGenero();
        FormTelaPrincipal.livroController.getLivro().setNome(nome);
        FormTelaPrincipal.livroController.getLivro().setAutor(autor);
        FormTelaPrincipal.livroController.getLivro().setLancamento(data);
        FormTelaPrincipal.livroController.getLivro().setEditora(editora);
        
        for(int i = 0; i <= listaLivrosCadastrados.size(); i ++){
            FormTelaPrincipal.livroController.getLivro().setID(i+1);
        }
        
        if(!(CBGenero.getSelectedItem().equals("Selecione uma das opções"))){
            FormTelaPrincipal.livroController.cadastrarLivro();
            JOptionPane.showMessageDialog(null, "Livro Cadastrado com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma das opções de gênero");
        }
    }//GEN-LAST:event_BTSalvarActionPerformed

    private void BTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTSairActionPerformed

    private void BTLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTLimparActionPerformed
        TFAutor.setText("");
        TFData.setText("");
        TFEditora.setText("");
        TFNome.setText("");
        CBGenero.setSelectedItem("Selecione uma das opções");
        TFNome.requestFocus();
    }//GEN-LAST:event_BTLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTLimpar;
    private javax.swing.JButton BTSair;
    private javax.swing.JButton BTSalvar;
    private javax.swing.JComboBox<String> CBGenero;
    private javax.swing.JLabel LBCadastrar;
    private javax.swing.JTextField TFAutor;
    private javax.swing.JTextField TFData;
    private javax.swing.JTextField TFEditora;
    private javax.swing.JTextField TFNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
