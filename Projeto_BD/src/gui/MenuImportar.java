package gui;

import java.awt.event.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;

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
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                nfeJPanel = new javax.swing.JPanel();
                chaveAcessoJLabel = new javax.swing.JLabel();
                valorTotalJLabel = new javax.swing.JLabel();
                fornecedorJLabel = new javax.swing.JLabel();
                chaveAcessoJTextField = new javax.swing.JTextField();
                fornecedorJTextField = new javax.swing.JTextField();
                valorTotalJTextField = new javax.swing.JTextField();
                parcelaJLabel = new javax.swing.JLabel();
                parcelasJTextField = new javax.swing.JTextField();
                verMaisJButton = new javax.swing.JButton();
                dataCadastroJLabel = new javax.swing.JLabel();
                dataCadastroJFormattedTextField = new javax.swing.JFormattedTextField();
                dataCadastroOBSJLabel = new javax.swing.JLabel();
                valorTotalOBSJLabel = new javax.swing.JLabel();
                parcelaOBSJLabel = new javax.swing.JLabel();
                importarJPanel = new javax.swing.JPanel();
                caminhoXMLJTextField = new javax.swing.JTextField();
                procurarJButton = new javax.swing.JButton();
                botoesJPanel = new javax.swing.JPanel();
                gravarJButton = new javax.swing.JButton();
                sairJButton = new javax.swing.JButton();
                cancelarJButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Menu Importar");
                setName("importFrame"); // NOI18N
                setResizable(false);
                setSize(new java.awt.Dimension(400, 400));
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowOpened(java.awt.event.WindowEvent evt) {
                                controlaEsc(evt);
                        }
                });

                nfeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("NF-e"));

                chaveAcessoJLabel.setText("Chave de Acesso");

                valorTotalJLabel.setText("Valor total:");

                fornecedorJLabel.setText("Fornecedor:");

                chaveAcessoJTextField.setBackground(new java.awt.Color(25, 25, 25));

                fornecedorJTextField.setBackground(new java.awt.Color(25, 25, 25));

                valorTotalJTextField.setBackground(new java.awt.Color(25, 25, 25));

                parcelaJLabel.setText("Parcelas:");

                parcelasJTextField.setBackground(new java.awt.Color(25, 25, 25));

                verMaisJButton.setBackground(new java.awt.Color(25, 25, 25));
                verMaisJButton.setText("...");

                dataCadastroJLabel.setText("Data cadas.:");

                dataCadastroJFormattedTextField.setBackground(new java.awt.Color(25, 25, 25));
                dataCadastroJFormattedTextField.setFormatterFactory(
                                new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
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
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout
                                                                .createSequentialGroup()
                                                                .addGroup(nfeJPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(nfeJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(47, 47, 47)
                                                                                                .addComponent(valorTotalOBSJLabel)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(6, 6, 6)
                                                                                                                                .addComponent(valorTotalJTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                80,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(valorTotalJLabel))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(14, 14, 14)
                                                                                                                                .addComponent(parcelasJTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                80,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(verMaisJButton))
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(parcelaOBSJLabel)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(parcelaJLabel,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                53,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(58, 58, 58)
                                                                                                                                .addComponent(dataCadastroOBSJLabel)
                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(37, 37, 37)
                                                                                                                                                                .addComponent(dataCadastroJFormattedTextField,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                83,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(dataCadastroJLabel))))))
                                                                                .addGroup(nfeJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(fornecedorJLabel)
                                                                                                                                                                .addGap(218, 218,
                                                                                                                                                                                218))
                                                                                                                                                .addComponent(fornecedorJTextField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                275,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(143, 143,
                                                                                                                                                143))
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(chaveAcessoJLabel)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(chaveAcessoJTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                309,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(44, 44, 44)));
                nfeJPanelLayout.setVerticalGroup(
                                nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(nfeJPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(nfeJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(fornecedorJLabel)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(fornecedorJTextField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(valorTotalJLabel)
                                                                                                                                                .addComponent(valorTotalOBSJLabel))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(valorTotalJTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(parcelaJLabel,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                16,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(parcelaOBSJLabel))))
                                                                                .addGroup(nfeJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(dataCadastroJLabel)
                                                                                                                .addComponent(dataCadastroOBSJLabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(dataCadastroJFormattedTextField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(nfeJPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(verMaisJButton,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                26,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(parcelasJTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                22, Short.MAX_VALUE)
                                                                .addGroup(nfeJPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(chaveAcessoJTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(chaveAcessoJLabel))
                                                                .addContainerGap()));

                importarJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar XML"));

                caminhoXMLJTextField.setBackground(new java.awt.Color(25, 25, 25));
                caminhoXMLJTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                caminhoXMLJTextFieldActionPerformed(evt);
                        }
                });

                procurarJButton.setBackground(new java.awt.Color(25, 25, 25));
                procurarJButton.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/resources/icons/findIcon.png"))); // NOI18N
                procurarJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                procurarJButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout importarJPanelLayout = new javax.swing.GroupLayout(importarJPanel);
                importarJPanel.setLayout(importarJPanelLayout);
                importarJPanelLayout.setHorizontalGroup(
                                importarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(importarJPanelLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(caminhoXMLJTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                407,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(procurarJButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                45,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(69, 69, 69)));
                importarJPanelLayout.setVerticalGroup(
                                importarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(importarJPanelLayout.createSequentialGroup()
                                                                .addGroup(importarJPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(importarJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(22, 22, 22)
                                                                                                .addComponent(caminhoXMLJTextField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(importarJPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(14, 14, 14)
                                                                                                .addComponent(procurarJButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                46,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(22, Short.MAX_VALUE)));

                botoesJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                botoesJPanel.setToolTipText("");

                gravarJButton.setBackground(new java.awt.Color(25, 25, 25));
                gravarJButton.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/resources/icons/gravarIcon(1).png"))); // NOI18N
                gravarJButton.setText("Gravar");

                sairJButton.setBackground(new java.awt.Color(25, 25, 25));
                sairJButton.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exitIcon(1).png"))); // NOI18N
                sairJButton.setText("Sair");
                sairJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sairJButtonActionPerformed(evt);
                        }
                });

                cancelarJButton.setBackground(new java.awt.Color(25, 25, 25));
                cancelarJButton.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/resources/icons/xIcon.png"))); // NOI18N
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
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(sairJButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                97,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)));
                botoesJPanelLayout.setVerticalGroup(
                                botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(botoesJPanelLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(botoesJPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(gravarJButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(sairJButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cancelarJButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(nfeJPanel,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(botoesJPanel,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(importarJPanel,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0, Short.MAX_VALUE))
                                                                .addContainerGap(21, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(importarJPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 37, Short.MAX_VALUE)
                                                                .addComponent(nfeJPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(botoesJPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)));

                setSize(new java.awt.Dimension(544, 495));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void controlaEsc(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_controlaEsc
                controlaEsc();
        }// GEN-LAST:event_controlaEsc

        private void caminhoXMLJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_caminhoXMLJTextFieldActionPerformed

        }// GEN-LAST:event_caminhoXMLJTextFieldActionPerformed

        private void dataCadastroJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataCadastroJFormattedTextFieldActionPerformed

        }// GEN-LAST:event_dataCadastroJFormattedTextFieldActionPerformed

        private void procurarJButtonActionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                        try {
                                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                                DocumentBuilder builder = factory.newDocumentBuilder();
                                Document document = builder.parse(fileChooser.getSelectedFile());

                                XPathFactory xPathFactory = XPathFactory.newInstance();
                                XPath xPath = xPathFactory.newXPath();

                                // Selecionar o elemento infNFe usando XPath
                                XPathExpression expr = xPath.compile("//infNFe");
                                Element infNFeElement = (Element) expr.evaluate(document, XPathConstants.NODE);

                                if (infNFeElement != null) {
                                        // Obter o valor do atributo 'Id' do elemento infNFe
                                        String chaveAcesso = infNFeElement.getAttribute("Id");

                                        // Remover as letras da chave de acesso
                                        String chaveAcessoNumerica = chaveAcesso.replaceAll("[^\\d]", "");

                                        // Converter a chave de acesso para BigInteger
                                        BigInteger chaveAcessoNumericaBigInt = new BigInteger(chaveAcessoNumerica);

                                        // Ler as tags do arquivo XML
                                        NodeList nDuList = document.getElementsByTagName("nDup");
                                        NodeList dVencList = document.getElementsByTagName("dVenc");
                                        NodeList vDupList = document.getElementsByTagName("vDup");
                                        NodeList xFantList = document.getElementsByTagName("xFant");
                                        NodeList ufList = document.getElementsByTagName("UF");
                                        NodeList cnpjList = document.getElementsByTagName("CNPJ");

                                        // Exibir os valores das tags
                                        String nDup = nDuList.item(0).getTextContent();
                                        String dVenc = dVencList.item(0).getTextContent();
                                        String vDup = vDupList.item(0).getTextContent();
                                        String xFant = xFantList.item(0).getTextContent();
                                        String uf = ufList.item(0).getTextContent();
                                        String cnpj = cnpjList.item(0).getTextContent();

                                        // Exibindo os valores lidos
                                        fornecedorJTextField.setText(xFant);
                                        chaveAcessoJTextField.setText(chaveAcessoNumericaBigInt.toString());
                                        // parcelasJTextField.setText(vDup);

                                        // Verifica se o CNPJ está no banco de dados
                                        if (!verificarCNPJ(cnpj)) {
                                                // Abrir a janela de cadastro de fornecedor
                                                CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
                                                cadastroFornecedor.setVisible(true);
                                        }

                                        // Obter o caminho do arquivo XML
                                        String caminhoXML = fileChooser.getSelectedFile().getAbsolutePath();

                                        // Exibir o caminho no JTextField
                                        caminhoXMLJTextField.setText(caminhoXML);
                                } else {
                                        // Tratar o caso em que o elemento infNFe não foi encontrado
                                        System.out.println("Elemento <infNFe> não encontrado no arquivo XML.");
                                }
                        } catch (Exception ex) {
                                ex.printStackTrace();
                        }
                }
        }

        private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sairJButtonActionPerformed
                dispose();
        }// GEN-LAST:event_sairJButtonActionPerformed

        // Metodo para verificar se o CNPJ está no Banco de Dados
        public boolean verificarCNPJ(String cnpj) {
                // Estabelecer a conexão com o banco de dados
                String url = "jdbc:postgresql://localhost:5432/paymanage_bd";
                String user = "postgres";
                String password = "141171";

                Connection connection = null;
                try {
                        connection = DriverManager.getConnection(url, user, password);
                } catch (SQLException e) {
                        e.printStackTrace();
                }

                // Faz a consulta para verificar se está no Banco de Dados
                String sql = "SELECT * FROM Fornecedor WHERE cnpj = ?";

                try {
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setString(1, cnpj);

                        ResultSet resultSet = statement.executeQuery();

                        boolean resultado = resultSet.next();

                        resultSet.close();
                        statement.close();
                        connection.close();

                        return resultado;

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return false;
        }

        public static boolean validarCNPJ(String cnpj) {
                // Remove caracteres não numéricos do CNPJ
                cnpj = cnpj.replaceAll("[^0-9]", "");

                // Verifica se possui 14 dígitos
                if (cnpj.length() != 14) {
                        return false;
                }

                // Calcula o primeiro dígito verificador
                int soma = 0;
                int peso = 2;
                for (int i = 11; i >= 0; i--) {
                        int digito = cnpj.charAt(i) - '0';
                        soma += digito * peso;
                        peso = (peso + 1) % 10 + (peso + 1) / 10;
                }
                int digitoVerificador1 = (soma % 11) < 2 ? 0 : 11 - (soma % 11);

                // Calcula o segundo dígito verificador
                soma = 0;
                peso = 2;
                for (int i = 12; i >= 0; i--) {
                        int digito = cnpj.charAt(i) - '0';
                        soma += digito * peso;
                        peso = (peso + 1) % 10 + (peso + 1) / 10;
                }
                int digitoVerificador2 = (soma % 11) < 2 ? 0 : 11 - (soma % 11);

                // Verifica se os dígitos verificadores estão corretos
                return (cnpj.charAt(12) - '0' == digitoVerificador1 && cnpj.charAt(13) - '0' == digitoVerificador2);
        }

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
        private javax.swing.JTextField chaveAcessoJTextField;
        private javax.swing.JFormattedTextField dataCadastroJFormattedTextField;
        private javax.swing.JLabel dataCadastroJLabel;
        private javax.swing.JLabel dataCadastroOBSJLabel;
        private javax.swing.JLabel fornecedorJLabel;
        private javax.swing.JTextField fornecedorJTextField;
        private javax.swing.JButton gravarJButton;
        private javax.swing.JPanel importarJPanel;
        private javax.swing.JPanel nfeJPanel;
        private javax.swing.JLabel parcelaJLabel;
        private javax.swing.JLabel parcelaOBSJLabel;
        private javax.swing.JTextField parcelasJTextField;
        private javax.swing.JButton procurarJButton;
        private javax.swing.JButton sairJButton;
        private javax.swing.JLabel valorTotalJLabel;
        private javax.swing.JTextField valorTotalJTextField;
        private javax.swing.JLabel valorTotalOBSJLabel;
        private javax.swing.JButton verMaisJButton;
        // End of variables declaration//GEN-END:variables
}
