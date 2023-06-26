package SCP;

import com.formdev.flatlaf.*;

public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                // Configuração do tema para a TelaLogin e Menu
                //FlatDarkLaf.setup();

                TelaLogin telaLogin = new TelaLogin();
                
                // Exiba as telas
                telaLogin.setVisible(true);
            }
        });
    }
}