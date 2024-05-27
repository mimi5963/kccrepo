package kosa.mission;

import java.util.Scanner;

public class Mission2_2 {
	public static void main(String[] args) {
			
		//여러명의 성적을 입력받을 수 있음
		// 번호 국어 영어 수학 총점 평균 
		//  1  90 80  70 240 80
		//  2  
		   //과목별 평균도 나오게 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 인원수를 입력해주세요 :");
		int n = Integer.parseInt(sc.nextLine());
 		int[][] score = new int[n][6];
 		int cnt =1;
 		//키보드 입력 받기 
 		String[] course = {"국어","영어","수학"};
 		
 		for(int i=0; i<n;i++) {
 			System.out.println(cnt+"번의 성적 입력");
 			score[i][0] = cnt;
 			for(int j=1; j<4;j++) {
 				System.out.print(cnt+"번의"+menu(course[j-1]));
 				score[i][j] = Integer.parseInt(sc.nextLine()); 
 			}
 			setTotalAndAvg(score[i]);
 			cnt++;
 		}
 		
 		//전체 점수 출력
 		printTotalScore(score);
 		//과목별 평균 점수 출력
 		printAvgbyCourse(score);
	}
	
	
	
	private static void printAvgbyCourse(int[][] score) {
		//각각 kor, eng, math의 점수
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
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");
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
		return course+"점수를 입력해 주세요";
	}
}
