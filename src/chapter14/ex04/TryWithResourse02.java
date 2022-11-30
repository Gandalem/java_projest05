package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;


public class TryWithResourse02 { //자동처리

	public static void main(String[] args) {
//		Try with Resource : java 1.7
//		일반적인 try구문 : try{}catch(Exception e){}
//		try with Resource : 
//			try(객체선언[Resource]) {} catch(Exception e){}
//			자동으로 객체를 close()
//			자동을 객체를 제거 하기 위해서는 AutoClosable()인터페이스를 구현 클래스만이 자동으로 제거됨
		
//		1.자동으로 객체를 제거하는예제
//			(Resource : 객체를 선언) <= 객체를 자동으로 close() 하게 된다.
//			InputStreamReader 는 AutoClosable 인터페이스를 구현하고 있다.
		System.out.println("한글자를 입력하세요");
		try(InputStreamReader ir1 = new InputStreamReader(System.in);){
			int num = ir1.read(); //일반예외:IOException
			char input = (char)num;
			System.out.println("입력한 글자는 : "+input);
		}catch(IOException e) {
			System.out.println("IOException 이 발생되었습니다.");
			e.printStackTrace();
		}
//		try(객체 선언 및 생성)
//		finally블럭에 close() 메소드를 사용하지 않더라도 자동으로 close() 됨

	}

}
