package chapter06;


class Man {
//	필드
	String name="홍길동";
	int age=30;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight=70.5;
	
//	기본생성자는 생략됨 : Man () {}
	
//	메소드 :
	public  void add1() {
//		1~100까지2의배수를 출력하고 더한값을 출력
		int j = 0;
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				j +=i;
			}
		}
		System.out.println("\nsum : "+j);
	}
	public  void add2() {
//		1~500까지 3의배수를 출력하고 더한값을 출력
		int j = 0;
		for(int i=0;i<500;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
				j +=i;
			}
		}
		System.out.println("\nsum : "+j);
		
	}
	public  void add3() {
//		1~1000까지 1씩증가하고 4의배수만 출력되지 않도록 하고 더한값을 출력
		int j = 0;
		for(int i=0;i<1000;i++) {
			if(i%4!=0) {
				System.out.print(i+" ");
				j +=i;
			}
		}
		System.out.println("\nsum : "+j);
		
	}
	public  void add4(int num, int num2, double num3) { //num출력과 더할값,num2 정수 몇까지 출력할것인지,num3 제외시킬숫자(제외시킬숫자가 없다면 0을 넣어라)
		int j = 0;
		for(int i=0;i<num2;i++) {
			if(i%num==0&&i%num3!=0) {
				System.out.print(i+" ");
				j +=i;
			}
		}
		System.out.println("\nsum : "+j);
		
	}

}









public class Ex01 {

	public static void main(String[] args) {
//		객체 생성및 객체의 필드의 값이나 메소드 호출
		
		Man a = new Man();
		System.out.println("===2의 배수===");
		a.add1();
		System.out.println("===3의 배수===");
		a.add2();
		System.out.println("===4의 배수 제외===");
		a.add3();
		System.out.println("==================\n\n\n");
		System.out.println("===개선버전 2의 배수===");
		a.add4(2,100,0);
		System.out.println("===개선버전 3의 배수===");
		a.add4(3,500,0);
		System.out.println("===개선버전 4의 배수 제외===");
		a.add4(1,1000,4);
		System.out.println("======================");
		

	}

}
