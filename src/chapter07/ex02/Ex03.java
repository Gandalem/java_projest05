package chapter07.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		
		
//		배열 a : 7의 배수를 저장하는 배열 1~500까지
		int[] a = new int[500/7];
		for(int i=0, j = 7;i<a.length;i++,j+=7) {
				a[i] = j; 
			}
//		배열 b : 9의 배수를 저장하는 배열 1~500까지
		int[] b = new int[500/9];
		for(int i=0, j = 9;i<b.length;i++,j+=9) {
				b[i] = j; 
			}
		
		int[] c = arraySum(a,b);
		int[] d = arraySum1(a,b);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		}
//		두배열의 각방의 값을 더해서 출력
	public static int[] arraySum(int[] a,int[] b) {
		int[] c = new int[a.length];
		for(int i = 0 ;i<c.length;i++) {
			if(i<b.length){
				c[i] = a[i]+b[i];
			}else {
				c[i] = a[i];
			}
		}
		return c;
	}
	public static int[] arraySum1(int[] a,int[] b) {
		int[] c = new int[71];
		for(int i = 0 ;i<a.length;i++) {
			for(int j = 0;j<b.length;j++) {
				if(i>54) {
					c[i]=a[i]+0;
				}
				if(i==j) {
					c[i]=a[i]+b[i];
				}
			}
		}
		return c;
	}
	
	

}
