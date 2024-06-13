package kosa.net;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket =null;
		
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버 실행 중........");
			socket = serverSocket.accept();
			System.out.println("하이");
			
			Thread sr = new ServerReceive(socket);
			Thread send = new ServerSend(socket);
			
			sr.start();
			send.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
