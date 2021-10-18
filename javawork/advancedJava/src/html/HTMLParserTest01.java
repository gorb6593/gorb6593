package html;

import java.io.IOException;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.jdi.connect.spi.Connection;

//Jsoup라이브러리를 이용
public class HTMLParserTest01 {
	public static void main(String[] args) {
		//1. 원하는 정보가 있는 HTML페이지에 접속하기
		//	 => 접속해서 해당 페이지를 모두 response해서 Document객체로 받아오기
		try {
			Connection con = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver");
			Document document = con.get();					
			if(document!=null) {
				//3.원하는 엘리먼트(html태그 노드)를 받아오기
				//Elements는 여러 개의 엘리먼트를 받아오기 - NodeList와 동일
				//Element는 한 개의 엘리먼트 - Node와 동일
				// => table태그 중에서 class속성이 type_2인 엘리먼트의 tbody태그 하위의 모든 tr을 가져오기
				Elements elements = document.select("table[class='type_2']>tbody>tr");
				System.out.println(elements.size());
				int size = elements.size();
				for(int i=0;i<size;i++) {
					Element tag =elements.get(i);
					System.out.println(tag.text());
				}
			}
			
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
}
