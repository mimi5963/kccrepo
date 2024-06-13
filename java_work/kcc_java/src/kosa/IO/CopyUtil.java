package kosa.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyUtil {
	//����Ʈ ���� ���� ���� 1���� �����ϴ� �޼��� 
	public static void copyFile(File source, File dest) throws IOException {
		//1. ����Ʈ ��Ʈ���� �̿��Ͽ� �̹��� ������ �����غ��� 
		
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
		
		//File ��ü�� �����ϸ�, ���丮�� ���� ��ü�� �Űܾ���
		// dest�� ���ٸ�, �������ϴµ� 
		File dest3 = new File(dest.getPath()+File.separator+source.getName());
		if(source.isDirectory()) {
			// /���丮 �̸� C:\\KCC\\homeWork 
			
			//dest.mkdirs(); //���� �� dest
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