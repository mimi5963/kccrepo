package kosa.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;





public class BufferExam {
	TestType m;
	
	//객체 직렬화
	public void insert() {
		m = new TestType("홍길동",20);
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("objectFile.ser"));
			oos.writeObject(m);
			
			
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
	};
	
	
	//
	public void show() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("objectFile.ser"));
			m = (TestType)ois.readObject();
			System.out.println(m.getName());
		}catch (IOException e) {
			// TODO: handle exception
		}catch (ClassNotFoundException e) {
			
		}
		finally {
			try {
				ois.close();
			}catch(IOException e) {
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		BufferExam be = new BufferExam();
		be.insert();
		be.m = null;
		be.show();
		System.out.println(be.m);
		//Scanner => 키보드
		// System.in -> InputStream -> InputStreamReader -> BufferedReader
		
//		BufferedReader br =null;
//		BufferedWriter bw = null;
//		
//		try {
//			br = new BufferedReader(new InputStreamReader(System.in));
//			bw = new BufferedWriter(new FileWriter("output.txt"));
//			System.out.println("입력");
//			String str = "";
//			while((str = br.readLine())!= null) {
//				str +="\n";
//				bw.write(str);
//			}
//			System.out.println("쓰기완료");
//		}catch (IOException e) {
//			// TODO: handle exception
//		}finally {
//			try {
//				bw.close();
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		
		
			
		}
	}

