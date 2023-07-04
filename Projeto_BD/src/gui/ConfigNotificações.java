package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import main.Configuracao;

public class ConfigNotificações extends javax.swing.JFrame {
    List<Configuracao> listaDeConfiguracoes = new ArrayList<>();
    
    public ConfigNotificações() {
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
        excluirEmailJButton = new javax.swing.JButton();
        adicionarEmailJButton = new javax.swing.JButton();
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

        excluirEmailJButton.setText("Excluir Email");
        excluirEmailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirEmailJButtonActionPerformed(evt);
            }
        });

        adicionarEmailJButton.setText("Adicionar Email");
        adicionarEmailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEmailJButtonActionPerformed(evt);
            }
        });

        okJToggle.setText("OK");
        okJToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okJToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarEmailJButton)
                        .addGap(18, 18, 18)
                        .addComponent(excluirEmailJButton)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirEmailJButton)
                    .addComponent(adicionarEmailJButton))
                .addGap(18, 18, 18)
                .addComponent(okJToggle)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirEmailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirEmailJButtonActionPerformed
 int Codigo, num;
num =  emailJTable.getSelectedRow();
Codigo = emailJTable.getSelectedColumn();
// Estabelecer a conexão com o banco de dados (substitua com suas próprias
        // informações de conexão)
        String url = "jdbc:postgresql://localhost:5432/paymanage_bd";
        String user = "postgres";
        String password = "141171";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Criar a consulta SQL para obter os dados da tabela Configuracao
            String query = "DELETE FROM Configuracao WHERE codigo=" + emailJTable.getValueAt(num, 0) + ";";

            // Executar a consulta SQL e obter o resultado
            try (Statement statement = connection.createStatement()){
                statement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_excluirEmailJButtonActionPerformed

    private void adicionarEmailJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adicionarEmailJButtonActionPerformed
        AdicionarEmail addEmail = new AdicionarEmail();
        addEmail.setVisible(true);
    }

    private void fechaEsc(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_fechaEsc
        controlaEsc();
    }

    private void okJToggleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okJToggleActionPerformed
        dispose();
    }

   

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigNotificações().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarEmailJButton;
    private javax.swing.JTable emailJTable;
    private javax.swing.JButton excluirEmailJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okJToggle;
    // End of variables declaration//GEN-END:variables
}
