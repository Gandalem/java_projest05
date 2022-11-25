package chapter10.ex08;

class A{
	A(){
		this(3); //자신의 객체의 정수 1개인 생성자 호출
		System.out.println("A생선자 1");
	}
	
	A(int a){
		System.out.println("A생성자 2");
	}
}

class B extends A { //자식 클래스는 생성자 첫 라인에 super 아니면 this가 반드시 와야한다 없다면 super가 생략 되어있다
	B(){
		this(3); //자신의 객체의 정수 1개인 생성자 호출
		System.out.println("B생선자 1");
	}
	
	B(int a){
//		super(); 생략됨
		System.out.println("B생성자 2");
	}
}

public class Super_Method03 {

	public static void main(String[] args) {
//		객체생성우 출력
		A a = new A();
		System.out.println("========");
		A aa = new A (3);
		System.out.println("=======");
		B b =new B();
		System.out.println("=========");
		B bb2 = new B(3);
		System.out.println("========");

	}

}
