package chapter07.ex05;

class Student{
//	필드 선언
	String stuName; 	//학생이름 : 학생 이름 없음
	int stuNo;			//학번 : 0
	String stuPhone;	//헨드폰 번호 : 000-0000-0000
	String stuAddr;		//주소 : 서울 
	int stuAge;			//나이 : 0
	double stuWeight;	//몸무게 : 0.0
	
	Student() { //기본자료형 초기값을 할당 : this()메소드를 사용해서 각필드의 값을 적용
		this.stuName = "학생 이름 없음"; 	
		this.stuNo = 0;			
		this.stuPhone = "000-0000-000";	
		this.stuAddr = "서울";		
		this.stuAge = 0;			
		this.stuWeight = 0.0;
	}
	Student(String stuName) {
		this();
		this.stuName = stuName;
	}
	Student(String stuName,int stuNo) {
		this(stuName);
		this.stuNo = stuNo;
	}
	Student(String stuName,int stuNo,String stuPhone) {
		this(stuName,stuNo);
		this.stuPhone = stuPhone;
	}
	Student(String stuName,int stuNo,String stuPhone,String stuAddr) {
		this(stuName,stuNo,stuPhone);
		this.stuAddr = stuAddr;
	}
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge) {
		this(stuName,stuNo,stuPhone,stuAddr);
		this.stuAge = stuAge;
	}
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge,double stuWeight) {
		this(stuName,stuNo,stuPhone,stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}
	
	
	void print() {
		//필드의 내용을 출력
		System.out.println("학생이름 : "+stuName);
		System.out.println("학번 : "+stuNo);
		System.out.println("핸드폰 번호 : "+stuPhone);
		System.out.println("주소 : "+stuAddr);
		System.out.println("나이 : "+stuAge);
		System.out.println("몸무게 : "+stuWeight);
		
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.print();
		System.out.println("=======");
		Student st1 = new Student("홍길동");
		st1.print();
		System.out.println("=======");
		Student st2 = new Student("홍길동",21);
		st2.print();
		System.out.println("=======");
		Student st3 = new Student("홍길동",21,"123-1234-1234");
		st3.print();
		System.out.println("=======");
		Student st4 = new Student("홍길동",21,"123-1234-1234","서울특별시");
		st4.print();
		System.out.println("=======");
		Student st5 = new Student("홍길동",21,"123-1234-1234","서울특별시",21);
		st5.print();
		System.out.println("=======");
		Student st6 = new Student("홍길동",21,"123-1234-1234","서울특별시",21,81.5);
		st6.print();
		System.out.println("=======");
		
	}

}
