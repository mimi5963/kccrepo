package kosa.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KosaReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//poem.txt�� �ִ� ���ڿ��� �о�����;��
		FileReader fr = null;
		try {
			 fr = new FileReader("poem.txt"); //�⺻��δ� kcc_java�� ���� ������Ʈ ��η� ��������
			 
			 while(true) {
				 int data = fr.read();
				 if(data == -1) break;
				 
				 System.out.print((char)data);
			 }
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}