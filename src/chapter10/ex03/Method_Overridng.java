package chapter10.ex03;

class A { //부모 클래스 (super class)
	void print() { //인스턴스 메소드 : 메소드 오버라이딩 가능하다.
		System.out.println("A클래스의 print()");
	}
}

class B extends A{ //자식 클래스 (child class)
	
	@Override	//@ 특수문자는 어노테이션이라 부른다 (@Override : 부모의 메소드를 재정의시 오류를 방지하는 어노테이션)
	void print() {
		System.out.println("B클래스의 print()");
	}
}

public class Method_Overridng {

	public static void main(String[] args) {
		/*
		 Method Overloading : 동일한 이름의 메소드를 시그니쳐에 따라서 다르게 식별(메소드,생성자)
		 		시그니쳐 : 인풋 매개변수으 개수 , 타입
		 Method Overriding 	: 부모클래스의 메소드를 자식클래스에서 재정의 해서 사용하는것
		 
		 */
//		A타입 A생성자 호출
		A a1 = new A(); 
//		A타입 B생성자 호출
		A a2 = new B();
//		B타입 B생성자 호출
		B b1 = new B();
		a1.print();
		a2.print();
		b1.print();

	}

}
