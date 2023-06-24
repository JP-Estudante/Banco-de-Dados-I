package SCP;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        sistemaJMenu = new javax.swing.JMenu();
        importarJMenu = new javax.swing.JMenuItem();
        contasJMenu = new javax.swing.JMenuItem();
        pesquisaJMenu = new javax.swing.JMenuItem();
        configJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sistemaJMenu.setText("Sistema");

        importarJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        importarJMenu.setText("Importar");
        importarJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(importarJMenu);

        contasJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contasJMenu.setText("Contas a pagar ");
        sistemaJMenu.add(contasJMenu);

        pesquisaJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pesquisaJMenu.setText("Pesquisa");
        pesquisaJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(pesquisaJMenu);

        jMenuBar1.add(sistemaJMenu);

        configJMenu.setText("Configurações");
        jMenuBar1.add(configJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importarJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarJMenuActionPerformed
        TelaLogin tl = new TelaLogin();
            
        MenuImportar mi = new MenuImportar();
            mi.setVisible(true);
    }//GEN-LAST:event_importarJMenuActionPerformed

    private void pesquisaJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaJMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaJMenuActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu configJMenu;
    private javax.swing.JMenuItem contasJMenu;
    private javax.swing.JMenuItem importarJMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pesquisaJMenu;
    private javax.swing.JMenu sistemaJMenu;
    // End of variables declaration//GEN-END:variables
}
