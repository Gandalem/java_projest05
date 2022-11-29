package chapter13.ex01;

// 아웃터 클래스
class C{
	int a = 5;
	int b = 4;
	
	int add (int a, int b) {
		return a+b;
	}
	
	int diff (int a, int b) {
		return a-b;
	}
	
	int mul (int a, int b) {
		return a*b;
	}
	
	double div (int a, int b) {
		return (double)a/(double)b;
	}
	//이너 클래스 : outer클래스의 메소드를 활용해서 기능을 구현
	class D{
		void abc() {
			System.out.println("두수의 덧셈은 : "+add(a,b));
			System.out.println("두수의 뺄셈은 : "+diff(a,b));
			System.out.println("두수의 곱셈은 : "+mul(a,b));
			System.out.println("두수의 나눗셈은 : "+div(a,b));
		}
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
//		1. 외부 객체 생성
		C c1 = new C();
//		2.내부 객체 생성
		C.D d1 = c1.new D();
		d1.abc();

	}

}
