package kcc.oop2;

public class MAin {
	public static void main(String[] args) {
		
		OracleDao od = new OracleDao();
		MySQLdao oda = new MySQLdao();
		
		//여기를 바꿔야한다.
		MyService  my = new MyService(new DAO() {
			
			@Override
			public void insert() {
				System.out.println("MS-SQL");
				
			}
		});
		
		my.insertSErvice();
	}
}
