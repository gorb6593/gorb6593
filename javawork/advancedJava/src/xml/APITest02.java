package xml;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

//����Ư���� ���ʱ�_������
//url�� ���ؼ� �����ϰ� xml������ ������ �� parser�� ���ϴ� ������ ����
public class APITest02 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//�Ľ��� InputStream����
			//1. �������� �����ϴ� url�� �����ؼ� �����͸� ��������
			//1) ������ url�� ������ ����
			StringBuffer restuarant_url = new StringBuffer();
			restuarant_url.append("https://api.odcloud.kr/api/3053840/v1/uddi:9cb85e53-3592-4a8d-9b07-eec77edbc8c2?page=1&perPage=10");
			restuarant_url.append("?serviceKey=qKOCJtDk7u9vRM743o9NTAYykvtyaUOFp6nsdUa022CX0nDPl2F04E1%2FekoL0Rd72EjqFvJZy0JJnSPlDNT3uA%3D%3D");
			
			//2) �������� �����ϱ�
			URL url = new URL(restuarant_url.toString());
			
			//3) �����ؼ� response�Ǵ� �����͸� �о����
			//	 �о�� �����͸� ���� = BufferedInputStream�� InputStream�� ����
			BufferedInputStream xmldata = new BufferedInputStream(url.openStream());
						
			Document document = builder.parse(xmldata);//InputStream��ü�� ���·� �Ľ��� ������ �Ѱ��ش�.
			Element root = document.getDocumentElement();
			System.out.println();
			
		}catch (ParserConfigurationException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
}