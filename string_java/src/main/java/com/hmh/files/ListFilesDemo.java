package com.hmh.files;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class ListFilesDemo {
	public static void main(String[] args) {
		File dir = new File("C:/Users/USER/OneDrive/Desktop/FileLists");
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("Directory not found : " + dir.getAbsolutePath());
			return; 
		}
		
		testList(dir);
		testListWithFilter(dir);
		testListFilesWithFileNameFilter(dir);
		testListFiles(dir);
		testListFilesWithFilter(dir);
	}

	private static void testListFilesWithFilter(File dir) {
		
		System.out.println("=== ListFilesWithFilter ===");
		
		File[] files = dir.listFiles();
		
		if(files != null) {
			for(File file : files) {
				System.out.println(file.getName());
			}
		}
	}

	private static void testListFiles(File dir) {
		System.out.println("=== List Files ===");
		File[] files = dir.listFiles();
		if (files != null) {
			for (File f : files) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "[DIRECTORY]" : "[FILES]");

			}
		}
		
		
	}

	private static void testListFilesWithFileNameFilter(File dir) {
		System.out.println("List files with file name filter");
		File[] files = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("txt");
			}
		});
		
		if(files != null) {
			for(var file : files) {
				System.out.println(file.getName());
			}
		}
		
	}

	private static void testListWithFilter(File dir) {
		File[] files = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
			
				return pathname.isDirectory();
			}
		});
		
		if(files != null) {
			for(File file : files) {
				System.out.println("=======File List with filter =======");
				System.out.println(file.getName());
			}
		}
		
	}

	private static void testList(File dir) {
		System.out.println("List");
		String[] files = dir.list();
		
		if(files != null)
		{
			for(var name : files) {
				System.out.println(name);
			}
		}
		
		
	}
}
