package chapter07.ex04;

class A {
//	필드 - 인스턴스 필드,static필드
	int m; //객체를 생성해야 호출가능
	static int n; //클래스명으로 호출가능
//	기본생성자 생략:다른생성자 없을시 생략
//	A(){}
	
//	메소드
	void work() {
		System.out.println(m); //기본적으로 int = 0;
	}
	
}

class B {
	int m;
	B(){}
	void work() {
		System.out.println(m);//기본값 int = 0;
	}
	
	
	
}

class C {
	int m;
//	C(){} //기본생성자 생략됨
	C(int a) { //생성자 : 인풋값 1개를 받는 생성자
		this.m=m; // 인풋 매게변수 => 실행블럭의 변수 -> 필드의 변수 이름이모두 동일한경우
//		this 자신의 객채를 필드
	}
	void work() {
		System.out.println(m);
	}
	
	
	
}


public class DefaultConstructor {

	public static void main(String[] args) {
//		생성자(constructor) : 객체를 생성할때 호출
//		리턴이 없고 클래스 이름과 동일한 메소드		
//		기본 생성자는 생략 가능 A (){} , 클래스 내부에 다른 생성자가 존재할때,명시
		
//		1.A클래스의 객체를 생성하고 메소드 호출
		A a =new A();
		a.work();
//		2.B클래스의 객체를 생성하고 메소드 호출
		B b =new B();
		b.work();
//		3.C클래스의 객체를 생성하고 메소드 호출
//		C c =new C(); //오류발생 : 클래스내의 다른생성자가 존재할시 기본생성자는명시
		C c1 = new C(3);
		c1.work();
		
		
		
		

	}

}
