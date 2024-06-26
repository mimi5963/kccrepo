package kcc.oop;


import java.util.ArrayList;
import java.util.List;

public class BookCacher {
	
	private List<Book> bookList;
	
	public BookCacher() {
	
		this.bookList = new ArrayList<Book>();
	}
	public int getTotalPrice() {
		int total =0;
		for(Book book : bookList) {
			total += book.getDiscountPrice();
		}
		return total;
	}
	
	public void getBooksInfos() {
		for(Book book : bookList) {
			book.printBookInfo();
		}
	}
	
	public void addBookOf(Book...books) {
		for(int i=0; i<books.length;i++) {
			bookList.add(books[i]);
		}
	}
}
