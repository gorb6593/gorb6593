package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;

public class MyEchoServer02 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;		
		try {
			ServerSocket server = new ServerSocket(12345);
			while(true) {
				client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("�������ӿϷ�~");
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				
				out.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
				//��Ž���~
				String resMsg = "";
				while(true) {
					//1.���� <- Ŭ���̾�Ʈ
					resMsg = in.readLine();
					if(resMsg==null) {
						break;
					}														
					if(resMsg.startsWith("�ȳ��ϼ���") | resMsg.startsWith("����")) {
						out.println(clientIp.getHostAddress()+"�� �ݰ�����");
					}else if(resMsg.startsWith("��¥")){
						out.println(new Date().toString());
					}else {
						out.println(clientIp.getHostAddress()+"�� � ��~~");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
