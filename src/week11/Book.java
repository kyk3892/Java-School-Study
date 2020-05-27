package week11;

public class Book{
	//멤버 변수
	String title, author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void print() {
		System.out.println("제목 : "+title+" 저자 : "+author);
	}
}
