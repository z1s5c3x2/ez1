package java1.day16.EX2;

public class Taxi extends Vehicle{
	
	public String name;
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}