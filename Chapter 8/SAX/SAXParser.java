package SAX;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SAXParser {
    public static void main(String[] args) {
        boolean isUrl = false;
        boolean isName = false;
        boolean isPass = false;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = null;
        try {
            reader = factory.createXMLStreamReader(new FileInputStream("src/SAX/config.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("url"))
                        isUrl = true;
                    else if (reader.getLocalName().equals("user"))
                        isName = true;
                    else if (reader.getLocalName().equals("pass"))
                        isPass = true;
                } else if (res == reader.CHARACTERS) {
                    if (isUrl) {
                        System.out.println("Url : " + reader.getText());
                        isUrl = false;
                    } else if (isName) {
                        System.out.println("UserName : " + reader.getText());
                        isName = false;
                    } else if (isPass) {
                        System.out.println("Password : " + reader.getText());
                        isPass = false;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
