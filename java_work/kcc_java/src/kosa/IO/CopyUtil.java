package kosa.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyUtil {
	//바이트 값을 가진 파일 1개를 복사하는 메서드 
	public static void copyFile(File source, File dest) throws IOException {
		//1. 바이트 스트림을 이용하여 이미지 파일을 복사해보자 
		
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(dest);
		
		byte[] bytes = new byte[100];
		int start =0;
		while((start=fis.read(bytes))!= -1) {
			
			fos.write(bytes);
		}
		
		fis.close();
		fos.close();
	}
	
	public static void copyDirectory(File source, File dest) throws IOException{
		
		//File 객체를 전달하면, 디렉토리랑 파일 전체를 옮겨야함
		// dest가 없다면, 만들어야하는데 
		File dest3 = new File(dest.getPath()+File.separator+source.getName());
		if(source.isDirectory()) {
			// /디렉토리 이름 C:\\KCC\\homeWork 
			
			//dest.mkdirs(); //들어올 때 dest
			//File dest3 = new File(dest.getPath()+File.separator+source.getName());
			if(!dest3.exists()) dest3.mkdir();
			
			for(File copyFile : source.listFiles()) {
				copyDirectory(copyFile, dest3);
			}
		}else {
			
			//File dest = new File(dest,source.getName());
			copyFile(source, dest3);
//			
		}
	}
}
