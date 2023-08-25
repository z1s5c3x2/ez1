package java2.day2.ex3;

import java.time.LocalTime;
import java.util.Scanner;

public class ex3실행 {
	static Boolean asd = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new Runnable() {
			int sec = 0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while(asd)
					{
						Thread.sleep(1000);
						System.out.println("타이머"+(++sec)+"초");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		});
		th1.start();
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
				{
					System.out.println(LocalTime.now());
					try {
						Thread.sleep(990);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
		});
		th2.start();
		Scanner sc = new Scanner(System.in);
		
		asd = sc.nextBoolean();
		
		
	}

}
