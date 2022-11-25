package chapter11.ex02;

abstract class Student{
//	필드
	String name;
	Student(){}
	
	Student(String name){
		this.name = name;
	}
	
//	합계와 평균을 출력하는 메소드
	abstract void sum_avg();
		
	
	
}

class Student_Sub extends Student {
	
//	자식의 필드
	int kor; 	//국어 점수
	int eng; 	//영어 점수
	int math; 	//수학 점수
	Student_Sub(){}
	
	Student_Sub(String name,int kor,int eng,int math){
		super(name);
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

//	부모의 sum_avg() 메소드오버 라이딩 해서 객체의 kor, eng, math의 합계와 평균을 출력하는 메소드
	@Override
	void sum_avg() {
		int sum = kor+eng+math;
		double avg = sum/3;
		System.out.println("합계 : "+sum+" 평균 : "+avg);
	}

	@Override
	public String toString() {
		return "Student_Sub name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math+" ";
	}

	

	
	

	
	
	
}


public class Ex01 {

	public static void main(String[] args) {
//		상속, 업캐스팅, 다운 캐스팅객체를 배열에 저장된값을출력
//		5명의 객체 점수 학계 평균 구하기
//		생성자를 사용해서 객체 생성시 필드의 값을 할당하고
/*		홍길동 70 88 77
		이순신 80 68 87
		김똘똘 60 86 87
		홍길순 77 56 80
 		강감찬 55 66 77 
*/
//		student 배열 변수 arr변수에 모든 객체를 저장해서
//		배열의 값을 for문으로 출력할때 
//			오버라이딩된 메소드 출력 <그학생의 국어,영어, 수학의 합계,평균> 업
//			5명의 학생의 국어에대한 합계,평균 다운
//			5명의 학생의 영어에대한 합계,평균 다운
//			5명의 학생의 수학에대한 합계,평균 다운
		
		Student_Sub st1 = new Student_Sub("홍길동", 70, 88, 77);
		Student_Sub st2 = new Student_Sub("이순신", 80, 68, 87);
		Student_Sub st3 = new Student_Sub("김똘똘", 60, 86, 87);
		Student_Sub st4 = new Student_Sub("홍길순", 77, 56, 80);
		Student_Sub st5 = new Student_Sub("강감찬", 55, 66, 77);
		
		Student[] arr = new Student_Sub[] {st1,st2,st3,st4,st5};
		Student_Sub[] arr1 = (Student_Sub[]) arr;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			arr[i].sum_avg();
		}
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i=0;i<3;i++) {
			a += arr1[i].kor;
			b += arr1[i].eng;
			c += arr1[i].math;
		}
		
		System.out.println("국어 합계 : "+a+"  영어 합계 : "+b+"  수학 합계 : "+c);
		System.out.println("국어 합계 : "+a/5.0+" 영어 합계 : "+b/5.0+" 수학 합계 : "+c/5.0);

	}

}
