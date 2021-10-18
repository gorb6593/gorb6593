package xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserTest01 {
	public static void main(String[] args) {
		//parser�� ������ִ� Factory��ü�� ����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			//xml������ �Ľ��� �� �ִ� dom parser�� ����
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml������ �Ľ��ؼ� �ڹٿ��� �� �� �ִ� ��ü�� �������ش�.
			Document document = builder.parse("src/xml/dept.xml");
			System.out.println(document.toString());
			Element root = document.getDocumentElement();
			System.out.println(root);
			System.out.println(root.getTagName());
			System.out.println(root.getFirstChild());
			System.out.println(root.getLastChild());
			NodeList list = root.getChildNodes();
			System.out.println("deptlist�� child����=>"+list.getLength());
			for(int i=0;i<list.getLength();i++) {
				Node node = list.item(i);
				System.out.println("����� �̸�:"+node.getNodeName());
			}
		} catch (ParserConfigurationException e) {			
			e.printStackTrace();
		} catch (SAXException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
