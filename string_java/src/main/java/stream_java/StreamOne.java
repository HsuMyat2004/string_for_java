package stream_java;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOne {
	public static void main(String[] args) {
		var stream = Stream.builder()
				.add("Kotlin")
				.add("Flutter")
				.add("Go")
				.add("Scala") //builder object
				.build();
		var list = stream.toList();
		list.forEach(System.out::println);
		System.out.println(list);
		
		var stream2 = Stream.of("Vue","Angular","NodeJS","React", "NextJS")
		.sorted();
		stream2.forEach(System.out::println);
		
		var stream3 = Stream.generate(Math :: random).limit(3);
		stream3.forEach(System.out::println);
		
		var stream4 = Stream.iterate(0, n -> n + 3).limit(5);
		stream4.forEach(System.out::println);
		System.out.println("=====");
		IntStream.range(1, 5).forEach(value -> System.out.println(value + " "));
		System.out.println("=====");
		IntStream.rangeClosed(1, 5).forEach(value -> System.out.println(value + " "));
		
//		try(var stream5 = Files.lines(Path.of("poem.txt"))){
//			stream5.forEach(System.out::println);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("=============");
	
		List<String> list1 = List.of("Java", "Spring", "React");
		Stream<String> stream6 = list1.stream();
		
		var str = stream6.filter(s -> s.startsWith("J")).count();
		System.out.println(str);
	
		System.out.println("========");
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		var stream7 = Arrays.stream(arr).sum();
		System.out.println(stream7);
	}
}
