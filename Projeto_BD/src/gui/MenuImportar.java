package gui;

import java.awt.event.*;
import java.io.File;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;

public class MenuImportar extends javax.swing.JFrame {

        // Conexão com o Banco de Dados
        private static final String URL = "jdbc:postgresql://localhost:5432/payManage_bd";
        private static final String USER = "postgres";
        private static final String PASSWORD = "141171";

        CadastroFornecedor cf = new CadastroFornecedor();

        private String caminhoXML;

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

                chaveAcessoJTextField.setBackground(new java.awt.Color(25, 25, 25));

                fornecedorJTextField.setBackground(new java.awt.Color(25, 25, 25));

                valorTotalJTextField.setBackground(new java.awt.Color(25, 25, 25));

                parcelaJLabel.setText("Parcelas:");

                parcelasJTextField.setBackground(new java.awt.Color(25, 25, 25));

                verMaisJButton.setBackground(new java.awt.Color(25, 25, 25));
                verMaisJButton.setText("...");

                dataCadastroJLabel.setText("Data cadas.:");

                dataCadastroJFormattedTextField.setBackground(new java.awt.Color(25, 25, 25));
                dataCadastroJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

                dataCadastroOBSJLabel.setText("*");

                valorTotalOBSJLabel.setText("*");

                parcelaOBSJLabel.setText("*");

