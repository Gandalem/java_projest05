package chapter12.ex01;

abstract class Cals{ //사칙연산을 계산하는 계산기 클래스
	Cals(){}
	
	abstract int 	add	(int a,int b);	//더하기 연산
	abstract int 	diff(int a,int b);	//마이너스 연산
	abstract int 	mul(int a,int b);	//곱하기 연산
	abstract double div(int a,int b);	//나누기 연산
}
class Calc_Impl extends Cals{ //Calc 를 구현한 클래스
	
	Calc_Impl(){}
	
	
	@Override
	int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	@Override
	int diff(int a, int b) {
		int c = a-b;
		return c;
	}
	@Override
	double div(int a, int b) {
		double d = a;
		double f = b;
		double c = d/f;
		return c;
	}
	@Override
	int mul(int a, int b) {
		int c = a*b;
		return c;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
				
//		1. 구현클래스의 메소드 호출후 출력
		System.out.println("======1번=====");
		Calc_Impl c1 = new Calc_Impl();
		System.out.println("더하기:");
		System.out.println(c1.add(a, b));
		System.out.println("빼기:");
		System.out.println(c1.diff(a, b));
		System.out.println("나누기:");
		System.out.println(c1.div(a, b));
		System.out.println("곱하기:");
		System.out.println(c1.mul(a, b));
		
//		2. 익명 클래스롤 메소드 호출루 출력
		System.out.println("======2번=====");
		Cals c2 = new Cals() {
			@Override
			int add(int a, int b) {
				int c = a+b;
				return c;
			}
			
			@Override
			int diff(int a, int b) {
				int c = a-b;
				return c;
			}
			@Override
			double div(int a, int b) {
				double d = a;
				double f = b;
				double c = d/f;
				return c;
			}
			@Override
			int mul(int a, int b) {
				int c = a*b;
				return c;
			}
		};
		System.out.println("더하기:");
		System.out.println(c2.add(a, b));
		System.out.println("빼기:");
		System.out.println(c2.diff(a, b));
		System.out.println("나누기:");
		System.out.println(c2.div(a, b));
		System.out.println("곱하기:");
		System.out.println(c2.mul(a, b));
	}

}
