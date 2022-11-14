package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("=================================================");
		System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("=================================================");
		Scanner sc =new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("위 번호를 입력해주세요 :");
			n = sc.nextInt();
			if(n==1) {
				System.out.println("1.구구단 출력");
				for(int i=1;i<10;i++) {
					System.out.println(i+"단 출력");
					for(int j=1;j<10;j++) {
						System.out.print(i+"*"+j+" = "+(i*j)+" ");
					}
					System.out.println();
				}
			} else if(n==2) {
				System.out.println("2.19단 출력");
				for(int i=1;i<20;i++) {
					System.out.println(i+"단 출력");
					for(int j=1;j<20;j++) {
						System.out.print(i+"*"+j+" = "+(i*j)+" ");
					}
					System.out.println();
				}
			} else if(n==3) {
				System.out.println("3.19단중 7배수단만 출력");
				for(int i=1;i<20;i++) {
					if(i%7==0) {
						System.out.println(i+"단 출력");
					}
					for(int j=1;j<20;j++) {
						if(i%7==0) {
							System.out.print(i+"*"+j+" = "+(i*j)+" ");
						}
					}
						if(i%7==0) {
							System.out.println();
						}
				}
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