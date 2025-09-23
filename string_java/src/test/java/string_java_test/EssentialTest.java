package string_java_test;

import org.junit.jupiter.api.Test;

public class EssentialTest {
	@Test
	void test1() {
		Integer i1 = Integer.valueOf("123"); // String to Integer
		System.out.println(i1);
		
		Integer i2 = Integer.parseInt("124"); // String to Integer
		System.out.println(i2);
		
		int i3 = 125; //integer to String
		String str1 = Integer.toString(i3);
		System.out.println(str1);
		
		Integer i4 = 126; //Integer to String
		String str2 = i4.toString();
		System.out.println(str2);
		 
		int i5 = 127; // integer to String
		String str3 = String.valueOf(i5);
		System.out.println(str3);
		
		StringBuilder parallel = 
				new StringBuilder("Hello Java")
				.reverse()
				.append(true)
				.insert(1, 79); // immutable
		String str4 = parallel.toString(); //mutable
		System.out.println(parallel);
		System.out.println(str4);
	}
}
