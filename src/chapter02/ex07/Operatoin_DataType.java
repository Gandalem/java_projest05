package chapter02.ex07;

public class Operatoin_DataType {

	public static void main(String[] args) {
//		같은 자료형 간의 연산 vs 다른자료형 간의 연산

//		1. 같은 자료형간의 연산
		int value1 = 3 + 5; //3과 5가 더해진 값 8출력
		System.out.println(value1);
		int value2 = 8/5; // 8과 5를 나눴을때 몫값 1만 출력 
		System.out.println(value2);
		
		float data1 = 3.1F + 5.1F; //3.1과 5.1가 더해진 값 8.2출력
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0; //1.6 실수끼리 연산 출력값 실수
		System.out.println(data2); 
		
		double date3 = 8/5; //1.0 정수끼리 연산 출력값 정수
		System.out.println(date3); 
		
//		2. 다른자료형 간의 연산
//			작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산
		double date4 =8/5.0; //정수 8이 실수로 업캐스팅되서 연산
		System.out.println(date4); 
//		주위 : 실수연산중 정수로 변환해서 연산시 소수점이 다날라감
		
//		int date5 = 5 + 3.5; 정수 변수를 연산할때 정수값과 실수값이 연산중 소수점이 소실되서 에러가 발생한다
		
		double data5 = 5 + 5.5; //실수 변수 연상중 정수값과 실수값이 연산하면 정수가 실수로 업캐스팅 되서 문제없이 연산이 된다 
		System.out.println(data5); //10.5
		
		int date6 = 5 + (int) 3.5;
		System.out.println(date6); //8
		
		int date7 = (int) (5 + 5.5);
		System.out.println(date7);
		
		double date8 = 5/2.0 ; //정수 5가 double 로 업캐스팅
		System.out.println(date8);
		
		double date9 = 5/2;
		System.out.println(date9);
		
		int date10 = 50; //print메소드가 date10을 double로 업캐스팅해서 연산
		double date11 = 33.0;
		//up
		System.out.println(date10+date11); //83.0 다른자료형 연산
		//up
		System.out.println(date10/date11); //1.51.... 다른자료형 연산
		//down
		System.out.println(date10/(int)date11); //1 down casting후 같은 자료형연산
		
		//<문제>
//		국어:90,수학:88,영어:77,음악:90,과학:99
//		각 과목의 점수를 integer의 변수로 만들어서 저장한후 :합계(sum),평균(avg)값을 출력
		
		int n1,n2,n3,n4,n5;
		
		n1 = 90;
		n2 = 88;
		n3 = 77;
		n4 = 90;
		n5 = 99;
		double sum = n1+n2+n3+n4+n5;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/5);
		
		
	}

}
