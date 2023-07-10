package gui;

import org.w3c.dom.Document;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.*;
import javax.xml.xpath.*;

import org.w3c.dom.NodeList;

public class CadastroFornecedor extends javax.swing.JFrame {
        private String caminhoXML;
        private boolean dadosCadastrados = false;

        public CadastroFornecedor() {
                initComponents();
        }

        public void setCaminhoXML(String caminhoXML) {
                this.caminhoXML = caminhoXML;
        }

        public CadastroFornecedor(String nomeFantasia, String bairro, String caminhoXML) {
                initComponents();
                try {
                        File xmlFile = new File(caminhoXML);

                        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder builder = factory.newDocumentBuilder();
                        Document document = builder.parse(xmlFile);

                        // Ler as tags do arquivo XML
                        NodeList xMunList = document.getElementsByTagName("xMun");
                        NodeList cMunList = document.getElementsByTagName("cMun");
                        NodeList xFantList = document.getElementsByTagName("xFant");
                        NodeList cnpjList = document.getElementsByTagName("CNPJ");
                        NodeList xNomeList = document.getElementsByTagName("xNome");
                        NodeList xBairroList = document.getElementsByTagName("xBairro");
                        NodeList cUFList = document.getElementsByTagName("cUF");

                        // Exibir os valores das tags
                        String xMun = xMunList.item(0).getTextContent();
                        String cMun = cMunList.item(0).getTextContent();
                        String xFant = xFantList.item(0).getTextContent();
                        String cnpj = cnpjList.item(0).getTextContent();
                        String xNome = xNomeList.item(0).getTextContent();
                        String xBairro = xBairroList.item(0).getTextContent();
                        String cUF = cUFList.item(0).getTextContent();

                        // Preencher os campos com os itens importados
                        fornecedorJTextField.setText(xFant);
                        bairroJTextField.setText(xBairro);
                        municipioJTextField.setText(xMun);
                        codMunicipioJTextField.setText(cMun);
                        cnpjJFormattedTextField.setText(cnpj);
                        razaoSocialJTextField.setText(xNome);
                        cUFJTextField.setText(cUF);

                } catch (Exception ex) {
                        ex.printStackTrace();
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroFornecedorJPanel = new javax.swing.JPanel();
        razaoSocialJLabel = new javax.swing.JLabel();
        fornecedorJLabel = new javax.swing.JLabel();
        fornecedorJTextField = new javax.swing.JTextField();
        razaoSocialJTextField = new javax.swing.JTextField();
        cnpjJLabel = new javax.swing.JLabel();
        cnpjJFormattedTextField = new javax.swing.JFormattedTextField();
        bairroJTextField = new javax.swing.JTextField();
        bairroJLabel = new javax.swing.JLabel();
        municipioJTextField = new javax.swing.JTextField();
        municipioJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codMunicipioJTextField = new javax.swing.JTextField();
        botoesJPanel = new javax.swing.JPanel();
        sairJButton = new javax.swing.JButton();
        gravarJButton = new javax.swing.JButton();
        cUFJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoa");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        cadastroFornecedorJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Fornecedor"));

        razaoSocialJLabel.setText("Razão Social:");

        fornecedorJLabel.setText("Fornecedor:");

        fornecedorJTextField.setBackground(new java.awt.Color(25, 25, 25));

        razaoSocialJTextField.setBackground(new java.awt.Color(25, 25, 25));

        cnpjJLabel.setText("CNPJ:");

