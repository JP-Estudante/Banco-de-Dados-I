package SCP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pesquisa extends javax.swing.JFrame {

    private JPanel titlePanel;
    private JLabel titleLabel;
    private MouseAdapter mouseAdapter;

    public Pesquisa() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaButtonGroup = new javax.swing.ButtonGroup();
        esquerdaFornecedorJRadioButton = new javax.swing.JRadioButton();
        pesquisaTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        tooltipLabel = new javax.swing.JLabel();
        tooltipLabel1 = new javax.swing.JLabel();
        exatoFornecedorJRadioButton = new javax.swing.JRadioButton();
        exatoFornecedorJRadioButton1 = new javax.swing.JRadioButton();
        tooltipLabel2 = new javax.swing.JLabel();
        exatoFornecedorJRadioButton2 = new javax.swing.JRadioButton();
        tooltipLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesquisaJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        pesquisaButtonGroup.add(esquerdaFornecedorJRadioButton);
        esquerdaFornecedorJRadioButton.setText("--> Fornecedor");
        esquerdaFornecedorJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquerdaFornecedorJRadioButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pago(s)", "Pendente(s)", "Vencido(s)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tooltipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor </strong><br>\n  Exibe uma lista de fornecedores com base na palavra-chave fornecida.\n</body>\n</html>\n");

        tooltipLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/smallQuestionIcon.png"))); // NOI18N
        tooltipLabel1.setToolTipText("<html>\n<body>\n<strong> &rarr; Fornecedor &larr; </strong><br>\nExibe uma lista de fornecedores que correspondem exatamente à palavra-chave fornecida.\n</body>\n</html>\n");

        pesquisaButtonGroup.add(exatoFornecedorJRadioButton);
        exatoFornecedorJRadioButton.setText("--> Fornecedor <--");
        exatoFornecedorJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exatoFornecedorJRadioButtonActionPerformed(evt);
            }
        });

        pesquisaButtonGroup.add(exatoFornecedorJRadioButton1);
        exatoFornecedorJRadioButton1.setText("--> DD/MM/AA");
        exatoFornecedorJRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exatoFornecedorJRadioButton1ActionPerformed(evt);
            }
        });

        tooltipLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/smallQuestionIcon.png"))); // NOI18N

        pesquisaButtonGroup.add(exatoFornecedorJRadioButton2);
        exatoFornecedorJRadioButton2.setText("--> DD/MM/AA <--");
        exatoFornecedorJRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exatoFornecedorJRadioButton2ActionPerformed(evt);
            }
        });

        tooltipLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/smallQuestionIcon.png"))); // NOI18N

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
                .addGap(24, 24, 24)
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
                        .addComponent(exatoFornecedorJRadioButton1)
                        .addGap(3, 3, 3)
                        .addComponent(tooltipLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(exatoFornecedorJRadioButton2)
                        .addGap(3, 3, 3)
                        .addComponent(tooltipLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
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
                    .addComponent(exatoFornecedorJRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tooltipLabel2))
                    .addComponent(exatoFornecedorJRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tooltipLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void esquerdaFornecedorJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_esquerdaFornecedorJRadioButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_esquerdaFornecedorJRadioButtonActionPerformed

    private void exatoFornecedorJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exatoFornecedorJRadioButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_exatoFornecedorJRadioButtonActionPerformed

    private void exatoFornecedorJRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exatoFornecedorJRadioButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_exatoFornecedorJRadioButton1ActionPerformed

    private void exatoFornecedorJRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exatoFornecedorJRadioButton2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_exatoFornecedorJRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    SwingUtilities.invokeLater(() -> {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Cria e exibe a instância da classe Pesquisa
        java.awt.EventQueue.invokeLater(() -> {
            Pesquisa pesquisa = new Pesquisa();
            pesquisa.setVisible(true);
        });
    });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton esquerdaFornecedorJRadioButton;
    private javax.swing.JRadioButton exatoFornecedorJRadioButton;
    private javax.swing.JRadioButton exatoFornecedorJRadioButton1;
    private javax.swing.JRadioButton exatoFornecedorJRadioButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup pesquisaButtonGroup;
    private javax.swing.JTable pesquisaJTable;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JLabel tooltipLabel1;
    private javax.swing.JLabel tooltipLabel2;
    private javax.swing.JLabel tooltipLabel3;
    // End of variables declaration//GEN-END:variables
}
