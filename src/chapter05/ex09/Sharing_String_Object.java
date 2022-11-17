package chapter05.ex09;

public class Sharing_String_Object {

	public static void main(String[] args) {
//		문자열 객체의 공유
		
//		1. 문자열 객체릐 공유 : 리터럴로 객체를 생성시 공유됨
//				new 생성자를 사용해서 객체를 생성할때는 공유되지 않는다. 별도의 송간에 생성됨
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = "안녕";
		String str5 = new String("안녕");
		
//		2.stack 메모리의 주소값 비교(== : stack의 값을 비교)
//			.equals() : Heap의 값을 비교 참조객체.equals(비교 객체);
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str2 == str4);
		System.out.println(str1 == str5);
		
		System.out.println("======");
//		3.equals() : Heap 영역의 값을 비교
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str4));
		System.out.println(str1.equals(str5));
	}

}
