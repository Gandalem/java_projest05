package chapter14.ex03;

public class Multi_Catch01 {

	public static void main(String[] args) {
//		여러 예외가 동시에 발생된 경우처리
		
//		1. 두개의 Exception을 각각의 try~catch로 처리
		try {
			System.out.println(3/0); //실행시 예외 발생: (ArithmeticException)
		
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}finally {
			System.out.println("첫번째 프로그램 종료");
		}
		
		try {
			int num1 = Integer.parseInt("10A"); //실행시 예외발생 : (NumberFormatException)
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}finally {
			System.out.println("두번째 프로그램 종료");
		}
		
		System.out.println("======================");
//		2.하나의 try~catch에서 한꺼번에 처리
//			각각의 예외 대해서 각각처리하도록함.
		try {
			System.out.println(3/0);//실행시 예외 발생: (ArithmeticException)
		
			int num2 = Integer.parseInt("10A");//실행시 예외발생 : (NumberFormatException)
			
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException 발생");
		}finally {
			System.out.println("세번째 프로그램 종료");
		}
		System.out.println("====================");
//		3. 하나의 try~catch에서 한번에 처리
		try{
			System.out.println(3/0);//실행시 예외 발생: (ArithmeticException)
		
			int num2 = Integer.parseInt("10A");//실행시 예외발생 : (NumberFormatException)
		}catch (ArithmeticException | NumberFormatException e) {
			System.out.println("두개의 예외가 한번에 발생되었습니다.");
		}finally {
			System.out.println("네번째 프로그램 종료");
		}
		
	}

}
