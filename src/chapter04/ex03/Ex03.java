package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
//		<문제> : 2중 for문을 사용해서 1단 ~ 9단 출력 print \t
//		1단
//		1 * 1 = 1 1 * 2 = 2 .... 1 * 9 = 9
//		2단
//		2 * 1 = 2 2 * 2 = 4.... 2 * 9 = 18
//		....
//		9단
		for(int i = 1;i<=9;i++) {
//			단을 출력하는 변수 i
			System.out.println(i+"단 출력");
			for(int j =1; j<=9;j++) {
				System.out.printf("%d * %d = %d \t" , i,j,i*j);
			}
			System.out.println();
		}
	}
	
//	printf() 를 사용해서 추력부분 간결하게 처리

}
