package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdicionarEmail extends javax.swing.JFrame {

    ConfigNotificacoes cNotifi = new ConfigNotificacoes();
        
    public AdicionarEmail() {
        initComponents();

        
        
        gravarJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = adicionarEmailJTextField.getText();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionarEmailJTextField = new javax.swing.JTextField();
        emailJLabel = new javax.swing.JLabel();
        gravarJButton = new javax.swing.JButton();
        sairJButton = new javax.swing.JButton();
        avisoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        emailJLabel.setText("Email:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailJLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(gravarJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sairJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(adicionarEmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(avisoJLabel)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(emailJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adicionarEmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avisoJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarJButton)
                    .addComponent(sairJButton))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void gravarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarJButtonActionPerformed
        String email = adicionarEmailJTextField.getText();
        validarEmail(email);
        ConfigNotificacoes puxar = new ConfigNotificacoes();      
    }//GEN-LAST:event_gravarJButtonActionPerformed

    private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairJButtonActionPerformed
        dispose();
        cNotifi.setDefaultCloseOperation(cNotifi.EXIT_ON_CLOSE);
        System.out.println("Fechada");
    }//GEN-LAST:event_sairJButtonActionPerformed
    
        
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
            salvarEmailNoBanco(email);
            
            return true; // Email válido, retorna true
            
        }
    }
    
     private void salvarEmailNoBanco(String email) {            
            
        Connection connection = null;
        PreparedStatement statement = null;
        

        try {
            // Estabelecer a conexão com o banco de dados
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/paymanage_bd", "postgres",
                    "141171");

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

        // Limpa a mensagem de aviso após adicionar o email com sucesso
        //avisoJLabel.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(AdicionarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarEmail().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adicionarEmailJTextField;
    private javax.swing.JLabel avisoJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JButton gravarJButton;
    private javax.swing.JButton sairJButton;
    // End of variables declaration//GEN-END:variables
}
