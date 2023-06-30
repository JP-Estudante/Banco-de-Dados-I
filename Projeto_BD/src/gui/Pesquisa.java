package gui;

import java.awt.event.*;
import javax.swing.*;

public class Pesquisa extends javax.swing.JFrame {

    public Pesquisa() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaButtonGroup = new javax.swing.ButtonGroup();
        tooltipLabel3 = new javax.swing.JLabel();
        tooltipLabel2 = new javax.swing.JLabel();
        tooltipLabel1 = new javax.swing.JLabel();
        tooltipLabel = new javax.swing.JLabel();
        exatoFornecedorJRadioButton = new javax.swing.JRadioButton();
        exataDataJRadioButton = new javax.swing.JRadioButton();
        adianteDataJRadioButton = new javax.swing.JRadioButton();
        esquerdaFornecedorJRadioButton = new javax.swing.JRadioButton();
        pesquisaTextField = new javax.swing.JTextField();
        situaçãoJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesquisaJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                controlaEsc(evt);
            }
        });

        tooltipLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel3.setToolTipText("<html>\n<body>\n<strong> &rarr; Data </strong><br>\nExibe os resultados da data fornecida, até a mais antiga.\n</body>\n</html>\n");

        tooltipLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel2.setToolTipText("<html>\n<body>\n<strong> &rarr; Data </strong><br>\nExibe os resultados da data fornecida, até a mais recente.\n</body>\n</html>\n");

        tooltipLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel1.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor &larr; </strong><br>\nExibe uma lista de fornecedores que correspondem exatamente à palavra-chave fornecida.\n</body>\n</html>\n");

        tooltipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor </strong><br>\n  Exibe uma lista de fornecedores com base na palavra-chave fornecida.\n</body>\n</html>\n");
        tooltipLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tooltipLabelMouseReleased(evt);
            }
        });

        pesquisaButtonGroup.add(exatoFornecedorJRadioButton);
        exatoFornecedorJRadioButton.setText("--> Fornecedor <--");
        exatoFornecedorJRadioButton.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor &larr; </strong><br>\nExibe uma lista de fornecedores que correspondem exatamente à palavra-chave fornecida.\n</body>\n</html>\n");
        exatoFornecedorJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exatoFornecedorJRadioButtonActionPerformed(evt);
            }
        });

        pesquisaButtonGroup.add(exataDataJRadioButton);
        exataDataJRadioButton.setText("DD/MM/AA <--");
        exataDataJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exataDataJRadioButtonActionPerformed(evt);
            }
        });

        pesquisaButtonGroup.add(adianteDataJRadioButton);
        adianteDataJRadioButton.setText("--> DD/MM/AA");
        adianteDataJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adianteDataJRadioButtonActionPerformed(evt);
            }
        });

        pesquisaButtonGroup.add(esquerdaFornecedorJRadioButton);
        esquerdaFornecedorJRadioButton.setSelected(true);
        esquerdaFornecedorJRadioButton.setText("--> Fornecedor");
        esquerdaFornecedorJRadioButton.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor </strong><br>\n  Exibe uma lista de fornecedores com base na palavra-chave fornecida.\n</body>\n</html>\n");
        esquerdaFornecedorJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquerdaFornecedorJRadioButtonActionPerformed(evt);
            }
        });

        pesquisaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaTextFieldActionPerformed(evt);
            }
        });

        situaçãoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pago(s)", "Pendente(s)", "Vencido(s)" }));
        situaçãoJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situaçãoJComboBoxActionPerformed(evt);
            }
        });

        pesquisaJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor", "Data Venc.", "Valor T.", "Situação"
            }
        ));
        jScrollPane1.setViewportView(pesquisaJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(esquerdaFornecedorJRadioButton)
                            .addGap(3, 3, 3)
                            .addComponent(tooltipLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(exatoFornecedorJRadioButton)
                            .addGap(3, 3, 3)
                            .addComponent(tooltipLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adianteDataJRadioButton)
                            .addGap(3, 3, 3)
                            .addComponent(tooltipLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(exataDataJRadioButton)
                            .addGap(3, 3, 3)
                            .addComponent(tooltipLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(situaçãoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esquerdaFornecedorJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tooltipLabel))
                    .addComponent(exatoFornecedorJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tooltipLabel1))
                    .addComponent(adianteDataJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tooltipLabel2))
                    .addComponent(exataDataJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tooltipLabel3)
                            .addComponent(situaçãoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(856, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exataDataJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exataDataJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exataDataJRadioButtonActionPerformed

    private void esquerdaFornecedorJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esquerdaFornecedorJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esquerdaFornecedorJRadioButtonActionPerformed

    private void pesquisaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaTextFieldActionPerformed

    private void situaçãoJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situaçãoJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_situaçãoJComboBoxActionPerformed

    private void tooltipLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tooltipLabelMouseReleased

    }//GEN-LAST:event_tooltipLabelMouseReleased

    private void exatoFornecedorJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exatoFornecedorJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exatoFornecedorJRadioButtonActionPerformed

    private void adianteDataJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adianteDataJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adianteDataJRadioButtonActionPerformed

    private void controlaEsc(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_controlaEsc
        controlaEsc();
    }//GEN-LAST:event_controlaEsc

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            // Cria e exibe a instância da classe Pesquisa
            java.awt.EventQueue.invokeLater(() -> {
                Pesquisa pesquisa = new Pesquisa();
                pesquisa.setVisible(true);
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adianteDataJRadioButton;
    private javax.swing.JRadioButton esquerdaFornecedorJRadioButton;
    private javax.swing.JRadioButton exataDataJRadioButton;
    private javax.swing.JRadioButton exatoFornecedorJRadioButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup pesquisaButtonGroup;
    private javax.swing.JTable pesquisaJTable;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JComboBox<String> situaçãoJComboBox;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JLabel tooltipLabel1;
    private javax.swing.JLabel tooltipLabel2;
    private javax.swing.JLabel tooltipLabel3;
    // End of variables declaration//GEN-END:variables
}
