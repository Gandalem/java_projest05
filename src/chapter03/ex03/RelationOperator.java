package chapter03.ex03;

public class RelationOperator {

	public static void main(String[] args) {
//		크기보교 연산자 vs 등가 비교 연산자
		
//		1. 크기비교 연산자(<, >, <=, >=) ==> true, false
		System.out.println("1. 크기비교 연산자(<, >, <=, >=) ==> true, false");
		System.out.println(5 > 2); //true
		System.out.println(5 < 2); //false
		
		System.out.println( 5 >= 5); //true
		System.out.println( 5 <= 5); //true
		
//		2. 등가 비교 연산자 (==, !=,) -> true, false
//			== : 같다면 true, 같지 않다면 false	
//			!= : 같다면 false, 같지 않다면 true
//			값이 같은지 다른지 비교하는 연산자
//			stack 메모리의 값을 비교
//			stack 에 값이 저장되는 것은 기본 자료형
		System.out.println("2. 등가 비교 연산자 (==, !=,) -> true, false");
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		System.out.println(a == c); //true
		System.out.println(a != c); //false
		
//		참조 자료형일때 (HEAP 영역에 값이 저장, stack 영역에는 heap에 번지수가 들어있다)
		
		System.out.println("참조자료형일때");
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
//			stack영역의 값을 비교 : ==
		System.out.println(str1 == str2); 		//false
//			참조 영역에서 값을 비교할때 .equals() 를 사용해서 값을 비교함.
//			heap 영역의 값을 비교알때는 .equals() 를 사용해야한다
//			객체변서1.equals(객체변수2) : heap 영역의 값을 비교
		System.out.println(str1.equals(str2));	//true
		
	}

}
