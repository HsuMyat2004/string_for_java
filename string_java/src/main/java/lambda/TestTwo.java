package lambda;

public class TestTwo {
	public static void main(String[] args) {
		
		System.out.println("====== Before Lambda ======");
		Greeting g = new Greeting() {

			@Override
			public void sayHello(String name) {
				System.out.println(name);

			}

		};
		g.sayHello("Hello world");

		Calculate c = new Calculate() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}

		};
		int sum = c.add(2, 3);
		System.out.println("The calculation result is : " + sum);
		
		System.out.println("====== After Lambda ======");
		
		Greeting g1 = a -> System.out.println(a);
		
		g1.sayHello("Hello Java Developer");
		
		Calculate c1 = (a,b) -> a + b;
		System.out.println(c1.add(1,9));
	}
	
	
}


@FunctionalInterface
interface Greeting {
	void sayHello(String name);
}

@FunctionalInterface
interface Calculate {
	int add(int a, int b);
}