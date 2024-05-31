package test;

import java.io.Serializable;

public class HiMySerial implements Serializable {
	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
