package SCP;

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

        valorLabel = new javax.swing.JLabel();
        fornecedorLabel = new javax.swing.JLabel();
        tooltipLabel = new javax.swing.JLabel();
        vencimentoLabel = new javax.swing.JLabel();
        importarArquivosButton = new javax.swing.JButton();
        importarLoteButton = new javax.swing.JButton();
        valorTextField = new javax.swing.JTextField();
        vencimentoTextField = new javax.swing.JTextField();
        fornecedorTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("importFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        valorLabel.setText("Valor:");

        fornecedorLabel.setText("Fornecedor:");

        tooltipLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/questionIcon.png"))); // NOI18N
        tooltipLabel.setToolTipText("<html> \n<body>\n <strong>Importar por Lote</strong><br> \nClique para importar um lote de arquivos XML ou boleto, util para varios arquivos. \n</body> \n</html> ");

        vencimentoLabel.setText("Vencimento:");

        importarArquivosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/importIcon.png"))); // NOI18N
        importarArquivosButton.setText("Importar XML/Boleto");
        importarArquivosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarArquivosButtonActionPerformed(evt);
            }
        });

        importarLoteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/importIcon.png"))); // NOI18N
        importarLoteButton.setText("Importar por Lote");
        importarLoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarLoteButtonActionPerformed(evt);
            }
        });

        valorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(fornecedorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vencimentoLabel)
                            .addComponent(vencimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(importarLoteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(importarArquivosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tooltipLabel))
                    .addComponent(fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vencimentoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vencimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(fornecedorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(importarArquivosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importarLoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tooltipLabel)
                        .addGap(77, 77, 77))))
        );

        setSize(new java.awt.Dimension(410, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void importarArquivosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarArquivosButtonActionPerformed

    }//GEN-LAST:event_importarArquivosButtonActionPerformed
    
    //TextField para o valor do arquivo importado
    private void valorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTextFieldActionPerformed
    }//GEN-LAST:event_valorTextFieldActionPerformed

    private void importarLoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarLoteButtonActionPerformed

    }//GEN-LAST:event_importarLoteButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuImportar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTextField fornecedorTextField;
    private javax.swing.JButton importarArquivosButton;
    private javax.swing.JButton importarLoteButton;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorTextField;
    private javax.swing.JLabel vencimentoLabel;
    private javax.swing.JTextField vencimentoTextField;
    // End of variables declaration//GEN-END:variables
}
