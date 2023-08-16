package java2.day1.ex2;

public class Account {
	private long balance;
	public Account() {}
	public long getblance() {return balance;}
	public void deposit(int money)
	{
		balance += money;
	}
	public void withdraw(int money) throws 잔고부족예외{
		if(this.balance < money) 
		{
			throw new 잔고부족예외("잔고부족"+(balance-money)+"만큼부족");
		}
		balance -= money;
	}
}
