package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyEchoClient03 {
 public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; //서버에서 보내는 메시지를 읽기 위한 스트림객체
		PrintWriter out = null;
		BufferedReader keyin = null; //서버로 보내기 위해 키보드를 통해 입력한 메시지를 읽기 위한 스트림객체
		try {
			server = new Socket("192.168.0.7", 12345);
			System.out.println("서버 접속 성공!");
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg = ""; //서버로 보낼 메시지
			String resMsg = ""; //서버에서 받은 메시지
			while((sendMsg = keyin.readLine())!=null) {
				//1. 클라이언트 -> 서버(키보드로 입력하는 메시지를 서버로 전송)
				out.println(sendMsg);
				//2. 클라이언트 <- 서버
				resMsg = in.readLine();
				System.out.println("서버가 보내는 메시지=>"+resMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
