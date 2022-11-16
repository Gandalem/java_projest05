package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		<문제>
		Scanner sc =new Scanner(System.in);
		
  
		do {
			System.out.println("====================================================================");
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4의 배수만 빼고 저장후 출력");
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의배수만 빼고 저장후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("====================================================================");
			System.out.println("위의 번호를 눌어서 입력해주세요 :");
			int n = sc.nextInt();
			
			if(n==1) {
				System.out.println("1번 7의 배수열, 8의 배수열 선택되었습니다. ");
				System.out.println("두배열의 크기를 입력해주세요 :");
				
				int a = sc.nextInt();
				
				int[] arr1 = new int[a];
				int[] arr2 = new int[a];
				for(int i=0,j=7,k=8;i<a;i++,j+=7,k+=8) {
					arr1[i] = j;
					arr2[i] = k;
				}
				System.out.println("7배수의 배열");
				for(int i : arr1) {
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println("8배수의 배열");
				for(int i : arr2) {
					System.out.print(i+" ");
				}
				System.out.println();
 				
				
			} else if(n==2) {
				
				System.out.println("2번 배열의 4의 배수만 제외가 선택되었습니다. ");
				System.out.println("배열의 크기를 입력해주세요 :");
				int a = sc.nextInt();
				
				int[] arr1 = new int[a];
				int b = 0;
				for(int i=0;i<a*100;i++) {
					if(b==a){
						break;
					} else if(i%4!=0) {
						arr1[b] = i;
						b++;
					} 
				}
				for(int i =0;i<arr1.length;i++) {
					System.out.print(arr1[i]+" ");
				}
				System.out.println();
				
			} else if(n==3) {
				
				System.out.println("3번 3의 배수열 중 6의배수만 제외가 선택되었습니다. ");
				System.out.println("배열의 크기를 입력해주세요 :");
				int a = sc.nextInt();
				
				int[] arr1 = new int[a];
				for(int i=0,j=3;i<a;j+=3) {
					if(j%6!=0) {
						arr1[i] = j;
						i++;
					}
				}
				for(int i:arr1) {
					System.out.print(i+" ");
				}
				System.out.println();
				
			} else if(n==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("1~4번의 해당하는번호만 입력해주세요");
			}
		}while(true);
		sc.close();
	}

}
