package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		if 문을 사용해서 
//		스캐너를 사용해서 가지고 있는 돈을 입금받습니다.
//		변수의 값이 0~3000원까지 입금을 받으면 "걸어서 다닙니다"
//		3000~30000원까지 입금을 받으면 "지하철을 타고 다닙니다"
//		30000~100000원까지 입금을 받으면 "택시를 타고 다닙니다"
//		100000원 이상 입금을 받으면 "비행기를 타고 다닙니다
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		sc.close();
		if(money >= 0 && money < 3000) {
			System.out.println("걸어서 다닙니다");
		} else if(money >= 3000 && money < 30000) {
			System.out.println("지하철을 타고 다닙니다");
		} else if(money >= 30000 && money < 100000) {
			System.out.println("택시를 타고 다닙니다");
		} else if(money > 100000) {
			System.out.println("비행기를 타고 다닙니다");
		} else {
			System.out.println("정확한 금액을 입금해주세요. 대출받은 금액은 안됨니다");
		}

	}

}
