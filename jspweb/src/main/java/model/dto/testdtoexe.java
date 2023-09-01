package model.dto;

public class testdtoexe {

	public static void main(String[] args) {
		testdto asd = testdto.builder()
				.asd1("test1")
				.asd2("test2")
				.asd3("test3").build();
		asd.setAsd5("gettertest1");
		System.out.println(asd.getAsd2());
		System.out.println(asd.getAsd5());
		System.out.println(asd.toString());
		
	}
}
