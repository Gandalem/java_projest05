package chapter10.ex05;

class Aaa {
	static void print() {
		System.out.println("Aaa클래스의 static메소드");
	}
}
class Bbb extends Aaa{
	static void print(){ //오류발생
		System.out.println("Bbb클래스의 static 메소드");
	}
}


public class Override_Static_Method {

	public static void main(String[] args) {
//		static method : 오버라이딩 되지 않는다.
//			클래스 영역에 메소드가 저장되어있다. 객체의 heap주소 (위치값만)가진다
		
//		1. 객체 생성 없이 클래스 이름으로 접근가능
		Aaa.print();
		Bbb.print();
		System.out.println("====");
		
//		2. 객체 생성후 출력
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		Aaa ab = new Bbb();
		
		a.print();
		b.print();
		ab.print();
		
	}

}
