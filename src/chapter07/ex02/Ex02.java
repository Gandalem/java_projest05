package chapter07.ex02;

public class Ex02 {
	public static void main(String[] args) {
		
	
	
//	두배열의 각방의 내용을 더해서 출력하는 메소드 생성
	
//	배열 a :4의 배수를 1 ~ 300까지
	int[] a = new int[300/4];
	int j=0;
	for(int i =1;i<a.length;i++) {
		if(i%4==0) {
			a[j]=i;
			j++;
		}
	}
//	배열 b :5의 배수를 1 ~ 300까지
	int[] b = new int[300/5];
	int k=0;
	for(int i =1;i<b.length;i++) {
		if(i%5==0) {
			b[k]=i;
			k++;
		}
	}
//	두배열의 각방의 값을 더해서 출력
	int[] c = arraySum(a,b);
	for(int i:c) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	int[] d = addArray(a,b);
	for(int i:c) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	}
//		두개의 배열을 인풋받아서 각 방의 값을 더해서 출력
//	addArray(int[] a,int[] b){ 

//	}
	
	public static int[] addArray(int[] a, int[]b) {
		int[] c = new int[a.length];
		for(int i=0;i<c.length;i++) {
			c[i] = a[i]+b[i];
			if(c[i]==0) {
				break;
			}
		}
		return c;
	}
	public static int[] arraySum(int[] a, int[]b) {
		int[] c = new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(i>59) {
					c[i] = a[i]+0;
				}
				if(i==j) {
					
					c[i] = a[i]+b[j];
					
				}
			}
		}
		return c;
	}
	
}
