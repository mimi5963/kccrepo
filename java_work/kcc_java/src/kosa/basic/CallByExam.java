package kosa.basic;

public class CallByExam {
	
	public static void main(String[] args) {
//		int num = 10;
//		// �޼��尡 ȣ��ǰ� ���� 
//		num = change(num);
//		System.out.println(num);
		
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]);
		
	}
	
	public static int change(int num) {
		num += 10;
	
		// 10 main�� num ������ �ʴ´�.
		return num;
	}
	
	public static void change2(int[] arr) {
		arr[0] = 101;
	}
	
}