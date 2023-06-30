package gui;

import com.formdev.flatlaf.FlatDarkLaf;
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
        
        // Define o ícone da janela
        setIconImage(new ImageIcon("src/resources/icons/Icon.32.ico").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userIcon = new javax.swing.JLabel();
        usuarioJField = new javax.swing.JTextField();
        passwordIcon = new javax.swing.JLabel();
        senhaJField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setResizable(false);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/userIcon.png"))); // NOI18N

        usuarioJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioJFieldActionPerformed(evt);
            }
        });

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/passwordIcon.png"))); // NOI18N

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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioJField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaJField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIcon)
                    .addComponent(usuarioJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordIcon)
                    .addComponent(senhaJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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

        FlatDarkLaf.setup();
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
