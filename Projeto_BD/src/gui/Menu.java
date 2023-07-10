package gui;

import com.formdev.flatlaf.*;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        
        // Configura a janela para tela cheia
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Define o ícone da janela
        setIconImage(new ImageIcon("src/resources/icons/Icon.32.ico").getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundMenuJPanel = new javax.swing.JPanel();
        backgroundLogoJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        sistemaJMenu = new javax.swing.JMenu();
        importarJMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pesquisaJMenu = new javax.swing.JMenuItem();
        configJMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        notificaçãoJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Pagamentos");
        setExtendedState(6);

        backgroundMenuJPanel.setBackground(new java.awt.Color(22, 22, 22));

        backgroundLogoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logos/Background Logo.png"))); // NOI18N
        backgroundLogoJLabel.setText("jLabel1");

        javax.swing.GroupLayout backgroundMenuJPanelLayout = new javax.swing.GroupLayout(backgroundMenuJPanel);
        backgroundMenuJPanel.setLayout(backgroundMenuJPanelLayout);
        backgroundMenuJPanelLayout.setHorizontalGroup(
            backgroundMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundMenuJPanelLayout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addComponent(backgroundLogoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        backgroundMenuJPanelLayout.setVerticalGroup(
            backgroundMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundMenuJPanelLayout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(backgroundLogoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        sistemaJMenu.setText("Sistema");

        importarJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        importarJMenu.setText("Cadastrar Duplicatas");
        importarJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(importarJMenu);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Cadastrar Fornecedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        sistemaJMenu.add(jMenuItem2);

        pesquisaJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        pesquisaJMenu.setText("Pesquisar Contas");
        pesquisaJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(pesquisaJMenu);

        jMenuBar1.add(sistemaJMenu);

        configJMenu.setText("Configurações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Alterar Senha");
        configJMenu.add(jMenuItem1);

        notificaçãoJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        notificaçãoJMenuItem.setText("Notificações");
        notificaçãoJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificaçãoJMenuItemActionPerformed(evt);
            }
        });
        configJMenu.add(notificaçãoJMenuItem);

        jMenuBar1.add(configJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMenuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMenuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void importarJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarJMenuActionPerformed
        MenuImportar mi = new MenuImportar();
        mi.setVisible(true);
    }//GEN-LAST:event_importarJMenuActionPerformed

    private void pesquisaJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaJMenuActionPerformed
        Pesquisa search = new Pesquisa();
        search.setVisible(true);
    }//GEN-LAST:event_pesquisaJMenuActionPerformed

    private void notificaçãoJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificaçãoJMenuItemActionPerformed
        ConfigNotificacoes email = new ConfigNotificacoes();
        email.setVisible(true);
    }//GEN-LAST:event_notificaçãoJMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroFornecedor cadFornecedor = new CadastroFornecedor();
        cadFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
   
public static void main(String[] args) {
    try {
        FlatDarkLaf.setup();
        UIManager.put("flatlaf.menuBarEmbedded", true);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);    
            }
        });
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLogoJLabel;
    private javax.swing.JPanel backgroundMenuJPanel;
    private javax.swing.JMenu configJMenu;
    private javax.swing.JMenuItem importarJMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem notificaçãoJMenuItem;
    private javax.swing.JMenuItem pesquisaJMenu;
    private javax.swing.JMenu sistemaJMenu;
    // End of variables declaration//GEN-END:variables
}
