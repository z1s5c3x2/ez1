package java2.day1.ex2;

public class 예외정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.deposit(10000);
		try {
			ac.withdraw(2000020);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
