package chapter14.ex06;

//1. 예외 발생할때 각메소드 내부에서 예외를 직접 처리함.
class Aa{
	void abc() { //bcd() 호출
		bcd(); //bcd메소드 호출
	}
	void bcd() { //메소드 블럭해서 직접 예외 처리
		try {
			System.out.println(3/0);
			int[] arr= new int[] {1,2,3};
			System.out.println(arr[5]);
			Thread.sleep(1000);	
			
		}catch (ArithmeticException e) {
			System.out.println("A클래스 예외내부처리중 예외발생");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A클래스 예외내부처리중 예외발생");
		}catch (InterruptedException e) {
			System.out.println("A클래스 예외내부처리중 예외발생");
		}catch (Exception e) {
			System.out.println("A클래스 예외내부처리중 예외발생");
		}
	}
}
//예외를 전가 : 메소드를 호출하는쪽에서 예외를 처리하도록 : throws
class Bb{
	void abc() {
//		bcd() 메소드 호출 : 예외 처리
			try {
				bcd();
			}catch (ArithmeticException e) {
				System.out.println("A클래스 예외내부처리중 예외발생");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("A클래스 예외내부처리중 예외발생");
			}catch (InterruptedException e) {
				System.out.println("A클래스 예외내부처리중 예외발생");
			}catch (Exception e) {
				System.out.println("A클래스 예외내부처리중 예외발생");
			}
	}
	void bcd() throws Exception { //예외를 미루는것 : throws
		System.out.println(3/0);
		int[] arr= new int[] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
