package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		<문제> switch 문을 사용하여 프로그램밍 하세요
//		스캐너로 정수 1를 입력받으면 "금매달입니다."
//		정수 2를 입력받으면 "은매달입니다."
//		정수 3을 입력받으면 "동매달입니다."
//		그외 입력받으면 "메달이 없습니다."
		
//		<문제 Ex02.java> switch 문을 사용하여 프로그래밍 하세요.
//		스캐너로 정수 gold를 입력받으면 "금메달입니다"
//		silver를 입력받으면 "은메달입니다"
//		bronze를 입력받으면 "동메달입니다"
//		그외값을 입력받으면 "메달이 없습니다."
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력해주세요 :");
		int medal = sc.nextInt();
		switch (medal) {
		case 1:
			System.out.println("금매달입니다.");
			break;
		case 2:
			System.out.println("은매달입니다.");
			break;
		case 3:
			System.out.println("동매달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("==========\n무슨메달인지 적어주세요 : ");
		String medal2 = sc.next();
		sc.close();
		switch (medal2) {
		case "gold":
			System.out.println("금매달입니다.");
			break;
		case "silver":
			System.out.println("은매달입니다.");
			break;
		case "bronze":
			System.out.println("동매달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		
	}

}
