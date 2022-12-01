package chapter14.ex07;

class BalanceException extends Exception {
	public BalanceException(){
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}

public class Account {
	private long balance = 1000L; //예금의 잔고
	public Account() {} //기본생성자
	
	public long getBalance() { //getter : 호출시 balance필드의 값을 리턴 으로 돌려줌
		return balance;
	}
//	예금
	public void deposit(int money) { //기존의 잔고에서money를 입력받고 더해서 다시 필드에 적용
		balance += money;
		System.out.println(money+"원이 입금되었습니다.\n현제 예금의 금액은 : "+balance+"입니다.");
	}
//	예외처리
//	출금 : 
	public void whithdrow(int money) throws BalanceException {
//		잔고가 money 보다 작은경우 잔고 부족이라고 강제로 예외를 발생 시켜서 처리
//			예외 메세지 : 잔고가 부족합니다. 라고 출력을 해주면 됨
//			BalanceException < =사용자정의 예외를 생성해서
		if(balance<money) {
			System.out.println("현제 잔고 : "+balance+"\n출금 요청한 금액 : "+money);
			throw new BalanceException("예외 메세지 : 잔고가 부족합니다."+(money-balance)+"원이 모자랍니다.");
		}else if(money<0){
			System.out.println("출금 금액의 값이 마이너스입니다.");
		}else {
			this.balance -= money;
			System.out.println(money+"원 이 출금되었습니다.\n현제 남은 잔고는"+balance+"원 남았습니다.");
		}
	}

}
