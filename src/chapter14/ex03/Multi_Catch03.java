package chapter14.ex03;

public class Multi_Catch03 {

	public static void main(String[] args) {
//		Exception : 모든예외으 ㅣ부모 클래스, try블럭의 모든 예외 를 처리
//			각 예외에 대한 새부적인 제어가 불가능
//		try {
//			System.out.println(3/0);
//			
//			int[] arr = new int[] {1,2,3};
//			
//			System.out.println(arr[5]);
//			
//			int num = Integer.parseInt("20A");
//		}catch (Exception e) {
//			모든예외를 Exception에서 받아서 처리
//		}catch (ArithemticException e) {
//			작동하지 않는 블럭이다
//		}catch (ArrayIndexOutOfBoundsException e) {
//			작동하지 않는 블럭이다
//		}catch (NumberFormatException e) {
//			작동하지 않는 블럭이다
//		}
		
		try {
			System.out.println(3/0);
			
			int[] arr = new int[] {1,2,3};
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		}catch (ArithmeticException e) {
//			1.try블럭의 예외에 대한 세부처리
		}catch (ArrayIndexOutOfBoundsException e) {
//			1.try블럭의 예외에 대한 세부처리
		}catch (NumberFormatException e) {
//			1.try블럭의 예외에 대한 세부처리
		}catch (Exception e) { //<= exception메소드는 다른예외를 모두 처리하고 마지막에 처리해야한다
//			그외의 모든예외를 Exception에서 받아서 처리
		}

	}

}
