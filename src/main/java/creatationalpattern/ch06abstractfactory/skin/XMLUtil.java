package creatationalpattern.ch06abstractfactory.skin;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author : Cory Jia on 11/25/19
 */
public class XMLUtil {

    public static SkinFactory getBean(String factoryType) {
        Integer idx = FactoryMap.factoryMap.get(factoryType);

        if (idx == null) throw new IllegalArgumentException("No such factory type");

        String packageName = XMLUtil.class.getPackage().toString().split(" ")[1] + ".";
//        System.out.println(packageName);
        String configXMLPath = "src/main/java/creatationalpattern/abstractfactory/skin/chartconfig.xml";
//        System.out.println(configXMLPath);

        try {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File(configXMLPath));

            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(idx).getFirstChild();
            String className = classNode.getNodeValue().trim();

            Class c = Class.forName(packageName + className);

            SkinFactory factory = (SkinFactory) c.getDeclaredConstructor().newInstance();

            return factory;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getAbsolutePath(String path) {
        StringBuilder sb = new StringBuilder();

        for (char c : path.toCharArray()) {
            sb.append(c == '.' ? '/' : c);
        }
        char[] chars = path.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '.'){
                chars[i] = '/';
            }
        }

        sb.append("chartconfig.xml");
        path = sb.toString();
        return path;
    }
}