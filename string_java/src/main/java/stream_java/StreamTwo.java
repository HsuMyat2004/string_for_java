package stream_java;

import java.util.List;

public class StreamTwo {
	public static void main(String[] args) {
		var numbers = List.of(1,2,3,4,5);
		
		numbers.stream().peek(n -> System.out.println(n))
				.filter(n -> n % 2 == 0)
				.map(n -> n * 2)
				.forEach(System.out::println);
		
		
		var names = List.of("Aung", "Kyaw", "Cherry", "Snow", "Sai");
		names.stream()
		.filter(name -> name.length() > 3)
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		numbers.stream().sorted().skip(2).limit(2).forEach(System.out::println);
	}
}
