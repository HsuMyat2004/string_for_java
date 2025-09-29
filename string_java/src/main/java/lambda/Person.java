package lambda;

public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void introduce() {
		System.out.println("Hi, I'm " + name + " and " + age + " years old.");
	}

	void introduceMessage(String msg) {
		System.out.println("msg: " + msg);
	}

	static int compareByName(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);

	}
}

