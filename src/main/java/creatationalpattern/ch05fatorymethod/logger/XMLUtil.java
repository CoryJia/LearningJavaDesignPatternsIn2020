package creatationalpattern.ch05fatorymethod.logger;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author : Cory Jia on 11/24/19
 */
public class XMLUtil {
    public static Object getBean(int idx) {
            try {

                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document doc = documentBuilder.parse(new File("config.xml"));

                NodeList nl = doc.getElementsByTagName("className");
                Node classNode = nl.item(idx).getFirstChild();
                String className = classNode.getNodeValue().trim();

                Class c = Class.forName(XMLUtil.class.getPackage().toString().split(" ")[1] +"." + className);

                Object obj = c.getDeclaredConstructor().newInstance();

                return obj;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
    }
}
