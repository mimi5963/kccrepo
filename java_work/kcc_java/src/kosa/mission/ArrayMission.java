package kosa.mission;

public class ArrayMission {

	public static void main(String[] args) {
			
		
		int number = 5;
		
		// 1~5, 6~10 �̷��� ���
		System.out.println("@@@@@1-1@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=(i*number)+1; j<= (i+1)*number;j++) {

				System.out.printf("%3d",j);
			}
			System.out.println();
		}
		
		System.out.println("@@@@@1-1@@@@@");
		// 21 ~25 ���� ���
		System.out.println();
		//5*3+1
		System.out.println("@@@@@1-2@@@@@");
		for(int i=number;i>0;i--) {
			for(int j=number*(i-1)+1;j<=number*i;j++) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}

		System.out.println("@@@@@1-2@@@@@");
		System.out.println();
		//1,3,5,7,9
		//Ȧ���� ���
		System.out.println("@@@@@1-3@@@@@");
		for(int i=0;i<number;i++) {
			for(int j=(10*i)+1; j<10*(i+1);j++) {
				if(j%2 !=0)System.out.printf("%3d",j);
			}
			System.out.println();
		}

		System.out.println("@@@@@1-3@@@@@");
		System.out.println();

		System.out.println("@@@@@1-4@@@@@");
		for(int i=1; i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("@@@@@1-4@@@@@");
		//1 -> 2,3 ,4,5,6
		System.out.println();

		System.out.println("@@@@@1-5@@@@@");
		int cnt=1;
		for(int i=0; i<number;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.printf("%-3d",cnt++);
			}
			System.out.println();
		}
		System.out.println("@@@@@1-5@@@@@");
		System.out.println();