        cnpjJFormattedTextField.setBackground(new java.awt.Color(25, 25, 25));
        try {
            cnpjJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bairroJTextField.setBackground(new java.awt.Color(25, 25, 25));

        bairroJLabel.setText("Bairro:");

        municipioJTextField.setBackground(new java.awt.Color(25, 25, 25));

        municipioJLabel.setText("Município:");

        jLabel1.setText("Codigo Mun.:");

        codMunicipioJTextField.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout cadastroFornecedorJPanelLayout = new javax.swing.GroupLayout(cadastroFornecedorJPanel);
        cadastroFornecedorJPanel.setLayout(cadastroFornecedorJPanelLayout);
        cadastroFornecedorJPanelLayout.setHorizontalGroup(
            cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroFornecedorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(municipioJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fornecedorJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(fornecedorJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroJLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroJTextField))
                            .addComponent(municipioJLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(razaoSocialJLabel)
                    .addComponent(razaoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cnpjJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroFornecedorJPanelLayout.createSequentialGroup()
                            .addComponent(cnpjJLabel)
                            .addContainerGap(96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codMunicipioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        cadastroFornecedorJPanelLayout.setVerticalGroup(
            cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorJLabel)
                    .addComponent(razaoSocialJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(razaoSocialJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(cnpjJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroFornecedorJPanelLayout.createSequentialGroup()
                        .addComponent(bairroJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(municipioJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroFornecedorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(codMunicipioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(municipioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        botoesJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sairJButton.setBackground(new java.awt.Color(25, 25, 25));
        sairJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/exitIcon.png"))); // NOI18N
        sairJButton.setText("Sair");
        sairJButton.setToolTipText("");
        sairJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairJButtonActionPerformed(evt);
            }
        });

        gravarJButton.setBackground(new java.awt.Color(25, 25, 25));
        gravarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/gravarIcon(1).png"))); // NOI18N
        gravarJButton.setText("Gravar");
        gravarJButton.setToolTipText("");
        gravarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoesJPanelLayout = new javax.swing.GroupLayout(botoesJPanel);
        botoesJPanel.setLayout(botoesJPanelLayout);
        botoesJPanelLayout.setHorizontalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(sairJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        botoesJPanelLayout.setVerticalGroup(
            botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botoesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gravarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroFornecedorJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(cUFJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(cUFJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cadastroFornecedorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void gravarDadosNoBanco() {
                Connection conn = null;
                PreparedStatement pstmt = null;

                try {
                        String xFant = fornecedorJTextField.getText();
                        String xBairro = bairroJTextField.getText();
                        String xMun = municipioJTextField.getText();
                        String cMun = codMunicipioJTextField.getText();
                        String cnpj = cnpjJFormattedTextField.getText();
                        String xNome = razaoSocialJTextField.getText();
                        String cUF = cUFJTextField.getText();

                        // Estabeleça uma conexão com o banco de dados
                        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/payManage_bd", "postgres",
                                        "141171");

                        // Mapeamento dos códigos cUF do XML com os códigos dos estados
                        Map<String, Integer> ufMap = new HashMap<>();
                        ufMap.put("11", 1); // cUF 11 (RO) corresponde ao código 1 no sistema
                        ufMap.put("12", 2); // cUF 12 (AC) corresponde ao código 2 no sistema
                        ufMap.put("13", 3); // cUF 13 (AM) corresponde ao código 3 no sistema
                        ufMap.put("14", 4); // cUF 14 (RR) corresponde ao código 4 no sistema
                        ufMap.put("15", 5); // cUF 15 (PA) corresponde ao código 5 no sistema
                        ufMap.put("16", 6); // cUF 16 (AP) corresponde ao código 6 no sistema
                        ufMap.put("17", 7); // cUF 17 (TO) corresponde ao código 7 no sistema
                        ufMap.put("21", 8); // cUF 21 (MA) corresponde ao código 8 no sistema
                        ufMap.put("22", 9); // cUF 22 (PI) corresponde ao código 9 no sistema
                        ufMap.put("23", 10); // cUF 23 (CE) corresponde ao código 10 no sistema
                        ufMap.put("24", 11); // cUF 24 (RN) corresponde ao código 11 no sistema
                        ufMap.put("25", 12); // cUF 25 (PB) corresponde ao código 12 no sistema
                        ufMap.put("26", 13); // cUF 26 (PE) corresponde ao código 13 no sistema
                        ufMap.put("27", 14); // cUF 27 (AL) corresponde ao código 14 no sistema
                        ufMap.put("28", 15); // cUF 28 (SE) corresponde ao código 15 no sistema
                        ufMap.put("29", 16); // cUF 29 (BA) corresponde ao código 16 no sistema
                        ufMap.put("31", 17); // cUF 31 (MG) corresponde ao código 17 no sistema
                        ufMap.put("32", 18); // cUF 32 (ES) corresponde ao código 18 no sistema
                        ufMap.put("33", 19); // cUF 33 (RJ) corresponde ao código 19 no sistema
                        ufMap.put("35", 20); // cUF 35 (SP) corresponde ao código 20 no sistema
                        ufMap.put("41", 21); // cUF 41 (PR) corresponde ao código 21 no sistema
                        ufMap.put("42", 22); // cUF 42 (SC) corresponde ao código 22 no sistema
                        ufMap.put("43", 23); // cUF 43 (RS) corresponde ao código 23 no sistema
                        ufMap.put("50", 24); // cUF 50 (MS) corresponde ao código 24 no sistema
                        ufMap.put("51", 25); // cUF 51 (MT) corresponde ao código 25 no sistema
                        ufMap.put("52", 26); // cUF 52 (GO) corresponde ao código 26 no sistema
                        ufMap.put("53", 27); // cUF 53 (DF) corresponde ao código 27 no sistema

                        // Obtém o código do estado correspondente no sistema
                        int codEstado = 0; // Valor inicial padrão
                        for (Map.Entry<String, Integer> entry : ufMap.entrySet()) {
                                if (entry.getKey().equals(cUF)) {
                                        codEstado = entry.getValue();
                                        break;
                                }
                        }

                        // Inserir dados na tabela Fornecedor
                        String sqlFornecedor = "INSERT INTO Fornecedor (nome_fantasia, CNPJ, razao_social) VALUES (?, ?, ?)";
                        pstmt = conn.prepareStatement(sqlFornecedor, Statement.RETURN_GENERATED_KEYS);

                        pstmt.setString(1, xFant);
                        pstmt.setString(2, cnpj);
                        pstmt.setString(3, xNome);
                        pstmt.executeUpdate();

                        // Obter o ID gerado para o fornecedor inserido
                        ResultSet generatedKeys = pstmt.getGeneratedKeys();
                        int codFornecedor = 0;
                        if (generatedKeys.next()) {
                                codFornecedor = generatedKeys.getInt(1);
                        }

                        // Inserir dados na tabela Cidade
                        String sqlCidade = "INSERT INTO Cidade (c_mun, nome_cidade, cod_estado, cod_fornecedor, bairro) VALUES (?, ?, ?, ?, ?)";
                        pstmt = conn.prepareStatement(sqlCidade);
                        pstmt.setString(1, cMun);
                        pstmt.setString(2, xMun);
                        pstmt.setInt(3, codEstado); // Usa o código do estado correspondente obtido do mapa ufMap
                        pstmt.setInt(4, codFornecedor);
                        pstmt.setString(5, xBairro);
                        pstmt.executeUpdate();

                        // Confirme a transação
                        conn.commit();

                        System.out.println("Dados gravados com sucesso!");

                        dadosCadastrados = true;

                } catch (SQLException e) {
                        // Caso ocorra algum erro, faça rollback na transação
                        if (conn != null) {
                                try {
                                        conn.rollback();
                                } catch (SQLException ex) {
                                        System.out.println("Erro ao fazer rollback da transação: " + ex.getMessage());
                                }
                        }
                        System.out.println("Erro ao gravar dados no banco de dados: " + e.getMessage());
                } finally {
                        // Feche o PreparedStatement
                        try {
                                if (pstmt != null) {
                                        pstmt.close();
                                }
                        } catch (SQLException e) {
                                System.out.println("Erro ao fechar o PreparedStatement: " + e.getMessage());
                        }

                        // Feche a conexão
                        try {
                                if (conn != null) {
                                        conn.close();
                                }
                        } catch (SQLException e) {
                                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
                        }
                }
        }

        private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // gravarDadosNoBanco();
                dispose();
        }

        private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
        }

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new CadastroFornecedor().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroJLabel;
    private javax.swing.JTextField bairroJTextField;
    private javax.swing.JPanel botoesJPanel;
    private javax.swing.JTextField cUFJTextField;
    private javax.swing.JPanel cadastroFornecedorJPanel;
    private javax.swing.JFormattedTextField cnpjJFormattedTextField;
    private javax.swing.JLabel cnpjJLabel;
    private javax.swing.JTextField codMunicipioJTextField;
    private javax.swing.JLabel fornecedorJLabel;
    private javax.swing.JTextField fornecedorJTextField;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel municipioJLabel;
    private javax.swing.JTextField municipioJTextField;
    private javax.swing.JLabel razaoSocialJLabel;
    private javax.swing.JTextField razaoSocialJTextField;
    private javax.swing.JButton sairJButton;
    // End of variables declaration//GEN-END:variables
}
