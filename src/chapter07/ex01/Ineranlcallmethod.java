package chapter07.ex01;

public class Ineranlcallmethod {

//	main : 메소드 <-static 이붙어있는 메소드
	public static void main(String[] args) {
//		클래스 내부에서 다른매소드 호출
//		main메소드는 메소드 이름앞에 public : 다른패키지에서 호출이 가능하다.
//		static : 인스턴스화 하지 않도록 사용 가능하다. : 객체를 생성하지 않고 사용가능하다.
		
//		print 메소드 호출(객체 생성 없이 바로 호출이 가능)
		print();
		
		System.out.println("======");
		
		System.out.println(twice(33)); // twice (int a)
		
		System.out.println("======");
		
//		sum 메소드 호출
		double bc = sum (4,5.0);
		System.out.println(bc);
		
		System.out.println(sum(8,11.5));
		
//		sum2눈 바로 호출시 오류가 발생 <- 객체화해서 호출
//		double de = sum2(20,33.3); //객체화 하지 않아서 오류발생
		
//		sum2 메소드 호출 : 인스턴스 메소드 : 객체화 해야 사용가능
		Ineranlcallmethod p1 = new Ineranlcallmethod();
		double cd = p1.sum2(33, 44.4);
		System.out.println(cd);
		
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
//	정수를 입력받아 2배로 돌려준다
	public static int twice(int a) {
		return a*2;
	}
//	
	public static double sum(int m,double n) {
		return m+n;
	}
	public double sum2(int m,double n) {
		return m+n;
	}
	

}
