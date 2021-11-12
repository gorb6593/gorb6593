package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;


//URLConnection�� �̿��ؼ� ���� �����͸� �ְ� �޴� ���
//������ �����ϴ� �޽�¡���� FCM�� �̿��ؼ� �����͸� �ְ� �޴� ���, ���ۼ��񽺸� ��û�ؼ� ó��
/*
 * URLConnection�� ������ HttpURLConnection�� �̿��ؼ� Ȱ��
 * �ַ�, ���̸� �� �� �ִ� ��Ʈ���� �����͸� �ְ� ���� �� ���
 * http�� URL�� ���� �����͸� ó���ϱ� ���� �ʿ��� �������� �޼ҵ带 �����Ѵ�.
 * �޼ҵ带 �����ؼ� get, post��� ������ �� �ִ�.
 * JSON�����ͳ� ��Ʈ�������� ���� response�ϵ��� ������ �� �ִ�.
 * HttpURLConnection REST API ȣ��
 */
public class HttpURLConnectionTest {
	public static void main(String[] args) throws IOException {
		//String url ="http://192.168.0.7:8088/bigdataERP/board/list.do?category=all";
		//String url ="http://192.168.0.7:8088/bigdataERP/emp/idcheck.do?id=jang";
		String url ="http://192.168.0.7:8088/bigdataERP/board/ajax_list.do?category=all";
		URL urlObj = new URL(url);
		HttpURLConnection con = (HttpURLConnection)urlObj.openConnection();
		//���۹��
		con.setRequestMethod("GET");//�������� ���ҵ� ��������
		int responseCode = con.getResponseCode();
		System.out.println("responseCode:"+responseCode);
		
		Charset charset = Charset.forName("UTF-8");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(),charset));
		String inputline="";
		StringBuffer response = new StringBuffer();
		while((inputline=in.readLine())!=null) {
			response.append(inputline+"\n");
		}
		in.close();
		System.out.println("��ȸ���:");
		System.out.println(response.toString());
	}
}
