package chapter13.ex03;

//static InnerClass : 외부 클래스에서 인스터늣 필드, 인스턴스 메소드 static Inner Class블럭에 올수없다.
// 외부 클래스의 정적 필드, 정적 메소드만 static Inner Class 블럭에 올수 있다.

//인스턴스 필드,
//

class A{ //Outer Class
//	외부 클래스에서 필드 선언
	int  a = 3;//인스턴스 필드
	static int b = 4; // 정적(static) 필드
//	외부 클래스에서 메소드 선언
	void method1() { //인스턴스 메소드
		System.out.println("인스턴스 메소드");
	}
	static void method2() { //정적 메소드
		System.out.println("정적 메소드");
	}
	
	static class B{ //static 이너 클래스 : static 필드 , static메소드만 포함할수 있다.
		void bcd() {
//			1. 외부 클래스의 인스턴스 필드, 메소드 : 접근불가
//			System.out.println(a); //인스턴스 필드
			System.out.println(b); //정적 필드
			
//			method1(); //인스턴스 메소드 : 접근불가
			method2(); //정적 메소드
		}
		
	}
}

public class InnerClass_static {

	public static void main(String[] args) {
//		static 이너 클래스 의 객체 생성 : 외부 클래스를 생성 하지 않고 바로 객체 생성이 가능
		
//		1. static 이너(내부) 클래스의 객체 생성
		A.B b = new A.B(); // 아웃터클래스.이너클래스 = new 아웃터클래스.이너클래스
		b.bcd();
		
	}

}
