package lambda;

public class TestThree {
	public static void main(String[] args) {
		MyInterface my1 = () -> "Hello World";
		System.out.println(my1.greet());
		
		MyInterface1 my2 = name -> System.out.println(name);
		my2.doSome("Hello World");
		
		MyInterface2 my3 = (a,b) -> "The result is :" + a + b;
		System.out.println(my3.doJob(1, 4));
	}
}

@FunctionalInterface 
interface MyInterface {
	String greet();
}

@FunctionalInterface
interface MyInterface1{
	void doSome(String name);
}

@FunctionalInterface
interface MyInterface2{
	String doJob(int a, int b);
}
