package chapter02.ex06;

public class Type_casting2 {

	public static void main(String[] args) {
//		자동 타입변환(Up casting) vs 수동타입변환(Down casting)
//		1. 자동 타입변환 (Up casting : 낮은 자료 형에서 높은 자료형으로 자동으로 변환)
//			byte -> short -> integer ->long , double -> float
		
		float value1 = 3; //integer -> float 으로 업캐스팅해서 들어감
		System.out.println(value1);
		
		long value2 = 5; //integer->long 으로 자동으로 업캐스팅
		System.out.println(value2);
		
		double value3 =7; // integer -> double 으로 자동 업캐스팅
		System.out.println(value3);
		
//		2. 수동으로 타입 변환(down casting : 높은 자료형에서 낮은 자료형으로 수동으로 변환)
		int value4 = (int)3.5; //double -> integer 로 다운캐스팅
		System.out.println(value4);
		long value5 = (long)5.3; //double -> long 로 다운캐스팅
		System.out.println(value5);
	}

}
