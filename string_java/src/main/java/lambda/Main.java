package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Printer p1 = Main :: saySomething;
		System.out.println("Hello from static method.");
		
		Person alice = new Person("Alice" ,20);
		Printer p = alice :: introduceMessage;
		p.print("Hi, I am Alice");
		
		List<Person> people = Arrays.asList(
				new Person("John",41),
				new Person("God Father", 50),
				new Person("Eithan", 50)
			);
		
		Collections.sort(people, Person :: compareByName);
		for(Person person : people) {
			person.introduce();
		}
	}

	static void saySomething(String msg) {
		System.out.println(msg);
	}
}
