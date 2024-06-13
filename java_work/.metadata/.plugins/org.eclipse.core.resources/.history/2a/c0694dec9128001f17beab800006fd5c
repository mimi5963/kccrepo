package kosa.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URLDecoder;

public class ClientReceive extends Thread {
	Socket socket;
	
	public ClientReceive() {}

	public ClientReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = br.readLine();
				String str2 = URLDecoder.decode(str, "utf-8");
				if(str2 == null)break;
				
				System.out.println("클라언트수신: " + str2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}










