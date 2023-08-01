package java1.day14.EX1_상속;

public class SmartPhone extends Phone{
	public boolean wifi;
	public SmartPhone(String model,String color)
	{
		this.model = model;
		this.color = color;
	}
	public void swetWifi(boolean wifi)
	{
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {System.out.println("인터넷에 연결");}
}
