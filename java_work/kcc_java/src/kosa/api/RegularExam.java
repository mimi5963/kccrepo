package kosa.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Date;
public class RegularExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.print("�Է� : ");
//		String str = sc.nextLine();
		
		//abc���ڸ� ���� ���� üũ : [abc]
		
//		if(str.matches(".*abc.*")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
//		
		
		//���ڸ� 3�ڸ� 
//		if(str.matches("\\d{3}")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
		
//		if(str.matches("\\w{5,}")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
		
//		if(str.matches("[��-�R]{3,5}")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
//		
		//dolsam77@nate.com
//		
//		if(str.matches("^[a-zA-Z][\\w]+@[a-z]*\\.(com||net)$")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
		
		//Ű����� ��¥ �Է� �ޱ� 
//		String sinput = sc.nextLine();
//		//�Ի��� �Է� �޾� => ��� ��� ���� 
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
//		
//		try {
//			Date past = sf.parse(sinput);
//			Date now = new Date();
//			
//			System.out.println(now);
//			System.out.println(past);
//			Date d = new Date( now.getTime() -past.getTime());
//			System.out.println(d.getTime()/(1000*24*60*60)); //3650�� 
//			
//			System.out.println(((d.getTime()/(1000*24*60*60)/365))+"��"+((d.getTime()/(1000*24*60*60)%365)/30)+"�� ������");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String str = sc.nextLine();
		String message = "SW 423432243243������ ó��� �ٹ����� ������ �������� �����ؾ� ������=���ý��������� ���� = �ڱ��� ������� 23�� ����Ʈ����(SW) 32423423432432 �߽ɻ�ȸ�� �����ϱ� ���ؼ��� SW�� ��ġ�� ����� �����ϴ� ���� ����ؾ� �Ѵٰ� ���ߴ�.432432423 �� ������� �̳� ���� �Ǳ� ��ũ��븮���� ���� 'SW �߽ɻ�ȸ ���� ��������ȸ'���� �츮���� IT �������� ���� �����ϱ� ���ؼ��� SW �о��� ����� Ȯ���� �ñ��� ������� �̰��� ������. �� ������� ���忡�� SW�� ��ġ�� ����� �������� �ʾ� SW ������� ���ͼ��� ��ȭ�ǰ�, ����� ���簡 ���Ե��� �ʴ� �Ǽ�ȯ�� ������ ����� �Ѵٸ� �����ι��� SW �����ֱ� ����� �ΰ����� Ȯ��� â�Ǽ��� ����� ������ ���� �޴� ȯ���� ������ �������� ����� ���̶�� ����ߴ�.  �̾� �׵��� ���� ����ȭ����� ������ �ΰ� SW ������ �����Ų�ٴ� ������ �־��µ� �ΰ��� ����� ��������� ���� ���߹� ������ �ؾ� �� ���ΰ� ������ �ΰ������� �����Ű�� ���� �־�� �� �� ���̶�� �ΰ����忡 ��ġ�� ������ ������ ���ϴ� �� ���� ����ȭ��� ���������� ������ �ʿ䰡 �ִٰ� �����ߴ�.  �� ������� �� SW �������� ó��� �ٹ����ǵ� ������ �������� ������ �ʿ䰡 �ִٸ� SW �����ڰ� '���� ����'�� �� �ְ��� ������� ���Եǰ� �̵��� SW ��� ������ �̲����, �׷��� ����Ʈ���� �����ڵ��� ó�찡 ���� �����Ǵ� ����ȯ ������ ����� ������ �ϰڴٰ� �����ߴ�.  Ư�� �ڶ󳪴� �̷����뿡 ���� SW ������ �������� �߿��ϴٸ� SW �߽ɻ�ȸ�� �ֿ��� �� �̷� ���밡 '��ǻ���� ���'�� �⺻�Ҿ����� ���� �� �ֵ��� �ʡ��ߵ��б��������� SW������ ��ȭ�ؾ� �Ѵٰ� ���ߴ�.";

		String data[] = {
						"bat", "bba", "bbg", "bonus",
						"CA", "ca", "c232", "car",
						"date", "dic", "diraaa"
				};
//		String newMessage = message.replaceAll("[0-9[^(23��)]]", "");
//		System.out.println(newMessage);
//		
		
//		String source = "ab?cd?ef?gh";
//		String reg = "(\\w*)";
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		String source = "HP: 010-1111-1111,HOME: 02-222-2222";
		//String reg="([a-zA-Z0-9\\s-:]+)";
		String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
//		if(str.matches("\\S+.(?i)(jpg||png||gif){1}$")) {
//			System.out.println("��Ī");
//		}else System.out.println("��Ī�ȴ�");
//		
		
		
	}

}
