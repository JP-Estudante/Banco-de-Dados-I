package SCP;

import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();

        // Configura a janela para tela cheia
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Define o ícone da janela
        setIconImage(new ImageIcon(
                "C:\\Users\\joaop\\Documents\\Codigos Meus\\Banco de Dados I\\Projeto_BD\\src\\SCP\\resources\\x32.ico")
                .getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        sistemaJMenu = new javax.swing.JMenu();
        importarJMenu = new javax.swing.JMenuItem();
        contasJMenu = new javax.swing.JMenuItem();
        pesquisaJMenu = new javax.swing.JMenuItem();
        configJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(25, 72, 219));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/SCP/resources/Captura_de_tela_2023-06-24_204210-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        sistemaJMenu.setText("Sistema");

        importarJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        importarJMenu.setText("Importar");
        importarJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarJMenuActionPerformed(evt);
            }
        });
        sistemaJMenu.add(importarJMenu);

        contasJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contasJMenu.setText("Contas a pagar ");
        sistemaJMenu.add(contasJMenu);

        pesquisaJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(378, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(329, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)));

        pack();
    }// </editor-fold>

    private void importarJMenuActionPerformed(java.awt.event.ActionEvent evt) {
        MenuImportar mi = new MenuImportar();
        mi.setVisible(true);
    }

    private void pesquisaJMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Pesquisa search = new Pesquisa();
        search.setVisible(true);
    }

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

    // Variables declaration - do not modify
    private javax.swing.JMenu configJMenu;
    private javax.swing.JMenuItem contasJMenu;
    private javax.swing.JMenuItem importarJMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pesquisaJMenu;
    private javax.swing.JMenu sistemaJMenu;
    // End of variables declaration
}
