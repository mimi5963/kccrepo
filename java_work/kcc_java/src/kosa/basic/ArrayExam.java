package kosa.basic;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {

		String[] sarr = new String[100];

		// 키보드로부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력하자
		// q 입력시까지 입력 받는다
		Scanner sc = new Scanner(System.in);

		String input = "";
		int idx = 0;

		while (true) {
			System.out.print("이름을 입력하세요 : ");
			input = sc.nextLine();
			if ("q".equals(input))
				break;
			sarr[idx++] = input;
		}

		for (int i = 0; i < idx; i++) {
			if (i < idx-1)
				System.out.print(sarr[i] + ", ");
			else
				System.out.print(sarr[i]);
		}

	}
}
