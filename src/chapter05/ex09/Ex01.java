package chapter05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 국어 영어 수학 과학    국어 영어 수학 과학      국어 영어 수학 과학
	홍길도 70 80 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		 메인 메소드 args로 아래와 같은 값이 인풋 되었을 경우 <출력>과 같이 출력 해보세요.
		 args: 홍길도 70 80 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		 
		 <for문을 사용해서 출력하세요>
		 
		 <출력>
		 국어 영어 수학 과학 <합계> <평균>
===================================
홍길동	 70  88  77  99
이순신	80 68 87 79
김똘똘	60 86 87 30
홀길순	77 56 80 99
===================================
<합계>
<평균>
		 */
		int sum =0;
		for(int i=0;i<args.length;i++){
			if(i!=0&&i!=5&&i!=10&&i!=15) {
				sum += Integer.parseInt(args[i]);
			}
		}
		
		double avg =sum/16.0;
		
		System.out.println("        국어     영어     수학     과학     <합계>     <평균>");
		System.out.println("=====================================================");
		for(int i=0;i<args.length;i+=5) { //i의변수값은 과목수+1(이름)
			output(args,i);
		}
		System.out.println("=====================================================");
		System.out.println("<합계>   "+sum+"\n<평균>   "+avg);
	}
	
//	public static String output(String name,String kor,String eng,String math,String sin) {
//		String a = null;
//		int sum = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math)+Integer.parseInt(sin);
//		double avg = sum/4.0;
//		System.out.println(name+"    "+kor+"      "+eng+"     "+math+"      "+sin+"      "+sum+"      "+avg);
//		
//		return a;
//	}
	public static String output(String arra[],int num) {
		String a = null;
		int sum = 0;
		int count=0;
		for(int i=num;i<arra.length;i++) {
			if(i==arra.length||count==4) { //count는 과목수 
				break;
			}else if(i==0||i==5||i==10||i==15){ //조건값은(이름이 들어가있는 인덱스 값)
				continue;
			}else {
				sum += Integer.parseInt(arra[i]);
				count++;
			}
		}
		double avg = sum/count;
		System.out.println(arra[num]+"    "+arra[num+1]+"      "+arra[num+2]+"     "+arra[num+3]+"      "+arra[num+4]+"      "+sum+"      "+avg);
//		위 실행문의 arra+*를 넣어서 과목의 점수를 출력
		return a;
	}
	
	

}
