package kosa.IO.dos;

public class test {
	public static void main(String[] args) {
			
		
		
		//정규표현식 테스트
		String test = "cp test/kc";
		
		if(test.matches("cp\\s{1}[\\w]+(/[\\w]+)*")) {
			System.out.println("매치");
		} 
	}
}
