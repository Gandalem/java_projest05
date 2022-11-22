package chapter09.ex03;

class C {
	int a = 10; 		// 인스턴스 필드 : 객체화해서 사용가능, 다른 객체와는 공유되지 않는값
							//메모리의 Heap공간에 변수와 값을저장
	static int b = 20;	//정적 필드 : 객체화 하지 않고 사용 가능,
						// 모든 객체에서 공유되는 변수
							//메모리의 클래스 영역에 변수의 값을 저장,Heap영역에는
							//클래스 영역의 저장된 주소 값만 가진다.	
	
	void print1() {
		System.out.println(a + " "+b);
	}
	static void print2() { 	//정적 메소드 에는 인스턴스 필드가 올수 없다. a : 인스턴스 필드
		C c = new C();		//정적 메소드에서는 정적필드만 올수있다.
		System.out.println(c.a+" "+b);
	}
	
	
}


public class Instence_VS_Static02 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.a =100; //인스턴스 필드 : 자신의 객체에서만 적용. 공유X
		c1.b =777; //정적 필드 : 다른객체와 공유되는 공간
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		System.out.println("===");
		C c2 =new C();
		
		c2.a = 500; //a; 자신의 객체에만 적용되는고유한값
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		C c3 =new C();
		
		c1.a = 888;
		c2.a = 999; //a; 자신의 객체에만 적용되는고유한값
		c3.a = 777;
		c1.b = 111;
		C.b = 333; //모든 객체에서 공유되는 블럭
		
		System.out.println("===");
		System.out.println(c1.a); //인스턴스 필드 : 다른객체와 분리된 고유한공간
		System.out.println(c1.b); //정적 필드
		System.out.println(c3.a); //인스턴스 필드
		System.out.println(c2.a); //인스턴스 필드
		System.out.println(c2.b); //정적 필드
		System.out.println(c3.b);
		
		
		
	}

}
