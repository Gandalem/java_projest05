package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		<문제> 1월 ~12월까지 월을 입력받아서 해당 월의 일수를 출력해주면 됩니다.
//		출력 : 1,3,5,7,9,11월은 31입니다.
//			  2월은 28일입니다.
//			  4,6,8,10,12,월은 30일입니다.
//		switch 문으로 작성
		Scanner sc =new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		switch(month) {
		case 1: case 3: case 5: case 7: case 9: case 11:
			System.out.println(month+"월은 31일 입니다.");
			break;
		case 2:
			System.out.println(month+"월은 28일 입니다.");
		case 4: case 6: case 8: case 10: case 12:
			System.out.println(month+"월은 30일 입니다.");
			break;
		default:
			System.out.println("1~12월 사이의 월만 입력해주세요\n프로그램종료입니다.");
			break;
		}

	}

}
