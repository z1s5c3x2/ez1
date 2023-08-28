package java2.day27.ex1hashset;

import java.util.HashSet;
import java.util.Set;

public class ex1예제 {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		System.out.println(set);
		
		set.add("java");
		System.out.println(set);
		set.add("JDBC");
		System.out.println(set);
	}
}
