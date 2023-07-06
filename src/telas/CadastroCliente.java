/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.Cliente;
import dao.ClienteDAO;

/**
 * Tela de cadastro de cliente.
 * Essa tela faz as manipulações para salvar um novo cliente.
 * 
 * @author Gabriel Santos Pereira
 */
public class CadastroCliente extends javax.swing.JFrame {

    static ArrayList<Cliente> listaCliente;
    
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        
        listaCliente = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDadosCliente = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        lblRgCliente = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        lblDataDeNascimentoCliente = new javax.swing.JLabel();
        lblTelefoneCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        btnSalvarCliente = new javax.swing.JButton();
        btnLimparCliente = new javax.swing.JButton();
        btnVoltarTelaPrincipal = new javax.swing.JButton();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtDataDeNascimentoCliente = new javax.swing.JFormattedTextField();
        txtRgCliente = new javax.swing.JFormattedTextField();
        txtTelefoneCliente = new javax.swing.JFormattedTextField();
        lblTelefoneCliente1 = new javax.swing.JLabel();
        txtOcupacaoCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");

        lblNomeCliente.setText("Nome Cliente:");

        lblRgCliente.setText("RG Cliente:");

        lblCpfCliente.setText("CPF Cliente: ");

        lblDataDeNascimentoCliente.setText("Data de Nascimento:");

        lblTelefoneCliente.setText("Ocupação:");

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnLimparCliente.setText("Limpar");
        btnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparClienteActionPerformed(evt);
            }
        });

        btnVoltarTelaPrincipal.setText("Voltar");
        btnVoltarTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaPrincipalActionPerformed(evt);
            }
        });

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataDeNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDeNascimentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDeNascimentoClienteActionPerformed(evt);
            }
        });

        try {
            txtRgCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelefoneCliente1.setText("Telefone:");

        javax.swing.GroupLayout pnlDadosClienteLayout = new javax.swing.GroupLayout(pnlDadosCliente);
        pnlDadosCliente.setLayout(pnlDadosClienteLayout);
        pnlDadosClienteLayout.setHorizontalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnVoltarTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosClienteLayout.createSequentialGroup()
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosClienteLayout.createSequentialGroup()
                                .addComponent(lblRgCliente)
                                .addGap(68, 68, 68))
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpfCliente)
                                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeCliente)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtRgCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosClienteLayout.createSequentialGroup()
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblDataDeNascimentoCliente)
                                .addGap(20, 20, 20))
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefoneCliente1)
                                    .addComponent(lblTelefoneCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtDataDeNascimentoCliente)
                            .addComponent(txtOcupacaoCliente))))
                .addGap(100, 100, 100))
        );
        pnlDadosClienteLayout.setVerticalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRgCliente)
                    .addComponent(txtRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDeNascimentoCliente)
                    .addComponent(txtDataDeNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneCliente1)
                    .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOcupacaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblTelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCliente)
                    .addComponent(btnVoltarTelaPrincipal)
                    .addComponent(btnSalvarCliente)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pnlDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaPrincipalActionPerformed
        this.setVisible(false);
        new telaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVoltarTelaPrincipalActionPerformed

    private void btnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparClienteActionPerformed
        // Limpar os campos
        //txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtRgCliente.setText("");
        txtCpfCliente.setText("");
        txtDataDeNascimentoCliente.setText("");
        txtTelefoneCliente.setText("");
    }//GEN-LAST:event_btnLimparClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // Salvar um novo cliente
        // Faz a validação para saber se preencheu todos os campos
        /*if(txtIdCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        }*/
        if (txtNomeCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else if (txtRgCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else if (txtCpfCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else if (txtDataDeNascimentoCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else if (txtTelefoneCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else if (txtOcupacaoCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser inseridos!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        }else {
            //int idCliente_ = Integer.parseInt(txtIdCliente.getText());
            String nomeCliente_ = txtNomeCliente.getText();
            String rgCliente_ = txtRgCliente.getText();
            String cpfCliente_ = txtCpfCliente.getText();
            String dataNascimentoCliente_ = txtDataDeNascimentoCliente.getText();
            String telefoneCliente_ = txtTelefoneCliente.getText();

            Cliente cliente = new Cliente(nomeCliente_, rgCliente_, cpfCliente_, dataNascimentoCliente_, telefoneCliente_, telefoneCliente_);
	    ClienteDAO clienteDAO = new ClienteDAO();
	    if (clienteDAO.salvar(cliente)){ 
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
		btnLimparClienteActionPerformed(evt);
		new telaPrincipal().setVisible(true);
		this.setVisible(false);
	    }
            
            listaCliente.add(cliente);
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void txtDataDeNascimentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDeNascimentoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnVoltarTelaPrincipal;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblDataDeNascimentoCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblRgCliente;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JLabel lblTelefoneCliente1;
    private javax.swing.JPanel pnlDadosCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JFormattedTextField txtDataDeNascimentoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtOcupacaoCliente;
    private javax.swing.JFormattedTextField txtRgCliente;
    private javax.swing.JFormattedTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
