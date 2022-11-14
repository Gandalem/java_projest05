package chapter04.ex05;

public class Do_while_statement {

	public static void main(String[] args) {
		/*
		 * do ~while 문 : 실행문을 조건과 상관없이 1번은 실행 시킨후 조건의 따라 반복
		 * while 문: 조건에 만족해야지만 실행블럭을 실행한다.
		 * 
		 * ===while문===
		 * 초기식;
		 * while(조건){
		 * 
		 * 실행블럭;
		 * 증감식;
		 * }
		 * 
		 * 
		 * 
		 * ===do_while 문===
		 * 초기식
		 * do{
		 * 실행블락 ;
		 * 증감식 ;
		 * } (조건)
		 * 
		 * 1. while 문
		 */
		System.out.println("===while문===");
		int a = 0;
		while(a < 0) { //조건이 false 이므로 실행 블럭이 실행 안됨
			System.out.print(a+" ");
		}
		
//		2. do-while문
		System.out.println("===do-while 문===");
		a = 0;
		do {
			System.out.print(a+" "); //조건과 상관없이 실행문을 반드시 1번은 실행됨
		} while(a<0);
		
		
//		3. 반복횟수가 10 인 경우 while 문과 do-while문 비교
		System.out.println();
		System.out.println("===while 문을 사용해서 10번 출력");
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		System.out.println("===do-while문을 사용해서 10번 출력");
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);
	}

}
