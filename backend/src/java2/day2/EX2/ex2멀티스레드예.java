package java2.day2.EX2;

public class ex2멀티스레드예 {
	static long check = 0;
	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						if(check == 10000000000l)
						{
							break;
						}
						check++;
					
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		
		long checktimestart = System.currentTimeMillis();
		th1.start();
		
		while(true)
		{
			if(check == 10000000000l)
			{
				break;
			}
			check++;
		}
		long checktimeend = System.currentTimeMillis();
		double savetime = (checktimeend-checktimestart)/1000.0;
		System.out.println(savetime);
		
		
		Thread th2 = new Thread(new j3());
		th2.start();
		try {
			int c = 0;
			while(true) {
				System.out.println("main out"+(++c)); 
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
