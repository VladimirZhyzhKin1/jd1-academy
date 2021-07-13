package Dom;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOCParser {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File f = new File("src/Dom/point.xml");

        try {
            doc = builder.parse(f);
            Element root = doc.getDocumentElement();
            System.out.println(root.getTagName());
            NodeList nList = root.getChildNodes();
            for (int i = 0; i < nList.getLength(); i++) {
                if (nList.item(i) instanceof Element) {
                    System.out.println("tagName : " + nList.item(i).getNodeName());
                    System.out.println("tagValue : " + nList.item(i).getTextContent());
                }
                NamedNodeMap attributes = nList.item(i).getAttributes();
                if (attributes != null && attributes.getLength() > 0) {
                    for (int j = 0; j < attributes.getLength(); j++) {
                        System.out.println("attributesName : " + attributes.item(j).getNodeName());
                        System.out.println("attributesValue : " + attributes.item(j).getTextContent());
                    }
                }
                System.out.println();
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
