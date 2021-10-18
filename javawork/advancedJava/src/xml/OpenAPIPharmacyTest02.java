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

//건강보험심사평가원_약국정보를 파싱하기
//xml파일 -- X
//url을 통해서 접속하고 xml정보를 가져온 후 parser로 원하는 정보를 추출
public class OpenAPIPharmacyTest02 {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			//파싱할 inputstream생성
			//1. 웹서버를 제공하는 url에 연결해서 데이터를 가져오기
			//1) 접속한 url의 정보를 정의
			StringBuffer pharm_url = new StringBuffer();
			pharm_url.append("http://apis.data.go.kr/B551182/pharmacyInfoService/getParmacyBasisList");
			pharm_url.append("?ServiceKey=qKOCJtDk7u9vRM743o9NTAYykvtyaUOFp6nsdUa022CX0nDPl2F04E1%2FekoL0Rd72EjqFvJZy0JJnSPlDNT3uA%3D%3D");
			
			//2) 웹서버에 접속하기
			URL url = new URL(pharm_url.toString());
			
			//3) 접속해서 response되는 데이터를 읽어오기
			//	 읽어온 데이터를 저장 - BufferedInputStream은 InputStream의 하위
			BufferedInputStream xmldata = new BufferedInputStream(url.openStream());
			
			Document document = builder.parse(xmldata);//InputStream객체의 형태로 파생할 정보를 넘겨준다.
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
