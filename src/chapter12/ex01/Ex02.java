package chapter12.ex01;

abstract class Cals2{ //사칙연산을 계산하는 계산기 클래스
	Cals2(){}
	
	abstract void add(int a,int b);	//더하기 연산
	abstract void diff(int a,int b);//마이너스 연산
	abstract void mul(int a,int b);	//곱하기 연산
	abstract void div(int a,int b);	//나누기 연산
}
class Cals_Impl2 extends Cals2{
	
	Cals_Impl2(){}
	
	@Override
	void add(int a, int b) {
		System.out.println("더하기 : "+(a+b));
	}
	@Override
	void diff(int a, int b) {
		System.out.println("빼기 : "+(a-b));
	}
	@Override
	void div(int a, int b) { //나누기
		double c = a;
		double d = b;
		
		System.out.println("나누기 : "+(c/d));
	}
	@Override
	void mul(int a, int b) { //곱
		System.out.println("곱하기 : "+(a*b));
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
//		1.구현클래스의 메소드 호출후 출력
		System.out.println("=======1번======");
		Cals2 c1 = new Cals_Impl2();
		c1.add(a, b);
		c1.diff(a, b);
		c1.div(a, b);
		c1.mul(a, b);
//		2.익명 클래스로 메소드 호출후 출력
		System.out.println("=======2번======");
		Cals2 c2 = new Cals2() {
			@Override
			void add(int a, int b) {
				System.out.println("더하기 : "+(a+b));
			}
			@Override
			void diff(int a, int b) {
				System.out.println("빼기 : "+(a-b));
			}
			@Override
			void div(int a, int b) { //나누기
				double c = a;
				double d = b;
				
				System.out.println("나누기 : "+(c/d));
			}
			@Override
			void mul(int a, int b) { //곱
				System.out.println("곱하기 : "+(a*b));
			}
			
		};
		c2.add(a, b);
		c2.diff(a, b);
		c2.div(a, b);
		c2.mul(a, b);
	}

}
