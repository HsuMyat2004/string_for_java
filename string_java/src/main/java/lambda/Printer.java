package lambda;


@FunctionalInterface
public interface Printer {
	 void print(String msg);
}

@FunctionalInterface
interface PersonCreator{
	Person create(String name, int age);
}