		System.out.println("@@@@@1-6@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=1;j<=number-i;j++) {
				System.out.printf("%-3d",j);
			}
			System.out.println();
		}
		System.out.println("@@@@@1-6@@@@@");
		System.out.println();

		System.out.println("@@@@@1-7@@@@@");
		int cnt2=1;
		for(int i=number; i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.printf("%-3d",cnt2++);
			}
			System.out.println();
		}
		System.out.println("@@@@@1-7@@@@@");
		System.out.println();


		System.out.println("@@@@@1-8@@@@@");
		//1-8 1,3 and 2,2 and 3,1
		for(int i=1; i<=number;i++){
			for(int j=1; j<=number;j++){
				System.out.print(i+j-1+" ");
			}
			System.out.println();
		}
		System.out.println("@@@@@1-8@@@@@");
		System.out.println();

		//1-9
		System.out.println("@@@@@1-9@@@@@");
		for(int i=1; i<=number; i++){
			for(int j=1; j<=number;j++){
				System.out.print((i+j-2)%number+1+" ");
			}
			System.out.println();
		}
		System.out.println("@@@@@1-9@@@@@");
		System.out.println();

		System.out.println("@@@@@1-10@@@@@");
		//1-10
		int cnt4=1;
		for(int i=0; i<number;i++){

			//������� //number 5-1 4*2+1
			for(int j=0; j<(number-i-1)*2;j++){
				System.out.print(" "); //9���� ����
			}

			for(int k=0;k<=i;k++){
				if(cnt4<10) {
					System.out.printf("%d ",cnt4++);
				}else{
					System.out.printf("%d ",cnt4++);
				}
			}

			System.out.println();
		}

		System.out.println("@@@@@1-10@@@@@");
		System.out.println();

		System.out.println("@@@@@2-1@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=0; j<number;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("@@@@@2-1@@@@@");
		System.out.println();


		System.out.println("@@@@@2-2@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("@@@@@2-2@@@@@");
		System.out.println();

		System.out.println("@@@@@2-3@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=0;j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("@@@@@2-3@@@@@");
		System.out.println();
		
		//��
		System.out.println("@@@@@2-4@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=0; j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("@@@@@2-4@@@@@");
		System.out.println();
		
		//���̾�
		System.out.println("@@@@@2-5@@@@@");
		for(int i=0; i<number;i++) {
			for(int j=0; j<(number-1)-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=number; i>0;i--) {
			for(int j=0; j<=(number-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<((i-2)*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("@@@@@2-5@@@@@");
		System.out.println();





		System.out.println("@@@@@2-6@@@@@");
		// ���̾� �ΰ�
		for(int i=0; i<number;i++){
			//���� ���
			for(int j=(number-1)-i; j>0;j--){
				System.out.print(" ");
			}

			for(int k=0; k<(i*2)+1;k++){
				System.out.print("*");
			}

			//���ﰢ�� ����
			for(int j=0; j<(number-1-i)*2;j++){
				System.out.print(" ");
			}

			//�� �ٽ� ���
			for(int k=0; k<(i*2)+1;k++){
				System.out.print("*");
			}

			System.out.println();
		}

		//���ﰢ�� // x 0 = 7 x 1 ->5 3 2 1
		for(int i=0;i<number-1;i++){


			//����
			for(int j=0; j<=i;j++){
				System.out.print(" ");
			}
			//��
			for(int k=(number-i-2)*2+1; k>0; k--){
				System.out.print("*");
			}
			//�����e ����
			for(int j=0;j<(i*2)+2;j++){
				System.out.print(" ");
			}
			//��
			for(int k=(number-i-2)*2+1; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("@@@@@2-6@@@@@");
		System.out.println();


		System.out.println("@@@@@2-7@@@@@");
		//n�ٿ� ���?
		for(int i=0; i<number;i++){

			//����
			for(int j=0; j<number-1-i;j++){

				System.out.print(" ");
			}
			//�ﰢ��
			for(int k=0; k<i*2+1;k++){
				System.out.print("*");
			}

			//���ﰢ��
			for(int j=(number-1-i)*2; j>0;j--){
				System.out.print(" ");
			}

			//9���ͽ����ϴ� ģ�� �ﰢ�� �� �ص� 9�� *
			for(int k=0; k<(number+i)*2-1;k++){
				System.out.print("*");
			}
			//���ﰢ��
			for(int j=(number-1-i)*2; j>0;j--){
				System.out.print(" ");
			}
			//�ﰢ��
			for(int k=0; k<i*2+1;k++){
				System.out.print("*");
			}

			System.out.println();

		}
		System.out.println("@@@@@2-7@@@@@");
		System.out.println();


		//2n�ٿ� ���
		System.out.println("@@@@@2-8@@@@@");
		int n2 = number*2;
		for(int i=0; i<n2;i++){
			if(i<number){
				for(int j=0; j<n2*2-i-1;j++){
					System.out.print(" ");
				}
				for(int k=0; k<(i*2)+1;k++){
					System.out.print("*");
				}
			}else{
				//���� ���
				for(int j=0; j<n2-i;j++){
					System.out.print(" ");
				}
				//�� ���
				for(int k=0; k<(i-number)*2+1;k++){
					System.out.print("*");
				}

				//���ﰢ�� ���
				for(int j=(n2-i-1)*2;j>0;j--){
					System.out.print(" ");
				}

				//������ ���
				for(int k=0; k<i*2+1;k++){
					System.out.print("*");
				}
				//���ﰢ�� ���
				for(int j=(n2-i-1)*2;j>0;j--){
					System.out.print(" ");
				}
				//�� ���
				for(int k=0; k<(i-number)*2+1;k++){
					System.out.print("*");
				}

			}
			System.out.println();
		}
		System.out.println("@@@@@2-8@@@@@");
		System.out.println();

		System.out.println("@@@@@2-9@@@@@");
		//2-9
		for(int i=0; i<number+2;i++){

			for(int j=0;j<number+2;j++){
				if(i==0 || i==number+2-1){
					System.out.print("$");
				}else if(j==0 || j==number+2-1){
					System.out.print("$");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("@@@@@2-9@@@@@");
		System.out.println();

		System.out.println("@@@@@2-10@@@@@");
		//2-10
		int n23 = 2*number+3;
		for(int i=0; i<n23;i++){

			if(i<number+2){

				for(int j=0; j<=i;j++){
					if(j==0 || j==i){
						System.out.print("*");
					} else {
						System.out.print("@");
					}
				}

			}else{
				//13 i=7 -> 6
				for(int j=0;j<n23-i;j++){
					if(j==0 || j==n23-i-1){
						System.out.print("*");
					} else {
						System.out.print("@");
					}
				}


			}
			System.out.println();
		}

		System.out.println("@@@@@2-10@@@@@");
		System.out.println();


			
			
			
			
		}
		
		
		
	}

