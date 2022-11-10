package chapter02.ex04;

public class Private_Datetype {

	public static void main(String[] args) {
		//자료형: 변수명 앞에 반드시 선언, 변수에 어떤값을 넣을지 지정(java,c,c++)
//			기본자료형 : boolean,byte,short,integer,long,float,double
//				메모리의 스테이지 공간의 저장
//			참조자료형 : String,배열,객체... 무한대로생성가능하다 대문자로 시작
//				메모리 heap 공간의 변수값이 저장됨
//					stack 공간에는 
//			리터럴 : 변수에 들어가는 값을 리터럴이라고한다
		
		// 1. boolean : true,false
		
		// 2. 정수 : byte,short,integer,long
//			byte : -128~127;
			byte value1 = -128;
			byte value2 = 127;
//			short : -32,768~32,767;
			short value3 = -32768;
			short value4 = 32767;
//			integer : -21억~21억 대다수 integer을 많이쓴다
			int value5 = -2147483648;
			int value6 = 2147483647;
//			long : 
//				long 의 변수에 값을 할당할때는 l, L을붙여서 저장해줘야한다
//				그렇지 않으면 integer로 인식하게 된다.(대문자로 넣는거를 권장한다.)
			long value7 = 1000L;
			
			
		// 3. 실수 : float,double
//			실수의 기본은 double이다
			float value8 =1.123456789F; //float으로 지정된 리터럴에 F,f로 지정해줘야한다 (대문자 권장) 정밀도 7자리
			double value9 = 1.123456789012345; //정밀도 15자리
		// 4. 문자 : char 한글자 밖에 못들어간다
//			변수의 값을 할당할때는 리터럴에 ''로 할당한다
//				char 자료형 변수에 직접 문자로 저장하는방법
			char value10 ='A';
			char value11 ='가';
			char value12 ='1';
//				정수값으로 문자를 저장하는방법(아스키 코드)
			char value14 = 65; //A
			char value15 = 0xac00; //가
			char value16 = 51; //3
//				유니코드로 저장 하는 방법 전세계 글자를 3byte로 저장
			char valure17 = '\u0041'; //A
			char valure18 = '\uac00'; //가
			char valure19 = '\u0033'; //3
			
			char name1 = '\uBC15';
			char name2 = '\uADDC';
			char name3 = '\uBBFC';
			
			System.out.print(name1 +""+ name2 +""+ name3);
 		
			
		// 5. 문자열 : String
//			변수의 값을 할당할때는 리터럴에 ""로 할당한다
			String value13 = "HelloWorld";
			
			System.out.println(value13);
		

	}

}
