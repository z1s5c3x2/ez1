package java2.day27.ex1hashset.ex2;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class ex2해시맵 {
	public static void main(String[] args) {
		HashMap<String,Integer> asd = new HashMap<>();
		asd.put("asd", 123);
		asd.put("asd1", 123);
		asd.put("a2sd", 123);
		asd.put("as3d", 123);
		asd.put("as4d", 123);
		asd.put("김찬희", 1004);
		asd.put("김영태", 8255);
		asd.put("김영태", 17175);
		asd.put("김영태", 858555);
		asd.put("김영태", 4242);
		asd.put("김영태", 07734);
		asd.put("김영태", 14);
		asd.put("다 해석하길 바라 ㅎㅎ", 999);
		
		asd.keySet().forEach(key -> {
			System.out.printf("key :%s value :%d \n",key,asd.get(key));
		});
		
	}
}

