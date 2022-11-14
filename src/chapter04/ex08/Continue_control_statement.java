package chapter04.ex08;

public class Continue_control_statement {

	public static void main(String[] args) {
//		continue : 제어문 내에서 사용되는 break와 비슷하게 사용 되는 키워드
//		-- 반복문 내에서 continue를 만나면 continue 아래 실행 블럭을 실행하지안고 증감식을 적용
		
//		1. 단일 loop에서 continue
		for(int i=0;i<10;i++) {
			continue; //break와 마찬가지로 단독으로 쓰이는 경우는 없다
//			System.out.println(i); //(도달할수 없는 코드다)continue 아래에 실행블럭은 실행되지 않고 증감식으로 이동 
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
			continue;
		}
		System.out.println();
		System.out.println("======");
		
//		continue도 if조건문과 같이 일반적으로 사용된다.
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===단일 단계만 적용===");
//		2. 다중loop문에서 continue 
//			2-1. 단일 단계만 적용
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					continue;
				}
				System.out.print(i+ ","+j+" ");
			}
			System.out.println();
		}
		System.out.println("===점프해서 이동(LABLE 을 사용)===");
//		2-2 점프해서 이동(LABLE 을 사용)
		
		pos2 : for(int i=0;i<5;i++) {
			for(int j=0; j<5;j++) {
				if(j==2) {
					continue pos2;
				}
				System.out.print(i+","+j+" ");
			}
			System.out.println();
		}
		System.out.println("======");
		
		
	}

}
