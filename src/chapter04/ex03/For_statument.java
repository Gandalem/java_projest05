package chapter04.ex03;

public class For_statument {

	public static void main(String[] args) {
//		for 문 : 조건이 true 동안 실행블락을 반속 해서 처리, 조건이 false면 for문을 빠져나온다
		
		/*
		 * for (초기값;조건;증감식) {
		 * 실행 블락; //조건이 true일동안 반복,조건이 false면 빠져나온다
		 * }
		 * 
		 * for (초기값:배열) {
		 * 실행 블락; //조건이 true일동안 반복,조건이 false면 빠져나온다
		 * }
		 */
		int a;
		
		for (a=0;a<3;a++) {
			System.out.println(a);
		}
		System.out.println("======");
		
		for (int b = 0; b < 100; b++) { // 변수 b; 지역변수 ; for 블락 내에서만 사용함
			System.out.print(b + " ");
		}
		System.out.println("======");
		
//		int a; 전역변수 이므로 위에서 선언했으므로 다시선언 불가능
		for(a = 0;a <20; a += 3) {
			System.out.print(a + " ");
		}
		
		System.out.println("\n======");
		
		for(int b = 0; b< 20;b+=4) {
			System.out.print(b + " ");
		}
//		 초기값 100 부터 1 씩 빼면서 조건 1 > 0
		System.out.println("\n======");
		
		for (int i = 100;i>0;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n======");
		
		for(int i = 1000; i > 0; i-=3) {
			System.out.print(i +" ");
		}
//		여러개의 변수를 초기식 및 증감식에서 처리 가능
		System.out.println("\n======");
		for(int i = 0 , j = 0; i<100; i++ , j++) {
			System.out.println(i+ ","+j);
		}

		System.out.println("\n=== For 문을 사용해서 1단 출력===");
		
/*		<문제> : i * j = 1단 출력
*				1 * 1 = 1
*				1 * 2 = 2
*				....
*				1 * 9 = 9
*/			
		int i = 1;
		for(int j=1; j<=9; j++) {
			System.out.println(i+" * "+j+" = "+i*j);
		}
	}

}
