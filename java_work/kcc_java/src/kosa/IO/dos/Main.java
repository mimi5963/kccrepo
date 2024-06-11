package kosa.IO.dos;

public class Main {
	
	public static void main(String[] args) {
		
		//ls, cd ,cd.. mkdir kosa cp/
		MiniDos m = new MiniDos("C:\\");
		while(true) {
			
			m.printpwd();
			String input = KeyboardInput.sc.nextLine();
			if(input.equals("q")) break;
			m.getUserInput(input);
		}
		
		
	}
}
