package chapter07.ex02;

public class Ex01 {

	public static void main(String[] args) {
//		메소드 매개 변수로 배열을 Argument로 인풋
		int[] arr1 = new int[100/3];
		int j =0;
		for(int i=1;i<100;i++) {
			if(i%3==0) {
				arr1[j] = i;
				j++;
			}
		}
		int[] arr2 = new int[100/7];
		int k =0;
		for(int i=1;i<100;i++) {
			if(i%7==0) {
				arr2[k] = i;
				k++;
			}
		}
//		1 ~ 100까지 3의 배수의 배열을 생성후 메소드 호출 ,정수 : 5
		
		sum1(5,arr1);
		
//		1 ~ 100까지 7의 배수 배열을 생성후 , 정수 2
		
		sum1(2,arr2);
	}
	
//	메소드 : Static , 매개변수로 정수 1, 배열 1개를 인풋받아서
//	각방의 배열의 값을 인풋받은 정수로 곱해서 출력하는 배열
	public static void sum1(int a,int[] j) {
		for(int i =0;i<j.length;i++) {
		System.out.print((j[i]*a)+" ");
		}
		System.out.println();
	}

}
