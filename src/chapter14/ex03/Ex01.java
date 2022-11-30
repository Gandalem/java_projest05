package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
//		3개의 예외를 하나의 try ~ catch 블럭에 넣고,
//			각각에 대해서 catch
//			3개의 예외를 한꺼번에 처리
		
		int[] arr = new int[] {1,2,3};
		
		try {
			System.out.println(3/0);
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}finally {
			System.out.println("1프로그램 종료");
		}
		
		System.out.println("====================");
		try {
			System.out.println(3/0);
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch (ArithmeticException e) {
			System.out.println("1한번에처리");
		}finally {
			System.out.println("2프로그램 종료");
		}
		
		System.out.println("===================");
		try {
			System.out.println(3/1);
			System.out.println(arr[5]);
			int num = Integer.parseInt("20A");
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e.getMessage());	//예외의 간단한 정보를 출력
			e.printStackTrace();				//예외의 자세한 정보 출력
		}finally {
			System.out.println("3프로그램 종료");
		}
		System.out.println("==================");
		try {
			System.out.println(3/0);
			
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}finally {
			System.out.println("4프로그램 종료");
		}
		
		try {
			System.out.println(arr[5]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}finally {
			System.out.println("5프로그램 종료");
		}
		
		try {
			int num = Integer.parseInt("20A");
			
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}finally {
			System.out.println("6프로그램 종료");
		}
		
		
		
		
	}

}
