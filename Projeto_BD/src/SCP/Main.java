package SCP;

import com.formdev.flatlaf.*;

public class Main {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        
        //IntelliJTheme.setup(Main.class.getResourceAsStream("/template.theme.json"));

        // Criação das instâncias das telas JFrame
        TelaLogin telaLogin = new TelaLogin();
        
        // Define a tela de login como visível
        telaLogin.setVisible(true);
        //teste.setVisible(true);
    }
}