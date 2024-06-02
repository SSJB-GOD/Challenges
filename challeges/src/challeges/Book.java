package challeges;

public class Book {
	
	static int totalBooks;
	
	String title,author,isbn;
	
	boolean isBorrowed;
	
	
	static {
		totalBooks = 0;
	}
	
	{
		totalBooks++;
	}
	
	
	Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	Book(String author,String title){
		this(title,author,"Unknown");
	}
	Book(String isbn){
		this("Unknown","Unknown",isbn);
		
	}
	
	 void borrowBook(){
		 if(isBorrowed) {
			 System.out.println("Book is already borrowed..! "+title);
		 }
		 else {
			 this.isBorrowed = true;
			 System.out.println(title+" Book is available, You can have that.");
		 }
		
	}
	 void returnBook() {
		 
		 if(isBorrowed) {
			 this.isBorrowed = false;
			 System.out.println("Hope., you read this Book. "+title);
		 }
		 else {
			 this.isBorrowed = true;
			 System.out.println("This book is already in Library. "+title);
		 }
		 
		
	}
	 
	 
	 static int getTotalBooks() {
		 
		 return totalBooks;
		
	}
	 
	 
	 public static void main(String[] args) {
		Book hiroshimaAndNaga = new Book("HiroShima&Naga","-jitesh","111");
		Book Gaza = new Book("113");
		Book RichPoor = new Book("jitesh","123");
		System.out.println(Book.getTotalBooks());
		hiroshimaAndNaga.borrowBook();
		Gaza.borrowBook();
		Gaza.borrowBook();
		hiroshimaAndNaga.returnBook();
		hiroshimaAndNaga.returnBook();
		RichPoor.borrowBook();
		RichPoor.borrowBook();

	 }
	
	

}
