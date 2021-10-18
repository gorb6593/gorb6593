package html;

import java.io.IOException;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.jdi.connect.spi.Connection;

//Jsoup���̺귯���� �̿�
public class HTMLParserTest01 {
	public static void main(String[] args) {
		//1. ���ϴ� ������ �ִ� HTML�������� �����ϱ�
		//	 => �����ؼ� �ش� �������� ��� response�ؼ� Document��ü�� �޾ƿ���
		try {
			Connection con = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver");
			Document document = con.get();					
			if(document!=null) {
				//3.���ϴ� ������Ʈ(html�±� ���)�� �޾ƿ���
				//Elements�� ���� ���� ������Ʈ�� �޾ƿ��� - NodeList�� ����
				//Element�� �� ���� ������Ʈ - Node�� ����
				// => table�±� �߿��� class�Ӽ��� type_2�� ������Ʈ�� tbody�±� ������ ��� tr�� ��������
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
