package chapter12.ex02;



public class Animal_Test {

	public static void main(String[] args) {
		
//		1.구현한 객체를 생성한후 Animal타입으로 지정함
//		Animal :인터페이스
		Animal c1 = new Cat();
		Animal d1 = new Dog();
		Animal T1 = new Tiger();
		Animal E1 = new Eagle();
		
//		2. Animal배열에 저장
		Animal[] arr = new Animal[] {c1,d1,T1,E1};
//		3. for문을 사용해서 오버라이딩 된 메소드 출력
		for(Animal i : arr) {
//			Animal의 cry() run() 호출시 ,구현한 클래스의 오버라이딜된 메소드를 호출
			System.out.println("====1====");
			i.cry();
			i.run();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("====2====");
			arr[i].cry();
			arr[i].run();
			
		}

	}

}
