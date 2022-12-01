package chapter14.ex07;

import chapter14.ex07.Account;

public class Account_test {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.deposit(1000);
		System.out.println("현제 예금 금액은 : "+a1.getBalance()+"원 입니다.");
		
		try {
			a1.whithdrow(1000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
				

	}

}
