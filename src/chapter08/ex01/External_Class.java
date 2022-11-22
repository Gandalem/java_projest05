package chapter08.ex01;

class A{ 	//다른 패키지에서 접근이 불가 , 같은 패키지 내에서만 접근이 가능
			//다른 패키지에서 접근이 가능하도록 할려면 별도의 파일로 클래스를 생성후 public
	int a;
	int b;
	A(){
		this.a = 1;
		b=2;
	}
	void print() {
		System.out.println(a+ " "+b);
	}
	
}






public class External_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
