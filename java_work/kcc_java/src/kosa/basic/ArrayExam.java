package kosa.basic;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {

		String[] sarr = new String[100];

		// Ű����κ��� ���ڿ��� �Է� �޾� �迭�� �߰��� �� ��ü�� �������
		// q �Է½ñ��� �Է� �޴´�
		Scanner sc = new Scanner(System.in);

		String input = "";
		int idx = 0;

		while (true) {
			System.out.print("�̸��� �Է��ϼ��� : ");
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