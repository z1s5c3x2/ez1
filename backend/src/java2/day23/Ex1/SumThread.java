package java2.day23.Ex1;

public class SumThread implements Runnable{
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			sum +=i;
		}
		System.out.println(Thread.currentThread().getName()+sum);
	}
	
}
