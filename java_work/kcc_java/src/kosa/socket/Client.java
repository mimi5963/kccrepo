package kosa.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket soc = null;
		
		try {
			
			soc = new Socket("127.0.0.1",9000); // socket�� �����ϴ°� �����ε�... �ٷο���
			
			InputStream is= soc.getInputStream();
			OutputStream os= soc.getOutputStream();
			
			String message = "Hi Server!!!!";
			
			os.write(message.getBytes());
			
			byte[] arr = new byte[100];
			is.read(arr);
			
			System.out.println("�������� ���� �޽��� : "+new String(arr));
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
