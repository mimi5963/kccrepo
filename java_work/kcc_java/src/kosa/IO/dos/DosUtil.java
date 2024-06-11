package kosa.IO.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosUtil {
	
	
	
	public static void showAllFiles(File fis) {
		
		
		for(File s : fis.listFiles()) {
			if(s.isDirectory()) {
				System.out.println("+"+s.getName());
			}else {
			System.out.println("*"+s.getName());
			}
		}
		
	}

	public static void mkdir(File file) {
		if(!file.exists()) file.mkdirs();
		// TODO Auto-generated method stub
		
	}
	
	public static void cp(FileInputStream fis, FileOutputStream fos) {
		
	}

	public static void viModifiy(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file,true);
			StringBuffer sb = new StringBuffer();
			System.out.println("--------vi 편집기 입력창----------");
			String input ="";
			while(true) {
				input = KeyboardInput.sc.nextLine();
				if("q".equals(input)) break;
				sb.append(input+"\n");
			}
			fw.write(sb.toString());
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
