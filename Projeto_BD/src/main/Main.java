package main;

import com.formdev.flatlaf.*;

import gui.TelaLogin;

public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                // Configuração do tema para a TelaLogin e Menu
                FlatDarkLaf.setup();

                TelaLogin telaLogin = new TelaLogin();
                
                // Exiba as telas
                telaLogin.setVisible(true);
            }
        });
    }
}