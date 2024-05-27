package kosa.basic;

public class MethodExam {
	
	//메서드 정의 -> 재사용성을 위해 중복코드 줄이기
	//접근 제어자, static, 리턴형 
	public static void main(String[] args) {
		printChar('*', 10);
	}
	
	public static void printChar(char target, int number) {
		for(int i=0; i<number; i++) {
			System.out.print(target);
		}
	}
}
