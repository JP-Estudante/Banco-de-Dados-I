package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import main.Configuracao;

public class ConfigNotificacoes extends javax.swing.JFrame {
    List<Configuracao> listaDeConfiguracoes = new ArrayList<>();
    
    public ConfigNotificacoes() {
        initComponents();
        obterConfiguracoesDoBanco();
        preencherTabelaEmails();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        emailJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        adicionarEmailJTextField = new javax.swing.JTextField();
        gravarJButton = new javax.swing.JButton();
        avisoJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        excluirEmailJButton = new javax.swing.JButton();
        okJToggle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações de email");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                fechaEsc(evt);
            }
        });

        emailJTable.setBackground(new java.awt.Color(25, 25, 25));
        emailJTable.setForeground(new java.awt.Color(255, 255, 255));
        emailJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emailJTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Email"));

        adicionarEmailJTextField.setBackground(new java.awt.Color(25, 25, 25));

        gravarJButton.setBackground(new java.awt.Color(25, 25, 25));
        gravarJButton.setText("Gravar");
        gravarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionarEmailJTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(gravarJButton)
                        .addGap(18, 18, 18)
                        .addComponent(avisoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarEmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gravarJButton)
                    .addComponent(avisoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        excluirEmailJButton.setBackground(new java.awt.Color(25, 25, 25));
        excluirEmailJButton.setText("Excluir Email");
        excluirEmailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirEmailJButtonActionPerformed(evt);
            }
        });

        okJToggle.setBackground(new java.awt.Color(25, 25, 25));
        okJToggle.setText("OK");
        okJToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(okJToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluirEmailJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okJToggle, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(excluirEmailJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void obterConfiguracoesDoBanco() {
        // Estabelecer a conexão com o banco de dados (substitua com suas próprias
        // informações de conexão)
        String url = "jdbc:postgresql://localhost:5432/paymanage_bd";
        String user = "postgres";
        String password = "141171";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Criar a consulta SQL para obter os dados da tabela Configuracao
            String query = "SELECT codigo, email_alerta FROM Configuracao";

            // Executar a consulta SQL e obter o resultado
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {

                // Limpar a lista de configurações
                listaDeConfiguracoes.clear();

                // Percorrer o resultado e adicionar cada linha à listaDeConfiguracoes
                while (resultSet.next()) {
                    int codigo = resultSet.getInt("codigo");
                    String emailAlerta = resultSet.getString("email_alerta");
                    Configuracao configuracao = new Configuracao(codigo, emailAlerta);
                    listaDeConfiguracoes.add(configuracao);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void preencherTabelaEmails() {
        // Crie um objeto DefaultTableModel para manipular os dados da tabela
        DefaultTableModel model = (DefaultTableModel) emailJTable.getModel();
        model.setRowCount(0); // Limpa os dados existentes na tabela
        
        // Percorra os emails cadastrados e adicione-os ao modelo da tabela
        for (Configuracao configuracao : listaDeConfiguracoes) {
            Object[] rowData = { configuracao.getCodigo(), configuracao.getEmailAlerta() };
            model.addRow(rowData);
        }
    }
    
    public void atualizarTabelaEmails() {
        obterConfiguracoesDoBanco();
        preencherTabelaEmails();
    }
    
    private void salvarEmailNoBanco(DefaultTableModel model, String email) {                     
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Estabelecer a conexão com o banco de dados
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/paymanage_bd", "postgres", "141171");

            // Define a consulta SQL para inserir o Email
            String SQL = "INSERT INTO Configuracao (email_alerta) VALUES (?)";

            // Prepara a declaração com a consulta SQL
            statement = connection.prepareStatement(SQL);

            // Define o valor do parâmetro na consulta
            statement.setString(1, email);

            // Executa a consulta
            statement.executeUpdate();

            // Exibe uma mensagem de sucesso
            System.out.println("Email adicionado");

            // Atualiza a tabela em execução
            model.fireTableDataChanged();
        } catch (SQLException ex) {
            // Trata os erros de conexão com o banco de dados
            ex.printStackTrace();
        } finally {
            // Fecha os recursos (statement, connection) em caso de sucesso ou erro
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    private void excluirEmailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirEmailJButtonActionPerformed
    int selectedRow = emailJTable.getSelectedRow();
        
    //Verifica se a linha já foi selecionada
    if (selectedRow >= 0) {
        int codigo = (int) emailJTable.getValueAt(selectedRow, 0);

        // Estabelecer a conexão com o banco de dados
        String url = "jdbc:postgresql://localhost:5432/paymanage_bd";
        String user = "postgres";
        String password = "141171";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Criar a consulta SQL para obter os dados da tabela Configuracao
            String query = "DELETE FROM Configuracao WHERE codigo=" + codigo + ";";

            // Executar a consulta SQL e obter o resultado
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(query);

                // Remover a linha do modelo da tabela
                DefaultTableModel model = (DefaultTableModel) emailJTable.getModel();
                model.removeRow(selectedRow);

                // Exibe uma mensagem de sucesso
                System.out.println("Email excluido");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Notificar a tabela sobre as alterações no modelo
            DefaultTableModel model = (DefaultTableModel) emailJTable.getModel();
            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_excluirEmailJButtonActionPerformed
    
    private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButtonActionPerformed
        String email = adicionarEmailJTextField.getText();
        if (validarEmail(email)) {
            // Obtenha o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) emailJTable.getModel();

            // Chame o método salvarEmailNoBanco passando o modelo como argumento
            salvarEmailNoBanco(model, email);
            
            
            // Chame o método para atualizar a tabela de emails
            preencherTabelaEmails();
        }
    }//GEN-LAST:event_gravarJButtonActionPerformed
    
    private boolean validarEmail(String email){
        if(email.isEmpty()){
            avisoJLabel.setText("Campo em branco");
            avisoJLabel.setForeground(Color.RED);

            return false; // Email em branco, retorna false
        } else{
            // Exibe uma mensagem de sucesso abaixo do JTextField
            avisoJLabel.setText("Email adicionado!");
            avisoJLabel.setForeground(Color.GREEN);
            adicionarEmailJTextField.setText("");

            return true; // Email válido, retorna true       
        }
    }

    private void fechaEsc(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_fechaEsc
        controlaEsc();
    }

    private void okJToggleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okJToggleActionPerformed
        dispose();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigNotificacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adicionarEmailJTextField;
    private javax.swing.JLabel avisoJLabel;
    private javax.swing.JTable emailJTable;
    private javax.swing.JButton excluirEmailJButton;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okJToggle;
    // End of variables declaration//GEN-END:variables
}
