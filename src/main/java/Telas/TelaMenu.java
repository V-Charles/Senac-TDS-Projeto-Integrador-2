/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.time.LocalTime;
import javax.swing.JFrame;

/**
 *
 * @author Vinicius charles
 */
public class TelaMenu extends javax.swing.JFrame {
    
    private void saudacao(){
        LocalTime horaLocal = LocalTime.now();
        String msg;
        if(horaLocal.isAfter(LocalTime.of(5, 0)) && horaLocal.isBefore(LocalTime.of(12, 0))){
            msg = "Bom dia, seja bem vindo(a)!";
        }else
            if(horaLocal.isAfter(LocalTime.of(11, 59)) && horaLocal.isBefore(LocalTime.of(18, 0))){
                msg = "Boa tarde, seja bem vindo(a)!";
            }else{
                msg = "Boa noite, seja bem vindo(a)!";
            }
        lblSaudacaoInicial.setText(msg);
    }

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        saudacao();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperior = new javax.swing.JPanel();
        lblSaudacaoInicial = new javax.swing.JLabel();
        PanelDireito = new javax.swing.JPanel();
        PanelInferior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelEsquerdo = new javax.swing.JPanel();
        PanelCentral = new javax.swing.JPanel();
        image_Logo = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnRalatorio = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelSuperior.setBackground(new java.awt.Color(61, 91, 132));

        lblSaudacaoInicial.setBackground(new java.awt.Color(0, 0, 0));
        lblSaudacaoInicial.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblSaudacaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        lblSaudacaoInicial.setText("Saudaçao Inicial");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(lblSaudacaoInicial)
                .addContainerGap(570, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblSaudacaoInicial)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(PanelSuperior, java.awt.BorderLayout.PAGE_START);

        PanelDireito.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDireitoLayout = new javax.swing.GroupLayout(PanelDireito);
        PanelDireito.setLayout(PanelDireitoLayout);
        PanelDireitoLayout.setHorizontalGroup(
            PanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanelDireitoLayout.setVerticalGroup(
            PanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        getContentPane().add(PanelDireito, java.awt.BorderLayout.LINE_END);

        PanelInferior.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_logo.png"))); // NOI18N

        javax.swing.GroupLayout PanelInferiorLayout = new javax.swing.GroupLayout(PanelInferior);
        PanelInferior.setLayout(PanelInferiorLayout);
        PanelInferiorLayout.setHorizontalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInferiorLayout.createSequentialGroup()
                .addContainerGap(1231, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        PanelInferiorLayout.setVerticalGroup(
            PanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInferiorLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        PanelEsquerdo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEsquerdoLayout = new javax.swing.GroupLayout(PanelEsquerdo);
        PanelEsquerdo.setLayout(PanelEsquerdoLayout);
        PanelEsquerdoLayout.setHorizontalGroup(
            PanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanelEsquerdoLayout.setVerticalGroup(
            PanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        getContentPane().add(PanelEsquerdo, java.awt.BorderLayout.LINE_START);

        PanelCentral.setBackground(new java.awt.Color(255, 255, 255));

        image_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/InventorySystem.png.png"))); // NOI18N

        btnProdutos.setBackground(new java.awt.Color(0, 0, 0));
        btnProdutos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_packages.png"))); // NOI18N
        btnProdutos.setText(" Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnFornecedores.setBackground(new java.awt.Color(0, 0, 0));
        btnFornecedores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        btnFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_supplier.png"))); // NOI18N
        btnFornecedores.setText(" Fornecedores");
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        btnRalatorio.setBackground(new java.awt.Color(0, 0, 0));
        btnRalatorio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRalatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRalatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_Report.png"))); // NOI18N
        btnRalatorio.setText(" Relatório de movimentações");
        btnRalatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRalatorioActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(61, 91, 132));
        btnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon_exit.png"))); // NOI18N
        btnSair.setText(" Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addContainerGap(167, Short.MAX_VALUE)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRalatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(90, 90, 90)))
                .addComponent(image_Logo)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(image_Logo)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRalatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        TelaProdutos tp = new TelaProdutos();
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnRalatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRalatorioActionPerformed
        TelaRelatorioMovimentacoes trm = new TelaRelatorioMovimentacoes();
        trm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRalatorioActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        TelaFornecedores tf = new TelaFornecedores();
        tf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFornecedoresActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelDireito;
    private javax.swing.JPanel PanelEsquerdo;
    private javax.swing.JPanel PanelInferior;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRalatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel image_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSaudacaoInicial;
    // End of variables declaration//GEN-END:variables
}
