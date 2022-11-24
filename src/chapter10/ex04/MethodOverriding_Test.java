package chapter10.ex04;

class Animal{
//	Animal 필드
	String Name;
	int age;
	
//	기본생성자가 생략되어있다. Animal(){}
	Animal(){}//기본생성자
//	매게변수 2개인 생성자
	Animal(String Name,int age){
		this.Name = Name;
		this.age = age;
	}
	
//	Animal 메소드
	void cry() {
		System.out.printf("%s는 ㅁㅁ하고 웁니다.\n나이는 %d살이다\n",Name,age);
	}
}

class Tiger extends Animal{
	
	int tigerNo;
	
	Tiger(){} //기본생성자
	
	Tiger(String Name, int age) { //매게변수 2개인 생성자
		super(Name, age);
	}
//	tiger메소드
	void tigerMethod() {
		System.out.println("tiger 클래스의 메소드");
	}
//	Animal의 상속받은 메소드
	@Override
	void cry() {
		System.out.printf("%s는 어흥하고 웁니다.\n나이는 %d살이다\n",Name,age);
	}
}

class Eagle extends Animal {
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}

	@Override
	void cry() {
		System.out.printf("%s는 짹짹하고 웁니다.\n나이는 %d살이다\n",Name,age);
	}


}

class TigerChild extends Tiger{
	
	int tigerChild;
	
	void tigerChildMethod() {
		System.out.println("TigerChild 클래스의 메소드");
	}
	
	@Override
	void cry() {
		System.out.printf("%s는 어흥하고 웁니다.\n나이는 %d살이다\n",Name,age);
	}
	
	
}

public class MethodOverriding_Test {

	public static void main(String[] args) {
//		메소드 오버라이딩 : 상속관계 에서 부모클래스의 메소드를 자식 클래스에서 재정의
		
//		1.객체 타입
//		a1 : Animal를 내포 하고있는 Animal 의 필드와 메소드 접근
		Animal a1 = new Animal();
		a1.Name="동물이름";
		a1.age=10;
		a1.cry();
		
		
		System.out.println("=======");
//		2.tiger 객체를 생성하면서tiger type으로 지정
//		t1 은 Animal과 Tiger을 내포하있고, Tiger타입으로 지정(Tiger의 필드와 메소드,Animal의 필드와 메소드 접근가능하다)
		Tiger t1 = new Tiger();
//		부모의 필드와 메소드 호출
		t1.Name = "호랑이1";
		t1.age = 5;
		t1.cry();
		System.out.println("======");
//		자식의 필드와 메소드 호출
		t1.tigerNo=9;
		t1.tigerMethod();
		t1.cry();
		
//		3. Tiger 객체를 생성하면서 Animal타입으로 지정(Animal의 필드와 메서드만 접근)
//		a2 : Animal 객체를 Tiger타입으로 지정(Animal 접근가능 하지만 내용은 Override된 Tiger내용만 출력된다)
		Animal a2 = new Tiger();
//		Animal 의 필드와 메소드만 접근가능
		a2.Name="호랑이2";
		a2.age=5;
		a2.cry(); //오버라이딩 된 tiger의 cry메소드 가호출됨
		
		System.out.println("=========");
//		다운캐스팅 : a2는 Animal, Tiger포함 하고있고 Animal타입이다
		
		Tiger t2 = (Tiger)a2; //다운캐스팅 할때는 instance of 를 사용해야 한다.
		if(a2 instanceof TigerChild) {
			TigerChild t3 = (TigerChild)a2; //컴파일할때는 문제 없지만 실행할때 오류가 발생한다
		} else {
			System.out.println("tiger child를 내포하고있지 않습니다.");
		}
		
		System.out.println("=======");
//		TigerChild 객체를 생성하면서 Animal 타입으로 지정 ?? tigerChild타입에 Animal 생성자 아닌가?  이상하네...
//		a4 : animal, tiger, tigerChild 내포하고있다
		Animal a4 = new TigerChild(); //업캐스팅됨 TigerChild는 Animal로 자동으로 변환
		a4.cry();
		
		Tiger t10 = (Tiger) a4;// Animal을 수동으로 Tiger로 다운캐스팅
		t10.cry();
		
		TigerChild tc10 = (TigerChild)t10; // tiger을 수동으로 TigerChild롤 다운캐스팅 (변환타입 명시 필수)
		tc10.cry();
		
		System.out.println("=======");
//		업캐스팅
		Animal a20 = tc10; //TigerChild는 Animal로 자동으로 변환해서 업캐스팅됨(타입을 명시 X) 
		
//		배열의 객체를 저장하고 내용을 출력 하기위한 객체생성, Animal 타입으로 지정
		Animal a29 = new Animal(); //a29 : Animal 
		Animal a30 = new Tiger(); //a30 : Animal,Tiger
		Animal a31 = new Eagle();//a31 : Animal,Eagle
		Animal a32 = new TigerChild();//a32 : Animal,Tiger,TigerChild
		
//		배열의 Animal타입의 객체 저장
		Animal[] arr1 = new Animal[] {a29,a30,a31,a32};  
		
//		배열의 값을 출력 : 향상된 for문을 사용해서 출력
		for(Animal k : arr1) {
			k.cry();
		}
		System.out.println("=======");
//		배열의 값 출력 : for 문을 사용래서 출력
		for(int i =0;i<arr1.length;i++) {
			Animal aa = arr1[i];
			aa.cry();
		}
		System.out.println("=======");
		for(int i =0;i<arr1.length;i++) {
			arr1[i].cry();
		}
		System.out.println("=======");
//		객체 변수를 블럭 밖에서 선언루 출력
		Animal  aaa = null; //Animal 객체형 변수 ,초기화 할때 null을 사용
		String[] aaa01 = new String[] {"동물","호랑이","독수리","어린호랑이"};
		for(int i=0;i<arr1.length;i++) {
			aaa = arr1[i];
			aaa.Name = aaa01[i];
			aaa.age = i+1;
			aaa.cry();
		}
		
	}

}
