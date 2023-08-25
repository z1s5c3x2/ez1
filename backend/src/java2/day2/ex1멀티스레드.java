package java2.day2;

public class ex1멀티스레드{
	
	public static void main(String[] args) {
		Thread th = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0 ;i<10;i+=2)
				{
					System.out.println(i);
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
			}
		});
		
		//th.start();
		//for(int i=1;i<1000;i+=2) {
		//	System.out.println(i);
		//}
		//비프음 a = new 비프음();
		Thread th1 = new Thread(new 비프음());
		th1.run();
		th1.run();
	}
}
