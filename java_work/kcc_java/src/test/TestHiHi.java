package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestHiHi {

	public static void main(String[] args) {
		
		ObjectOutputStream out = null;
		
		try {
			
			out = new ObjectOutputStream(new FileOutputStream("c:Users/KOSA/Desktop/obj.txt"));
			out.writeObject(new HiMySerial());
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
