package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		<문제> do-while 문으로 무한루프를 돌립니다
//		스캐너에서 1을 넣으면 "1. 평균 출력"으로 출력
//		스캐너에서 2을 넣으면 "2. 합계 출력"으로 출력
//		스캐너에서 3을 넣으면 "3. 이름 출력"으로 출력
//		4번을 넣으면 do while 문으로 빠져나옴 "프로그램 종료"
//		1~4 번 이외의 번호를 넣으면 "잘못된 입력입니다. 1 ~ 4 까지만 넣어주세요"
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 출력");
		System.out.println("=================================================");
		int n = 0;
		do {
			System.out.println("위 번호를 입력해주세요 :");
			n = sc.nextInt();
			if(n==1) {
				System.out.println("1.평균 출력");
			} else if(n==2) {
				System.out.println("2.합계 출력");
			} else if(n==3) {
				System.out.println("3.이름 출력");
			} else if(n==4){
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 1 ~ 4 까지만 넣어주세요.");
			}
		} while(true); 
			System.out.println("프로그램을 빠져나왔습니다.");
		
		sc.close();
	}

}
