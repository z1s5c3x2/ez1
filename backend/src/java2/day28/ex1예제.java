package java2.day28;

import java.util.TreeSet;

public class ex1예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(67);
		scores.add(37);
		scores.add(27);
		scores.add(47);
		System.out.println(scores);
		
		System.out.println(scores.descendingSet());
		System.out.println(scores.tailSet(80,true));
		System.out.println(scores.subSet(40, true,90,false));
	}

}
