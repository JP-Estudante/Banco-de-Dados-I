package SCP;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLReader {

    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\joaop\\Downloads\\Coisas Aula\\CALCADOS RAMARIM LTDA.xml";
        String valorVPag = lerVPag(caminhoArquivo);
        System.out.println("Valor Total: " + valorVPag);
    }

    public static String lerVPag(String caminhoArquivo) {
        try {
            // Cria um DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder().parse(caminhoArquivo);

            // Cria um XPath para executar a consulta
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            // Compila a expressão XPath para localizar o elemento vPag
            XPathExpression expr = xpath.compile("//vPag/text()");

            // Executa a expressão XPath no documento XML
            Node node = (Node) expr.evaluate(document, XPathConstants.NODE);
            
            // Retorna o valor encontrado
            return node.getNodeValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}