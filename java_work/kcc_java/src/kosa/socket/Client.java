package kosa.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket soc = null;
		
		try {
			
			soc = new Socket("127.0.0.1",9000); // socket을 설정하는것 만으로도... 바로연결
			
			InputStream is= soc.getInputStream();
			OutputStream os= soc.getOutputStream();
			
			String message = "Hi Server!!!!";
			
			os.write(message.getBytes());
			
			byte[] arr = new byte[100];
			is.read(arr);
			
			System.out.println("서버에서 보낸 메시지 : "+new String(arr));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			soc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
