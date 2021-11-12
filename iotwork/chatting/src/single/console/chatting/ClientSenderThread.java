package single.console.chatting;
//클라이언트에서 서버로 전송하는 메시지를 읽는 것을 처리하는 쓰레드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSenderThread extends Thread{
	Socket server;
	//쓰레드가 생설될 때 서버 정보를 넘겨 받도록 작업
	public ClientSenderThread(Socket server) {
		super();
		this.server = server;
	}
	//키보드로 입력한 메시지를 서버로 보내는 작업을 처리
	@Override
	public void run() {
		BufferedReader keyin = null;
		PrintWriter out = null;
		try {
			keyin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(server.getOutputStream(),true);
			String sendMsg=""; //서버로 보낼 메시지
			while(true) {
				sendMsg = keyin.readLine();
				if(sendMsg==null) {
					break;
				}
				out.println(sendMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
