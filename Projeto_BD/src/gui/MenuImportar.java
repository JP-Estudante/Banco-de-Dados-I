package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class MenuImportar extends javax.swing.JFrame {
    CadastroFornecedor cf = new CadastroFornecedor();
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

        nfeJPanel = new javax.swing.JPanel();
        chaveAcessoJLabel = new javax.swing.JLabel();
        valorTotalJLabel = new javax.swing.JLabel();
        fornecedorJLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        parcelaJLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        verMaisJButton = new javax.swing.JButton();
        dataCadastroJLabel = new javax.swing.JLabel();
        dataCadastroJFormattedTextField = new javax.swing.JFormattedTextField();
        dataCadastroOBSJLabel = new javax.swing.JLabel();
        valorTotalOBSJLabel = new javax.swing.JLabel();
        parcelaOBSJLabel = new javax.swing.JLabel();
        importarJPanel = new javax.swing.JPanel();
        caminhoXMLJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botoesJPanel = new javax.swing.JPanel();
        gravarJButton = new javax.swing.JButton();
        sairJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();

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

        nfeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("NF-e"));

        chaveAcessoJLabel.setText("Chave de Acesso");

        valorTotalJLabel.setText("Valor total:");

        fornecedorJLabel.setText("Fornecedor:");

        jTextField1.setBackground(new java.awt.Color(25, 25, 25));
        jTextField1.setText("52191001000000011432019000101000000005012345678");

        jTextField3.setBackground(new java.awt.Color(25, 25, 25));

        jTextField4.setBackground(new java.awt.Color(25, 25, 25));

        parcelaJLabel.setText("Parcelas:");

        jTextField2.setBackground(new java.awt.Color(25, 25, 25));

        verMaisJButton.setBackground(new java.awt.Color(25, 25, 25));
        verMaisJButton.setText("...");

        dataCadastroJLabel.setText("Data cadas.:");

        dataCadastroJFormattedTextField.setBackground(new java.awt.Color(25, 25, 25));
        dataCadastroJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dataCadastroJFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCadastroJFormattedTextFieldActionPerformed(evt);
            }
        });

        dataCadastroOBSJLabel.setText("*");

        valorTotalOBSJLabel.setText("*");

        parcelaOBSJLabel.setText("*");

        javax.swing.GroupLayout nfeJPanelLayout = new javax.swing.GroupLayout(nfeJPanel);
        nfeJPanel.setLayout(nfeJPanelLayout);
        nfeJPanelLayout.setHorizontalGroup(
            nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout.createSequentialGroup()
                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(valorTotalOBSJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valorTotalJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verMaisJButton))
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addComponent(parcelaOBSJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parcelaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(dataCadastroOBSJLabel)
                                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(dataCadastroJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataCadastroJLabel))))))
                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                                        .addComponent(fornecedorJLabel)
                                        .addGap(218, 218, 218))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(143, 143, 143))
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addComponent(chaveAcessoJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        nfeJPanelLayout.setVerticalGroup(
            nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                        .addComponent(fornecedorJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valorTotalJLabel)
                                    .addComponent(valorTotalOBSJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(nfeJPanelLayout.createSequentialGroup()
                                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(parcelaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(parcelaOBSJLabel))
                                .addGap(32, 32, 32))))
                    .addGroup(nfeJPanelLayout.createSequentialGroup()
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataCadastroJLabel)
                            .addComponent(dataCadastroOBSJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCadastroJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verMaisJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chaveAcessoJLabel))
                .addContainerGap())
        );

        importarJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        caminhoXMLJTextField.setBackground(new java.awt.Color(25, 25, 25));
        caminhoXMLJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoXMLJTextFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(25, 25, 25));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/findIcon.png"))); // NOI18N
        jButton1.setText("Procurar");

        javax.swing.GroupLayout importarJPanelLayout = new javax.swing.GroupLayout(importarJPanel);
        importarJPanel.setLayout(importarJPanelLayout);
        importarJPanelLayout.setHorizontalGroup(
            importarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importarJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caminhoXMLJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        importarJPanelLayout.setVerticalGroup(
            importarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importarJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(importarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoXMLJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        botoesJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botoesJPanel.setToolTipText("");

        gravarJButton.setBackground(new java.awt.Color(25, 25, 25));
        gravarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/gravarIcon(1).png"))); // NOI18N
        gravarJButton.setText("Gravar");

        sairJButton.setBackground(new java.awt.Color(25, 25, 25));
        sairJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exitIcon(1).png"))); // NOI18N
        sairJButton.setText("Sair");

        cancelarJButton.setBackground(new java.awt.Color(25, 25, 25));
        cancelarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/xIcon.png"))); // NOI18N
        cancelarJButton.setText("Cancelar");

        javax.swing.GroupLayout botoesJPanelLayout = new javax.swing.GroupLayout(botoesJPanel);
        botoesJPanel.setLayout(botoesJPanelLayout);
        botoesJPanelLayout.setHorizontalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesJPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(gravarJButton)
                .addGap(66, 66, 66)
                .addComponent(cancelarJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        botoesJPanelLayout.setVerticalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nfeJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoesJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(nfeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        setSize(new java.awt.Dimension(544, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void controlaEsc(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_controlaEsc
        controlaEsc();
    }//GEN-LAST:event_controlaEsc

    private void caminhoXMLJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoXMLJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caminhoXMLJTextFieldActionPerformed

    private void dataCadastroJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCadastroJFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCadastroJFormattedTextFieldActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuImportar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoesJPanel;
    private javax.swing.JTextField caminhoXMLJTextField;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel chaveAcessoJLabel;
    private javax.swing.JFormattedTextField dataCadastroJFormattedTextField;
    private javax.swing.JLabel dataCadastroJLabel;
    private javax.swing.JLabel dataCadastroOBSJLabel;
    private javax.swing.JLabel fornecedorJLabel;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JPanel importarJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPanel nfeJPanel;
    private javax.swing.JLabel parcelaJLabel;
    private javax.swing.JLabel parcelaOBSJLabel;
    private javax.swing.JButton sairJButton;
    private javax.swing.JLabel valorTotalJLabel;
    private javax.swing.JLabel valorTotalOBSJLabel;
    private javax.swing.JButton verMaisJButton;
    // End of variables declaration//GEN-END:variables
}
