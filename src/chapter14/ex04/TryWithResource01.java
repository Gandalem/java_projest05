package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource01 { //수동처리

	public static void main(String[] args) {
//		try구문에서 리소스 자동해제, 객체를 사용루 반드시 그객체를 제거(close())해서 메모리 를최적화
//		객체를 사용후 finally 블럭에서 객체를 제거함.
		
		System.out.println("문자를 입력하세요! : ");
//		1.리소스수동해제 : finally 블럭레서 객체를 close()메소드를 호출 해서 객체를 메모리에서 제거
//			콘솔을 사용해서 문자열을 입력받도록 하는 클래스 : InputStreamReader
		InputStreamReader ir1 = null;
		
//		일반 예외 (CatchedException) : 프로그램 작성시 컴파일 단계에서 오류
//			1. 예외를 남에게 전가하는방식 : throws 를 사용해서 호출하는 쪽에서 처리하도록 미루는 방법
//				메소드 블럭에서 적용됨, 메소드 를 호출하는곳에서 예외를 처리해야함
//			2. 예외를 직접 처리하는방식 : try~catch블럭을 만들어서 직접처리함
		
		ir1 = new InputStreamReader(System.in);
		try {
			char input = (char) ir1.read(); //예외처리가 되어야함. 일반에외 : IOException
			System.out.println("입력한 글자는 : "+input);
		}catch (IOException e) {
			System.out.println("IOException이 발생되었습니다. 하나의 문자만 넣어주세요");
			e.printStackTrace();
		}finally {
//			일반적으로 객체를 사용후 finally 블럭에서 객체를 제거함.
//				객체를 제거할때도 예외 처리가 되어야 됨.
			if(ir1 != null) { //객체가 null일때는 제거하지 않고,객체가 null아닐때 제거함.
				try {
					ir1.close(); //일반예외 : 반드시 예외 처리를 해야함.
				} catch (IOException e) {
					System.out.println("객체제거시 예외 발생됨");
					e.printStackTrace();
				}
			}
			System.out.println("프로그램 종료");
		}

	}

}
