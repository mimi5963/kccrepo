package kcc.oop;

public class BookCounterMain {
	public static void main(String[] args) {
		Book java = new Book("�ڹ�",30000,PriceDiscount.getInstance());
		Book jsp = new Book("JSP",20000,PriceDiscount.getInstance());
		Book oracle = new Book("Oracle",15000,PriceDiscount.getInstance());
		
		BookCacher books = new BookCacher();
		books.addBookOf(java,jsp,oracle);
		
		books.getBooksInfos();
		System.out.println(books.getTotalPrice());
		
		//218~220 
	}
	

			
	
}
