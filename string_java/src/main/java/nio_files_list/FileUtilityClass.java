package nio_files_list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileUtilityClass {
	public static void main(String[] args) throws IOException {
		Path file = Path.of("nio_test.txt");
		
		if(!Files.exists(file)) {
			Files.createFile(file);
			System.out.println("File is created!");
		}
		
		Files.writeString(file,"Hello Java Developer \n Hello Program");
		
		System.out.println("File Write Successfully!");
		
		List<String> list = Files.readAllLines(file);
		
		list.forEach(System.out::println);
		
		System.out.println("File read successfully");
		
		var str = Files.readString(file);
		System.out.println("File content : " + str);
		
		Path copy = Path.of("nio_update.txt");
		Files.copy(file, copy , StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copy successfully");
		
		Files.delete(copy);
		System.out.println("Deleted the copy file");
	}
}
