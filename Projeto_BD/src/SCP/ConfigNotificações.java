package SCP;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConfigNotificações extends javax.swing.JFrame {

    public ConfigNotificações() {
        initComponents();
    }

    public void controlaEsc() {
        KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);

        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(ks, "esc");
        getRootPane().getActionMap().put("esc", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        emailJTable = new javax.swing.JTable();
        excluirEmailJButton = new javax.swing.JButton();
        adicionarEmailJButton = new javax.swing.JButton();
        okJToggle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações de email");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                fechaEsc(evt);
            }
        });

        emailJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "Codigo", "Email"
                }));
        jScrollPane1.setViewportView(emailJTable);

        excluirEmailJButton.setText("Excluir Email");

        adicionarEmailJButton.setText("Adicionar Email");
        adicionarEmailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEmailJButtonActionPerformed(evt);
            }
        });

        okJToggle.setText("OK");
        okJToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(okJToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(adicionarEmailJButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(excluirEmailJButton)))
                                .addGap(28, 28, 28)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(excluirEmailJButton)
                                        .addComponent(adicionarEmailJButton))
                                .addGap(18, 18, 18)
                                .addComponent(okJToggle)
                                .addGap(0, 14, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarEmailJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adicionarEmailJButtonActionPerformed
        AdicionarEmail addEmail = new AdicionarEmail();
        addEmail.setVisible(true);
    }// GEN-LAST:event_adicionarEmailJButtonActionPerformed

    private void fechaEsc(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_fechaEsc
        controlaEsc();
    }// GEN-LAST:event_fechaEsc

    private void okJToggleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okJToggleActionPerformed
        dispose();
    }// GEN-LAST:event_okJToggleActionPerformed

    List<Configuracao> listaDeConfiguracoes; // Declare a variável

    private void obterConfiguracoesDoBanco() {
        // Obtenha as configurações do banco de dados e atribua à listaDeConfiguracoes
        listaDeConfiguracoes = // código para obter as configurações do banco de dados
    }
    
    private void preencherTabelaEmails() {
        // Obtenha os emails cadastrados do banco de dados ou de outra fontes de dados

        // Crie um objeto DefaultTableModel para manipular os dados da tabela
        DefaultTableModel model = (DefaultTableModel) emailJTable.getModel();
        model.setRowCount(0); // Limpa os dados existentes na tabela

        // Percorra os emails cadastrados e adicione-os ao modelo da tabela
        for(Configuracao configuracao : listaDeConfiguracoes){
            Object[] rowData = { configuracao.getCodigo(), configuracao.getEmailAlerta() };
            model.addRow(rowData);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigNotificações().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarEmailJButton;
    private javax.swing.JTable emailJTable;
    private javax.swing.JButton excluirEmailJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okJToggle;
    // End of variables declaration//GEN-END:variables
}
