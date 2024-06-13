package kosa.IO;

import java.io.File;

public class FIleExam {
	public static void main(String[] args) {
		String path = "C:\\KCC\\workdir";
		
		File f = new File(path);
		
		filePrint(f,1);
	}
	
	public static void filePrint(File f,int depth) {
		if(f.isDirectory()) {
			System.out.println(depth+"-".repeat(depth*2)+">"+"���丮 �� : "+f.getName());
			for(File file : f.listFiles()) {
				filePrint(file,depth+1);
			}
		}else {
			System.out.println("  ".repeat(depth*2)+"���ϸ� : "+f.getName()+" ");
		}
	}
}