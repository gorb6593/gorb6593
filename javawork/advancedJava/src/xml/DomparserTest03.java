package xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



//xml���� ������Ʈ(���,�±�)�� �Ӽ��� ����
public class DomparserTest03 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("src/xml/dept.xml");
			Element root = document.getDocumentElement();
			NodeList deptlist = root.getElementsByTagName("dept");
			//������ dept��带 Ž���ϸ鼭 �Ӽ��� �Ӽ����� ����ϱ�
			for(int i=0;i<deptlist.getLength();i++) {
				Node deptnode = deptlist.item(i);
				System.out.print((i+1)+"�� ���,");
				System.out.print("����:"+deptnode.getNodeName());
				
				//dept������Ʈ�� �Ӽ��� ���� - ���� ����
				//�Ӽ��� �Ӽ���� �Ӽ����� ���� �����ؾ� �ϹǷ� Map����
				//deptnode�� ��� �Ӽ��� ���� - NameNodeMap����
				NamedNodeMap attr_list = deptnode.getAttributes();
				System.out.print(", dept����� �Ӽ� ����=>"+attr_list.getLength());
				for(int j=0;j<attr_list.getLength();j++) {
					Node attribute = attr_list.item(j);
					System.out.print(",�Ӽ���:"+attribute.getNodeName()+"("+attribute.getNodeValue()+")");
				}//�Ӽ��� ���� Ž���Ϸ�
				System.out.println();
			}			
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}catch(org.xml.sax.SAXException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
