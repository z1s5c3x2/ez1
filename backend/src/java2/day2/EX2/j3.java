package java2.day2.EX2;

public class j3 extends Thread{
	public void run() {
		try {
			int c = 0;
			while(true) {
				System.out.println("작업2 out"+(++c)); 
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
