package chapter07;

class Student{
	String stuName; 	//학생이름
	int stuNum; 		// 학번을 저장
	String stuAddr; 	//학생의 주소
	String stuPhone; 	//학생의 전화번호
	double weight; 		//학생의 몸무게

//	생성자 오버로딩,
//		기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
//	기본생성자
	Student() {}
	
//	매개변수 3개인 생성자
	Student(String stuName,int stuNum,String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
//	매개변수 5개인 생성자
	Student(String stuName,int stuNum,String stuAddr,String stuPhone,double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	
//	필드의 값을 출력하는 메소드 void print() {필드의 값을 출력}
	void print() {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학번 : "+stuNum);
		System.out.println("주소 : "+stuAddr);
		System.out.println("전화번호 : "+stuPhone);
		System.out.println("몸무게 : "+weight);
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		System.out.println("===기본생성자===");
		Student st1 = new Student();
		st1.print();
		System.out.println("===변수매개 3개===");
		Student st2 = new Student("홍길동",14,"홍길동로123");
		st2.print();
		System.out.println("===변수매개 5개===");
		Student st3 = new Student("홍길동",14,"홍길동로123","010-1234-5678",70.5);
		st3.print();
		
				

	}

}
