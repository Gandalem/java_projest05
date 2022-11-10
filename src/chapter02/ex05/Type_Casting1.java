package chapter02.ex05;

public class Type_Casting1 {

	public static void main(String[] args) {
//		타입 변환(casting)
//		1. 캐스팅 방법 1
		int value1 = 5;
		double value2 = value1;
		int value3 = (int)value2; //integer은 정수값만 받을수있다 
		
		System.out.println(value3);
		
		long value4 = 10L; //long은 (long)을 리터럴 앞에 넣어주거나 L,l을 리터럴뒤에 붙여줘야한다
		long value5 = (long)10;
		System.out.println(value4); //정수의 기본은 integer이다
		System.out.println(value5);
		
		
		float value6 = 5.0F; //float은 (float)을 리터럴 앞에 넣어주거나 F,f을 리터럴뒤에 붙여줘야한다
		float value7 = (float) 5.0;
		System.out.println(value6); //실수의 기본는 double이다
		System.out.println(value7);
		
	}
	
}
