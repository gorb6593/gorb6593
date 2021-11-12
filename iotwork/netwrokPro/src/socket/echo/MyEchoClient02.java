package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyEchoClient02 {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null; 
		PrintWriter out = null;
		BufferedReader keyin = null; 
		try {
			server = new Socket("192.168.0.7", 12345);
			System.out.println("서버 접속 성공!");
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			//통신시작~
			
			String sendMsg = ""; 
			String resMsg = ""; 
			//1. 클라이언트 <- 서버
			resMsg = in.readLine();
			System.out.println("서버가 보내는 메시지=>"+resMsg);			
			while((sendMsg = keyin.readLine())!=null) {		
				//1. 클라이언트 -> 서버
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
