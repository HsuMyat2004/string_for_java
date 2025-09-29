package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOne {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banana","Apple","PineApple", "Durain");
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		System.out.println("Result of comparator : " + list);
		
		Collections.sort(list, (a,b) -> a.compareTo(b));
		System.out.println(list);
	}
	
	
	
}
