package chapter07.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
//		객체 생성, 메소드 호출 : main method 에서 호출
		
//		integer1, double1 객체 생성없이 바로 호출 : static메소드
		
		System.out.println(integer1(1,2,3));
		System.out.println("======");
		System.out.println(double1(1.0,2.2,3.3));
		System.out.println("======");
		Ex01 a = new Ex01();
		a.String1("마우스", 30000, 2);
		
	}
//	정수 3개를 입력받아서 더한값을 리턴하는 메소드(static)
	public static int integer1(int a,int b,int c) {
		return a+b+c;
	}

//	실수 3개를 입력받아서 더한값을 리턴하는 메소드(static)
	public static double double1(double a,double b,double c) {
		return a+b+c;
	}

//	문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static 을 사용하지 않는 메소드)
//	제품이름,제품수량,제품가격
//	객체를 생성해서
	
	public void String1(String a,int b,int c) {
		System.out.println("제품이름 : "+a+"\n제품수량 : "+b+"\n제품가격 : "+c);
	}
	
}
