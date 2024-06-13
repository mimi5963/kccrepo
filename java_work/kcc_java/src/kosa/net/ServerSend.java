package kosa.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class ServerSend extends Thread{
	Socket socket;
	
	public ServerSend() {}
	public ServerSend(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 PrintWriter writer = new PrintWriter(socket.getOutputStream());
			 
			 while(true) {
				 String str = br.readLine();
				 if(str.equals("bye"))break;
				 writer.println(str);
				 writer.flush();
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
