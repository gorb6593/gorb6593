package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URLŬ����
//=>���ͳݿ��� Ȯ���� �� �ִ� �ڿ��� ����
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://news.v.daum.net/v/20211110113006499");
			//URL url = new URL("https://www.kisa.or.kr/public/laws/laws3_View.jsp?cPage=6&mode=view&p_No=259&b_No=259&d_No=66&ST=T&SV=");
			System.out.println(url.toString());
			System.out.println("url.getHost()==>"+url.getHost());
			System.out.println("url.getPath()==>"+url.getPath());
			/*
			  Port�� -1
			  http�� �⺻��Ʈ�� �����ߴٴ� �ǹ�
			  �⺻��Ʈ : 80
			  �츮�� �����ϱ� ���� ����� url�� ���� �⺻ ��Ʈ�� ����ϰ� �ִٴ� �ǹ� 
			 */
						
			System.out.println("url.getPort()==>"+url.getPort());
			System.out.println("url.getProtocol()==>"+url.getProtocol());
			System.out.println("url.getFile()==>"+url.getFile());
			//������ url���� �ڿ��� �о����
			//�ٵ� ������.
			//
//			InputStream is = url.openStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while(true) {
				String data_byte = br.readLine();
				if(data_byte==null) {
					break;
				}
				System.out.println(data_byte);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}