package java2.day24.ex2;

public class gen {
	public static void main(String[] args) {
		Product<Tv, String> pro1 = new Product<>();
		
		Product<Integer, String> pro2 = new Product<>();
		pro1.setKind(new Tv());
		pro1.setModel("티비");
		
		pro2.setKind(30);
		pro2.setModel("숫자");
		
		System.out.println(1+pro2.getKind()+"오신기하다");
		

		long checktimestart = System.currentTimeMillis();
		for(int i =0;i< 1000000;i++)
		{
			Product<Integer, String> pro3 = new Product<>();
			pro1.setKind(new Tv());
			pro1.setModel("티비");
		}
		long checktimeend = System.currentTimeMillis();
		double savetime = (checktimeend-checktimestart)/1000.0;
		System.out.println(savetime);
		
		
		checktimestart = System.currentTimeMillis();
		for(int i =0;i< 1000000;i++)
		{
			Car qwe = new Car();
			qwe.setAsd("티비");
			qwe.setFgdfg(new Tv());
		}
		checktimeend = System.currentTimeMillis();
		savetime = (checktimeend-checktimestart)/1000.0;
		System.out.println(savetime);
		
	}
	
		
}
