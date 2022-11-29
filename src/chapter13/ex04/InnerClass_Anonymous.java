package chapter13.ex04;

/*
 익명 이너 클래스(Anonymous Inner Class) : 메소드 내부에 선언된 클래스 <= 굉장히 많이 사용
  --메소드 내부의 필드 를 이너 클래로 사용항경우 final키가 자동으로 할당(컴파일어에서 자동으로 할당)
 
 
 
 */

class A{ //아웃터 클래스
	int a = 3;
	A(){}
	A(int a){ // 생성자를 사용해서 필드의 값 할당
		this.a = a;
	}
	public void setA (int a) { //setter를 사용해서 필드의 값 할당
		this.a = a;
	}
	void abc() { // 메소드
		
		int b = 5;
		
		class B { // 지역 이너 클래스 : 메소드 내부에 선언된 클래스
					//메소드를 호출시 작동이 되므로 메소드 내부에서 객체를 생성해야함
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				
			}
			
			
		}
		B bb = new B(); //메소드 내부에서 객체 생성
		bb.bcd(); //객체생성후 메소드 호출
		
	}
	
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		// 1. 객체 생성후 메소드 호출
		A a = new A();
		a.abc(); //메소드 호출시 B class 가 객체 생성되고

	}

}
