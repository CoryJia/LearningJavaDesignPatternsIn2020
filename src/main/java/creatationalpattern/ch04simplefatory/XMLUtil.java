package creatationalpattern.ch04simplefatory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author : Cory Jia on 11/24/19
 */
public class XMLUtil {
    public static String getType(String ConfigFile) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(ConfigFile);

            NodeList nl = doc.getElementsByTagName("type");
            Node classNode = nl.item(0).getFirstChild();
            String type = classNode.getNodeValue().trim();
            return type;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
