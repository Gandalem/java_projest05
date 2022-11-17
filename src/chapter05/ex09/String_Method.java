package chapter05.ex09;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
//		String 클래스에서 사용되는 주요 메소드(함수)
//			기본자료형 : boolean,byte,short,int,long,double,float,char 
//			참조자료형 : 배열,열거,객체,인터페이스 < 첫자는 전부 대문자
		
//		1. 문자열의 길이(length())
//		[참조]자료형 [참조]변수
		String str1 ="Hello Java!";
		String str2 ="안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length()); //문자열의 길이	11자
		System.out.println(str2.length()); 			//	13자
		
		System.out.println();
//		2. 문자열 검색(charAt(),indexOf(),lastIndexOf())
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		
		System.out.println();
		// indexOf(),lastIndexOf();
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('a',8));
		System.out.println(str2.indexOf('안'));
		System.out.println(str2.indexOf('안',8));
		System.out.println("======");
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf('a',8));
		
		System.out.println();
		
		System.out.println(str2.lastIndexOf('안'));
		System.out.println(str2.lastIndexOf('안',8));
		
		
		System.out.println("======");
		
//		문자열을 검색 해서 방번호를 출력
		System.out.println(str1.indexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str1.indexOf("ello"));
//			문자열 검색의 실패시 값-1를 리턴 시켜준다
		System.out.println(str1.indexOf("bye"));
		
//		3. 문자열 변황 및 문자열 연결 : String.valueOf(),concat()
//		String.valueOf() : 기본 자료형을 => String 자료형으로 변환
		
//		String str3 = 2.3; //오류 발생 2.3 (double 형 데이터를 String 에 저장시 오류)
		String str3 =String.valueOf(2.3);
//		String str4 =true; //boolean 타입을 String 변수에 저장시 오류 발생
		String str4 =String.valueOf(true);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("======");
		
//		concat() : + 연산자와 같은 문자열과 문자열을 연결시켜주는 메소드
		String str5 =str3.concat(str4);
		String str6 =str3 + str4;
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println("======");
//		string.valueOf() + concat() ==>+
		String str7 = "안녕" +3;
		String str8 ="안녕".concat(String.valueOf(3));
		System.out.println(str7);
		System.out.println(str8);
		
//		4. 문자열 => byte[] (getBytes())
//		   문자열 => char[] (toCharArray())
		
		String str10 = "Hello java!";
		String str11 = "안녕하세요! 반갑습니다.";
		
//		getBytes(); : 문자열을 한자씩 잘라서 아스키코드로 변환해서 byte배열에 저장한다
		byte[] arr1 =str10.getBytes();
		byte[] arr2 =str11.getBytes();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("======");
//		toCharArray()
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr3[1]);
		
//		5. 문자열 수정, 대문자로 출력: toUpperCase(), 소문자로 변환 : toLowerCase()
		System.out.println(str1.toLowerCase()); //소문자
		System.out.println(str1.toUpperCase()); //대문자
		
		System.out.println("======");
//		6. 문자열 수정 : replace("수정할 부분","수정할 내용");
//					  subString(시작부분,잘라낼 마지막 부분);
		String str13 = "안녕 자바 World";
		
		System.out.println(str1.replace("Hello","안녕"));
		System.out.println(str13.replace("World", "월드"));
		
//		subString(0,5) :0 번방에서 부터 5번방까지 잘라서 출력
		System.out.println(str13.substring(0,2)); // 0번에서 시작해서 2번방 앞까지 출력한다
//		모든프로그램 에서 시작은 포함, 끝은 미포함
		System.out.println(str13.substring(3,5));
//		split() : 특정 문자를 기준으로 문자열을 잘라서 배열안에 저장
		String[] strArray="abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		System.out.println("======");
		
		//trim() : 문자열  앞, 뒤의 공백을 제거하는 메소드
		
		System.out.println("       abc    ".trim());
		
		System.out.println("======");
		
//		6. 문자열의 내용비교 (equals(),equalsIgnorecase())
		
//			equals() : Heap의 값을 비교, 대문자 소문자 까지 체크
//			equalsIpnoreCase() : Heap 의 값비교, 대,소문자를 체크하지 않고 비교
		String str20 = new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");
		
//		== : Stack메모리의 참조 주소 비교.
		
		System.out.println(str20==str21);
		System.out.println(str21==str22);
		System.out.println(str20==str22);
		System.out.println("======");
		
//		equals() : 대소문자를 체크하면서 Heap의 값을 비교
		System.out.println(str20.equals(str21));
		System.out.println(str21.equals(str22));
		System.out.println(str21.equalsIgnoreCase(str22));
		
		
		
	}

}
