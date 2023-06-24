package SCP;

import java.awt.event.*;
import javax.swing.*;

public class TelaLogin extends javax.swing.JFrame {

    private javax.swing.JButton loginButton;

    // Defina o usuário e a senha corretos como constantes
    private static final String USUARIO_CORRETO = "1";
    private static final String SENHA_CORRETA = "";

    public TelaLogin() {
        initComponents();
        entradaUsuarioSenha();
        usuarioTeclaEnter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userIcon = new javax.swing.JLabel();
        usuarioJField = new javax.swing.JTextField();
        passwordIcon = new javax.swing.JLabel();
        senhaJField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/userIcon.png"))); // NOI18N

        usuarioJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioJFieldActionPerformed(evt);
            }
        });

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/passwordIcon.png"))); // NOI18N

        senhaJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaJFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(userIcon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usuarioJField, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(passwordIcon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(senhaJField, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(89, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userIcon)
                                        .addComponent(usuarioJField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordIcon)
                                        .addComponent(senhaJField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(116, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTeclaEnter() {
        usuarioJField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    senhaJField.requestFocus(); // Move o foco para o campo de senha
                }
            }
        });
    }

    // Método para inserir usuario e senha com enter
    private void entradaUsuarioSenha() {
        senhaJField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String usuarioInserido = usuarioJField.getText();
                    String senhaInserida = new String(senhaJField.getPassword());

                    // Verifica se o usuário e a senha inseridos estão corretos
                    if (usuarioInserido.equals(USUARIO_CORRETO) && senhaInserida.equals(SENHA_CORRETA))
                        exibirMenuPrincipal();
                    else
                        JOptionPane.showMessageDialog(TelaLogin.this, "Senha ou Usuario não coincidem", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    
                    // Limpa os campos de usuário e senha
                    usuarioJField.setText("");
                    senhaJField.setText("");

                    // Retorna o foco para o campo de usuário
                    usuarioJField.requestFocus();
                }
            }
        });
    }

    private void usuarioJFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usuarioJFieldActionPerformed

    }// GEN-LAST:event_usuarioJFieldActionPerformed

    private void senhaJFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_senhaJFieldActionPerformed

    }// GEN-LAST:event_senhaJFieldActionPerformed

    private void exibirMenuPrincipal() {
        Menu menu = new Menu();
        menu.setVisible(true);

        // Fecha a tela de login
        dispose();
    }

    public static void main(String args[]) {

        Menu menu = new Menu();
        menu.setVisible(true);

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPasswordField senhaJField;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usuarioJField;
    // End of variables declaration//GEN-END:variables
}
