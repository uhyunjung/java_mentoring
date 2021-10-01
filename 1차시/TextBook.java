/*
 import java.util.*;
 

class Book {
	static String title;
	String author;
	int grade;
	
	public Book() {
		title = "국어";
		author = "홍길동";
	}
	public Book(String title, String author) {
		Book.title = title;
		this.author = author;
	}
	// this() 사용
	public Book(String title, String author, int grade) {
		this(title, author);
		this.grade = grade;
	}
	void print() {
		System.out.println(title);
		System.out.println(author);
	}
	static void print2() {
		System.out.println(title);
		System.out.println(author);
	}
}

class TextBook {
	public static void main(String[] args) {
		Book a = new Book();
		Book b = new Book("안녕","유현정");
		
		// a책 정보 출력
		a.print();
		print2();
		
		// b책 정보 출력
		System.out.println(title + "," + author);
	}
}
*/