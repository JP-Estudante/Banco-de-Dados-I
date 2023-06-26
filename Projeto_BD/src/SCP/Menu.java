package SCP;

import com.formdev.flatlaf.*;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();

        // Configura a janela para tela cheia
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Define o ícone da janela
        setIconImage(new ImageIcon("src/SCP/resources/Icon.32.ico").getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLogoJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        sistemaJMenu = new javax.swing.JMenu();
        importarJMenu = new javax.swing.JMenuItem();
        pesquisaJMenu = new javax.swing.JMenuItem();
        configJMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Pagamentos");
        setExtendedState(6);

        backgroundLogoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SCP/resources/Background Logo.png"))); // NOI18N
        backgroundLogoJLabel.setText("jLabel1");

        sistemaJMenu.setText("Sistema");

        importarJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        importarJMenu.setText("Importar");
        importarJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(importarJMenu);

        pesquisaJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pesquisaJMenu.setText("Pesquisar Contas");
        pesquisaJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(pesquisaJMenu);

        jMenuBar1.add(sistemaJMenu);

        configJMenu.setText("Configurações");

        jMenuItem1.setText("Alterar Senha");
        configJMenu.add(jMenuItem1);

        jMenuBar1.add(configJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(backgroundLogoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(backgroundLogoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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
    private javax.swing.JMenu configJMenu;
    private javax.swing.JMenuItem importarJMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem pesquisaJMenu;
    private javax.swing.JMenu sistemaJMenu;
    // End of variables declaration//GEN-END:variables
}
