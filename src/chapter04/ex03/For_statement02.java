package chapter04.ex03;

public class For_statement02 {

	public static void main(String[] args) {
//		For 문이 특수한 형태(무한 루프)
//		--- for 문에서 조건이 생략될 경우 무한 루프
//		-- 초기식, 조건, 증감식이 모두 빠진경우도 무한루프
/*
* 
*
*		for(int i =0; ; i++) { // 조건이 생략되면 무한루프 <메모리가 풀 : 서버가 다운>
*			System.out.print(i+" ");
*		}
*/
//		for(;;) {
//			System.out.print("무한루프");
//		}
		System.out.println("======");
//		무한루프 탈출 : break;
		for(int i=0; ;i++) {
			System.out.println(i + " ");
			if(i>100) {
				break;  //break; 는 if 조건과 같이 사용한다.
			}
		}
		
	}

}
