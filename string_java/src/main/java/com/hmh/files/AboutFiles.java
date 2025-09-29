package com.hmh.files;

import java.io.File;
import java.io.IOException;

public class AboutFiles {
	public static void main(String[] args) throws IOException {
		File file = new File("file_test.txt");
		file.createNewFile();
		
		relative_path();
		absolute_path();
	}
	
	private static void absolute_path() throws IOException {
		File file = new File("C:/Users/USER/OneDrive/Desktop/test1");
		file.createNewFile();
		
		
		var parent = "C:/Users/USER/OneDrive/Desktop";
		File file1 = new File(parent, "test1.txt");
		file1.createNewFile();
	}

	static void relative_path() throws IOException {
		File file = new File("./test.txt");
		file.createNewFile();
	}
}
