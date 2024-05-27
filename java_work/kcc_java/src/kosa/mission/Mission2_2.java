package kosa.mission;

import java.util.Scanner;

public class Mission2_2 {
	public static void main(String[] args) {
			
		//�������� ������ �Է¹��� �� ����
		// ��ȣ ���� ���� ���� ���� ��� 
		//  1  90 80  70 240 80
		//  2  
		   //���� ��յ� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ο����� �Է����ּ��� :");
		int n = Integer.parseInt(sc.nextLine());
 		int[][] score = new int[n][6];
 		int cnt =1;
 		//Ű���� �Է� �ޱ� 
 		String[] course = {"����","����","����"};
 		
 		for(int i=0; i<n;i++) {
 			System.out.println(cnt+"���� ���� �Է�");
 			score[i][0] = cnt;
 			for(int j=1; j<4;j++) {
 				System.out.print(cnt+"����"+menu(course[j-1]));
 				score[i][j] = Integer.parseInt(sc.nextLine()); 
 			}
 			setTotalAndAvg(score[i]);
 			cnt++;
 		}
 		
 		//��ü ���� ���
 		printTotalScore(score);
 		//���� ��� ���� ���
 		printAvgbyCourse(score);
	}
	
	
	
	private static void printAvgbyCourse(int[][] score) {
		//���� kor, eng, math�� ����
		System.out.println("============================================");
		int[] avgs = new int[3];
		for(int i=0; i<score.length;i++) {
			for(int j=1;j<4;j++) {
				avgs[j-1] += score[i][j];
			}
		}
		System.out.printf("\t%d\t%d\t%d\n",avgs[0],avgs[1],avgs[2]);
		for(int i=0; i<avgs.length;i++) {
			avgs[i] /= score.length;
		}
		System.out.printf("\t%d\t%d\t%d",avgs[0],avgs[1],avgs[2]);
		
		
	}



	private static void printTotalScore(int[][] score) {
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t");
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}



	private static void setTotalAndAvg(int[] score) {
		int total = 0;
		for(int i=1; i<4;i++) {
			total+=score[i];
		}
		
		score[4]=total;
		score[5]=total/3;
	}



	public static String menu(String course) {
		return course+"������ �Է��� �ּ���";
	}
}