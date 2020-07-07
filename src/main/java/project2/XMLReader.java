package project2;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {

    public static List<String> getTagContent(String expression) throws IOException, XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        File file = new File("src/main/resources/states.xml");
        FileInputStream stream = new FileInputStream(file);
        InputSource source = new InputSource(stream);
        // grab data from XML file using XPath
        // https://blog.scrapinghub.com/2016/10/27/an-introduction-to-xpath-with-examples
        XPathExpression expr = xpath.compile(expression);
        NodeList list = (NodeList) expr.evaluate(source, XPathConstants.NODESET);
        // print out name of each state
        // System.out.println(list.getLength());
        List<String> content = new ArrayList<String>();
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            content.add(node.getTextContent());
        }
        stream.close();
        return content;
    }

}
