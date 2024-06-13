package kosa.net2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.0.3", 9000);
			
			Thread receive = new ClientReceive(socket);
			Thread sender = new ClientSender(socket);
			
			receive.start();
			sender.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
			} catch (Exception e2) {}
		}

	}

}







