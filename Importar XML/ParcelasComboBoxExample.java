import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParcelasComboBoxExample extends JFrame {

    private JComboBox<String> parcelasComboBox;

    public ParcelasComboBoxExample() {
        setTitle("Parcelas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        parcelasComboBox = new JComboBox<>();
        parcelasComboBox.setPreferredSize(new Dimension(200, 30));

        JButton importButton = new JButton("Importar XML");
        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para importar o XML e obter as datas de vencimento das parcelas
                List<String> parcelas = importarParcelasDoXML();
                atualizarParcelasComboBox(parcelas);
            }
        });

        JPanel panel = new JPanel();
        panel.add(importButton);
        panel.add(parcelasComboBox);

        getContentPane().add(panel);
    }

    private List<String> importarParcelasDoXML() {
        // Lógica para importar o XML e obter as datas de vencimento das parcelas
        // Aqui você deve implementar o código para ler o XML e extrair as datas de vencimento das parcelas
        // Neste exemplo, usarei dados fictícios para simular as datas das parcelas

        List<String> parcelas = new ArrayList<>();
        parcelas.add("10/06/2023");
        parcelas.add("10/07/2023");
        parcelas.add("10/08/2023");
        parcelas.add("10/09/2023");
        parcelas.add("10/10/2023");
        parcelas.add("10/11/2023");
        parcelas.add("10/12/2023");


        10/06/2023
        10/07/2023
        10/08/2023
        10/09/2023
        10/10/2023
        10/11/2023
        10/12/2023
        return parcelas;
    }

    private void atualizarParcelasComboBox(List<String> parcelas) {
        parcelasComboBox.removeAllItems();

        // Se o XML tiver mais de 6 parcelas, exibe apenas as próximas 6 parcelas
        int numParcelasExibidas = Math.min(parcelas.size(), 6);

        for (int i = 0; i < numParcelasExibidas; i++) {
            parcelasComboBox.addItem(parcelas.get(i));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ParcelasComboBoxExample().setVisible(true);
            }
        });
    }
}
