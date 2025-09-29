package com.hmh.files;

import java.io.File;
import java.io.IOException;

public class MethodForFileClassDemo {
	public static void main(String[] args) throws IOException {
		var file = new File("method.txt");
		file.createNewFile();
		
		var file1 = new File("method_update.txt");
		if(file.exists()) {
			file.renameTo(file1);
			System.out.println("File name changed successfully");
		}
		check_state();
	}
	
	static void check_state() throws IOException {
		File file = new File("C:/Users/USER/OneDrive/Desktop/checkState");
		file.mkdir();
		
		System.out.println("Folder 1 created successfully!");
		
		File file1 = new File(file,"state_folder");
		file1.mkdirs();
		
		System.out.println("Child folder is created!");
		
		File file2 = new File(file1, "test.txt");
		file2.createNewFile();
		
		System.out.println("test text file!!!");
	}
}
