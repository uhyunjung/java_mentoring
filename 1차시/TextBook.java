/*
 import java.util.*;
 

class Book {
	static String title;
	String author;
	int grade;
	
	public Book() {
		title = "����";
		author = "ȫ�浿";
	}
	public Book(String title, String author) {
		Book.title = title;
		this.author = author;
	}
	// this() ���
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
		Book b = new Book("�ȳ�","������");
		
		// aå ���� ���
		a.print();
		print2();
		
		// bå ���� ���
		System.out.println(title + "," + author);
	}
}
*/