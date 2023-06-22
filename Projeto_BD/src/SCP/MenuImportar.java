package SCP;

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

   private javax.swing.JTextField valorTextField;
   private JTextField vencimentoTextField;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importarArquivosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarArquivosButtonActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        // Chamar o método importarXML passando o caminho do arquivo
        String valorDoXML = importarXML(selectedFile.getAbsolutePath());
        
        valorTextField.setText(valorDoXML);

        
        // Atualizar a GUI na thread de despacho de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            // Definir o valor no campo de texto
            valorTextField.setText(valorDoXML);
        });
    }
    }//GEN-LAST:event_importarArquivosButtonActionPerformed

    private String selecionarArquivo() {
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        return selectedFile.getAbsolutePath();
    }
    return null;
}

    
    //TextField para o valor do arquivo importado
    private void valorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTextFieldActionPerformed
       // Verificar se o caminho do arquivo está definido
        if (caminhoArquivo != null) {
        // Importar o XML e obter o valor desejado
        String valorDoXML = importarXML(caminhoArquivo);

        // Verificar se o valor do XML foi obtido com sucesso
        if (valorDoXML != null) {
            // Atualizar a GUI na thread de despacho de eventos do Swing
            SwingUtilities.invokeLater(() -> {
                // Definir o valor no campo de texto
                valorTextField.setText(valorDoXML);
            });
        } else {
            // Exibir mensagem de erro
            JOptionPane.showMessageDialog(this, "Não foi possível obter o valor do arquivo XML.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Caminho do arquivo não definido, exibir mensagem de erro
        JOptionPane.showMessageDialog(this, "Nenhum arquivo selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_valorTextFieldActionPerformed

    private void importarLoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarLoteButtonActionPerformed

    }//GEN-LAST:event_importarLoteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuImportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuImportar().setVisible(true);
            }
        });
    }

public String importarXML(String caminhoArquivo) {
    try {
        // Lógica de importação do XML e obtenção dos dados
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(caminhoArquivo));

        // Supondo que 'document' seja um objeto Document representando o XML
        NodeList valorNodes = document.getElementsByTagName("valor");
        if (valorNodes.getLength() > 0) {
            Node valorNode = valorNodes.item(0);
            return valorNode.getTextContent();
        }

        // Restante da lógica de importação e preenchimento de campos

    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

public String lerVPag(String caminhoArquivo) {
    try {
        // Cria um DocumentBuilder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = factory.newDocumentBuilder().parse(new File(caminhoArquivo));

        // Cria um XPath para executar a consulta
        XPathFactory xpathFactory = XPathFactory.newInstance();
        XPath xpath = xpathFactory.newXPath();

        // Compila a expressão XPath para localizar o elemento vPag
        XPathExpression expr = xpath.compile("//vPag/text()");

        // Executa a expressão XPath no documento XML
        Node node = (Node) expr.evaluate(document, XPathConstants.NODE);

        // Retorna o valor encontrado
        return node.getNodeValue();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTextField fornecedorTextField;
    private javax.swing.JButton importarArquivosButton;
    private javax.swing.JButton importarLoteButton;
    private javax.swing.JLabel tooltipLabel;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JLabel vencimentoLabel;
    // End of variables declaration//GEN-END:variables
}
