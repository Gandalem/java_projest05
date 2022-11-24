package chapter10.ex05;

class A {
	int m = 3; //인스턴스 필드 : 오버라이딩 안됨
}
class B extends A{
	int m = 4; // 인스턴스 필드 :오버라이딩 안됨
}

public class Override_InstanceFeild {

	public static void main(String[] args) {
//		메소드 오버라이딩[인스턴스 메소드 오버라이딩]
//		 -- 인스턴스 필드	: 오버라이딩 안됨 , Heap공간에 값이 저장됨
//		 -- 정적필드		: 오버라이딩 안됨, 클래스 영역에 값이 저장
//		 -- 인스턴스 메소드	: 오버라이딩 됨, 인스턴스 메소드 영역에 메소드가 저장
//		 -- 정적메소드		: 오버라이딩 안됨, 클래스 영역에 값이 저장
		
//		객체생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
//		2. 인스턴스 필드 정보 출력
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); // <-4가 출력 되야기 오버라이딩 되는걸의미하는데 3이 나와서 오버라이딩이 안된다는걸 알수있다
		
		
	}

}
