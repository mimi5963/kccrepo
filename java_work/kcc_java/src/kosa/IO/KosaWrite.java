package kosa.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWrite {
	public static void main(String[] args) {
		
		
		//Ű����κ��� ���ڿ��� �Է� �޾� 
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		try {
			 fw = new FileWriter("poem2.txt",true);
			 String input="";
			 
			 while(true) {
				 input = sc.nextLine();
				 if("q".equals(input)) break;
				 fw.write(input);
			 }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
