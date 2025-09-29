package lambda;

public class ReferenceData {
	public ReferenceData() {
		System.out.println("No argument Constructor.");
	}
	
	public ReferenceData(String message) {
		System.out.println("One argument Constructor : " + message);
	}
	
	static void showStaticMessage(String msg) {
		System.out.println("Static Method : " + msg);
	}
	
	void showInstanceMessage(String msg) {
		System.out.println("Instance method : " + msg);
	}
}