                javax.swing.GroupLayout nfeJPanelLayout = new javax.swing.GroupLayout(nfeJPanel);
                nfeJPanel.setLayout(nfeJPanelLayout);
                nfeJPanelLayout.setHorizontalGroup(
                                nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout
                                                                .createSequentialGroup()
                                                                .addGroup(nfeJPanelLayout
                                                                                .createParallelGroup(
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
                                                                                                                                                                .addComponent(
                                                                                                                                                                                dataCadastroJFormattedTextField,
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
                                                                                                .addContainerGap(8,
                                                                                                                Short.MAX_VALUE)
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
                                                                                                .addGap(143, 143, 143)))
                                                                .addGap(44, 44, 44))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(chaveAcessoJLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(chaveAcessoJTextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                331,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23)));
                nfeJPanelLayout.setVerticalGroup(
                                nfeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nfeJPanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(nfeJPanelLayout
                                                                                .createParallelGroup(
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
                                                                                22,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(nfeJPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(chaveAcessoJTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(chaveAcessoJLabel))
                                                                .addContainerGap()));

                importarJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Procurar XML"));

                caminhoXMLJTextField.setBackground(new java.awt.Color(25, 25, 25));

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
                                                                .addGroup(importarJPanelLayout
                                                                                .createParallelGroup(
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
                                                                .addGroup(botoesJPanelLayout
                                                                                .createParallelGroup(
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
                                                                                                486,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(19, Short.MAX_VALUE)));
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

        private void controlaEsc(java.awt.event.WindowEvent evt) {
                controlaEsc();
        }

        private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
        }

        private void procurarJButtonActionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                Date dataAtual = new Date();

                // Define o formato desejado para exibição da data
                DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

                // Converte a data atual para uma string formatada
                String dataFormatada = formatoData.format(dataAtual);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                        try {
                                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                                DocumentBuilder builder = factory.newDocumentBuilder();
                                File selectedFile = fileChooser.getSelectedFile();
                                Document document = builder.parse(selectedFile);

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
                                        NodeList xFantList = document.getElementsByTagName("xFant");
                                        NodeList cnpjList = document.getElementsByTagName("CNPJ");
                                        NodeList xBairroList = document.getElementsByTagName("xBairro");

                                        NodeList nDupList = document.getElementsByTagName("nDup");
                                        NodeList dVencList = document.getElementsByTagName("dVenc");
                                        NodeList vDupList = document.getElementsByTagName("vDup");

                                        // Verificar o número de nós encontrados
                                        int numParcelas = nDupList.getLength();

                                        // Verificar se existem valores de parcelas
                                        if (numParcelas > 0) {
                                                // Criar arrays para armazenar os valores das parcelas
                                                String[] numerosParcelas = new String[numParcelas];
                                                String[] datasVencimento = new String[numParcelas];
                                                double[] valoresParcelas = new double[numParcelas];

                                                // Percorrer os nós e obter os valores
                                                for (int i = 0; i < numParcelas; i++) {
                                                        Node nDupNode = nDupList.item(i);
                                                        Node dVencNode = dVencList.item(i);
                                                        Node vDupNode = vDupList.item(i);

                                                        if (nDupNode.getNodeType() == Node.ELEMENT_NODE &&
                                                                        dVencNode.getNodeType() == Node.ELEMENT_NODE &&
                                                                        vDupNode.getNodeType() == Node.ELEMENT_NODE) {
                                                                Element nDupElement = (Element) nDupNode;
                                                                Element dVencElement = (Element) dVencNode;
                                                                Element vDupElement = (Element) vDupNode;

                                                                numerosParcelas[i] = nDupElement.getTextContent();
                                                                datasVencimento[i] = dVencElement.getTextContent();
                                                                valoresParcelas[i] = Double.parseDouble(
                                                                                vDupElement.getTextContent());
                                                        }
                                                }

                                                // Exibir os valores das tags
                                                String nDup = nDupList.item(0).getTextContent();
                                                String dVenc = dVencList.item(0).getTextContent();
                                                String vDup = vDupList.item(0).getTextContent();
                                                String xFant = xFantList.item(0).getTextContent();
                                                String cnpj = cnpjList.item(0).getTextContent();

                                                String xBairro = xBairroList.item(0).getTextContent();

                                                // Criar uma variável para armazenar o valor total
                                                double valorTotal = 0.0;

                                                // Percorrer os nós e calcular o valor total
                                                for (int i = 0; i < numParcelas; i++) {
                                                        Node vDupNode = vDupList.item(i);

                                                        if (vDupNode.getNodeType() == Node.ELEMENT_NODE) {
                                                                Element vDupElement = (Element) vDupNode;
                                                                double valorParcela = Double.parseDouble(
                                                                                vDupElement.getTextContent());

                                                                valorTotal += valorParcela;
                                                        }
                                                }

                                                // Exibindo os valores lidos
                                                chaveAcessoJTextField.setText(chaveAcessoNumericaBigInt.toString());
                                                dataCadastroJFormattedTextField.setText(dataFormatada);
                                                valorTotalJTextField.setText(String.valueOf(valorTotal));

                                                String cnpjBD = "";

                                                try (Connection conn = DriverManager.getConnection(URL, USER,
                                                                PASSWORD)) {
                                                        String sql = "SELECT CNPJ FROM Fornecedor";
                                                        Statement stmt = conn.createStatement();
                                                        ResultSet rs = stmt.executeQuery(sql);

                                                        if (rs.next()) {
                                                                cnpjBD = rs.getString("CNPJ"); // Atribuição do valor do
                                                                                               // CNPJ à variável cnpjBD
                                                        }
                                                } catch (SQLException e) {
                                                        e.printStackTrace();
                                                }

                                                // Removendo caracteres especiais do CNPJ do banco de dados
                                                String cnpjBDSemCaracteres = cnpjBD.replaceAll("[^0-9]", "");

                                                // Verificar se o CNPJ da XML não está presente no banco de dados
                                                if (!cnpjBDSemCaracteres.equals(cnpj)) {
                                                        // CNPJ da XML não está presente no banco de dados
                                                        // Abra o JFrame CadastroFornecedor aqui
                                                        CadastroFornecedor cadastroFornecedor = new CadastroFornecedor(
                                                                        xFant, xBairro, selectedFile.getAbsolutePath());
                                                        cadastroFornecedor.setVisible(true);
                                                } else {
                                                        try {
                                                                // Estabelece a conexão com o banco de dados
                                                                Connection connection = DriverManager.getConnection(URL,
                                                                                USER, PASSWORD);

                                                                // Prepara a instrução SQL para inserção dos dados
                                                                String sql = "INSERT INTO NFe (chave_acesso, valor_total, data_cadastro) VALUES (?, ?, ?)";
                                                                PreparedStatement statement = connection
                                                                                .prepareStatement(sql);

                                                                // Define os valores para os parâmetros
                                                                statement.setString(1,
                                                                                chaveAcessoNumericaBigInt.toString());
                                                                statement.setDouble(2, valorTotal);
                                                                statement.setDate(3,
                                                                                new java.sql.Date(dataAtual.getTime()));
                                                                // Mostra o Fornecedor no campo
                                                                String nomeFantasia = obterNomeFantasiaPorCNPJ(cnpj);

                                                                // Executa a instrução SQL de inserção
                                                                statement.executeUpdate();

                                                                // Fecha a conexão e o statement
                                                                statement.close();
                                                                connection.close();
                                                        } catch (SQLException e) {
                                                                e.printStackTrace();
                                                                // Trate a exceção conforme necessário
                                                        }
                                                }

                                                // Exibir o caminho no JTextField
                                                caminhoXMLJTextField.setText(selectedFile.getAbsolutePath());
                                        } else {
                                                // Tratar o caso em que o elemento infNFe não foi encontrado
                                                System.out.println("Chave de Acesso não encontrada.");
                                        }
                                }
                        } catch (Exception ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,
                                                "Erro ao processar o arquivo XML: " + ex.getMessage(),
                                                "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                }

        }

        public static String obterNomeFantasiaPorCNPJ(String cnpj) {
                String nomeFantasia = null;

                try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                        String sql = "SELECT nome_fantasia FROM Fornecedor WHERE CNPJ = ?";
                        PreparedStatement stmt = conn.prepareStatement(sql);
                        stmt.setString(1, cnpj);

                        ResultSet rs = stmt.executeQuery();

                        if (rs.next()) {
                                nomeFantasia = rs.getString("nome_fantasia");
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }

                return nomeFantasia;
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
