package xml;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//�ǰ�����ɻ��򰡿�_�౹������ �Ľ��ϱ�
//xml���� -- X
//url�� ���ؼ� �����ϰ� xml������ ������ �� parser�� ���ϴ� ������ ����
public class OpenAPIPharmacyTest02 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//�Ľ��� inputstream����
			//1. �������� �����ϴ� url�� �����ؼ� �����͸� ��������
			//1) ������ url�� ������ ����
			StringBuffer pharm_url = new StringBuffer();
			pharm_url.append("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList");
			pharm_url.append("?ServiceKey=qKOCJtDk7u9vRM743o9NTAYykvtyaUOFp6nsdUa022CX0nDPl2F04E1%2FekoL0Rd72EjqFvJZy0JJnSPlDNT3uA%3D%3D");
			
			//2) �������� �����ϱ�
			URL url = new URL(pharm_url.toString());
			
			//3) �����ؼ� response�Ǵ� �����͸� �о����
			//	 �о�� �����͸� ���� - BufferedInputStream�� InputStream�� ����
			BufferedInputStream xmldata = new BufferedInputStream(url.openStream());
			
			Document document = builder.parse(xmldata);//InputStream��ü�� ���·� �Ļ��� ������ �Ѱ��ش�.
			Element root = document.getDocumentElement();
			System.out.println(root.getTagName());
			NodeList list = root.getElementsByTagName("item");
			System.out.println(list.getLength());
			for(int i=0;i<list.getLength();i++) {
				Node node = list.item(i);
				NodeList item_childlist = node.getChildNodes();
				for(int j=0;j<item_childlist.getLength();j++) {
					Node item_child = item_childlist.item(j);
					System.out.println(item_child.getNodeName()+":"+item_child.getTextContent());
					
				}
				System.out.println();
			}
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (SAXException e) {		
			e.printStackTrace();
		}
	}
}
