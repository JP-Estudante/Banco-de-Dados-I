import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ExtractParcelasNFe {
    public static void main(String[] args) {
        try {
            // Carregar o arquivo XML da NF-e
            File xmlFile = new File("Importar XML\\CALCADOS RAMARIM LTDA.xml");

            // Criar uma instância do DocumentBuilder
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Fazer o parsing do arquivo XML
            Document doc = dBuilder.parse(xmlFile);

            // Normalizar o documento
            doc.getDocumentElement().normalize();

            // Extrair as parcelas
            NodeList parcelasList = doc.getElementsByTagName("dup");
            int quantidadeParcelas = parcelasList.getLength();

            // Imprimir a quantidade de parcelas
            System.out.println("Quantidade de Parcelas: " + quantidadeParcelas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}