package java2.day26_컬렉션프레임워크;

import java.util.List;
import java.util.Vector;

public class EX2_vector {
	public static void main(String[] args) {
	List<Board> list = new Vector<>();
	Thread tha = new Thread() {
		public void run()
		{
			for(int i=1;i<=1000;i++)
			{
				list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		}
		};
		
	Thread threadB = new Thread() {
		public void run() {
			for(int i=1;i<=1000;i++)
			{
				list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		};
	};
	tha.start();
	threadB.start();
	try {
		tha.join();
		threadB.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
	int size = list.size();
	System.out.println(size);
	}
}
