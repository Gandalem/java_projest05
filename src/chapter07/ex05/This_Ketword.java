package chapter07.ex05;

class A{
//	필드 : heap영역에 저장
	int m,n;
//	메소드 : 정수값2개를 받음
	void init(int a,int b) { //메소드 내의 : a b c <- 지역변수 : stack 저장
		int c;
		c = 3;
		m = a; //this.m : this가 생략되있다
		n = b; //this.n : this가 생략되있다
	}
	void init2(int m,int n) {
		this.m = m; // 인풋 매개변수,실행블럭에 메게변수 ,필드의 변수
		this.n = n;
	}
	
	void work() {
		this.init (2,3); //this 자신의 객체의 필드나 메소드 호출.
		System.out.println(m+" "+n);
	}
	
	
}

public class This_Ketword {

	public static void main(String[] args) {
//		this 	: 자기 자신 객체의 필드나 메소드, <- 필드, 메소드에 적용
//		this()	: 자신 객체의 다른생성자 호출시 사용
//		super	: 상속에서 부모의 객체의 필드나 ,메소드를 사용
//		super()	: 부모 클래스의 생성자 호출 할때 사용
		
		A a =new A();
		a.work();
		
		
		
	}

}
