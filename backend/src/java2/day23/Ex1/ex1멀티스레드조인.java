package java2.day23.Ex1;

public class ex1멀티스레드조인 {

	public static void main(String[] args) {
		SumThread tmp = new SumThread();
		Thread th1 = new Thread(tmp);
		th1.start();
		
		try {
			th1.join();
			System.out.println(th1.currentThread().getName()+"??"+tmp.getSum());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
