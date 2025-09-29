package com.hmh.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PracticesFilesANDString {
	public static void main(String[] args) throws IOException {
		int num = Integer.valueOf("123");// string to integer
		System.out.println(num);
		
		int num2 = 124;
		String str = String.valueOf(num2); // integer to string 
		System.out.println(str);
		
		Integer num3 = 125;
		String str2 = num3.toString(); // Integer to string
		System.out.println(str2);
		
		int num4 = 126;
		String str3 = Integer.valueOf(num4).toString(); // int to string
		System.out.println(str3);
		
		System.out.println("=========== String ended ============");
		
		System.out.println("============== File Operations ===============");
		
		Path file = Path.of("test3.txt");
		
		if(!Files.exists(file)) {
			System.out.println("No such file exists!");
		}
		
		Files.writeString(file,"Hello Java Developer \n How are you?");
		System.out.println("Successfully write the file");
		
		List<String> list = Files.readAllLines(file);
		list.forEach(System.out::println);
		
		System.out.println("Reading file successfully!");
	
		var str4 = Files.readString(file);
		System.out.println("Read read string : " + str4);
		
		Path copy = Path.of("test5.txt");
		Files.copy(file, copy, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println(copy);
		
		Files.delete(copy);
	}
}
