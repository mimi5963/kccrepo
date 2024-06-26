package kosa.data;

import java.util.Collection;
import java.util.List;

public class InputManager<T> {
	private final List<T> lists;
	
	public InputManager(List<T> lists) {
		this.lists = lists;
	}
	

	public void addElements() {
		System.out.println("추가하실 문자열을 입력해주세요");
		String input = KeyBoardInput.sc.nextLine();
		lists.add((T)input);
	}
	
	public void removeElements() {
		System.out.println("지우실 문자열을 입력해주세요");
		String input = KeyBoardInput.sc.nextLine();
		lists.remove((T)input);
	}
	
	public void showElements() {
		for(T el : lists) {
			System.out.println(el);
		}
	}
	
	
	
	
	
}
