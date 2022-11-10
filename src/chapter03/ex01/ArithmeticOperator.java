package chapter03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
//		산술 연상자와 세가지 경우의 증감연산자.
		
//		1. 산술연산자
		System.out.println(2+3); //5 + : 더하기 (산술연산자)
		System.out.println(2+"3");//23 + : 정수랑 문자열 연결 (연결연산자)
		System.out.println(8-5);// - : 빼기
		System.out.println(7*2);// * : 곱셈 
		System.out.println(7/2); // /: 몫값만 출력
		System.out.println(8%5);// %: 나머지값만 출력
//		2. 증감 연산자
		int value1 = 3;
		value1 ++; // ++ : 1씩증가
		System.out.println(value1);
		
		int value2 = 3;
		value2 --; // -- : 1씩감소
		System.out.println(value2);
		
//		3. 증감 연산자(case 2)<<중요함>>
		int value3 = 3;
		int value4 = value3++;
		
		System.out.println(value3);
		System.out.println(value4);
		
		int value5 = 3;
		int value6 = ++value5;
		
		System.out.println(value5);
		System.out.println(value6);
		
//		4. 증감연산자의 사용 case 3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		int value10 =30;
		int value11 =40;
		int value12 =50;
		
		int value13 = 7 + --value10 + ++value11 + value12--;
		
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		
		

	}

}
