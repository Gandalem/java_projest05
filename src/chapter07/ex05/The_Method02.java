package chapter07.ex05;

class Aa { //this() 사용하지 않고 생성자 작성
//	필드
	int m1,m2,m3,m4;
//	생성자
	Aa(){ //기본생성자 : 필드의 기본값 초기화
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		
	}
	
	Aa(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a,int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a,int b,int c){
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = 4;
	}
	Aa(int a,int b,int c,int d){
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = d;
	}
	
//	메소드 : 필드의 값을 출력하는 메소드
	void print() {
		System.out.println(m1 +" "+m2+" "+m3+" "+m4);
	}
	
	
}
class Bb{ //this() 사용하고 생성자 작성
	int m1,m2,m3,m4;
	Bb(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Bb(int a){
		this();
		m1 = a;
	}
	Bb(int a,int b){
		this(a);
		m2 = b;
	}
	Bb(int a,int b,int c){
		this(a,b);
		m3 = c;
	}
	Bb(int a,int b,int c,int d){
		this(a,b,c);
		m4 = d;
	}
	void print() {
		System.out.println(m1 +" "+m2+" "+m3+" "+m4);
	}
}

public class The_Method02 {

	public static void main(String[] args) {
//		this() : 생성자 내부에서 사용이 되고,첫라인에 위치해야하고, 자신의 객체의 다른생성자 호출
//			생성자를 여러게를 만들때 코드를 단순화
		Aa aa = new Aa();
		aa.print();
		Aa aa1 = new Aa(5);
		aa1.print();
		Aa aa2 = new Aa(5,6);
		aa2.print();
		Aa aa3 = new Aa(5,6,7);
		aa3.print();
		Aa aa4 = new Aa(5,6,7,8);
		aa4.print();
		System.out.println("=======");
		Bb bb = new Bb();
		bb.print();
		Bb bb1 = new Bb(5);
		bb1.print();
		Bb bb2 = new Bb(5,6);
		bb2.print();
		Bb bb3 = new Bb(5,6,7);
		bb3.print();
		Bb bb4 = new Bb(5,6,7,8);
		bb4.print();
	}

}
