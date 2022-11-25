package chapter11.ex01;

class A{
	int a= 3;
	final int b = 5;
	A(){}
	
}
class B{ //선언 값할당 분리
	int a;
	final int b;
	B(){
		a = 3;
		b = 5;
	}
	
}
class C{
	int a = 3;
	final int b = 5; //상수
	C(){
		a = 7;
//		b = 10; //오류발생
	}
	
}



public class Final_Field {

	public static void main(String[] args) {
//		final_modifire : 
//		1.	필드 : 값을 수정하지 못하도록[상수]
//		2. 	메소드 : 자식 클래스에서 오버라이딩 불가
//		3.	클래스 : 상속이 불가한 클래스
		
		A a1 = new A();
//		a : 필드 [변수]- 값을 수정할수있다.
//		b : 상수 - 값을 수정할수없다
		a1.a = 5;
//		a1.b = 6; 
		
		B b1 = new B();
		b1.a = 5;
//		b1.b = 6;
		
		
	}

}
