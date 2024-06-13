package kosa.net2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;//�젒�냽�븳 �겢�씪�씠�뼵�듃 �냼耳�
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("�꽌踰� �떎�뻾 以�......");
			
			while(true) {
				socket = serverSocket.accept();//�슂泥� ��湲� 以�
				Thread thread = new PerClientThread(socket);
				thread.start();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
				//serverSocket.close();
			} catch (Exception e2) {}
		}
	}
}











