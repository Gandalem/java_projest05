package chapter03.ex04;

public class Logicaloperator {

	public static void main(String[] args) {
//		논리 연산자 vs 비트 연산자를 이용한 논리 연산자
		
//		1. 논리연산자(AND( && ), OR( || ), XOR( ^ ), NOT( ! ))
//			쇼트 서킷이 발생됨 AND( && ), OR( || )
//		1-1. AND(&&)
//			true && true = true
//			false && true = false
//			true && false = false
//			false && false = true
		System.out.println("AND(&&)");
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
//		OR(||)
//		true || true = true
//		true || false = true
//		false || true = true
//		false || false = false
		System.out.println("OR(||)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
//		XOR(^) 두값이 같을때 false 다를때 true
		
		System.out.println("XOR(^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
//		NOT( ! )
//		! true = false , ! false = true
		System.out.println("NOT( ! )");
		System.out.println( ! true);
		System.out.println( ! false);
		
//		2. 비트연산자로 논리연산이 가능하다, 소트서킷을 발생하지 않도록처리
		System.out.println(true & true);
		System.out.println(false | false); 
		System.out.println(true | (5 < 3));
		System.out.println(true ^ true);
//		System.out.println(~ true);
		System.out.println(! true);
		
//		3. 쇼트 서킷 : 논리 연산자에서 
		System.out.println("쇼트 서킷");
		System.out.println( false && true);
//			AND 연산자에서는 적용값이 false가 오게되면 뒤의 값이 어떤값이 오더라도 false
		
		System.out.println(true || true); //쇼트 서킥이 발생됨
//		OR 연산에서 처음 값이 true 이면 쇼트 서킷이 발생함
		int vaule1 =3;
		System.out.println( true & ++vaule1 > 6);
		
		int vaule3 =3;
		System.out.println( true || ++vaule3 > 6);
		
		int vaule4 =3;
		System.out.println( true | ++vaule4 > 6);
		
		

	}

}
