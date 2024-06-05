package kcc.oop2;

public class MyService {
	private DAO dao;
	
	public MyService() {}
	
	public MyService(DAO dao) {
		this.dao = dao;
	}
	
	
	public void insertSErvice() {
		dao.insert();
	}
	
	public DAO getDao() {
		return this.dao;
	}
}
