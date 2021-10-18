package xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class DomParserTest02 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			//xml������ �ǽ��� �� �ִ� dom parser�� ����
			DocumentBuilder builder = factory.newDocumentBuilder();
			//xml������ �ǽ��ؼ� �ڹٿ��� �� �� �ִ� ��ü�� ����
			Document document = builder.parse("src/xml/dept.xml");
			//1. root������Ʈ ���ϱ�
			Element root = document.getDocumentElement();
			System.out.println("root������Ʈ�� �±׸�=>"+root.getTagName());		
			//2. root������Ʈ���� dept�±׿� �ش��ϴ� ������Ʈ�� �����ϱ�
			NodeList deptlist = root.getElementsByTagName("dept");
			System.out.println("dept����� ����=>"+deptlist.getLength());
			for(int i=0;i<deptlist.getLength();i++) {
				//Nodelist�ȿ��� item�ϳ��� ����
				Node deptnode = deptlist.item(i);
				System.out.println("����:"+deptnode.getNodeName());
				//3. dept����� ���� ��带 ����
				NodeList deptnodeChildlist = deptnode.getChildNodes();
				for(int j=0;j<deptnodeChildlist.getLength();j++) {
					Node deptnoChildNode = deptnodeChildlist.item(j);
					if(!deptnoChildNode.getNodeName().equals("#text")) { //�����尡 �ƴϸ� ���
						System.out.println("dept��������:"+deptnoChildNode.getNodeName());
						System.out.println("dept�����ؽ�Ʈ����:"+deptnoChildNode.getTextContent());						
					}					
				}//dept ���ϵ��� �˻��Ϸ�
				System.out.println("-------------------------------------------------");
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
