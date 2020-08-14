/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import ferramentas.CaixaDeDialogo;
import java.util.Random;


/**
 *
 * @author Leonardo
 */
public class InterfaceBanco extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceBanco
     */
    Conta conta1;
    Conta conta2;
    public InterfaceBanco() {
        initComponents();
        Random gerador = new Random();
        conta1 = new Conta();
        conta2 = new Conta();
        
        conta1.setConta(1);
        conta1.setNome("Jonas");
        conta1.setSaldo(gerador.nextInt(1000));
        conta1.setCheque(gerador.nextInt(1000));
        
        
        conta2.setConta(2);
        conta2.setNome("Juca");
        conta2.setSaldo(gerador.nextInt(1000));
        conta2.setCheque(gerador.nextInt(1000));
        
        atualizarInformacoesTela();
        
    }
    private void atualizarInformacoesTela(){
        lblConta1.setText(conta1.getNome());
        lblConta2.setText(conta2.getNome());
        lblChequeEspecialConta1.setText(String.valueOf(conta1.getCheque()));
        lblChequeEspecialConta2.setText(String.valueOf(conta2.getCheque()));
        lblSaldoConta1.setText(String.valueOf(conta1.getSaldo()));
        lblSaldoConta2.setText(String.valueOf(conta2.getSaldo()));
    }
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        btnTransferirConta1 = new javax.swing.JButton();
        tnTransferirConta2 = new javax.swing.JButton();
        txtValorConta1 = new javax.swing.JTextField();
        txtValorConta2 = new javax.swing.JTextField();
        lblConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        btnDepositarConta1 = new javax.swing.JButton();
        btnSacarConta2 = new javax.swing.JButton();
        btnDespositarConta2 = new javax.swing.JButton();
        lblChequeEspecialConta1 = new javax.swing.JLabel();
        lblChequeEspecialConta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConta1.setText("Conta 1");

        lblSaldoConta1.setText("Saldo");

        btnTransferirConta1.setText("Transferir");
        btnTransferirConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta1ActionPerformed(evt);
            }
        });

        tnTransferirConta2.setText("Transferir");
        tnTransferirConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnTransferirConta2ActionPerformed(evt);
            }
        });

        txtValorConta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorConta1FocusGained(evt);
            }
        });

        lblConta2.setText("Conta 2");

        lblSaldoConta2.setText("Saldo");

        btnSacarConta1.setText("Sacar");
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        btnDepositarConta1.setText("Depositar");
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        btnSacarConta2.setText("Sacar");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        btnDespositarConta2.setText("Depositar");
        btnDespositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespositarConta2ActionPerformed(evt);
            }
        });

        lblChequeEspecialConta1.setText("Cheque");

        lblChequeEspecialConta2.setText("Cheque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblConta1)
                            .addComponent(btnTransferirConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaldoConta1)
                            .addComponent(btnDepositarConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorConta1)
                            .addComponent(btnSacarConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDespositarConta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tnTransferirConta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaldoConta2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblConta2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValorConta2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSacarConta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChequeEspecialConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblChequeEspecialConta2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta2)
                        .addGap(2, 2, 2)
                        .addComponent(lblChequeEspecialConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tnTransferirConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacarConta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDespositarConta2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta1)
                        .addGap(3, 3, 3)
                        .addComponent(lblChequeEspecialConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransferirConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacarConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDepositarConta1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta1.getText());
            conta1.debito(valor);
            atualizarInformacoesTela();
            CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            System.out.println("Operação de depósito no valor de R$: " + valor);
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void txtValorConta1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorConta1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConta1FocusGained

    private void btnSacarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta1ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta1.getText());
            boolean resultado = conta1.credito(valor);
            if(resultado){
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                System.out.println("Operação de saque no valor de R$: " + valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
                System.out.println("Erro: Operação de saque no valor de R$ " + valor);
            }
            
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnSacarConta1ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta2.getText());
            boolean resultado = conta2.credito(valor);
            if(resultado){
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                System.out.println("Operação de saque no valor de R$: " + valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
                System.out.println("Erro: Operação de saque no valor de R$: " + valor);
            }
            
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void btnDespositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespositarConta2ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta2.getText());
            conta2.debito(valor);
            atualizarInformacoesTela();
            CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
            System.out.println("Operação de depósito no valor de R$: " + valor);
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnDespositarConta2ActionPerformed

    private void btnTransferirConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta1ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta1.getText());
            boolean resultado = conta1.credito(valor);
            if(resultado){
                conta2.debito(valor);
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                System.out.println("Operação de Transferencia no valor de R$: " + valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
                System.out.println("Erro: Operação de Transferencia no valor de R$: " + valor);
            }
            
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_btnTransferirConta1ActionPerformed

    private void tnTransferirConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnTransferirConta2ActionPerformed
        try{
            float valor = Float.parseFloat(txtValorConta2.getText());
            boolean resultado = conta2.credito(valor);
            if(resultado){
                conta1.debito(valor);
                atualizarInformacoesTela();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação realizada com sucesso", 'i');
                System.out.println("Operação de Transferencia no valor de R$: " + valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'a');
                System.out.println("Erro: Operação de Transferencia no valor de R$: " + valor);
            }
            
        }catch (Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_tnTransferirConta2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDespositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferirConta1;
    private javax.swing.JLabel lblChequeEspecialConta1;
    private javax.swing.JLabel lblChequeEspecialConta2;
    private javax.swing.JLabel lblConta1;
    private javax.swing.JLabel lblConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JButton tnTransferirConta2;
    private javax.swing.JTextField txtValorConta1;
    private javax.swing.JTextField txtValorConta2;
    // End of variables declaration//GEN-END:variables

    private float gerador(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}