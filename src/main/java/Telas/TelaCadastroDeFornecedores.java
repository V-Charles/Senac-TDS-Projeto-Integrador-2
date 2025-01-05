/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import entidades.Fornecedor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius charles
 */
public class TelaCadastroDeFornecedores extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroDeFornecedores
     */
    public TelaCadastroDeFornecedores() {
        initComponents();
        tituloDaTela();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void tituloDaTela(){
        String msg;
        if(fornecedorEdicao == null){
            msg = "Cadastro de fornecedor";
        } else {
            msg = "Edição de fornecedor";
        }
        lblTituloDaTela.setText(msg);
    }
    
    private Fornecedor fornecedorEdicao = null;
    
    public void preencheEdicao(Fornecedor f){
        fornecedorEdicao = f;
        
        txtNomeDoFornecedor.setText(f.getNomeFornecedor());
        txtEmailDoFornecedor.setText(f.getEmail());
        ftxtCNPJDoFornecedor.setText(String.valueOf(f.getCnpj()));
        ftxtTelefoneDoFornecedor.setText(String.valueOf(f.getTelefone()));
        
        tituloDaTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        lblTituloDaTela = new javax.swing.JLabel();
        panelLeft = new javax.swing.JPanel();
        panelBottom = new javax.swing.JPanel();
        icon_Logo = new javax.swing.JLabel();
        panelRight = new javax.swing.JPanel();
        panelCenter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeDoFornecedor = new javax.swing.JLabel();
        line1 = new javax.swing.JSeparator();
        line2 = new javax.swing.JSeparator();
        line4 = new javax.swing.JSeparator();
        line3 = new javax.swing.JSeparator();
        txtNomeDoFornecedor = new javax.swing.JTextField();
        lblCNPJDoFornecedor = new javax.swing.JLabel();
        lblEmailDoFornecedor = new javax.swing.JLabel();
        lblTelefoneDoFornecedor = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtEmailDoFornecedor = new javax.swing.JTextField();
        ftxtTelefoneDoFornecedor = new javax.swing.JFormattedTextField();
        ftxtCNPJDoFornecedor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        panelTop.setBackground(new java.awt.Color(59, 93, 132));

        lblTituloDaTela.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        lblTituloDaTela.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDaTela)
                .addContainerGap(1207, Short.MAX_VALUE))
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDaTela)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(panelTop, java.awt.BorderLayout.PAGE_START);

        panelLeft.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(panelLeft, java.awt.BorderLayout.LINE_END);

        panelBottom.setBackground(new java.awt.Color(255, 255, 255));

        icon_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_logo.png"))); // NOI18N

        javax.swing.GroupLayout panelBottomLayout = new javax.swing.GroupLayout(panelBottom);
        panelBottom.setLayout(panelBottomLayout);
        panelBottomLayout.setHorizontalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottomLayout.createSequentialGroup()
                .addContainerGap(1188, Short.MAX_VALUE)
                .addComponent(icon_Logo)
                .addContainerGap())
        );
        panelBottomLayout.setVerticalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBottomLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(icon_Logo)
                .addContainerGap())
        );

        getContentPane().add(panelBottom, java.awt.BorderLayout.PAGE_END);

        panelRight.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRightLayout = new javax.swing.GroupLayout(panelRight);
        panelRight.setLayout(panelRightLayout);
        panelRightLayout.setHorizontalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRightLayout.setVerticalGroup(
            panelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(panelRight, java.awt.BorderLayout.LINE_START);

        panelCenter.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("*É necessário preencher todos os campos.");

        lblNomeDoFornecedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNomeDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeDoFornecedor.setText("Nome:");

        line1.setForeground(new java.awt.Color(0, 0, 0));

        line2.setForeground(new java.awt.Color(0, 0, 0));

        line4.setForeground(new java.awt.Color(0, 0, 0));

        line3.setForeground(new java.awt.Color(0, 0, 0));

        txtNomeDoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeDoFornecedor.setBorder(null);
        txtNomeDoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoFornecedorActionPerformed(evt);
            }
        });

        lblCNPJDoFornecedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCNPJDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        lblCNPJDoFornecedor.setText("CNPJ:");

        lblEmailDoFornecedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblEmailDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailDoFornecedor.setText("E-mail:");

        lblTelefoneDoFornecedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblTelefoneDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefoneDoFornecedor.setText("Telefone:");

        btnSalvar.setBackground(new java.awt.Color(59, 93, 132));
        btnSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_save.png"))); // NOI18N
        btnSalvar.setText(" Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(120, 35));
        btnSalvar.setMinimumSize(new java.awt.Dimension(120, 35));
        btnSalvar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(59, 93, 132));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_cancel.png"))); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 35));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 35));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(59, 93, 132));
        btnMenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_menu.png"))); // NOI18N
        btnMenu.setText(" Menu");
        btnMenu.setMaximumSize(new java.awt.Dimension(120, 35));
        btnMenu.setMinimumSize(new java.awt.Dimension(120, 35));
        btnMenu.setPreferredSize(new java.awt.Dimension(120, 35));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(59, 93, 132));
        btnVoltar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_back.png"))); // NOI18N
        btnVoltar.setText(" Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(120, 35));
        btnVoltar.setMinimumSize(new java.awt.Dimension(120, 35));
        btnVoltar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtEmailDoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailDoFornecedor.setBorder(null);
        txtEmailDoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailDoFornecedorActionPerformed(evt);
            }
        });

        ftxtTelefoneDoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        ftxtTelefoneDoFornecedor.setBorder(null);
        ftxtTelefoneDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftxtTelefoneDoFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ftxtCNPJDoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        ftxtCNPJDoFornecedor.setBorder(null);
        ftxtCNPJDoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        try {
            ftxtCNPJDoFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelCenterLayout = new javax.swing.GroupLayout(panelCenter);
        panelCenter.setLayout(panelCenterLayout);
        panelCenterLayout.setHorizontalGroup(
            panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterLayout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCenterLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCenterLayout.createSequentialGroup()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCenterLayout.createSequentialGroup()
                                .addComponent(lblTelefoneDoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtTelefoneDoFornecedor))
                            .addGroup(panelCenterLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCenterLayout.createSequentialGroup()
                                .addComponent(lblCNPJDoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtCNPJDoFornecedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterLayout.createSequentialGroup()
                                .addComponent(lblNomeDoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeDoFornecedor))
                            .addComponent(line1)
                            .addComponent(line2)
                            .addGroup(panelCenterLayout.createSequentialGroup()
                                .addComponent(lblEmailDoFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(line3)
                            .addComponent(line4))
                        .addGap(116, 116, 116)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(126, Short.MAX_VALUE))))
        );
        panelCenterLayout.setVerticalGroup(
            panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDoFornecedor)
                    .addComponent(txtNomeDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNPJDoFornecedor)
                    .addComponent(ftxtCNPJDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailDoFornecedor)
                    .addComponent(txtEmailDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneDoFornecedor)
                    .addComponent(ftxtTelefoneDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(panelCenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailDoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailDoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDoFornecedorActionPerformed

    private void txtNomeDoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDoFornecedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNomeDoFornecedor.setText("");
        ftxtCNPJDoFornecedor.setText("");
        txtEmailDoFornecedor.setText("");
        ftxtTelefoneDoFornecedor.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        String campoNome = txtNomeDoFornecedor.getText();
        String campoEmail = txtEmailDoFornecedor.getText();
        String campoCnpj = ftxtCNPJDoFornecedor.getText().replaceAll("[^0-9]", "");
        String campoTelefone = ftxtTelefoneDoFornecedor.getText().replaceAll("[^0-9]", "");
        
        if(!campoNome.isEmpty() || !campoEmail.isEmpty() || !campoCnpj.isEmpty() || !campoTelefone.isEmpty()){
            int resp = JOptionPane.showConfirmDialog(this, "Os dados inseridos serão perdidos!\n"
                    + "Deseja voltar ao menu mesmo assim?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(resp == JOptionPane.YES_OPTION){
                TelaMenu tm = new TelaMenu();
                tm.setVisible(true);
                this.dispose();
            }
        } else {
            TelaMenu tm = new TelaMenu();
            tm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        String campoNome = txtNomeDoFornecedor.getText();
        String campoEmail = txtEmailDoFornecedor.getText();
        String campoCnpj = ftxtCNPJDoFornecedor.getText().replaceAll("[^0-9]", "");
        String campoTelefone = ftxtTelefoneDoFornecedor.getText().replaceAll("[^0-9]", "");
        
        if(!campoNome.isEmpty() || !campoEmail.isEmpty() || !campoCnpj.isEmpty() || !campoTelefone.isEmpty()){
            int resp = JOptionPane.showConfirmDialog(this, "Os dados inseridos serão perdidos!\n"
                    + "Deseja voltar mesmo assim?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(resp == JOptionPane.YES_OPTION){
                TelaFornecedores tf = new TelaFornecedores();
                tf.setVisible(true);
                this.dispose();
            }
        } else {
            TelaFornecedores tf = new TelaFornecedores();
            tf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if(!txtNomeDoFornecedor.getText().isEmpty() && !txtEmailDoFornecedor.getText().isEmpty()){
                if(!ftxtCNPJDoFornecedor.getText().replaceAll("[^0-9]", "").isEmpty() && !ftxtTelefoneDoFornecedor.getText().replaceAll("[^0-9]", "").isEmpty()){
                    
                } else {
                    JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos!\n"
                            + "Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos!\n"
                        + "Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível efetuar o cadastro!\n"
                    + "Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDeFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDeFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtCNPJDoFornecedor;
    private javax.swing.JFormattedTextField ftxtTelefoneDoFornecedor;
    private javax.swing.JLabel icon_Logo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCNPJDoFornecedor;
    private javax.swing.JLabel lblEmailDoFornecedor;
    private javax.swing.JLabel lblNomeDoFornecedor;
    private javax.swing.JLabel lblTelefoneDoFornecedor;
    private javax.swing.JLabel lblTituloDaTela;
    private javax.swing.JSeparator line1;
    private javax.swing.JSeparator line2;
    private javax.swing.JSeparator line3;
    private javax.swing.JSeparator line4;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelRight;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTextField txtEmailDoFornecedor;
    private javax.swing.JTextField txtNomeDoFornecedor;
    // End of variables declaration//GEN-END:variables
}
