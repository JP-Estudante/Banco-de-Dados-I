package SCP;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                    | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }

            // Cria e exibe a instância da classe Pesquisa
            Pesquisa pesquisa = new Pesquisa();
            pesquisa.setVisible(true);
        });
    }
}

/*public class Main {
    public static void main(String[] args) {
        // Cria uma instância da tela de login
        TelaLogin telaLogin = new TelaLogin();

        // Define a tela de login como visível
        telaLogin.setVisible(true);
    }
}*/
