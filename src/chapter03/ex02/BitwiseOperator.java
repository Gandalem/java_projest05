package chapter03.ex02;

public class BitwiseOperator {

	public static void main(String[] args) {
		// 다양한 진법 표현과 비트 연산자
		// 1. 자바 코드를 사용해서 진법 변환(10진수,16진수,8진수,2진수)
		System.out.println("1. 자바 코드를 사용해서 진법 변환(10진수,16진수,8진수,2진수)");
		
		int data =13; // 10진수(DEX)
		System.out.println(Integer.toBinaryString(data)); 	//2진수로 변환(BIN)
		System.out.println(Integer.toOctalString(data)); 	//8진수로 변환(OCT)
		System.out.println(Integer.toHexString(data)); 		//16진수로 변환(HEX)
		
//		2. 2진수 , 8진수, 16진수, -> 10진수로 변환
		System.out.println("2. 2진수 , 8진수, 16진수, -> 10진수로 변환");
		System.out.println(Integer.parseInt("1101",2)); //2진수 -> 10진수
		System.out.println(Integer.parseInt("15",8)); 	//8진수 -> 10진수
		System.out.println(Integer.parseInt("d",16)); 	//16진수 -> 10진수
		
//		3. 다양한 진법을 표현함(0b : 2진수, 0 : 8진수, 0x : 16진수)
		System.out.println("3. 다양한 진법을 표현함(0b : 2진수, 0 : 8진수, 0x : 16진수)");
		System.out.println(0b1101);		//2진수
		System.out.println(015); 		//8진수
		System.out.println(0xd); 		//16진수
		
//		4. 비트 연산자(AND) : 모두 2진법으로 변환해서 각비트를 연산
		System.out.println("4. 비트 연산자(AND) : 모두 2진법으로 변환해서 각비트를 연산");
//			4-1, AND(&)
//				각각 정수를 2진법으로 바꾸고 자리수끼리 곱해서 나온 값을 2진수로 해석한다
//				0 & 0 = 0, 1 & 0 = 0, 0 & 1 = 0, 1 & 1 = 1
		System.out.println("AND(&)");
			System.out.println(3 & 10); //2 = 0011&1010
			System.out.println(0b0011 & 0b1010); //2
			System.out.println(0x03&0x0a);
//			4-2, OR(|)
//				0 | 0 = 0, 0 | 1 = 1, 1 | 0 = 1, 1 | 1 = 1
			System.out.println("OR(|)");
			System.out.println(3|10);
//			4-3, XOR(^)
//				0^0 = 1, 0^1 = 0, 1^0 = 0, 1^1 = 1
			System.out.println("XOR(^)");
			System.out.println(3^10);
//			4-4, NOT(~)
//				비트 위치를 정반대로 바꾼다
//				~0=1,~1=0 -1곱하고 1더한다고 생각하면된다
			System.out.println("NOT(~)");
			System.out.println(~3);
//				
		
	}

}
