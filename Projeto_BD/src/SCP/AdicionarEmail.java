package SCP;

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AdicionarEmail extends javax.swing.JFrame {

    public AdicionarEmail() {
        initComponents();

        gravarJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = adicionarEmailJTextField.getText();
                salvarEmailNoBanco(email);
            }
        });

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

        adicionarEmailJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        gravarJButton = new javax.swing.JButton();
        sairJButton = new javax.swing.JButton();
        avisoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar email");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("Email:");

        gravarJButton.setText("Gravar");
        gravarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarJButtonActionPerformed(evt);
            }
        });

        sairJButton.setText("Sair");
        sairJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoJLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(gravarJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sairJButton))
                        .addComponent(adicionarEmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adicionarEmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avisoJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarJButton)
                    .addComponent(sairJButton))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButtonActionPerformed
        // Verifica se o campo de email está em branco
        if (adicionarEmailJTextField.getText().isEmpty()) {
            avisoJLabel.setText("Por favor, insira um email.");
            return; // Retorna sem gravar no banco
        }

        String email = adicionarEmailJTextField.getText();
        salvarEmailNoBanco(email);
    }//GEN-LAST:event_gravarJButtonActionPerformed

    private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairJButtonActionPerformed
        dispose(); //Fecha a janela
    }//GEN-LAST:event_sairJButtonActionPerformed

    private void salvarEmailNoBanco(String email) {
        // Verifica se o email está em branco
        if (email.isEmpty()) {
            avisoJLabel.setText("Por favor, insira um email.");
            avisoJLabel.setForeground(Color.RED);
            return; // Retorna sem gravar no banco
        }
        
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Estabelecer a conexção com o banco de dados
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/paymanage_bd", "postgres",
                    "141171");

            // Define a consulta SQL para inserir o Email
            String SQL = "INSERT INTO Configuracao (email_alerta) VALUES (?)";

            // Preparar a declaração com a consulta SQL
            statement = connection.prepareStatement(SQL);

            // Define o valor do paramentro na consulta
            statement.setString(1, email);

            // Executa a consulta
            statement.executeUpdate();

            // Exibe uma mensagem de sucesso abaixo do JTextField
            avisoJLabel.setText("Email adicionado!");
            avisoJLabel.setForeground(Color.GREEN);
            adicionarEmailJTextField.setText("");
            
            // Exibe uma mensagem de sucesso
            System.out.println("Email adicionado");
        } catch (SQLException ex) {
            // Trata os erros de conexção com o banco de dados
            ex.printStackTrace();

        } finally {

            // Fecha os recursos (statemment connection) em caso de sucesso ou erro
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adicionarEmailJTextField;
    private javax.swing.JLabel avisoJLabel;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sairJButton;
    // End of variables declaration//GEN-END:variables
}
