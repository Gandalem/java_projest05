package chapter02.ex03;

public class Rage_Of_Varible {

	public static void main(String[] args) {
		// 변수의 사용 범위 (변수의 생존 기간) : 선언위치의 따라 생존범위가 달라진다
		int value1 = 3; //전역변수
		
		{
			int value2 = 4; //지역변수
			System.out.println(value1);
			System.out.println(value2);
		}
//		System.out.println(value2); 지역변수는 선언된 블락안에서만 사용이 가능하다.
		
	}

}
