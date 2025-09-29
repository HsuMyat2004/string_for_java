package lambda;

public class ReferenceMain {
	public static void main(String[] args) {
		UserInter u = a -> System.out.println(a);
		u.use("Hello World");
		
		ReferenceData data = new ReferenceData();
		String message = "Hello Java Developer";
		
		UserInter u1 = ReferenceData :: showStaticMessage;
		u1.use(message);
		
		UserInter u2 = data :: showInstanceMessage;
		u2.use(message);
		
		UserInter u3 = ReferenceData :: new;
		u3.use(message);
		
		
	}
}
