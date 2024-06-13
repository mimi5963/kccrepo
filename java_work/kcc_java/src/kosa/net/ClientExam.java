package kosa.net;

import java.net.Socket;

public class ClientExam {
	public static void main(String[] args) {
			Socket socket = null;
			
			try {
				socket = new Socket("192.168.0.8",9000);
				
				Thread recevie = new ClientReceive(socket);
				Thread send = new ClientSend(socket);
				
				recevie.start();
				send.start();
				
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
	}
}
