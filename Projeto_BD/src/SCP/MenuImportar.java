package SCP;

import com.formdev.flatlaf.IntelliJTheme;
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valorTotalLabel = new javax.swing.JLabel();
        tooltipLabel = new javax.swing.JLabel();
        vencimentoLabel = new javax.swing.JLabel();
        razãoSocialJLabel = new javax.swing.JLabel();
        nomeFantasiaJLabel = new javax.swing.JLabel();
        importarXMLButton = new javax.swing.JButton();
        importarLoteButton = new javax.swing.JButton();
        valorTotalTextField = new javax.swing.JTextField();
        razãoSocialJTextField = new javax.swing.JTextField();
        nomeFantasiaJTextField1 = new javax.swing.JTextField();
        ufJLabel = new javax.swing.JLabel();
        ufJTextField = new javax.swing.JTextField();
        vencimentoJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nParcelasJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("importFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        setType(java.awt.Window.Type.UTILITY);

        valorTotalLabel.setText("Valor Total NF-e:");

        tooltipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/questionIcon.png"))); // NOI18N
        tooltipLabel.setToolTipText("<html> \n<body>\n <strong>Importar por Lote</strong><br> \nClique para importar um lote de arquivos XML ou boleto, util para varios arquivos. \n</body> \n</html> ");

        vencimentoLabel.setText("Vencimento das Parcelas:");

        razãoSocialJLabel.setText("Razão Social:");

        nomeFantasiaJLabel.setText("Nome Fantasia:");

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

        nomeFantasiaJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFantasiaJTextField1ActionPerformed(evt);
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
                            .addComponent(nomeFantasiaJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeFantasiaJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(razãoSocialJLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vencimentoLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ufJLabel)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(importarXMLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nomeFantasiaJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeFantasiaJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(razãoSocialJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(razãoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ufJLabel)
                            .addGap(32, 32, 32)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ufJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(valorTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vencimentoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vencimentoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(795, 214));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //TextField para o valor do arquivo importado
    private void valorTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalTextFieldActionPerformed
    }//GEN-LAST:event_valorTotalTextFieldActionPerformed

    private void importarLoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarLoteButtonActionPerformed

    }//GEN-LAST:event_importarLoteButtonActionPerformed

    private void importarXMLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarXMLButtonActionPerformed

    }//GEN-LAST:event_importarXMLButtonActionPerformed

    private void nomeFantasiaJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFantasiaJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFantasiaJTextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuImportar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton importarLoteButton;
    private javax.swing.JButton importarXMLButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nParcelasJTextField;
    private javax.swing.JLabel nomeFantasiaJLabel;
    private javax.swing.JTextField nomeFantasiaJTextField1;
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
