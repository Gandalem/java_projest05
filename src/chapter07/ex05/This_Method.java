package chapter07.ex05;

class B {
	
//	1.기본생성자
	B(){
		System.out.println("기본생성자를 호출했습니다.");
	}
	B(int a){
		this(); //반드시 생성자 내부의 첫라인에 와야한다 //기본생성자 호출
		System.out.println("메게변수가 하나인 생성자 입니다");
	}
	B(int a ,int b){
		this(3); //매개변수가 정수1개인 생성자 호출
		System.out.println("매개변수 정수2개인 생성자입니다.");
	}
	B(int a ,int b,int c){
		this(4,5); //매개변수가 정수1개인 생성자 호출
		System.out.println("매개변수 정수3개인 생성자입니다.");
	}
}



public class This_Method {

	public static void main(String[] args) {
//		This() : this method : 자신의 객체릐 다른생성자를 호출할때 사용
//			생성자 내부에서만 this method 사용 가능
//			반드시 생성자 첫라인에 위치 해야한다
//		1. 정수 1개인 생성자 호출
		B b1 = new B(3);
		System.out.println("=========");
		B b2 = new B(3,4);
		System.out.println("=========");
		B b3 = new B(3,4,5);
		
		
	}

}
