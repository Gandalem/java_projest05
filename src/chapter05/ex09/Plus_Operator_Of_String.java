package chapter05.ex09;

public class Plus_Operator_Of_String {

	public static void main(String[] args) {
//		+ : 문자열일때 문자열을 연결
//		+ : 정수일때는 + 연산자로 사용
		
		String str1 = "안녕"+"하세요"+"!";
		System.out.println(str1);
		
		String str2 = "반갑";
		System.out.println(str2);
		str2 += "습니다.";
		System.out.println(str2);
		str2 += "!";
		System.out.println(str2);
		
//		2.문자열 + 기본자료형 연결(boolean,byte,short,int,long,float,double,char)
		String str3 = "안녕" +1;
		String str4 = "안녕" +false;
//			기본 자료형을 String 자료형으로 변환 : Strinng.valueOf(1);
		String str5 = "안녕" + String.valueOf(1);
		String str6 = "안녕" + "1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		
		
		
		
		
		
	}

}
