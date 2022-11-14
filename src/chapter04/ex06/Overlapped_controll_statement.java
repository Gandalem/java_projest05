package chapter04.ex06;

public class Overlapped_controll_statement {

	public static void main(String[] args) {
//		제어문의 중복
//		1. if 구분내의 if구분
		
		System.out.println("===if 안에 if===");
		int value1=5;
		int value2=3;
		if(value1 > 5) { //false 
			if(value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else { //false 실행 블럭
			System.out.println("실행3");
		}
		System.out.println("===switch-for===");
		
		int value3 = 1;
		switch(value3) {
		case 1:
			for(int k =0;k<10;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
				break;
			
		case 2:
			for(int k=10;k>0;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
				break;
		}
		
		System.out.println("===for - for ===");
		
		for(int i=0;i<3;i++) {
			System.out.println("i : "+i+"일때");
			for(int j = 0;j<5; j++) {
				System.out.println(i+","+j);
				if(i==j) {
					System.out.println("i==j = "+i+" : "+j);
				}
			}
			System.out.println();
			
		}
		
		
	}

}
