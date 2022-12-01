package chapter14.ex07;

//1. 사용자 정의 일반예외(Checked Exception)
class MyException extends Exception { //Exception 하위 클래스 : 일반예외
//	사용자 정의 예외는 Exception 클래스를 상속해서 만들어야한다.
//	2개의 생성자 정의
	public MyException() { 	// 기본생성자
		super();			//Exception 객체의 기본생성자 호출
	}
	public  MyException(String message) {
		super(message);
	}
}

//2.사용자 정의 실행 예외 (UnChecked Exception RumTime Exception)
//	RunTimeException 을 상속해서 실행예외를 만듬
class MyRunTimeException extends RuntimeException{
	public MyRunTimeException () { //기본생성자
		super();
	}
	public MyRunTimeException (String message) {
		super(message);
	}
}

//사용자 정의 예외를 테스트 하는 클래스
class A{
//	1. 사용자 정의 예외 객체 생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메세지 : MyException");
	
	MyRunTimeException me3 = new MyRunTimeException();
	MyRunTimeException me4 = new MyRunTimeException("예외 메세지 : MyRunTimeException");
//	2.예외 던지기 (throws) : 던진 시점에서 예외 발생
//		throws : 예외 전가.
//		throw : 예외를 발생시킴.
//	예외를 내가 직접처리 : try~catch
	
	void abc_1(int num) {
		try {
			if(num > 70) {
				System.out.println("정상작동");
			}else {
				throw me2; //예외를 강제로 발생시킴
			}
		} catch (Exception e) {
			System.out.println("사용자 정의 예외가 처리됨");
			System.out.println(e.getMessage()); //Exception 클래스의 예외 메세지 클래스의 메소드
		}
	}
	void bcd_1() { //직접처리
		abc_1(65);
	}
//	2. 예외 전가
	void abc_2(int num) throws MyException{
		if(num>70) {
			System.out.println("정상작동");
		}else {
//			throw me1; //예외를 강제로 발생 시킴
			throw me2; 
		}
	}
	void bcd_2() {
		try {
			abc_2(65);			
		}catch(MyException e){
			System.out.println("사용자 정의 예외2가 발생됨");
			System.out.println(e.getMessage()); //생성자에 넣은 예외 메세지 출력
		}
	}

}
public class CreateUserException {

	public static void main(String[] args) {
//		사용자 정의 Exception : 자신이 직접 생성한 예외 (예:점수가 70점 이하면 예외를 발생 시켜라.
//			Exception 을 상속해서 자신의 예외를 생성할수있다.
		
//		객체 생성후 사용자 정의 예외가 잘 처리 되는지 확인
		A a = new A();
		a.bcd_1();
		System.out.println("============");
		a.bcd_2();

	}

}
