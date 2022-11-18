package chapter07;

class MethodOverloading{
	
//	메소드 오버로딩 : 동일한 이름의 메소드를 시그니쳐에 따라서 다른 메소드를 호출하는것
//		시그니쳐(식별자) :메소드의 입력 매개변수 개수,매개변수의 데이터 타입 <==
	
	
	void print() { //print (): 인풋 매개변수가 없는메소드
		System.out.println("데이터가 없습니다.");
	}
	void print(int a) {//print(int a) : 인풋 매개변수에 정수1개를 입력받는 메소드
		System.out.println("int : "+a);
	}
	void print(double a) {
		System.out.println("double : "+a);
	}
	void print(int a,int b) {
		System.out.println("int 2개 : "+a+","+b);
	}
	void print(double a,int b) {
		System.out.println("double 1개 int 1개 : "+a+","+b);
	}
	
	void print(int c,double k) {
//		시그니쳐 중복 항목이 없다.
	}
//	메소드 오버로딩 위배
	/*
	void print(double g,int k) {
		
	}
	*/
}


public class Method_Overloding {

	public static void main(String[] args) {
//		메소드 오버로딩 : 동일한 이름의 메소드를 시그니쳐에 따라서 다음 메소드를 호출하는것
//			시그니쳐 :메소드의 입력 매개변수 개수,입력되는 타입이 다를경유 다은 메소드로 식별
//		
//		메소드 오버라이딩 : 상속 에서만 적용됨
//			부모클래스에서 선언된메소드를 자식 클레그에서 재정의 해서 사용되는것
		MethodOverloading mo =new MethodOverloading();
//		1. 매개변수가 없는 메소드 호출
		mo.print();
//		2. 매개변수가 1개인 정수
		mo.print(0);
//		3. 매개변수가 1개인 실수
		mo.print(0);
//		4. 매개변수가 2개인 정수
		mo.print(0,1);
//		5. 매개변수가 2개인 정수,실수
		mo.print(0.0,1);
	}

}
