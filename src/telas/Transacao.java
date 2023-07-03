/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Classes.Casa;
import Classes.Cliente;
import Classes.Corretor;
import Classes.Imovel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author icaro
 */
public class Transacao extends javax.swing.JFrame {
    /**
     * Creates new form Transacao
     */
    private Cliente cliente = new Cliente();
    private Imovel imovel = new Casa();
    private Corretor corretor = new Corretor();
    
    public Transacao() {
        initComponents();

        this.corretor = new Corretor(1, "Icaro Rodrigues", "9999999", "99999999999", "04/04/1997", "99999999999", "Programador", 3500, "1234", false, "12345");
        
        corretorNomeInput.setText(corretor.getNome());
        corretorCpfInput.setText(corretor.getCpf());
        corretorTelefoneInput.setText(corretor.getTelefone());
        corretorCreciInput.setText(corretor.getCreci());

        DefaultTableModel tabelaImovel = (DefaultTableModel) this.tabelaImovel.getModel();

        this.imovel = new Casa(1500, 1500, 206, 4, 1, 12, false, true, true, 1, "algo", "algo", "99999999", "Brasilia", 100000, new Date());

        Object[] dadosImovel = {imovel.getCidade(), imovel.getRua(), imovel.getBairro(), imovel.getValorDaCompra()};
        tabelaImovel.addRow(dadosImovel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTransacao = new javax.swing.JPanel();
        pnlDadosCorretor = new javax.swing.JPanel();
        nomeCorretor = new javax.swing.JLabel();
        cpfCorretor = new javax.swing.JLabel();
        Creci = new javax.swing.JLabel();
        telefoneCorretor = new javax.swing.JLabel();
        corretorNomeInput = new javax.swing.JTextField();
        corretorCreciInput = new javax.swing.JTextField();
        corretorCpfInput = new javax.swing.JFormattedTextField();
        corretorTelefoneInput = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        clienteCPF = new javax.swing.JLabel();
        buscarClienteButton = new javax.swing.JButton();
        clienteCpfText = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        cadastrarClienteButton = new javax.swing.JButton();
        finalizarTransacao = new javax.swing.JButton();
        cancelaTransacaoButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaImovel = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnTelaPrincipal = new javax.swing.JMenuItem();
        mnSairPrograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transação");
        setPreferredSize(new java.awt.Dimension(820, 820));
        setResizable(false);

        pnlTransacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Transação"));
        pnlTransacao.setPreferredSize(new java.awt.Dimension(720, 450));

        pnlDadosCorretor.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Corretor"));

        nomeCorretor.setText("Nome:");

        cpfCorretor.setText("CPF:");

        Creci.setText("Creci:");

        telefoneCorretor.setText("Telefone:");

        corretorNomeInput.setEditable(false);
        corretorNomeInput.setEnabled(false);
        corretorNomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corretorNomeInputActionPerformed(evt);
            }
        });

        corretorCreciInput.setEditable(false);
        corretorCreciInput.setEnabled(false);
        corretorCreciInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corretorCreciInputActionPerformed(evt);
            }
        });

        try {
            corretorCpfInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        corretorCpfInput.setEnabled(false);
        corretorCpfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corretorCpfInputActionPerformed(evt);
            }
        });

        try {
            corretorTelefoneInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        corretorTelefoneInput.setEnabled(false);

        javax.swing.GroupLayout pnlDadosCorretorLayout = new javax.swing.GroupLayout(pnlDadosCorretor);
        pnlDadosCorretor.setLayout(pnlDadosCorretorLayout);
        pnlDadosCorretorLayout.setHorizontalGroup(
            pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                        .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfCorretor)
                                    .addComponent(Creci))
                                .addGap(19, 19, 19))
                            .addComponent(telefoneCorretor))
                        .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosCorretorLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(corretorTelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(corretorCreciInput, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(corretorCpfInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                        .addComponent(nomeCorretor)
                        .addGap(18, 18, 18)
                        .addComponent(corretorNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDadosCorretorLayout.setVerticalGroup(
            pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCorretorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCorretor)
                    .addComponent(corretorNomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCorretor)
                    .addComponent(corretorCpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneCorretor)
                    .addComponent(corretorTelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDadosCorretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creci)
                    .addComponent(corretorCreciInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        clienteCPF.setText("Digite cpf do cliente:");

        buscarClienteButton.setText("Buscar Cliente");
        buscarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteButtonActionPerformed(evt);
            }
        });

        try {
            clienteCpfText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        clienteCpfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCpfTextActionPerformed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CPF", "TELEFONE", "OCUPAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        cadastrarClienteButton.setText("Cadastrar Cliente");
        cadastrarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clienteCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteCpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(buscarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarClienteButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteCPF)
                    .addComponent(clienteCpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarClienteButton)
                    .addComponent(cadastrarClienteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        finalizarTransacao.setText("FINALIZAR");
        finalizarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarTransacaoActionPerformed(evt);
            }
        });

        cancelaTransacaoButton.setText("CANCELAR");
        cancelaTransacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaTransacaoButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Imovel"));

        tabelaImovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIDADE", "RUA", "BAIRRO", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaImovel.setEnabled(false);
        tabelaImovel.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaImovel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTransacaoLayout = new javax.swing.GroupLayout(pnlTransacao);
        pnlTransacao.setLayout(pnlTransacaoLayout);
        pnlTransacaoLayout.setHorizontalGroup(
            pnlTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTransacaoLayout.createSequentialGroup()
                        .addGroup(pnlTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDadosCorretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlTransacaoLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(finalizarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(cancelaTransacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTransacaoLayout.setVerticalGroup(
            pnlTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(pnlTransacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalizarTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelaTransacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        mnTelaPrincipal.setText("Tela principal");
        mnTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTelaPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(mnTelaPrincipal);

        mnSairPrograma.setText("Sair");
        mnSairPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairProgramaActionPerformed(evt);
            }
        });
        jMenu1.add(mnSairPrograma);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlTransacao, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addGap(659, 659, 659))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTransacao, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTelaPrincipalActionPerformed
        new telaPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnTelaPrincipalActionPerformed

    private void mnSairProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairProgramaActionPerformed
        // SAIR DO PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_mnSairProgramaActionPerformed

    private void corretorCreciInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corretorCreciInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corretorCreciInputActionPerformed

    private void corretorNomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corretorNomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corretorNomeInputActionPerformed

    private void corretorCpfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corretorCpfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corretorCpfInputActionPerformed

    private void finalizarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarTransacaoActionPerformed
        JOptionPane.showMessageDialog(null, "Transação realizada com sucesso!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        new telaPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_finalizarTransacaoActionPerformed

    private void cancelaTransacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaTransacaoButtonActionPerformed
        new telaPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelaTransacaoButtonActionPerformed

    private void cadastrarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteButtonActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_cadastrarClienteButtonActionPerformed

    private void buscarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteButtonActionPerformed
        String clienteCpf = clienteCpfText.getText().replaceAll("\\D", "");
        DefaultTableModel tabelaCliente = (DefaultTableModel) this.tabelaCliente.getModel();

        if (tabelaCliente.getRowCount() > 0) {
            tabelaCliente.removeRow(0);
        }

        if ("".equals(clienteCpf)) {
            JOptionPane.showMessageDialog(null, "Informe o cpf do cliente.", "Aviso!", JOptionPane.PLAIN_MESSAGE);
        } else {

            if (CadastroCliente.listaCliente != null) {

                CadastroCliente.listaCliente.forEach(cliente -> {
                    if (cliente.getCpf().equals(clienteCpf)) {
                        Object[] dadosCliente = {cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getOcupacao()};

                        tabelaCliente.addRow(dadosCliente);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente com esse cpf encontrado!", "Aviso!", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_buscarClienteButtonActionPerformed

    private void clienteCpfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCpfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteCpfTextActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        int i = tabelaCliente.getSelectedRow();
        
        if ( i >= 0 && i < CadastroCliente.listaCliente.size()) {
            Cliente dadosCliente = CadastroCliente.listaCliente.get(i);
            this.cliente = dadosCliente;
        }
    }//GEN-LAST:event_tabelaClienteMouseClicked

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
            java.util.logging.Logger.getLogger(Transacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Creci;
    private javax.swing.JButton buscarClienteButton;
    private javax.swing.JButton cadastrarClienteButton;
    private javax.swing.JButton cancelaTransacaoButton;
    private javax.swing.JLabel clienteCPF;
    private javax.swing.JFormattedTextField clienteCpfText;
    private javax.swing.JFormattedTextField corretorCpfInput;
    private javax.swing.JTextField corretorCreciInput;
    private javax.swing.JTextField corretorNomeInput;
    private javax.swing.JFormattedTextField corretorTelefoneInput;
    private javax.swing.JLabel cpfCorretor;
    private javax.swing.JButton finalizarTransacao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnSairPrograma;
    private javax.swing.JMenuItem mnTelaPrincipal;
    private javax.swing.JLabel nomeCorretor;
    private javax.swing.JPanel pnlDadosCorretor;
    private javax.swing.JPanel pnlTransacao;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaImovel;
    private javax.swing.JLabel telefoneCorretor;
    // End of variables declaration//GEN-END:variables
}
