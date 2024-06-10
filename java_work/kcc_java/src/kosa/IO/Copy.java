package kosa.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
			
		
		
		//poem2.txt
		
		FileReader fr=null;
		FileWriter fw =null;
		
		try {
			fr = new FileReader("poem2.txt");
			
			fw = new FileWriter("pome3.txt");
			StringBuffer sb = new StringBuffer();
			int s=0;
			while((s = fr.read())!= -1) {
				sb.append((char)s);
			}
			
			fw.write(sb.toString());
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
