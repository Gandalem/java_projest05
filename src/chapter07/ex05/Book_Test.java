package chapter07.ex05;

class Book{
	String title; //책의 제목을 넣는 변수
	String auothor; //책의 저자를 넣는 변수
	
	Book(){// 기본생성자
		title = "책제목 없음";
		auothor = "작가미상";
	}
	Book(String title){
		this();
		this.title = title;
		
	}
	Book(String title,String auothor){
		this(title);
		this.auothor = auothor;
		
	}
	void print() {
		System.out.printf("첵의 제목은 : %s\n책의 저자는 : %s\n",title,auothor);
	}
	
}








public class Book_Test {

	public static void main(String[] args) {
		Book book = new Book();
		book.print();
		System.out.println("======");
		Book book1 = new Book("홍길동전");
		book1.print();
		System.out.println("======");
		Book book2 = new Book("홍길동전","허균");
		book2.print();

	}

}
