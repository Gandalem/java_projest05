package chapter07;

class Method {
	
//	필드는 생략
//	기본생성자도 생략
	
//	1. 리턴타입 : void + 매개변수 :없는 메소드
	void print() {
		System.out.println("안녕");
	}
//	2.리턴타입 : int + 매게변수 :없는 메소드
//	메소드를 호출시 돌려주는 값
	int data() {
		int a;
		a=3;
		return a;
	}
//	3. 리턴타입 : double + 매게 변수 2개인 메소드
	double sum(int a,double b) {
		
		return a+b;
	}
//	4. 리턴타입 : void + 내부에 리턴 포함(함수를, 종료 한다는 의미)
	void printMonth(int m) {
		if (m<0||m>12) {
			System.out.println("잘못된 입력입니다");
			return; //void로 선언됨 메소드 내에서 return을 사용하면 메소드를 종료
		}
		System.out.println(m+ "월 입니다");
	}
	
}

public class Method_Component {

	public static void main(String[] args) {
		
		/*
//		Method(메소드) : 실행블럭에 프로그램 기능 저장
//		- 호출시 작동,
//		- 리던타입
		void : 리턴 타입이 존재하지 않을때.
		int : 정수값을 리턴
		boolean : true,false 를 리턴
		double : 실수값을 리턴
		String:문자열을 리턴
		

*/
		
//		1.객체 생성 : class ==> Object(Instance)
		Method m = new Method();
//		2.method 호출 : m.메소드명
		m.print();
		
		int k = m.data(); // data()호출하는 순간 정수 3값이 리턴
		System.out.println(k);
		
		double l = m.sum(50, 60.6);
		System.out.println(l);
		
		m.printMonth(12);
				
		
		
		
		
		
	}

}
