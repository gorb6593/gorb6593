package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//������ Ŭ���̾�Ʈ�� Ű����� ���
public class MyEchoServer03 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;//Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ��
		BufferedReader Keyin = null;//Ű����� �Է��ϴ� �޽����� �б� ���� ��Ʈ��
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�������ӿϷ�!");
			while(true) {
				client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("������ �����Ǵ�"+clientIp.getHostAddress()+"�Դϴ�.");
				//��Ʈ��ũ�� ���ؼ� ����� �ϱ� ���� IO��Ʈ����ü ����
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				Keyin = new BufferedReader(new InputStreamReader(System.in));
				String sendMsg = "";
				String resMsg = ""; //Ŭ���̾�Ʈ�� ������ �޽���
				while(true) {
					//1.���� <- Ŭ���̾�Ʈ
					resMsg = in.readLine();
					if(resMsg==null) {
						break;
					}
					System.out.println("Ŭ���̾�Ʈ�� ���� �޽���=>"+resMsg);
					//2. ���� -> Ŭ���̾�Ʈ
					sendMsg = Keyin.readLine();
					out.println(resMsg+"^^");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}