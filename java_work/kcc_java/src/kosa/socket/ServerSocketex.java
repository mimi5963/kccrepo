package kosa.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketex {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
//		try {
//			serverSocket = new ServerSocket(9000);
//			System.out.println("���� ���� ��.....");
//			serverSocket.accept();
//			socket = serverSocket.accept();
//			
//			InputStream is = socket.getInputStream();
//			OutputStream os = socket.getOutputStream();
//			
//			byte[] arr = new byte[100];
//			
//			is.read(arr);
//			
//			System.out.println("Ŭ���̾�Ʈ���� ������ �޽���: "+new String(arr));
//			
//			
//			String message = "Hello Client!!!";
//			
//			os.write(message.getBytes());
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			try {
//			socket.close();
//			serverSocket.close();
//			}catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
	}
}