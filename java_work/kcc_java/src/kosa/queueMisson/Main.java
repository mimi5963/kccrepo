package kosa.queueMisson;

public class Main {
	public static void main(String[] args) {
			
		
		
		//�ֹ��� �Է��� ����, �޴� ���
		// order �ϳ��� �ֹ��� ���� �ֹ� �޴��� �����ϰ� ���� 
		  //List�� menu�� ������ �ϸ�� ���ϴ�.
		//manager�� queue�� order�� ������ �ֵ��� ���� 
		// �ֹ�ó���� ������ �ϴ� �� �տ� �ִ� �޴� ó���ǵ����ϰ�,
		//fast order�� �޾Ƽ� �߰��ݾ��� ����!! 
		OrderManager om = new OrderManager();
		while(true) {
			System.out.println("1. �ֹ���û, 2.�ֹ�ó��, 3. ����ֹ� , 4. ���� �Ѿ�, 5. ����");
			String input = KeyBoardInput.sc.nextLine();
			
			switch(input) {
				case "1": om.addOrder(); break;
				case "2" : om.opOrder(); break;
				case "3" :om.showWaittingList(); break;
				case "4" : om.showTotalSalse(); break;
				case "5" : return;
			}
		}
	}
}
