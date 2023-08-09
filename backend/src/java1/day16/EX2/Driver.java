package java1.day16.EX2;

public class Driver {
	// 매개변수의 다형성 예제의 메소드 선언
	public void drive(int value, Vehicle vehicle) {
		/*
		 	객체명 instanceof 클래스명
		 	: 해당 객체가 해당 클래스의 타입이면 true/ or not false
		 */
		
		System.out.println("vehicle 타입확인 : "+(vehicle instanceof Bus));
		System.out.println("vehicle 타입확인 : "+(vehicle instanceof Taxi));
		System.out.println(vehicle.name);
		System.out.println("여기");
		vehicle.run();

		
		vehicle.run();
	}
}