package html;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//jsoup���̺귯�� �̿�
public class HTMLTest01 {
	public static void main(String[] args) {
		//1. ���ϴ� ������ �ִ� HTML�������� �����ϱ�
		//	=> �����ؼ� �ش� �������� ��� response�ؼ� Document��ü�� ��ȯ�ϱ�
		try {
			Document document = Jsoup.connect("https://finance.naver.com/sise/sise_rise.naver").get();
			
			if(document!=null) {
				//3. ���ϴ� ������Ʈ�� �޾ƿ���
				// Elements�� ���� ���� ������Ʈ�� �޾ƿ���
				// Element�� �� ���� ������Ʈ - node�� ����
				// => table�±� �߿��� class�Ӽ��� type_2�� ������Ʈ�� tbody�±� ������ ��� tr�� ��������
				Elements elements = document.select("table[class='type_2']>tbody>tr");
				System.out.println(elements.size());
				int size = elements.size();
				for(int i=0;i<size;i++) {
					Element tag = elements.get(i);
					System.out.println(tag.text());
				}
			}
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}