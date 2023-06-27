package SCP;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class MenuImportar extends javax.swing.JFrame {

    public MenuImportar() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valorTotalLabel = new javax.swing.JLabel();
        vencimentoLabel = new javax.swing.JLabel();
        razãoSocialJLabel = new javax.swing.JLabel();
        fornecedorJLabel = new javax.swing.JLabel();
        gravarJButton = new javax.swing.JButton();
        valorTotalTextField = new javax.swing.JTextField();
        razãoSocialJTextField = new javax.swing.JTextField();
        fornecedorJTextField1 = new javax.swing.JTextField();
        ufJLabel = new javax.swing.JLabel();
        ufJTextField = new javax.swing.JTextField();
        vencimentoJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nParcelasJTextField = new javax.swing.JTextField();
        importarXMLJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Importar");
        setName("importFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                controlaEsc(evt);
            }
        });

        valorTotalLabel.setText("Valor Total NF-e:");

        vencimentoLabel.setText("Vencimento das Parcelas:");

        razãoSocialJLabel.setText("Razão Social:");

        fornecedorJLabel.setText("Fornecedor:");

        gravarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/gravarIcon.png"))); // NOI18N
        gravarJButton.setText("Gravar");
        gravarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButtonActionPerformed(evt);
            }
        });

        valorTotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotalTextFieldActionPerformed(evt);
            }
        });

        fornecedorJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorJTextField1ActionPerformed(evt);
            }
        });

        ufJLabel.setText("UF:");

        vencimentoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10/06/2023", "10/07/2023", "10/08/2023", "10/09/2023", "10/10/2023", "10/11/2023", "10/12/2023" }));

        jLabel1.setText("Parcelas:");

        importarXMLJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/importIcon.png"))); // NOI18N
        importarXMLJButton.setText("Importar XML");
        importarXMLJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarXMLJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(fornecedorJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fornecedorJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(razãoSocialJLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ufJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorTotalLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(nParcelasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vencimentoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(importarXMLJButton)
                    .addContainerGap(598, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fornecedorJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fornecedorJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ufJLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(razãoSocialJLabel)
                            .addGap(1, 1, 1)
                            .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vencimentoLabel)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nParcelasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(valorTotalLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(importarXMLJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(795, 214));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void fornecedorJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorJTextField1ActionPerformed

    private void valorTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotalTextFieldActionPerformed

    private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButtonActionPerformed

    }//GEN-LAST:event_gravarJButtonActionPerformed

    private void controlaEsc(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_controlaEsc
        controlaEsc();
    }//GEN-LAST:event_controlaEsc

    private void importarXMLJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarXMLJButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
        // Um arquivo foi selecionado
        File arquivoSelecionado = fileChooser.getSelectedFile();
        
        // Puxar as informações do arquivo xml
        // ...

        // Exiba uma mensagem ou realize outras ações conforme necessário
        JOptionPane.showMessageDialog(this, "Arquivo selecionado: " + arquivoSelecionado.getAbsolutePath());
        }
    }//GEN-LAST:event_importarXMLJButtonActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuImportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fornecedorJLabel;
    private javax.swing.JTextField fornecedorJTextField1;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JButton importarXMLJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nParcelasJTextField;
    private javax.swing.JLabel razãoSocialJLabel;
    private javax.swing.JTextField razãoSocialJTextField;
    private javax.swing.JLabel ufJLabel;
    private javax.swing.JTextField ufJTextField;
    private javax.swing.JLabel valorTotalLabel;
    private javax.swing.JTextField valorTotalTextField;
    private javax.swing.JComboBox<String> vencimentoJComboBox;
    private javax.swing.JLabel vencimentoLabel;
    // End of variables declaration//GEN-END:variables
}
