package kosa.video;

import java.util.Scanner;

public class VideoMain {
	//video�� �Ѱ��ۿ� ��������
	public static void main(String[] args) {
			
		GeneralMember m1 = new GeneralMember("aaa","ȫ�浿","��ź");
		Video v1 = new Video(1,"Ʈ��������3","������");
		m1.lentalVide(v1);
		m1.printLentalVideoInfo();
//		Scanner sc = new Scanner(System.in);
//		VideoManager vm = new VideoManager();
//		while(true) {
//			
//		}
	}
	
//	public static void printMenu() {
//		System.out.println("1.ȸ�����, 2.���� ���, 3.ȸ�� ���� �뿩, 4. ȸ�� ���� ���");
//	}
}
