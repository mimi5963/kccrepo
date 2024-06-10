package kosa.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KosaReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//poem.txt에 있는 문자열을 읽어오고싶어용
		FileReader fr = null;
		try {
			 fr = new FileReader("poem.txt"); //기본경로는 kcc_java와 같은 프로젝트 경로로 잡혀있음
			 
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
