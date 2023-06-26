package SCP;

import com.formdev.flatlaf.IntelliJTheme;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class MenuImportar extends javax.swing.JFrame {

    private String caminhoArquivo;

    public MenuImportar() {
        initComponents();
        
                // Adiciona o ouvinte de teclado à janela
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Verifica se a tecla pressionada é "Esc"
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    // Fecha a janela
                    dispose();
                }
            }
        });
        
                // Define o foco na janela para que ela possa receber eventos de teclado
        setFocusable(true);
        requestFocusInWindow();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valorTotalLabel = new javax.swing.JLabel();
        tooltipLabel = new javax.swing.JLabel();
        vencimentoLabel = new javax.swing.JLabel();
        razãoSocialJLabel = new javax.swing.JLabel();
        fornecedorJLabel = new javax.swing.JLabel();
        importarXMLButton = new javax.swing.JButton();
        importarLoteButton = new javax.swing.JButton();
        valorTotalTextField = new javax.swing.JTextField();
        razãoSocialJTextField = new javax.swing.JTextField();
        fornecedorJTextField1 = new javax.swing.JTextField();
        ufJLabel = new javax.swing.JLabel();
        ufJTextField = new javax.swing.JTextField();
        vencimentoJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nParcelasJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Importar");
        setName("importFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        setType(java.awt.Window.Type.UTILITY);

        valorTotalLabel.setText("Valor Total NF-e:");

        tooltipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/questionIcon.png"))); // NOI18N
        tooltipLabel.setToolTipText("<html> \n<body>\n <strong>Importar por Lote</strong><br> \nClique para importar um lote de arquivos XML ou boleto, util para varios arquivos. \n</body> \n</html> ");

        vencimentoLabel.setText("Vencimento das Parcelas:");

        razãoSocialJLabel.setText("Razão Social:");

        fornecedorJLabel.setText("Fornecedor:");

        importarXMLButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/importIcon.png"))); // NOI18N
        importarXMLButton.setText("Importar XML");
        importarXMLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarXMLButtonActionPerformed(evt);
            }
        });

        importarLoteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/importIcon.png"))); // NOI18N
        importarLoteButton.setText("Importar por Lote");
        importarLoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarLoteButtonActionPerformed(evt);
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

        jLabel1.setText("Numero de Parcelas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importarXMLButton)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecedorJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fornecedorJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(valorTotalLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(nParcelasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importarLoteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tooltipLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vencimentoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(razãoSocialJLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ufJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(importarXMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fornecedorJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fornecedorJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ufJLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(razãoSocialJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vencimentoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importarLoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nParcelasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tooltipLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(valorTotalLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void importarLoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarLoteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importarLoteButtonActionPerformed

    private void importarXMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarXMLButtonActionPerformed
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
    }//GEN-LAST:event_importarXMLButtonActionPerformed

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
    private javax.swing.JButton importarLoteButton;
    private javax.swing.JButton importarXMLButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nParcelasJTextField;
    private javax.swing.JLabel razãoSocialJLabel;
    private javax.swing.JTextField razãoSocialJTextField;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JLabel ufJLabel;
    private javax.swing.JTextField ufJTextField;
    private javax.swing.JLabel valorTotalLabel;
    private javax.swing.JTextField valorTotalTextField;
    private javax.swing.JComboBox<String> vencimentoJComboBox;
    private javax.swing.JLabel vencimentoLabel;
    // End of variables declaration//GEN-END:variables
}
