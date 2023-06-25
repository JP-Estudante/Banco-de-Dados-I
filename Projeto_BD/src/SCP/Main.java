package SCP;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criação das instâncias das telas JFrame
        TelaLogin telaLogin = new TelaLogin();
        Menu menu = new Menu();
        MenuImportar menuImportar = new MenuImportar();
        Pesquisa pesquisa = new Pesquisa();
        
        // Define a tela de login como visível
        telaLogin.setVisible(true);
        
        definirIcones(telaLogin);
        definirIcones(menu);
        definirIcones(menuImportar);
        definirIcones(pesquisa);
        
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon("C:/Users/joaop/Documents/Codigos Meus/Banco de Dados I/Projeto_BD/src/SCP/resources/x16.ico").getImage());
        icons.add(new ImageIcon("C:/Users/joaop/Documents/Codigos Meus/Banco de Dados I/Projeto_BD/src/SCP/resources/x32.ico").getImage());
        telaLogin.setIconImages(icons);
        
        telaLogin.setVisible(true);
    }
        private static void definirIcones(JFrame frame) {
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon("C:/Users/joaop/Documents/Codigos Meus/Banco de Dados I/Projeto_BD/src/SCP/resources/x16.ico").getImage());
        icons.add(new ImageIcon("C:/Users/joaop/Documents/Codigos Meus/Banco de Dados I/Projeto_BD/src/SCP/resources/x32.ico").getImage());
        frame.setIconImages(icons);
    }
}
