package chapter16.ex04;

import chapter05.ex03.initinal_value;

//제너릭 클래스 : 타입 변수가 2개인 제너일 클래스<K,V>
//	T: Type
//	K: Key
//	V: Value
//	N: Number
class KeyValue<K,V>{
	private K key;
	private V value;
	
//	getter (필드의 값을 호출) , setter(필드의 값을 입력)
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class TwoGenerivArgument {

	public static void main(String[] args) {
//		1.<String, Integer>타입을 객체 생성
		KeyValue<String,Integer>kv1 = new KeyValue<>();
//		setter 를 사용해서 값 할당
		kv1.setKey("사과");
		kv1.setValue(1000);
//		getter를 사용해서 값출력
		String key1 = kv1.getKey();
		Integer vall = kv1.getValue();
		
		System.out.println("key : "+key1+"\nvalue : "+vall);
		
		System.out.println(kv1.getKey()+" , "+kv1.getValue());
		
//		2.<Integer,String>
		KeyValue<Integer,String> kv2 = new KeyValue<>();
		
//		setter를 사용해서 값 입력
		kv2.setKey(404);
		kv2.setValue("Not Found : 요청하신 페이지를 찾지 못했습니다.");
		
//		getter를 사용해서 값 출력
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
//		3.<String,void> < = void : 해당필드를 사용하지 않음.
		KeyValue<String,Void > kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		System.out.println(kv3.getKey());

	}

}
