package kosa.basic;

public class MethodExam {
	
	//�޼��� ���� -> ���뼺�� ���� �ߺ��ڵ� ���̱�
	//���� ������, static, ������ 
	public static void main(String[] args) {
		printChar('*', 10);
	}
	
	public static void printChar(char target, int number) {
		for(int i=0; i<number; i++) {
			System.out.print(target);
		}
	}
}
