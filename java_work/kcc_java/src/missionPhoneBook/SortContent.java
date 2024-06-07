package missionPhoneBook;

import java.util.HashMap;
import java.util.Map;

public enum SortContent {
	NAME("1"),PHONENUMBER("2");
	
	private String name;
	private static Map<String, SortContent> map;
	private SortContent(String input) {
		this.name = name;
	}
	
	static {
		map = new HashMap<>();
		map.put("1",SortContent.NAME);
		map.put("2", SortContent.PHONENUMBER);
	}
	

	public static SortContent getContent(String input) {
		// TODO Auto-generated method stub
		return map.get(input);
	}
}
