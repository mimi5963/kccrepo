package kosa.basic;

public class CallByExam {
	
	public static void main(String[] args) {
//		int num = 10;
//		// 메서드가 호출되고 나면 
//		num = change(num);
//		System.out.println(num);
		
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]);
		
	}
	
	public static int change(int num) {
		num += 10;
	
		// 10 main에 num 변하지 않는다.
		return num;
	}
	
	public static void change2(int[] arr) {
		arr[0] = 101;
	}
	
}
