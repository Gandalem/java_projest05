package chapter09.ex01;

public class A {
	public int a = 1; 		//외부패키지에서 접근이 가능
	protected int b = 2;	//외부패키지에서 접근이 가능(상속관계일때만가능)
	int c = 3;				//같은 패키지 내에서 만 접근이 가능
	private int d = 4;		//동일한 파일에서만 접근이 가능 

	
	public A() {}
	
	public void abc() {		//public		: 다른 패키지에서 접근가능
		System.out.println("public");
	}
	protected void bcd() {	//protected	: 다른 패키지에서 접근가능(단, 상속관계일 때만 적용)
		System.out.println("protected");
	} 
	void cde() {			//default	: 같은 패키지일때만 접근 가능
		System.out.println("default");
	}
	private void def() {	// private 	: 같은 파일에서만 접근 가능
		System.out.println("private");
	}	
		
}
